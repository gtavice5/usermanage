package com.jike.usermanage.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.jike.usermanage.exception.PhoneNotFound;
import com.jike.usermanage.exception.UserNotFound;
import com.jike.usermanage.model.Phone;
import com.jike.usermanage.model.User;

public interface PhoneService {
	
	public void addPhone(Phone phone);

	
		
}
