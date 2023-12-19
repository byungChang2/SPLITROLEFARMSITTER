<!-- <template>
  <div id="app">
    <MainMap/>
    <SideBar class="side-bar"/>
  </div>
</template>

<script>
import MainMap from '@/components/MainMap'
import SideBar from '@/components/SideBar'

export default {
  name: 'App',
  components: {
    MainMap,
    SideBar
    
  }
}
</script>

<style lang="scss">
#app {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;

  > .side-bar {
    position: absolute;
    left: 0;
    top: 0;
    bottom: 0;
  }
 
}
</style> -->




<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <HelloWorld msg="Welcome to Your Vue.js App"/>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
