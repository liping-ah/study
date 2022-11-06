package com.it.dao.impl;

import com.it.dao.BookDao;
import jdk.nashorn.internal.runtime.logging.Logger;


import java.util.List;

@Logger
public class BookDaoImpl implements BookDao {
    @Override
    public List getlist() {

        System.out.println("书籍 列表");
        return null;
    }
}
