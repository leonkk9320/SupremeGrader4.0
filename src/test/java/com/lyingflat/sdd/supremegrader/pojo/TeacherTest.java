package com.lyingflat.sdd.supremegrader.pojo;


import com.lyingflat.sdd.supremegrader.pojo.impl.TeacherImpl;
import org.junit.Test;

public class TeacherTest {

    @Test
    public void TestPrintInfo(){
        String name = "Lee";
        String email = "hlee5@rpp.edu";
        String department = "computer science";
        String ID = "336699";
        String s = "Ph.D";

        Person personT = new TeacherImpl();

        personT.printInfo(name, email, department, ID, s);
    }
}
