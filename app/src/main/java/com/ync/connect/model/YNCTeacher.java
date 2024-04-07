package com.ync.connect.model;

import java.util.List;
import java.util.Objects;

public class YNCTeacher extends YNCMember{

    private List<YNCStudent> students;

    public List<YNCStudent> getStudents() {
        return students;
    }

    public void setStudents(List<YNCStudent> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YNCTeacher)) return false;
        if (!super.equals(o)) return false;
        YNCTeacher that = (YNCTeacher) o;
        return Objects.equals(getStudents(), that.getStudents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getStudents());
    }
}
