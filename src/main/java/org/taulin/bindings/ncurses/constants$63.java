// Generated by jextract

package org.taulin.bindings.ncurses;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$63 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$63() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "slk_noutrefresh",
        constants$18.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "slk_refresh",
        constants$18.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "slk_restore",
        constants$18.const$2
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "slk_set",
        constants$63.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "slk_touch",
        constants$18.const$2
    );
}


