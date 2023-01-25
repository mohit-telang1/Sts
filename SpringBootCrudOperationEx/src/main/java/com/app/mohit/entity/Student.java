package com.app.mohit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


	
	@Data
	@Entity
	@Table(name="stdtab")
	public class Student {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="sid")
		private Integer stdId;

		@Column(name="sname")
		private String stdName;
		
		@Column(name="sgen")
		private String stdGen;
		
		@Column(name="scourse")
		private String stdCourse;
		
		@Column(name="saddr")
		private String stdAddr;

		public Integer getStdId() {
			return stdId;
		}

		public void setStdId(Integer stdId) {
			this.stdId = stdId;
		}

		public String getStdName() {
			return stdName;
		}

		public void setStdName(String stdName) {
			this.stdName = stdName;
		}

		public String getStdGen() {
			return stdGen;
		}

		public void setStdGen(String stdGen) {
			this.stdGen = stdGen;
		}

		public String getStdCourse() {
			return stdCourse;
		}

		public void setStdCourse(String stdCourse) {
			this.stdCourse = stdCourse;
		}

		public String getStdAddr() {
			return stdAddr;
		}

		public void setStdAddr(String stdAddr) {
			this.stdAddr = stdAddr;
		}

		@Override
		public String toString() {
			return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdGen=" + stdGen + ", stdCourse="
					+ stdCourse + ", stdAddr=" + stdAddr + "]";
		}

		public Student() {
			super();
		}
		
		
	}

