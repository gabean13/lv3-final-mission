package finalmission.cake.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cake_info")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CakeInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "cake_info_id")
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "cake_id")
    @NotNull
    private Cake cake;

    @ManyToOne
    @JoinColumn(name = "flavor_id")
    @NotNull
    private Flavor flavor;

    @ManyToOne
    @JoinColumn(name = "size_id")
    @NotNull
    private Size size;
}
