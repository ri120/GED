package tn.barmegtech.solutionGED.dto;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.barmegtech.solutionGED.entites.Direction;
import tn.barmegtech.solutionGED.entites.ThemDoc;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class DirectionDto {
	private Long id;
	private String titre;
	private String observation;
	
public static Direction toentity(DirectionDto request)
{
return Direction.builder()
		.id(request.getId())
		.titre(request.getTitre())
		.observation(request.getObservation())
		.build();

}
public static DirectionDto fromentity(Direction request)
{
return DirectionDto.builder()
		.id(request.getId())
		.titre(request.getTitre())
		.observation(request.getObservation())
		.build();

}


}