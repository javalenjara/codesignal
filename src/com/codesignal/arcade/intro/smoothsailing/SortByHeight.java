package com.codesignal.arcade.intro.smoothsailing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SortByHeight {

	public static void main(String[] args) {
		int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
		int[] b = sortByHeight(a);
		Arrays.stream(b).forEach(System.out::println);
	}
	
	private static int[] sortByHeight(int[] a) {
	    
	    ArrayList<Integer> people = (ArrayList<Integer>)Arrays.stream(a).boxed().filter(x -> x != -1).collect(Collectors.toList());
	    Collections.sort(people);
	    int [] toReturn = new int[a.length];
	    int k = 0;
	    for(int i = 0; i < a.length; i++) {
	    	if(a[i] != -1) {
	    		toReturn[i] = people.get(k).intValue();
	    		k++;
	    	}
	    	else toReturn[i] = a[i];
	    }
	    return toReturn;
	}
}
