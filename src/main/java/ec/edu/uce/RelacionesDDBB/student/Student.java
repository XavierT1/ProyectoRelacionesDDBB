package ec.edu.uce.RelacionesDDBB.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ec.edu.uce.RelacionesDDBB.locker.Locker;
import ec.edu.uce.RelacionesDDBB.subject.Subject;
import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "enrolledStudents")
    private Set<Subject> subjects = new HashSet<>();

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Locker locker;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public Locker getLocker() {
        return locker;
    }

    public void setLocker(Locker locker) {
        this.locker = locker;
    }
}