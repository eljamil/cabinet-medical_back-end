package com.example.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Secretaire {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
	   private String type;
	   @Temporal(TemporalType.DATE)
		@DateTimeFormat(pattern =  "yyyy-MM-dd")
		private Date date_val;

}
