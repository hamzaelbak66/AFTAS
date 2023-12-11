package champ.fish.Aftas.Models.DTO.Level;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public final class LevelDTO {
    private int code;

    @NotBlank(message = "Description can't be Null")
    private String description;

    @NotBlank(message = "points can't be Null")
    private int points;
}