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
public class countProcess implements run {
    
 
    
   FileInputStream file = null; 
    int numberWord = 0;
    int numberLine = 0;
    int character = 0;

    /**
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    
    public void wordCount()  {
    
        try {
            
            File readFile;
            readFile = new File("C:\\Users\\Saufi\\239955-STIW3054-A172-A1.wiki\\Home.md");
            try {
                file = new FileInputStream(readFile);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(countProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
            InputStreamReader input = new InputStreamReader(file);
            BufferedReader reader = new BufferedReader(input);
           
            String line;
            
        
            while ((line = reader.readLine()) != null) {
                numberLine++;
                if (!(line.equals(""))) {
                    String[] wordList = line.split("\\s+");
                    numberWord += wordList.length;
                    character += line.length();
                }
            }
            
            Writer writer = null;
            File file = new File("C:\\Users\\Saufi\\239955-STIW3054-A172-A2.wiki\\Result.md");
        
            writer = new BufferedWriter(new FileWriter(file));
            
        
            
            System.out.println("Total word count = " + numberWord);
        
            writer.write("Total word count = " + numberWord + "\n");
        
            System.out.println("Total number of characters = " + character);
        
            writer.write("Total number of characters = " + character + "\n");
        
            System.out.println("Total number of lines = " + numberLine);
        
            writer.write("Total number of lines = " + numberLine + "\n");
            
            System.out.println();
        } catch (IOException ex) {
            Logger.getLogger(countProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
   public int getWord() {
       return this.numberWord;
   }
    public int getLine() {
       return this.numberLine;
   }
     public int getCharacter() {
       return this.character;
   }
    
}
