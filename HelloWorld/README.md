# HelloWorld

[初めての Spring Boot アプリケーションの開発](https://spring.pleiades.io/spring-boot/docs/current/reference/html/getting-started.html)
* 上記に従ったチュートリアルの実施

# 備考

* http://localhost:8080/ にアクセスするとHelloWorld!を表示する

# アノテーション

## @RestController
* リクエストを受け付けるコントローラークラスに付与する
## @EnableAutoConfiguration
* Spring Bootの様々な設定を自動的に有効にする（様々なが具体的に何なのか調査中）
## @RequestMapping("/")
* マッピングするURLの接頭辞を設定