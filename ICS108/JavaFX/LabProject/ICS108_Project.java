// package LabProject;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.io.PrintWriter;
// import java.util.ArrayList;
// import java.util.Scanner;
// import java.util.TreeMap;

// import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.geometry.Insets;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.CheckBox;
// import javafx.scene.control.Label;
// import javafx.stage.Stage;
// import javafx.scene.layout.Background;
// import javafx.scene.layout.BackgroundFill;
// import javafx.scene.layout.BorderPane;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.VBox;
// import javafx.scene.paint.Color;

// public class ICS108_Project extends Application {
//     int nOP = 0;
//     int nOP2 = 0;
//     ArrayList<String> courses = new ArrayList<>();
//     ArrayList<String> basket = new ArrayList<>();
//     ArrayList<String> coursesInS = new ArrayList<>();
//     CheckBox[] checkBoxes = new CheckBox[10];
//     CheckBox[] checkBoxes2 = new CheckBox[8];
//     CheckBox[] checkBoxes3 = new CheckBox[8];
//     boolean[] selected = new boolean[5];
//     VBox vbox= new VBox(5);
//     VBox vbox5 = new VBox(5);
//     VBox vbox4 = new VBox(5);
//     BorderPane borderPane = new BorderPane();
//     BorderPane border4 = new BorderPane();
//     BorderPane border10 = new BorderPane();
//     BorderPane border6 = new BorderPane();
//     BorderPane border8 = new BorderPane();
//     CheckBox[][] sections = new CheckBox[11][5];



//     public static void main(String[] args) {
//         launch(args);
//   }

//   @Override
//     public void start(Stage primaryStage) {
//       HBox hbox= new HBox(5);
//       hbox.setAlignment(Pos.CENTER); 
//       hbox.setPadding(new Insets (10,10,10,10));

//       vbox.setAlignment(Pos.TOP_CENTER); 
//       vbox.setPadding(new Insets (5,5,5,5));
//       vbox.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));

//       HBox hbox2= new HBox(5);
//       hbox2.setAlignment(Pos.TOP_CENTER); 
//       hbox2.setPadding(new Insets (10,10,10,10));
//       hbox2.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));

//       vbox5.setAlignment(Pos.TOP_CENTER);
//       vbox5.setPrefWidth(50);
//       vbox5.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));

//       VBox vbox6= new VBox(5);
//       vbox6.setAlignment(Pos.TOP_CENTER);
//       vbox6.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));

//       HBox hbox3= new HBox(5);
//       hbox3.setAlignment(Pos.CENTER_RIGHT); 
//       hbox3.setPadding(new Insets (10,10,10,10));
//       vbox.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));

//       HBox hbox4= new HBox(5);
//       hbox4.setAlignment(Pos.CENTER); 
//       hbox4.setBackground(new Background(new BackgroundFill(Color.rgb(18,19,20),null,null)));

//       HBox hbox5 = new HBox(5);
//       hbox5.setPrefWidth(90);
//       hbox5.setAlignment(Pos.CENTER_LEFT); 
//       hbox5.setBackground(new Background(new BackgroundFill(Color.rgb(42,43,44),null,null)));

//       VBox vbox2 = new VBox(5);
//       vbox2.setPrefWidth(50);
//       vbox2.setAlignment(Pos.TOP_CENTER);
//       vbox2.setBackground(new Background(new BackgroundFill(Color.rgb(26,27,28),null,null)));

//       VBox[] vboxes = new VBox[5];
//       for (int i = 0; i<5; i++) {
//           vboxes[i] = new VBox(5);
//           vboxes[i].setPrefWidth(120);
//           vboxes[i].setAlignment(Pos.BOTTOM_CENTER); 
//           vboxes[i].setPadding(new Insets (2,2,2,2));
//           vboxes[i].setBackground(new Background(new BackgroundFill(Color.rgb(26,27,28),null,null)));
//       }

//       VBox vbox3 = new VBox(5);
//       vbox3.setPrefWidth(55);
//       vbox3.setAlignment(Pos.CENTER_LEFT);
//       vbox3.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));
//       hbox4.getChildren().add(vbox3);

//       VBox[] vboxes2 = new VBox[5];
//       for (int i = 0; i<5; i++) {
//           vboxes2[i] = new VBox(5);
//           vboxes2[i].setPrefWidth(120);
//           vboxes2[i].setAlignment(Pos.CENTER); 
//           vboxes2[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,61,62),null,null)));
//       }

//       vbox4.setPadding(new Insets (5,5,0,5));
//       vbox4.setAlignment(Pos.TOP_CENTER); 
//       vbox4.setBackground(new Background(new BackgroundFill(Color.rgb(26,27,28),null,null)));

//       HBox hbox6 = new HBox(5);
//       hbox6.setPrefWidth(90);
//       hbox6.setAlignment(Pos.CENTER); 
//       hbox6.setBackground(new Background(new BackgroundFill(Color.rgb(60,61,62),null,null)));

//       HBox hbox7 = new HBox(5);
//       hbox7.setAlignment(Pos.CENTER); 
//       hbox7.setPadding(new Insets (0,45,0,0));
//       hbox7.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null))); 
      
//       HBox hbox8 = new HBox(5);
//       hbox8.setAlignment(Pos.TOP_CENTER); 
//       hbox8.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null))); 

//       HBox hbox10 = new HBox(5);
//       hbox10.setAlignment(Pos.CENTER); 
//       hbox10.setPadding(new Insets (0,0,0,5));
//       hbox10.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null))); 
      
