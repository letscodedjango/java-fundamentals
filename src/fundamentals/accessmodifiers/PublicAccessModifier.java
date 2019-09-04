package fundamentals.accessmodifiers;

// Access modifier in java plays a vital role in terms of scoping of classes , its properties and its behaviours
// Actually there are 4 types of access-modifier - public , private, default and protected
// When the access modifier is not defined then it will considered as default access modifier
// Default access modifier can be acess within class and outside class but within the same package

public class PublicAccessModifier { // here we have class with public access modifier

public int myPublicInt;
public double myPublicDouble;   // variable with default access modifier

public void publicMethodOne(){    // here we have method with default access modifier
  System.out.println("This is a method with default access modifier");
}

public void accessPublicVariable(String accessmodifier){

System.out.println(myPublicInt);
System.out.println(myPublicDouble);

}

}
