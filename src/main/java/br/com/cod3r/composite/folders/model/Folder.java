package br.com.cod3r.composite.folders.model;

import java.util.List;

public class Folder implements FileSystemItem{
  String name;
  List<FileSystemItem> children;

  public Folder(String name, List<FileSystemItem> children) {
    this.name = name;
    this.children = children;
  }

  @Override
  public void print(String structure) {
    System.out.println(structure + name);
    for (FileSystemItem child : children){
      child.print(structure + "| ");
    }
  }
}
