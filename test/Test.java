import java.util.*;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[][] arr = new Integer[3][9];
        for (int i = 0; i < 3; i++) {
            HashSet<Integer> set = new HashSet<>();
            while (set.size() < 9) {
                set.add(random.nextInt(81));
            }
            int j = 0;
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                arr[i][j++] = it.next();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
