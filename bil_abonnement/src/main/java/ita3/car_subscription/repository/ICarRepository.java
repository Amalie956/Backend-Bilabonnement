package ita3.car_subscription.repository;

import ita3.car_subscription.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarRepository extends JpaRepository<Car, Long> {
}
