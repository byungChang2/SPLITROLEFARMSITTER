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
    <a>-------------------------------구분선-------------------------------</a>
    <br>
    <br>
    <input type="text" v-model="kjhString">
    <button @click="sendToKjh">kjh문자열 추가</button>
    <br>
    <br>
    <a>cubic 화이팅</a>
    <List :items="kjhList" />
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
      backendList: [] ,
      kjhString: '',
      kjhList: [] ,
    };
  },
  methods: {
    sendToBackend() {   
      axios.post('/api/addItem', { todoItem: this.todoItem })
        .then(response => {
          console.log("병창님 입력한 문자열",this.todoItem)
          this.backendList.push(response.data);
          console.log("병창님 : ",this.backendList)
        })
        .catch(error => {
          console.error('Error sending data to backend', error);
        });
    },
    sendToKjh() {   
      axios.post('/api/kjhstring', { kjhString: this.kjhString })
        .then(responses => {
          console.log(responses);
          console.log("지훈 입력한 문자열",this.kjhString)
          this.kjhList.push(responses.data);
          console.log("지훈 : ",this.kjhList)
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
