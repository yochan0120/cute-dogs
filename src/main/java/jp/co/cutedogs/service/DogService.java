package jp.co.cutedogs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.cutedogs.entity.Dog;
import jp.co.cutedogs.mapper.DogMapper;

@Service
public class DogService {

	@Autowired
	DogMapper mapper;

	public List<Dog> getDogList() {
		return mapper.selectAll();
	}

}
