package lesson07;

//Read only
public class Cat {
    public final String name;

    public Cat(String name) {
        this.name = name;
    }

    //Service method
    public String getName() {
        return name;
    }

    //Support method
    private String adjustName(String name){
        return "Name" + name;
    }
}
