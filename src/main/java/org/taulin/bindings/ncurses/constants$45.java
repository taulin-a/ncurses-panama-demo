// Generated by jextract

package org.taulin.bindings.ncurses;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$45 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$45() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "mvaddchstr",
        constants$45.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "mvaddnstr",
        constants$44.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "mvaddstr",
        constants$45.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_SHORT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "mvchgat",
        constants$45.const$4
    );
}


