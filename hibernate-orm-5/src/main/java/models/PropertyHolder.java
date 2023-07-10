package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.*;

@Entity
@Table(name = "property_holder")
public class PropertyHolder {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "property_type")
    private String propertyType;

    @Any(metaColumn = @Column(name = "property_type", insertable = false, updatable = false))
    @AnyMetaDef(metaType = "string", idType = "long", metaValues = {
            @MetaValue(value = "I", targetEntity = IntegerProperty.class),
            @MetaValue(value = "S", targetEntity = StringProperty.class)
    })
    @JoinColumn(name = "id", updatable = false, insertable = false)
    @Cascade(CascadeType.ALL)
    private Property property;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public PropertyHolder() {
    }

    public PropertyHolder(Long id, String propertyType, Property property) {
        this.id = id;
        this.propertyType = propertyType;
        this.property = property;
    }
}