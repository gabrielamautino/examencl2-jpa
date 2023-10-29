package test;

import Dao.CrudUsuarioImp;
import model.TblUsuariocl2;

public class TestUsuario {
	
public static void main(String[] args) {
		
		TblUsuariocl2 usu = new TblUsuariocl2();
		CrudUsuarioImp crud = new CrudUsuarioImp();
		   
		usu.setUsuariocl2("Gabriela");
		usu.setPasswordcl2("1234567");   
		crud.RegistrarUsuario(usu);
		System.out.println("Usuario registado exitosamente");
	   		  	    
		//asignamos valores
//		usu.setUsuariocl2("Jheicer");
//		usu.setPasswordcl2("Jh3ic3r019");
//		String mensaje =crud.ValidarUsuario(usu);
//		
//		System.out.println(mensaje);
	}

}
