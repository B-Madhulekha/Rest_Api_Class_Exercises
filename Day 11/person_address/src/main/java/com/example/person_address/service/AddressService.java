package com.example.person_address.service;

import com.example.person_address.model.Address;

public interface AddressService {
    Address mapAddressToPerson(Long personId, Address address);
}