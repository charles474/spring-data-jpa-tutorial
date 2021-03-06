package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@Entity (name = "Student")
@Table (name = "student", uniqueConstraints = {@UniqueConstraint(name = "student_email_unique", columnNames = "email")})
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    @Getter
    @Setter
    @Column(name = "id", updatable = false)
    private Long id;

    @Getter
    @Setter
    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String firstName;

    @Getter
    @Setter
    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String lastName;

    @Getter
    @Setter
    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    private String email;

    @Getter
    @Setter
    @Column(name = "age", nullable = false)
    private Integer age;

    public Student(String firstName, String lastName, String email, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
}
