package com.game.entity;

import jakarta.persistence.*;
import javax.validation.constraints.*;

import java.util.Date;


@Entity
@Table(name = "Player", schema = "rpg")
@NamedQuery(name = "player_getAllCount", query = "select count(p) from Player p")
public class Player {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME", length = 12, nullable = false)
    @NotEmpty(message = "Name shouldn't be empty.")
    private String name;

    @Column(name = "TITLE", length = 30, nullable = false)
    private String title;

    @Column(name = "RACE", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Race race;

    @Column(name = "PROFESSION", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Profession profession;

    @Column(name = "BIRTHDAY", nullable = false)
    private Date birthday;

    @Column(name = "BANNED", nullable = false)
    private Boolean banned;

    @Column(name = "LEVEL", nullable = false)
    private Integer level;

    public Player() {
    }

    public Player(Long id, String name, String title, Race race, Profession profession, Date birthday, Boolean banned, Integer level) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.race = race;
        this.profession = profession;
        this.birthday = birthday;
        this.banned = banned;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}