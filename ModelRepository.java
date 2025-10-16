package com.app.repository;

import com.app.entity.cars.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface ModelRepository extends JpaRepository<Model, Long> {
}