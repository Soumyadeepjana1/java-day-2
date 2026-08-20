// OOP Practice Question 2 — Employee System

// Create an Employee class using Inheritance + Encapsulation + Method Overriding.

// Requirements:

// Create a parent class Employee.
// Private variables: name, salary.
// Create Getter/Setter methods.
// Create a method work() that prints "Employee is working".
// Create a child class Developer using extends.
// Override work() in Developer to print "Developer is writing code".
// Create a Developer object in main() and display the employee's name, salary, and work message.

// Target concepts:
// private → Getter/Setter → Encapsulation → extends → Inheritance → Method Overriding.

class employes {
    private String name;
    private int sallary;

    public void set_name(String name) {
        this.name = name;
    }

    public void set_sallary(int sallary) {
        this.sallary = sallary;
    }

    public String get_name() {
        return name;
    }

    public int get_sallary() {
        return sallary;
    }

    public void work() {
        System.out.println("employes are working");
    }
}

class Developer extends employes {
    public void work() {
        System.out.println("devloper is writing code");
    }
}

public class project6 {
    public static void main(String[] args) {
        employes e1 = new employes();
        e1.set_name("soumyadeep");
        e1.set_sallary(1000);

        System.out.println(e1.get_name());
        System.out.println(e1.get_sallary());
        e1.work();

        Developer d1 = new Developer();
        d1.set_name("cobra");
        d1.set_sallary(2000);

        System.out.println(d1.get_name());
        System.out.println(d1.get_sallary());
        d1.work();

    }
}
