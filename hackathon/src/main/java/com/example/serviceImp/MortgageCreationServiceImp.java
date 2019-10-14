package com.example.serviceImp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.UserDetailsDTO;
import com.example.model.UserDetailsDAO;
import com.example.repository.UserDetailsRepository;
import com.example.service.MortgageCreationService;

@Service
public class MortgageCreationServiceImp implements MortgageCreationService {

	private static final Logger LOGGER=LoggerFactory.getLogger(MortgageCreationServiceImp.class);
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	
	@Override
	public UserDetailsDTO AddMortgageUsers(UserDetailsDTO userDetails) {
		
		UserDetailsDAO userDetailsDAO=new UserDetailsDAO();
		
		if(userDetails!=null)
		{
			userDetailsDAO.setUserid(userDetails.getUserid());
			userDetailsDAO.setFname(userDetails.getFname());
			userDetailsDAO.setLname(userDetails.getLname());
			userDetailsDAO.setEmailid(userDetails.getEmailid());
			userDetailsDAO.setMobile(userDetails.getMobile());
			userDetailsDAO.setModeofemp(userDetails.getModeofemp());
			userDetailsDAO.setCompany(userDetails.getCompany());
			userDetailsDAO.setSalary(userDetails.getSalary());
			userDetailsDAO.setTypeofproperty(userDetails.getTypeofproperty());
			userDetailsDAO.setPlocation(userDetails.getPlocation());
			userDetailsDAO.setPname(userDetails.getPname());
			userDetailsDAO.setPvalue(userDetails.getPvalue());
			userDetailsDAO.setLoanamount(userDetails.getLoanamount());
			userDetailsDAO.setDeposit(userDetails.getDeposit());
			userDetailsRepository.save(userDetailsDAO);			
		}
		else
		{
			LOGGER.info("User Details are not saved, the values are Null");
		}
		
		// TODO Auto-generated method stub
		return userDetails;
	}

}
