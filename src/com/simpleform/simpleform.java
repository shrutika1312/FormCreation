package com.simpleform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class simpleform
 */
@WebServlet("/simpleform")
public class simpleform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public simpleform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // read form fields
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String choices[] = request.getParameterValues("choice");
        String gender = request.getParameter("gender");
        if (gender.equals("male"))
        {
        	gender =  "Mr. ";
        }
        else if (gender.equals("female"))
        {
        	gender =  "Ms. ";
        }
        String email = request.getParameter("email");
        System.out.println(" " + gender + name + surname);
       // System.out.println(" " + surname);
        

if (choices != null) 
       {
            System.out.println("you requested for: ");
            for (String cho : choices) 
            {
                System.out.println("\t" + cho);
            }
       }    
        
        // do some processing here...
     
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h4>" + gender + name + " " + surname + " requests " + "</h4>";         
        for (String lang : choices) 
        {
        htmlRespone += "<h4> " + lang + "</h4>";
        }
        htmlRespone += "<h4> " + "\t" + "to email ID " + email + "</h4>";
        htmlRespone += "</html>";
        // return response
        writer.println(htmlRespone);
                
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		     
		    }
		    }
		

