package be.trcn.formulaone.service.impl;

import be.trcn.formulaone.api.FormulaOneTeamDTO;
import be.trcn.formulaone.repository.FormulaOneTeamRepository;
import be.trcn.formulaone.service.FormulaOneTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FormulaOneTeamServiceImpl implements FormulaOneTeamService {

    private final FormulaOneTeamRepository formulaOneTeamRepository;

    @Autowired
    public FormulaOneTeamServiceImpl(FormulaOneTeamRepository formulaOneTeamRepository) {
        this.formulaOneTeamRepository = formulaOneTeamRepository;
    }

    @Override
    public List<FormulaOneTeamDTO> getAllFormulaOneTeams() {
        return formulaOneTeamRepository.findAll()
                .stream().map(FormulaOneTeamDTO::new)
                .collect(Collectors.toList());
    }
}
