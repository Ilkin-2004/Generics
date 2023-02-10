package generics;

public class Main {
    public static void main(String[] args) {
        String s="iki";
      Container<String> container=new Container(s);
       method(container);
     s=  container.duitAndReturn(container.toString());
       System.out.println(s);
       User<Integer> u=new User();
User<Object> u1=new User();
        container.method2(u1);
       container.methad1(u);
    }
   public static void method(Container container){
User us=new User();
     us= container.duitAndReturn2(new User());
     System.out.println(us);
   }



}