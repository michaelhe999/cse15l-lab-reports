import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> added = new ArrayList<String>();

    public String handleRequest(URI url) {
        if(url.getPath().equals("/")){
            String returns = "";
            for(int i = 0; i < added.size(); i++){
                returns = returns + added.get(i) + "\n";
            }
            return returns;
        }
        else if (url.getPath().equals("/add-message")) {
            String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    added.add(parameters[1]);
                    String returns = "";
                    for(int i = 0; i < added.size(); i++){
                        returns = returns + added.get(i) + "\n";
                    }
                    return returns;
                }
            } 
            return "404 Not Found!";
        }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
