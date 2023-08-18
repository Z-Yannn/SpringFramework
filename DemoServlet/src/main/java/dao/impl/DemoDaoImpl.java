package dao.impl;

import dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {

    @Override
    public List<String> findAll() {
        return Arrays.asList("oracle","oracle","oracle");
    }

}

