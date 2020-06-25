package com.da.service;

import com.da.beans.AppointmentFixBeans;
import com.da.model.DoctorAppointmentModel;
import com.da.model.DoctorAppointmentModelImpl;


public class DoctorAppointmentServiceImpl implements DoctorAppointmentService {
	public boolean addAppointment(AppointmentFixBeans obj)
	{
		DoctorAppointmentModel dam = new DoctorAppointmentModelImpl();
		return dam.addAppointment(obj);
	}
}
