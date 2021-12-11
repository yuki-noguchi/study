package study.basic.objectoriented.polymorphism.spredsheet;

public class Main {

	public static void main(String[] args) {
		Excel2000 excel2000 = new Excel2000();
		excel2000.calc(1, 2);

		Spredsheet excel = new Excel2000();
		excel.calc(1, 32);
		Spredsheet googleSpredsheet = new GoogleSpredsheet();
		googleSpredsheet.calc(1, 32);
	}
}
//走るもの
//曲がるもの
//
//乗り物
//車
//軽自動車
//ワゴンR
