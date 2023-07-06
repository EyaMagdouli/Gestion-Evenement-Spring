package com.vermeg.dbmanager.model.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DBA_DATA_FILES")
public class Tablespace {

	@Id
	@Column(name = "FILE_ID")
	private String fileId;
	
	@Column(name = "FILE_NAME")
	private String fileName;
	
	@Column(name = "TABLESPACE_NAME")
	private String tablespaceName;
	
	private double bytes;
	
	private String status;
	
	@Column(name = "MAXBYTES")
	private double maxBytes;

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTablespaceName() {
		return tablespaceName;
	}

	public void setTablespaceName(String tablespaceName) {
		this.tablespaceName = tablespaceName;
	}

	public double getBytes() {
		return bytes;
	}

	public void setBytes(double bytes) {
		this.bytes = bytes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getMaxBytes() {
		return maxBytes;
	}

	public void setMaxBytes(double maxBytes) {
		this.maxBytes = maxBytes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bytes, fileId, fileName, maxBytes, status, tablespaceName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tablespace other = (Tablespace) obj;
		return Objects.equals(bytes, other.bytes) && Objects.equals(fileId, other.fileId)
				&& Objects.equals(fileName, other.fileName) && Objects.equals(maxBytes, other.maxBytes)
				&& Objects.equals(status, other.status) && Objects.equals(tablespaceName, other.tablespaceName);
	}

	@Override
	public String toString() {
		return "TableSpace [fileId=" + fileId + ", fileName=" + fileName + ", tablespaceName=" + tablespaceName
				+ ", bytes=" + bytes + ", status=" + status + ", maxBytes=" + maxBytes + "]";
	}
	
	
	
}
