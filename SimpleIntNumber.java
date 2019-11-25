
class IntNumber implements Comparable<IntNumber> {
    private int m_value;

    @Override
    public int hashCode() {
        return this.m_value;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IntNumber))
            return false;
        
        return ((IntNumber)obj).m_value == m_value;
    }

    public int getValue() {
        return this.m_value;
    }

    @Override
    public int compareTo(IntNumber intNumber) {
        return Integer.compare(this.m_value, intNumber.m_value);
    }
}
