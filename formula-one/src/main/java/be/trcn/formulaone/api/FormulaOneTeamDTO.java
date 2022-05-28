package be.trcn.formulaone.api;

import be.trcn.formulaone.domain.FormulaOneTeam;

public class FormulaOneTeamDTO {
    private String name;
    private int members;
    private String topDriver;

    public FormulaOneTeamDTO(FormulaOneTeam formulaOneTeam) {
        this.name = formulaOneTeam.getName();
        this.members = formulaOneTeam.getMembers();
        this.topDriver = formulaOneTeam.getTopDriver();
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
