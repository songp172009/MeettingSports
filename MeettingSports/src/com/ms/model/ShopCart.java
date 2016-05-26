package com.ms.model;

import java.io.Serializable;

public class ShopCart implements Serializable {

	/**
	 * @author jiachao
	 */
	private static final long serialVersionUID = 1L;
		private String cartId;
		private String gvmId;
		private String num;
		private float memberPrice;
		private float marketPrice;
		private String memberId;
		private String  a1;
		
		
		public ShopCart() {
			super();
		}
		public ShopCart(String cartId, String gvmId, String num,
				float memberPrice, float marketPrice, String memberId, String a1) {
			super();
			this.cartId = cartId;
			this.gvmId = gvmId;
			this.num = num;
			this.memberPrice = memberPrice;
			this.marketPrice = marketPrice;
			this.memberId = memberId;
			this.a1 = a1;
		}
		public String getCartId() {
			return cartId;
		}
		public void setCartId(String cartId) {
			this.cartId = cartId;
		}
		public String getGvmId() {
			return gvmId;
		}
		public void setGvmId(String gvmId) {
			this.gvmId = gvmId;
		}
		public String getNum() {
			return num;
		}
		public void setNum(String num) {
			this.num = num;
		}
		public float getMemberPrice() {
			return memberPrice;
		}
		public void setMemberPrice(float memberPrice) {
			this.memberPrice = memberPrice;
		}
		public float getMarketPrice() {
			return marketPrice;
		}
		public void setMarketPrice(float marketPrice) {
			this.marketPrice = marketPrice;
		}
		public String getMemberId() {
			return memberId;
		}
		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}
		public String getA1() {
			return a1;
		}
		public void setA1(String a1) {
			this.a1 = a1;
		}
		@Override
		public String toString() {
			return "ShopCart [cartId=" + cartId + ", gvmId=" + gvmId + ", num="
					+ num + ", memberPrice=" + memberPrice + ", marketPrice="
					+ marketPrice + ", memberId=" + memberId + ", a1=" + a1
					+ "]";
		}
		
		
}
