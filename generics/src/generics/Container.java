package generics;

public class Container {
 private Object object;
 public Container (Object obj){
  this.object=obj;
 }

 public <t> t duitAndReturn(t ilkin){
    System.out.println("aqromnu salam");
     return null;
 }

 public <t> String duitAndReturn2(t ilkin){
  System.out.println("aqromnu salam");
  return null;
 }
}
