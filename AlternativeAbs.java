
// I translated from Apple Source Code

class Util {
    public static int abs(int x) {
        int s = x >> 31;

        return (x + s) ^ s;
    }
}
