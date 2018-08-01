package com.kaca.trackNotes.model;

import javax.persistence.*;


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


    public Link() {
    }

    public Link(String urlLink, boolean obrisan, String boja) {
        this.urlLink = urlLink;
        this.obrisan = obrisan;
        this.boja = boja;
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


    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", urlLink='" + urlLink + '\'' +
                ", obrisan=" + obrisan +
                ", boja='" + boja + '\'' +
                '}';
    }
}
