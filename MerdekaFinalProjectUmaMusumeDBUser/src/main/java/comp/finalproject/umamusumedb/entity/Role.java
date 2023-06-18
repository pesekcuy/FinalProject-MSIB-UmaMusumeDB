package comp.finalproject.umamusumedb.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="roles")
public class Role
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true)
    private String name;

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

    public List<User> getUsers() {
        return users;
    }

    public Role(Long id, String name, List<User> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public Role() {
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @ManyToMany(mappedBy="roles")
    private List<User> users;
}
