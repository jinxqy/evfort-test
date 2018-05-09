<template>
  <div id="root">
  	<section class="image-box">
  		
  	</section>
  	<section>
    <div class='input-box'>
    	<div class="flex1"></div>
    	  <input class="input" type="text" placeholder="手机号码" />
    	<div class="flex1"></div>
    </div>
    
    <div class='input-box'>
    	<div class="flex1"></div>
        <input class="input pwd-input" type="password" placeholder="密码" />
      <div class="flex1"></div>
    </div>
    
    <div class='input-box'>
    	<div class="flex1"></div>
    	<div class="flex8 input-box check-dv">
    		<div style="display: flex; flex-direction: row; position: relative;">
    		  <wxc-checkbox style="margin-left: -20px;" :has-bottom-border="false" title="记住密码"></wxc-checkbox>
    		</div>
    		<div style="margin-top: 40px; border-bottom-width: 1px; "><text>忘记密码</text></div>
    	</div>
    	<div class="flex1"></div>
    </div>   
    </section>
    
    <section>
    	<div class="btn-box login-dv">
    		<div class="flex1"></div>
    		<div class="flex8">
    	  	<wxc-button text="登 录" style="width: 600px;" @wxcButtonClicked="wxcButtonLoginClicked" type="blue"></wxc-button>    	 
    		</div>
    		<div class="flex1"></div>
    	</div>
    	
    	<div class="btn-box register-dv">
    		<div class="flex1"></div>
    		<div>   	  	
    	    <wxc-button text="注册" style="width: 600px;" @wxcButtonClicked="wxcButtonRegisterClicked" type="white"></wxc-button>
    		</div>
    		<div class="flex1"></div>
    	</div>
    </section>
  </div>
</template>

<script>
  import { WxcCheckbox,WxcCheckboxList } from 'weex-ui'
  import { WxcButton } from 'weex-ui'
  var navigator = weex.requireModule('navigator')
  
  //const baseUrl = "http://192.168.31.52:8081/dist"
  const baseUrl = "http://192.168.1.128:8081/dist"
  export default {
    components: { WxcCheckbox, WxcCheckboxList, WxcButton },
    data:() =>({
    	 a: "111"
    }),
    methods:{ 
    	wxcButtonLoginClicked(){
    		navigator.push({
          url: baseUrl + '/components/TabBar.js',
          animated: "true"
        })
    	}
    }
  }
</script>
<style>
	*{
		margin: 0;
		padding: 0;
	}
	
	#root{
		color: #333333;
	}
	
	.image-box{
	   height: 300px;	
	}
	
	.btn-box{
		display: flex;
    flex-direction: row;
    justify-content: center;
	}
	
  .input-box{
     display: flex;
     flex-direction: row;
  }

  .input{
  	 flex: 8;
  	 width: 250px;
  	 border-width: 2px;
  	 border-style: solid;
  	 border-color: #cccccc;
     justify-content: center;   
     padding: 20px;
  }

   .flex1 {
   	flex: 1;
   }
   
   .flex2 {
   	flex: 2;
   }
   
   .flex8 {
   	flex: 8;
   }
   
   .check-dv{
   	 color: #CCCCCC;
   	 justify-content: space-between;
   }
   
  .pwd-input, .register-dv, .login-dv{
  	margin-top: 50px;
  }
</style>