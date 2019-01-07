package com.test.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Reader {
@Id
@GeneratedValue
private int readerid;
private String email;
private String firstname;

@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="Reader_Sub",
joinColumns= {@JoinColumn(name="ReaderID",referencedColumnName="readerid")},
inverseJoinColumns= {@JoinColumn(name="SubscriptionId",referencedColumnName="subscriptionid")})
private List<Subscriptions> subscriptions;

public int getReaderid() {
	return readerid;
}

public void setReaderid(int readerid) {
	this.readerid = readerid;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public List<Subscriptions> getSubscriptions() {
	return subscriptions;
}

public void setSubscriptions(List<Subscriptions> subscriptions) {
	this.subscriptions = subscriptions;
}

@Override
public String toString() {
	return "Reader [readerid=" + readerid + ", email=" + email + ", firstname=" + firstname + ", subscriptions="
			+ subscriptions + "]";
}

public Reader(int readerid, String email, String firstname, List<Subscriptions> subscriptions) {
	super();
	this.readerid = readerid;
	this.email = email;
	this.firstname = firstname;
	this.subscriptions = subscriptions;
}

public Reader() {
	super();
}


}
