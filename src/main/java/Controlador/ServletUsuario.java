package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudUsuarioImp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ServletUsuario
 */
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CrudUsuarioImp daotbUsu = new CrudUsuarioImp();
		
		String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        TblUsuariocl2 usuarioEntity = new TblUsuariocl2();
        usuarioEntity.setUsuariocl2(usuario);
        usuarioEntity.setPasswordcl2(password);

        String mensaje = daotbUsu.ValidarUsuario(usuarioEntity);
        response.getWriter().println(mensaje);
        
        if(mensaje.equals("Bienvenido : " + usuario)) {
			request.getRequestDispatcher("/RegisProducto.jsp").forward(request, response);
		} else {
			System.out.println("Surgió un problema, intentelo nuevamente");
		}
		doGet(request, response);
	}
}
