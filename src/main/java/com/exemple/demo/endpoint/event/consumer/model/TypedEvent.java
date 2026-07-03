package com.exemple.demo.endpoint.event.consumer.model;

import com.exemple.demo.PojaGenerated;
import com.exemple.demo.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
