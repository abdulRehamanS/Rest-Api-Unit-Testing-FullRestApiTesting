package In.Abdul.VendorSpringBootRestAPITesting.Service;

import In.Abdul.VendorSpringBootRestAPITesting.Entity.vendor;
import In.Abdul.VendorSpringBootRestAPITesting.Exception.vendorNotFoundException;
import In.Abdul.VendorSpringBootRestAPITesting.Repository.vendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class vendorServiceImpl implements vendorService {

    @Autowired
    private vendorRepo repo;

    public vendorServiceImpl(vendorRepo vendorRespoistory) {

    }


    @Override
    public String createVendor(vendor vendor) {
        repo.save(vendor);
        return "vendor added successfully";
    }

    @Override
    public vendor getVendorById(Integer id) {

        if (repo.findById(id).isEmpty()) {
            throw new vendorNotFoundException("vendor not found");
        }
        return repo.findById(id).get();
    }

    @Override
    public List<vendor> getVendorByName(String name) {
        return null;
    }


    @Override
    public List<vendor> getAllVendors() {
        return repo.findAll();
    }

    @Override
    public String deleteVendorById(Integer id) {
        repo.deleteById(id);
        return "Deleted vendor successfully";

    }
}
