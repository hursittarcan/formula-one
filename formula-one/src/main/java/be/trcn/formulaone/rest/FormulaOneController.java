package be.trcn.formulaone.rest;

import be.trcn.formulaone.api.FormulaOneTeamDTO;
import be.trcn.formulaone.api.FormulaOneTeamRequest;
import be.trcn.formulaone.service.FormulaOneTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FormulaOneController {
    private final FormulaOneTeamService formulaOneTeamService;

    @Autowired
    public FormulaOneController(FormulaOneTeamService formulaOneTeamService) {
        this.formulaOneTeamService = formulaOneTeamService;
    }

    @GetMapping
    public ResponseEntity<List<FormulaOneTeamDTO>> getAllFormulaOneTeams() {
        return new ResponseEntity<>(formulaOneTeamService.getAllFormulaOneTeams(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<FormulaOneTeamDTO> createFormulaOneTeam(@RequestBody FormulaOneTeamRequest formulaOneTeamRequest) {
        return new ResponseEntity<>(formulaOneTeamService.createNewFormulaOneTeam(formulaOneTeamRequest), HttpStatus.CREATED);
    }

}
