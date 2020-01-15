package org.ex.mapstructtest.core.vertrag.kunde.lkbudget;

import org.ex.mapstructtest.api.vertrag.kunde.LeistungskategorieDto;
import org.ex.mapstructtest.api.vertrag.kunde.lkbudget.LkBudgetKundenvertragDto;
import org.ex.mapstructtest.api.vertrag.kunde.lkbudget.LkvLeistungskategorieDto;
import org.ex.mapstructtest.core.vertrag.kunde.LeistungskategorieMapper;
import org.mapstruct.*;

import java.util.Set;

@Mapper(unmappedSourcePolicy = ReportingPolicy.ERROR, uses = LeistungskategorieMapper.class)
@DecoratedWith(LkBudgetKundenvertragMapperDecorator.class)
public interface LkBudgetKundenVertragMapper {
    @Mappings({
            @Mapping(target = "lkvLeistungskategorien", source = "dto.leistungskategorien")
    })
    LkBudgetKundenvertrag toDbo(LkBudgetKundenvertragDto dto, @Context LkvLeistungskategorieContext ctx, @Context CycleAvoidingContext ctxx);

    Set<LkvLeistungskategorie> toDbo(Set<LeistungskategorieDto> dto, @Context LkvLeistungskategorieContext ctx, @Context CycleAvoidingContext ctxx);

    @Mapping(target = "id", ignore = true)
    LkvLeistungskategorie toDbo(LkvLeistungskategorieDto dto, @Context LkvLeistungskategorieContext ctx, @Context CycleAvoidingContext ctxx);

    // overriden by decorator
    @Mappings({
            @Mapping(target = "lkBudgetKundenvertrag", ignore = true),
            @Mapping(target = "leistungskategorie", ignore = true)
    })
    @BeanMapping( ignoreUnmappedSourceProperties={"beschreibung"} )
    LkvLeistungskategorie toDbo(LeistungskategorieDto dto, @Context LkvLeistungskategorieContext ctx, @Context CycleAvoidingContext ctxx);

}
