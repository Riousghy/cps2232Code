

public class AnyWildCarDemo {
    public static void main(String[] args){
        GenericStack<Integer> intStack= new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        print(intStack);

    }
    public static void print(GenericStack<?>stack){
        while (!stack.isEmpty()){
            System.out.println(steak.pop()+" ");
        }
    }
}
