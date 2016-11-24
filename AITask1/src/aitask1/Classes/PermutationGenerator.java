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
    
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static ArrayList<String> GeneratePermutationRecursive(String Permutation) {
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

    public static ArrayList<String> GeneratePermutationLexicographically(int n) {
        ArrayList<String> result = new ArrayList<>();

        /*
        * example, for n = 2:
        * 012       
        * 021       
        * 102       
        * 120       
        * 201       
        * 210
        */
        //generate begin permutation, for n=5: 012345
        String beginPermutation = "";
        for(int i = 0; i <= n; i++) {
            beginPermutation += i;            
        }
        
        String lastPermutation = beginPermutation;
        for(int i = 0; i < factorial(n); i++) {        
                     
            result.add(lastPermutation);
        }
        
        return null;        
    }
    
}
