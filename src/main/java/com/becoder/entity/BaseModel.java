package com.becoder.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {

	private Boolean isActive;

	private Boolean isDeleted;

	private Integer createdBy;

	//@CreatedDate
	//@Column(updatable = false)
	private Date createdOn;

	private Integer updatedBy;

	//@LastModifiedDate
	private Date updatedOn;
}
