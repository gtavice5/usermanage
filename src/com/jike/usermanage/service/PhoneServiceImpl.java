package com.jike.usermanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.jike.usermanage.exception.PhoneNotFound;
import com.jike.usermanage.exception.UserNotFound;
import com.jike.usermanage.model.Phone;
import com.jike.usermanage.model.User;
import com.jike.usermanage.repository.PhoneRepository;


@Service("phoneService")
public class PhoneServiceImpl implements PhoneService {
	
	@Autowired
	private PhoneRepository phoneRepository;

	public void addPhone(Phone phone){
		phoneRepository.save(phone);
		
		
	}
	
	
		
}
