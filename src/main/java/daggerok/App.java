package daggerok;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class App {
  public static void main(String[] args) {
    List<Object> list = new ArrayList();
    list.add(new Integer(1234));
    System.out.print(list);
    log.info("yo!");
  }
}
