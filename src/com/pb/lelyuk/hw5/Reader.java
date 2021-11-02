package com.pb.lelyuk.hw5;

import java.util.Arrays;
import java.util.Calendar;

public class Reader {
    private String readerName;
    private String libCardNum;
    private String faculty;
    private String dateOfBirth;
    private String phoneNum;

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName (String readerName) {
        this.readerName = readerName;
    }

    public String getLibCardNum() {
        return libCardNum;
    }

    public void setLibCardNum(String libCardNum) {
        this.libCardNum = libCardNum;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }


    public String getInfoReader() {
        return "[ПІБ: " + readerName + ", дата народження:" + dateOfBirth + ", читацький квиток: " + libCardNum
                + ", факультет: " + faculty + ", телефон:" + phoneNum + "]";
    }

    public void takeBook(int quantityBooks) {
        System.out.println(readerName + " взял:" + quantityBooks + "книг");
    }

    public void takeBook(String[] titles) {
        System.out.println(readerName + " взял:" + Arrays.toString(titles));
    }



}
