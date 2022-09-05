package com.project.CMSC495;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author      Edward Owings <eddyo2@yahoo.com>
 * @version     4.3                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */


/**
 * Cost service implementation, defines the interactions between the controller and the cost table.
 */

@Transactional
@Service("CostService")
public class CostServiceImplement implements CostService{
	
	@Autowired
	CostRepository costRepository;

	@Override
	public Iterable<Cost> getAllCost() {
		return costRepository.findAll();
	}
}
