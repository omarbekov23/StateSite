package erlan.model.entity.aiylCharba;

import erlan.model.FileInformation.Gallery;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "tips")
public class Tips {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "tips_seq")
    @SequenceGenerator(name = "tips_seq",
            sequenceName = "SEQ_TIPS", allocationSize = 1)
    @Column(updatable = false, nullable = false)
    private Long id;
    @Column(length = 10000000)
    private String text;

    @OneToOne
    private Gallery gallery;
}
