package ch.ffhs.dua.permutations;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

public class PermTest 
{
	
	
	@Test 
	public void testPerm0()
	{
		int[][] result = Permutations.permutations(0);
		assertSame("Test for empty permutations", 0, result.length);
	}
	
	@Test 
	public void testPerm1()
	{
		testPerm(1);
	}
	
	@Test 
	public void testPerm4()
	{
		testPerm(4);
	}
	
	private void testPerm(int n)
	{
		int[][] result = Permutations.permutations(n);
		assertSame(fak(n), result.length);
		HashSet<List<Integer>> perms = new HashSet<>();
		
		for (int[] perm : result)
		{
			assertSame("Wrong length of a permutation", n, perm.length);
			assertSame("Permutation has duplicates", n, 
					(int) IntStream.of(perm).distinct().count());
			IntStream.of(perm).forEach(x -> 
					assertTrue("Wrong permutation element", x >= 0 && x < n));
  			List<Integer> permList = toList(perm);
			assertFalse("Permutation + " + Arrays.toString(perm)+ " is generated twice", 
  					perms.contains(permList));
			perms.add(permList);
		}
	}
	
	private static List<Integer> toList(int[] array)
	{
		return IntStream.of(array).boxed().collect(Collectors.toList());
	}
	
	private static int fak(int n)
	{
		return IntStream.range(1, n+1).reduce(1, (x,y) -> x*y);
	}
	

}
