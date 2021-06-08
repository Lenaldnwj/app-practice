package com.prac.apppractice.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.core.mapping.Document;

@Repository
@Document(collection = "info")
public class InfoModel {

    @Id
    private ObjectId _id;
    private String name;
    private int age;
    private String gender;

    public InfoModel(){
    }

    public InfoModel(ObjectId _id, String name, int age, String gender) {
        this._id = _id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "InfoModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

}

