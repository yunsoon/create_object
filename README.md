# create_object
自动创建java对象的工具
在开发过程中 尤其是前后分离的开发中 为了保证前后端开发的步调一致 即后台的接口开发不影响前端的接口调用，
我们可以先定义好接口的名称及请求的返回参数，可是定义好这些后没有可测试的数据，前端在调试过程中还是有些局限。此时我们可以利用该项目来模拟生成返回的参数。
当后台接口服务等都开发好后在转移到后台服务调用上，此过程对项目毫无影响，也不会耦合。
举例说明，比如此时我们定义了一个查询学校信息的接口 请求为 /querySchool  返回学校信息对象 School
但此时刚定义了接口和返回的参数 ，后台服务甚至表都还没创建，可前端需要数据来测试前端样式或显示效果什么的，我们可以如下调用轻松生成School对象
 
 ##
 School school = CreateObjectUtil.createObject(School.class);
