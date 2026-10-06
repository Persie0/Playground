package p021j$.util.concurrent;

import java.util.Comparator;
import java.util.function.Consumer;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.concurrent.i */
/* JADX INFO: loaded from: classes3.dex */
final class C0531i extends C0538p implements Spliterator {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f33206i;

    /* JADX INFO: renamed from: j */
    long f33207j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0531i(C0533k[] c0533kArr, int i, int i2, int i3, long j, int i4) {
        super(c0533kArr, i, i2, i3);
        this.f33206i = i4;
        this.f33207j = j;
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        switch (this.f33206i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f33206i) {
            case 0:
                break;
            default:
                break;
        }
        return this.f33207j;
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f33206i) {
            case 0:
                consumer.getClass();
                while (true) {
                    C0533k c0533kM12566a = m12566a();
                    if (c0533kM12566a != null) {
                        consumer.accept(c0533kM12566a.f33212b);
                    }
                    break;
                }
                break;
            default:
                consumer.getClass();
                while (true) {
                    C0533k c0533kM12566a2 = m12566a();
                    if (c0533kM12566a2 != null) {
                        consumer.accept(c0533kM12566a2.f33213c);
                    }
                    break;
                }
                break;
        }
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        switch (this.f33206i) {
            case 0:
                break;
            default:
                break;
        }
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f33206i) {
            case 0:
                break;
            default:
                break;
        }
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.f33206i) {
            case 0:
                break;
            default:
                break;
        }
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // p021j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f33206i) {
            case 0:
                consumer.getClass();
                C0533k c0533kM12566a = m12566a();
                if (c0533kM12566a == null) {
                    return false;
                }
                consumer.accept(c0533kM12566a.f33212b);
                return true;
            default:
                consumer.getClass();
                C0533k c0533kM12566a2 = m12566a();
                if (c0533kM12566a2 == null) {
                    return false;
                }
                consumer.accept(c0533kM12566a2.f33213c);
                return true;
        }
    }

    @Override // p021j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f33206i) {
            case 0:
                int i = this.f33224f;
                int i2 = this.f33225g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                C0533k[] c0533kArr = this.f33219a;
                int i4 = this.f33226h;
                this.f33225g = i3;
                long j = this.f33207j >>> 1;
                this.f33207j = j;
                return new C0531i(c0533kArr, i4, i3, i2, j, 0);
            default:
                int i5 = this.f33224f;
                int i6 = this.f33225g;
                int i7 = (i5 + i6) >>> 1;
                if (i7 <= i5) {
                    return null;
                }
                C0533k[] c0533kArr2 = this.f33219a;
                int i8 = this.f33226h;
                this.f33225g = i7;
                long j2 = this.f33207j >>> 1;
                this.f33207j = j2;
                return new C0531i(c0533kArr2, i8, i7, i6, j2, 1);
        }
    }
}
