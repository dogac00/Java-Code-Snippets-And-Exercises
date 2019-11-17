import java.util.Iterator;
import java.util.NoSuchElementException;

public final class IntRange implements Iterable<Integer> {
    private final int m_min, m_max;

    public IntRange(int min, int max) {
        if (min >= max)
            throw new IllegalArgumentException("Min must be less than max.");

        this.m_min = min;
        this.m_max = max;
    }

    public int getMin() {
        return m_min;
    }

    public int getMax() {
        return m_max;
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new Iterator<Integer>() {
            private int m_index;

            @Override
            public boolean hasNext() {
                return m_min + m_index <= m_max;
            }

            @Override
            public Integer next() {
                if (!hasNext())
                    throw new NoSuchElementException();

                return m_min + m_index++;
            }
        };
    }
}
