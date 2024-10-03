public class HashCodeDemo {
    public static void main(String[]args){
        String hi="Hi";
        System.out.println("HashCode of the String Hi is : "+hi.hashCode());

        String post= "post";
        System.out.println("Hashcode of the String post = "+ post.hashCode());
        System.out.println("Hashcode of the String stop = "+ "stop".hashCode());
        System.out.println("Hashcode of the String tops = "+ "tops".hashCode());

        System.out.println("Hashcode of the String Hello World = "+ "Hello World".hashCode());
        System.out.println("Hashcode of the String London = "+ "London".hashCode());
    }
}
