package fundamentals.constructor;

import fundamentals.constructor.ConstructorClass;


public class ClassRunner {

public static void main(String args[]){
        ConstructorClass ccone = new ConstructorClass();
        ConstructorClass cctwo = new ConstructorClass(12);
        ConstructorClass ccthree = new ConstructorClass(12, "imacs");
        ConstructorClass ccfour = new ConstructorClass(12, "imacs", 189181829.82);
}
}
