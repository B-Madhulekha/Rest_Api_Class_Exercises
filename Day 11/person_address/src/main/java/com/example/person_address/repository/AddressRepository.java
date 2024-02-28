package com.example.person_address.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.person_address.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    // Custom queries if needed
}