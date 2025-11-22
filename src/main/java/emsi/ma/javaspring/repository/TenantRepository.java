package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.CONTRATS.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
    List<Tenant> findByUserId(Long userId);

    List<Tenant> findByContractId(Long contractId);

    List<Tenant> findByRoomId(Long roomId);

}