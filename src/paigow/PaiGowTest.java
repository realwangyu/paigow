/**     
  * 文件描述
  * @ProductName:    Hundsun HEP
  * @ProjectName:    paigow
  * @Package:        paigow
  * @FileName:		 PaiGowTest.java
  * @TypeName:		 PaiGowTest
  * @Description:    note
  * @Author:         wangyu08334
  * @CreateDate:     2019年5月10日 下午4:23:29
  * @UpdateUser:     wangyu08334
  * @UpdateDate:     2019年5月10日 下午4:23:29
  * @UpdateRemark:   The modified content
  * @Version:        1.0
  *
  * Copyright © 2019 Hundsun Technologies Inc. All Rights Reserved
**/
package paigow;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:    note
 * @Author:         wangyu08334
 * @Date:           2019年5月10日 下午4:23:29
 */
public class PaiGowTest {
    
    public List<PaiGow> paiGows;
    
    public void initPaiGows() {
        paiGows = new ArrayList<PaiGow>();
        // 初始化32张牌
        paiGows.add(new PaiGow(12, "天", 1));
        paiGows.add(new PaiGow(12, "天", 1));
        paiGows.add(new PaiGow(2, "地", 2));
        paiGows.add(new PaiGow(2, "地", 2));
        paiGows.add(new PaiGow(8, "人", 3));
        paiGows.add(new PaiGow(8, "人", 3));
        paiGows.add(new PaiGow(4, "和", 4));
        paiGows.add(new PaiGow(4, "和", 4));
        paiGows.add(new PaiGow(10, "梅花", 5));
        paiGows.add(new PaiGow(10, "梅花", 5));
        paiGows.add(new PaiGow(6, "长三", 5));
        paiGows.add(new PaiGow(6, "长三", 5));
        paiGows.add(new PaiGow(4, "板凳", 5));
        paiGows.add(new PaiGow(4, "板凳", 5));
        paiGows.add(new PaiGow(11, "虎头", 6));
        paiGows.add(new PaiGow(11, "虎头", 6));
        paiGows.add(new PaiGow(10, "红头十", 6));
        paiGows.add(new PaiGow(10, "红头十", 6));
        paiGows.add(new PaiGow(6, "幺六", 6));
        paiGows.add(new PaiGow(6, "幺六", 6));
        paiGows.add(new PaiGow(7, "幺七", 6));
        paiGows.add(new PaiGow(7, "幺七", 6));
        paiGows.add(new PaiGow(9, "杂九", 7));
        paiGows.add(new PaiGow(9, "杂九", 7));
        paiGows.add(new PaiGow(8, "杂八", 7));
        paiGows.add(new PaiGow(8, "杂八", 7));
        paiGows.add(new PaiGow(7, "杂七", 7));
        paiGows.add(new PaiGow(7, "杂七", 7));
        paiGows.add(new PaiGow(5, "杂五", 7));
        paiGows.add(new PaiGow(5, "杂五", 7));
        paiGows.add(new PaiGow(3, "小猴", 7));
        paiGows.add(new PaiGow(6, "大猴", 7));
    }
    
    public void printPaiGows() {
        
    }

    /**
     * @Description:    note
     * @Author:         wangyu08334
     * @Date:           2019年5月10日 下午4:23:29
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PaiGowTest paiGowTest = new PaiGowTest();
        paiGowTest.initPaiGows();
        
    }

}
