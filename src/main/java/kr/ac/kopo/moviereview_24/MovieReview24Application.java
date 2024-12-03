package kr.ac.kopo.moviereview_24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // BaseEntity의 regDate, modDate값이 자동으로 저장
public class MovieReview24Application {

    public static void main(String[] args) {
        SpringApplication.run(MovieReview24Application.class, args);
    }

}
