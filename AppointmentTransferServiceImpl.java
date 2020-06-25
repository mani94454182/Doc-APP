package com.da.service;

import com.da.beans.AppointmentTransferBeans;
import com.da.model.AppointmentTransferModel;
import com.da.model.AppointmentTransferModelImpl;

public class AppointmentTransferServiceImpl implements AppointmentTransferService {
	
	public boolean approve(AppointmentTransferBeans obj)
	{
		
		AppointmentTransferModel dam= new AppointmentTransferModelImpl();
		return dam.approve(obj);
		
	}
	

}
