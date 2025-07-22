package ru.ls.qa.school.addressbok.model;

import java.util.Objects;

public record GroupData(int id, String name, String header, String footer) {

    public GroupData(String name, String header, String footer) {
        this(Integer.MAX_VALUE, name, header, footer); // делегирование каноническому конструктору
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getHeader() {
        return header;
    }
    public String getFooter() {
        return footer;
    }

    public GroupData setId(int id) {
        return new GroupData(id, this.name, this.header, this.footer);
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return Objects.equals(id, groupData.id) && Objects.equals(name, groupData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


}