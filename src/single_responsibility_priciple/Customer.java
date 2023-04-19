package single_responsibility_priciple;

public class Customer {
    private String name;
    private String email;
    private String phoneNumber;
    private Address address;

    // Phương thức khởi tạo
    public Customer(String name, String email, String phoneNumber, Address address) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getter và Setter cho các thuộc tính

    // Phương thức để cập nhật thông tin địa chỉ của khách hàng
    public void updateAddress(String street, String city, String state, String zipCode) {
        this.address.setStreet(street);
        this.address.setCity(city);
        this.address.setState(state);
        this.address.setZipCode(zipCode);
    }

    // Phương thức để gửi email cho khách hàng
    public void sendEmail(String subject, String body) {
        // Gửi email đến địa chỉ email của khách hàng
        // Implement logic gửi email
    }

    // Phương thức để gửi tin nhắn SMS cho khách hàng
    public void sendSMS(String phoneNumber, String message) {
        // Gửi tin nhắn SMS đến số điện thoại của khách hàng
        // Implement logic gửi tin nhắn SMS
    }
}