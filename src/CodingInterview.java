public class CodingInterview {
    public static void main(String[] args) {
        System.out.println(seriesUp(3));
        System.out.println(seriesUp(4));
        System.out.println(seriesUp(2));
        System.out.println(createSequence(0, 2, 10));
        System.out.println(createSequence(5, 3, 5));

    }

    public static String seriesUp(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (i+1); j++) {
                result = result + " " + (j + 1);
            }
        }
        return result;
    }

    public static String createSequence(int a, int b, int n) {
        String result = "";
        for (int i = 0; i < n;i++) {
            a = a + (int)Math.pow(2,i) * b;
            result = result + " " + a;
        }
        return result;
    }

}