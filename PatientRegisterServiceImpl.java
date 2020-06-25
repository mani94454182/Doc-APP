package com.da.service;

import com.da.beans.PatientRegisterBeans;
import com.da.model.PatientRegisterModel;
import com.da.model.PatientRegisterModelImpl;


public class PatientRegisterServiceImpl implements PatientRegisterService {
	public boolean addPatient(PatientRegisterBeans obj)
	{
		PatientRegisterModel dam = new PatientRegisterModelImpl();
		return dam.addPatient(obj);
	}
}
