package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.revature.models.Food;
import com.revature.repositories.FoodRepository;

@Service
public class FoodService {

	
	private FoodRepository foodRepository;
	
	@Autowired
	public FoodService(FoodRepository foodRepository) {
		this.foodRepository = foodRepository;
	}

	public Food create(Food food) {
		return this.foodRepository.save(food);
	}

	public Page<Food> getFood(Pageable pageable) {
		return foodRepository.findAll(pageable);
	}

}
