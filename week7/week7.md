# File I/O Text I/O

## File 클래스

[Java.io](http://java.io) 패키지에서 제공하는 File 클래스는 파일 크기, 파일 속성, 파일 이름 등의 정보를 얻어내는 기능과 파일 생성 및 삭제 기능을 제공합니다.

### 파일 쓰기

✔ FileOutputStream 클래스 사용

```java
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWirte {
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("c:/out.txt");
		output.close();
	}
}
```

`FileOuputStream` 객체 생성 위해서는 생성자의 입력으로 파일명을 넘겨 주어야 함.

`output.close()`라는 문장은 사용한 파일 객체를 닫아 주는 것. (자바 프로그램이 종료할 때 사용한 파일 객체를 자동으로 닫아주기 때문에, 생략해도 됨)`

but 직접 사용한 파일을 닫아주는 것이 좋음 ! (사용했던 파일을 닫지 않고 다시 사용하려고 할 경우, 에러가 발생할 수 있음)

### 파일에 내용 쓰기

✔ FileOutputStream 클래스 사용하는 방법

```java
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("c:/out.txt");
		for (int i = 1; i < 11 ; i++) {
			String data = i + " 번째 줄입니다. \r\n";
			output.write(data.getBytes());
		}
		output.close();
	}
}

```

`FileOutputStream`에 값을 쓸 때는 byte 배열로 써야 하므로 위와 같이 String을 byte배열로 바꿔 주는 `getBytes()` 메서드를 이용해야만 했다. `\r\n`은 줄바꿈 문자이다.

문자열을 파일에 쓸 때는 `FileOutputStream`이 좀 불편하다. String을 byte 배열로 변환해야 하기 때문이다.

✔ FileWriter 클래스 사용하는 방법

```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("c:/out.txt");
		for (int i = 1; i < 11 ; i++) {
			String data = i + " 번째 줄입니다. \r\n";
			fw.write(data);
		}
		fw.close();
	}
}
```

`FileWriter` 을 이용하면 byte 배열 대신 문자열을 직접 파일에 쓸 수가 있다.

하지만 `\r\n`을 문자열 뒤에 덧붙여야 하는 불편함은 여전히 남아있다.

이를 해결하기 위해서는, `PrintWriter` 를 이용하면 `\r\n`을 덧붙이는 대신 `println` 이라는 메서드를 사용할 수 있게 된다.

✔ PrintWriter 클래스 사용하는 방법

```java
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("c:/out.txt");
		for (int i = 1 ; i < 11 ; i++) {
			String data = i+ " 번째 줄입니다.";
			pw.println(data);
		}
		pw.close();
	}
}
```

### 파일에 내용 추가하기

프로그램을 만들다 보면 파일에 내용을 쓰고 난 후에 또 새로운 내용을 추가하고 싶을 때가 생긴다. 이럴경우, 이미 작성된 파일을 다시 추가모드로 열어야 한다.

✔ FileWriter 클래스 사용하는 방법

```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("c:/out.txt");
		for (int i = 1 ; i < 11 ; i++) {
				String data = i + "번째 줄입니다.\r\n";
				fw.write(data);
		}
		fw.close();
		
		FileWriter fw2 = new FileWriter("c:/out.txt", true);
		for (int i = 11; i < 21; i++) {
			String data = i + " 번째 줄입니다.\r\n";
			fw2.write(data);
		}
		fw2.close();
	}
}
```

fw2라는 객체는 `FileWriter("c:/out.txt", true);` 와 같이 두번째 입력값이 추가로 입력되어 생성되었다. 두번째 boolean 입력 파라미터는 파일을 추가모드(append)로 열것인지에 대한 구분값이다.

**추가모드**로 열면 기존파일의 내용이후부터 파일이 쓰여진다!

✔ PrintWriter 사용하는 방법

```java
new FileWriter(파일명, 추가모드 구분)
```

```java
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("c:/out.txt");
		for(int i = 1 ; i < 11; i++) {
			String data = i + "번째 줄입니다.";
			pw.println(data);
		}	
		pw.close();

		PrintWriter pw2 = new PrintWriter(new FileWriter("c:/out.txt", true));
		for(int i = 11 ; i < 21; i++) {
			String data = i + "번째 줄입니다.";
			pw2.println(data);
		}
		pw2.close();
	}
}
```

PrintWriter의 생성자의 입력으로 파일명 대신 추가모드로 열린 FileWriter 의 객체를 사용하면 된다. 

### 파일 읽기

✔ FileInputStream 사용하는 방법

```java
import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("c:/out.txt");
        input.read(b);
        System.out.println(new String(b));
        input.close();
    }
}
```

FileInputStream 클래스 이용 → byte배열을 이용해 파일을 읽어야 하기 때문에 정확한 길이를 모를 경우에 좀 불편한 방법임

✔ FileReader + BufferedReader

파일을 라인단위로 읽을 수 있게끔

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:/out.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;
            System.out.println(line);
        }
        br.close();
    }
}
```

BufferedReader의 readLine 메소드는 더이상 읽을 라인이 없을 경우 null을 리턴한다.

위 예는 파일을 라인단위로 읽어서 출력하고 더 이상 읽을 라인이 없는 경우 while문을 빠져나간다.
