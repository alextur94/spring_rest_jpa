package com.turkovaleksey.spring.springboot2.spring_data_jpa.srevice.api;

import java.util.List;

public interface Service<T> {
    List<T> getAll();

    void saveOrUpdate(T entity);

    T getByID(Integer id);

    void deleteById(Integer id);

    List<T> findAllByName(String name);
}
