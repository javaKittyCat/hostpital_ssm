package com.hospital_ssm.service;

import java.util.List;

import com.hospital_ssm.pojo.Patient;

public interface PatientService {
	//依据id的五个基本方法
	public int addPatient(Patient patient) ;
	public int deletePatient(Integer id);
	public int updatePatient(Patient patient);
	public Patient selectOne(Integer id);
	public List<Patient> findAll() ;
	
	//根据姓名查找患者的方法
	public Patient selectOneByName(String name);
	public String chcekpassword(String name,String password);
	
	//找回密码的认证主方法(findPwk)
	public Patient findPwdCheck(String name,String email);
	//根据id和键入的password 修改对应id患者的密码(findPwk)
	public int updatePatientPassword(String id,String password);
}
