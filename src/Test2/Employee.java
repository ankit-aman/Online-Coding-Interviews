package Test2;

//@Entity
public class Employee {

    //@Id
    //@Column("id")
    //@Value(${})
    public String id;

    //@Column
    public String employeeName;

    //@OneToMany
    //@Mappedby("deptId")
    public Dept dept;

}
