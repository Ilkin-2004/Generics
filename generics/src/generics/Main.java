package generics;

public class Main {
    public static void main(String[] args) {
        String s="iki";
      Container container=new Container(s);
       method(container);
     s= container.duitAndReturn(container.toString());
       System.out.println(s);

    }
   public static void method(Container container){
String  us=new String();
     us= container.duitAndReturn2(new User());
     System.out.println(us);

   }



}