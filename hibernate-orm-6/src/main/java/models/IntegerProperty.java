package models;

import jakarta.persistence.*;

@Entity
@Table(name = "integer_property")
public class IntegerProperty implements Property<Integer> {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "`value`")
    private Integer value;

    @OneToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private PropertyHolder propertyHolder;

    @Override
    public PropertyHolder getPropertyHolder() {
        return propertyHolder;
    }

    public void setPropertyHolder(PropertyHolder propertyHolder) {
        this.propertyHolder = propertyHolder;
    }

    public IntegerProperty() {
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public IntegerProperty(Long id, String name, Integer value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }
}
