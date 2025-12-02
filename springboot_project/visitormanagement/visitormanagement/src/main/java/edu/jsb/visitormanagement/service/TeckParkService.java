package edu.jsb.visitormanagement.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.jsb.visitormanagement.entity.Techpark;
import edu.jsb.visitormanagement.repository.TechparkRepository;
import java.time.LocalDateTime;

@Service
public class TeckParkService {

	@Autowired
	public TechparkRepository techparkrepository;

	// ! 1. Insert
	public Techpark saveData(Techpark tech) {
		return techparkrepository.save(tech);
	}

	// ! 2. FetchAll
	public List<Techpark> fetchAll() {
		return techparkrepository.findAll();
	}

	// ! 3. FindById

	public Techpark fetchById(long id) {
		return techparkrepository.findById(id).orElse(null);

	}

	// ! 5. DeleteById

	public String deleteById(long id) {
		Optional<Techpark> o1 = techparkrepository.findById(id);

		if (o1.isPresent()) {
			techparkrepository.deleteById(id);
			return "Data Deleted Successfully";
		} else {
			return "Invalid Id Data is Not Found";
		}

	}

	// ! 6. FindByName

	public Techpark fetchByvisitorName(String visitorname) {
		return techparkrepository.findByvisitorName(visitorname);
	}

	// ! 7.Update

	public String update(long id, Techpark tech) {
		Optional<Techpark> t = techparkrepository.findById(id);

		if (t.isPresent()) {
			Techpark old = t.get();

			old.setProofId(tech.getProofId());
			old.setCompanyName(tech.getCompanyName());
			old.setCreateAt(tech.getCreateAt());
			old.setInTime(tech.getInTime());
			old.setPhoneNumber(tech.getPhoneNumber());
			old.setPurpose(tech.getPurpose());
			old.setUpdatedAt(tech.getUpdatedAt());
			old.setVisitorName(tech.getVisitorName());
			old.setStatus(tech.getStatus());
			old.setOutTime(tech.getOutTime());
			old.setVisitorid(tech.getVisitorid());
			old.setVisitorPerson(tech.getVisitorPerson());

			techparkrepository.save(old);

			return "Data Updated Successfully";
		} else {
			return "Invalid ID";
		}
	}

	// ! 8. deleteAll

	public String deleteAllentity() {
		techparkrepository.deleteAll();
		return "All Records Deleted Sucessfully";
	}

	// ! 9. findBystatus

	public List<Techpark> fetchBystatus(String status) {
		return techparkrepository.findBystatus(status);
	}

	// ! 10. findByPhoneNumber

	public Techpark fetchByPhoneNumber(String phoneNumber) {
		return techparkrepository.findByphoneNumber(phoneNumber);
	}

	// ! 11. FindAllVisitors
	public List<String> fetchAllvisitors() {
		return techparkrepository.findAllvisitors();
	}

	// ! 12.FindAllCompany
	public List<String> fetchAllCompanyName() {
		return techparkrepository.findAllCompany();
	}

	// ! 13.findByProofId

	public Techpark fetchByProofId(String proofId) {
		return techparkrepository.findByproofId(proofId);
	}

	// ! 14. findBycreateAt
	public List<Techpark> fetchByCreatedAtRange(LocalDateTime start, LocalDateTime end) {
		return techparkrepository.findByCreateAtBetweenCustom(start, end);
	}

	// ! 15.findByupdatedAt
	public List<Techpark> fetchByUpdatedAtRange(LocalDateTime start, LocalDateTime end) {
		return techparkrepository.findByUpdatedAtBetweenCustom(start, end);
	}

}
