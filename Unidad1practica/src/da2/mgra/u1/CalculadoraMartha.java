package da2.mgra.u1;

import java.io.Serializable;

public class CalculadoraMartha implements Serializable {
	
	
		private double valueX;
		private double valueY;
		private double result;
		
		public CalculadoraMartha() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CalculadoraMartha(double valueX, double valueY, double result) {
			super();
			this.valueX = valueX;
			this.valueY = valueY;
			this.result = result;
			
		}
		
		
		public double getValueX() {
			return valueX;
		}
		public void setValueX(double valueX) {
			this.valueX = valueX;
		}
		public double getValueY() {
			return valueY;
		}
		public void setValueY(double valueY) {
			this.valueY = valueY;
		}
		public double getResult() {
			
		return (2*valueX+1)*(3*valueY-4);
		}
		public void setResult(double result) {
			this.result = result;
		}
		@Override
		public String toString() {
			return "CalculadoraMartha [valueX=" + valueX + ", valueY=" + valueY + ", result=" + result + "]";
		}
		
		
		
		
		
		
}
