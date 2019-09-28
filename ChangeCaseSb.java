class StringHelper {
    static String changeCaseToCharArray(String s) {
        char[] arr = s.toCharArray();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            final char current = arr[i];
            final char converted;

            if (Character.isUpperCase(current))
                converted = Character.toLowerCase(current);
            else
                converted = Character.toUpperCase(current);

            arr[i] = converted;
        }

        return new String(arr);
    }

    static String changeCase(String s) {
        StringBuilder sb = new StringBuilder();

        int len = s.length();

        for (int i = 0; i < len; ++i) {
            final char ch = s.charAt(i);
            final char converted;

            if (Character.isUpperCase(ch))
                converted = Character.toLowerCase(ch);
            else
                converted = Character.toUpperCase(ch);

            sb.append(converted);
        }

        return sb.toString();
    }
}