//       Label message = new Label("Add Section to Basket");
//       message.setPadding(new Insets (5,5,5,5));
//       message.setStyle("-fx-font: 22 Helvetica;");
//       message.setTextFill(Color.WHITE);


//       Button startButton = new Button("Start with\na Saved Schdule");
//       startButton.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       startButton.setTextFill(Color.WHITE);
//       startButton.setStyle("-fx-font: 12 Helvetica;");

//       Button addButton = new Button("Add");
//       addButton.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       addButton.setTextFill(Color.WHITE);
//       addButton.setStyle("-fx-font: 12 Helvetica;");

//       Button removeButton = new Button("Remove");
//       removeButton.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       removeButton.setTextFill(Color.WHITE);
//       removeButton.setStyle("-fx-font: 12 Helvetica;");

//       Button nextButton = new Button("Next");
//       nextButton.setPrefHeight(40);
//       nextButton.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       nextButton.setTextFill(Color.WHITE);
//       nextButton.setStyle("-fx-font: 12 Helvetica;");

//       Button previousButton = new Button("Previous");
//       previousButton.setPadding(new Insets (10,10,10,10));
//       previousButton.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       previousButton.setTextFill(Color.WHITE);
//       previousButton.setStyle("-fx-font: 12 Helvetica;");

//       Button leftOne = new Button("<");
//       leftOne.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       leftOne.setTextFill(Color.WHITE);
//       leftOne.setStyle("-fx-font: 12 Helvetica;");

//       Button rightOne = new Button(">");
//       rightOne.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       rightOne.setTextFill(Color.WHITE);
//       rightOne.setStyle("-fx-font: 12 Helvetica;");

//       Button leftB = new Button("<");
//       leftB.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       leftB.setTextFill(Color.WHITE);
//       leftB.setStyle("-fx-font: 12 Helvetica;");

//       Button rightB = new Button(">");
//       rightB.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       rightB.setTextFill(Color.WHITE);
//       rightB.setStyle("-fx-font: 12 Helvetica;");

//       Button leftB2 = new Button("<");
//       leftB2.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       leftB2.setTextFill(Color.WHITE);
//       leftB2.setStyle("-fx-font: 12 Helvetica;");

//       Button rightB2 = new Button(">");
//       rightB2.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       rightB2.setTextFill(Color.WHITE);
//       rightB2.setStyle("-fx-font: 12 Helvetica;");

//       Button saveButton = new Button("Save Schedule");
//       saveButton.setPadding(new Insets (10,10,10,10));
//       saveButton.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       saveButton.setTextFill(Color.WHITE);
//       saveButton.setStyle("-fx-font: 12 Helvetica;");

//       Button addToS = new Button("Add");
//       addToS.setPadding(new Insets (10,10,10,10));
//       addToS.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       addToS.setTextFill(Color.WHITE);
//       addButton.setStyle("-fx-font: 12 Helvetica;");

//       Button dropButton = new Button("Drop");
//       dropButton.setPadding(new Insets (10,10,10,10));
//       dropButton.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
//       dropButton.setTextFill(Color.WHITE);
//       dropButton.setStyle("-fx-font: 12 Helvetica;");


//       TreeMap<String, Section> course = new TreeMap<>();
//       course = MainReader.courses();
      
//       while (course.size()>0) {
//         courses.add(course.firstKey() + "\n" + ((course.get(course.firstKey())).getTime()));
//         course.remove(course.firstKey());
//       }

//       hbox.getChildren().add(startButton);

//       for (int i = 0; i < 10; i++) {
//         checkBoxes[i] = new CheckBox(courses.get(i));
//         checkBoxes[i].setPrefWidth(240); 
//         checkBoxes[i].setPrefHeight(100);
//         checkBoxes[i].setTextFill(Color.WHITE);
//         checkBoxes[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,61,62),null,null)));
//         checkBoxes[i].setStyle("-fx-font: 18 Helvetica;");
//         vbox.getChildren().add(checkBoxes[i]);
//       }

//       hbox2.getChildren().addAll(addButton, removeButton);
//       hbox3.getChildren().addAll(leftB, rightB, nextButton);
//       hbox7.getChildren().addAll(leftOne, rightOne);
//       hbox8.getChildren().addAll(leftB2, rightB2);
//       hbox10.getChildren().addAll(addToS, dropButton);
//       vbox6.getChildren().add(hbox8);
//       vbox6.getChildren().add(hbox10);
//       Label[] days = {new Label("Sunday"), new Label("Monday"), new Label("Tuesday"), new Label("Wednesday"), new Label("Thursday")};
//       for (int i = 0; i < 5; i++) {
//         days[i].setTextFill(Color.WHITE);
//         days[i].setStyle("-fx-font: 12 Helvetica;");
//         vboxes2[i].getChildren().add(days[i]);
//         hbox4.getChildren().add(vboxes2[i]);
//       }


//       for (int i = 0; i < 11; i++) {
//         Label label;
//         if (i<6) {
//           label = new Label(i+7+"am");
//           label.setTextFill(Color.WHITE);
//           label.setStyle("-fx-font: 12 Helvetica;");
//           label.setAlignment(Pos.TOP_CENTER);
//           label.setPrefHeight(50);
//           vbox2.getChildren().add(label);
//         }
//         else {
//           label = new Label(i-5+"pm");
//           label.setTextFill(Color.WHITE);
//           label.setStyle("-fx-font: 12 Helvetica;");
//           label.setAlignment(Pos.TOP_CENTER);
//           label.setPrefHeight(50);
//           vbox2.getChildren().add(label);
//         }
//       }
//       hbox5.getChildren().add(vbox2);
//       for (int j = 0; j < 5; j++) {
//         hbox5.getChildren().add(vboxes[j]);
//       }

