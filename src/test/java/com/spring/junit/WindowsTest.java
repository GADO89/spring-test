package com.spring.junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

@Tag("windowsTest")
public class WindowsTest {

    @Test
    @EnabledOnOs(OS.MAC)
    void mac(){
        System.out.println("MAC...............");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void windows(){
        System.out.println("WINDOWS...............");

    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void linux(){
        System.out.println("LINUX...............");

    }

    @Test
    @EnabledOnJre(JRE.JAVA_22)
    void version8(){
        System.out.println("Java8...............");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_18)
    void version18(){
        System.out.println("Java18...............");
    }
    @Test
    @EnabledOnJre(JRE.JAVA_21)
    void version15(){
        System.out.println("Java15...............");
    }


    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "User")
    void userName1(){
        System.out.println("Java18...............");
    }
    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "Mahmoud Gado")
    void userName2(){
        System.out.println("Java15...............");
    }
}
