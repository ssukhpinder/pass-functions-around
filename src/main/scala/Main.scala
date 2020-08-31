object Main extends App {
  //Simple Function Call
  AcceptFunctionNameAsParam(FunctionParameter)
  
  //Anonymous function callback
  AcceptFunctionNameAsParam(()=>
	println("Hello from anonymous function passed as argument")
  )
  
  //The function accept function name as argument
  def AcceptFunctionNameAsParam(callback: () => Unit) {
     callback();
  }
  //The function whose name will be passed as a argument
  def FunctionParameter() {
    println("Hello from function passed as argument")
  }
  
  //composite function
  println(multiply(addition(10)) )
	def addition(i:Int):Int = {  
        i+2  
    }  
      
	def multiply(i:Int):Int = {  
		i*2  
	}  
}