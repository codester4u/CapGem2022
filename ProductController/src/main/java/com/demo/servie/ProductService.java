package com.demo.servie;

import java.util.List;
import java.util.Optional;

import com.demo.pojo.Product;

public interface ProductService {
	
	    // POST
		Product addProductDetails(Product prodcut);

		// GET
		List<Product> getListOfProducts();

		/// PUT
		Product updateProductDetailsBtyId( Product prod, Long id);

		// GET
		Optional<Product> getDetailsById(Long id);

		// delete by id
		void deleteProductById(Long id);

}
