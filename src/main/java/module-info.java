module  project {
  requires javafx.controls;
  requires transitive javafx.fxml;
  requires transitive javafx.graphics;
  requires javafx.base;
  requires java.desktop;

  opens project to javafx.fxml;

  exports project;
}
