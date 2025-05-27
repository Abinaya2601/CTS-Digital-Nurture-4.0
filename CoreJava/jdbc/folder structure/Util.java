module com.utils {
    exports com.utils;
}
Util.java

java
Copy
Edit
package com.utils;

public class Util {
    public static String getHello() {
        return "Hello from Util!";
    }
}
Step 3: Write com.greetings
module-info.java (com.greetings)

java
Copy
Edit
module com.greetings {
    requires com.utils;
}
package com.greetings;

import com.utils.Util;

public class Greeting {
    public static void main(String[] args) {
        System.out.println(Util.getHello());
    }
}
