<template>
  <el-container style="min-height: 100vh">

    <el-aside :width="sideWidth + 'px'" style="background-color: rgb(238, 241, 246); box-shadow: 2px 0 6px rgb(0 21 41/ 35%);">
      <Aside :isCollapse="isCollapse" :logoTextShow="logoTextShow"/>
    </el-aside>

    <el-container>
      <el-header style="border-bottom: 1px solid #ccc;">
        <Header :collapse-btn-class="collapseBtnClass" :collapse="isCollapse"/>
      </el-header>

      <el-main>
        <!--当前页面子路由-->
        <router-view />
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import Aside from "@/components/Aside";
import Header from "@/components/Header";
import User from "@/views/User";

export default {
  name: 'Home',
  components: {
    User,
    Header,
    Aside,
    HelloWorld
  },
  data() {
    return {
      logoTextShow: true,
      collapseBtnClass: 'el-icon-s-fold',
      isCollapse: false,
      sideWidth: 200
    }
  },

  methods: {
    collapse() {
      this.isCollapse = !this.isCollapse
      if(this.isCollapse){
        this.sideWidth = 64
        this.collapseBtnClass = 'el-icon-s-unfold'
        this.logoTextShow = false
      }
      else{
        this.sideWidth = 200
        this.collapseBtnClass = 'el-icon-s-fold'
        this.logoTextShow = true
      }
    }
  }
}
</script>

<style>
.headerBg {
  background-color: #eee!important;
}
</style>