

const transferForm=document.getElementById("transfer-form")

const amountField=document.getElementById("amount")
const sourceField=document.getElementById("source")
const destinationField=document.getElementById("destination")

transferForm.addEventListener('submit',function(e){
	
	const amount=amountField.value
	const source=sourceField.value
	const destination=destinationField.value
	
	if(amount===""){
		amountField.style.border="1px solid red";
		amountField.focus()
		e.preventDefault()
		return
	}
	if(source===""){
		sourceField.style.border="1px solid red";
		sourceField.focus()
		e.preventDefault()
		return
	}
	if(destination===""){
		destinationField.style.border="1px solid red";
		destinationField.focus()
		e.preventDefault()
		return
	}
	
	
	
	
})