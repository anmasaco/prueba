package com.test.backend.dto;
public class Character implements Serializers{

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private String locationUrl;
    private String avatarUrl;

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
}