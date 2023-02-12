
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
// import javafx.scene.layout.Background;
// import javafx.scene.layout.BackgroundFill;
// import javafx.scene.layout.BorderPane;
// import javafx.scene.layout.HBox;
// import javafx.scene.paint.Color;

// public class Contest extends Application {
//     ImageView imageView;
//     ImageView imageView2;
//     ImageView imageView3;
//     Button oneButton;
//     Button twoButton;
//     Button threeButton;
//     Button againButton;
//     int i = 0;
//     int j = 0;
//     int o = 0;
//     int t = 0;
//     int th = 0;
//     int ran = (int) (1+Math.random() * 3);

//     public static void main(String[] args) {
//         launch(args);
//     }

//     @Override
//     public void start(Stage primaryStage) {
//         System.out.println(ran);
//         HBox hbox= new HBox(5);
//         hbox.setAlignment (Pos.CENTER); 
//         hbox.setPadding (new Insets (10,10,10,10));

//         HBox hbox2= new HBox(5);
//         hbox2.setAlignment (Pos.CENTER); 
//         hbox2.setPadding (new Insets (0,10,200,10));

//         HBox hbox3= new HBox(5);
//         hbox3.setAlignment (Pos.CENTER); 
//         hbox3.setPadding (new Insets (10,10,10,10));

//         oneButton = new Button("1");
//         twoButton = new Button("2");
//         threeButton = new Button("3");
//         againButton = new Button("Play Again");
//         oneButton.setPrefWidth (205); 
//         oneButton.setPrefHeight(50);
//         twoButton.setPrefWidth (205); 
//         twoButton.setPrefHeight(50);
//         threeButton.setPrefWidth (205); 
//         threeButton.setPrefHeight(50);
//         againButton.setPrefWidth (205); 
//         againButton.setPrefHeight(50);
//         oneButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//         twoButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//         threeButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//         againButton.setBackground(Background.EMPTY);
//         againButton.setTextFill(null);
        
//         hbox.getChildren().add(oneButton);
//         hbox.getChildren().add(twoButton);
//         hbox.getChildren().add(threeButton);
//         hbox2.getChildren().add(againButton);

//         imageView = new ImageView(); 
//         imageView.setFitHeight(322);
//         imageView.setFitWidth(205);
//         Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/closed.png");
//         imageView.setImage(image);

//         imageView2 = new ImageView(); 
//         imageView2.setFitHeight (322);
//         imageView2.setFitWidth(205);
//         Image image2 = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/closed.png");
//         imageView2.setImage(image2);

//         imageView3 = new ImageView(); 
//         imageView3.setFitHeight (322);
//         imageView3.setFitWidth(205);
//         Image image3 = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/closed.png");
//         imageView3.setImage(image3);

//         hbox3.getChildren().add(imageView);
//         hbox3.getChildren().add(imageView2);
//         hbox3.getChildren().add(imageView3);


//         BorderPane borderPane = new BorderPane();
//         borderPane.setCenter(hbox);
//         borderPane.setBottom(hbox2);
//         borderPane.setTop(hbox3);

//         Scene scene = new Scene (borderPane, 1000, 700);
//         primaryStage.setScene (scene);
//         primaryStage.setTitle("MyJavaFX");
//         primaryStage.show();

//         oneButton.setOnAction(new OneButton());
//         twoButton.setOnAction(new TwoButton());
//         threeButton.setOnAction(new ThreeButton());
//         againButton.setOnAction(new AgainButton());

//     }

//     class OneButton implements EventHandler<ActionEvent> {
//         @Override
//         public void handle(ActionEvent e) {
//             if (i == 0 && o == 0 && j == 0) {
//                 i++;
//                 o++;
//                 Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/slitly.png");
//                 imageView.setImage(image);
//                 oneButton.setBackground(new Background(new BackgroundFill(Color.ORANGE,null,null)));
//             }
//             else if (i == 1 && o == 1 && j == 0) {
//                 j++;
//                 if (ran == 1) {
//                     twoButton.setBackground(Background.EMPTY);
//                     threeButton.setBackground(Background.EMPTY);
//                     oneButton.setBackground(new Background(new BackgroundFill(Color.GREEN,null,null)));
//                     againButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                     againButton.setTextFill(Color.BLACK);
//                     Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/cat.png");
//                     imageView.setImage(image);
//                 }
//                 else {
//                     twoButton.setBackground(Background.EMPTY);
//                     threeButton.setBackground(Background.EMPTY);
//                     oneButton.setBackground(new Background(new BackgroundFill(Color.RED,null,null)));
//                     againButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                     againButton.setTextFill(Color.BLACK);
//                     Image madImage = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/mad.png");
//                     imageView.setImage(madImage);
//                     Image catImage = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/cat.png");
//                     if (ran == 2) {
//                         imageView2.setImage(catImage);
//                     }
//                     else {
//                         imageView3.setImage(catImage);
//                     }
//                 }
//             }
//             else if (i == 1 && o == 0 && j == 0) {
//                 o++;
//                 t=0;
//                 th=0;
//                 oneButton.setBackground(new Background(new BackgroundFill(Color.ORANGE,null,null)));
//                 twoButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                 threeButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                 Image image2 = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/closed.png");
//                 imageView2.setImage(image2);
//                 imageView3.setImage(image2);
//                 Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/slitly.png");
//                 imageView.setImage(image);
//             }
//         }
//     }

