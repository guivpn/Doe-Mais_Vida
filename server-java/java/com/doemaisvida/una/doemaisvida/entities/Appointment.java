package com.doemaisvida.una.doemaisvida.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAppointment;

    @NotNull
    @Size(min = 2, max = 100)
    private String patientName;

    @NotNull
    private LocalDate appointmentDate;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    @NotNull
    private String cpf;

    @NotNull
    private String email;

    @NotNull
    private LocalDate birthDate;

    @NotNull
    private String phoneNumber;

    private LocalDateTime appointmentTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Appointment() {}

    public Appointment(String patientName, LocalDate appointmentDate, Hospital hospital, String cpf, String email, LocalDate birthDate, String phoneNumber, LocalDateTime appointmentTime, User user) {
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
        this.hospital = hospital;
        this.cpf = cpf;
        this.email = email;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.appointmentTime = appointmentTime;
        this.user = user;
    }

    public Long getId() {
        return idAppointment;
    }

    public void setId(Long id) {
        this.idAppointment = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getAppointmentTime() {return appointmentTime; }

    public void setAppointmentTime(LocalDateTime appointmentTime) {this.appointmentTime = appointmentTime; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(idAppointment, that.idAppointment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAppointment);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + idAppointment +
                ", patientName='" + patientName + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", appointmentTime=" + appointmentTime +
                ", hospital=" + hospital +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", user=" + user +
                '}';
    }
}
