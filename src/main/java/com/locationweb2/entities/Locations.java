package com.locationweb2.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Locations {
@Id
private long id;
private int code;
private String name;
private String type;
public long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Locations [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + "]";
}


}
