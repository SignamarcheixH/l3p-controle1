import java.util.HashSet;
import java.util.Set;

public class Employee {
    private String name;
    public EmployeeCategory category;
    private Set<Employee> employees = new HashSet<>();

    public Employee(String name, EmployeeCategory category){
            this.name = name;
            this.category = category;
    }
    public static EmployeeBuilder builder(){
        return new EmployeeBuilder();
    }


    public static class EmployeeBuilder{
        private String name;
        private EmployeeCategory category;
        public EmployeeBuilder subBuild (String  name, EmployeeCategory category) {
                this.name = name;
                this.category = category;
                return this;
        }
        public Employee build(){
            return new Employee( name, category);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeCategory getCategory() {
        return category;
    }

    public void setCategory(EmployeeCategory category) {
        this.category = category;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public void printEmployees (Employee e, int nb) {
        String before="";
        for(int i =0 ;i < nb; i++){
            before+="    ";
        }
        String hierarchy =before+ e.name +"   "+ "(" +  e.category +")" ;
        System.out.println(hierarchy);

        for(Employee i : e.getEmployees()){
            //System.out.println("je suis dans" +e.name +" Je fais"+i.name+ " avec nb"+nb+1);
            printEmployees(i, nb+1);
        }
    }

}
