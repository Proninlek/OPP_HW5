package model;
import model.Student;

import java.util.ArrayList;
import java.util.List;
/*
В классе StudentResidence присутствуют принципы SOLID:
1. Single Responsibility Principle - данный класс отвечает за одно решение, в данном случае создает комнаты в общежитии
2. Open-Closed Principle - Класс открыт для расширения, но не для изменения
 */
public class StudentResidence {
    private int roomNumber;
    private List<Student> list;

    public StudentResidence() { this.list = new ArrayList<>(); }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "StudentResidence{" +
                "roomNumber=" + roomNumber +
                ", list=" + list +
                '}';
    }
}