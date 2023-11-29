package com.spring.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

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


    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} ===> {arguments}")
   @CsvFileSource(resources = "/mydata.csv", numLinesToSkip = 1)
    void myParamTesting3(String name, int age, String phone){

        System.out.println("name "+ name);
        System.out.println("age "+ age);
        System.out.println("phone "+ phone);

    }

    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} ===> {arguments}")
    @MethodSource("getData")
    void myParamTesting4(String name, int age, String phone){

        System.out.println("name "+ name);
        System.out.println("age "+ age);
        System.out.println("phone "+ phone);

    }


static Stream<Arguments>  getData(){
        return Stream.of(
                Arguments.of("Ahmed" ,21,"1234,"),
                Arguments.of("Karim" ,19,"012245,"),
                Arguments.of("Jo"     ,12,"01223,")
        );
}


}
