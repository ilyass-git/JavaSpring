package emsi.ma.javaspring.service;

import emsi.ma.javaspring.domain.entity.CONTRATS.Tenant;

import java.util.List;

public interface ITenantService {

    Tenant create(Tenant tenant);

    List<Tenant> getByContractId(Long contractId);

    List<Tenant> getByUserId(Long userId);

    void delete(Long id);
}
