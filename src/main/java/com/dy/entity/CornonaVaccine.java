package com.dy.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;



@Entity
@Table(name="Corona_Vacc_Tab")
@Data
//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CornonaVaccine implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long RegNo;
	@Column(length = 20)
	private String VaccineName;
	@Column(length = 20)
	private String CompanyName;
	@Column(length = 20)
	private String Country;
	private Double Amount;
	private Integer dose;
	
	public CornonaVaccine(Long regNo, String vaccineName, String companyName, String country, Double amount,
			Integer dose) {
		
		this.RegNo = regNo;
		this.VaccineName = vaccineName;
		this.CompanyName = companyName;
		this.Country = country;
		this.Amount = amount;
		this.dose = dose;
	}


	public CornonaVaccine() {
		
	}
	public Long getRegNo() {
		return RegNo;
	}

	public void setRegNo(Long regNo) {
		RegNo = regNo;
	}

	public String getVaccineName() {
		return VaccineName;
	}

	public void setVaccineName(String vaccineName) {
		VaccineName = vaccineName;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double amount) {
		Amount = amount;
	}

	public Integer getDose() {
		return dose;
	}

	public void setDose(Integer dose) {
		this.dose = dose;
	}


	@Override
	public String toString() {
		return "CornonaVaccine [RegNo=" + RegNo + ", VaccineName=" + VaccineName + ", CompanyName=" + CompanyName
				+ ", Country=" + Country + ", Amount=" + Amount + ", dose=" + dose + "]";
	}
	

	

}
