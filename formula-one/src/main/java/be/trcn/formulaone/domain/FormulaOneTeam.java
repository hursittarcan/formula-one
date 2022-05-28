package be.trcn.formulaone.domain;

import javax.persistence.*;

@Entity
@Table(name = "formulaoneteams")
public class FormulaOneTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int members;
    private String topDriver;

    public FormulaOneTeam() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getTopDriver() {
        return topDriver;
    }

    public void setTopDriver(String topDriver) {
        this.topDriver = topDriver;
    }
}
