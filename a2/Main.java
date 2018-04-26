/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stiw3054.a2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Saufi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Writer writer = null;
        run obj= new countProcess();
        execute exc = new writeToStats();
        obj.wordCount();
        
        
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long output = endTime - startTime;
        double result = (double) output/1000000000.0;
        System.out.printf("\nTime Execution = %.9f seconds",result );
    }
    
}
