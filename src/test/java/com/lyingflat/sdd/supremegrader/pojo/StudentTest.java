package com.lyingflat.sdd.supremegrader.pojo;


import com.lyingflat.sdd.supremegrader.pojo.impl.StudentImpl;
import org.junit.Test;

public class StudentTest {
    @Test
    public void TestPrintInfo(){
        String name = "Leon";
        String email = "zleon8@rpp.edu";
        String department = "school of science";
        String ID = "580189";
        String s = "electrical engineering";

        Person personT = new StudentImpl();

        personT.printInfo(name, email, department, ID, s);
    }
}
