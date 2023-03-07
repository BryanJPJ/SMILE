package com.Smile.SMILE.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @Column(name = "dni", nullable = false)
    private Long dni;
    @Column(nullable = false, length = 45)
    private String name;

    public Patient(Long dni, String name, Profile profile) {
        this.dni = dni;
        this.name = name;
        this.profile = profile;
    }

    public Patient() {

    }

    public Long getId() {
        return dni;
    }

    public void setId(Long dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public List<Treatment> getTreatment() {
        return treatment;
    }

    public void setTreatment(List<Treatment> treatment) {
        this.treatment = treatment;
    }
    public void AddTreatments(Treatment treatment){
        this.treatment.add(treatment);
    }
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "patients_treatment", joinColumns = @JoinColumn(name = "patient_dni"), inverseJoinColumns = @JoinColumn(name = "treatment_id_treatment"))
    private List<Treatment> treatment;
    @OneToOne
    private Profile profile;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

}
