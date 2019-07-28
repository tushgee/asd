package lesson4TemplateMethod;

public class SlowOrderProcessor extends AOrderProcessor {
    @Override
    public float getShippingFee(IOrder order) {
        // calculate shipping cost based on order details
        return 999;
    }

    @Override
    public int getShippingTime(IOrder order) {
        // get shipping time based on shipping address
        return 60;
    }

    @Override
    public void sendConfirmation(String orderDetails, float shippingFee, int shippingTime) {
        // send by email
    }
}
