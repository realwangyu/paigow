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
        paiGows.add(new PaiGow(12, "天", 7));
        paiGows.add(new PaiGow(12, "天", 7));
        paiGows.add(new PaiGow(2, "地", 6));
        paiGows.add(new PaiGow(2, "地", 6));
        paiGows.add(new PaiGow(8, "人", 5));
        paiGows.add(new PaiGow(8, "人", 5));
        paiGows.add(new PaiGow(4, "和", 4));
        paiGows.add(new PaiGow(4, "和", 4));
        paiGows.add(new PaiGow(10, "梅花", 3));
        paiGows.add(new PaiGow(10, "梅花", 3));
        paiGows.add(new PaiGow(6, "长三", 3));
        paiGows.add(new PaiGow(6, "长三", 3));
        paiGows.add(new PaiGow(4, "板凳", 3));
        paiGows.add(new PaiGow(4, "板凳", 3));
        paiGows.add(new PaiGow(11, "虎头", 2));
        paiGows.add(new PaiGow(11, "虎头", 2));
        paiGows.add(new PaiGow(10, "红十", 2));
        paiGows.add(new PaiGow(10, "红十", 2));
        paiGows.add(new PaiGow(6, "幺六", 2));
        paiGows.add(new PaiGow(6, "幺六", 2));
        paiGows.add(new PaiGow(7, "幺七", 2));
        paiGows.add(new PaiGow(7, "幺七", 2));
        paiGows.add(new PaiGow(9, "杂九", 1));
        paiGows.add(new PaiGow(9, "杂九", 1));
        paiGows.add(new PaiGow(8, "杂八", 1));
        paiGows.add(new PaiGow(8, "杂八", 1));
        paiGows.add(new PaiGow(7, "杂七", 1));
        paiGows.add(new PaiGow(7, "杂七", 1));
        paiGows.add(new PaiGow(5, "杂五", 1));
        paiGows.add(new PaiGow(5, "杂五", 1));
        paiGows.add(new PaiGow(3, "小猴", 1));
        paiGows.add(new PaiGow(6, "大猴", 1));
        System.out.println("初始化牌集完成！请开始游戏……");
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
    
    /**
     * @Description:    初始化4个玩家
     * @Author:         wangyu08334
     * @Date:           2019年5月10日 下午7:49:05
     */
    public void initPlayers() {
        players = new ArrayList<Player>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("请输入玩家" + i + "的姓名：");
            players.add(new Player(scanner.next()));
        }
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
    
    /**
     * @Description:    输出所有已经出现过的牌
     * @Author:         wangyu08334
     * @Date:           2019年5月10日 下午7:49:29
     */
    public void printUsedCards() {
        System.out.println("-------------已出牌如下--------------");
        for (PaiGow paiGow : paiGowsUsed) {
            System.out.println(paiGow.toString());
        }
    }
    
    /**
     * @Description:    输出所有玩家的手牌
     * @Author:         wangyu08334
     * @Date:           2019年5月10日 下午7:49:51
     */
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
        // 初始化牌集
        paiGowTest.initPaiGows();
        // 输出初始化牌集的信息
        // paiGowTest.printPaiGows();
        // 初始化四位玩家
        paiGowTest.initPlayers();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("输入1开始发牌，输入其他结束游戏");
            int go = scanner.nextInt();
            if (1 == go) {
                // 开始为四位玩家随机发牌
                paiGowTest.randomCards();
                // 展示所有玩家的手牌
                paiGowTest.showPlayersPaiGows();
                // 输出已经出现的所有牌
                paiGowTest.printUsedCards();
            } else {
                System.out.println("游戏结束，谢谢！");
                break;
            }
            if (paiGowTest.paiGowsUsed.size() >= 32) {
                System.out.println("所有牌已发完，请输入选择：");
                System.out.println("输入1，自动洗牌，继续下一局");
                System.out.println("输入其他信息，结束游戏");
                go = scanner.nextInt();
                if (1 == go) {
                    paiGowTest.paiGowsUsed.clear();
                    System.out.println("自动洗牌完成，继续下一局");
                } else {
                    System.out.println("游戏结束，谢谢！");
                    break;
                }
            }
        }
        scanner.close();
    }

}
