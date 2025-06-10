package finalmission.cake.dto;

import java.time.LocalDate;

public record CakeReservationRequest(
        LocalDate date,
        Long timeId,
        Long cakeId,
        Long flavorId,
        Long sizeId,
        String lettering
) {
}
