// Here we gonna discuss about the scope of the different variables types


// Instance & static variables scoping

class VariablesScope {

// lets define instance Variable
int x = 200;
double d;

// lets define static variable
static int i = 78;
static double db = 567.90;


public void scopeInstanceVaribles(){

        System.out.println(x);
        x = 456; // re-initialization
        System.out.println(x); // after reinitializing
        d = 678.89; // initialization of d
        System.out.println(d); // acessing instance varible in instance method

        System.out.println(i); // accessing static variable in instance method


}


public static void scopeStaticVaribles(){
        //System.out.println(x);   // non-static method scopeStaticVaribles() cannot be referenced from a static context

        VariablesScope vs = new VariablesScope();
        System.out.println(vs.x); // accessing instance in static contect using object

        vs.x = 456; // re-initialization
        System.out.println(vs.x); // after reinitializing
        vs.d = 678.89; // initialization of d
        System.out.println(vs.d); // acessing instance varible in instance method

        System.out.println(i); // accessing static variable in instance method

}



public static void main(String args[]){
        scopeStaticVaribles();

// An object is a specific, concrete instance of a class. When you create an object, you instantiate it
        VariablesScope vs = new VariablesScope(); // creating object or instantiation of object
        vs.scopeInstanceVaribles();


}


}
