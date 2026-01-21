class  discount{
    public static void main(String[] args) {
		double fee=125000.00;
		double dis=0.10;
		double disamount=fee*dis;
		double finaldis=fee-disamount;
		System.out.println("The discount amount is " + disamount +" and final discounted fee is " + finaldis);
	}
}
