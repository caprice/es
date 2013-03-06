/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.web.showcase.product.web.controller;

import com.sishuok.es.common.entity.enums.BooleanEnum;
import com.sishuok.es.common.entity.search.Searchable;
import com.sishuok.es.common.entity.validate.group.Create;
import com.sishuok.es.common.plugin.web.controller.BaseMovableController;
import com.sishuok.es.common.web.bind.annotation.PageableDefaults;
import com.sishuok.es.web.showcase.move.entity.Move;
import com.sishuok.es.web.showcase.move.service.MoveService;
import com.sishuok.es.web.showcase.product.entity.Category;
import com.sishuok.es.web.showcase.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-1-28 下午4:29
 * <p>Version: 1.0
 */
@Controller
@RequestMapping(value = "/showcase/product/category")
public class CategoryController extends BaseMovableController<Category, Long> {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        super(categoryService);
        this.categoryService = categoryService;
    }

    @Override
    protected void setCommonData(Model model) {
        model.addAttribute("booleanList", BooleanEnum.values());
    }


    //selectType  multiple single
    @RequestMapping(value = {"select/{selectType}", "select"}, method = RequestMethod.GET)
    @PageableDefaults(value = 10, sort = "weight=desc")
    public String select(
            Searchable searchable, Model model,
            @PathVariable(value = "selectType") String selectType,
            @MatrixVariable(value = "domId", pathVar = "selectType") String domId,
            @MatrixVariable(value = "domName", pathVar = "selectType", required = false) String domName) {
        model.addAttribute("selectType", selectType);

        model.addAttribute("domId", domId);
        model.addAttribute("domName", domName);

        super.list(searchable, model);
        return "showcase/product/category/select";
    }
}
