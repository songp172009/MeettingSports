package Test;

public class test {
    	private Integer productId;
		private String productName;
		private String productDesc;
		
		private double productPrice;

		public Integer getProductId() {
			return productId;
		}
		
		public void setProductId(Integer productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductDesc() {
			return productDesc;
		}

		public void setProductDesc(String productDesc) {
			this.productDesc = productDesc;
		}

		public double getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName="
					+ productName + ", productDesc=" + productDesc
					+ ", productPrice=" + productPrice + "]";
		}
			
		public String test(){
			System.out.println("test");
			return "success";
		}
		
		public test() {
			System.out.println("登陆成功！");
		}
		
	}


