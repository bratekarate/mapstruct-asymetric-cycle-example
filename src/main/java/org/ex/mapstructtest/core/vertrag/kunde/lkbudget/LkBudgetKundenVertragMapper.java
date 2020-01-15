package org.ex.mapstructtest.core.vertrag.kunde.lkbudget;

import org.ex.mapstructtest.api.vertrag.kunde.LeistungskategorieDto;
import org.ex.mapstructtest.api.vertrag.kunde.lkbudget.LkBudgetKundenvertragDto;
import org.ex.mapstructtest.api.vertrag.kunde.lkbudget.LkvLeistungskategorieDto;
import org.ex.mapstructtest.core.vertrag.kunde.LeistungskategorieMapper;
import org.mapstruct.*;

import java.util.Set;

@Mapper(unmappedSourcePolicy = ReportingPolicy.ERROR, uses = LeistungskategorieMapper.class)
public abstract class LkBudgetKundenVertragMapper {
    @Mappings({
            @Mapping(target = "lkvLeistungskategorien", source = "dto.leistungskategorien")
    })
    public abstract LkBudgetKundenvertrag toDbo(LkBudgetKundenvertragDto dto,
                                                @Context LkvLeistungskategorieContext lkvlkCtx,
                                                @Context CycleAvoidingContext cycleCtx);

    public abstract Set<LkvLeistungskategorie> toDbo(Set<LeistungskategorieDto> dto,
                                                     @Context LkvLeistungskategorieContext lkvlkCtx,
                                                     @Context CycleAvoidingContext cycleCtx);

    @Mapping(target = "id", ignore = true)
    public abstract LkvLeistungskategorie toDbo(LkvLeistungskategorieDto dto,
                                                @Context LkvLeistungskategorieContext lkvlklkvlkCtx,
                                                @Context CycleAvoidingContext cycleCtx);

    public LkvLeistungskategorie toDbo(LeistungskategorieDto dto,
                                       @Context LkvLeistungskategorieContext lkvlkCtx,
                                       @Context CycleAvoidingContext cycleCtx) {
        var lkvLeistungskategorieDto = new LkvLeistungskategorieDto(lkvlkCtx.getLkBudgetKundenvertragDto(), dto);
        return toDbo(lkvLeistungskategorieDto, lkvlkCtx, cycleCtx);
    }
}
