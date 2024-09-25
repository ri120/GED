package tn.barmegtech.solutionGED.service;

import java.util.List;
import java.util.Optional;

import tn.barmegtech.solutionGED.dto.DirectionDto;
import tn.barmegtech.solutionGED.entites.Direction;



public interface DirectionService {
	void delete(Long id);
	List<DirectionDto> listeDirection ();
	DirectionDto findByIdDirection(Long id);
	DirectionDto saveDirection(DirectionDto directionDto);
	DirectionDto updateDirectionDto(DirectionDto directionDto);
	//List<Labelvalue> listeServicesDto();

}
