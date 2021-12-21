package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
// 이 클래스가 클라이언트 요청 처리 담당자임을 표시한다.
// 이 표시(애노테이션)가 붙어 있어야만 스프링부트가 이 클래스를 인식한다.
public class MyController {

  String[] my1s = new String[5];
  int size = 0;

  @RequestMapping("/my1/list")
  public Object list() {
    String[] arr = new String[size]; // 배열에 저장된 값만 복사할 새 배열을 만든다.
    for (int i = 0; i < size; i++) { 
      arr[i] = my1s[i]; // 전체 배열에서 값이 들어 있는 항목만 복사한다.
    }
    return arr; // 복사한 항목들을 담고 있는 새 배열을 리턴한다.
  }

  @RequestMapping("/my1/add")
  public Object add(String title, String year, String company) {
    String my1 = title + "," + year + "," + company;
    my1s[size++] = my1;
    return size;
  }

  @RequestMapping("/my1/get")
  public Object get(String title) {
    for (int i = 0; i < size; i++) {
      if (my1s[i].split(",")[0].equals(title)) { 
        return my1s[i];
      }
    }
    return "";
  }

  @RequestMapping("/my1/update")
  public Object update(String title, String year, String company) {
    String my1 = title + "," + year + "," +  company;
    for (int i = 0; i < size; i++) {
      if (my1s[i].split(",")[0].equals(title)) { 
        my1s[i] = my1;
        return 1;
      }
    }

    return 0;
  }

  @RequestMapping("/my1/delete")
  public Object delete(String title) {
    for (int i = 0; i < size; i++) {
      if (my1s[i].split(",")[1].equals(title)) {
        for (int j = i + 1; j < size; j++) {
          my1s[j - 1] = my1s[j];
        }
        size--;
        return 1;
      }
    }
    return 0;
  }
}
