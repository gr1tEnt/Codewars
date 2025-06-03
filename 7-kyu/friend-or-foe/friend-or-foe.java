import java.util.List;
class Kata {
   public static List<String> friend(List<String> x){
     return x.stream().filter(a -> a.length() == 4).toList();
   }
}