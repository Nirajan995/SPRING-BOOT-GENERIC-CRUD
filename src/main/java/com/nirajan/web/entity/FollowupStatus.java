/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nirajan.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "follow_up_status")
public class FollowupStatus extends MasterEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(name = "followup_name")
    private String followupName;
    @Column(name = "followup_code")
    private String followupCode;
    @Column(name = "color")
    private String color;
    

    public FollowupStatus() {
    }

    public FollowupStatus(Integer id) {
        this.id = id;
    }


    public String getFollowupName() {
        return followupName;
    }

    public void setFollowupName(String followupName) {
        this.followupName = followupName;
    }

    public String getFollowupCode() {
        return followupCode;
    }

    public void setFollowupCode(String followupCode) {
        this.followupCode = followupCode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
