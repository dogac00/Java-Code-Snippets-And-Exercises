
class IterableString implements Iterable<Character>, CharSequence {
    private String m_string;

    public IterableString(String string) {
        this.m_string = string;
    }

    @Override
    public Iterator<Character> iterator() {
        return new Iterator<Character>() {
            private int m_currentIndex;

            @Override
            public boolean hasNext() {
                return m_currentIndex < m_string.length();
            }

            @Override
            public Character next() {
                return m_string.charAt(m_currentIndex++);
            }
        };
    }

    @Override
    public int length() {
        return m_string.length();
    }

    @Override
    public char charAt(int i) {
        return m_string.charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int j) {
        return m_string.subSequence(i, j);
    }
}
