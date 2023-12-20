const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  outputDir:"../backend/src/main/resources/static", // npm run build파일이 생성되는 위치
  devServer:{ //devServer : SpringBoot 의 내장 WAS 주소
    proxy: {
      '/': {
        target: "http://localhost:8080",
        changeOrigin: true,
      }
    }
  },
  lintOnSave: false, // 단일 단어 컴포넌트 사용 가능
});