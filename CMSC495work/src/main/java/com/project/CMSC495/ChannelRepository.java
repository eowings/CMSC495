package com.project.CMSC495;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author      Edward Owings <eddyo2@yahoo.com>
 * @version     4.3                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */


/**
 * Channel repository, sets the method used to communicate with the Channels table within database.
 */

@Repository("ChannelRepository")
public interface ChannelRepository extends CrudRepository<Channels, Integer> {
}
