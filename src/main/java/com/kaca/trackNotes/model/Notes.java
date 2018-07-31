package com.kaca.trackNotes.model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nasov;

    @Column(nullable = false)
    private String tekst;

    @Column(nullable = false)
    private boolean obrisan;

    @Column(nullable = false)
    private String boja;

    @Column(nullable = false)
    private Date datumUnosa;

    public Notes() {
    }

    public Notes(String nasov, String tekst, boolean obrisan, String boja, Date datumUnosa) {
        this.nasov = nasov;
        this.tekst = tekst;
        this.obrisan = obrisan;
        this.boja = boja;
        this.datumUnosa=datumUnosa;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNasov(String nasov) {
        this.nasov = nasov;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public void setObrisan(boolean obrisan) {
        this.obrisan = obrisan;
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
        return "Notes{" +
                "id=" + id +
                ", nasov='" + nasov + '\'' +
                ", tekst='" + tekst + '\'' +
                ", obrisan=" + obrisan +
                ", boja='" + boja + '\'' +
                ", datumUnosa=" + datumUnosa +
                '}';
    }
}
