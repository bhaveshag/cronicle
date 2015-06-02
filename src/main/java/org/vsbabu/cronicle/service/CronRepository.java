package org.vsbabu.cronicle.service;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.vsbabu.cronicle.domain.Cron;

//TODO: remove repositoryRestService and put our own custom service
@RepositoryRestResource(collectionResourceRel = "cron", path = "crons")
public interface CronRepository extends Repository<Cron, String> {

	Cron findById(String id);

	Cron save(Cron t);

	List<Cron> findAll();

	//FIXME: DELETE doesn't work; possibly because of one to many


}