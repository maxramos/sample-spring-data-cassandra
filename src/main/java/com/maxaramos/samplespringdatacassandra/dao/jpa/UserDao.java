package com.maxaramos.samplespringdatacassandra.dao.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.RepositoryDefinition;

import com.maxaramos.samplespringdatacassandra.model.User;

@RepositoryDefinition(
		domainClass = User.class,
		idClass = Long.class)
public interface UserDao {

	List<User> findAll();

	Optional<User> findByUsername(String username);

}
