This is an Intellij Idea Android Project.

How to use it?

Follow this below url

http://nisostech.com/retrofit-android-example/

A sample way about how to use Retrofit

# Dependencies
  - appcompat-v7:21.0.3  
  - retrofit:1.9.0
  - okhttp-urlconnection:2.0.0 okhttp:2.0.0


Import This Project into Intellij Idea

Then change in the RestClient.java file

private static String ROOT =
            "http://192.168.1.10/testapp"  //Give it your own url

Change in RestApi.Java file

    @POST("/user/login")
    void login(@Body UserVo user,
               RestCallback<LoginResponse> callback);    // Change according to yours path api













