package com.iot.db.controller;

import java.util.List;

public interface GeneralController<T, P> {
    List<T> getAll();

    T getById(P id);

    String save(T createObj);

    String deleteById(P id);

}