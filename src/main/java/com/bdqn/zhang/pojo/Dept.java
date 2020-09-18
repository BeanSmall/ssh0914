package com.bdqn.zhang.pojo;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
@Entity
@Table(name = "dept")
public class Dept {
    private Integer id;
    private String dname;
    private Collection<Emp> emps = new HashSet<>();

    @Id
    @Column(name = "id", table = "dept")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dname", table = "dept")
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dept dept = (Dept) o;

        if (id != null ? !id.equals(dept.id) : dept.id != null) return false;
        if (dname != null ? !dname.equals(dept.dname) : dept.dname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dname != null ? dname.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "dept",cascade = CascadeType.ALL)
    public Collection<Emp> getEmps() {
        return emps;
    }

    public void setEmps(Collection<Emp> emps) {
        this.emps = emps;
    }
}
