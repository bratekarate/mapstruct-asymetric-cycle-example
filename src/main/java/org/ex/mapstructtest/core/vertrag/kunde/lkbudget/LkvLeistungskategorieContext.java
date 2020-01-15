package org.ex.mapstructtest.core.vertrag.kunde.lkbudget;

import lombok.Getter;
import org.ex.mapstructtest.api.vertrag.kunde.lkbudget.LkBudgetKundenvertragDto;
import org.mapstruct.BeforeMapping;

@Getter
public class LkvLeistungskategorieContext {

    private LkBudgetKundenvertragDto lkBudgetKundenvertragDto;

    @BeforeMapping
    public void setLkBudgetKundenvertragDto(LkBudgetKundenvertragDto lkBudgetKundenvertragDto) {
        this.lkBudgetKundenvertragDto = lkBudgetKundenvertragDto;
    }

}
