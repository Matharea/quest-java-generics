import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Generics {
  /**
   * Java entry point
   */
  public static void main(String... args) {
    new Generics();
  }

  /**
   * Class Constructor
   */
  private Generics() {
    List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    List<String>  strs = Arrays.asList("tout", "titi", "ototo", "jean", "tous", "taratata");


      ints.stream()
              .filter(i -> i%2 == 0)
              .map(i -> i*2)
              .forEach(System.out::println);

      strs.stream()
              .filter(s -> s.matches(".*[t].*[t].*"))
              .map(s -> s.toUpperCase())
              .forEach(System.out::println);

  }
}
