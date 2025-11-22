package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.CONTRATS.Payment;
import emsi.ma.javaspring.domain.entity.CONTRATS.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByContractId(Long contractId);

    List<Payment> findByDueDateBefore(LocalDate date);

    List<Payment> findByType(PaymentType type);

    List<Payment> findByContractIdAndType(Long contractId, PaymentType type);

}