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
public class HetmansProblemSolver {
    
    public static final boolean validPermutation(String permutation) {
        
        boolean conflictFlag = true;    
        
        for (int i = 0; ((((i == (permutation.length()) - 1)) || !conflictFlag) == false); i++ ) {
                
            for (int j = 1; ((((i + j) == permutation.length()) || !conflictFlag) == false); j++) {
                if(Character.getNumericValue(permutation.charAt(i)) == Character.getNumericValue(permutation.charAt(i + j)) + j || Character.getNumericValue(permutation.charAt(i)) == Character.getNumericValue(permutation.charAt(i + j)) - j) {
                    conflictFlag = false;
                }
            }
        }            
        return conflictFlag;
    }
        
    public static final ArrayList<String> validPermutations(ArrayList<String> permutations) {
        
        ArrayList<String> result = new ArrayList<>();       
        
        for (String permutation : permutations) {
            if(validPermutation(permutation)) {
                result.add(permutation);
            }            
        }        
        return result;
    }
    
    public static final String BacktracePermutation() {
        
        return new String("");
    }
}
