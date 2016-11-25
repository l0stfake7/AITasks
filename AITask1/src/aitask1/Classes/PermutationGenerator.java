/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aitask1.Classes;

import java.util.ArrayList;

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

    public static String nextPermutation(String array) {
        int i = array.length() - 1;
        while(i > 0 && Character.getNumericValue(array.charAt(i - 1)) >= Character.getNumericValue(array.charAt(i))) {
            i--;
        }
        
        if(i <= 0) {
            return null;
        }
        
        int j = array.length() - 1;
        
        while(Character.getNumericValue(array.charAt(j)) <= Character.getNumericValue(array.charAt(i - 1))) {
            j--;
        }
        
        char temp = array.charAt(i - 1);
        array.replace(array.charAt(i - 1), array.charAt(j));       
        array.replace(array.charAt(j), temp);
        
        j = array.length() - 1;
        
        while (i < j) {
            temp = array.charAt(i);
            array.replace(array.charAt(i), array.charAt(j));
            array.replace(array.charAt(j), temp);
            i++;
            j--;
        }
        return null;
    }
    
    public static final ArrayList<String> GeneratePermutationLexicographically(int n) {
        ArrayList<String> result = new ArrayList<>();

        /*
        * example, for n = 3:
         123       
         132
         213
         231
         312
         321
        */
        //generate begin permutation, for n=5: 012345
        String beginPermutation = "";
        for(int i = 1; i <= n; i++) {
            beginPermutation += i;            
        }
        
        String lastPermutation = beginPermutation;
        String nextPermutation;
        for( ; ;) {        
            
            if(nextPermutation(lastPermutation) == null) {
                break;
            }                
            else {
                nextPermutation = nextPermutation(lastPermutation);
                result.add(lastPermutation);
                lastPermutation = nextPermutation;
            }
            
            //result.add(lastPermutation);
        }
        
        return result;        
    }
    
}
