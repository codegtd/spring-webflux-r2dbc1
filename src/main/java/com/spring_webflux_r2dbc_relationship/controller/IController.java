package com.spring_webflux_r2dbc_relationship.controller;

import com.spring_webflux_r2dbc_relationship.entity.Task;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IController {
    Flux<Task> findAll();

    Flux<Task> getTaskBySchema(String schema);

    Mono<Void> createSchema(String schema);

}
