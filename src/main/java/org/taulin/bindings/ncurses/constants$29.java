// Generated by jextract

package org.taulin.bindings.ncurses;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$29 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$29() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "attron",
        constants$19.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "attrset",
        constants$19.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "attr_get",
        constants$14.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "attr_off",
        constants$16.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "attr_on",
        constants$16.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_SHORT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "attr_set",
        constants$29.const$5
    );
}


