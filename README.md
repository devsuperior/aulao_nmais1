# Aulão Problema N+1 queries com Spring Data JPA

#### Assista o vídeo desta aula:

[![Image](https://img.youtube.com/vi/sqbqoR-lMf8/mqdefault.jpg "Vídeo no Youtube")](https://youtu.be/sqbqoR-lMf8)

#### Testes SQL

```
SELECT * FROM tb_product LIMIT 0,5

SELECT * FROM tb_product LIMIT 5,5

SELECT * FROM tb_product 
	INNER JOIN tb_product_category ON tb_product.id = tb_product_category.product_id
	INNER JOIN tb_category ON tb_category.id = tb_product_category.category_id

SELECT * FROM tb_product 
	INNER JOIN tb_product_category ON tb_product.id = tb_product_category.product_id
	INNER JOIN tb_category ON tb_category.id = tb_product_category.category_id
	LIMIT 0,5

SELECT * FROM tb_product WHERE id IN (1,2,3,4,5)

SELECT * FROM tb_product 
	INNER JOIN tb_product_category ON tb_product.id = tb_product_category.product_id
	INNER JOIN tb_category ON tb_category.id = tb_product_category.category_id
	WHERE tb_product.id IN (1,2,3,4,5)
```  
 
