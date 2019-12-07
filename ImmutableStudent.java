
final class Student {
    private int m_age;
    private String m_name;

    public Student(int age, String name) {
        m_age = age;
        m_name = name;
    }

    public int getAge() {
        return m_age;
    }

    public String getName() {
        return m_name;
    }

    @Override
    public String toString() {
        return String.format("Name : %s, Age : %d", m_name, m_age);
    }

    @Override
    public int hashCode() {
        return 31 * m_age * m_name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Student))
            return false;

        Student student = (Student) obj;

        return this.m_age == student.m_age && Objects.equals(this.m_name, student.m_name);
    }
}
