
class Person {
    private String m_firstName;
    private Optional<String> m_secondName;
    private String m_familyName;

    public Person(String firstName, String familyName) {
        this(firstName, Optional.empty(), familyName);
    }

    public Person(String firstName, String secondName, String familyName) {
        m_firstName = firstName;
        m_secondName = Optional.of(secondName);
        m_familyName = familyName;
    }

    public Person(String firstName, Optional<String> secondName, String familyName) {
        m_firstName = firstName;
        m_secondName = secondName;
        m_familyName = familyName;
    }
}
