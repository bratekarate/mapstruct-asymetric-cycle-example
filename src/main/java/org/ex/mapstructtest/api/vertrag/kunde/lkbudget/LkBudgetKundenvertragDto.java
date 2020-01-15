package org.ex.mapstructtest.api.vertrag.kunde.lkbudget;

import lombok.Getter;
import lombok.Setter;
import org.ex.mapstructtest.api.vertrag.kunde.LeistungskategorieDto;
import org.ex.mapstructtest.core.vertrag.kunde.Leistungskategorie;

import java.util.Set;

@Getter
@Setter
public class LkBudgetKundenvertragDto {
    private Long id;
    private String vertragsNummer;
    private Set<LeistungskategorieDto> leistungskategorien;
}
