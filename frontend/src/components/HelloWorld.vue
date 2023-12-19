<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <p>
      IM FRONTEND ENGINEER 
      I WANT TO BE A GENERATOR
      <a href="https://cli.vuejs.org" target="_blank" rel="noopener">vue-cli documentation</a>.
    </p>
    <input type="text" v-model="todoItem">
    <button @click="sendToBackend">mbc문자열 추가</button>
    <List :items="backendList" />
  </div>
</template>

<script>
import List from './List'; 
import axios from 'axios';
export default {
  name: 'HelloWorld',
  components: {
    List
  },
  data() {
    return {
      todoItem: '', 
      backendList: [] 
    };
  },
  methods: {
    sendToBackend() {   
      axios.post('/api/addItem', { todoItem: this.todoItem })
        .then(response => {
          this.backendList.push(response.data);
          console.log(this.backendList)
        })
        .catch(error => {
          console.error('Error sending data to backend', error);
        });
    }
  }
}
</script>

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
