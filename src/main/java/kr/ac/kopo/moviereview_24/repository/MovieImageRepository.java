package kr.ac.kopo.moviereview_24.repository;

import kr.ac.kopo.moviereview_24.entity.MovieImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieImageRepository extends JpaRepository<MovieImage, Long> {
}