//       Label message2 = new Label("Basket");
//       message2.setStyle("-fx-font: 18 Helvetica;");
//       message2.setTextFill(Color.WHITE);
//       hbox6.getChildren().add(message2);

//       BorderPane border = new BorderPane();
//       border.setPrefWidth(720); 
//       border.setPrefHeight(100);
//       border.setCenter(message);
//       border.setRight(hbox);
//       border.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));

//       BorderPane border11 = new BorderPane();
//       border11.setPadding(new Insets (0,10,0,10));
//       border11.setTop(hbox2);
//       border11.setCenter(vbox5);

//       BorderPane border2 = new BorderPane();
//       border2.setPadding(new Insets(5,5,5,5));
//       border2.setPrefWidth(720); 
//       border2.setPrefHeight(320);
//       border2.setCenter(vbox);
//       border2.setRight(border11);
//       border2.setBackground(new Background(new BackgroundFill(Color.rgb(42,43,44),null,null)));

//       BorderPane border3 = new BorderPane();
//       border3.setPadding(new Insets(0,0,0,0));
//       border3.setPrefWidth(720); 
//       border3.setPrefHeight(60);
//       border3.setRight(hbox3);
//       border3.setCenter(hbox7);
//       border3.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));

//       border4.setPadding(new Insets(0,20,0,20));
//       border4.setTop(border);
//       border4.setCenter(border2);
//       border4.setBottom(border3);
//       border4.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));

//       BorderPane border5 = new BorderPane();
//       border5.setPadding(new Insets(50,20,0,0));
//       border5.setPrefHeight(70);
//       border5.setLeft(hbox4);
//       border5.setRight(hbox6);
//       border5.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));

//       border6.setPrefWidth(750); 
//       border6.setPrefHeight(280);
//       border6.setCenter(hbox5);
//       border6.setBackground(new Background(new BackgroundFill(Color.rgb(42,43,44),null,null)));

//       BorderPane border7 = new BorderPane();
//       border7.setPrefWidth(120); 
//       border7.setPrefHeight(280);
//       border7.setCenter(vbox4);
//       border7.setBackground(new Background(new BackgroundFill(Color.rgb(42,43,44),null,null)));

//       border8.setPrefWidth(720); 
//       border8.setPrefHeight(280);
//       border8.setLeft(border6);
//       border8.setRight(border7);
//       border8.setPadding(new Insets(5,5,5,5));
//       border8.setBackground(new Background(new BackgroundFill(Color.rgb(42,43,44),null,null)));

//       BorderPane border9 = new BorderPane();
//       border9.setPadding(new Insets(10,10,10,10));
//       border9.setPrefWidth(720); 
//       border9.setPrefHeight(100);
//       border9.setLeft(previousButton);
//       border9.setRight(vbox6);
//       border9.setCenter(saveButton);
//       border9.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));

//       border10.setPadding(new Insets(0,20,0,20));
//       border10.setTop(border5);
//       border10.setCenter(border8);
//       border10.setBottom(border9);
//       border10.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));

//       borderPane.setPadding(new Insets(20,20,20,20));
//       borderPane.setCenter(border4);
//       borderPane.setBackground(new Background(new BackgroundFill(Color.rgb(24,25,26),null,null)));

//       Scene scene = new Scene (borderPane, 1500, 940);
//       primaryStage.setScene (scene);
//       primaryStage.setTitle("MyJavaFX");
//       primaryStage.show();

//       startButton.setOnMouseEntered(e -> startButton.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       startButton.setOnMouseExited(e -> startButton.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));
//       addButton.setOnMouseEntered(e -> addButton.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       addButton.setOnMouseExited(e -> addButton.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));
//       removeButton.setOnMouseEntered(e -> removeButton.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       removeButton.setOnMouseExited(e -> removeButton.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));
//       nextButton.setOnMouseEntered(e -> nextButton.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       nextButton.setOnMouseExited(e -> nextButton.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));
//       saveButton.setOnMouseEntered(e -> saveButton.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       saveButton.setOnMouseExited(e -> saveButton.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));
//       rightOne.setOnMouseEntered(e -> rightOne.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       rightOne.setOnMouseExited(e -> rightOne.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));
//       leftOne.setOnMouseEntered(e -> leftOne.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       leftOne.setOnMouseExited(e -> leftOne.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));
//       rightB.setOnMouseEntered(e -> rightB.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       rightB.setOnMouseExited(e -> rightB.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));
//       leftB.setOnMouseEntered(e -> leftB.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       leftB.setOnMouseExited(e -> leftB.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));
//       previousButton.setOnMouseEntered(e -> previousButton.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       previousButton .setOnMouseExited(e -> previousButton. setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));
//       leftB2.setOnMouseEntered(e -> leftB2.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       leftB2.setOnMouseExited(e -> leftB2.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));
//       rightB2.setOnMouseEntered(e -> rightB2.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       rightB2.setOnMouseExited(e -> rightB2.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));
//       addToS.setOnMouseEntered(e -> addToS.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       addToS.setOnMouseExited(e -> addToS.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));
//       dropButton.setOnMouseEntered(e -> dropButton.setBackground(new Background(new BackgroundFill(Color.rgb(0,140,70),null,null))));
//       dropButton.setOnMouseExited(e -> dropButton.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null))));

