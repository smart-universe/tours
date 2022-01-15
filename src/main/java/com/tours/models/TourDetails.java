package com.tours.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//We store all the tours details at some places 
/*
 * Tour Details :
 * 		last modified data
 * 		modified tour information 
 * 		as we intend to allow user to change
 *		  data it is better to have log table for this one 
 *
 * 		
 *	NEEDS DISCUSSION  
 * 
 */

@Entity
@Table(name = "tour_details")
public class TourDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long tourId;
	
	
	private String tourName;
	
	private Date createdOn;
	
	private Date startsOn;
	
	private Date endsON;
	
	private String createdBy;
}
