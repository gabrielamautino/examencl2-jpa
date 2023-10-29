package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ServeletProducto
 */
public class ServeletProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletProducto() {
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
		TblProductocl2 prod = new TblProductocl2();
		CrudProductoImp crudProd= new CrudProductoImp();
		
		String nombre=request.getParameter("nombre");
		Double precioVen=Double.parseDouble(request.getParameter("venta"));
		Double precioComp=Double.parseDouble(request.getParameter("compra"));
		String estado=request.getParameter("estado");
		String descripci=request.getParameter("descripcion");
				
		
				
		prod.setNombrecl2(nombre);
		prod.setPrecioventacl2(precioVen);
		prod.setPreciocompcl2(precioComp);
		prod.setEstadocl2(estado);
		prod.setDescripcl2(descripci);
				
		crudProd.RegistrarProducto(prod);
		
		List<TblProductocl2> listaProducto=crudProd.ListaProducto();
		request.setAttribute("listado", listaProducto);
		request.getRequestDispatcher("/RegisProducto.jsp").forward(request, response);
		doGet(request, response);
	}

}

