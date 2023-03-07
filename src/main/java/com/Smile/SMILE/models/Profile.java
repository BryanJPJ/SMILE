package com.Smile.SMILE.models;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "profilies")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "age")
    private int age;
    @Column(name = "phone")
    private int phone;
    @Column(name = "direction")
    private String direction;
    @Column(name = "id_treatment")
    private String id_treatment;
    @ManyToMany
    private List<Treatment> treatment;
    @ManyToOne(fetch =  FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_city", nullable = false)
    private City city;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_patient" ,referencedColumnName = "dni")
    private Patient patient;

    public Profile(Long id, City city, int age, int phone, String direction, String id_treatment, List<Treatment> treatment) {
        this.id = id;
        this.city = city;
        this.age = age;
        this.phone = phone;
        this.direction = direction;
        this.id_treatment = id_treatment;
        this.treatment = treatment;
    }

    
    public Profile() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getId_treatment() {
        return id_treatment;
    }

    public void setId_treatment(String id_treatment) {
        this.id_treatment = id_treatment;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


    public List<Treatment> getTreatment() {
        return treatment;
    }


    public void setTreatment(List<Treatment> treatment) {
        this.treatment = treatment;
    }

    
}