//       startButton.setOnAction(new StartButton());
//       addButton.setOnAction(new AddButton());
//       removeButton.setOnAction(new RemoveButton());
//       rightOne.setOnAction(new RightOne());
//       leftOne.setOnAction(new LeftOne());
//       rightB.setOnAction(new RightB());
//       leftB.setOnAction(new LeftB());
//       rightB2.setOnAction(new RightB2());
//       leftB2.setOnAction(new LeftB2());
//       nextButton.setOnAction(new Next());
//       previousButton.setOnAction(new Previous());
//       addToS.setOnAction(new AddToS());
//       dropButton.setOnAction(new Drop());
//       saveButton.setOnAction(new Save());


//     }

//     class StartButton implements EventHandler<ActionEvent> {
//       @Override
//       public void handle(ActionEvent e) {
//         File rFile = new File("SavedSchedule.txt");
//         try (Scanner in = new Scanner(rFile)) {
//           for (int i = 0; i < 11; i++) {
//             for (int j = 0; j < 5; j++) {
//               String name = in.next();
//               if (!(name.equals("None"))) {
                
//                 name = (name.split(";"))[0] + " " + (name.split(";"))[1] + "\n" + (name.split(";"))[2] + " " + (name.split(";"))[3] + "\n" + (name.split(";"))[4];
//                 sections[i][j] = new CheckBox(name);
//               }
//               else {
//                 sections[i][j] = null;
//               }
//             }
//           }
//           HBox hbox5 = new HBox(5);
//         hbox5.setPrefWidth(120);
//         hbox5.setAlignment(Pos.CENTER_LEFT); 
//         hbox5.setBackground(new Background(new BackgroundFill(Color.rgb(42,43,44),null,null)));

//         VBox vbox2 = new VBox(5);
//         vbox2.setPrefWidth(50);
//         vbox2.setAlignment(Pos.TOP_CENTER);
//         vbox2.setBackground(new Background(new BackgroundFill(Color.rgb(26,27,28),null,null)));

//         VBox[] vboxes = new VBox[5];
//         for (int i = 0; i<5; i++) {
//             vboxes[i] = new VBox(5);
//             vboxes[i].setPrefWidth(120);
//             vboxes[i].setAlignment(Pos.BOTTOM_CENTER); 
//             // vboxes[i].setPadding(new Insets (2,2,2,2));
//             vboxes[i].setBackground(new Background(new BackgroundFill(Color.rgb(26,27,28),null,null)));
//         }

//           for (int i = 0; i < 11; i++) {
//             Label label;
//             if (i<6) {
//               label = new Label(i+7+"am");
//               label.setTextFill(Color.WHITE);
//               label.setStyle("-fx-font: 12 Helvetica;");
//               label.setAlignment(Pos.TOP_CENTER);
//               label.setPrefHeight(50);
//               vbox2.getChildren().add(label);
//             }
//             else {
//               label = new Label(i-5+"pm");
//               label.setTextFill(Color.WHITE);
//               label.setStyle("-fx-font: 12 Helvetica;");
//               label.setAlignment(Pos.TOP_CENTER);
//               label.setPrefHeight(50);
//               vbox2.getChildren().add(label);
//             }
//           }
//           hbox5.getChildren().add(vbox2);

//           for (int i = 0; i < 11; i++) {
//             for (int j = 0; j < 5; j++) {
//               Label label;
//               HBox hbox9 = new HBox(5);
//               hbox9.setAlignment(Pos.CENTER);
//               if (sections[i][j] == null) {
//                 hbox9.setPrefHeight(160);
//                 hbox9.setBackground(new Background(new BackgroundFill(Color.rgb(26,27,28),null,null)));
//                 label = new Label("");
//                 hbox9.getChildren().add(label);
//                 vboxes[j].getChildren().add(hbox9);
//               }
//               else {
//                 String sectionName = sections[i][j].getText();
//                 String sectionTime =  (sectionName.split("\n"))[1];
//                 String start = sectionTime.split(":")[0];
//                 String end = sectionTime.split(":")[1];
//                 end = end.split(" ")[1];
//                 int startI = Integer.parseInt(start);
//                 int endI = Integer.parseInt(end);
//                 sections[i][j].setTextFill(Color.WHITE);
//                 sections[i][j].setStyle("-fx-font: 12 Helvetica;");
//                 hbox9.setBackground(new Background(new BackgroundFill(Color.rgb(26,27,128),null,null)));
//                 if (TimeConverter.duration(startI, endI) != 1) {
//                     hbox9.setPrefHeight(200);
//                     hbox9.setPrefWidth(200);
//                     hbox9.getChildren().add(sections[i][j]);
//                     vboxes[j].getChildren().add(hbox9);
//                 }
//                 else {
//                     hbox9.setPrefHeight(200);
//                     hbox9.setPrefWidth(200);
//                     hbox9.getChildren().add(sections[i][j]);
//                   vboxes[j].getChildren().add(hbox9);
//                 }
//               }
//             }
//           }
//           for (int j = 0; j < 5; j++) {
//             hbox5.getChildren().add(vboxes[j]);
//           }
//           border6.setCenter(hbox5);
//           border8.setLeft(border6);
//           border10.setCenter(border8);
//           borderPane.setCenter(border10);
//         }
//         catch (FileNotFoundException e1) {
//           e1.printStackTrace();
//         }
//       }
//     }

