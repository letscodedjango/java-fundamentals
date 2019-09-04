package fundamentals.accessmodifiers;

// Access modifier in java plays a vital role in terms of scoping of classes , its properties and its behaviours
// Actually there are 4 types of access-modifier - public , private, default and protected
// When the access modifier is not defined then it will considered as default access modifier
// Default access modifier can be acess within class and outside class but within the same package

public class PrivateAccessModifier{    // here we have class with public access modifier

private int myPrivateInt;
private double myPrivateDouble;   // variable with default access modifier

void privateMethodOne(){    // here we have method with default access modifier since its not a good practice or recommended to define method as private
  System.out.println("This is a method with default access modifier");
}

public void accessPrivateVariable(String accessmodifier){   // here we have method with public access modifier since its not a good practice or recommended to define method as private

System.out.println(myPrivateInt);
System.out.println(myPrivateDouble);

}

}
