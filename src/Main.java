import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.naturalOrder;
import static java.util.Locale.filter;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++)
            if (intList.get(i) > 0) {
                if (intList.get(i) % 2 == 0) {
                    list2.add(intList.get(i));
                }
            }
        list2.sort(Comparator.naturalOrder());
        System.out.println(list2);

    }
}


