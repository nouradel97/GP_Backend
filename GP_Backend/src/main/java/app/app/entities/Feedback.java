package app.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Feedback {
    @Id
    @GeneratedValue
    private int feedbackId;
}
