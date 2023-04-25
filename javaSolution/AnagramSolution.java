import java.util.*;
import java.util.stream.Collectors;

public class AnagramSolution{
    public static void main(String[] args) {
      int[] numbers = {142567, 4096, 4536766, 94432, 33405, 742561, 9604,
              4576366, 94432, 33405, 5003, 56577}; 
      Map<String, List<Integer>> anagramMap = Arrays.stream(numbers).boxed()
            .collect(Collectors.groupingBy(num -> {
                char[] numChars = String.valueOf(num).toCharArray();
                Arrays.sort(numChars);
                return new String(numChars);
            }));
      
      List<List<Integer>> anagramSol = anagramMap.values().stream()
            .filter(group -> group.size() > 1)
            .collect(Collectors.toList());

      System.out.println(anagramSol);
    }
}
