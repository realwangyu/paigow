/**     
  * @ProjectName:    paigow
  * @Package:        paigow
  * @FileName:		 PaiGow.java
  * @TypeName:		 PaiGow
  * @Description:    note
  * @Author:         wangyu08334
  * @CreateDate:     2019年5月10日 下午4:17:31
  * @UpdateUser:     wangyu08334
  * @UpdateDate:     2019年5月10日 下午4:17:31
  * @UpdateRemark:   The modified content
  * @Version:        1.0
  *
  * Copyright © 2019 WANGYU. All Rights Reserved
**/
package paigow;

/**
 * @Description:    note
 * @Author:         wangyu08334
 * @Date:           2019年5月10日 下午4:17:31
 */
public class PaiGow implements Comparable<PaiGow>{
    // 牌的点数
    private int count;
    // 牌的名称
    private String name;
    // 牌的大小顺序
    private Integer order;

    /**
     * @param count
     * @param name
     * @param order
     */
    public PaiGow(int count, String name, Integer order) {
        super();
        this.count = count;
        this.name = name;
        this.order = order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * @return the order
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "[点数：" + count + ", 牌名：" + name + "]";
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(PaiGow arg0) {
        // TODO Auto-generated method stub
        return this.getOrder().compareTo(arg0.getOrder());
    }
}
