import org.junit.Test;

public class CalculateThread extends Thread {

    private int start;
    private int end;

    private int ans;

    public CalculateThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            ans += i;
        }
    }

    public int getAns() {
        return ans;
    }


}


