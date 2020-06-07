package com.pkacp.TableReservation.repository;

import com.pkacp.TableReservation.models.Reservation;
import com.pkacp.TableReservation.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationRepository, Long> {
//    List<Reservation> findByUser(User user);
//
//    List<Reservation> findByDatePeriod(Date start, Date end);
}
