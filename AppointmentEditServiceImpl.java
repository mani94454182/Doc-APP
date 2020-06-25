package com.da.service;

import java.util.List;

import com.da.beans.PatientRegisterBeans;
import com.da.model.AppointmentEditModel;
import com.da.model.AppointmentEditModelImpl;

public class AppointmentEditServiceImpl implements AppointmentEditService{
	public List<PatientRegisterBeans> editAppointment(){
		
		AppointmentEditModel aem = new AppointmentEditModelImpl();
		return aem.editAppointment();
	}
}
		

