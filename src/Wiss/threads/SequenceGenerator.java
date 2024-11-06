package Wiss.threads;

public class SequenceGenerator implements Runnable{

    private NumberGenerator numberGenerator;
    private Integer threadNumber;

    public SequenceGenerator(NumberGenerator numberGenerator, Integer threadNumber) {
        this.numberGenerator = numberGenerator;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        numberGenerator.print(threadNumber);
    }
}
