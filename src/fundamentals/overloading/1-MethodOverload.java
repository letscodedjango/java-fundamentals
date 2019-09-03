// Here we gonna discuss one of the important aspect of oops programming - Polymorphism (Overloading)
// Polymorphism -- Poly (Many) & Morphism(Forms)

//  Polymorphism is something ehich can have multiple forms

// For example, although the classes Automobile, Sailboat, and Airplane all inherit from Vehicle, turn and stop methods work differently for instances of those classes.
// The advantages of polymorphism will become more apparent when you begin to create GUI applications containing features such as windows, buttons, and menu bars. In a GUI application, it is convenient to remember one method name, such as setColor or setHeight and have it work correctly no matter what type of object you are modifying.


// METHOD OVERLOADING is the concept where we have different methods with same name within class but have different parameters or different datatypes of parameter or the sequence of the parameters

class PolymorphismConcept{

public void overloadMethod(){
  int x = 50;
  double y = 200;
  double result = x + y;
  System.out.println(result);
}

public void overloadMethod(int a){
  int x = a;
  double y = 200;
  double result = x + y;
  System.out.println(result);
}

public void overloadMethod(double b){
  int x = 50;
  double y = b;
  double result = x + y;
  System.out.println(result);
}

public void overloadMethod(int a, double b){
  int x = a;
  double y = b;
  double result = x + y;
  System.out.println(result);
}

public static void main(String args[]){
  PolymorphismConcept pc = new PolymorphismConcept();
  pc.overloadMethod();
  pc.overloadMethod(30);
  pc.overloadMethod(108.78);
  pc.overloadMethod(10, 108.78);

}

}
