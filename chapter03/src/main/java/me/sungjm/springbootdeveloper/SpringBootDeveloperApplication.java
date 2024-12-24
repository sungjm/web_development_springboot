package me.sungjm.springbootdeveloper;
/*
    New project 생성시 주의점:
        1. build system -> Gradle
        2. DLS -> Groovy 설정
        3. name = ArtifactId
        4. build.gradle 설정을 복사하는데, 복사 후에 -> sync를 꼭 눌러줘야 합니다.
            ->SpringBootDeveloperApplication에서 @SpringBootApplication 애너테이션에 빨간줄이 있다면
                새로고침 만했을 확률이 거의 99%
        5. resources 내에 static 내에 index.html이라고 하는데,
            해당 폴더명의 경우 대부분의 개발자들이 합의한 형태
        6. 앞으로의 수업 시간에는 new project 생성시에 이렇게 자세히 풀이할 일은 자주 있지 않을 예정이니 꼭
            익혀두시기 바랍니다. -> github 본다고 되는 부분이 아니니만큼 신경써주시면 감사하겠습니다.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*


 */
@SpringBootApplication
public class SpringBootDeveloperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}

