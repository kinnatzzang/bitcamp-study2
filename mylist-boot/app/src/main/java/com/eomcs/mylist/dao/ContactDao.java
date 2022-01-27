package com.eomcs.mylist.dao;

import com.eomcs.mylist.domain.Contact;

public interface ContactDao {

  int countAll();

  Object[] findAll();

  void insert(Contact contact) throws Exception;

  Contact findByEmail(int no);

  int update(int no, Contact contact) throws Exception;

  int delete(int no) throws Exception;

}










