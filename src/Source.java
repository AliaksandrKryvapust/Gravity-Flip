import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 2};
        char d = 'R';
        System.out.println(Arrays.equals(flip(d, arr), new int[]{ 1,2,2,3  }));
    }

    public static int[] flip(char dir, int[] arr) {
        Arrays.sort(arr);
        return (dir == 'L') ? Arrays.stream(arr).boxed().sorted((a,b)->b-a).mapToInt(Integer::intValue).toArray() : arr;
    }
}
