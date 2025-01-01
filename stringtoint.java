import java.util.*;

public class stringtoint {
    public static void main(String[] args) {
        String s = "12345";
        int[] finalarr = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();

        System.out.println(Arrays.toString(finalarr));
    }
}