package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.yrgo.domain.Taco;
@Repository
public interface TacoRepository extends JpaRepository<Taco, Long> {
    public Taco findByName(String name);
}