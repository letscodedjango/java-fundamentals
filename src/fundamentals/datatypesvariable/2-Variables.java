package fundamentals.datatypesvariable;

// Here we gonna discuss different types of variables a java language have

// So broadly there are 3 types of variables in java
// --- Instance variable
// --- Static Vraibles
// --- Local Variables

class Variables {

int x = 29;      // instance variable
static int y = 50;    // static varibale
boolean b;   // instance variables


void accessVariables() {
        System.out.println(x);
        System.out.println(y);
        b = false;
        System.out.println(b);

        int local = 440; // this is local variable
        System.out.println(local);
}

public static void main(String args[]){
        Variables v = new Variables();
        v.accessVariables();
}

}
