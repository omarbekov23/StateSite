package erlan.model;

import erlan.model.FileInformation.Gallery;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ataktuular")
@RequiredArgsConstructor
@Getter
@Setter
public class Ataktuular {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "at_seq")
    @SequenceGenerator(name = "at_seq",
            sequenceName = "SEQ_AT", allocationSize = 1)
    @Column(updatable = false, nullable = false)
    private Long id;
    @Column(length = 10000000)
    private String info;

    @OneToOne
    private Gallery gallery;
}
