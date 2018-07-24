package Classes;

public class ReverseHello {
    public static void main(String[] args) throws InterruptedException {

        ThreadHello t01 = new ThreadHello();

        Thread t = new Thread(t01);
        t.start();

    }
}

class ThreadHello implements Runnable {

    private void greetingsFrom(int threadNo){
        System.out.println("Hello from " + threadNo);
    }

    @Override
    public void run() {
        Thread thread;
        for (int i = 1; i < 51; i++) {
            thread = new Thread(this);
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            greetingsFrom(i);
        }
    }

}
