package entity;

import java.io.Serializable;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午9:46 18-9-10
 * @Modified: null
 */
public class Rank implements Serializable {
    private static final long serialversionUID = 1435515995276255188L;

    private int id;
    private int level;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "id=" + id +
                ", level=" + level +
                ", name='" + name + '\'' +
                '}';
    }
}
