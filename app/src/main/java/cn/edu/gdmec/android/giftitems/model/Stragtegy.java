package cn.edu.gdmec.android.giftitems.model;

import android.support.annotation.NonNull;

/**礼品攻略
 * Created by HP on 2018/3/31.
 */

public class Stragtegy implements Comparable<Stragtegy>{
    public int id;
    public String title;
    public String remark;
    public String pic1;
    public String pic2;
    public String pic3;
    public String pic4;
    public String pic5;
    public String content;
    public String createTime;

    @Override
    public int compareTo(@NonNull Stragtegy another) {
        return createTime.compareTo(another.createTime);
    }
}
