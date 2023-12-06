function CheckAddProduct(){
 let productId = document.getElementById("productId")
 let name = document.getElementById("name")
 let unitPrice = document.getElementById("unitPrice")
 let unitinStock = document.getElementById("unitInStock")

 if(!check(/^[A-Z][0-9]{4,11}$/, productId,
     "[상품 코드]\n대문자와 숫자를 조합하여 5~12자리까지 입력하세요"))
     return false
 //상품명 체크
  if(!check.value.length < 4 || name.value.length > 12){
   alert("[상품명]\n 최소 4개에 최대 12자까지 입력하세요")
   name.select()
   name.focus()
   return false
  }

  if(unitPrice.value.length == 0 || isNaN(unitPrice.value)){
   alert("[가격]\n숫자만 입력하세요")
   unitPrice.select()
   unitPrice.focus()
   return false
  }

  if (unitPrice.value < 0) {
   alert("[가격]\n음수는 입력할 수 없습니다")
   unitPrice.select()
   unitPrice.focus()
   return false
  }
  else if (!check(/^\d+(?:[.]?[\d]?[\d])?$/, unitPrice, "[가격]\n소수점 둘째 자리까지만 입력하세요"))
   return false
 if(isNaN(unitinStock.value)){
  alert("[재고 수]\n 숫자만 입력하세요")
  unitinStock.select()
  unitinStock.focus()
  return false
 }

 function check(regExp, e, msg){
  if(regExp.test(e.value)){
   return true
  }
  alert(msg)
  e.select()
  e.focus()
  return false
 }

 document.newProduct.submit()
}