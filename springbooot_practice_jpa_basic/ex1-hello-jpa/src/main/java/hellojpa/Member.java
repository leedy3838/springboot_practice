package hellojpa;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Member extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name = "username")
    private String username;

    //기간
    @Embedded
    private Address homeAddress;

    //주소
    @Embedded
    private Period wordPeriod;

}
