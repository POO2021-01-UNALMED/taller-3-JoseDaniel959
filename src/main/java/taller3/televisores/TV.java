package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado  ;
	int volumen = 1;
	Control control;
	static int numTV;
	
	public TV(Marca marca,boolean estado ) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	// el get y set de marca
	public Marca getMarca() {
		return this.marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	
	// el get y set de control
	public Control getControl() {
		return this.control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}

	
	// el get y set de precio
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// el get y set de volumen
	public int getVolumen() {
		return this.volumen;
	}
			
	public void setVolumen(int volumen) {
		if(this.estado == true) {
			if(0 <= volumen && volumen <=7) {
				this.volumen = volumen;
		
			}
		}
		
	}

	// el get y set de canal
	public int getCanal() {
		return this.canal;
	}
			
	public void setCanal(int canal) {
		if(this.estado == true) {
			if(1<= canal && canal<=120) {
				this.canal = canal;
		
			}
		}
	}


	//metodos turnON y turnOff
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}

	public boolean getEstado(){
		return this.estado;
	}
	
	//metodos de aumentar/subir el canal/volumen
	
	public void canalUp(){
		
		if(this.estado == true) {
			if( 1<= this.canal && this.canal<120) {
				canal++;
		
			}
		}
		else {
			
			
		}
		
	}

	public void canalDown(){
		if(this.estado == true) {
			if( 1< this.canal&& this.canal<=120) {
				canal--;
		
			}
		}
		
		else {
			
		}
		
	
	
	}

	public void volumenUp(){
		if(this.estado == true) {
			if( 0<=this.volumen && this.volumen<7) {
				this.volumen++;
		
			}
		}
		
	}

	public void volumenDown(){
		if(this.estado == true) {
			if( 0<this.volumen && this.volumen<=7) {
				this.volumen--;
		
			}
		}
		
	}
	
	
	
	/**
	 * 
	 */
	public static void setNumTV(int numtv){
		numTV = numtv;
		
	}
	
	public static int getNumTV() {
		return numTV;
		
	}
	
	
	
}
