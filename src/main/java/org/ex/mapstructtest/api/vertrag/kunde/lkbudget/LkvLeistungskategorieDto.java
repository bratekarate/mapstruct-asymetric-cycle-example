package org.ex.mapstructtest.api.vertrag.kunde.lkbudget;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.ex.mapstructtest.api.vertrag.kunde.LeistungskategorieDto;

@Getter
@Setter
@AllArgsConstructor
public class LkvLeistungskategorieDto {
    private LkBudgetKundenvertragDto lkBudgetKundenvertrag;
    private LeistungskategorieDto leistungskategorie;


}
