/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopca1cp2upload;

/**
 *
 * @author ryanwhite
 */
public class SleepReading extends SleepBuilder{
    
    @Override
    public String buildFeedback(SleepInput input, double avgSleep){
        String book = input.getBook();
        if(book==null || book.trim().isEmpty()){
            return "";
        }
        return "The book your currently reading is "+book+" reading before helps relax the mind.";
    }
}
