## 常用依赖
```
   <dependencies>
        <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.3.18</version>
        </dependency>

   </dependencies>
```
## 注解说明
- @Autowired：自动装配先类型。再名字
    如果不唯一，加上@Qualifier则可以根据byName的方式自动装配
- @Nullable 字段标记了这注解说明字段能为空
- @Resource：自动装配先名字。类型

## 自动装配的注解支持
- 开启属性注解支持！
    <context:annotation-config/>

- 在spring配置文件中引入context文件头
      xmlns:context="http://www.springframework.org/schema/context"


- xsi:schemaLocation中添加下列
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd


- 还需要导入aop包
    与上述导入context一模一样，将后面的context改为aop即可
