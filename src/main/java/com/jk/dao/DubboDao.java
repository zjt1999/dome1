package com.jk.dao;

import com.jk.model.Br;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DubboDao {

    List<Br> queryUser();

    void saUser(@Param("br") Br br);
}
