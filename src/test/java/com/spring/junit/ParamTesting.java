package com.spring.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTesting {

    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} ===> {arguments}")
            @EnumSource(Gender.class)
  //  @ValueSource(strings={"Eslam","Ahmed","Karim","Jo"})
    void myParamTesting(Gender value){

        System.out.println(value);
    }

    /******
     public class ParamTesting {
    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} ===> {arguments}")
    @ValueSource(strings = {"Eslam","Ahmed","Karim","Jo"})
    void myParamTesting1(String value){
    System.out.println(value);
    }

     ****/





}
