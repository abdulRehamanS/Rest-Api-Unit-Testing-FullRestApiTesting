package In.Abdul.VendorSpringBootRestAPITesting.Service;

import In.Abdul.VendorSpringBootRestAPITesting.Entity.vendor;
import In.Abdul.VendorSpringBootRestAPITesting.Exception.vendorNotFoundException;
import In.Abdul.VendorSpringBootRestAPITesting.Repository.vendorRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class vendorServiceImplTest {

   /*
    @Mock
    private vendorRepo vendorRespoistory;

    private vendorServiceImpl vendorService;

    private AutoCloseable autoCloseable;

    private vendor vendor

    @BeforeEach
    void setUp() throws Exception {
        autoCloseable = MockitoAnnotations.openMocks(this);
        vendorService = new vendorServiceImpl(vendorRespoistory);
        vendor = new vendor(1,"Amazon","USA","12345566");
    }

    @Test
    @DisplayName("Test Case For Creating Vendor Record")
    public void testCreateVendor() {
        //setting behaviour for DAO Method Call
        when(vendorRespoistory.save(any())).thenReturn(vendor);
        //verifying the service method
        assertThat(vendorService.createVendor(vendor)).isEqualTo("SUCCESS");
    }

    @Test
    @DisplayName("Test Case For Getting Vendor Details By Id")
    public void testGetVendorDetailsById() {
        //setting behaviour for DAO Method Call
        when(vendorRespoistory.findById(1)).thenReturn(Optional.ofNullable(vendor));
        //verifying the service method call
        assertThat(vendorService.getVendorById(1).getVname()).isEqualTo(vendor.getVname());
        assertThat(vendorService.getVendorById(1).getLocation()).isEqualTo(vendor.getLocation());
        assertThat(vendorService.getVendorById(1).getContactNo()).isEqualTo(vendor.getContactNo());
    }

    @Test
    @DisplayName("Test Case for Getting Vendor Details By Exception")
    public void testGetVendorDetailsById_Exception() {
        //Setting behaviour For DAO Method Call
        when(vendorRespoistory.findById(12323)).thenThrow(vendorNotFoundException.class);
        assertThrows(vendorNotFoundException.class,() -> vendorService.getVendorById(12233),"Requested Vendor does not exist");
    }

    @Test
    @DisplayName("Test Case for Getting Vendor details By Vendor-name")
    public void testGetVendorDetailsByName() {
        //setting behaviour For DAO Method
        when(vendorRespoistory.findById("Amazon")).thenReturn(new ArrayList<vendor>(Collections.singleton(vendor)));
        //verifying the service call
        assertThat(vendorService.getVendorInfoByVendorName("Amazon").get(0).getVendorId()).isEqualTo(vendor.getVendorId());
    }

    @Test
    @DisplayName("Test Case for Getting All Vendors List")
    public void testGetAllVendors() {
        //setting the behaviour for DAO method
        when(vendorRespoistory.findAll()).thenReturn(new ArrayList<Vendor>(Collections.singleton(vendor)));
        //verifying the service method call
        assertThat(vendorService.getAllVendors().get(0).getVendorName()).isEqualTo(vendor.getVendorName());
        assertThat(vendorService.getAllVendors().size()).isEqualTo(1);
    }

    @Test
    @DisplayName("Test Case for Deleteing Vendor Details By VendorID")
    public void testDeleteVendor() {
        //Some what different for testing void return type.
        mock(VendorRespoistory.class, Mockito.CALLS_REAL_METHODS);
        //setting the behaviour of DAO doAnswer(Answers.CALLS_REAL_METHODS)
        doNothing().when(vendorRespoistory).deleteById(any());
        //verifying the service method
        assertThat(vendorService.deleteVendor(1)).isEqualTo("SUCCESS");
    }

    @AfterEach
    void tearDown() throws Exception {
        //autoCloseable.close();
    }

    */
}