//     class AddButton implements EventHandler<ActionEvent> {
//       @Override
//       public void handle(ActionEvent e) {
//         for (int i = 0; i < 10; i++) {
//           if (checkBoxes[i].isSelected()) {
//             vbox.getChildren().remove(checkBoxes[i]);
//             if (!(basket.contains(checkBoxes[i].getText()))) {
//               basket.add(checkBoxes[i].getText());
//             }
//             courses.remove(checkBoxes[i].getText());
//           }
//         }
//         for (int i = 0; i < 10; i++) {
//           vbox.getChildren().remove(checkBoxes[i]);
//         }
//         for (int i = 0;i < 10; i++) {
//           if (i + (10 * nOP) < courses.size()){
//             checkBoxes[i] = new CheckBox(courses.get(i + (10 * nOP)));
//             checkBoxes[i].setPrefWidth(240); 
//             checkBoxes[i].setPrefHeight(100);
//             checkBoxes[i].setTextFill(Color.WHITE);
//             checkBoxes[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,61,62),null,null)));
//             checkBoxes[i].setStyle("-fx-font: 18 Helvetica;");
//             vbox.getChildren().add(checkBoxes[i]);
//           }
//         }

//         for (int i = 0; i < 8; i++) {
//           vbox5.getChildren().remove(checkBoxes2[i]);
//         }

//         for (int i = 0; i < 8; i++) {
//           if (i + (8 * nOP2) < basket.size()){
//             checkBoxes2[i] = new CheckBox(basket.get(i));
//             // checkBoxes2[i].setPadding(new Insets(5,5,5,5));
//             checkBoxes2[i].setPrefWidth(120); 
//             checkBoxes2[i].setPrefHeight(50);
//             checkBoxes2[i].setTextFill(Color.WHITE);
//             checkBoxes2[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,140,140),null,null)));
//             checkBoxes2[i].setStyle("-fx-font: 12 Helvetica;");
//             vbox5.getChildren().add(checkBoxes2[i]);
//           }
//         }
//       }
//     }

//     class RemoveButton implements EventHandler<ActionEvent> {
//       @Override
//       public void handle(ActionEvent e) {
//         for (int i = 0; i < 8; i++) {
//           if (i + (8 * nOP) < basket.size()){
//             if (checkBoxes2[i].isSelected()) {
//               vbox5.getChildren().remove(checkBoxes2[i]);
//               courses.add(checkBoxes2[i].getText());
//               basket.remove(checkBoxes2[i].getText());
//             }
//           }
//         }

//         for (int i = 0; i < 8; i++) {
//           vbox5.getChildren().remove(checkBoxes2[i]);
//         }

//         for (int i = 0; i < 10; i++) {
//           vbox.getChildren().remove(checkBoxes[i]);
//         }

//         for (int i = 0; i < 10; i++) {
//           if (i + (10 * nOP) < courses.size()){
//             checkBoxes[i] = new CheckBox(courses.get(i + (10 * nOP)));
//             checkBoxes[i].setPrefWidth(240); 
//             checkBoxes[i].setPrefHeight(100);
//             checkBoxes[i].setTextFill(Color.WHITE);
//             checkBoxes[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,61,62),null,null)));
//             checkBoxes[i].setStyle("-fx-font: 18 Helvetica;");
//             vbox.getChildren().add(checkBoxes[i]);
//           }
//         }

//         for (int i = 0; i < 8; i++) {
//           if (i + (8 * nOP2) < basket.size()){
//             checkBoxes2[i] = new CheckBox(basket.get(i));
//             // checkBoxes2[i].setPadding(new Insets(5,5,5,5));
//             checkBoxes2[i].setPrefWidth(120); 
//             checkBoxes2[i].setPrefHeight(50);
//             checkBoxes2[i].setTextFill(Color.WHITE);
//             checkBoxes2[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,140,140),null,null)));
//             checkBoxes2[i].setStyle("-fx-font: 16 Helvetica;");
//             vbox5.getChildren().add(checkBoxes2[i]);
//           }
//         }
//       }
//     }

//   class RightOne implements EventHandler<ActionEvent> {
//     @Override
//     public void handle(ActionEvent e) {
//       if (nOP < java.lang.Math.ceil(courses.size()/10)) {  
//         for (int i = 0; i < 10; i++) {
//           vbox.getChildren().remove(checkBoxes[i]);
//         }
//         nOP++;
//         for (int i = 0;i < 10; i++) {
//           if (i+(10*nOP)<courses.size()){
//             checkBoxes[i] = new CheckBox(courses.get(i+(10*nOP)));
//             checkBoxes[i].setPrefWidth(240); 
//             checkBoxes[i].setPrefHeight(100);
//             checkBoxes[i].setTextFill(Color.WHITE);
//             checkBoxes[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,61,62),null,null)));
//             checkBoxes[i].setStyle("-fx-font: 18 Helvetica;");
//             vbox.getChildren().add(checkBoxes[i]);
//           }
//         }
//       }
//     }
//   }

//   class LeftOne implements EventHandler<ActionEvent> {
//     @Override
//     public void handle(ActionEvent e) {
//       if (nOP > 0) {  
//         for (int i = 0; i < 10; i++) {
//           vbox.getChildren().remove(checkBoxes[i]);
//         }
//         nOP--;
//         for (int i = 0; i < 10; i++) {
//           if (i+(5*nOP)>=0){
//             checkBoxes[i] = new CheckBox(courses.get(i+(10*nOP)));
//             checkBoxes[i].setPrefWidth(240); 
//             checkBoxes[i].setPrefHeight(100);
//             checkBoxes[i].setTextFill(Color.WHITE);
//             checkBoxes[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,61,62),null,null)));
//             checkBoxes[i].setStyle("-fx-font: 18 Helvetica;");
//             vbox.getChildren().add(checkBoxes[i]);
//           }
//         }
//       }
//     }
//   }

