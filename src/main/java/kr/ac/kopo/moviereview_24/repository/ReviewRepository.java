package kr.ac.kopo.moviereview_24.repository;

import kr.ac.kopo.moviereview_24.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
