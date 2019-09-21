package com.cultivation.javaBasic.showYourIntelligence;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
        StackTraceElement stackElement = new Exception().getStackTrace()[1];
        return stackElement.getClassName().concat(".").concat(stackElement.getMethodName());
        // --end-->
    }
}
