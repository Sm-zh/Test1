// import javafx.animation.KeyFrame;
// import javafx.animation.KeyValue;
// import javafx.animation.Timeline;
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
// import javafx.util.Duration;
// import javafx.scene.layout.BorderPane;
// import javafx.scene.layout.HBox;

// public class Lab16 extends Application {
//   ImageView imageView;
//   Image[] images = new Image[8];
//   int i = 0;
//   public static void main(String[] args) {
//     launch(args);
//   }

//   @Override
//     public void start(Stage primaryStage) {

//       HBox hbox = new HBox(5);
//       hbox.setAlignment (Pos.CENTER); 
//       hbox.setPadding (new Insets (10,10,10,10));

//       HBox hbox2 = new HBox(5);
//       hbox2.setAlignment (Pos.CENTER); 
//       hbox2.setPadding (new Insets (0,10,100,10));

//       HBox hbox3 = new HBox(5);
//       hbox3.setAlignment (Pos.CENTER); 
//       hbox3.setPadding (new Insets (10,10,10,10));

//       Button backButton = new Button("Back");
//       backButton.setPrefWidth (180); 
//       backButton.setPrefHeight(50);

//       Button nextButton = new Button("Next");
//       nextButton.setPrefWidth (180); 
//       nextButton.setPrefHeight(50);

//       Button slideShowButton = new Button("Slide Show");
//       slideShowButton.setPrefWidth(180);
//       slideShowButton.setPrefHeight(50);

//       Button exitButton = new Button("Exit");
//       exitButton.setPrefWidth (180); 
//       exitButton.setPrefHeight(50);

      
//       hbox.getChildren().add(backButton);
//       hbox.getChildren().add(slideShowButton);
//       hbox.getChildren().add(nextButton);
//       hbox2.getChildren().add(exitButton);

//       imageView = new ImageView(); 
//       imageView.setFitHeight(240);
//       imageView.setFitWidth(240);
//       for (int k = 0; k< 8; k++) {
//         images[k] = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/"+k+".png");
//       }
//       imageView.setImage(images[0]);

//       hbox3.getChildren().add(imageView);

//       BorderPane borderPane = new BorderPane();
//       borderPane.setCenter(hbox);
//       borderPane.setBottom(hbox2);
//       borderPane.setTop(hbox3);

//       Scene scene = new Scene (borderPane, 500, 500);
//       primaryStage.setScene (scene);
//       primaryStage.setTitle("MyJavaFX");
//       for (int k = 0; k<3;k++){
//         primaryStage.show();
//       }

//       nextButton.setOnAction(new NextButton());
//       slideShowButton.setOnAction(new SlideShowButton());
//       backButton.setOnAction(new BackButton());
//       exitButton.setOnAction(new ExitButton());
//     }

//     class NextButton implements EventHandler<ActionEvent> {
//       @Override
//       public void handle(ActionEvent e) {
//         if (i<7) {
//           i++;
//           imageView.setImage(images[i]);
//         }
//       }
//     }

//     class SlideShowButton implements EventHandler<ActionEvent> {
//       @Override
//       public void handle(ActionEvent e) {
        
//         Timeline timeline = new Timeline(
//                 new KeyFrame(Duration.seconds(0.5), new KeyValue(imageView.imageProperty(), images[1])),
//                 new KeyFrame(Duration.seconds(1), new KeyValue(imageView.imageProperty(), images[2])),
//                 new KeyFrame(Duration.seconds(1.5), new KeyValue(imageView.imageProperty(), images[3])),
//                 new KeyFrame(Duration.seconds(2), new KeyValue(imageView.imageProperty(), images[4])),
//                 new KeyFrame(Duration.seconds(2.5), new KeyValue(imageView.imageProperty(), images[5])),
//                 new KeyFrame(Duration.seconds(3), new KeyValue(imageView.imageProperty(), images[6]))
//                 );
                

//                 timeline.setCycleCount(Timeline.INDEFINITE);

//       timeline.setAutoReverse(true);
//       timeline.play();
//       }
//     }

//     class BackButton implements EventHandler<ActionEvent> {
//       @Override
//       public void handle(ActionEvent e) {
//         if (i>0) {
//           i--;
//           imageView.setImage(images[i]);
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
  
