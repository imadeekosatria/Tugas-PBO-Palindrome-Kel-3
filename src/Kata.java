public class Kata {
	//--------------- PRIVATE -----------------//
	private String kata;
	protected boolean isKalimat;
	
		
	
	/* IS set 
	 * 
	 * menentukan apakah properti
	 * this.kata telah berisi sebuah
	 * string atau belum.
	 * */	
	private boolean isSet () {
		return this.kata == null ? false : true; 
	};
	
	/* IS kalimat
	 * @param str
	 * 
	 * menentukan apakah input yang
	 * dimasukkan kalimat atau bukan.
	 * Kalimat adalah rangkaian karakter
	 * yang mengandung tanda spasi.
	 * */
	protected boolean isKalimat (String str) {
		return str.contains(" ") ?  true : false;		
	};
	
	/* UTIL extract kata
	 * @param str
	 * 
	 * mengambil kata pertama dari sebuah
	 * kalimat.
	 * */	
	protected String extractKata (String str) {
		int indexOfSpace = this.isKalimat ? str.indexOf(" ") : 0;
		this.isKalimat = false;
		return str.substring(0, indexOfSpace);
	};
	
	/* GET kata
	 * 
	 * mengembalikan isi dari properti
	 * this.kata
	 * 
	 * */
	public String getKata () {
		return this.kata;
	};
	
	/* SET kata
	 * @param str
	 * 
	 * mengubah value dari properti
	 * this.kata. Value hanyalah sebuah kata.
	 * */
	public void setKata (String str) {
		this.isKalimat = isKalimat(str);
		this.kata = this.isKalimat ? extractKata(str) : str;
	};
	
	
	
	/* PRINT kata
	 * 
	 * menampilkan value dari variabel
	 * this.kata ke console.
	 * */
	public void printKata () {
		if (isSet())
			System.out.printf("[%s] termasuk kata palindrom\n", this.kata);
	};
	
	
	
	/* Kata
	 * @constructor Kata
	 * @param kata
	 * 
	 * menginisiasi properti this.kata 
	 * dengan sebuah kata dari
	 * kalimat pertama yang di input.
	 * 
	 * */
	public Kata (String kata) {
		setKata(kata);
	};
	
};



