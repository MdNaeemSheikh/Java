public class employee {
    private double salary;
    private String name;
    public employee(String name,double salary){
        this.name=name;
        this.salary=salary;

    }
    String getname(){
        return name;
    }
    double aa(){
        return salary;
    }
    public static void main(String[] args){
        employee e1=new employee( "Naeem", 100000);
        System.out.println(e1.aa());
    }
}
