package com.bdqn.zhang.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "emp")
public class Emp implements Serializable {
    private Long id;
    private String ename;
    private String address;
    private BigDecimal sal;
    private String createby;
    private Date createdate;
    private Dept dept;

    @Id
    @Column(name = "id", table = "emp")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Basic
    @Column(name = "createby", table = "emp")
    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    @Basic
    @Column(name = "createdate", table = "emp")
    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emp emp = (Emp) o;

        if (id != null ? !id.equals(emp.id) : emp.id != null) return false;
        if (ename != null ? !ename.equals(emp.ename) : emp.ename != null) return false;
        if (address != null ? !address.equals(emp.address) : emp.address != null) return false;
        if (sal != null ? !sal.equals(emp.sal) : emp.sal != null) return false;
        if (createby != null ? !createby.equals(emp.createby) : emp.createby != null) return false;
        if (createdate != null ? !createdate.equals(emp.createdate) : emp.createdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ename != null ? ename.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (sal != null ? sal.hashCode() : 0);
        result = 31 * result + (createby != null ? createby.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "deptno", referencedColumnName = "id", nullable = false, table = "emp")
    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
