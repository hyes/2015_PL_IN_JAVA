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
		System.out.println("������ ��ǰ �ȳ�");
		for(int i =0; i < list.length; i++){
			System.out.print((i+1) +"." + list[i] + " \t");
		}
	}

	private String[] split(String cartList){
		return cartList.split(", |, |,|\n");
	}

	public int calculate() {
		if(list == null){
			System.out.println("����� ����� �����ϴ�. ");
			return 0;
			
		}else if(list != null){
			return SmallMart.getInstance().calculate(list);
		}
		
		 return 0;
	}

}
