package In.Abdul.VendorSpringBootRestAPITesting.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "VendorSpringBootApplication")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vendor_Id", nullable = false)
    private Integer id;

    @Column(name = "vendor_Name", nullable = false)
    private String vname;

    @Column(name = "vendor_Location", nullable = false)
    private String location;

    @Column(name = "vendor_contact", nullable = false)
    private String contactNo;

}
