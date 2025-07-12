package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.Model.Produc;
import com.example.demo.Service.Serviceclass;
@Controller
public class Productcontroller {
@Autowired
Serviceclass service;//new ServiceClass
@GetMapping("/")
public String vv()
{
	return "main.html";
}
@GetMapping("/add")
public String addd()
{
	return "add.html";
}
@PostMapping("/add")
public String hh(Produc product,ModelMap map)
{
	service.add(product,map);//calling the service method
	return "main.html";
}
@GetMapping("/view")
public String view(ModelMap map)
{
	
	service.findRecords(map);
	return "veiw.html";
}
@GetMapping("/delete/{id}")
public String delete(@PathVariable int id,ModelMap map )
{
	service.delete(id, map);
	return view(map);
}
@GetMapping("/edit/{id}")
public String edit(@PathVariable int id,ModelMap map)
{
	service.edit(id, map);
	return "edit.html";
}
@PostMapping("/edit")
public String edit(@ModelAttribute Produc product,ModelMap map)
{
	service.update(product,map);
	return view(map);
}

}
