

public class GenericStack <E>{
    private java.util.ArrayList<E> list= new java.util.ArrayList<>();

    public int getSize(){
        return list.size();
    }
    public E peek(){
        return list.get(getSize()-1);
    }
    public void push(E o){
        list.add(o);
    }
    public E pop(){
        E o =list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    @Override
    public String toString(){
        return"Stack "+ list.toString();
    }
    public static void main(String[] args){
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");
        System.out.println(stack1);
        System.out.println(stack1.peek());
        stack1.pop();
        stack1.pop();
        System.out.println(stack1);

    }
}
