package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.example.demo.Model.Produc;
import com.example.demo.Repository.Repository;

@Service
public class Serviceclass {
@Autowired
Repository repository;

public void add(Produc product,ModelMap map)
{
	repository.save(product);//save product in database
	map.put("pass", "Product Added Success");//pass the message in ui
}
public void findRecords(ModelMap map)
{
	map.put("products", repository.findAll());
}

public void delete(int id,ModelMap map)
{
repository.deleteById(id);
map.put("pass", "product deleted Succesfully");

	
}
public void edit(int id,ModelMap map)
{
	Produc product=repository.findById(id).get();
	map.put("product", product);
	/*Optional<Produc> optionalProduct=repository.findById(id);
	if(optionalProduct.isPresent())
	{
		map.put("product", optionalProduct.get());
	}
	else {
		map.put("error", "Product not found");
	}*/
}
public void update(Produc product,ModelMap map)
{
	repository.save(product);
	map.put("pass", "product updated success");
}
}

