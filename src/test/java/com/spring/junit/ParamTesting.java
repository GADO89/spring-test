package com.spring.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTesting {

    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} ===> {arguments}")
    @EnumSource(Gender.class)
  //  @ValueSource(strings={"Eslam","Ahmed","Karim","Jo"})
    void myParamTesting1(Gender value){

        System.out.println(value);
    }


    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} ===> {arguments}")
    @CsvSource({
            "Ahmed, 21,`1234",
            "Karim, 19 ,012245",
            "Jo, 12, 0122333",
    })
    void myParamTesting2(String anme, int age, String phone){

        System.out.println("name"+anme);
        System.out.println("age"+age);
        System.out.println("phone"+phone);

    }





}
