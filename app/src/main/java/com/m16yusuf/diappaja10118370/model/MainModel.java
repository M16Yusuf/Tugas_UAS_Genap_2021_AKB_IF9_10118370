package com.m16yusuf.diappaja10118370.model;
//Nama : Muhammad Yusuf
//Kelas : IF-9
//NIM : 10118370
//tanggal : Selasa, 10 Agustus 2021
public class MainModel {

    String title,description,url,address,latitude,longitude;

    MainModel()
    {

    }

    public MainModel(String title, String description, String url, String address, String latitude, String longitude) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
