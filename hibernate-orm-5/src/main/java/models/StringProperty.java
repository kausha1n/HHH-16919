package models;

import javax.persistence.*;

@Entity
@Table(name = "string_property")
public class StringProperty implements Property<String> {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "`value`")
    private String value;

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
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StringProperty() {
    }

    public StringProperty(Long id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }
}