public class Main {
    public static void main(String[] args) {
        int count1 = 9;
        for (int i = count1; i >= 0; i--) {
            int count2 = i;
            if (count1 > count2) {
                int tmp = count1 - count2;
                for (int j = tmp; j > 0; j--) {
                    System.out.print(count2 + " ");
                }
            }
            for (int j = count2; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}