package com.bdqn.zhang.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "emp")
public class Emp implements Serializable {
    private Long empno;
    private String ename;
    private String address;
    private BigDecimal sal;
    private String createby;
    private Date createdate;
    private Dept dept;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_emp")
    @SequenceGenerator(name = "seq_emp",sequenceName = "seq_emp",allocationSize = 1,initialValue = 3)
    public Long getEmpno() {
        return empno;
    }

    public void setEmpno(Long empno) {
        this.empno = empno;
    }

    @Basic
    @Column(name = "ename", table = "emp")
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Basic
    @Column(name = "address", table = "emp")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "sal", table = "emp")
    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    @Transient
    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    @Transient
    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @ManyToOne
    @JoinColumn(name = "deptno", referencedColumnName = "DEPTNO", nullable = false, table = "emp")
    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
