package com.cg.getcertified.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.getcertified.entity.ExamPayment;
import com.cg.getcertified.entity.TrainingPayment;
import com.cg.getcertified.response.ExamPaymentResponse;
import com.cg.getcertified.response.PaymentResponse;
import com.cg.getcertified.service.PaymentService;

@RestController
@RequestMapping
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;

	
	@PostMapping(value = "/trainingpayment")
	public PaymentResponse addPayee(@RequestBody TrainingPayment payeeData ) {
		PaymentResponse response = new PaymentResponse();
		TrainingPayment trainingPayment = paymentService.addPaymentData(payeeData);
		if(trainingPayment != null) {
			response.setError(false);
			response.setTrainingPayment(trainingPayment);
			System.out.println("IN Response"+ trainingPayment);
		}else {
			response.setError(true);
			response.setMessage("payment data not added into db");
		}
		return response;
	}
	
	@GetMapping(value = "/trainingpayment")
	public List<TrainingPayment> getPayeeDetails() {
		List<TrainingPayment> paymentList = paymentService.getPaymentData();
		return paymentList;
	}
	
	
	@PostMapping(value = "/exampayment")
	public ExamPaymentResponse examPayment(@RequestBody ExamPayment examPayment) {
		ExamPaymentResponse response = new ExamPaymentResponse();
		ExamPayment payment = paymentService.examPaymentAdd(examPayment);
		if(payment != null) {
			response.setError(false);
			response.setExamPayment(payment);
		}else {
			response.setError(true);
			response.setMessage("payment data not added into db");
		}
		return response;
	}
	
	@GetMapping(value = "/exampayment")
	public ExamPaymentResponse getExamPaymentDetails() {
		ExamPaymentResponse response = new ExamPaymentResponse();
		List<ExamPayment> listExam = paymentService.getExamPayment();
		if (!listExam.isEmpty() && listExam!=null) {
			response.setError(false);
			response.setExamPaymentList(listExam);
		} else {
			response.setError(true);
			response.setMessage("NO pauyments");
		}
		return response;
	}
	
}
