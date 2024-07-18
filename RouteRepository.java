package com.reservationapp.repository;

import com.reservationapp.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.util.RouteMatcher;

public interface RouteRepository  extends JpaRepository<Route, Long> {
}
