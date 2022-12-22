class thr10 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<3; i++){
            System.out.println("Thread1");
        }
    }
}

class thr9 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<3; i++){
            System.out.println("Thread2");
        }
    }
}

public class ex4 {
    public static void main(String[] args) {
        thr9 t9 = new thr9();
        thr10 t10 = new thr10();
        //t2.setPriority(Thread.MAX_PRIORITY);
        t9.start();
        t10.start();
        t10.setName("Manjot");
        System.out.println("After changing the name of thread it becomes :"+t10.getName());
    }
}
