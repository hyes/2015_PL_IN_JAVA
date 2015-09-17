package mart;

import exception.CartListException;


public class Cart {

	private String[] list;
	
	public void put(String cartList) throws CartListException {
	
		if(cartList.isEmpty()){
			throw new CartListException("cart must have more than 1 item");
		}else{
			list = split(cartList);
			showAll(list);
		}
	}

	private void showAll(String[] list) {
		System.out.println("선택한 상품 안내");
		for(int i =0; i < list.length; i++){
			System.out.print((i+1) +"." + list[i] + " \t");
		}
	}

	private String[] split(String cartList){
		return cartList.split(", |, |,|\n");
	}

	public int calculate() {
		if(list == null){
			System.out.println("계산할 대상이 없습니다. ");
			return 0;
			
		}else if(list != null){
			return SmallMart.getInstance().calculate(list);
		}
		
		 return 0;
	}

}
