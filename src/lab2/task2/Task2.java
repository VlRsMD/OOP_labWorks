package lab2.task2;

public class Task2 {
    public Task2() {
    }

    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.pop();
        q1.fullOrEmpty();
        Queue q2 = new Queue();
        q2.push(4);
        q2.push(7);
        q2.push(8);
        q2.pop();

        // Advanced Level Task
        q2.fullOrEmpty();
    }
}
