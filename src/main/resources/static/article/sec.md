### 1.技巧：先上下置换之后，再沿对角线互换后矩阵旋转90度

#### Code:

```java
public void rotate(int[][] matrix) {
    int length = matrix.length;
    //先上下交换
    for (int i = 0; i < length / 2; i++) {
        int temp[] = matrix[i];
        //Astral：交换指针指向的内存地址，实现上下交换
        matrix[i] = matrix[length - i - 1];
        matrix[length - i - 1] = temp;
    }
    //在按照对角线交换
    for (int i = 0; i < length; ++i) {
        for (int j = i + 1; j < length; ++j) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
     }
}
```

### 2.直接旋转

#### Code:

```java
public void rotate(int[][] matrix) {
    int length = matrix.length;
        //因为是对称的，只需要计算循环前半行即可
    for (int i = 0; i < length / 2; i++)
        for (int j = i; j < length - i - 1; j++) {
            int temp = matrix[i][j];
            int m = length - j - 1;
            int n = length - i - 1;
            matrix[i][j] = matrix[m][i];
            matrix[m][i] = matrix[n][m];
            matrix[n][m] = matrix[j][n];
            matrix[j][n] = temp;
        }
    }
}
```

```java
package com.astral.dao_blog.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class DateSerializer extends JsonSerializer {
    @Override
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        jsonGenerator.writeString(sdf.format(o));
    }
}

```

