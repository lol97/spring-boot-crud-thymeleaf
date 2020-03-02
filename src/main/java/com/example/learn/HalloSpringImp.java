/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.learn;

/**
 *
 * @author aglis
 */
public class HalloSpringImp implements HalloSpringService{

    @Override
    public void sayHello() {
        System.out.println("Hallo kita belajar spring java");
    }
    
    public void sayWhy() {
        System.out.println("whyyyy");
    }
}
