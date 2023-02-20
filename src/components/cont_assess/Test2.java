package components.cont_assess;

public class Test2 {
    public static void main(String[] args) {
        int i = 5, j = 6, k = i++ + ++j, l = --i + --j + k--;
        int m = i + +j + +k + l--, n = -i + j-- + -k - l++;
        int o = i + j + k + l + m + n;
        System.out.print(o);
    }
}
