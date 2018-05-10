<template>
   <div>
   	  <commuHeaderNav @activeFlag="changeActiveFlag"></commuHeaderNav>
   	  <message v-if="showMessage" ></message>
   	  <activity v-if="!showMessage"></activity>
   </div>
</template>

<script>
	import commuHeaderNav from './commuHeaderNav'
	import message from './Message'
	import activity from './Activity'
	export default {
		components: { commuHeaderNav, message, activity },
		data: () => ({
			showMessage: true
		}),
		methods:{
			changeActiveFlag(flag){
				this.showMessage = flag === 0 ? true : false;
			}
		}
	};
</script>

<style>
</style>