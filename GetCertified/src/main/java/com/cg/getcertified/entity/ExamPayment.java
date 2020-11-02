package com.cg.getcertified.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExamPayment {
	
	@Id
	private long id;
	
	@Column(nullable = false)
	private String regCourse;
	
	@Column(nullable = false)
	private int paymentAmount;
	
	@Column(nullable = false)
	private long cardNumber;
	
	@Column(nullable = false)
	private int exipryMonth;
	
	@Column(nullable = false)
	private int expiryYear;
	
	

}
