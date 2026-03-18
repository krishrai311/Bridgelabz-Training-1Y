package Abstraction;

import java.sql.SQLOutput;

abstract class parent {
    public parent() {
        System.out.println("Mai base 2 ka constructor hu");
    }

    public void sayhello() {
        System.out.println("hello");
    }

    abstract public void greet();
}
class Child2 extends parent {
    @Override
    public void greet() {
        System.out.println("Good morning");
    }
}

class Child3 extends parent{
    @Override
    public void th() {
        System.out.println("I m good");
    }
}

        }





