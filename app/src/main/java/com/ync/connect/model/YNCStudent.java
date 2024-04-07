package com.ync.connect.model;

import java.util.Objects;

public class YNCStudent extends YNCMember {

        private String grade;
        private YNCTeacher teacher;

        public String getGrade() {
                return grade;
        }

        public void setGrade(String grade) {
                this.grade = grade;
        }

        public YNCTeacher getTeacher() {
                return teacher;
        }

        public void setTeacher(YNCTeacher teacher) {
                this.teacher = teacher;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof YNCStudent)) return false;
                if (!super.equals(o)) return false;
                YNCStudent that = (YNCStudent) o;
                return Objects.equals(getGrade(), that.getGrade()) && Objects.equals(getTeacher(), that.getTeacher());
        }

        @Override
        public int hashCode() {
                return Objects.hash(super.hashCode(), getGrade(), getTeacher());
        }
}
