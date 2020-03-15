class MyArrays {
    public static String toString(int[] arr) {
        if (arr == null)
            return "null";

        int length = arr.length;

        if (length == 0)
            return "[]";

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < length; i++) {
            sb.append(arr[i]);

            if (i != arr.length - 1)
                sb.append(", ");
        }

        return sb.append("]").toString();
    }
}
