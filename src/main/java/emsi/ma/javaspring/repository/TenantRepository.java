package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.CONTRATS.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
}