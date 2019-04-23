package com.Khaimura;

import com.Khaimura.Exception.MyExeption;

import java.util.Arrays;

public class Group {

    private Student[] st = new Student[10];

    public void addStudent(Student student) throws MyExeption {

        if (student == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < st.length; i++) {
            if (st[i] == null) {
                st[i] = student;
                return;
            }
        }
        throw new MyExeption();
    }

    public boolean deleteStudent(int cardNumber) {

        for (int i = 0; i < st.length; i++) {
            if (st[i] != null && st[i].getStudentRecordOfCredits() == cardNumber) {
                st[i] = null;
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Group{" +
                "st=" + Arrays.toString(st) +
                '}';
    }
}

