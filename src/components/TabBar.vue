<template>
  <wxc-tab-bar :tab-titles="tabTitles"
               :tab-styles="tabStyles"
               title-type="icon"
               @wxcTabBarCurrentTabSelected="wxcTabBarCurrentTabSelected">
    <!-- 第一个页面内容-->
    <div class="item-container" :style="contentStyle">
    	<map-location class="maplocation" :style="contentStyle"></map-location>
    </div>

    <!-- 第二个页面内容-->
    <div class="item-container" :style="contentStyle">
    	<imformation :style="contentStyle"></imformation>
    </div>

    <!-- 第三个页面内容-->
    <div class="item-container" :style="contentStyle">
    	<community :style="contentStyle"></community>
    </div>

    <!-- 第四个页面内容-->
    <div class="item-container" :style="contentStyle"><text>我的主页</text></div>
  </wxc-tab-bar>
</template>

<script>
  import { WxcTabBar, Utils } from 'weex-ui';
  import MapLocation from './MapLocation';
  import Imformation from './Imformation';
  import Community from './Community';
  // https://github.com/alibaba/weex-ui/blob/master/example/tab-bar/config.js 
  import Config from './config';

  export default {
    components: { WxcTabBar, MapLocation, Imformation, Community},
    data: () => ({
      tabTitles: Config.tabTitles,
      tabStyles: Config.tabStyles
    }),
    created () {
      const tabPageHeight = Utils.env.getPageHeight();
      // 如果页面没有导航栏，可以用下面这个计算高度的方法
      // const tabPageHeight = env.deviceHeight / env.deviceWidth * 750;
      const { tabStyles } = this;
      this.contentStyle = { height: (tabPageHeight - tabStyles.height) + 'px' };
    },
    methods: {
      wxcTabBarCurrentTabSelected (e) {
        const index = e.page;
        // console.log(index);
      }
    }
  };
</script>

<style scoped>
	.maplocation {
	  width: 750px;
	  height: 100px;	
	}
	
  .item-container {
    width: 750px;
    background-color: #f2f3f4;
    align-items: center;
    justify-content: center;
  }
</style>