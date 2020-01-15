package org.ex.mapstructtest.core.vertrag.kunde.lkbudget;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class LkBudgetKundenvertrag {
    private Long id;
    private String vertragsNummer;
    private Set<LkvLeistungskategorie> lkvLeistungskategorien;
}
