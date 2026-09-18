/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject81;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author shake
 */
public class Mavenproject81Test {
    
    public Mavenproject81Test() {
    }
@Test
public void testcheckPasswordComplexity() {
    Mavenproject81 obj = new Mavenproject81();

    assertTrue(obj.checkPasswordComplexity("Ch@@sec@ke99!"));
    assertFalse(obj.checkPasswordComplexity("password"));
}
}

