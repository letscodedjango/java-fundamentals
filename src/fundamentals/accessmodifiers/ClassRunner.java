package fundamentals.accessmodifiers;

// Here no need to import since we have all the classes in same package

class TestRunner{

   public static void main(String[] args) {
       DefaultAccessModifier dam = new DefaultAccessModifier();
       dam.myDefaultDouble = 670.90;
       System.out.println(dam.myDefaultDouble);
       PublicAccessModifier pam = new PublicAccessModifier();
       pam.myPublicDouble = 700.90;
       System.out.println(pam.myPublicDouble);
       pam.accessPublicVariable("accessmodifier");
       ProtectedAccessModifier p = new ProtectedAccessModifier();
       p.myProtectedDouble=456.90;
       System.out.println(p.myProtectedDouble);
       p.accessProtectedVariable("accessmodifier");
       PrivateAccessModifier prv = new PrivateAccessModifier();
       //System.out.println(prv.myPrivateInt);     // not possible to access since its a private variable
       prv.accessPrivateVariable("accessmodifier");
   }




}