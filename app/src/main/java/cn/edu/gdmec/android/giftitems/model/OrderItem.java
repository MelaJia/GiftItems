package cn.edu.gdmec.android.giftitems.model;

/**订单项
 * Created by HP on 2018/3/31.
 */

public class OrderItem {
    public Integer id;
    public Integer orderId;
    public Integer gifetId;
    public String giftName;
    public Integer giftCount;
    public Integer styleId;
    public String styleName;
    public double discount;
    public double stylePrice;
    public String remark;
    public String stylePic1;
    public Order order;

}
