# 1 观察者模式

# 2 java 的观察者模式实现
`java.util.Observer` 观察者接口
`java.util.Observable` 被观察者类

这两个在 java9 之后被废弃了

官方文档的建议：
- For a richer event model, consider using the java.beans package. 
- For reliable and ordered messaging among threads, consider using one of the concurrent data structures in the java.util.concurrent package. 
- For reactive streams style programming, see the Flow API.

- 不要依赖观察者被通知的顺序做任何事，这不靠谱。

