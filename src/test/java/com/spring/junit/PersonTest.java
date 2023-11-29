package com.spring.junit;

import org.junit.jupiter.api.*;
//@Disabled

class PersonTest implements PersonInterface{

  /*  @BeforeEach
    void setUp() {
        System.out.println(" @BeforeEach....................");
    }*/

    @Test
    void simpleTest(){
        System.out.println("simpleTest.................");
    }


}





/*


    @Test
    void personTest1() {
        System.out.println("111111111111");
    }
    @Test
    void personTest(){
        System.out.println("2222222222222222");
        Person person=new Person();


        Assertions.assertAll("Student Data",
                ()-> Assertions.assertEquals(person.getFName(),"Eslam","F name not machtes"),
                ()-> Assertions.assertEquals(person.geTlName(), "Khder", "L name not machtes"),
                ()-> Assertions.assertEquals(person.getPhone1(), "01125589989", "Phone not machtes"),
                ()-> Assertions.assertEquals(person.getPhone2(), "011111111111", "Phone not machtes")
        );

        Assertions.assertAll("Person Data",
                ()->Assertions.assertAll("Person Names",
                        ()->Assertions.assertEquals(person.getFName(),"Eslam","F name not machtes"),
                        ()-> Assertions.assertEquals(person.geTlName(), "Khder", "L name not machtes")
                        ),
                ()->Assertions.assertAll("Person Phones ",
                        ()-> Assertions.assertEquals(person.getPhone1(), "01125589989", "Phone not machtes"),
                        ()-> Assertions.assertEquals(person.getPhone2(), "011111111111", "Phone not machtes")
                )
        );

}



@Test
      void testing(){
          Student student=new Student();

         Assertions.assertAll("Student Data",
                 ()-> Assertions.assertEquals(student.getName(), "eslam", "name not machtes"),
                 ()-> Assertions.assertEquals(student.getAge(), "21", "age not machtes"));
      }

    private    Student student;

    @BeforeEach
    void setUpFunction() {
        student=new Student();

    }

    @Test
    void getName() {
        // Assertions.assertEquals(student.getName(),"eslam", "Name not Matches");
        Assertions.assertTrue("eslam".equals(student.getName()),()->"Name not Matches");
    }

    @Test
    void getAge() {
        //Assertions.assertEquals(student.getAge(),"22", "Age not Matches");
        Assertions.assertTrue("22".equals(student.getAge()),()->"Age not Matches");

    */

