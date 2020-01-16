package org.ex.mapstructtest.core.vertrag.kunde.lkbudget;

import lombok.*;
import org.ex.mapstructtest.core.vertrag.kunde.Leistungskategorie;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LkvLeistungskategorie {
    private Long id;
    private LkBudgetKundenvertrag lkBudgetKundenvertrag;
    private Leistungskategorie leistungskategorie;
}
