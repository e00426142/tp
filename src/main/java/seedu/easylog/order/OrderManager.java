package seedu.easylog.order;

import seedu.easylog.item.Item;

import java.util.ArrayList;

/**
 * Manage order list manipulation commands.
 */
public class OrderManager {

    private static final ArrayList<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    /**
     * Deletes an order from this list of orders.
     *
     * @param index the number of the order to be deleted.
     */
    public void deleteOrder(int index) {
        orderList.remove(index);
    }

    /**
     * Gets the item list under a specific order.
     *
     * @param index the number of this order
     * @return a item list
     */
    public Order getOrder(int index) {
        return orderList.get(index);
    }

    /**
     * Gets the number of orders in the system.
     *
     * @return the size of order list
     */
    public int getSize() {
        return orderList.size();
    }

    /**
     * Gets the customer's name specified by the index
     * of the order given.
     *
     * @param index index of the order given
     * @return customer's name specified by the index of the order given
     */
    public String getCustomerName(int index) {
        return getOrder(index).getCustomerName();
    }

    /**
     * Gets the customer's items specified by the index
     * of the order given.
     *
     * @param index index of the order given
     * @return customer's items specified by the index of the order given
     */
    public ArrayList<Item> getItems(int index) {
        return getOrder(index).getItemsInOrder();
    }

    /**
     * Clears all orders in the system.
     */
    public void clearOrderList() {
        orderList.clear();
    }
}
