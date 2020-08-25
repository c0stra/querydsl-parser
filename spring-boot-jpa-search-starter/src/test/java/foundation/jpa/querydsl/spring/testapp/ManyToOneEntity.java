package foundation.jpa.querydsl.spring.testapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ManyToOneEntity {

    @Id
    @GeneratedValue
    private long id;

    public long getId() {
        return id;
    }

    public ManyToOneEntity setId(long id) {
        this.id = id;
        return this;
    }
}