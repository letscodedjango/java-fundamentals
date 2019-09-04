//Constructor in Java is one of the most important topic which we almost use in each and every java program
// Constructor is basically used to intialize the instance variables / static variables

// There are three types of Constructor - default / parameterized / user-defined
//A default constructor is created automatically by the Java compiler for any class you create whenever you do not write your own constructor.

// Numeric fields are set to 0 (zero).
// Character fields are set to Unicode ‘\u0000’.
// Boolean fields are set to false.
// Fields that are object references (for example, String fields) are set to null (or empty).

public class ConstructorClass {

int quantity;
String product;
double price;
static String location;
static int shopNumber;


ConstructorClass(){     // user-defined constructor -- similar to default constructor

}

ConstructorClass(int x){      // parameterized constructor
        quantity = x;
        System.out.println("This is constructor with one parameter x and intialize quantity");
}

ConstructorClass(int x, String product){      // parameterized constructor
        quantity = x;
        this.product = product;
        System.out.println("This is constructor with one parameter x & product and intialize quantity and productname");
}


ConstructorClass(int quantity, String product, double price){      // parameterized constructor
        this.quantity = quantity;
        this.product = product;
        this.price = price;
        System.out.println("This is constructor with one parameter x & product and intialize quantity, product and price");
}

// This constructor will execute before each and every constructor
{
        location = "NY";
        shopNumber = 1324;
        System.out.println("The shop number " + shopNumber+ " is located at " + location);
}


}
