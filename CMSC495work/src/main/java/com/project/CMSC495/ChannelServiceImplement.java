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
 * Channels service implementation, defines the interactions between the controller and the channels table.
 */

@Transactional
@Service("ChannelService")
public class ChannelServiceImplement implements ChannelService{
	
	@Autowired
	ChannelRepository channelRepository;

	@Override
	public Iterable<Channels> getAllChannels() {
		return channelRepository.findAll();
	}
}
