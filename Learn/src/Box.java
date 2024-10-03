public class Box <T>{
    private T item;

    public void put(T item){
        this.item=item;
    }

    public T get(){
        return item;
    }
    public void getBox(Box<?>box){
        Object item=box.get();
        System.out.println(item);
    }
    public<T> T arrayBox(T[]Array){
        return null;
    }
    public <T extends Comparable<T>>int compare(T obj1,T obj2){
        return obj1.compareTo(obj2);
    }

}
