
public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.printf("Is %d power of 2? Result : %s%n", i, isPowerOfTwo(i));
        }
    }
    
    // This is because bits of 2^n - 1 are all zero
    // ex. 2^3 - 1 == 7 == 0b111
    // ex. 2^5 - 1 == 31 == 0b11111
    // Therefore when we add 1 to these numbers,
    // result will start with 1 and continue with all zeroes
    // ex. 0b111 + 1 == 0b1000
    // ex. 0b11111 + 1 == 0b100000
    // And when we and these two numbers we should get nothing but zero
    // we have to handle the special case of 0 too
    // ex. 0b1000 & 0b0111 == 0b0000
    // ex. 0b10 & 0b01 == 0b00
    private static boolean isPowerOfTwo(int number) {
        return (number & number - 1) == 0 && number != 0;
    }
}
