package finalmission.cake.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "size")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "size_id")
    private Long id;

    @Column(name = "dimension")
    @NotNull
    private Integer dimension;

    @Column(name = "description")
    private String description;

    @Column(name = "additional_price")
    @NotNull
    private Integer additionalPrice;
}
