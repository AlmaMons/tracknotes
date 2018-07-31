package com.kaca.trackNotes.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Images {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (nullable = false)
    private String urlImg;

    @Column (nullable = false)
    private boolean obrisan;

    @Column (nullable = false)
    private Date datumUnosa;

    public Images() {
    }

    public Images(String urlImg, boolean obrisan, Date datumUnosa) {
        this.urlImg = urlImg;
        this.obrisan = obrisan;
        this.datumUnosa=datumUnosa;
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

    public Date getDatumUnosa() {
        return datumUnosa;
    }

    public void setDatumUnosa(Date datumUnosa) {
        this.datumUnosa = datumUnosa;
    }

    @Override
    public String toString() {
        return "Images{" +
                "id=" + id +
                ", urlImg='" + urlImg + '\'' +
                ", obrisan=" + obrisan + '\'' +
                ", datum unosa=" + datumUnosa+
                '}';
    }
}
