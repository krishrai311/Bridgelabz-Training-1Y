package Queue;

public class Circlebuffer {
    int[] arr;
    int size, front = 0, rear = 0, count = 0;

    CircularBuffer(int size) {
        this.size = size;
        arr = new int[size];
    }

    void insert(int x) {
        arr[rear] = x;
        rear = (rear + 1) % size;

        if (count == size) {
            front = (front + 1) % size; // overwrite oldest
        } else {
            count++;
        }
    }

    void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[(front + i) % size] + " ");
        }
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);

        cb.display();  // 2 3 4
    }
}
