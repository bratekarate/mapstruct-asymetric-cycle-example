package org.ex.mapstructtest.core.vertrag.kunde.lkbudget;

import lombok.Getter;
import lombok.Setter;
import org.ex.mapstructtest.core.vertrag.kunde.Leistungskategorie;

@Getter
@Setter
public class LkvLeistungskategorie {
    private Long id;
    private LkBudgetKundenvertrag lkBudgetKundenvertrag;
    private Leistungskategorie leistungskategorie;
}
