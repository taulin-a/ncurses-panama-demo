// Generated by jextract

package org.taulin.bindings.ncurses;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$56 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$56() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "overwrite",
        constants$9.const$3
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        JAVA_SHORT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "pair_content",
        constants$56.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "PAIR_NUMBER",
        constants$19.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "pechochar",
        constants$27.const$2
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "pnoutrefresh",
        constants$56.const$5
    );
}


