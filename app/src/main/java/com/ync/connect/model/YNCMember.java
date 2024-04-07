package com.ync.connect.model;

import java.util.Objects;

public class YNCMember {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String instagramUrl;
    private String tiktokUrl;
    private String snapchatUrl;
    private String facebookUrl;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public void setInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    public String getTiktokUrl() {
        return tiktokUrl;
    }

    public void setTiktokUrl(String tiktokUrl) {
        this.tiktokUrl = tiktokUrl;
    }

    public String getSnapchatUrl() {
        return snapchatUrl;
    }

    public void setSnapchatUrl(String snapchatUrl) {
        this.snapchatUrl = snapchatUrl;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YNCMember)) return false;
        YNCMember yncMember = (YNCMember) o;
        return Objects.equals(getFirstName(), yncMember.getFirstName()) && Objects.equals(getLastName(), yncMember.getLastName()) && Objects.equals(getEmail(), yncMember.getEmail()) && Objects.equals(getPhoneNumber(), yncMember.getPhoneNumber()) && Objects.equals(getInstagramUrl(), yncMember.getInstagramUrl()) && Objects.equals(getTiktokUrl(), yncMember.getTiktokUrl()) && Objects.equals(getSnapchatUrl(), yncMember.getSnapchatUrl()) && Objects.equals(getFacebookUrl(), yncMember.getFacebookUrl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getEmail(), getPhoneNumber(), getInstagramUrl(), getTiktokUrl(), getSnapchatUrl(), getFacebookUrl());
    }
}
