package GameState.LevelState;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import Control.GamePanel;
import GUI_Game.PauseButton;
import GUI_Game.UrmButton;
import GameState.GameState;
import GameState.State;
import GameState.StateMethods;

public class Level extends State implements StateMethods{

    private UrmButton level_2;
    private UrmButton menu;

    private int level = 2; 
    //it can be stable if the level are still remaining 

    public Level(GamePanel panel) {
        super(panel);
        
    }

    @Override
    public void update() {
    }

    @Override
    public void draw(GamePanel panel, Graphics g) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    //getter method
    public int getLevel(){
        return level;
    }

    //setter method
    public void setLevel(int num){
        this.level = num;
    }
}
