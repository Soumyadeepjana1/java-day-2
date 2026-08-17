class employes {
    private String name;
    private double salary;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public double getsalary() {
        return salary;
    }

}

public class gretterandsetter {
    public static void main(String[] args) {
        employes e1 = new employes();
        e1.setname("king cobra");
        e1.setsalary(1000000);
        System.out.println(e1.getname());
        System.out.println(e1.getsalary());

    }
}
