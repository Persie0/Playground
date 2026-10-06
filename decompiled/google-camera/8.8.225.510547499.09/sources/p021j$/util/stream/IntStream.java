package p021j$.util.stream;

import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public interface IntStream extends BaseStream<Integer, IntStream> {

    /* JADX INFO: renamed from: j$.util.stream.IntStream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static IntStream iterate(int i, IntUnaryOperator intUnaryOperator) {
            intUnaryOperator.getClass();
            C0721y c0721y = new C0721y(intUnaryOperator, i);
            EnumC0711u1 enumC0711u1 = EnumC0711u1.DISTINCT;
            int iCharacteristics = c0721y.characteristics();
            int i2 = iCharacteristics & 4;
            int i3 = EnumC0711u1.f33489f;
            return new C0718x(c0721y, (i2 == 0 || c0721y.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5));
        }
    }

    Stream<Integer> boxed();
}
