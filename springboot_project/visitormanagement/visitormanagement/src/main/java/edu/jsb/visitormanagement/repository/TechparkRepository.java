package edu.jsb.visitormanagement.repository;

import java.util.List;
import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.jsb.visitormanagement.entity.Techpark;

public interface TechparkRepository extends JpaRepository<Techpark, Long> {

	// ========================= Custom Method ==============================
	
	// ! 1. Find By Name
	public Techpark findByvisitorName(String visitorName);

	// ! 2. Find By Status
	public List<Techpark> findBystatus(String status);

	// ! 3. Find By PhoneNumber
	public Techpark findByphoneNumber(String phoneNumber);
	
	// ! 4. Find By proofId
	public Techpark findByproofId(String proofId);
	
	
	
	// ========================== Custom Query ==============================
	
	
	// ! 5. Find Between CreateAt
	@Query("SELECT t FROM Techpark t WHERE t.createAt BETWEEN :start AND :end")
	public List<Techpark> findByCreateAtBetweenCustom(@Param("start") LocalDateTime start,@Param("end") LocalDateTime end);


	// ! 6.Find Between UpdatedAt
	@Query("SELECT t FROM Techpark t WHERE t.updatedAt BETWEEN :start AND :end")
	public List<Techpark> findByUpdatedAtBetweenCustom(@Param("start") LocalDateTime start,@Param("end") LocalDateTime end);



	// ! 7. FindAll Visitors
	@Query("SELECT t.visitorName FROM Techpark t")
	public List<String> findAllvisitors();

	// ! 8. FindAll CompanyName
	@Query("SELECT t.companyName FROM Techpark t")
	public List<String> findAllCompany();

}
