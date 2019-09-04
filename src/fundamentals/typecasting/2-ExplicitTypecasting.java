// Here we will be dicussing about the one of the type casting Explicit Typecasting
// Explicit typecasting is nothing but storing the value of higher datatype variable into lower datatype variables
// In simple type conversion of higher datatype to lower datatype
// It is also known as NARROWING conversion
package fundamentals.typecasting;
class TypeCastExplicit {

public void typecastExplicitly(){

        double x = 567.90;
        long y;

        //y = x; /// here we are storing higher datatype variable value to lower datatype variable and this will throw error --incompatible types: possible lossy conversion from double to long
// So to resolve above error we gonna type case explicitly
        y = (long) x;   // this will convert double to long and then store
        System.out.println("The value of y after storing x in it : " + y); // 567.90

        System.out.println("The value of x after storing in y : " + x); // should be 567.90

        x = 100.99;

        System.out.println("The value of x after reinitializing : " + x); // should be 100.99

        System.out.println("The value of y after changing the value of x : " + y); // should be 567.90

}

public static void main(String args[]){

        TypeCastExplicit tc = new TypeCastExplicit();
        tc.typecastExplicitly();

}

}
