public class File {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print(String indentation){
        System.out.println(indentation + this.name);
    }
}
