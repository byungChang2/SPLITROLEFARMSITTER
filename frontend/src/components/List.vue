<template>
  <div>
    <h2>List 컴포넌트</h2>
    <ul>
      <li v-for="item in items" :key="item.id">{{ item }}</li>
    </ul>
  </div>
</template>

<script>
export default {
  props: {
    items: Array // 부모 컴포넌트로부터 전달받은 배열
  },
  created() {
    console.log('List 컴포넌트의 items:', this.items);
  }
}
</script>