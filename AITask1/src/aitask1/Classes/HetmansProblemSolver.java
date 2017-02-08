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
    
    private static int[] currentResult;
    private static boolean resultFind;
    private static String finalResult;
    
    public static final boolean validPermutation(String permutation) {
        
        boolean isVaild = true;    
        int permutationLenght = permutation.length();
        for (int i = 0; (i == permutationLenght - 1 || !isVaild) == false; i++ ) {
                
            for (int j = 1; (i + j == permutationLenght || !isVaild) == false; j++) {             
                      
                if(Character.getNumericValue(permutation.charAt(i)) == Character.getNumericValue(permutation.charAt(i + j)) + j || Character.getNumericValue(permutation.charAt(i)) == Character.getNumericValue(permutation.charAt(i + j)) - j) {
                    isVaild = false;
                }
            }
        }            
        return isVaild;
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
    
    public static boolean validPosition(int x, int y) {
        for (int i = 0; i < x; i++) {//result[i] == y => columns are same, |i - x| == |result[i] - y| => in diagonals.         
            
            if ((currentResult[i] == y) || (Math.abs(i - x) == Math.abs(currentResult[i] - y))) {
                return false;
            }
        }
        return true;
    }
    
    public static final void findSolution(int current, int objective) {
           
        for (int i = 0; i < objective && !resultFind; i++) {

            //sprawcz czy hetman jest na x-wierszu i i-kolumnie
            if (validPosition(current, i)) {
                
                currentResult[current] = i; // miejsce hetmana
                if (current == objective - 1) {
                    
                    resultFind = true;                                
                    for(int j = 0; j < currentResult.length; j++) {
                        
                        finalResult += currentResult[j] + 1;
                    }
                }
                findSolution(current + 1, objective);
            }

        }
 
    }
    
    public static final String BacktracePermutation(int current, int objective) {
        
        currentResult = new int[objective];
        resultFind = false;
        finalResult = "";
        
        findSolution(current, objective);
        
        return finalResult;
          
    }
}
