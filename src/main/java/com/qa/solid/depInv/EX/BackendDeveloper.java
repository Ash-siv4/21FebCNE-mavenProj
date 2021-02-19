package com.qa.solid.depInv.EX;

public class BackendDeveloper implements Developer {
    @Override
    public void develop() {
        writeJava();
    }

    public void writeJava() {
        System.out.println("C# is just Microsoft Java anyway.");
    }

}
