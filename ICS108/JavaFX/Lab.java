// import javafx.application.Application;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.layout.Background;
// import javafx.scene.layout.BackgroundFill;
// import javafx.scene.layout.BorderPane;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.VBox;
// import javafx.scene.paint.Color;
// import javafx.stage.Stage;
// import javafx.geometry.Insets;


// public class Lab extends Application {
//     public static void main(String[] args) {
//       launch(args);
//     }

//     @Override
//     public void start(Stage primaryStage) {

//       HBox hbox= new HBox(5);
//       hbox.setAlignment(Pos.CENTER); 
//       hbox.setPadding(new Insets (10,10,10,10));

//       HBox hbox2= new HBox(5);
//       hbox2.setPrefHeight(80);
//       hbox2.setAlignment(Pos.CENTER); 
//       // hbox2.setPadding(new Insets (10,10,10,10));
//       hbox2.setBackground(new Background(new BackgroundFill(Color.rgb(26,27,128),null,null)));

//       VBox[] vboxes = new VBox[5];
//       for (int i = 0; i<5; i++) {
//           vboxes[i] = new VBox(5);
//           // vboxes[i].setPrefHeight(20);
//           vboxes[i].setPrefWidth(90);
//           vboxes[i].setAlignment(Pos.TOP_CENTER); 
//           vboxes[i].setBackground(new Background(new BackgroundFill(Color.rgb(40,41,42),null,null)));
//           hbox.getChildren().add(vboxes[i]);
//       }

//       vboxes[0].getChildren().add(hbox2);
//       hbox2.setOnMouseDragged(e->hbox2.setBackground(new Background(new BackgroundFill(Color.rgb(140,141,142),null,null))));

//       BorderPane borderPane = new BorderPane();
//       borderPane.setPadding(new Insets(20,20,20,20));
//       borderPane.setCenter(hbox);
//       borderPane.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));

//       Scene scene = new Scene (borderPane, 720, 480);
//       primaryStage.setScene (scene);
//       primaryStage.setTitle("MyJavaFX");
//       primaryStage.show();
//     }
// }
