package org.example.dao;


import org.example.models.Identity;

import java.util.ArrayList;

public class DataBase {
    private static int people_counter;
    private ArrayList<Identity> data;

    public DataBase() {
        data = new ArrayList<>();
    }

    public DataBase(ArrayList<Identity> list) {
        data = list;
    }

    public void addId(Identity id) {
        id.setId(++people_counter);
        data.add(id);
    }

    public Identity show(int id) {
        for (Identity iden : data) {
            if (iden.getId() == id) return iden;
        }
        return null;
    }

    public void edit(Identity identity, int id) {
        show(id).update(identity);

    }

    public ArrayList<Identity> index() {
        return this.data;
    }
}
