package app;

import app.Emp.DeptEntity;
import jakarta.persistence.Persistence;


public class Program {
    
    public static void main(String[] args) throws Exception {
     var emf = Persistence.createEntityManagerFactory("app.Emp");
     var em = emf.createEntityManager();
     if(args.length == 0){
        var emp = em.createNamedQuery("findEmp", DeptEntity.class)
        .setParameter(1,20)
        .getResultList();
        for(var e : emp )
        System.out.printf("%d\t%s\t%s%n",e.getDeptNo() ,e.getName(),e.getLoc());
       // System.out.printf("%d\t%s\t%s\t%d%n",i.getEmpNo(),i.getName(),i.getJob(),i.getDeptno());
      }else{
        int deptno= Integer.parseInt(args[0]);
        var dept = em.find(DeptEntity.class,deptno);
        if(dept!=null){
            for(var i : dept.getEmployees()){
            System.out.printf("%d\t%s\t%s\t%d\t%f\t%f\t%d%n",i.getEmpNo(),i.getName(),i.getJob(),i.getMgr(),i.getSalary(),i.getComm(), i.getDeptno());
            }
        }
    }
    em.close();
    

    }
}

