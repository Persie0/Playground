package p021j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import p021j$.util.AbstractC0517U;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.i1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0675i1 implements Spliterator {

    /* JADX INFO: renamed from: a */
    int f33430a;

    /* JADX INFO: renamed from: b */
    final int f33431b;

    /* JADX INFO: renamed from: c */
    int f33432c;

    /* JADX INFO: renamed from: d */
    final int f33433d;

    /* JADX INFO: renamed from: e */
    Object[] f33434e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C0702r1 f33435f;

    C0675i1(C0702r1 c0702r1, int i, int i2, int i3, int i4) {
        this.f33435f = c0702r1;
        this.f33430a = i;
        this.f33431b = i2;
        this.f33432c = i3;
        this.f33433d = i4;
        Object[][] objArr = c0702r1.f33465e;
        this.f33434e = objArr == null ? c0702r1.f33464d : objArr[i];
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        int i = this.f33430a;
        int i2 = this.f33433d;
        int i3 = this.f33431b;
        if (i == i3) {
            return ((long) i2) - ((long) this.f33432c);
        }
        long[] jArr = this.f33435f.f33405c;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.f33432c);
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        C0702r1 c0702r1;
        consumer.getClass();
        int i = this.f33430a;
        int i2 = this.f33433d;
        int i3 = this.f33431b;
        if (i < i3 || (i == i3 && this.f33432c < i2)) {
            int i4 = this.f33432c;
            while (true) {
                c0702r1 = this.f33435f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr = c0702r1.f33465e[i];
                while (i4 < objArr.length) {
                    consumer.accept(objArr[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            Object[] objArr2 = this.f33430a == i3 ? this.f33434e : c0702r1.f33465e[i3];
            while (i4 < i2) {
                consumer.accept(objArr2[i4]);
                i4++;
            }
            this.f33430a = i3;
            this.f33432c = i2;
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
        int i = this.f33430a;
        int i2 = this.f33431b;
        if (i >= i2 && (i != i2 || this.f33432c >= this.f33433d)) {
            return false;
        }
        Object[] objArr = this.f33434e;
        int i3 = this.f33432c;
        this.f33432c = i3 + 1;
        consumer.accept(objArr[i3]);
        if (this.f33432c == this.f33434e.length) {
            this.f33432c = 0;
            int i4 = this.f33430a + 1;
            this.f33430a = i4;
            Object[][] objArr2 = this.f33435f.f33465e;
            if (objArr2 != null && i4 <= i2) {
                this.f33434e = objArr2[i4];
            }
        }
        return true;
    }

    @Override // p021j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f33430a;
        int i2 = this.f33431b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.f33432c;
            C0702r1 c0702r1 = this.f33435f;
            C0675i1 c0675i1 = new C0675i1(c0702r1, i, i3, i4, c0702r1.f33465e[i3].length);
            this.f33430a = i2;
            this.f33432c = 0;
            this.f33434e = c0702r1.f33465e[i2];
            return c0675i1;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.f33432c;
        int i6 = (this.f33433d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        Spliterator spliteratorM12523m = AbstractC0517U.m12523m(this.f33434e, i5, i5 + i6);
        this.f33432c += i6;
        return spliteratorM12523m;
    }
}
