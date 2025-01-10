package me.sungjm.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)      //테이블 상에서의 컬럼 명이 id라는 의미
    private Long id; // DB 테이블의 'id' 컬럼과 매칭

    @Column(name = "name", nullable = false)     // 테이블 상에서의 컬럼 명이 name라는 의미
    private String name; // DB 테이블의 'name' 컬럼과 매칭
    /*
        각 애너테이션의 역할은 lombok의 경우 java 과정에서 다 설명했습니다.
        하지만 추후 다시 설명드리겠습니다.
        현재는 Member라는 이름의 테이블에 접근하는 데 사용하는 객체로 이해하세요.
     */
    public void changeName(String name) {
        this.name = name;
    }
    /*
        name의 필드값을 바꾸는 다순한 매서드로 setName과 동일 -> 수정에 사용할 거기 때문에
            매서드명을 직관적으로 지었다.

        만약에 이 매서드가 @Transactional 애너테이션이 포함된 매서드에서 호출되면 JPA는
        변경감지(dirty checking) 기능을 통해 엔티티의 필드값이 변경될 때 해당 변경 사항을
        JPA에 자동을 반영해줌.

        MemberRepositoryTest.java로 이동하세요.
     */
}
