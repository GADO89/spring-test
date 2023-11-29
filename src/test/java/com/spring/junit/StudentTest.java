package com.spring.junit;

import org.assertj.core.api.Assertions;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;


@Tag("student")
class StudentTest {


    @Test
    @DisplayName("Hi Function")
    @RepeatedTest(value = 5, name = "{displayName} :")
    void myTest(){
        System.out.println("Hi");}

    //@Test
    @DisplayName("funRepeated Function")
    @RepeatedTest(3)
    void funRepeated(TestInfo testInfo, RepetitionInfo repetitionInfo){


        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
        System.out.println(testInfo.getTags());
        System.out.println(repetitionInfo.getCurrentRepetition());
    }

    }

   /*


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





    @Test
    @DisplayName("Test Student  By Id")
    void findById() {
        Student student=new Student();
        //Assertions.assertEquals(student.findById(1),null);
        Assertions.assertThrows(MissingFormatArgumentException.class,
                ()->student.getException());
    }*/
