package fundamentals.constructor;
import fundamentals.constructor.ConstructorClass;
public class ClassRunner {

public static void main(String args[]){
        ConstructorClass ccone = new ConstructorClass();
        System.out.println(ccone);
        ConstructorClass cctwo = new ConstructorClass(12);
        System.out.println(cctwo);
        ConstructorClass ccthree = new ConstructorClass(12, "imacs");
        System.out.println(ccthree);
        ConstructorClass ccfour = new ConstructorClass(12, "imacs", 189181829.82);
        System.out.println(ccfour);
}
}
