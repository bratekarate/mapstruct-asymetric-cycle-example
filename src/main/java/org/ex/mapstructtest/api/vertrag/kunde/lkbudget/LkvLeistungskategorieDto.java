package org.ex.mapstructtest.api.vertrag.kunde.lkbudget;

import lombok.*;
import org.ex.mapstructtest.api.vertrag.kunde.LeistungskategorieDto;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LkvLeistungskategorieDto {
    private LkBudgetKundenvertragDto lkBudgetKundenvertrag;
    private LeistungskategorieDto leistungskategorie;


}
