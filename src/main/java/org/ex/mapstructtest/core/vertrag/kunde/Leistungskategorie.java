package org.ex.mapstructtest.core.vertrag.kunde;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Leistungskategorie {
    private Long id;
    private String beschreibung;
}
