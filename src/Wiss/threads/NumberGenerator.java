package Wiss.threads;

public class NumberGenerator {

    private Integer currentNumber=1;
    private Integer noOfThreads;
    private Integer total;

    public NumberGenerator(Integer noOfThreads, Integer total) {
        this.noOfThreads = noOfThreads;
        this.total = total;
    }

    public void print(int threadNo){
        synchronized (this){
            while(currentNumber<total-1){
                while(currentNumber%noOfThreads!=threadNo){
                    try{
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("In thread number: "+Thread.currentThread().getName() + " priting value= "+currentNumber++);
                notifyAll();
            }
        }
    }
}
