package In.Abdul.VendorSpringBootRestAPITesting.Service;

import In.Abdul.VendorSpringBootRestAPITesting.Entity.vendor;

import java.util.List;

public interface vendorService {


    // for adding data in to Db
    String createVendor(vendor vendor);



    //getting vendor obj by vendor id
    vendor getVendorById(Integer id);


    //getting vendor obj by vendor name
    List<vendor> getVendorByName(String name);


    // getting all the vendor objects
    List<vendor> getAllVendors();


    //delete vendor by id
    String deleteVendorById(Integer id);
}
