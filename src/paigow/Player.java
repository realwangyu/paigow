/**     
  * 文件描述
  * @ProjectName:    paigow
  * @Package:        paigow
  * @FileName:		 Player.java
  * @TypeName:		 Player
  * @Description:    note
  * @Author:         wangyu08334
  * @CreateDate:     2019年5月10日 下午5:18:15
  * @UpdateUser:     wangyu08334
  * @UpdateDate:     2019年5月10日 下午5:18:15
  * @UpdateRemark:   The modified content
  * @Version:        1.0
  *
  * Copyright © 2019 WANGYU. All Rights Reserved
**/
package paigow;

/**
 * @Description:    note
 * @Author:         wangyu08334
 * @Date:           2019年5月10日 下午5:18:15
 */
public class Player {
    
    private String name;
    // 庄家标志
    private boolean isBanker = false;
    // 每个玩家两张手牌
    private PaiGow paiGow1;
    private PaiGow paiGow2;
    /**
     * @return the paiGow1
     */
    public PaiGow getPaiGow1() {
        return paiGow1;
    }
    /**
     * @param paiGow1 the paiGow1 to set
     */
    public void setPaiGow1(PaiGow paiGow1) {
        this.paiGow1 = paiGow1;
    }
    /**
     * @return the paiGow2
     */
    public PaiGow getPaiGow2() {
        return paiGow2;
    }
    /**
     * @param paiGow2 the paiGow2 to set
     */
    public void setPaiGow2(PaiGow paiGow2) {
        this.paiGow2 = paiGow2;
    }
    /**
     * @param name
     */
    public Player(String name) {
        super();
        this.name = name;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the isBanker
     */
    public boolean isBanker() {
        return isBanker;
    }
    /**
     * @param isBanker the isBanker to set
     */
    public void setBanker(boolean isBanker) {
        this.isBanker = isBanker;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "玩家 [姓名：" + name + ", 是否庄家=" + isBanker + "]";
    }
    
    public void showPaiGows() {
        System.out.println("玩家：" + this.getName() + "的两张手牌分别是："
                + this.getPaiGow1().toString()
                + this.getPaiGow2().toString());
    }
}
