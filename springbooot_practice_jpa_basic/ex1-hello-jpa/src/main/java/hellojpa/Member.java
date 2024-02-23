package hellojpa;


import jakarta.persistence.*;

@Entity
public class Member extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name = "username")
    private String username;

    //기간
    @Embedded
    private Period workAddress;

    //주소
    @Embedded
    private Address homeAddress;

}
