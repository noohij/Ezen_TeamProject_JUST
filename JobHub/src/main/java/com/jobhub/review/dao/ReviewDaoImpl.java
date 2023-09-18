package com.jobhub.review.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jobhub.review.dto.ReviewDto;

@Repository
public class ReviewDaoImpl implements ReviewDao {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	String namespace = "com.jobhub.review.";
	
	@Override
	public List<ReviewDto> reviewSelectList(int start, int end) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", start);
		map.put("end", end);
		
		return sqlSession.selectList("com.jobhub.review.reviewSelectList", map);
	}
	
	@Override
	public int reviewInsertOne(ReviewDto reviewDto) {
		
		return sqlSession.insert("com.jobhub.review.reviewInsertOne", reviewDto);
	}

	@Override
	public int reviewSelectTotalCount() {
		
		return (int)sqlSession.selectOne("com.jobhub.review.reviewSelectTotalCount");
	}

	
}
