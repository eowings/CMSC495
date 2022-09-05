package com.project.CMSC495;

import java.util.List;

import com.project.CMSC495.Channels;

/**
 * @author      Edward Owings <eddyo2@yahoo.com>
 * @version     4.3                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */


/**
 * Cost service, defines the interactions between the controller and the Cost table.
 */

public interface CostService {
	
	
	public Iterable<Cost> getAllCost();
	
}
