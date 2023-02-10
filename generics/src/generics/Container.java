package generics;

public class Container<T> {
 private T object;
 public Container (T obj){
  this.object=obj;
 }

 public <t> t duitAndReturn(t ilkin){
    System.out.println("aqromnu salam");
     return ilkin;
 }

 public <t> User<T> duitAndReturn2(t ilkin){
  System.out.println("aqromnu salam");
  return null;
 }
 //wildcart extends yazılıbsa deməli daxil edilmiş clas tipi numberdən exsdent edolub
 public  String methad1(User<? extends Number> c){
  System.out.println("aqromnu salam");
  return null;
 }
 //wildcart əgər super yazılırsa deməli NUmber clası daxil edilən klas tipinə extens olmalıdı
 public  void method2(User<? super Number> c){
  System.out.println("aqromnu salam");

 }

}
