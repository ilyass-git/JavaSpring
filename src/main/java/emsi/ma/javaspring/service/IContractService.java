package emsi.ma.javaspring.service;

import emsi.ma.javaspring.domain.entity.CONTRATS.Contract;
import emsi.ma.javaspring.domain.entity.CONTRATS.ContractStatus;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IContractService {
    Contract create(Contract contract);

    Optional<Contract> getById(Long id);

    List<Contract> getByPropertyId(Long propertyId);

    List<Contract> getByStatus(ContractStatus status);

    List<Contract> getByStartDateBetween(LocalDate start, LocalDate end);

    Contract updateStatus(Long id, ContractStatus status);
}
