package cn.edu.gdmec.android.giftitems.model;

/**首页资源
 * Created by HP on 2018/3/31.
 */

public class IndexPageResource {
    public int id;
    public String picUrl;           //图片地址
    public int type;                //配置类型 1:pc  2:android   3:ios
    public int orderNUm;            //每种类型图片的顺序
    public int status;              //0：未发布；1：已发布
    public int place;
}
