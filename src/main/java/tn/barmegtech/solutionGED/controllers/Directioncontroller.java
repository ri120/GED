package tn.barmegtech.solutionGED.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import tn.barmegtech.solutionGED.dto.DirectionDto;
import tn.barmegtech.solutionGED.service.DirectionService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/Direction")
public class Directioncontroller {
private final DirectionService directionService;
@DeleteMapping("/delete/{id}")
public void delete(@PathVariable("id") Long id) {
	directionService.delete(id);
}
@GetMapping("/lister")
public List<DirectionDto> listeDirection() {
	return directionService.listeDirection();
}
@GetMapping("/getbyid/{id}")
public DirectionDto findByIdDirection(@PathVariable("id") Long id) {
	return directionService.findByIdDirection(id);
}
@PostMapping("/save")
public DirectionDto saveDirection(@RequestBody DirectionDto directionDto) {
	return directionService.saveDirection(directionDto);
}
@PostMapping("/update")
public DirectionDto updateDirectionDto(@RequestBody DirectionDto directionDto) {
	return directionService.updateDirectionDto(directionDto);
}


}
