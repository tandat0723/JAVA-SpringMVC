/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttd.controllers;

import com.ttd.pojo.Category;
import com.ttd.pojo.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        List<Category> cates = new ArrayList<>();
        cates.add(new Category(1, "Mobile"));
        cates.add(new Category(2, "Tablet"));
        cates.add(new Category(3, "Laptop"));
        cates.add(new Category(4, "Desktop")); 
        
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Iphone 14", "https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/t/_/t_m_18.png", 3000000l));
        products.add(new Product(1, "Iphone 14", "https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/t/_/t_m_18.png", 3000000l));
        products.add(new Product(1, "Iphone 14", "https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/t/_/t_m_18.png", 3000000l));
        products.add(new Product(1, "Iphone 14", "https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/t/_/t_m_18.png", 3000000l));
        products.add(new Product(1, "Iphone 14", "https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/t/_/t_m_18.png", 3000000l));
        products.add(new Product(1, "Iphone 14", "https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/t/_/t_m_18.png", 3000000l));
        
        model.addAttribute("categories", cates);
        model.addAttribute("products", products);
        
        return "index";
    }
}
