package com.cg.getcertified.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.getcertified.entity.ExamPayment;
import com.cg.getcertified.entity.TrainingPayment;
import com.cg.getcertified.repository.ExamPaymentRepo;
import com.cg.getcertified.repository.PaymentRepo;

@Service
public class PaymentService {

	@Autowired
	PaymentRepo paymentRepo;

	@Autowired
	ExamPaymentRepo examPaymentRepo;

	public TrainingPayment addPaymentData(TrainingPayment payeeData) {
		return paymentRepo.save(payeeData);
	}

	public List<TrainingPayment> getPaymentData() {
		List<TrainingPayment> list = new ArrayList<TrainingPayment>();
		paymentRepo.findAll().forEach(list::add);
		return list;
	}

	public ExamPayment examPaymentAdd(ExamPayment payment) {
		return examPaymentRepo.save(payment);
	}

	public List<ExamPayment> getExamPayment() {
		List<ExamPayment> list = new ArrayList<ExamPayment>();
		examPaymentRepo.findAll().forEach(list::add);
		return list;

	}

}
