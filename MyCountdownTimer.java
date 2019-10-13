import java.util.Timer;
import java.util.TimerTask;

public class MyCountdownTimer extends CountdownTimer {
    public MyCountdownTimer(int time, int interval) {
        super(time, interval);
    }

    @Override
    public void onTick(long millisUntilFinish) {
        System.out.println("Remaining: " + millisUntilFinish);
    }

    @Override
    public void onFinish() {
        System.out.println("Finished...");
    }
}

abstract class CountdownTimer {
    private Timer m_timer;
    private int m_count;
    private int m_target;
    private int m_interval;
    protected int m_remaining;

    public CountdownTimer(int time, int interval) {
        m_timer = new Timer();
        m_target = time / interval;
        m_interval = interval;
    }

    public void start() {
        m_timer.schedule(new TimerTask() {
            @Override
            public void run() {
                m_remaining = m_target - m_count;

                onTick(m_remaining);

                ++m_count;

                if (m_count >= m_target) {
                    onFinish();

                    m_timer.cancel();
                }
            }
        }, 0, m_interval);
    }

    public abstract void onTick(long millisUntilFinished);

    public abstract void onFinish();
}
