 package cn.mangodb.entity;

import java.io.Serializable;

/**
 * @author xiang
 * @date 2019/01/04
 */
public class Boy implements Serializable {
    private static final long serialVersionUID = -9142685316762601951L;
    private int age;
    private String name;
    
    public Boy() {
        super();
         // TODO Auto-generated constructor stub
    }
    public Boy(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Boy [age=" + age + ", name=" + name + "]";
    }
    

}
