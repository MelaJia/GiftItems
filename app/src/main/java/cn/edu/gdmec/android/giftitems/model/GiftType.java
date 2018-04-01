package cn.edu.gdmec.android.giftitems.model;

import android.support.annotation.NonNull;

/**礼品类型
 * Created by HP on 2018/3/31.
 */

public class GiftType implements Comparable<GiftType>{
    public int id;
    public String name;
    public String pic;
    public int orderNum;

    @Override
    public int compareTo(@NonNull GiftType another) {
        return orderNum<another.orderNum ? -1:(orderNum==another.orderNum ? 0:1);
    }
}
