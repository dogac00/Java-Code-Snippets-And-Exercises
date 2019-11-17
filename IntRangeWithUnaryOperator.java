import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.*;

public final class IntRange implements Iterable<Integer> {
    private final int m_min, m_max;
    private final IntUnaryOperator m_operator;

    public IntRange(int min, int max) {
        this(min, max, 0);
    }

    public IntRange(int min, int max, int step) {
        this(min, max, number -> number + step);
    }

    public IntRange(int min, int max, IntUnaryOperator operator) {
        if (min >= max)
            throw new IllegalArgumentException("Min must be less than max.");

        this.m_min = min;
        this.m_max = max;
        this.m_operator = operator;
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new Iterator<Integer>() {
            private int m_value = m_min;

            @Override
            public boolean hasNext() {
                return m_value < m_max;
            }

            @Override
            public Integer next() {
                if (!hasNext())
                    throw new NoSuchElementException();

                int temp = m_value;
                m_value = m_operator.applyAsInt(m_value);
                return temp;
            }
        };
    }
}
