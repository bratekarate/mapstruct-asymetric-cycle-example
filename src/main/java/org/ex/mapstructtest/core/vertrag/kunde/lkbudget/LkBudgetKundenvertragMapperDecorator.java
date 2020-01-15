package org.ex.mapstructtest.core.vertrag.kunde.lkbudget;

import lombok.Setter;
import org.ex.mapstructtest.api.vertrag.kunde.LeistungskategorieDto;
import org.ex.mapstructtest.api.vertrag.kunde.lkbudget.LkvLeistungskategorieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class LkBudgetKundenvertragMapperDecorator implements LkBudgetKundenVertragMapper {

    @Autowired
    @Qualifier("delegate")
    private LkBudgetKundenVertragMapper delegate;

    @Override
    public LkvLeistungskategorie toDbo(LeistungskategorieDto dto, LkvLeistungskategorieContext ctx, CycleAvoidingContext ctxx) {
        LkvLeistungskategorieDto lkvLeistungskategorieDto = new LkvLeistungskategorieDto(ctx.getLkBudgetKundenvertragDto(), dto);
        return delegate.toDbo(lkvLeistungskategorieDto, ctx, ctxx);
    }

}
