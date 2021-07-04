/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registerform;

/**
 *
 * @author Vikram
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegisterServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>welcome to register servlet<h1>");
        String name=req.getParameter("username");
        String pass=req.getParameter("user_password");
        String email=req.getParameter("user_email");
        String gender=req.getParameter("user_gender");
        String course=req.getParameter("user_course");
        String cond=req.getParameter("condition");
        if(cond!=null){
        if(cond.equals("checked"))
        {
            out.println("<h2>username is:" + name +"</h2>");
            out.println("<h2>password is:" + pass +"</h2>");
            out.println("<h2>email is:" + email +"</h2>");
            out.println("<h2>gender is:" + gender +"</h2>");
            out.println("<h2>course is:" + course +"</h2>");
            
            RequestDispatcher rd=req.getRequestDispatcher("SuccessServlet");//url pattern of SuccessServlet class
            rd.forward(req, resp);
            
          
        }
        }else
        {
            out.println("<h2>you have not accepted Terms & Condition</h2>");
        }
        // i want to  include output of index.html
       RequestDispatcher rd=req.getRequestDispatcher("index.html");
       rd.include(req, resp);
    
    
    
    
    
    }
    
    
    
}
