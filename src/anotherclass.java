public class anotherclass extends abstrt {
    private String personName;
    private enum Status {win , loss , draw};
    public anotherclass(String name){
       personName = name;
    }

    public void setName(String name){
       personName = name;
    }
    public String getName(){
        return personName;
    }


    public void display(){
        Status status;
        System.out.printf("welcome %s",getName());
    }

    @Override
    public int age() {
        return 23;
    }
}
