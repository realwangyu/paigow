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
import java.util.Random;
import java.util.Scanner;

/**
 * @Description:    牌九游戏测试类
 * @Author:         wangyu08334
 * @Date:           2019年5月10日 下午4:23:29
 */
public class PaiGowTest {
    
    public List<PaiGow> paiGows;
    
    public List<Player> players;
    
    public List<PaiGow> paiGowsUsed;
    
    /**
     * @Description:    初始化32张牌
     * @Author:         wangyu08334
     * @Date:           2019年5月10日 下午5:12:59
     */
    public void initPaiGows() {
        paiGows = new ArrayList<PaiGow>();
        paiGowsUsed = new ArrayList<PaiGow>();;
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
    
    /**
     * @Description:    输出所有牌
     * @Author:         wangyu08334
     * @Date:           2019年5月10日 下午5:13:19
     */
    public void printPaiGows() {
        if (paiGows == null
                && paiGows.size() <= 0) {
            System.out.println("没有初始化牌集！");
            return;
        }
        System.out.println("--------------------牌集如下--------------------");
        for (PaiGow paiGow : paiGows) {
            System.out.println(paiGow.toString());
        }
    }
    
    public void initPlayers() {
        players = new ArrayList<Player>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("请输入玩家" + i + "的姓名：");
            players.add(new Player(scanner.next()));
        }
        scanner.close();
        System.out.println("4位玩家加入成功，列举如下：");
        for (Player player : players) {
            System.out.println(player.toString());
        }
    }
    /**
     * @Description:    随机给玩家发牌
     * @Author:         wangyu08334
     * @Date:           2019年5月10日 下午5:43:57
     */
    public void randomCards() {
        System.out.println("-------------开始随机发牌---------------");
        Random random = new Random();
        int index = -1;
        // 为每一位玩家各发两张牌
        for (Player player : players) {
            // 保证取到的随机数不能重复
            do {
                index = random.nextInt(32);
            } while (paiGowsUsed.contains(paiGows.get(index)));
            player.setPaiGow1(paiGows.get(index));
            paiGowsUsed.add(paiGows.get(index));
            do {
                index = random.nextInt(32);
            } while (paiGowsUsed.contains(paiGows.get(index)));
            player.setPaiGow2(paiGows.get(index));
            paiGowsUsed.add(paiGows.get(index));
        }
        System.out.println("-------------全部玩家发牌完成！---------------");
    }
    
    public void printUsedCards() {
        System.out.println("-------------已出牌如下--------------");
        for (PaiGow paiGow : paiGowsUsed) {
            System.out.println(paiGow.toString());
        }
    }
    
    public void showPlayersPaiGows() {
        for (Player player : players) {
            player.showPaiGows();
        }
    }

    /**
     * @Description:    牌九游戏测试程序
     * @Author:         wangyu08334
     * @Date:           2019年5月10日 下午4:23:29
     */
    public static void main(String[] args) {
        PaiGowTest paiGowTest = new PaiGowTest();
        paiGowTest.initPaiGows();
        paiGowTest.printPaiGows();
        paiGowTest.initPlayers();
        paiGowTest.randomCards();
        paiGowTest.showPlayersPaiGows();
        paiGowTest.printUsedCards();
    }

}
