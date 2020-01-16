package org.ex.mapstructtest.core.vertrag.kunde.lkbudget;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LkBudgetKundenvertrag {
    private Long id;
    private String vertragsNummer;
    private Set<LkvLeistungskategorie> lkvLeistungskategorien;
}
