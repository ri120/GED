package tn.barmegtech.solutionGED.entites;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Direction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String titre;
private String observation;
@ManyToMany(mappedBy = "directions")
private List<ThemDoc> themDocs;

}
