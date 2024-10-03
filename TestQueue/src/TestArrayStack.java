public class TestArrayStack {
    public static<E> void main(String[] args){
        ArrayStack eArrayStack= new ArrayStack<>();
        eArrayStack.pop();
        eArrayStack.push(1);
        eArrayStack.push(2);
        eArrayStack.push(3);
        eArrayStack.push(4);

        System.out.println(eArrayStack.pop());
        System.out.println(eArrayStack.pop());
//        eArrayStack.push(5);
//        eArrayStack.push(6);
        eArrayStack.push(7);
        System.out.println(eArrayStack.top());
        eArrayStack.push(8);
        System.out.println(eArrayStack.isEmpty());
        System.out.println(eArrayStack.size());


    }
}
