package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.CONTRATS.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}