package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.models.Address;
import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;
import com.hotelapp.service.DeliveryService;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.MenuService;

@SpringBootApplication
public class SpringHotelappRestapiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappRestapiApplication.class, args);
	}
	
	@Autowired
	HotelService hotelService;
	
	@Autowired
	DeliveryService deliveryService;
	
	@Autowired
	MenuService menuService;
	
	@Override
	public void run(String... args) throws Exception {
//		Address address=new Address("JP Nagar","Bangalore", 567889, "kar");
//		Menu menu1= new Menu("idli", 20) ;
//		Menu menu2= new Menu("Pizza", 120) ;
//		Set<Menu> menuList=new HashSet<>(Arrays.asList(menu1,menu2));
//		Delivery del1=new Delivery("Zomato", 120);
//		Delivery del2=new Delivery("Swiggy", 130);
//		Set<Delivery> deliveryList=new HashSet<>(Arrays.asList(del1,del2));
//		Hotel hotel=new Hotel("The Cortage", address, menuList, deliveryList);
//		hotelService.addHotel(hotel);
//		
//		Address address=new Address("Mejestic","Bangalore", 567889, "kar");
//		Menu menu1= new Menu("idli", 530) ;
//		Menu menu2= new Menu("Pasta", 120) ;
//		Set<Menu> menuList=new HashSet<>(Arrays.asList(menu1,menu2));
//		Delivery del1=deliveryService.getDeliveryByPartner("Zomato");
//		
//		Set<Delivery> deliveryList=new HashSet<>(Arrays.asList(del1));
//		Hotel hotel=new Hotel("The Cortage", address, menuList, deliveryList);
//		hotelService.addHotel(hotel);
//		
		
		
//		Hotel hotel= hotelService.getHotelById(2);
//		System.out.println(hotel);
//		hotel.getAddress().setCity("Bhopal");
//		hotelService.updateHotel(hotel);
//		hotel= hotelService.getHotelById(2);
//		System.out.println(hotel);
//		
		
//		hotelService.getHotelByCity("Bangalore")
//		.stream()
//		.forEach((h)->System.out.println(h.getHotelName()+h.getAddress().getCity()));
//		System.out.println();
//		
//		hotelService.getHotelByLocation("BTM")
//		.stream()
//		.forEach((h)->System.out.println(h.getHotelName()+h.getMenuList()));
	
//		hotelService.getHotelByMenu("idli")
//		.stream()
//		.forEach((h)->System.out.println(h.getHotelName()+" "+h.getAddress().getStreetName()));
//		System.out.println();
//		
//		hotelService.getHotelByDelivery("Swiggy")
//		.stream()
//		.forEach((h)->System.out.println(h.getHotelName()+" "+h.getAddress().getStreetName()));
//	
//		hotelService.getHotelByLocationAndMenu("JP nagar", "idli")
//		.forEach((h)->System.out.println(h.getHotelName()+" "+h.getAddress().getCity()));
//		
//		
//		menuService.getMenusByHotel("Taj")
//		.forEach((m)->System.out.println(m.getMenuName()+" "+m.getPrice()));
	}

}
