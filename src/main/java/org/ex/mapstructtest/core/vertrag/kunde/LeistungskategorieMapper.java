package org.ex.mapstructtest.core.vertrag.kunde;

import org.ex.mapstructtest.api.vertrag.kunde.LeistungskategorieDto;
import org.ex.mapstructtest.core.vertrag.kunde.lkbudget.CycleAvoidingContext;
import org.ex.mapstructtest.core.vertrag.kunde.lkbudget.LkBudgetKundenVertragMapper;
import org.ex.mapstructtest.core.vertrag.kunde.lkbudget.LkvLeistungskategorie;
import org.mapstruct.*;

import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface LeistungskategorieMapper {


    Leistungskategorie toLk(LeistungskategorieDto dto);

}
