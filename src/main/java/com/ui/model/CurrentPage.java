package com.ui.model;

//import com.ui.component.MessageSourceLookup;
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

//@Getter
//@Setter
//@Data
public class CurrentPage {

    //private String name;
    private String title;
    private String jteName;
    private String lang;
    private String error;
    private String message;
    private String userName;
    //private MessageSourceLookup messages;
    public CurrentPage(String title, String jteName, String lang){
        //this.userName= userName;
        this.title= title;
        this.jteName= jteName;
        this.lang= lang;
        //this.messages= messages;
    }
    public String getTitle() {
        return title;
    }

    public String getLang() { return lang; }

    public boolean isSelected(String lang){
        return (this.lang == lang ? true : false);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //public MessageSourceLookup getMessages() {
    //    return messages;
    //}

    public String getJteName() {
        return jteName;
    }

    public void setJteName(String jteName) {
        this.jteName = jteName;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
        //setMessage(null);
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
        //setError(null);
    }
    public String getMapping(){

        return this.jteName.replace("pages-jte/", "");
    }

    //public void setMessages(MessageSourceLookup messages) {
    //    this.messages = messages;
    //}
}