//   class RightB implements EventHandler<ActionEvent> {
//     @Override
//     public void handle(ActionEvent e) {
//       if (nOP2 < java.lang.Math.ceil(basket.size()/8)) {  
//         for (int i = 0; i < 8; i++) {
//           vbox5.getChildren().remove(checkBoxes2[i]);
//         }
//         nOP2++;
//         for (int i = 0;i < 8; i++) {
//           if (i+(8*nOP2)<basket.size()){
//             checkBoxes2[i] = new CheckBox(basket.get(i+(8*nOP2)));
//             checkBoxes2[i].setPrefWidth(120); 
//             checkBoxes2[i].setPrefHeight(50);
//             checkBoxes2[i].setTextFill(Color.WHITE);
//             checkBoxes2[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,140,140),null,null)));
//             checkBoxes2[i].setStyle("-fx-font: 12 Helvetica;");
//             vbox5.getChildren().add(checkBoxes2[i]);
//           }
//         }
//       }
//     }
//   }

//   class LeftB implements EventHandler<ActionEvent> {
//     @Override
//     public void handle(ActionEvent e) {
//       if (nOP2 > 0) {  
//         for (int i = 0; i < 8; i++) {
//           vbox5.getChildren().remove(checkBoxes2[i]);
//         }
//         nOP2--;
//         for (int i = 0;i < 8; i++) {
//           if (i+(8*nOP2)<basket.size()){
//             checkBoxes2[i] = new CheckBox(basket.get(i+(8*nOP2)));
//             checkBoxes2[i].setPrefWidth(120); 
//             checkBoxes2[i].setPrefHeight(50);
//             checkBoxes2[i].setTextFill(Color.WHITE);
//             checkBoxes2[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,140,140),null,null)));
//             checkBoxes2[i].setStyle("-fx-font: 12 Helvetica;");
//             vbox5.getChildren().add(checkBoxes2[i]);
//           }
//         }
//       }
//     }
//   }

//   class RightB2 implements EventHandler<ActionEvent> {
//     @Override
//     public void handle(ActionEvent e) {
//       if (nOP2 < java.lang.Math.ceil(basket.size()/8)) {  
//         for (int i = 0; i < 8; i++) {
//           vbox4.getChildren().remove(checkBoxes3[i]);
//         }
//         nOP2++;
//         for (int i = 0; i < 8; i++) {
//           if (i+(8*nOP2)<basket.size()){
//             checkBoxes3[i] = new CheckBox(basket.get(i+(8*nOP2)));
//             checkBoxes3[i].setPrefWidth(120); 
//             checkBoxes3[i].setPrefHeight(50);
//             checkBoxes3[i].setTextFill(Color.WHITE);
//             checkBoxes3[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,140,140),null,null)));
//             checkBoxes3[i].setStyle("-fx-font: 12 Helvetica;");
//             vbox4.getChildren().add(checkBoxes3[i]);
//           }
//         }
//       }
//     }
//   }

//   class LeftB2 implements EventHandler<ActionEvent> {
//     @Override
//     public void handle(ActionEvent e) {
//       if (nOP2 > 0) {  
//         for (int i = 0; i < 8; i++) {
//           vbox4.getChildren().remove(checkBoxes3[i]);
//         }
//         nOP2--;
//         for (int i = 0;i < 8; i++) {
//           if (i+(8*nOP2)<basket.size()){
//             checkBoxes3[i] = new CheckBox(basket.get(i+(8*nOP2)));
//             checkBoxes3[i].setPrefWidth(120); 
//             checkBoxes3[i].setPrefHeight(50);
//             checkBoxes3[i].setTextFill(Color.WHITE);
//             checkBoxes3[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,140,140),null,null)));
//             checkBoxes3[i].setStyle("-fx-font: 12 Helvetica;");
//             vbox4.getChildren().add(checkBoxes3[i]);
//           }
//         }
//       }
//     }
//   }

//   class Next implements EventHandler<ActionEvent> {
//     @Override
//     public void handle(ActionEvent e) {
//       nOP2 = 0;
//       for (int i = 0; i < 8; i++) {
//         vbox4.getChildren().remove(checkBoxes3[i]);
//       }
//       borderPane.setCenter(border10);
//       for (int i = 0; i < 8; i++) {
//         if (i + (nOP2 * 8) < basket.size()) {
//           checkBoxes3[i] = new CheckBox(basket.get(i));
//           checkBoxes3[i].setPrefWidth(120); 
//           checkBoxes3[i].setPrefHeight(50);
//           checkBoxes3[i].setTextFill(Color.WHITE);
//           checkBoxes3[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,140,140),null,null)));
//           checkBoxes3[i].setStyle("-fx-font: 12 Helvetica;");
//           vbox4.getChildren().add(checkBoxes3[i]);
//         }
//       }
//     }
//   }

//   class Previous implements EventHandler<ActionEvent> {
//     @Override
//     public void handle(ActionEvent e) {
//       nOP = 0;
//       nOP2 = 0;
//       borderPane.setCenter(border4);
//     }
//   }

//   class AddToS implements EventHandler<ActionEvent> {
//     @Override
//     public void handle(ActionEvent e) {      
//       if (basket.size() > 0) {
//         HBox hbox5 = new HBox(5);
//         hbox5.setPrefWidth(120);
//         hbox5.setAlignment(Pos.CENTER_LEFT); 
//         hbox5.setBackground(new Background(new BackgroundFill(Color.rgb(42,43,44),null,null)));

//         VBox vbox2 = new VBox(5);
//         vbox2.setPrefWidth(50);
//         vbox2.setAlignment(Pos.TOP_CENTER);
//         vbox2.setBackground(new Background(new BackgroundFill(Color.rgb(26,27,28),null,null)));

