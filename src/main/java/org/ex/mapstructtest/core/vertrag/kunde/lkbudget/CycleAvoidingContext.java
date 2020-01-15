package org.ex.mapstructtest.core.vertrag.kunde.lkbudget;

import org.ex.mapstructtest.api.vertrag.kunde.lkbudget.LkBudgetKundenvertragDto;
import org.ex.mapstructtest.core.vertrag.kunde.lkbudget.LkBudgetKundenvertrag;
import org.mapstruct.BeforeMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.TargetType;

import java.util.IdentityHashMap;
import java.util.Map;

public class CycleAvoidingContext {

    private Map<Object, Object> knownInstances = new IdentityHashMap<>();

    @BeforeMapping
    @SuppressWarnings("unchecked")
    public <T extends LkBudgetKundenvertrag> T getMappedInstance(Object source, @TargetType Class<T> targetType) {
        return (T) knownInstances.get( source );
    }

    @BeforeMapping
    public void storeMappedInstance(Object source, @MappingTarget LkBudgetKundenvertrag target) {
        knownInstances.put( source, target );
    }
}
