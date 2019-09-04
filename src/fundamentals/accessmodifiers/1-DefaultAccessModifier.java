package fundamentals.accessmodifiers;

// Access modifier in java plays a vital role in terms of scoping of classes , its properties and its behaviours
// Actually there are 4 types of access-modifier - public , private, default and protected
// When the access modifier is not defined then it will considered as default access modifier
// Default access modifier can be acess within class and outside class but within the same package

class DefaultAcessModifier{    // here we have class with default access modifier

int myDefaultInt;
double myDefaultDouble;   // variable with default access modifier

void methodOne(){    // here we have method with default access modifier
  System.out.println("This is a method with default access modifier");
}

void accessVariable(String accessmodifier){

System.out.println(myDefaultInt);
System.out.println(myDefaultDouble);

}

}
