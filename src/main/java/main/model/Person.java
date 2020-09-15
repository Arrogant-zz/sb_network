package main.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "person")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "reg_date")
    private Instant regDate;

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Column(name = "e_mail")
    private String email;

    @Column(name = "password", nullable = false)
    private String passwordHash;

    @Column(name = "photo", columnDefinition = "text")
    private String photoURL;

    @Column(name = "about", columnDefinition = "text")
    private String about;

    @Column(name = "town")
    private String town;

    @Column(name = "confirmation_code")
    private String confirmationCode;

    @Column(name = "is_approved", nullable = false, columnDefinition = "TINYINT")
    private boolean isApproved = false;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum('ALL', 'FRIENDS')", nullable = false)
    private MessagesPermission messagesPermission;

    @Column(name = "last_online_time")
    private Instant lastOnlineTime;

    @Column(name = "is_blocked", nullable = false, columnDefinition = "TINYINT")
    private boolean isBlocked = false;
}
