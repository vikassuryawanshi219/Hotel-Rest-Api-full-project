package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.models.Menu;
import com.hotelapp.repository.MenulRepository;
@Service

public class MenuServiceImpl implements MenuService {
	@Autowired
    MenulRepository menuRepository;
	@Override
	public List<Menu> getMenusByHotel(String hotelName) {
		
		return menuRepository.findByHotel(hotelName);
	}

}
