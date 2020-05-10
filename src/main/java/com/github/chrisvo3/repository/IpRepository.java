package com.github.chrisvo3.repository;

import com.github.chrisvo3.model.IpAdress;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vochr
 * 09 May 2020 at 22 : 56
 *
 * @package com.github.chrisvo3.repository
 * @project geolocation
 */

public interface IpRepository extends CrudRepository<IpAdress, Long> {
}
