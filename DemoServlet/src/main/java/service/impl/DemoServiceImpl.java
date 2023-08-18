package service.impl;

import dao.DemoDao;
import dao.impl.DemoDaoImpl;
import service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {
    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");
    @Override
    public List<String> findAll() {
        return demoDao.findAll();

    }

    public DemoServiceImpl() {
        for (int i = 0; i < 10; i++) {
            System.out.println(BeanFactory.getBean("demoDao"));
        }
    }
}
