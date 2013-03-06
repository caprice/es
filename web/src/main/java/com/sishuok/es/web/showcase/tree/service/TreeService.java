/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.web.showcase.tree.service;

import com.sishuok.es.common.plugin.serivce.BaseTreeableService;
import com.sishuok.es.common.service.BaseService;
import com.sishuok.es.web.showcase.tree.entity.Tree;
import com.sishuok.es.web.showcase.tree.repository.TreeRepository;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-2-4 下午3:01
 * <p>Version: 1.0
 */
@Service
public class TreeService extends BaseTreeableService<Tree, Long> {

    @Autowired
    public void setTreeRepository(TreeRepository treeRepository) {
        setBaseRepository(treeRepository);
    }

}
