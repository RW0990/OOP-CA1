/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopca1cp2upload;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lapi
 */
public class MyFile {
     private String filePath;

    public MyFile(String filePath) {
        this.filePath = filePath;
       
    }

   
public void rewriteFile(String[] lines) {
    try (FileWriter writer = new FileWriter(filePath, false)) {
        for (String line : lines) {
            writer.write(line + System.lineSeparator());
        }
        System.out.println("File riscritto.");
    } catch (IOException e) {
        System.out.println("Errore: " + e.getMessage());
    }
}

    }

