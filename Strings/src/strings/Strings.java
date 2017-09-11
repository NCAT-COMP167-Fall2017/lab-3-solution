/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CCannon
 */
public class Strings {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberOfRecords = 0;
        String[] records = new String[100];
            
        try {
            Scanner reader = new Scanner(new File(args[0]));
            
            while(reader.hasNext()){
                String[] input = reader.nextLine().split(",");
                
                String firstName = input[0];
                String lastName = input[1];
                String gender = input[2];
                int age = Integer.parseInt(input[3]);
                String phoneNumber = input[4];
                String emailAddress = input[5];
                
                records[numberOfRecords] = String.format("%-20s%-20s%-10s%-10d%-20s%-20s", firstName, lastName, gender, age, phoneNumber, emailAddress);
                
                numberOfRecords++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Strings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
