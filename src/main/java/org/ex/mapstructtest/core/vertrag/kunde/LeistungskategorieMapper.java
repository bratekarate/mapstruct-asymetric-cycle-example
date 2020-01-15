package org.ex.mapstructtest.core.vertrag.kunde;

import org.ex.mapstructtest.api.vertrag.kunde.LeistungskategorieDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface LeistungskategorieMapper {
    Leistungskategorie toLk(LeistungskategorieDto dto);
}
