package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.CONTRATS.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}