package models;

/**
 *
 * @author Honeylene Insular
 */
public class Note {
    
    String title ="";
    String content ="";
    
    public Note(String title, String content){
    
        this.title = title;
        this.content = content;
    }
    
    public String getTitle(){
        
        return title;
    }
    
    public String getContent(){
    
        return content;
    }
    
    public void setContent(String content){
    
        this.content = content;
    }
}
