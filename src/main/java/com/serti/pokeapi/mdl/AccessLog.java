package com.serti.pokeapi.mdl;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accessLog")
public class AccessLog  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int idaccesslog;
	private String resource;
	private String client;
	public int getIdaccesslog() {
		return idaccesslog;
	}
	public void setIdaccesslog(int idaccesslog) {
		this.idaccesslog = idaccesslog;
	}
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "AccessLog [idaccesslog=" + idaccesslog + ", resource=" + resource + ", client=" + client + "]";
	}
	
	
	
}
	
