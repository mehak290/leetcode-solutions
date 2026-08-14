class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
       minStack = new Stack<>();
       stack= new Stack<>(); 
    }
    
    public void push(int value) {
        stack.push(value);
        if(minStack.isEmpty() || minStack.peek()>=value){
            minStack.push(value);
        }
        else{
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
 