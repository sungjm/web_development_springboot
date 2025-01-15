package me.sungjm.springbootdeveloper.config.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties("jwt") // 자바 클래스에 프로퍼티값을 가져와 사용하는 애너테이션
public class JwtProperties {
    private String issuer;
    private String secretkey;

    /*
        이렇게 하면 issuer 필드에서 application.yml에서 생성한 jwt.issuer값이
        secretkey에는 jwt.secret_key 값이 매핑됩니다.
     */
}
