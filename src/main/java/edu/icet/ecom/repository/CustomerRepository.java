package edu.icet.ecom.repository;

import edu.icet.ecom.entity.CustomerEntity;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
