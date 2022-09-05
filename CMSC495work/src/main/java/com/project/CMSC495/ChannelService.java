package com.project.CMSC495;

import java.util.List;

import com.project.CMSC495.Channels;

/**
 * @author      Edward Owings <eddyo2@yahoo.com>
 * @version     4.3                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */


/**
 * Channels service, defines the interactions between the controller and the channels table.
 */

public interface ChannelService {
	
	
	public Iterable<Channels> getAllChannels();
	
}
