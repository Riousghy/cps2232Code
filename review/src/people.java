public class people {
    public String name;
    public int age;

    public String career;

    public int money;

    public String company;

    public people(){

    }
    //create a people with the name and age
    public people(String name, int age){
        this.name=name;
        this.age=age;
    }
    //set the people's name
    public  void setName(String name){
        this.name=name;
    }
    //get the poeple's name
    public String getName(String name){
        return this.name;
    }
    //get the poeple's age
    public int getAge(int age){
        return this.age;
    }
    //set th people's age
    public void setAge(int age ){
        this.age=age;
    }
    //give the people's company
    public void setCompany(String company){
        this.company=company;
    }
    // get the company of the people
    public java.lang.String getCompany() {
        return this.company;
    }
}