package br.com.cod3r.flyweight.map.utils;

import java.util.regex.Pattern;

public class Coordinate {

  private Coordinate(){

  }

  public static Integer getColumnCoordinate(String coord) throws Exception{
    if(isValidCoordinate(coord)) {
      char column = coord.charAt(0);

      if (Character.isLetter(column)) {
        return getColumnOrdinalPosition(column);
      } else {
        throw new Exception("Você deve digitar na primeira posição uma coluna de A a J");
      }
    } else {
      return 0;
    }
  }

  private static boolean isValidColumn(String coord) throws Exception{
    String column = String.valueOf(coord.charAt(0));
    if (!Pattern.matches("[A-Ja-j]", column)){
      throw new Exception("Na primeira posição deve ser informada a coluna, por exemplo A4");
    } else {
      return true;
    }
  }

  private static boolean isValidRow(String coord) throws Exception{
    String row = String.valueOf(coord.charAt(1));
    if (!Pattern.matches("[0-9]", row)){
      throw new Exception("Na segunda posição deve ser informada a linha, por exemplo A4");
    }else {
      return true;
    }
  }

  private static boolean isValidCoordinate(String coord) throws Exception {
    if (coord.length() != 2){
      throw new Exception("Atenção: deve ser informada uma coordenada no formato coluna + linha, por exemplo, A9");
    }

    return isValidColumn(coord) && isValidRow(coord);
  }

  public static Integer getRow(String coord) throws Exception {
    if (isValidCoordinate(coord)) {
      return Integer.valueOf(coord.substring(1, 2));
    } else {
      return 0;
    }
  }

  public static String getLetterColumn(int column) {
    switch (column){
      case 0:
        return "A";
      case 1:
        return "B";
      case 2:
        return "C";
      case 3:
        return "D";
      case 4:
        return "E";
      case 5:
        return "F";
      case 6:
        return "G";
      case 7:
        return "H";
      case 8:
        return "I";
      case 9:
        return "J";
      default:
        return "";
    }
  }

  private static Integer getColumnOrdinalPosition(Character character) {
    switch (character.toString().toUpperCase()){
      case "A":
        return 0;
      case "B":
        return 1;
      case "C":
        return 2;
      case "D":
        return 3;
      case "E":
        return 4;
      case "F":
        return 5;
      case "G":
        return 6;
      case "H":
        return 7;
      case "I":
        return 8;
      case "J":
        return 9;
      default:
        return 0;
    }
  }

}
