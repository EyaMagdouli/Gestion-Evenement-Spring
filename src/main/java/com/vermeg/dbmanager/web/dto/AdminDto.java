package com.vermeg.dbmanager.web.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class AdminDto {
	
	private String username;
	private String accountStatus;
	private LocalDateTime lastLogin;
	private LocalDate expiryDate;
	private String tablespace;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public LocalDateTime getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getTablespace() {
		return tablespace;
	}
	public void setTablespace(String tablespace) {
		this.tablespace = tablespace;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountStatus, expiryDate, lastLogin, tablespace, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdminDto other = (AdminDto) obj;
		return Objects.equals(accountStatus, other.accountStatus) && Objects.equals(expiryDate, other.expiryDate)
				&& Objects.equals(lastLogin, other.lastLogin) && Objects.equals(tablespace, other.tablespace)
				&& Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "UserDto [username=" + username + ", accountStatus=" + accountStatus + ", lastLogin=" + lastLogin
				+ ", expiryDate=" + expiryDate + ", tablespace=" + tablespace + "]";
	}
	
	
	
	
}
	
	
	
