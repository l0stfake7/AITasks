/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aitask1.Classes;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Bartek
 */
public class PermutationGenerator {
    
    public static final int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static final ArrayList<String> GeneratePermutationRecursive(String Permutation) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> aux = new ArrayList<>();
        
        if(Permutation.length() == 1) {
            result.add(Permutation);
        }
        else {
            aux = GeneratePermutationRecursive(Permutation.replace(Permutation.substring(0, 1), ""));
            for(String number: aux) {
                for(int i = 0; i <= number.length(); i++) {
                    result.add(new StringBuilder(number).insert(i, Permutation.charAt(0)).toString());
                }
            }
        }
        return result;
    }   

    public static boolean nextPermutation(int[] array) {
	// Find non-increasing suffix
	int i = array.length - 1;
	while (i > 0 && array[i - 1] >= array[i])
            i--;
	if (i <= 0)
            return false;
		
	// Find successor to pivot
	int j = array.length - 1;
	while (array[j] <= array[i - 1])
            j--;
        
	int temp = array[i - 1];
	array[i - 1] = array[j];
	array[j] = temp;
		
	// Reverse suffix
	j = array.length - 1;
	
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
	}
	return true;
    }
	
    
    public static final ArrayList<String> GeneratePermutationLexicographically(int n) {
        
        ArrayList<String> result = new ArrayList<>();
        int[] array = {0, 1, 2};
        
        do {  // Must start at lowest permutation
            result.add(Arrays.toString(array));
        } while (nextPermutation(array));      
        
        return result;
    }    
}