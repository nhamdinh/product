package controller;

import model.Product;
import service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
   private ProductServiceImpl productService = new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getParameter("action");
      if(action==null){
          action="";
      }
switch (action){
    case "create" :
        showCreateForm(request, response);
        break;
    case "edit":
        showEditForm(request, response);
        break;
    case "delete" :
        showDeleteForm(request, response);
        break;
    case "view":
        viewProduct(request, response);
        break;
    default:
        listProducts(request,response);
        break;


}


    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewProduct(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void  listProducts(HttpServletRequest request, HttpServletResponse response){
        List<Product> products = productService.findAll();
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        request.setAttribute("products",products);
        try {
            dispatcher.forward(request,response
            );
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
