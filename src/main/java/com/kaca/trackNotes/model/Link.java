package com.kaca.trackNotes.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String urlLink;

    @Column(nullable = false)
    private boolean obrisan;

    @Column(nullable = false)
    private String boja;

    @Column(nullable = false)
    private Date datumUnosa;

    public Link() {
    }

    public Link(String urlLink, boolean obrisan, String boja, Date datumUnosa) {
        this.urlLink = urlLink;
        this.obrisan = obrisan;
        this.boja = boja;
        this.datumUnosa = datumUnosa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrlLink() {
        return urlLink;
    }

    public void setUrlLink(String urlLink) {
        this.urlLink = urlLink;
    }

    public boolean isObrisan() {
        return obrisan;
    }

    public void setObrisan(boolean obrisan) {
        this.obrisan = obrisan;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public Date getDatumUnosa() {
        return datumUnosa;
    }

    public void setDatumUnosa(Date datumUnosa) {
        this.datumUnosa = datumUnosa;
    }

    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", urlLink='" + urlLink + '\'' +
                ", obrisan=" + obrisan +
                ", boja='" + boja + '\'' +
                ", datumUnosa=" + datumUnosa +
                '}';
    }
}
