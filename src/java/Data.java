import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.*;
import javax.servlet.http.*;

public class Data extends HttpServlet
{
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        { 
            String name =req.getParameter("uname");
            String gender =req.getParameter("ugender");
            String mobile =req.getParameter("umobile");
            String email =req.getParameter("uemail");
            String aadhar=req.getParameter("uaadhar");
            String bloodgroup=req.getParameter("ubgroup");
            String sclass=req.getParameter("uclass");
            String sem=req.getParameter("usem");
            
//            out.println("<h2>Name: "+name+"</h2>");
//            out.println("<h2>Gender: "+gender+"</h2>");
//            out.println("<h2>Mobile: "+mobile+"</h2>");
//            out.println("<h2>Email: "+email+"</h2>");
//            out.println("<h2>Aadhar: "+aadhar+"</h2>");
//            out.println("<h2>Bloodgroup: "+bloodgroup+"</h2>");
//            out.println("<h2>Sclass: "+sclass+"</h2>");
//            out.println("<h2>Sem: "+sem+"</h2>");
            
             try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jaydip","root","");
                    out.println("<h1>success<h1>");
                   
                    String sql= "INSERT INTO se values(?,?,?,?,?,?,?,?)";
                    PreparedStatement st= con.prepareStatement(sql);
     
                    st.setString(1,name);
                    st.setString(2,gender);
                    st.setString(3,mobile);
                    st.setString(4,email);
                    st.setString(5,aadhar);
                    st.setString(6,bloodgroup);
                    st.setString(7,sclass);
                    st.setString(8,sem);
                    
                    st.executeUpdate();
                   
                    out.println("<script>alert('Recored is inserted')</script>");
                    con.close();
                }   
                catch(Exception e)
                    {
                       e.printStackTrace();
                    }    
              out.println("<h1><a href='index.html'>HOME</a><h1>");
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
