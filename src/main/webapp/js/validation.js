function CheckAddProduct(){
 var productId = document.getElementById("productId");
 var name = document.getElementById("name");
 var unitPrice = document.getElementById("unitPrice");
 var unitsStock = document.getElementById("unitInStock");

 if(!check(/^P[0-9]{4,11}$/, productId,
     "[상품 코드]\nP와 숫자를 조합하여 5~12자리까지 입력하세요"))
}