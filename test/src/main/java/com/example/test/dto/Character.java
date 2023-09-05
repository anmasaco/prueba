package com.example.test.dto;

import java.io.Serializable;

public class Character implements Serializable {

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private String locationUrl;
    private String avatarUrl;

    private static final long serialVersionUID = 201508180945L;


    public Character() {
    }

    public Character(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Character(int id, String name, String status, String species,
                     String type, String gender, String locationUrl,
                     String avatarUrl) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.gender = gender;
        this.locationUrl = locationUrl;
        this.avatarUrl = avatarUrl;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocationUrl() {
        return locationUrl;
    }

    public void setLocationUrl(String locationUrl) {
        this.locationUrl = locationUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

}