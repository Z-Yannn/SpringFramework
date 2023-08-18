package service.impl;

import dao.DemoDao;
import dao.impl.DemoDaoImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    // 缓存区，保存已经创建好的对象
    private static Map<String, Object> beanMap = new HashMap<>();
    public static Properties properties;

    // 使用静态代码块初始化properties，加载factory.properties文件
    static {
        properties = new Properties();
        try {
            // 必须使用类加载器读取resource文件夹下的配置文件
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            // BeanFactory类的静态初始化都失败了，那后续也没有必要继续执行了
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
        }
    }
    public static Object getBean(String beanName) {
        try {
            Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
            return beanClazz.newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("[" + beanName + "] instantiation error!", e);
        }
    }
}
