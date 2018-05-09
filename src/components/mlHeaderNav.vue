<template>
	<div class="header-box">
		<div class="flex2" style="padding-left: 20px;">
			<text class="font-white">△成都</text>
		</div>
		<div class="flex8">
			<div class="dvSearch" style="padding-left: 20px;" @click="jumpSearch">
				<text style="color: #CCCCCC;">搜索充电站</text>
			</div>
		</div>
		<div class="flex2">
			
		</div>
	</div>
</template>

<script>
	import mlHeaderNav from './mlHeaderNav'
	
</script>

<style scoped>
	.font-white{
	   color: #FFFFFF;	
	   height: 100px;
	   line-height: 100px;
	}
	
	.dvSearch{
		justify-content: center;
		border-radius: 5px;
		height: 60px;
		line-height: 60px;
		background-color: #FFFFFF;
	}
	
	.header-box{
	   width: 750px;
	   height: 100px;
	   display: flex;
	   flex-direction: row;	
	   background-color:#00B4FF;
	   justify-content: center;
	   align-items: center;
	}
	
	.flex2{
		flex: 2;
	}
	
	.flex8{
		flex: 8;
	}
</style>