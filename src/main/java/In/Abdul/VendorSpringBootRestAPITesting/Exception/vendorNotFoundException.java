package In.Abdul.VendorSpringBootRestAPITesting.Exception;

public class vendorNotFoundException extends RuntimeException {
    public vendorNotFoundException(String vendorNotFound) {
        super(vendorNotFound);
    }
}
