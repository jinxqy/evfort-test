<template>
	<div class="header-box">
		<div class="dvZXHeader" style="padding-left: 20px;" @click="jumpSearch">
			<div>
				<text class="isMessage" :class="[classObject.active === true ? 'active' : 'notActive']" @click="clickMessage">消息</text>
			</div>
			<div>
				<text class="isMessage" :class="[classObject.active === false ? 'active' : 'notActive']" @click="clickActive">活动</text>
			</div>
		</div>
	</div>
</template>

<script>
	export default {
		data: () => ({
			classObject:{
				active: true
			}			
		}),
		methods:{
			clickMessage(){
				this.classObject.active = true;
				this.$emit('activeFlag', 0);
			},
			clickActive(){
				this.classObject.active = false;
				this.$emit('activeFlag', 1);
			}
		}
	}; 
</script>

<style scoped>
	.dvZXHeader{
	   width: 750px;
	   height: 100px;
	   display: flex;
	   flex-direction: row;	
	   background-color:#00B4FF;
	   justify-content: center;
	   align-items: center;
	}
	
	.isMessage{		
		justify-content: center;
	    align-items: center;
		height: 50px;
		line-height: 50px;
		width: 150px;
		text-align: center;
		border-width: 1px;
		border-style: solid;
        border-color: #FFFFFF;       
	}
	
	.notActive{
		background-color: #00B4FF;
		color: #FFFFFF;
	}
	
	.active{
		background-color: #FFFFFF;
		color: #00B4FF;
	}
</style>