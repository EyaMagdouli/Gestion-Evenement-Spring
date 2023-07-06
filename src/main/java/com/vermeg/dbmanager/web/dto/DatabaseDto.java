package com.vermeg.dbmanager.web.dto;

import java.util.Objects;

public class DatabaseDto {
	
	private String name;
	private String userName;
	private String fileName;
	private double size;
	private double maxSize;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getMaxSize() {
		return maxSize;
	}
	public void setMaxSize(double maxSize) {
		this.maxSize = maxSize;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fileName, maxSize, name, size, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DatabaseDto other = (DatabaseDto) obj;
		return Objects.equals(fileName, other.fileName)
				&& Double.doubleToLongBits(maxSize) == Double.doubleToLongBits(other.maxSize)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size)
				&& Objects.equals(userName, other.userName);
	}
	@Override
	public String toString() {
		return "DatabaseDto [name=" + name + ", userName=" + userName + ", fileName=" + fileName + ", size=" + size
				+ ", maxSize=" + maxSize + "]";
	}
	

	
}
