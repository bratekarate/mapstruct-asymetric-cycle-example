package org.ex.mapstructtest.api.vertrag.kunde;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeistungskategorieDto {
    private Long id;
    private String beschreibung;
}
