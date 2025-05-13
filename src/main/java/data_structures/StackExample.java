package data_structures;

import java.util.Stack;

public class StackExample {
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();

        st.push(6);
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println(st.pop());
        System.out.println(st.size());
    }
}
