package com.example.spring.persistance.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_users")
public class Admin {

	@Id
	@Column(name = "USER_ID")
	private long id;

	private String username;

	@Column(name = "default_tablespace")
	private String tablespace;

	private String password;

	@Column(name = "account_status")
	private String accountStatus;

	@Column(name = "expiry_date")
	private LocalDate expiryDate;

	@Column(name = "lock_date")
	private LocalDate lockDate;

	@Column(name = "last_login")
	private LocalDateTime lastLogin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTablespace() {
		return tablespace;
	}

	public void setTablespace(String tablespace) {
		this.tablespace = tablespace;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public LocalDate getLockDate() {
		return lockDate;
	}

	public void setLockDate(LocalDate lockDate) {
		this.lockDate = lockDate;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountStatus, expiryDate, id, lastLogin, lockDate, password, tablespace, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(accountStatus, other.accountStatus) && Objects.equals(expiryDate, other.expiryDate)
				&& id == other.id && Objects.equals(lastLogin, other.lastLogin)
				&& Objects.equals(lockDate, other.lockDate) && Objects.equals(password, other.password)
				&& Objects.equals(tablespace, other.tablespace) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", tablespace=" + tablespace + ", password=" + password
				+ ", accountStatus=" + accountStatus + ", expiryDate=" + expiryDate + ", lockDate=" + lockDate
				+ ", lastLogin=" + lastLogin + "]";
	}

}
