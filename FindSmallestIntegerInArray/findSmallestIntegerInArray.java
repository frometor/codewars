public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
    java.util.Arrays.sort(args);
    return args[0];
    }
}
