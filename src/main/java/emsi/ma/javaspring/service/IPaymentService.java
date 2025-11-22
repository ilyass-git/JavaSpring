package emsi.ma.javaspring.service;

import emsi.ma.javaspring.domain.entity.CONTRATS.Payment;
import emsi.ma.javaspring.domain.entity.CONTRATS.PaymentType;

import java.time.LocalDate;
import java.util.List;

public interface IPaymentService {

    Payment create(Payment payment);

    List<Payment> getByContractId(Long contractId);

    List<Payment> getByDueDateBefore(LocalDate date);

    List<Payment> getByType(PaymentType type);
}
