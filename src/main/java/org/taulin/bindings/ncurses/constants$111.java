// Generated by jextract

package org.taulin.bindings.ncurses;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$111 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$111() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("LINES", JAVA_INT);
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("TABSIZE", JAVA_INT);
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("id"),
        MemoryLayout.paddingLayout(2),
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y"),
        JAVA_INT.withName("z"),
        JAVA_INT.withName("bstate")
    ).withName("");
    static final VarHandle const$3 = constants$111.const$2.varHandle(MemoryLayout.PathElement.groupElement("id"));
    static final VarHandle const$4 = constants$111.const$2.varHandle(MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$5 = constants$111.const$2.varHandle(MemoryLayout.PathElement.groupElement("y"));
}


