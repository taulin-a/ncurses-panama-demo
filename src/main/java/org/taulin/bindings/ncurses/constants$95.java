// Generated by jextract

package org.taulin.bindings.ncurses;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$95 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$95() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_BOOLEAN
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "intrflush_sp",
        constants$95.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "isendwin_sp",
        constants$42.const$5
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "keyname_sp",
        constants$95.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "killchar_sp",
        constants$92.const$4
    );
}