//         VBox[] vboxes = new VBox[5];
//         for (int i = 0; i<5; i++) {
//             vboxes[i] = new VBox(5);
//             vboxes[i].setPrefWidth(120);
//             vboxes[i].setAlignment(Pos.BOTTOM_CENTER); 
//             // vboxes[i].setPadding(new Insets (2,2,2,2));
//             vboxes[i].setBackground(new Background(new BackgroundFill(Color.rgb(26,27,28),null,null)));
//         }

//         for (int i = 0; i < 11; i++) {
//             Label label;
//             if (i<6) {
//               label = new Label(i+7+"am");
//               label.setTextFill(Color.WHITE);
//               label.setStyle("-fx-font: 12 Helvetica;");
//               label.setAlignment(Pos.TOP_CENTER);
//               label.setPrefHeight(50);
//               vbox2.getChildren().add(label);
//             }
//             else {
//               label = new Label(i-5+"pm");
//               label.setTextFill(Color.WHITE);
//               label.setStyle("-fx-font: 12 Helvetica;");
//               label.setAlignment(Pos.TOP_CENTER);
//               label.setPrefHeight(50);
//               vbox2.getChildren().add(label);
//             }
//           }
//           hbox5.getChildren().add(vbox2);

        
//           for (int i = 0; i < 8; i++) {
//             if (i < basket.size()) {
//               if (checkBoxes3[i].isSelected()) {
//                 String sectionName = checkBoxes3[i].getText();
//                 String courseName = (sectionName.split("-"))[0];
//                 if (!(coursesInS.contains(courseName))) {
//                     vbox4.getChildren().remove(checkBoxes3[i]);
//                     basket.remove(checkBoxes[i].getText());
//                     coursesInS.add(courseName);
//                     String sectionTime =  (sectionName.split("\n"))[1];
//                     String days = (sectionTime.split(" "))[0];
//                     String hours = (sectionTime.split(" "))[1];
//                     String start = hours.split("-")[0];
//                     String startHour = start.charAt(0) + "" + start.charAt(1);
//                     String startMinute = start.charAt(2) + "" + start.charAt(3);
//                     String end = hours.split("-")[1];
//                     String endHour = end.charAt(0) + "" + end.charAt(1);
//                     String endMinute = end.charAt(2) + "" + end.charAt(3);
//                     String[] dayses = new String[days.length()];
//                     sectionName = (sectionName.split("\n"))[0] + "\n" + startHour + ":" + startMinute + " " + endHour + ":" + endMinute + "\n";
//                     for (int j = 0; j < dayses.length; j++) {
//                         dayses[j] = "" + days.charAt(j);
//                         sectionName += "" + days.charAt(j);;
//                     }
//                     for (int j = 0; j < dayses.length; j++) {
//                         sections[TimeConverter.toIndex(Integer.parseInt(startHour))][TimeConverter.toIndex(dayses[j])] = new CheckBox(sectionName);
//                     }
//                 }
//               }
//             }
//           }
//           for (int i = 0; i < 11; i++) {
//             for (int j = 0; j < 5; j++) {
//               Label label;
//               HBox hbox9 = new HBox(5);
//               hbox9.setAlignment(Pos.CENTER);
//               if (sections[i][j] == null) {
//                 hbox9.setPrefHeight(160);
//                 hbox9.setBackground(new Background(new BackgroundFill(Color.rgb(26,27,28),null,null)));
//                 label = new Label("");
//                 hbox9.getChildren().add(label);
//                 vboxes[j].getChildren().add(hbox9);
//               }
//               else if (coursesInS.contains((sections[i][j].getText().split("-"))[0])) {
//                 String sectionName = sections[i][j].getText();
//                 String sectionTime =  (sectionName.split("\n"))[1];
//                 String start = sectionTime.split(":")[0];
//                 String end = sectionTime.split(":")[1];
//                 end = end.split(" ")[1];
//                 int startI = Integer.parseInt(start);
//                 int endI = Integer.parseInt(end);
//                 sections[i][j].setTextFill(Color.WHITE);
//                 sections[i][j].setStyle("-fx-font: 12 Helvetica;");
//                 hbox9.setBackground(new Background(new BackgroundFill(Color.rgb(26,27,128),null,null)));
//                 if (TimeConverter.duration(startI, endI) != 1) {
//                     hbox9.setPrefHeight(200);
//                     hbox9.setPrefWidth(200);
//                     hbox9.getChildren().add(sections[i][j]);
//                     vboxes[j].getChildren().add(hbox9);
//                 }
//                 else {
//                     hbox9.setPrefHeight(200);
//                     hbox9.setPrefWidth(200);
//                     hbox9.getChildren().add(sections[i][j]);
//                   vboxes[j].getChildren().add(hbox9);
//                 }
//               }
//             }
//           }
//           for (int j = 0; j < 5; j++) {
//             hbox5.getChildren().add(vboxes[j]);
//           }
//           border6.setCenter(hbox5);
//           border8.setLeft(border6);
//           border10.setCenter(border8);
//           borderPane.setCenter(border10);
//         }
//       }
//     }

//     class Drop implements EventHandler<ActionEvent> {
//         @Override
//         public void handle(ActionEvent e) {
//             for (int i = 0; i < 11; i++) {
//                 for (int j = 0; j < 5; j++) {
//                     if (sections[i][j] != null && sections[i][j].isSelected()) {
//                         String sectionName = sections[i][j].getText();
//                         String courseName = (sectionName.split("-"))[0];
//                         coursesInS.remove(courseName);
//                     }
//                     if (sections[i][j] != null) {
//                       String sectionName = sections[i][j].getText();
//                       String courseName = (sectionName.split("-"))[0];
//                       if (!(coursesInS.contains(courseName))) {
//                         sections[i][j] = null;
//                       }
//                     }
//                 }
//             }

