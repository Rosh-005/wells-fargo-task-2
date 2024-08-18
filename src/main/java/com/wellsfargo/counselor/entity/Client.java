package entity;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Portfolio portfolio;

    // Constructor
    public Client(String firstName, String lastName, String address, String phone, String email, Advisor advisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.advisor = advisor;
    }

    // Getters and Setters
    // Similar to the Advisor class
}
