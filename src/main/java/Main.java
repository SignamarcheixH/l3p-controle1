public class Main {

    public static void main(String[] args){
        Employee e = Employee.builder().subBuild("Yvette",  EmployeeCategory.CEO).build();
        Employee jp = Employee.builder().subBuild("Jean-Patrick", EmployeeCategory.Developer).build();

        Employee jc = Employee.builder().subBuild("Jean-Christophe", EmployeeCategory.Developer).build();
        Employee jy = Employee.builder().subBuild("Jean-Yves", EmployeeCategory.Developer).build();
        Employee jm = Employee.builder().subBuild("Jean-Mouloud", EmployeeCategory.Developer).build();

        jp.getEmployees().add(jc);
        jp.getEmployees().add(jy);
        jp.getEmployees().add(jm);

        Employee s = Employee.builder().subBuild("Sylvie", EmployeeCategory.Accountant).build();

        Employee mj = Employee.builder().subBuild("Marie-jeanne", EmployeeCategory.Marketing).build();

        Employee mc = Employee.builder().subBuild("Marie-Christelle", EmployeeCategory.Marketing).build();
        Employee mcl = Employee.builder().subBuild("Marie-Claire", EmployeeCategory.Marketing).build();

        mj.getEmployees().add(mc);
        mj.getEmployees().add(mcl);

        e.getEmployees().add(jp);
        e.getEmployees().add(s);
        e.getEmployees().add(mj);

        e.printEmployees(e,0);


    }
}
