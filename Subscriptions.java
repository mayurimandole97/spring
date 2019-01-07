package com.test.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Subscriptions {
	@Id
	@GeneratedValue
public int subscriptionid;
private String title;

@ManyToMany(cascade=CascadeType.ALL,mappedBy="subscriptions")
private List<Reader> readers;

public int getSubscriptionid() {
	return subscriptionid;
}

public void setSubscriptionid(int subscriptionid) {
	this.subscriptionid = subscriptionid;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public List<Reader> getReaders() {
	return readers;
}

public void setReaders(List<Reader> readers) {
	this.readers = readers;
}

public Subscriptions(int subscriptionid, String title, List<Reader> readers) {
	super();
	this.subscriptionid = subscriptionid;
	this.title = title;
	this.readers = readers;
}

public Subscriptions() {
	super();
}

@Override
public String toString() {
	return "Subscriptions [subscriptionid=" + subscriptionid + ", title=" + title + ", readers=" + readers + "]";
}


}
