package entity;

import javax.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Security> securities;

    private Date creationDate;

    // Constructor
    public Portfolio(Client client, Date creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    // Getters and Setters
    // Similar to the Advisor class
}

