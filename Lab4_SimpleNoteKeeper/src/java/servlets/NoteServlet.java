package servlets;

import java.io.*;
import java.io.File;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;


public class NoteServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        final String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        BufferedReader text = new BufferedReader(new FileReader(new File(path)));
        
        String title = text.readLine();
        String content = text.readLine();
        text.close();
        
        Note note = new Note (title, content);
        request.setAttribute("note", note);
        String edit = request.getParameter("edit");
        
        if (edit == null)
        {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
        }
        
        else if (edit == "")
        {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        
        return;
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String tEdit = request.getParameter("title_edit");
            String cEdit = request.getParameter("content_edit");
            
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            
            Printwriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
            
            pw.println(tEdit);
            pw.println(cEdit);
            pw.close();
            
            Note editNote = new Note(tEdit, cEdit);
            request.setAttribute("note", editNote);
            getServletContext().getDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
    }


}
