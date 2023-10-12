package In.Abdul.VendorSpringBootRestAPITesting.Repository;

import In.Abdul.VendorSpringBootRestAPITesting.Entity.vendor;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface vendorRepo extends JpaRepository<vendor, Serializable> {

}
