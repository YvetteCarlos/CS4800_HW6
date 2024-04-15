package org.example;

import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public class Driver{
    public static void main(String[] args) {

     }
    }

    public class Message{
    private String sender;
    private List<String> recepients;
    private String timeStamp;
    private String messageContent;

    public Message (String sender, List<String> recepients, String timeStamp, String messageContent){
        this.sender = sender;
        this.recepients = recepients;
        this.messageContent = messageContent;
        this.timeStamp = timeStamp;
    }

        public String getSender() {

            return sender;
        }

        public List<String> getRecepients() {
            return recepients;
        }

        public String getTimeStamp() {
            return timeStamp;
        }

        public String getMessageContent() {
            return messageContent;
        }
    }

    public class User{
        private String user;
        private ChatHistory chatHistory;
        private ChatServerMediator chatServerMediator;


        public User(String user, ChatHistory chatHistory, ChatServerMediator chatServerMediator){ //making an object of the class
            this.user = user;
            this.chatHistory = chatHistory;
            this.chatServerMediator = chatServerMediator;
            chatServerMediator.Register(this);
            chatServerMediator.Unregister(this);
            chatServerMediator.BlockMessages(this);
        }

        public void sendMessage(List<String> recepients, String messageContent, String timeStamp){//sends messages
            Message message = new Message(user, recepients, messageContent, timeStamp); //create instance of message class
        chatServerMediator.sendMessages(message); // invokes method sendMessages of chatServerMediator object, passes message object
        chatHistory.addMessage(message); //invokes addMessage method of chatHistory object and passes message

        }
        public void receiveMessage(List<String> recepients, String messageContent,String timeStamp){ //receives and prints out what user has sent
            Message message = new Message(user, recepients, messageContent, timeStamp);
         chatHistory.addMessage(message);
         System.out.println(user + "has sent: " + message.getMessageContent());
        }

        public void undoMessage(List<String> recepients, String messageContent, String timeStamp){
            String lastMessage = chatHistory.getLastMessage();
            //goes to previous string

        }

    }

    public class ChatServerMediator{
        private Message message;
        private User user;

        private HashMap<String, String> Users = new HashMap<String, String>();

        public ChatServerMediator(Message message, User user){

        }



        public void Register(User user){
            this.user = user;


        }

        public void Unregister(User user){
            this.user = user;

        }

        public void sendMessages(Message message){
            this.message = message;


        }

        public void BlockMessages(User user){

            if(user.equals("User1")){
                System.out.println("User Blocked");
            }

        }
    }

    public class ChatHistory{

        public void addMessage(Message message){


        }

        public String getLastMessage(){
            return null;

        }

        public void deleteLastMessage(){

        }

    }

    public class messageMemento{
        private String state;
        public messageMemento(String state){
            this.state  = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}