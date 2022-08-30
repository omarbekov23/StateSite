package erlan.model.entity.jashtarIshteri;

import erlan.model.FileInformation.Gallery;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "enterprisingYouth")
public class EnterprisingYouth {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "enter_seq")
    @SequenceGenerator(name = "enter_seq",
            sequenceName = "SEQ_ENTER", allocationSize = 1)
    @Column(updatable = false, nullable = false)
    private Long id;
    private String fullName;
    private LocalDate age;
    private String direction;
    private String result;

    @OneToOne
    private Gallery gallery;
}
