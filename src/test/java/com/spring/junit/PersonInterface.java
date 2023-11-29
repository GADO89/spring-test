package com.spring.junit;

import org.junit.jupiter.api.*;

@Tag("person")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface PersonInterface {


    default   @BeforeEach
    void setUp() {
        System.out.println(" @BeforeEach....................");
    }

    default   @BeforeAll
    void BeforeAll() {
        System.out.println(" @BeforeAll....................");
    }


    @Test
    default void myTest() {
        System.out.println("myTest....................");
    }
}
