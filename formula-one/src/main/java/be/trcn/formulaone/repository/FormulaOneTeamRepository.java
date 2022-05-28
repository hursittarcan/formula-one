package be.trcn.formulaone.repository;

import be.trcn.formulaone.domain.FormulaOneTeam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormulaOneTeamRepository extends JpaRepository<FormulaOneTeam, Long> {
}
