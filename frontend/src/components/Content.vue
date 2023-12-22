<template>
<div>
    <h2>새로운 contents</h2>
    <input type="text" v-model="inputContent">
    <button @click="send">클릭</button>
    <ContentList :inputs="contentList"/>
</div>
</template>

<script>
import axios from 'axios';
import ContentList from './ContentList.vue';
export default {
    name : 'content',
    components:{
        ContentList
    },
    data(){
        return{
            inputContent:'',
            contentList:[]
        };
    },
    methods:{
        send(){
            axios.post('/api/addContent',{inputContent:this.inputContent})
            .then(response=>{
                this.contentList.push(response.data);
            })
            .catch(error=>{
                console.error('Error sending data to backend',error);
            })
        }
    }
}
</script>

<style>

</style>