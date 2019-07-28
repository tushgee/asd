package lesson4TemplateMethod;
/*  for bulky and heavy items but buyers are willing to wait
    longer to reduce the shipping cost.
    Logistics company uses sea containers.
 */
public class SlowOrderProcessor extends AOrderProcessor {
    @Override
    public float getShippingFee(IOrder order) {
        float shippingFee=999;
        // calculate shipping cost based on order details
        return shippingFee;
    }

    @Override
    public int getShippingTime(IOrder order) {
        int shippingTime=999;
        // get shipping time based on shipping address
        return shippingTime;
    }

    @Override
    public void sendConfirmation(String orderDetails, float shippingFee, int shippingTime) {
        // send by email
    }
}
