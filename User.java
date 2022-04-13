
import java.io.Serializable;  
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "user") 

public class User implements Serializable {  
   private static final long serialVersionUID = 1L; 
   private String name; 
   private int id; 
   private String language;
   private String framework;  
   public User(){} 
    
   public User(String name,  int id,  String language, String framework){  
      this.name = name; 
      this.id = id; 
      this.language = language;
      this.framework = framework; 
   }  
    
   public String getName() { 
      return name; 
   } 
   @XmlElement
   public void setName(String name) { 
      this.name = name; 
   } 
   public int getId() { 
      return id; 
   }  
   @XmlElement 
   public void setId(int id) { 
      this.id = id; 
   }
   public String getLanguage() { 
      return language; 
   } 
   @XmlElement 
   public void setLanguage(String Language) { 
      this.language = language; 
   }   
    public String getFramework() { 
      return framework; 
   } 
   @XmlElement 
   public void setFramework(String Framework) { 
      this.framework = framework; 
   }   
}