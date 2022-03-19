package com.tanvir.reactivedemo.service;

import com.tanvir.reactivedemo.domain.IBUser;
import com.tanvir.reactivedemo.repository.IBUserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class IBUserService {

    private final IBUserRepository ibUserRepository;
    private final ModelMapper modelMapper;

    public IBUserService(IBUserRepository ibUserRepository, ModelMapper modelMapper) {
        this.ibUserRepository = ibUserRepository;
        this.modelMapper = modelMapper;
    }

    public Flux<IBUser> getAllIBUser() {
        return ibUserRepository
                .findAll()
                .map(ibUserEntity -> modelMapper.map(ibUserEntity, IBUser.class));
    }
}
