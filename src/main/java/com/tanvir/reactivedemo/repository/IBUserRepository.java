package com.tanvir.reactivedemo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface IBUserRepository extends ReactiveCrudRepository<IBUserEntity, String> {

    Flux<IBUserEntity> findAll();

}
