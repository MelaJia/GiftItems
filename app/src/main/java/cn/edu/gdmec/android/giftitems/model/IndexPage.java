package cn.edu.gdmec.android.giftitems.model;

import java.util.ArrayList;

/**首页资源
 * Created by HP on 2018/3/31.
 */

public class IndexPage {
    static final String SERVER="http://localhost:8080/giftems";
    public String[] recommendTop;
    public String recommendBottomLeft;
    public String recommendBottomRight;
    public String giftCommon;
    public String strategy;
    public IndexPage(ArrayList<IndexPageResource> settings){
        ArrayList<String> recommedTopList = new ArrayList<String>();
        for (IndexPageResource s:settings){
            switch (s.place){
                case 1:
                    recommedTopList.add(SERVER+s.picUrl);
                    break;
                case 2:
                    recommendBottomLeft=SERVER+s.picUrl;
                    break;
                case 3:
                    recommendBottomRight=SERVER+s.picUrl;
                    break;
                case 4:
                    giftCommon=SERVER+s.picUrl;
                    break;
                case 5:
                    strategy=SERVER+s.picUrl;
                    break;
            }
        }
        recommendTop = recommedTopList.toArray(new String[recommedTopList.size()]);

    }

}
