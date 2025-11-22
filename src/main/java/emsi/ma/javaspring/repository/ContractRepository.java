package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.CONTRATS.Contract;
import emsi.ma.javaspring.domain.entity.CONTRATS.ContractStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ContractRepository extends JpaRepository<Contract, Long> {
    List<Contract> findByPropertyId(Long propertyId);

    List<Contract> findByStatus(ContractStatus status);

    List<Contract> findByStartDateBetween(LocalDate start, LocalDate end);

}