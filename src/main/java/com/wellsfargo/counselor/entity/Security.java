package entity;

import javax.persistence.*;


@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    private String name;
    private String category;
    private Double purchasePrice;
    private Date purchaseDate;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    // Constructor
    public Security(String name, String category, Double purchasePrice, Date purchaseDate, Integer quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    // Getters and Setters
    // Similar to the Advisor class
}

