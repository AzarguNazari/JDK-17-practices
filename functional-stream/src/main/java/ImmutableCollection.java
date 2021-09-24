import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollection {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3);
        List<Integer> integers1 = Arrays.asList(1, 2, 3, 4);

        Map<String, Integer> numberMap = Map.of("one", 1, "two", 2, "three", 3);
        Set<Integer> setOfNumbers = Set.of(1, 2, 3, 4, 4, 5);

    }

}
