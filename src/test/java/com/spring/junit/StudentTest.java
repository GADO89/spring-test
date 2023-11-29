package com.spring.junit;

import org.assertj.core.api.Assertions;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



@Tag("student")
class StudentTest {

    @BeforeEach
    void setUp() {
        System.out.println("Out");
    }

    @Test
    void newTest(){
        Student student=new Student();

        //Assertions.assertThat(student.getName()).isEqualTo("Eslam");
        //Assertions.assertTrue("Esslam".equalsIgnoreCase("ESSLAM"));
        MatcherAssert.assertThat(student.getName(), Matchers.is("Eslam"));
    }

    @Nested
    class NestedStudent {
        @BeforeEach
        void setUp() {
            System.out.println("In");
        }

        @Test
        void nestedStudent() {
            Student student=new Student();


            Assertions.assertThat(student.getName()).isEqualTo("Eslam");

        }

    }

    }

   /* @Test
    @DisplayName("Test Student  By Id")
    void findById() {
        Student student=new Student();
        //Assertions.assertEquals(student.findById(1),null);
        Assertions.assertThrows(MissingFormatArgumentException.class,
                ()->student.getException());
    }*/
