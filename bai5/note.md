## printing

### thủ công
```
@Override
public String toString(){
    return new String(
        "data1: "+data1+", 
        data2: "+data2
    );
}
```

### class Printable
- extends Printable
- call method printProperties()