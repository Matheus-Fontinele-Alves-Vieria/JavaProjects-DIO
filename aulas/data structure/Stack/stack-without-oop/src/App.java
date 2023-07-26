public class App { 
    public static final int SIZE = 4;   
    public static int top = -1;
    public static int[] stack_array = new int[SIZE];
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        pop();
        pop();
        show();
    }

    public static void push(int x) {
        if(top == SIZE - 1) {
            System.out.println("Overflow!");
        } else {
            top += 1;
            stack_array[top] = x;
        }
    }

    public static void pop() {
        if(top == -1) {
            System.out.println("Underflow!");
        } else {
            top -= 1;
        }
    }

    public static void show() {
        for(int i = top; i >= 0; i--) {
            System.out.println(stack_array[i]);
        }
    }
}
