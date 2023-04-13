package com.vidyaviewer.it4045cgroup9.dao;

import org.springframework.data.repository.CrudRepository;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

public interface GameRepository extends CrudRepository<GameDTO, Integer> {

}
