class MinStack {
    class Node{
        int val;
        int min;
    }
    
    Stack<Node> st = new Stack<Node>();
    
    public void push(int x) {
        Node node = new Node();
        node.val = x;
        if(st.isEmpty()){
            node.min=x;
        }else{
            Node top = st.peek();
            if(top.min <x){
                node.min=top.min;
            }else{
                node.min=x;
            }
        }
        st.push(node);
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().val;
    }

    public int getMin() {
        return st.peek().min;
    }
}
