package org.thewalk.TheWalkStockApp.entities;

import javax.persistence.*;

@Entity
@Table(name = "FEEDBACK")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long feedbackID;

    private int rating;

    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUST_ID", referencedColumnName = "CUST_ID")
    private Customer customer;

//    private Long product;


    public Feedback() {
    }

    public Feedback( int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public Long getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(Long feedbackID) {
        this.feedbackID = feedbackID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

//    public Long getProduct() {
//        return product;
//    }
//
//    public void setProduct(Long product) {
//        this.product = product;
//    }
}
