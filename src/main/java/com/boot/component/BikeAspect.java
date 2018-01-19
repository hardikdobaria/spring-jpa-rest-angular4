package com.boot.component;



import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.boot.model.Bike;

@Aspect
@Component
public class BikeAspect{
	
	@Before("execution(* getDetailsofBike())")
    public void beforeSampleCreation() {
		System.out.println("###############@Before###############");
      System.out.println("Before request was issued for a sample name: ");
    }
	
	@After("execution(* getDetailsofBike())")
    public void afterSampleCreation() {
		System.out.println("###############@After###############");
      System.out.println("After request was issued for a sample name: ");
    }

	

}
