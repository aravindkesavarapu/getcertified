package com.cg.getcertified.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "student_details")
public class StudentBean {

	@Id
	private long id;

	@Column
	private String studentFName;
	
	@Column
	private String studentLName;
	
	@Column
	private String studentId;
	
//	@OneToMany(targetEntity = TrainingPayment.class, cascade = CascadeType.ALL)
//	private TrainingPayment trainngPayment;
//	

//	@OneToMany(targetEntity = ExamPayment.class, cascade = CascadeType.ALL)
//	private ExamPayment examPayment;
	

}
