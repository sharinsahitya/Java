package app.Emp;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EMP")
// @NamedQuery(name = "findEmp", query = " SELECT e FROM EmployeeEntity e where e.deptno >= ?1" )
public class EmployeeEntity{

    @Id
    @Column(name = "EMPNO")
    private int empNo;

    @Column(name = "ENAME")
    private String name;

    @Column(name = "JOB")
    private String job;

    @Column(name = "MGR")
    private int mgr;

    @Column(name = "HIREDATE")
    private Date hireDate;

    @Column(name = "SAL")
    private double salary;

    @Column(name = "COMM")
    private double comm;
    
    @Column(name= "DEPTNO")
    private int deptno;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getMgr() {
        return mgr;
    }
    public void setMgr(int mgr) {
        this.mgr = mgr;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getComm() {
        return comm;
    }
    public void setComm(double comm) {
        this.comm = comm;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
   
}
