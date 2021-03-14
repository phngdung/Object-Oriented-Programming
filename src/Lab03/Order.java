package src.Lab03;

public class Order {
	public static final int MAX_NUMBERS_ORDERED =10;
	
	private DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered = 0 ;

    public int getQtyOrdered(){
        return this.qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered){
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered >= MAX_NUMBERS_ORDERED -1)
            System.out.println("The order is almost full !");
        else{
            int i = this.qtyOrdered;
            itemsOrdered[i] = disc;
            this.setQtyOrdered(++i);
            System.out.println("The disc has been added .");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int i =0 ; i < qtyOrdered ; i++){
            if(itemsOrdered[i].getTitle().equals(disc.getTitle())){
            	itemsOrdered[i] = itemsOrdered[i+1];
                qtyOrdered --;
                break;
            }
        }
    }

    public float totalCost(){
        float cost = 0;
        for(int i = 0 ; i < this.qtyOrdered ; i++){
            cost += this.itemsOrdered[i].getCost();
        }
        return cost;
    }

    public DigitalVideoDisc searchDiscByTitle(String title){
        for(int i =0 ; i < qtyOrdered ; i++){
            if(itemsOrdered[i].getTitle().equals(title)){
               return itemsOrdered[i];
            }
        }
        return null;
    }
}
