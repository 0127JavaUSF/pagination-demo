package com.revature.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Food;
import com.revature.services.FoodService;

@RestController
@RequestMapping("food")
public class FoodController {
	
	private FoodService foodService;
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<Food> createFood(@RequestBody @Valid Food food) {
		Food createdFood = foodService.create(food);
		return ResponseEntity
				.status(201)
				.body(createdFood);
	}

	@GetMapping
	public Page<Food> getFood(Pageable pageable) {
		return foodService.getFood(pageable);
	}
	
	@Autowired
	public FoodController(FoodService foodService) {
		super();
		this.foodService = foodService;
	}
	
}