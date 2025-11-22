package emsi.ma.javaspring.service.impl;
import emsi.ma.javaspring.domain.entity.CONTRATS.Tenant;
import emsi.ma.javaspring.repository.TenantRepository;
import emsi.ma.javaspring.service.ITenantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TenantServiceImpl implements ITenantService {

    private final TenantRepository tenantRepository;

    @Override
    public Tenant create(Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    @Override
    public List<Tenant> getByContractId(Long contractId) {
        return tenantRepository.findByContractId(contractId);
    }

    @Override
    public List<Tenant> getByUserId(Long userId) {
        return tenantRepository.findByUserId(userId);
    }

    @Override
    public void delete(Long id) {
        tenantRepository.deleteById(id);
    }
}
