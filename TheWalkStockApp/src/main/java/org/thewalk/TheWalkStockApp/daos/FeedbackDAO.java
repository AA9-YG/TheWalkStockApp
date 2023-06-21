package org.thewalk.TheWalkStockApp.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thewalk.TheWalkStockApp.entities.Feedback;

@Repository
public interface FeedbackDAO extends JpaRepository<Long, Feedback> {
}
