package be.trcn.formulaone.api;

public class FormulaOneTeamRequest {
    private String name;
    private int members;
    private String topDriver;

    public FormulaOneTeamRequest(String name, int members, String topDriver) {
        this.name = name;
        this.members = members;
        this.topDriver = topDriver;
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
