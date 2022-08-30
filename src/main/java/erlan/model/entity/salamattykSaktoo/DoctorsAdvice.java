package erlan.model.entity.salamattykSaktoo;

import erlan.model.FileInformation.Gallery;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "doctorsAdvice")

public class DoctorsAdvice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "doctors_seq")
    @SequenceGenerator(name = "doctors_seq",
            sequenceName = "SEQ_DOCTORS", allocationSize = 1)
    @Column(updatable = false, nullable = false)
    private Long id;
    @Column(length = 10000000)
    private String text;

    @OneToOne
    private Gallery gallery;

}
