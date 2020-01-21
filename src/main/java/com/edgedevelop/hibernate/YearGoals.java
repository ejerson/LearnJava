package com.edgedevelop.hibernate;


import java.io.Serializable;
import javax.persistence.*;
import java.time.Year;

/*
* This class implements the Serializable interface to be able to turn
* objects into workable data
*
* */
@Entity // The @Entity annotation is necessary to define which object is persisted
@Table(name = "yearly_goals") // this specifies the name of the table that is going to be created for this entity
public class YearGoals implements Serializable {

    @Id // all entity must define a primary key
    //@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY) // Allows the database to generate the id
    private int id = Integer.valueOf(String.valueOf(Year.now()));

    @Column(name = "first_goal")
    private String firstGoal;
    @Column(name = "second_goal")
    private String secondGoal;

    public int getId() {
        return id;
    }

    public String getFirstGoal() {
        return firstGoal;
    }

    public void setFirstGoal(String firstGoal) {
        this.firstGoal = firstGoal;
    }

    public String getSecondGoal() {
        return secondGoal;
    }

    public void setSecondGoal(String secondGoal) {
        this.secondGoal = secondGoal;
    }
}
