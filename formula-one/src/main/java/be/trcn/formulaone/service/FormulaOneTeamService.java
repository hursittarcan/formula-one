package be.trcn.formulaone.service;

import be.trcn.formulaone.api.FormulaOneTeamDTO;
import be.trcn.formulaone.api.FormulaOneTeamRequest;

import java.util.List;

public interface FormulaOneTeamService {
    List<FormulaOneTeamDTO> getAllFormulaOneTeams();

    FormulaOneTeamDTO createNewFormulaOneTeam(FormulaOneTeamRequest formulaOneTeamRequest);
}
