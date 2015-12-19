package ua.a8m8.entities;

import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author Artur Meshcheriakov
 */
public abstract class AbstractEntity implements IEntity{

    protected Timestamp created;

    public abstract Serializable getID();

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        if (! (obj instanceof AbstractEntity)) {
            return false;
        }
        AbstractEntity other = (AbstractEntity) obj;
        if(getID() == null) {
            if (other.getID() != null) {
                return false;
            }
        }
        if(!getID().equals(other.getID())) {
            return false;
        }
        return true;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(getID()).toHashCode();
    }
}
