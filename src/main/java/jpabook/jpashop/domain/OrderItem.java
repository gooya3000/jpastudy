package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class OrderItem {
    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long Id;
    /*@Column(name = "ORDER_ID")
    private Long orderId;*/
    @ManyToOne
    @JoinColumn(name="ORDER_ID")
    private Order order;
    /*@Column(name = "ITEM_ID")
    private Long itemId;*/
    @ManyToOne
    @JoinColumn(name="ORDER_ID")
    private OrderItem ITEM_ID;

    private int orderPrice;
    private int count;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    /*public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }*/

    /*public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }*/

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderItem getITEM_ID() {
        return ITEM_ID;
    }

    public void setITEM_ID(OrderItem ITEM_ID) {
        this.ITEM_ID = ITEM_ID;
    }
}
