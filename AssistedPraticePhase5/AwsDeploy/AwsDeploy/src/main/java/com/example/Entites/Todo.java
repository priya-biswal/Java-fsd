package com.example.Entites;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="todo")
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
public int id;
public String title;
public String description;
public String status;
public String username;
public Object getTitle() {
	// TODO Auto-generated method stub
	return null;
}
public Object getDescription() {
	// TODO Auto-generated method stub
	return null;
}
public void setTitle(Object title2) {
	// TODO Auto-generated method stub
	
}
public void setDescription(Object description2) {
	// TODO Auto-generated method stub
	
}
public Object getStatus() {
	// TODO Auto-generated method stub
	return null;
}
public Object getUsername() {
	// TODO Auto-generated method stub
	return null;
}
public void setStatus(Object status2) {
	// TODO Auto-generated method stub
	
}
public void setUsername(Object username2) {
	// TODO Auto-generated method stub
	
}


	}


