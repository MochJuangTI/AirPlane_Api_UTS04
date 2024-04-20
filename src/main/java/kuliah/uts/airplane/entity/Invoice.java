package kuliah.uts.airplane.entity;
import jakarta.persistence.*;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="total_payments")
    private Double totalPayments;

    @Column
    private Boolean isPaid;

    @Column(name ="total_vat")
    private Double totalVat;

    @OneToMany(mappedBy = "invoice")
    private List<CreditHistory> invoiceCreditHistories;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", referencedColumnName = "id")
    private Booking booking;

}
