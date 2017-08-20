[![Codacy Badge](https://api.codacy.com/project/badge/Grade/78f7e7778c894a30a7c59d8e7680be24)](https://www.codacy.com/app/dzikoysk/Panda?utm_source=github.com&utm_medium=referral&utm_content=Panda-Programming-Language/Panda&utm_campaign=badger)
# Panda [![Build Status](https://travis-ci.org/Panda-Programming-Language/Panda.svg?branch=master)](https://travis-ci.org/Panda-Programming-Language/Panda)
Panda is a lightweight and powerful programming language written in Java<br>
Project website: https://panda-lang.org/

#### Example
```javascript
// The main block, called when the script starts
main {
    // Prints "Hello Panda" in console
    System.print("Hello Panda");

    // Create new thread called "Thread-Test"
    Thread testThread = new Thread("Thread-Test");
    // Thread block associated with 'testThread', executed when the thread starts
    thread (testThread) {
        // Print the name of the thread
        System.print(testThread.getName());
    }
    // Start the thread
    testThread.start();

    // Math
    Int result = ((10 + 4)*2)^2;
    // Display result
    System.print(result);

    Foo foo = new Foo();
    foo.goodbye();
}

class Foo {

    method goodbye() {
        System.print("Goodbye!");
    }

}
```

#### Repository structure
```
panda/
+--examples/                 Example scripts written in Panda
+--panda/                    Panda module
   +----/src                 All sources of Panda
   +----pom.xml              The main maven build script for Panda module
+--panda-framework/          Panda Framework module
   +----/src                 All sources of Panda Framework
   +----pom.xml              The main maven build script for Panda Framework module
+--pom.xml                   The main maven build script
```

#### Maven
Latest build. Remember, API is not stable yet :o:

```xml
<dependency>
    <groupId>org.panda_lang</groupId>
    <artifactId>panda</artifactId>
    <version>indev-0.0.3-SNAPSHOT</version>
</dependency>
```

The latest build of the previous edition. Remember, this is deprecated!

```xml
<dependency>
    <groupId>org.panda_lang</groupId>
    <artifactId>panda</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

Repository: https://repo.panda-lang.org/

```xml
<repositories>
    <repository>
        <id>panda-repo</id>
        <name>Panda Repository</name>
        <url>https://repo.panda-lang.org/</url>
    </repository>
</repositories>
```

#### Other
- Lily the Panda IDE: https://github.com/Panda-Programming-Language/Lily <br>
- Light: https://github.com/dzikoysk/Light
