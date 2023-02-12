// import javafx.animation.PathTransition;
// import javafx.animation.Timeline;
// import javafx.application.Application;
// import javafx.scene.layout.Pane;
// import javafx.scene.paint.Color;
// import javafx.scene.shape.Circle;
// import javafx.scene.shape.Rectangle;
// import javafx.stage.Stage;
// import javafx.util.Duration;
// import javafx.scene.Scene;

// public class Lab17 extends Application {

//     @Override
//     public void start(Stage primaryStage) {
//         Pane pane = new Pane();
//         Rectangle rectangle = new Rectangle (0, 0, 25, 50);
//         rectangle.setFill(Color.ORANGE); 
//         rectangle.setStroke(Color.BLACK);
//         Circle circle = new Circle(150, 150, 50); 
//         circle.setFill(Color.WHITE);
//         circle.setStroke(Color.BLACK);
//         pane.getChildren().add(rectangle);
//         pane.getChildren().add (circle);

//         PathTransition pt = new PathTransition();
//         pt.setDuration(Duration.millis(2000));
//         pt.setPath(circle);
//         pt.setNode(rectangle);  
//         pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
//         pt.setCycleCount(Timeline.INDEFINITE);
//         pt.setAutoReverse(true);
//         pt.play();

//         circle.setOnMousePressed(e -> pt.pause()) ;
//         circle.setOnMouseReleased(e -> pt.play());

//         Scene scene = new Scene(pane, 300, 300);
//         primaryStage.setTitle("PathTransitionDemo");
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//       }
// }