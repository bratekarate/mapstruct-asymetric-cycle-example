package org.ex.mapstructtest.core.vertrag.kunde.lkbudget;

import org.ex.mapstructtest.api.vertrag.kunde.LeistungskategorieDto;
import org.ex.mapstructtest.api.vertrag.kunde.lkbudget.LkBudgetKundenvertragDto;
import org.ex.mapstructtest.core.vertrag.kunde.Leistungskategorie;
import org.ex.mapstructtest.core.vertrag.kunde.LeistungskategorieMapper;
import org.ex.mapstructtest.core.vertrag.kunde.LeistungskategorieMapperImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.Set;

public class LkBudgetKundenvertragTests {

    @Test
    @DisplayName("Test mappers for LkBudgetKundenvertrag")
    void testMapping() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        LeistungskategorieDto lkDto = new LeistungskategorieDto();
        lkDto.setBeschreibung("TestLk");
        lkDto.setId(1L);

        LkBudgetKundenvertragDto lkBudgetKundenvertragDto = new LkBudgetKundenvertragDto();
        lkBudgetKundenvertragDto.setId(1L);
        lkBudgetKundenvertragDto.setVertragsNummer("test nr");
        Set<LeistungskategorieDto> lkDtos = Set.of(lkDto);
        lkBudgetKundenvertragDto.setLeistungskategorien(lkDtos);

        LeistungskategorieMapper lkMapper = new LeistungskategorieMapperImpl();
        LkBudgetKundenVertragMapper lkBudgetKvMapper = new LkBudgetKundenVertragMapperImpl();
        ReflectionTestUtils.setField(lkBudgetKvMapper, "leistungskategorieMapper", lkMapper);

        LkBudgetKundenvertrag lkBudgetKundenvertrag =
                lkBudgetKvMapper.toDbo(lkBudgetKundenvertragDto, new LkvLeistungskategorieContext(), new CycleAvoidingContext());

        Assertions.assertEquals(lkBudgetKundenvertrag.getId(), lkBudgetKundenvertragDto.getId());
        Assertions.assertEquals(lkBudgetKundenvertrag.getVertragsNummer(), lkBudgetKundenvertragDto.getVertragsNummer());
        Assertions.assertEquals(lkBudgetKundenvertrag.getLkvLeistungskategorien().size(), lkBudgetKundenvertragDto.getLeistungskategorien().size());

        lkBudgetKundenvertrag.getLkvLeistungskategorien().forEach(lkvLeistungskategorie -> {
            Optional<Leistungskategorie> leistungskategorieOpt =
                    Optional.ofNullable(lkvLeistungskategorie.getLeistungskategorie());

            Assertions.assertTrue(leistungskategorieOpt.isPresent());

            Leistungskategorie leistungskategorie = leistungskategorieOpt.get();
            Optional<LeistungskategorieDto> lkDtoSameIdOpt =
                    lkDtos.stream()
                            .filter(dto -> Optional.ofNullable(leistungskategorie.getId())
                                    .map(aLong -> aLong.equals(dto.getId()))
                                    .orElse(false))
                            .findAny();

            Assertions.assertTrue(lkDtoSameIdOpt.isPresent());
            LeistungskategorieDto lkDtoSameId = lkDtoSameIdOpt.get();
            Assertions.assertEquals(leistungskategorie.getId(), lkDtoSameId.getId());
            Assertions.assertEquals(leistungskategorie.getBeschreibung(), lkDtoSameId.getBeschreibung());
        });

    }
}
