package Functional_Implementaion.Thread;

public class thread extends MultiThread {
    public static void main(String[] args) throws Exception{
        MultiThread[] mt = new MultiThread[1];
        mt[0] = new MultiThread();
        mt[0].start();

    }
}

