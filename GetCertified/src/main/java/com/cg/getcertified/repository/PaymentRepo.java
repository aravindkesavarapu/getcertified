package com.cg.getcertified.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.getcertified.entity.TrainingPayment;

@Repository
@EnableJpaRepositories
public interface PaymentRepo extends CrudRepository<TrainingPayment, Long>{

}
