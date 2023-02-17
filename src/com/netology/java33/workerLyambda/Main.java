package com.netology.java33.workerLyambda;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener doneListener = result -> System.out.println(result);

        OnTaskErrorListener errorListener = errorMessage -> System.out.println(errorMessage);

        Worker worker = new Worker(doneListener, errorListener);
        worker.start();
    }
}