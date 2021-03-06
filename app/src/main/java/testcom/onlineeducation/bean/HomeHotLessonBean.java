package testcom.onlineeducation.bean;

import testcom.onlineeducation.view.Adapter.MuliTypeAdapter.TypeFactory;
import testcom.onlineeducation.view.Adapter.MuliTypeAdapter.Visitable;

/**
 * Created by Administrator on 2017/6/23 0023.
 */
public class HomeHotLessonBean implements Visitable{
    private String img;
    private String name;
    private String author;
    private String money;
    private String lv;

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
