package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.yrgo.domain.Vehicle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    public Vehicle findByName(String name);
}