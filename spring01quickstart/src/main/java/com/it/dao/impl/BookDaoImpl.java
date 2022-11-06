package com.it.dao.impl;

import com.it.dao.BookDao;
import jdk.nashorn.internal.runtime.logging.Logger;


import java.util.List;

@Logger
public class BookDaoImpl implements BookDao {

    @Override
    public String getName() {
        System.out.println("bookdao :  查询书名");
        return null;
    }
}
