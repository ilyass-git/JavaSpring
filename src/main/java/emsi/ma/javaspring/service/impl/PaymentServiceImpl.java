package emsi.ma.javaspring.service.impl;
import emsi.ma.javaspring.domain.entity.CONTRATS.Payment;
import emsi.ma.javaspring.domain.entity.CONTRATS.PaymentType;
import emsi.ma.javaspring.repository.PaymentRepository;
import emsi.ma.javaspring.service.IPaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements IPaymentService {

    private final PaymentRepository paymentRepository;

    @Override
    public Payment create(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> getByContractId(Long contractId) {
        return paymentRepository.findByContractId(contractId);
    }

    @Override
    public List<Payment> getByDueDateBefore(LocalDate date) {
        return paymentRepository.findByDueDateBefore(date);
    }

    @Override
    public List<Payment> getByType(PaymentType type) {
        return paymentRepository.findByType(type);
    }
}
