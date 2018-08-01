package com.kaca.trackNotes.model;

import javax.persistence.*;


@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (nullable = false)
    private String urlImg;

    @Column (nullable = false)
    private boolean obrisan;


    public Image() {
    }

    public Image(String urlImg, boolean obrisan) {
        this.urlImg = urlImg;
        this.obrisan = obrisan;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public boolean isObrisan() {
        return obrisan;
    }

    public void setObrisan(boolean obrisan) {
        this.obrisan = obrisan;
    }



    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", urlImg='" + urlImg + '\'' +
                ", obrisan=" + obrisan + '\'' +
                '}';
    }
}
