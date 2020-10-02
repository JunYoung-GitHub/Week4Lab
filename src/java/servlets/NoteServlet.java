package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 710429
 */
public class NoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            //String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            //BufferedReader br = new BufferedReader(new FileReader(new File(path)));
             getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        //PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
        
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request, response);
    }

}
