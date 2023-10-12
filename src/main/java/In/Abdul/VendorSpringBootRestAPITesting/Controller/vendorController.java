package In.Abdul.VendorSpringBootRestAPITesting.Controller;

import In.Abdul.VendorSpringBootRestAPITesting.Entity.vendor;
import In.Abdul.VendorSpringBootRestAPITesting.Service.vendorServiceImpl;
import org.hibernate.type.descriptor.jdbc.ObjectNullResolvingJdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendors")
public class vendorController {

    @Autowired
    private vendorServiceImpl service;

    @PostMapping("/")
    public ResponseEntity<String> createVendor(@RequestBody vendor vendor) {
        service.createVendor(vendor);
        return new ResponseEntity<String>("Vendor created successfully", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getVendorById(@PathVariable Integer id) {
        return new ResponseEntity<Object>(service.getVendorById(id), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<Object> getAllVendors() {
        return new ResponseEntity<Object>(service.getAllVendors(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVendorById(@PathVariable Integer id) {
        return new ResponseEntity<>("Vendor deleted successfully", HttpStatus.OK);
    }


}
