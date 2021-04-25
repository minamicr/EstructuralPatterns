package br.com.cod3r.flyweight.map.game;

import br.com.cod3r.flyweight.map.model.Pixel;
import br.com.cod3r.flyweight.map.model.PixelTypeFactory;
import br.com.cod3r.flyweight.map.utils.Coordinate;
import java.util.Random;

public class Map {
	private static final Integer TRYS = 10;
	private static final Integer MAP_ROWS = 10;
	private static final Integer MAP_COLUMNS = 10;
	
	private Pixel[][] mapGame;
	private Integer trysRemaining;
	
	public Map() {
		mapGame = createMap();
		trysRemaining = TRYS;
	}
	
	private Pixel[][] createMap() {
		Pixel[][] mapGame = new Pixel[MAP_ROWS][MAP_COLUMNS];
		for(int row = 0; row < mapGame.length; row++) {
			for(int column = 0; column < mapGame[row].length; column++) {
				Pixel pixel = sortPixel();
				mapGame[row][column] = pixel;
			}
		}
		return mapGame;
	}

	private Pixel sortPixel(){
		Pixel pixel;
		int pix = sort();

		switch (pix) {
			case 0:
				pixel = new Pixel(PixelTypeFactory.getInstance().getPixelType('$', 100), false);
				break;
			case 1:
				pixel = new Pixel(PixelTypeFactory.getInstance().getPixelType('%', 50), false);
				break;
			case 2:
				pixel = new Pixel(PixelTypeFactory.getInstance().getPixelType('X', -50), false);
				break;
			case 3:
				pixel = new Pixel(PixelTypeFactory.getInstance().getPixelType('@', -100), false);
				break;
			default:
				pixel = new Pixel(PixelTypeFactory.getInstance().getPixelType(' ', 0), false);
				break;
		}
		return pixel;
	}

	public void drawMap() {
		System.out.println("----------------");
		System.out.print(" ");
		for(int column = 0; column < MAP_COLUMNS; column++)
			System.out.print(" " + Coordinate.getLetterColumn(column));
		for(int row = 0; row < mapGame.length; row++) {
			System.out.print("\n" + row);
			for(int column = 0; column < mapGame[row].length; column++) {
				Pixel cell = mapGame[row][column];
				System.out.print(' ');
				System.out.print(cell.isOppened()? cell.getType().getCharacter() : '#');
			}
		}
		System.out.println(String.format("\nYou have %d trys left", trysRemaining));
	}


	public Integer openCell(String coord) throws Exception{

		Integer row = Coordinate.getRow(coord);
		Integer column = Coordinate.getColumnCoordinate(coord);

		Pixel choosen = mapGame[row][column];
		if(!choosen.isOppened()) {
			choosen.setOppened(true);
			trysRemaining--;
			return choosen.getType().getTreasureReward();
		}
		return 0;
	}


	public boolean isGameOver() {
		return trysRemaining == 0;
	}
	
	private int sort() {
		Random r = new Random();
		return r.nextInt(10);
	}
}
