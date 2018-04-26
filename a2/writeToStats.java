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
public class writeToStats implements execute {
    
    countProcess count = new countProcess();
    
    int word = count.getWord();
    int line = count.getLine();
    int character = count.getCharacter();
    
      public void runStats() {
          
           Writer writer = null;
            File file = new File("C:\\Users\\Saufi\\239955-STIW3054-A172-A2.wiki\\Home.md");
        try {
            writer = new BufferedWriter(new FileWriter(file));
        } catch (IOException ex) {
            Logger.getLogger(writeToStats.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("Total word count = " + word);
        try {
            writer.write("Total word count = " + word + "\n");
        } catch (IOException ex) {
            Logger.getLogger(writeToStats.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("Total number of characters = " + character);
        try {
            writer.write("Total number of characters = " + character + "\n");
        } catch (IOException ex) {
            Logger.getLogger(writeToStats.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("Total number of lines = " + line);
        try {
            writer.write("Total number of lines = " + line + "\n");
        } catch (IOException ex) {
            Logger.getLogger(writeToStats.class.getName()).log(Level.SEVERE, null, ex);
        }
System.out.println();
      }

    

   
    
}
