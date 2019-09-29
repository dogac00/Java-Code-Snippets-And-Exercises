
public class App {
    public static void main(String[] args) {
        
    }
}

class Fighter {
    private enum Ability {
        DEFENCE, ATTACK
    }

    {
        m_abilities = new int[Ability.values().length];
    }

    private int[] m_abilities;

    public Fighter(int defence, int attack) {
        setDefence(defence);
        setAttack(attack);
    }

    public void setDefence(int val) {
        m_abilities[Ability.DEFENCE.ordinal()] = val;
    }

    public void setAttack(int val) {
        m_abilities[Ability.ATTACK.ordinal()] = val;
    }

    public int getAttack() {
        return m_abilities[Ability.ATTACK.ordinal()];
    }

    public int getDefence() {
        return m_abilities[Ability.DEFENCE.ordinal()];
    }
}
