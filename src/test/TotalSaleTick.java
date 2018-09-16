import org.junit.Test;

public class TotalSaleTick implements Runnable {
    private int total = 30;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (total > 0) {
                    System.out.println(Thread.currentThread().getName() + "售出一张, 剩余:" + --total);
                } else {
                    break;
                }
            }
        }
    }

    @Test
    public void testTotalSale() {
        TotalSaleTick totalSaleTick = new TotalSaleTick();
        Thread thread1 = new Thread(totalSaleTick, "窗口 1");
        Thread thread2 = new Thread(totalSaleTick, "窗口 2");
        Thread thread3 = new Thread(totalSaleTick, "窗口 3");

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("master over!");
    }
}



