<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <p>
      IM FRONTEND ENGINEER 
      I WANT TO BE A GENERATOR
    </p>
    <p href="/context_newkjh">지훈 생성 API</p>
    <form v-on:submit="onSubmitform">
      <input type="text" v-model="message" placeholder="글자를 입력해주세요">
      <p>{{this.message}}</p>
    </form>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  methods: {
    onSubmitform(e){
      e.preventDefault();
      console.log("message =" + this.message);
    }
  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
