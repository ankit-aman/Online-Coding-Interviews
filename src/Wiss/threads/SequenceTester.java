package Wiss.threads;

public class SequenceTester {

    public static void main(String[] args) {

        NumberGenerator numberGenerator=new NumberGenerator(3,20);

        Thread t1 =new Thread(new SequenceGenerator(numberGenerator,1),"Thread 1");
        Thread t2 =new Thread(new SequenceGenerator(numberGenerator,2),"Thread 2");
        Thread t3 =new Thread(new SequenceGenerator(numberGenerator,0),"Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
