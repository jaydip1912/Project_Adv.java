
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


public class Fatch extends HttpServlet
{
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        {
//            Connection con=null;
            
            String name =req.getParameter("uname");
            String gender =req.getParameter("ugender");
            String mobile =req.getParameter("umobile");
            String email =req.getParameter("uemail");
            String aadhar=req.getParameter("uaadhar");
            String bloodgroup=req.getParameter("ubgroup");
            String sclass=req.getParameter("uclass");
            String sem=req.getParameter("usem");
            
            
            
            
            
            out.println("<h2>Name: "+name+"</h2>");
            out.println("<h2>Gender: "+gender+"</h2>");
            out.println("<h2>Mobile: "+mobile+"</h2>");
            out.println("<h2>Email: "+email+"</h2>");
            out.println("<h2>Aadhar: "+aadhar+"</h2>");
            out.println("<h2>Bloodgroup: "+bloodgroup+"</h2>");
            out.println("<h2>Sclass: "+sclass+"</h2>");
            out.println("<h2>Sem: "+sem+"</h2>");
//            try
//            {
//                PreparedStatement ps =con.prepareStatement("select * from se");
//                ps.executeUpdate();
//                ResultSet rs=ps.executeQuery();
//                
//                while(rs.next())
//                        {
//                            System.out.println(rs.getString(1)+rs.getString(2));
//                        }
//            } 
//            catch(Exception e)
//            {
//                e.printStackTrace();
//            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
