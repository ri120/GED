package tn.barmegtech.solutionGED.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tn.barmegtech.solutionGED.dto.DirectionDto;
import tn.barmegtech.solutionGED.entites.Direction;
import tn.barmegtech.solutionGED.repository.DirectionRepository;

@Service
@RequiredArgsConstructor
public class DirectionServiceImpl implements DirectionService {
private final DirectionRepository directionRepository;
	@Override
	public void delete(Long id) {
		Optional<Direction> optionalDirection=directionRepository.findById(id);
		if(optionalDirection.isPresent())
		{
			directionRepository.delete(optionalDirection.get());
		}
		else
		{
			throw new RuntimeException("not found");
		}

	}

	@Override
	public List<DirectionDto> listeDirection() {
		return directionRepository.findAll().stream()
                .map(DirectionDto::fromentity)
                .collect(Collectors.toList());
	}
	

	@Override
	public DirectionDto findByIdDirection(Long id) {
		Optional<Direction> optionalDirection=directionRepository.findById(id);
		if(optionalDirection.isPresent())
		{
			return  DirectionDto.fromentity(optionalDirection.get());
		}
		else
		{
			throw new RuntimeException("not found");
		}
	}

	@Override
	public DirectionDto saveDirection(DirectionDto directionDto) {
		Direction direction=DirectionDto.toentity(directionDto);
		Direction directionsved=directionRepository.save(direction);
		DirectionDto directiondto=DirectionDto.fromentity(directionsved);
		return directiondto;
	}

	@Override
	public DirectionDto updateDirectionDto(DirectionDto directionDto) {
		Optional<Direction> optionalDirection=directionRepository.findById(directionDto.getId());
		
		
		if(optionalDirection.isPresent())
		{
			Direction direction=DirectionDto.toentity(directionDto);
			optionalDirection.get().setTitre(direction.getTitre());
			optionalDirection.get().setObservation(direction.getObservation());
			return DirectionDto.fromentity(directionRepository.save(optionalDirection.get())) ;
		  
		}
		else
		{
			throw new RuntimeException("not found");
		}
	}

	

}
