class A implements Runnable {
    public void run() {
        for (int i = 1; i < 5; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}

class CreatingThreads {
    public static void main(String args[]) {
        A ob = new A();
        Thread t1 = new Thread(ob, "child");
        t1.start();

        for (int j = 1; j < 5; j++) {
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + j);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}
