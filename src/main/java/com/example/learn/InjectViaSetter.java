/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.learn;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author aglis
 */
public class InjectViaSetter{
    private HalloSpringService halloSpringService;
   
    @Autowired
    public void setHalloSpringService(HalloSpringService halloSpringService) {
        this.halloSpringService = halloSpringService;
    }
    
    public void getMessage() {
        halloSpringService.sayHello();
    }
    
}
