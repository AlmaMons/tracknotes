package com.kaca.trackNotes.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;


@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String naslov;

    @Column(nullable = false)
    private String tekst;

    @Column(nullable = false)
    private boolean obrisan;

    @Column(nullable = false)
    private String boja;


    public Note() {
    }

    public Note(String naslov, String tekst, boolean obrisan, String boja) {
        this.naslov = naslov;
        this.tekst = tekst;
        this.obrisan = obrisan;
        this.boja = boja;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
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
        return "Note{" +
                "id=" + id +
                ", nasov='" + naslov + '\'' +
                ", tekst='" + tekst + '\'' +
                ", obrisan=" + obrisan +
                ", boja='" + boja + '\'' +
                '}';
    }
}
