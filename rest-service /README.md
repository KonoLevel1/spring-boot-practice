# HelloWorld

[RESTful Web サービスの構築](https://spring.pleiades.io/guides/gs/rest-service/)
* 上記に従ったチュートリアルの実施

# 備考

* http://localhost:8080/greeting にアクセスするとidと文字列を表示する。
* クエリを利用して表示する。
* クエリがない場合は、デフォルト文字列を表示する。

# アノテーション

## @RestController
* リクエストを受け付けるコントローラークラスに付与する
## @GetMapping("/")
* GETメソッドを受け付けるためのメソッドに付与
## @RequestParam
* リクエストパラメーターを受け取る