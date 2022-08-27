package com.hotelapp.service;

import java.util.List;

import com.hotelapp.models.Hotel;

public interface HotelService {
Hotel addHotel(Hotel hotel);
void updateHotel(Hotel hotel);
Hotel getHotelById(int hotelId);
void deleteHotel(int hotelId);

List <Hotel> getHotelByCity(String city);
List <Hotel> getHotelByMenu(String menuName);
List <Hotel> getHotelByDelivery(String partnerName);
List <Hotel> getHotelByLocation(String location);
List <Hotel> getHotelByLocationAndMenu(String location,String menuName);
}
