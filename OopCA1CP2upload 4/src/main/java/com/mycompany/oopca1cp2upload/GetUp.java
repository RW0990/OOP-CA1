/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopca1cp2upload;

/**
 *
 * @author ryanwhite
 */
public class GetUp extends SleepBuilder{
    
     @Override
    public String buildFeedback(SleepInput input, double avgSleep){
        if(input.getUp()){
            return "Getting up in the night can have negative affects on your sleep pattern";
        }
        return "";
    }
}
