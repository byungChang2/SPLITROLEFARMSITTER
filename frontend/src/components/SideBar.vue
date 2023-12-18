<template>
    <div class="side-bar-wrapper">
      <VueResizable
          class="resizable-side-bar"
          :width="500"
          :min-width="500"
          :max-width="Infinity"
          :active="['r']"
      >
        <div class="side-bar">
  
        </div>
      </VueResizable>
    </div>
  </template>
  
  <script>
   import VueResizable from 'vue-resizable';
   console.log("git stash 명령어 test")
   console.log("testcoupon branch에서 여러번 콘솔 난사 하고 git switch main하여서 여기서는 해당 콘솔들이 없지만 뭐 여튼 또 추가해보고 커밋할라고 이거 적어봄")
   console.log("git stash 명령어 test")
   console.log("git stash 명령어 test")
   console.log("git stash 명령어 test")
   console.log("현재 나의 작업 공간은 브랜치 testcoupon이다")
   console.log("현재 나의 작업 공간은 브랜치 testcoupon이다")
   console.log("현재 나의 작업 공간은 브랜치 testcoupon이다")
   console.log("현재 나의 작업 공간은 브랜치 testcoupon이다")

  export default {
    name: 'SideBar',
    components:{
        VueResizable
    },
    data() {
      return {
      }
    },
    methods: {
  
    }
  }
  </script>
  
  <style lang="scss" scoped>
  .side-bar-wrapper {
  > .resizable-side-bar {
    > .side-bar {
      background-color: #000000;
      opacity: 0.5;
      width: 100%;
      height: 100%;
    }
  }
}
  
  </style>