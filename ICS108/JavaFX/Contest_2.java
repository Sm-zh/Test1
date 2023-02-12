// import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.stage.Stage;
// import javafx.scene.layout.Background;
// import javafx.scene.layout.BackgroundFill;
// import javafx.scene.layout.BorderPane;
// import javafx.scene.layout.HBox;
// import javafx.scene.paint.Color;

// public class Contest_2 extends Application {
//     Button[] buttons = new Button[9];
//     int j;

//     public static void main(String[] args) {
//         launch(args);
//     }

//     @Override
//     public void start(Stage primaryStage) {  

//         HBox hbox1 = new HBox(2);
//         hbox1.setAlignment (Pos.BOTTOM_CENTER); 
//         hbox1.setBackground(new Background(new BackgroundFill(Color.BLACK,null,null)));

//         HBox hbox2 = new HBox(2);
//         hbox2.setAlignment (Pos.CENTER); 
//         hbox2.setBackground(new Background(new BackgroundFill(Color.BLACK,null,null)));

//         HBox hbox3 = new HBox(2);
//         hbox3.setAlignment (Pos.TOP_CENTER); 
//         hbox3.setBackground(new Background(new BackgroundFill(Color.BLACK,null,null)));

//         for (int i = 0; i < 9; i++) {
//             buttons[i] = new Button(""+i);
//             buttons[i].setPrefHeight(51*3);
//             buttons[i].setPrefWidth(51*3);
//             buttons[i].setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
//             buttons[i].setTextFill(null);
//         }


//         for (int i = 0; i < 3; i++) {
//             hbox1.getChildren().add(buttons[i]);
//             hbox2.getChildren().add(buttons[i+3]);
//             hbox3.getChildren().add(buttons[i+6]);
//         }
        

//         BorderPane borderPane = new BorderPane();
//         borderPane.setTop(hbox1);
//         borderPane.setCenter(hbox2);
//         borderPane.setBottom(hbox3);

//         Scene scene = new Scene (borderPane, 156*3, 156*3);
//         primaryStage.setScene (scene);
//         primaryStage.setTitle("Tic Tac Toe");
//         primaryStage.show();

//         buttons[0].setOnAction(new AButton());
//         buttons[1].setOnAction(new AButton());
//         buttons[2].setOnAction(new AButton());
//         buttons[3].setOnAction(new AButton());
//         buttons[4].setOnAction(new AButton());
//         buttons[5].setOnAction(new AButton());
//         buttons[6].setOnAction(new AButton());
//         buttons[7].setOnAction(new AButton());
//         buttons[8].setOnAction(new AButton());
//     }

//     class AButton implements EventHandler<ActionEvent> {
//         @Override
//         public void handle(ActionEvent e) {
//             if (j <= 4 && ( !(((Button) e.getSource()).getText()).equals("X") || !(((Button) e.getSource()).getText()).equals("O") ) ) {
//                 j++;
//                 String ind = ( (Button) e.getSource()).getText();
//                 int i =Integer.parseInt(ind);  
//                 buttons[i].setText("X");
//                 buttons[i].setStyle("-fx-font: 22 arial;");
//                 buttons[i].setTextFill(Color.BLACK);
//                 win();
//                 if (j <= 4) {
//                     int ran = (int) (Math.random() * 9);
//                     while (true) {
//                          if ( (buttons[ran].getText()).equals("X") || (buttons[ran].getText()).equals("O")) {
//                             ran = (int) (Math.random() * 9);
//                          }
//                          else {
//                             buttons[ran].setText("O");
//                             buttons[ran].setStyle("-fx-font: 22 arial;");
//                             buttons[ran].setTextFill(Color.BLACK);
//                             break;
//                          }
//                     }
//                     win();
//                 }
//                 if (j==5) {
//                     System.out.println("No one has won");
//                 }
//             }
//             else {
//                 System.out.println("NOo!");
//             }
//         }
//     }

//     void win() {
//         if ( (buttons[0].getText()).equals("X") && (buttons[1].getText()).equals("X") && (buttons[2].getText()).equals("X") ||
//               (buttons[3].getText()).equals("X") && (buttons[4].getText()).equals("X") && (buttons[5].getText()).equals("X") ||
//               (buttons[6].getText()).equals("X") && (buttons[7].getText()).equals("X") && (buttons[8].getText()).equals("X") ||
//               (buttons[0].getText()).equals("X") && (buttons[3].getText()).equals("X") && (buttons[6].getText()).equals("X") ||
//               (buttons[1].getText()).equals("X") && (buttons[4].getText()).equals("X") && (buttons[7].getText()).equals("X") ||
//               (buttons[2].getText()).equals("X") && (buttons[5].getText()).equals("X") && (buttons[8].getText()).equals("X") ||
//               (buttons[0].getText()).equals("X") && (buttons[4].getText()).equals("X") && (buttons[8].getText()).equals("X") ||
//               (buttons[2].getText()).equals("X") && (buttons[4].getText()).equals("X") && (buttons[6].getText()).equals("X"))  {
//                 j = 6;
//                 System.out.println("X Won!");
//         }

//         else if ( (buttons[0].getText()).equals("O") && (buttons[1].getText()).equals("O") && (buttons[2].getText()).equals("O") ||
//               (buttons[3].getText()).equals("O") && (buttons[4].getText()).equals("O") && (buttons[5].getText()).equals("O") ||
//               (buttons[6].getText()).equals("O") && (buttons[7].getText()).equals("O") && (buttons[8].getText()).equals("O") ||
//               (buttons[0].getText()).equals("O") && (buttons[3].getText()).equals("O") && (buttons[6].getText()).equals("O") ||
//               (buttons[1].getText()).equals("O") && (buttons[4].getText()).equals("O") && (buttons[7].getText()).equals("O") ||
//               (buttons[2].getText()).equals("O") && (buttons[5].getText()).equals("O") && (buttons[8].getText()).equals("O") ||
//               (buttons[0].getText()).equals("O") && (buttons[4].getText()).equals("O") && (buttons[8].getText()).equals("O") ||
//               (buttons[2].getText()).equals("O") && (buttons[4].getText()).equals("O") && (buttons[6].getText()).equals("O"))  {
//                 j = 6;
//                 System.out.println("O Won!");
//         }
//     }
// } 
