### 示例
java IO流

### Component
真实对象的接口或抽象类，提供抽象方法
```
abstract class  InputStream {
   public abstract int read() throws IOException;
}
```

### ConcreteComponent
真实对象类
```
public class FileInputStream extends InputStream {
    public int read() throws IOException {
        return read0();
    }

    private native int read0() throws IOException;
}
```

### Decorator
装饰对象接口或抽象类。必须具有如下两点：

1. 继承或实现于Component
2. 包含一个Component对象（真实对象），进行真正的操作（类似于代理模式）

```
public class FilterInputStream extends InputStream {
    protected volatile InputStream in;
    
    protected FilterInputStream(InputStream in) {
        this.in = in;
    }
    
    public int read() throws IOException {
        return in.read();
    }
}
```

### ConcreteDecorator1
具体的装饰对象，添加功能
```
public class BufferedInputStream extends FilterInputStream {
    public synchronized int read() throws IOException {
        if (pos >= count) {
            fill();
            if (pos >= count)
                return -1;
        }
        return getBufIfOpen()[pos++] & 0xff;
    }
    
    private void fill() throws IOException {
        ...
        int n = getInIfOpen().read(buffer, pos, buffer.length - pos);
    }
    
    private InputStream getInIfOpen() throws IOException {
        InputStream input = in; // in就是FilterInputStream传入的对象
        if (input == null)
            throw new IOException("Stream closed");
        return input;
    }
}
```
为一个原本没有缓冲功能的InputStream添加上缓冲的功能。

### ConcreteDecorator2
具体的装饰对象，添加功能

### Client
1. 构造ConcreteComponent多态对象
2. 创建包装类对象或者包装类链对象（ConcreteDecorator1）
3. 调用包装类实现的方法
```
BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("/home/user/abc.txt")));
```

### 好处
相较于继承，更加灵活。减少了继承造成的类扩张，例如，如果使用继承来实现上述功能的话，ConcreteDecorator1要对应一个继承类，ConcreteDecorator2要对应一个继承类，
对于new ConcreteDecorator2(new ConcreteDecorator1) 这样的组合链还得加一个继承类。

### 坏处
组合链过长会造成程序可读性变差。