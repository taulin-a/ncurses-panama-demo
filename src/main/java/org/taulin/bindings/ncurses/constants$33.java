// Generated by jextract

package org.taulin.bindings.ncurses;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$33 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$33() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_SHORT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "color_set",
        constants$33.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "COLOR_PAIR",
        constants$19.const$3
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "copywin",
        constants$33.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "curs_set",
        constants$19.const$3
    );
}


