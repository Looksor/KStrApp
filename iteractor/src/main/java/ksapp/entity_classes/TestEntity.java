package ksapp.entity_classes;

/**
 * Created by A.Kovalev on 10.12.2016+
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Test")
@Table(name = "\"TEST\"")
public class TestEntity {
    @Id
    @Column(name = "\"ID\"")
    private Long id;

    @Column(name = "\"NAME\"")
    private String name;

    @Column(name = "\"COST\"")
    private Double cost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        boolean rst = o != null && o instanceof TestEntity;
        if (rst) {
            TestEntity c = (TestEntity) o;
            rst = id != null && id.equals(c.id);
        }
        return rst;
    }
}
