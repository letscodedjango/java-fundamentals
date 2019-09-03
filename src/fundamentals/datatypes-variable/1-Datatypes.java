// there are 8 different primitive datatyepes in Java which are actaully coming from c++
// broadly classified as Primitive And Non-Primitive(object reference)

// Primitive again classified as - Numeric And Non-Numeric

// Numeric again classified as - Integer, Floating-point numbers
// Integer again classified as - byte , short , int , long
// Floating point numbers again classified as - float And double
// Non-numeric classified as - char & boolean


class DataTypes {

// Primitive data types
int x;
double y = 34.89;
boolean b;
byte bt = 23;
short s;
long l;

public void initVariables(){
        x = 45;
        System.out.println(x);
        System.out.println(y);
        b = true;  // predefined keywords always in lowercase in Java
        System.out.println(b);
        System.out.println(bt);
        s = 500;
        System.out.println(s);
        l = 2390;
        System.out.println(l);
}



public static void main(String args[]){
  // here dt is object reference varibale and its a non-primitive variable
        DataTypes dt = new DataTypes();
        dt.initVariables();

}

}
