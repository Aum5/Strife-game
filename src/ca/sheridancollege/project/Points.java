package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

class Points {
  private List<Points> player1Points;
  private List<Points> player2Points;

  public Points() {
    player1Points = new ArrayList<Points>();
    player2Points = new ArrayList<Points>();
  }

  public void addPointToPlayer1(Points point) {
    player1Points.add(point);
  }

  public void addPointToPlayer2(Points point) {
    player2Points.add(point);
  }

  
  public int getPlayer1PointCount() {
    return player1Points.size();
  }

  public int getPlayer2PointCount() {
    return player2Points.size();
}
}
