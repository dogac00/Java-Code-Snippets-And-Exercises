import java.util.ArrayList;

public class DeviceInfo {
    private String m_name;
    private ArrayList<Integer> m_ports;

    public DeviceInfo(String name) {
        m_name = name;
        m_ports = new ArrayList();
    }

    public void addPort(int portNumber) {
        m_ports.add(portNumber);
    }

    public void Initialize() {
        DeviceInfo di = new DeviceInfo("My Device") {{addPort(8080);}};
    }
}
