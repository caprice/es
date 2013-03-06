/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.web.showcase.move.service;

import com.sishuok.es.common.plugin.serivce.BaseMovableService;
import com.sishuok.es.web.showcase.move.entity.Move;
import com.sishuok.es.web.showcase.move.repository.MoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-2-4 下午3:01
 * <p>Version: 1.0
 */
@Service
public class MoveService extends BaseMovableService<Move, Long> {


    @Autowired
    private void setMoveRepository(MoveRepository moveRepository) {
        setBaseRepository(moveRepository);
    }

}
