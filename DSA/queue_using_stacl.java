import java.io.IOException;
import java.util.Stack;

class QueueStack<I> {
    Stack<I> back = new Stack<>();
    Stack<I> front = new Stack<>();
    int size;

    QueueStack() {
        size = 0;
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    void enq(I x) {
        this.back.push(x);
        size++;
    }

    void deq() {
        if (this.isEmpty())
            return;
        else {
            while (!this.back.isEmpty()) {
                this.front.push(this.back.peek());
                this.back.pop();
            }
            this.front.pop();
            while (!this.front.isEmpty()) {
                this.back.push(this.front.peek());
                this.front.pop();
            }
        }
    }

    I peek() {
        if (!isEmpty()) {
            while (!this.back.empty()) {
                this.front.push(back.peek());
                this.back.pop();
            }
            return this.front.peek();
        } else
            return null;

    }

    public String toString() {
        if (isEmpty())
            return "";
        else {
            while (!this.back.empty()) {
                this.front.push(this.back.peek());
                this.back.pop();
            }
            String s = "";
            int ele = this.front.size();
            for (int a = 0; a < ele; a++) {
                s = s + " " + this.front.peek();
                this.back.push(this.front.peek());
                this.front.pop();
            }

            return s;
        }
    }

}

public class queue_using_stacl {
    public static void main(String[] args) {
        QueueStack<Integer> qu = new QueueStack<>();
        qu.enq(5);
        qu.enq(10);
        System.out.println(qu);
        qu.deq();
        System.out.println(qu);
    }
}
