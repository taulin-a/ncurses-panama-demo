// Generated by jextract

package org.taulin.bindings.ncurses;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$19 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$19() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "fgetc_unlocked",
        constants$7.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "fputc",
        constants$16.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "putc",
        constants$16.const$5
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "putchar",
        constants$19.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "fputc_unlocked",
        constants$16.const$5
    );
}


