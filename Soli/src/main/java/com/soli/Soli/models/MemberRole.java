package com.soli.Soli.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table
public class MemberRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mr_num")
    private Long num;

    @Column(name="mr_name")
    private String name;

    @ManyToMany(mappedBy="memberroles")
    private List<Member> members;

    public MemberRole() {
    }

    public Long getNum() {
        return num;
    }

    public MemberRole setNum(Long num) {
        this.num = num;
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public MemberRole(String name) {
        this.name = name;
    }

}