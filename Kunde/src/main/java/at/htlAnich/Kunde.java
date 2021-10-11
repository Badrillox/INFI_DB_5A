package at.htlAnich;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kunde {

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
