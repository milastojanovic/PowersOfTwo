public class Main {

    public static void main(String[] args) {

        int num = 4; // result: true
//        int num = 124; // result: false
        /////////////////////////
//        int num = 1024;
//        int num = 1033;

        try {
            System.out.println(powersOfTwo(num));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String powersOfTwo(int num) {

        if (num == 0) {
            throw new IllegalArgumentException("Illegal input: 0");
        }
        String result = "false";

        boolean calculatePowerOfTwo = true;
        int power = 1;
        int product = 2;
        while (product < num) {
            product *= 2;
            power++;
        }

        if (product == num) {
            result = "true";
        } else {
            result = "false";
        }

        return result;
    }
}
