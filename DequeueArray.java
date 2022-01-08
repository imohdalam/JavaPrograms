package Framework;

import java.util.ArrayDeque;

class queue{
        ArrayDeque<Integer> MyQueue = new ArrayDeque<>();
    void insert(int n){
       MyQueue.offerLast(n);
    }
    void delete(){
        MyQueue.pollFirst();
    }
    int show(){
        return MyQueue.peekFirst();
    }
}

class stack{
    ArrayDeque<Integer> MyStack = new ArrayDeque<>();
    void insert(int n){
        MyStack.offerFirst(n);
    }
    void delete(){
        MyStack.pollFirst();
    }
    int show(){
        return MyStack.peekFirst();
    }
}

public class DequeArray {
    public static void main(String[] args) {
        ArrayDeque<Integer> AD1 = new ArrayDeque<>();
        System.out.println(AD1);
        AD1.add(99);
        AD1.offer(100);
        AD1.offerFirst(101);
        AD1.offerLast(102);
        //System.out.println(AD1);
        AD1.forEach((x)->System.out.print(x+" "));
        System.out.println();
        AD1.poll();
        AD1.forEach((x)->System.out.print(x+" "));
        System.out.println();
        queue QE = new queue();
        QE.insert(73);
        QE.insert(51);
        QE.insert(23);
        QE.delete();
        System.out.println(QE.show());
        stack SE = new stack();
        SE.insert(10);
        SE.insert(11);
        SE.insert(12);
        SE.delete();
        System.out.println(SE.show());
    }
}
