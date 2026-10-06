package p021j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import p021j$.util.Spliterator;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.Q1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0621Q1 extends AbstractC0626S1 implements Spliterator, Consumer {

    /* JADX INFO: renamed from: f */
    Object f33346f;

    C0621Q1(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33346f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        C0720x1 c0720x1 = null;
        while (true) {
            EnumC0623R1 enumC0623R1M12677c = m12677c();
            if (enumC0623R1M12677c == EnumC0623R1.NO_MORE) {
                return;
            }
            EnumC0623R1 enumC0623R1 = EnumC0623R1.MAYBE_MORE;
            Spliterator spliterator = this.f33350a;
            if (enumC0623R1M12677c != enumC0623R1) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            int i = this.f33352c;
            if (c0720x1 == null) {
                c0720x1 = new C0720x1(i);
            } else {
                c0720x1.f33525a = 0;
            }
            long j = 0;
            while (spliterator.tryAdvance(c0720x1)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long jM12676b = m12676b(j);
            for (int i2 = 0; i2 < jM12676b; i2++) {
                consumer.accept(c0720x1.f33526b[i2]);
            }
        }
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // p021j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        while (m12677c() != EnumC0623R1.NO_MORE && this.f33350a.tryAdvance(this)) {
            if (m12676b(1L) == 1) {
                consumer.accept(this.f33346f);
                this.f33346f = null;
                return true;
            }
        }
        return false;
    }

    C0621Q1(Spliterator spliterator, C0621Q1 c0621q1) {
        super(spliterator, c0621q1);
    }
}
