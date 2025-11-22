package emsi.ma.javaspring.service.impl;

import emsi.ma.javaspring.domain.entity.CONTRATS.Contract;
import emsi.ma.javaspring.domain.entity.CONTRATS.ContractStatus;
import emsi.ma.javaspring.repository.ContractRepository;
import emsi.ma.javaspring.service.IContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContractServiceImpl implements IContractService {

    private final ContractRepository contractRepository;

    @Override
    public Contract create(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public Optional<Contract> getById(Long id) {
        return contractRepository.findById(id);
    }

    @Override
    public List<Contract> getByPropertyId(Long propertyId) {
        return contractRepository.findByPropertyId(propertyId);
    }

    @Override
    public List<Contract> getByStatus(ContractStatus status) {
        return contractRepository.findByStatus(status);
    }

    @Override
    public List<Contract> getByStartDateBetween(LocalDate start, LocalDate end) {
        return contractRepository.findByStartDateBetween(start, end);
    }

    @Override
    public Contract updateStatus(Long id, ContractStatus status) {
        Contract contract = contractRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contract not found"));
        contract.setStatus(status);
        return contractRepository.save(contract);
    }
}
