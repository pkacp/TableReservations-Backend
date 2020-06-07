package com.pkacp.TableReservation.repository;

import com.pkacp.TableReservation.models.DiningTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiningTableRepository extends JpaRepository<DiningTable, Long> {
    List<DiningTable> findBySize(int requestedSize);

    List<DiningTable> findByDescription(String description);
}
