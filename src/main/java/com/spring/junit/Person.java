package com.spring.junit;

public class Person {

    private String fName="Eslam";
    private String lName="Khder";
    private String phone1="01125589989";
    public String phone2="011111111111";

    public Person() {
    }

    public String getFName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String geTlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }
}
