package cn.edu.gdmec.android.giftitems.model;

import java.util.ArrayList;

/**
 * Created by HP on 2018/3/31.
 */

public class Gift {
    public int id;
    public String name;
    public String remark;
    public int likes;
    public int sales;
    public boolean collected;
    public ArrayList<GiftStyle> styles=new ArrayList<GiftStyle>();
}
