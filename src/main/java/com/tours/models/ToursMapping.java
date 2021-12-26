package com.tours.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * this table will be having mapping of users with the tours in Tours table 
 */

@Entity
@Table(name = "tour_mapping")
public class ToursMapping {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long mappingId;
	
	private Long tourId;

	private Long userId;

	private Date addedOn;

}
