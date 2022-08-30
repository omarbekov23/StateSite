package erlan.model.entity.Kultura;

import erlan.model.FileInformation.Gallery;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "museums")
public class Museums {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "museums_seq")
    @SequenceGenerator(name = "museums_seq",
            sequenceName = "SEQ_MUSEUMS", allocationSize = 1)
    @Column(updatable = false, nullable = false)
    private Long id;
    @Column(length = 10000000)
    private String text;

    @OneToOne
    private Gallery gallery;
}
