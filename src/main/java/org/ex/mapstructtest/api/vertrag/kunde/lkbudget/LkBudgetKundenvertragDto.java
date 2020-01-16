package org.ex.mapstructtest.api.vertrag.kunde.lkbudget;

import lombok.*;
import org.ex.mapstructtest.api.vertrag.kunde.LeistungskategorieDto;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LkBudgetKundenvertragDto {
    private Long id;
    private String vertragsNummer;
    private Set<LeistungskategorieDto> leistungskategorien;
}
