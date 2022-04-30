package jp.co.cutedogs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.cutedogs.entity.Dog;

@Mapper
public interface DogMapper {

	public List<Dog> selectAll();

}