//             nOP2 = 0;
//             for (int i = 0; i < 8; i++) {
//                 vbox4.getChildren().remove(checkBoxes3[i]);
//             }
//             for (int i = 0; i < 8; i++) {
//                 if (i + (nOP2 * 8) < basket.size()) {
//                 checkBoxes3[i] = new CheckBox(basket.get(i));
//                 checkBoxes3[i].setPrefWidth(120); 
//                 checkBoxes3[i].setPrefHeight(50);
//                 checkBoxes3[i].setTextFill(Color.WHITE);
//                 checkBoxes3[i].setBackground(new Background(new BackgroundFill(Color.rgb(60,140,140),null,null)));
//                 checkBoxes3[i].setStyle("-fx-font: 12 Helvetica;");
//                 vbox4.getChildren().add(checkBoxes3[i]);
//                 }
//             }

//             HBox hbox5 = new HBox(5);
//         hbox5.setPrefWidth(120);
//         hbox5.setAlignment(Pos.CENTER_LEFT); 
//         hbox5.setBackground(new Background(new BackgroundFill(Color.rgb(42,43,44),null,null)));

//         VBox vbox2 = new VBox(5);
//         vbox2.setPrefWidth(50);
//         vbox2.setAlignment(Pos.TOP_CENTER);
//         vbox2.setBackground(new Background(new BackgroundFill(Color.rgb(26,27,28),null,null)));

//         VBox[] vboxes = new VBox[5];
//         for (int i = 0; i<5; i++) {
//             vboxes[i] = new VBox(5);
//             vboxes[i].setPrefWidth(120);
//             vboxes[i].setAlignment(Pos.BOTTOM_CENTER); 
//             vboxes[i].setBackground(new Background(new BackgroundFill(Color.rgb(26,27,28),null,null)));
//         }

//         for (int i = 0; i < 11; i++) {
//             Label label;
//             if (i<6) {
//               label = new Label(i+7+"am");
//               label.setTextFill(Color.WHITE);
//               label.setStyle("-fx-font: 12 Helvetica;");
//               label.setAlignment(Pos.TOP_CENTER);
//               label.setPrefHeight(50);
//               vbox2.getChildren().add(label);
//             }
//             else {
//               label = new Label(i-5+"pm");
//               label.setTextFill(Color.WHITE);
//               label.setStyle("-fx-font: 12 Helvetica;");
//               label.setAlignment(Pos.TOP_CENTER);
//               label.setPrefHeight(50);
//               vbox2.getChildren().add(label);
//             }
//           }
//           hbox5.getChildren().add(vbox2);

//             for (int i = 0; i < 11; i++) {
//                 for (int j = 0; j < 5; j++) {
//                   Label label;
//                   HBox hbox9 = new HBox(5);
//                   hbox9.setAlignment(Pos.CENTER);
//                   if (sections[i][j] == null) {
//                     hbox9.setPrefHeight(160);
//                     hbox9.setBackground(new Background(new BackgroundFill(Color.rgb(26,27,28),null,null)));
//                     label = new Label("");
//                     hbox9.getChildren().add(label);
//                     vboxes[j].getChildren().add(hbox9);
//                   }
//                   else if (coursesInS.contains((sections[i][j].getText().split("-"))[0])) {
//                     label = new Label(sections[i][j].getText());
//                     String sectionName = sections[i][j].getText();
//                     String sectionTime =  (sectionName.split("\n"))[1];
//                     String start = sectionTime.split(":")[0];
//                     String end = sectionTime.split(":")[1];
//                     end = end.split(" ")[1];
//                     int startI = Integer.parseInt(start);
//                     int endI = Integer.parseInt(end);
//                     label.setTextFill(Color.WHITE);
//                     label.setStyle("-fx-font: 12 Helvetica;");
//                     hbox9.setBackground(new Background(new BackgroundFill(Color.rgb(26,27,128),null,null)));
//                     if (TimeConverter.duration(startI, endI) != 1) {
//                         hbox9.setPrefHeight(200);
//                         hbox9.setPrefWidth(200);
//                         hbox9.getChildren().add(label);
//                         vboxes[j].getChildren().add(hbox9);
//                     }
//                     else {
//                         hbox9.setPrefHeight(200);
//                         hbox9.setPrefWidth(200);
//                         hbox9.getChildren().add(label);
//                       vboxes[j].getChildren().add(hbox9);
//                     }
//                   }
//                 }
//               }
//               for (int j = 0; j < 5; j++) {
//                 hbox5.getChildren().add(vboxes[j]);
//               }
//               border6.setCenter(hbox5);
//               border8.setLeft(border6);
//               border10.setCenter(border8);
//               borderPane.setCenter(border10);
              
//         }
//       }
//       class Save implements EventHandler<ActionEvent> {
//         @Override
//         public void handle(ActionEvent e) {
//             try (PrintWriter file = new PrintWriter("SavedSchedule.txt")) {
//                 for (int i = 0; i < 11; i++) {
//                     for (int j = 0; j < 5; j++) {
//                       if (sections[i][j] != null) {
//                         String[] name = sections[i][j].getText().split("\n");
//                         file.print((name[0].split(" "))[0] + ";" + (name[0].split(" "))[1] + ";" + ((name[1]).split(" "))[0]  + ";" + ((name[1]).split(" "))[1] + ";" + name[2] + " ");
//                       }
//                       else {
//                         file.print("None ");
//                       }
//                     }
//                     file.print("\n");
//                 }
//             } 
//             catch (IOException e1) {
//                 e1.printStackTrace();
//             }
//         }
//       }
// }
  