//     class TwoButton implements EventHandler<ActionEvent> {
//         @Override
//         public void handle(ActionEvent e) {
//             if (i == 0 && t == 0 && j == 0) {
//                 i++;
//                 t++;
//                 Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/slitly.png");
//                 imageView2.setImage(image);
//                 twoButton.setBackground(new Background(new BackgroundFill(Color.ORANGE,null,null)));
//             }
//             else if (i == 1 && t == 1 && j == 0) {
//                 j++;
//                 if (ran == 2) {
//                     oneButton.setBackground(Background.EMPTY);
//                     threeButton.setBackground(Background.EMPTY);
//                     twoButton.setBackground(new Background(new BackgroundFill(Color.GREEN,null,null)));
//                     againButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                     againButton.setTextFill(Color.BLACK);
//                     Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/cat.png");
//                     imageView2.setImage(image);
//                 }
//                 else {
//                     twoButton.setBackground(new Background(new BackgroundFill(Color.RED,null,null)));
//                     oneButton.setBackground(Background.EMPTY);
//                     threeButton.setBackground(Background.EMPTY);
//                     againButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                     againButton.setTextFill(Color.BLACK);
//                     Image madImage = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/mad.png");
//                     imageView2.setImage(madImage);
//                     Image catImage = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/cat.png");
//                     if (ran == 1) {
//                         imageView.setImage(catImage);
//                     }
//                     else {
//                         imageView3.setImage(catImage);
//                     }
//                 }
//             }
//             else if (i == 1 && t == 0 && j == 0) {
//                 t++;
//                 o=0;
//                 th=0;
//                 oneButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                 twoButton.setBackground(new Background(new BackgroundFill(Color.ORANGE,null,null)));
//                 threeButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                 Image image2 = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/closed.png");
//                 imageView.setImage(image2);
//                 imageView3.setImage(image2);
//                 Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/slitly.png");
//                 imageView2.setImage(image);
//             }
//         }
//     }

//     class ThreeButton implements EventHandler<ActionEvent> {
//         @Override
//         public void handle(ActionEvent e) {
//             if (i == 0 && th == 0 && j == 0) {
//                 i++;
//                 th++;
//                 Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/slitly.png");
//                 imageView3.setImage(image);
//                 threeButton.setBackground(new Background(new BackgroundFill(Color.ORANGE,null,null)));
//             }
//             else if (i == 1 && th == 1 && j == 0) {
//                 j++;
//                 if (ran == 3) {
//                     oneButton.setBackground(Background.EMPTY);
//                     twoButton.setBackground(Background.EMPTY);
//                     threeButton.setBackground(new Background(new BackgroundFill(Color.GREEN,null,null)));
//                     againButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                     againButton.setTextFill(Color.BLACK);
//                     Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/cat.png");
//                     imageView3.setImage(image);
//                     Image image2 = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/closed.png");
//                     imageView2.setImage(image2);
//                     imageView.setImage(image2);
//                 }
//                 else {
//                     oneButton.setBackground(Background.EMPTY);
//                     twoButton.setBackground(Background.EMPTY);
//                     threeButton.setBackground(new Background(new BackgroundFill(Color.RED,null,null)));
//                     againButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                     againButton.setTextFill(Color.BLACK);
//                     Image madImage = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/mad.png");
//                     imageView3.setImage(madImage);
//                     Image catImage = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/cat.png");
//                     if (ran == 1) {
//                         imageView.setImage(catImage);
//                     }
//                     else {
//                         imageView2.setImage(catImage);
//                     }
//                 }
//             }
//             else if (i == 1 && th == 0 && j == 0) {
//                 th++;
//                 t=0;
//                 o=0;
//                 oneButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                 twoButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                 threeButton.setBackground(new Background(new BackgroundFill(Color.ORANGE,null,null)));
//                 Image image2 = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/closed.png");
//                 imageView2.setImage(image2);
//                 imageView.setImage(image2);
//                 Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/slitly.png");
//                 imageView3.setImage(image);
//             }
//         }
//     }

//     class AgainButton implements EventHandler<ActionEvent> {
//         @Override
//         public void handle(ActionEvent e) {
//             if (j == 1) {
//                 i = 0;
//                 j = 0;
//                 o = 0;
//                 t = 0;
//                 th = 0;
//                 ran = (int) (1+Math.random() * 3);
//                 System.out.println(ran);
//                 Image image = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/closed.png");
//                 imageView.setImage(image);
//                 Image image2 = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/closed.png");
//                 imageView2.setImage(image2);
//                 Image image3 = new Image("file:C:/Users/Nawaf/OneDrive/Pictures/closed.png");
//                 imageView3.setImage(image3);
//                 oneButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                 twoButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                 threeButton.setBackground(new Background(new BackgroundFill(Color.GAINSBORO,null,null)));
//                 againButton.setBackground(Background.EMPTY);
//                 againButton.setTextFill(null);
//             }
//         }
//     }
// }
  
