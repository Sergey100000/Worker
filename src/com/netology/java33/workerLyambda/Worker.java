package com.netology.java33.workerLyambda;

interface OnTaskDoneListener {
    void onDone(String result);
}

interface OnTaskErrorListener {
    void onError(String errorMessage);
}

class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " failed");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}

