package com.soli.Soli.models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mm_num")
    private Long num;

    @Email
    @NotEmpty
    @Column(name="mm_email")
    private String email;

    @NotEmpty
    @Column(name="mm_password")
    private String password;

    @NotEmpty
    @Column(name="mm_fname")
    private String firstName;

    @NotEmpty
    @Column(name="mm_lname")
    private String lastName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="memberroledetail", joinColumns = {
            @JoinColumn(name="md_mm_num", referencedColumnName="mm_num")}, inverseJoinColumns = {
            @JoinColumn(name="md_mr_num", referencedColumnName="mr_num") })
    private List<MemberRole> memberroles;

    public Member() { }

    public void encryptPassword() {

        setPassword(new BCryptPasswordEncoder().encode(getPassword()));
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<MemberRole> getRole() {
        return memberroles;
    }

    public void setRole(List<MemberRole> role) {
        this.memberroles = role;
    }

    public Long getNum() {
        return num;
    }

    public Member setNum(Long num) {
        this.num = num;
        return this;
    }

    public List<MemberRole> getMemberroles() {
        return memberroles;
    }

    public Member setMemberroles(List<MemberRole> memberroles) {
        this.memberroles = memberroles;
        return this;
    }

    public Member(String email, String firstName, String lastName, String password ) {
        setEmail(email);
        setFirstName(firstName);
        setLastName(lastName);
        setPassword(password);
    }
}