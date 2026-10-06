package p021j$.util.stream;

import java.util.function.Supplier;
import p021j$.util.Spliterator;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamSupport {
    public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean z) {
        spliterator.getClass();
        EnumC0711u1 enumC0711u1 = EnumC0711u1.DISTINCT;
        int iCharacteristics = spliterator.characteristics();
        int i = iCharacteristics & 4;
        int i2 = EnumC0711u1.f33489f;
        return new C0622R0(spliterator, (i == 0 || spliterator.getComparator() == null) ? iCharacteristics & i2 : iCharacteristics & i2 & (-5), z);
    }

    public static <T> Stream<T> stream(Supplier<? extends Spliterator<T>> supplier, int i, boolean z) {
        supplier.getClass();
        return new C0622R0(supplier, i & EnumC0711u1.f33489f, z);
    }
}
