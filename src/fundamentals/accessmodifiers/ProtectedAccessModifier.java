package fundamentals.accessmodifiers;

// Access modifier in java plays a vital role in terms of scoping of classes , its properties and its behaviours
// Actually there are 4 types of access-modifier - public , private, default and protected
// When the access modifier is not defined then it will considered as default access modifier
// Default access modifier can be acess within class and outside class but within the same package

public class ProtectedAccessModifier { // here we have class with protected access modifier

protected int myProtectedInt;
protected double myProtectedDouble;   // variable with protected access modifier

protected void protectedMethodOne(){    // here we have method with protected access modifier
  System.out.println("This is a method with default access modifier");
}

protected void accessProtectedVariable(String accessmodifier){

System.out.println(myProtectedInt);
System.out.println(myProtectedDouble);

}

}