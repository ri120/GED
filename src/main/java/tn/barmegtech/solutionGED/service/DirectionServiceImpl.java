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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DirectionDto updateDirectionDto(DirectionDto directionDto) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
