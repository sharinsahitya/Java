package app.Emp;

import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "DEPT")
@NamedQuery(name = "findEmp", query = " SELECT e FROM DeptEntity e where e.DeptNo >= ?1" )
public class DeptEntity {
    @Id
    @Column(name = "DEPTNO")
    private int DeptNo;

    @Basic // DEFAULT
    @Column(name = "DNAME")
    private String name;

    @Basic
    @Column(name = "LOC")
    private String loc;

    @OneToMany
    @JoinColumn(name = "DEPTNO")
    private List<EmployeeEntity> employees ;

    public int getDeptNo() {
        return DeptNo;
    }

    public String getName() {
        return name;
    }

    public String getLoc() {
        return loc;
    }

    public void setDeptNo(int deptNo) {
        DeptNo = deptNo;
    }

    public List<EmployeeEntity> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeEntity> employees) {
        this.employees = employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

}
