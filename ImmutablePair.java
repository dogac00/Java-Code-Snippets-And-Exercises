
public final class Pair<F, S> {
    private final F m_first;
    private final S m_second;

    public Pair(F f, S s) {
        this.m_first = f;
        this.m_second = s;
    }

    public F getFirst() {return m_first;}
    public S getSecond() {return m_second;}

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pair))
            return false;

        Pair other = (Pair<F, S>) obj;

        return this.m_first.equals(other.m_first) && this.m_second.equals(other.m_second);
    }
}
