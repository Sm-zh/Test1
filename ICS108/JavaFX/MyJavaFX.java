
// import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.geometry.Insets;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.stage.Stage;
// import javafx.scene.layout.BorderPane;
// import javafx.scene.layout.HBox;

// public class MyJavaFX extends Application {
//   ImageView imageView;
//   Button exitButton;
//   int i = 0;
//   public static void main(String[] args) {
//     launch(args);
//   }

//   @Override
//     public void start(Stage primaryStage) {

//       HBox hbox= new HBox(5);
//       hbox.setAlignment (Pos.CENTER); 
//       hbox.setPadding (new Insets (10,10,10,10));

//       HBox hbox2= new HBox(5);
//       hbox2.setAlignment (Pos.CENTER); 
//       hbox2.setPadding (new Insets (0,10,100,10));

//       HBox hbox3= new HBox(5);
//       hbox3.setAlignment (Pos.CENTER); 
//       hbox3.setPadding (new Insets (10,10,10,10));

//       Button backButton = new Button("Back");
//       backButton.setPrefWidth (200); 
//       backButton.setPrefHeight(60);

//       Button nextButton = new Button("Next");
//       nextButton.setPrefWidth (200); 
//       nextButton.setPrefHeight(60);

//       exitButton = new Button("Exit");
//       exitButton.setPrefWidth (200); 
//       exitButton.setPrefHeight(60);

      
//       hbox.getChildren().add(backButton);
//       hbox.getChildren().add(nextButton);
//       hbox2.getChildren().add(exitButton);

//       imageView = new ImageView(); 
//       imageView.setFitHeight(240);
//       imageView.setFitWidth(240);
//       Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/0.png");
//       imageView.setImage(image);

//       hbox3.getChildren().add(imageView);

//       BorderPane borderPane = new BorderPane();
//       borderPane.setCenter(hbox);
//       borderPane.setBottom(hbox2);
//       borderPane.setTop(hbox3);

//       Scene scene = new Scene (borderPane, 500, 500);
//       primaryStage.setScene (scene);
//       primaryStage.setTitle("MyJavaFX");
//       primaryStage.show();

//       nextButton.setOnAction(new NextButton());
//       backButton.setOnAction(new BackButton());
//       exitButton.setOnAction(new ExitButton());
//     }

//     class NextButton implements EventHandler<ActionEvent> {
//       @Override
//       public void handle(ActionEvent e) {
//         if (i<7) {
//           i++;
//           Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/"+i+".png");
//           imageView.setImage(image);
//         }
//       }
//     }

//     class BackButton implements EventHandler<ActionEvent> {
//       @Override
//       public void handle(ActionEvent e) {
//         if (i>0) {
//           i--;
//           Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/"+i+".png");
//           imageView.setImage(image);
//         }
//       }
//     }

//     class ExitButton implements EventHandler<ActionEvent> {
//       @Override
//       public void handle(ActionEvent e) {
//         System.exit(0);
//       }
//     }
//   }
  
