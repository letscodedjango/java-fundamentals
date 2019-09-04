// Here we will be dicussing about the one of the type casting Implicit Typecasting
// Implicit typecasting is nothing but storing the value of lower datatype variable into higher datatype variables
// In simple type conversion of lower datatype to higher datatype
// It is also known as WIDENING conversion
package fundamentals.typecasting;
class TypeCastImplicit {

public void typecastImplicitly(){

        int x = 20;
        long y;

        y = x; /// here we are storing smaller datatype variable value to higher datatype variable
        System.out.println("The value of y after storing x in it : " + y); // 20

        System.out.println("The value of x after storing in y : " + x); // should be 20

        x = 100;

        System.out.println("The value of x after reinitializing : " + x); // should be 100

        System.out.println("The value of y after changing the value of x : " + y); // should be 20

}

public static void main(String args[]){

        TypeCastImplicit tc = new TypeCastImplicit();
        tc.typecastImplicitly();

}

}
