package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelapp.models.Menu;
@Repository
public interface MenulRepository extends JpaRepository<Menu, Integer> {

	//derived Query
	//List<Menu>findByHotelHotelName(String hotelName);
	
	//@Query with JPQL
//	@Query("FROM Menu m INNER jOIN m.hotel h Where h.hotelName=?1")
//	List <Menu> findByHotel(String hotelName);
	
	//@Query with SQL native query
	@Query(value ="Select * from menu m inner join hotel h on m.hotel_id=h.hotel_id where h.hotel_name=?1",nativeQuery=true)
	List<Menu> findByHotel(String hotelName);
	
	
}
