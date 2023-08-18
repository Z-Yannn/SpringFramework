package com.bocloud.spring.basic_dl.b_quickstart_bytype.dao.impl;

import com.bocloud.spring.basic_dl.b_quickstart_bytype.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {

    @Override
    public List<String> findAll() {
        return Arrays.asList("aa","bb");
    }
}
