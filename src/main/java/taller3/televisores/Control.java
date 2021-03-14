package taller3.televisores;

public class Control {
	TV tv;
	//metodos turnON y turnOff
	public void turnOn() {
		tv.estado = true;
	}
	
	public void turnOff() {
		tv.estado = false;
	}

	public boolean getEstado(){
		return tv.estado;
	}
	
	//metodos de aumentar/subir el canal/volumen
	
	public void canalUp(){
		
		if(tv.estado == true) {
			if( 1<=tv.canal && tv.canal<120) {
				tv.canal++;
		
			}
		}
		else {
			
			
		}
		
	}

	public void canalDown(){
		if(tv.estado == true) {
			if( 1< tv.canal && tv.canal<=120) {
				tv.canal--;
		
			}
		}
		
		else {
			
		}
		
	
	
	}

	public void volumenUp(){
		if(tv.estado == true) {
			if( 0<=tv.canal && tv.canal<7) {
				tv.volumen++;
		
			}
		}
		
	}

	public void volumenDown(){
		if(tv.estado == true) {
			if( 0<tv.canal && tv.canal<=7) {
				tv.volumen--;
		
			}
		}
		
	}
	
	public void setCanal(int canal) {
		if(tv.estado == true) {
			if(1 <= canal && canal<=120) {
				tv.canal = canal;
		
			}
		}
	}
	

		
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this;
		
		
	}
	
	
	public TV getTv(){
		return this.tv;
		
	}
	
	public void setTv(TV tv){
		this.tv = tv;
		
		
	}


}
