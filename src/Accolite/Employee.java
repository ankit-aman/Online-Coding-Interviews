package Accolite;

final class Employee {
    private final String name;
    private final int age;
    private final Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address.getAddress());
    }

//public getters

    public Address getAddress() {
        Address address = new Address(this.address.getAddress());
       // address.setAddress(this.address.getAddress());

        return address;
    }

//

}