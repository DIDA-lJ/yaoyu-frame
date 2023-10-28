<h1 align="center"> <img src="https://github.com/TheDudeThatCode/TheDudeThatCode/raw/master/Assets/Developer.gif" style="width: 45px; display: inline-block;" data-target="animated-image.originalImage"> yaoyu-frame</h1>
<h2 align="center">基于 SpringBoot 开发的轻量级框架 </h2>
<h3>✨项目简介</h3>
夭语框架，致力于成为一款优秀的轻量级脚手架，采用组件化开发模式，使得用户可根据自身情况选择组件来进行使用，致力于成为一款适用于中小企业的轻量级快速开发框架，里面涵盖了大量平时业务开发的常用场景，实现开箱即用，且用户可以根据自身的情况，采用组件化的方式进行开发。
比如用户需要redis，则选择redis组件，需要websocket，则引入websocket组件，用户自身不需要再开发什么，只需要按照组件规则进行使用即可。
项目整体采用maven结构开发，封装了大量的模块，彼此解耦。满足用户日常开发需要。
<h3>🗨 yaoyu-common</h3>
<ul>
<li>yaoyu-common-job：分布式任务调度组件</li>
<li>yaoyu-common-log：日志组件，提供日志切面自动记录及异步日志提升性能</li>
<li>yaoyu-common-mybatisplus：采用Mybatisplus作为与数据库交互</li>
<li>yaoyu-common-redis：缓存组件，提供基于redis的操作封装，redis分布式锁，guava的cache工具类</li>
<li>yaoyu-common-starter：启动类组件，与启动类相关的功能，放到此组件处，目前包含mongoStarter</li>
<li>yaoyu-common-swagger：swagger组件，提供整体项目访问api的入口及方法文档</li>
<li>yaoyu-common-test：测试组件，集成springboot-test，及代码单元测试，代码覆盖率，行覆盖率检测</li>
<li>yaoyu-common-tool：常用的工具类组件，满足业务日常开发的各种需要，保障安全性，低入侵性</li>
<li>yaoyu-common-web：web组件，提供统一异常处理，web模块转换，统一返回值</li>
<li>yaoyu-common-websocket：websocket组件，提供一套带鉴权的websocket，引入即用，简单方便</li>
<li>yaoyu-common-mail：邮件发送组件</li>
</ul>

<h3>🌱yaoyu-dependencies</h3>
该模块为一个父pom模块，提供项目整体的maven包的锁定及规范，统一升级，统一引入。
