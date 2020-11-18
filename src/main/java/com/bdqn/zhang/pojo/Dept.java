package com.bdqn.zhang.pojo;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
@Entity
@Table(name = "dept")
public class Dept {
    private Long deptno;
    private String dname;
    private Collection<Emp> emps = new HashSet<>();



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_dept")
    @SequenceGenerator(name = "seq_dept",sequenceName = "seq_dept",allocationSize = 1,initialValue = 100)
    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    @Basic
    @Column(name = "dname", table = "dept")
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @OneToMany(mappedBy = "dept",cascade = CascadeType.ALL)
    public Collection<Emp> getEmps() {
        return emps;
    }

    public void setEmps(Collection<Emp> emps) {
        this.emps = emps;
    }
}
