public class W01Ex12 {
    public static void W01Ex12(string[] args){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng các bội số của 7 là: " + sum);
    }
}
