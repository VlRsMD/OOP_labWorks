package lab2.task2;

public class Queue {
    int[] queue = new int[10];
    int size;
    int front;
    int rear;

    public void push(int data) {
        this.queue[this.rear] = data;
        ++this.rear;
        ++this.size;
    }

    public int pop() {
        int data = this.queue[this.front];

        for(int i = 0; i < this.rear - 1; ++i) {
            this.queue[i] = this.queue[i + 1];
        }

        --this.size;
        --this.rear;
        return data;
    }

    public void fullOrEmpty() {
        if (this.size == 0) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("The queue is full");
        }

    }
}
