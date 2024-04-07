package com.ync.connect.model;

import java.util.Objects;

public class YNCPastor extends YNCMember {

    private String ministry;

    public String getMinistry() {
        return ministry;
    }

    public void setMinistry(String ministry) {
        this.ministry = ministry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YNCPastor)) return false;
        if (!super.equals(o)) return false;
        YNCPastor yncPastor = (YNCPastor) o;
        return Objects.equals(ministry, yncPastor.ministry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ministry);
    }
}
