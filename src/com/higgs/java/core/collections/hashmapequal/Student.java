package com.higgs.java.core.collections.hashmapequal;

/**
 * Created by quytm on 20/06/18.
 */
public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);

        if (obj == null) return false;

        if (!(obj instanceof Student)) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        return this.getId() == ((Student) obj).getId();
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        return id;
    }
}
