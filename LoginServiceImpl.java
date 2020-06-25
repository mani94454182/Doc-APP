package com.da.service;

import com.da.beans.LoginBeans;
import com.da.model.LoginModel;
import com.da.model.LoginModelImpl;

public class LoginServiceImpl implements LoginService {
	public String check(LoginBeans lb) {
		
		LoginModel lom = new LoginModelImpl();
        return lom.check(lb);
	}

	}