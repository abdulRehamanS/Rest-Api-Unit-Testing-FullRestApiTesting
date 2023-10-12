package In.Abdul.VendorSpringBootRestAPITesting.Controller;

import In.Abdul.VendorSpringBootRestAPITesting.Entity.vendor;
import In.Abdul.VendorSpringBootRestAPITesting.Service.vendorServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(vendorControllerTest.class)
public class vendorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private vendorServiceImpl vendorService;

    private vendor vendor1;

    private vendor vendor2;

    private List<vendor> vendorList = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        vendor1 = new vendor(1, "Amazon", "USA", "1234567890");
        vendor2 = new vendor(2, "GCP", "UK", "1234567890");
        vendorList.add(vendor1);
        vendorList.add(vendor2);
    }

    @AfterEach
    public void tearDown() {
        vendorList.clear();
        vendor1 = null;
        vendor2 = null;
    }

    @Test
    public void testGetVendorDetails() throws Exception {
        //setting behaviour for Service method for Controller
        when(vendorService.getVendorById(1)).thenReturn(vendor1);

        mockMvc.perform(get("/vendors/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void testGetAllVendors() throws Exception {
        //setting Behaviour for service method for controller
        when(vendorService.getAllVendors()).thenReturn(vendorList);

        mockMvc.perform(get("/vendors/"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    @Disabled
    public void testDeleteVendorDetails() throws Exception {

        //setting behaviour for service method for controller
        when(vendorService.deleteVendorById(1)).thenReturn("SUCCESS");

        mockMvc.perform(delete("/vendors/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void testCreateVendorDetails() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);

        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson = ow.writeValueAsString(vendor1);
        System.out.println("Request Json:::::" + requestJson);

        //setting behaviour for service method in controller
        when(vendorService.createVendor(vendor1)).thenReturn("SUCCESS");

        mockMvc.perform(post("/vendors/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestJson))
                .andDo(print())
                .andExpect(status().isCreated());
    }
}
