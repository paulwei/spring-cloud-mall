1.访问主页地址/client/index

2. ExceptionTranslationFilter拦截,跳转client/login

3. OAuth2ClientAuthenticationProcessingFilter---------->OAuth2RestTemplate

4.  OAuth2RestTemplate 抛出异常,

5.OAuth2ClientContextFilter  访问传递resource : clientId+clientSecret  访问 http://127.0.0.1:9999/server/oauth/authorize

6.认证成功后 跳转 client/login ,  OAuth2ClientAuthenticationProcessingFilter---------->OAuth2RestTemplate获取token

7.登录成功