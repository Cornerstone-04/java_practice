class Loop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        // return i;
    }

}

class Loop2 {
    public static void main(String[] args) {
        int a = 0;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
    }
}

class Loop3 extends Loop {
    public static void main(String[] args) {
        for (int b = 0; b <= 10; --b) {
            System.out.println(b);
        }
    }
}