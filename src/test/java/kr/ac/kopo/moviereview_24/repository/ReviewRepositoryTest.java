package kr.ac.kopo.moviereview_24.repository;

import kr.ac.kopo.moviereview_24.entity.Member;
import kr.ac.kopo.moviereview_24.entity.Movie;
import kr.ac.kopo.moviereview_24.entity.Review;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class ReviewRepositoryTest {
    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    public void insertReview() {
        IntStream.rangeClosed(1, 200).forEach(i -> {
            // 임의의 영화번호
            Long mno = (long)(Math.random()*100) + 1;
            // 임의의 회원번호
            Long mid = (long)(Math.random()*100) + 1;

            Member member = Member.builder()
                    .mid(mid)
                    .build();

            Movie movie = Movie.builder()
                    .mno(mno)
                    .build();

            int grade = (int)(Math.random()*5);

            Review review = Review.builder()
                    .member(member)
                    .movie(movie)
                    .grade(grade)
                    .text("영화 리뷰 텍스트 " + i)
                    .build();

            reviewRepository.save(review);
        });
    }
}
