// Generated by jextract

package org.taulin.bindings.ncurses;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _G_fpos64_t {
 *     __off64_t __pos;
 *     __mbstate_t __state;
 * };
 * }
 */
public class _G_fpos64_t {

    public static MemoryLayout $LAYOUT() {
        return constants$1.const$1;
    }
    public static VarHandle __pos$VH() {
        return constants$1.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __off64_t __pos;
     * }
     */
    public static long __pos$get(MemorySegment seg) {
        return (long)constants$1.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __off64_t __pos;
     * }
     */
    public static void __pos$set(MemorySegment seg, long x) {
        constants$1.const$2.set(seg, x);
    }
    public static long __pos$get(MemorySegment seg, long index) {
        return (long)constants$1.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void __pos$set(MemorySegment seg, long index, long x) {
        constants$1.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __state$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


