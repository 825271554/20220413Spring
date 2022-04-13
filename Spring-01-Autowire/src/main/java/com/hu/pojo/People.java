package com.hu.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

public class People {
    @Autowired
    @Qualifier(value = "cat2")
    /**/

/*    @Resource(name = "cat2")*/
    private Cat cat;
    @Autowired
    @Nullable
    /*@Autowired(required=false) 说明： false，对象可以为null；true，对象必须存对象，不能为null。*/
    private Dog dog;
/*beans中使用注解装配时：将People类中的set方法去掉，使用@Autowired注解*/

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
