## 主要作用

- 一种对象创建模式，确保项目中一个类只产生一个实例。

## 优缺点

### 优点

- 对于频繁使用的对象可以减少创建对象所花费的时间，这对于重量级对象来说，简直是福音。由于new的减少，对系统内存使用频率也会降低，减少 GC 的压力，并缩短 GC 停顿时间，这也会减少 Android 项目的 UI 卡顿。

### 缺点

- 没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。

## 何时使用

- 当你希望整个系统运行期间某个类只有一个实例时候

## 相关概念

### 原子操作

- 即不可分割的操作，在计算机中，就是指不会因为线程调度被打断的操作

- 例子：

  ```
  m = 6; // 这是个原子操作
  
  假如m原先的值为0，那么对于这个操作，要么执行成功m变成了6，要么是没执行m还是0，而不会出现诸如m=3这种中间态——即使是在并发的线程中。
  
  而，声明并赋值就不是一个原子操作：
  
  int n = 6; // 这不是一个原子操作
  
  对于这个语句，至少有两个操作：
  
  声明一个变量n
  给n赋值为6
  这样就会有一个中间状态：变量n已经被声明了但是还没有被赋值的状态。
  
  在多线程中，由于线程执行顺序的不确定性，如果两个线程都使用m，就可能会导致不稳定的结果出现。
  ```

### 指令重排

- 即计算机为了提高执行效率，会做的一些优化，在不影响最终结果的情况下，可能会对一些语句的执行顺序进行调整。

- 例子：

  ```
  nt a ; // 语句1
  
  a = 8 ; // 语句2
  
  int b = 9 ; // 语句3
  
  int c = a + b ; // 语句4
  
  正常来说，对于顺序结构，执行的顺序是自上到下，也即1234。
  
  但是，由于指令重排的原因，因为不影响最终的结果，所以，实际执行的顺序可能会变成3124或者1324。
  
  由于语句3和4没有原子性的问题，语句3和语句4也可能会拆分成原子操作，再重排。
  
  也就是说，对于非原子性的操作，在不影响最终结果的情况下，其拆分成的原子操作可能会被重新排列执行顺序。
  
  主要在于testSingleton = new TestSingleton()这句，这并非是一个原子操作，事实上在 JVM 中这句话大概做了下面 3 件事情。
  
  给 testSingleton 分配内存
  调用 testSingleton 的构造函数来初始化成员变量，形成实例
  将testSingleton 对象指向分配的内存空间（执行完这步 testSingleton 才是非 null 了）
  但是在 JVM 的即时编译器中存在指令重排序的优化。也就是说上面的第二步和第三步的顺序是不能保证的，最终的执行顺序可能是 1-2-3 也可能是 1-3-2。如果是后者，则在 3 执行完毕、2 未执行之前，被线程二抢占了，这时 testSingleton 已经是非 null 了（但却没有初始化），所以线程二会直接返回 instance，然后使用，然后顺理成章地报错。
  ```

## Kotlin 代码Demo

### 饿汉式

```kotlin
object SingletonDemo{}
```

### 懒汉式

```kotlin
class Singleton private constructor() {
    companion object {
        var instance: Singleton? = null
            get() {
                if (field == null) {
                    field = Singleton()
                }
                return field
            }
        private set
    }
}
```

### 线程安全的懒汉式

- 相较上面的懒汉式，如果在多线程场景下，要保障线程安全，只需要利用 `Kotlin` 的 `@Synchronized` 注解

```kotlin
class Singleton private constructor() {
    companion object {
        var instance: Singleton? = null
            @Synchronized
            get() {
                if (field == null) {
                    field = Singleton()
                }
                return field
            }
            private set
    }
}
```

### 双重校验锁式

```kotlin
class Singleton private constructor() {
    companion object {
        val instance: Singleton by lazy {
        Singleton() }
    }
}
```

### 静态内部类式

```kotlin
class Singleton private constructor() {
    companion object {
        val instance = SingletonHolder.holder
    }

    private object SingletonHolder {
        val holder= Singleton()
    }
}
```

## 参考

[Segmentfault----王二蛋和他的狗](https://segmentfault.com/a/1190000040020116)
