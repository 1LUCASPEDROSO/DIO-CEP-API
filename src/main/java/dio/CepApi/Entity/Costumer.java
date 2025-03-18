package dio.CepApi.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "costumer")
public class Costumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    private Adress user_adress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getUser_adress() {
        return user_adress;
    }

    public void setUser_adress(Adress user_adress) {
        this.user_adress = user_adress;
    }
}
