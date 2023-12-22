<template>
  <div>content list가 출력됩니다.</div>
  <ul>
    <li v-for="input in inputs" :key="input.id">{{ input }}</li>
  </ul>
</template>

<script>
export default {
    props : {
        inputs: Array
    },
    created(){
        console.log('inputs:',this.inputs);
    }
}
</script>

<style>

</style>