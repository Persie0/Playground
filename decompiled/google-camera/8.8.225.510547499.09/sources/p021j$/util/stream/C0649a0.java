package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.a0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0649a0 extends AbstractC0619Q {
    C0649a0(InterfaceC0613O interfaceC0613O, InterfaceC0613O interfaceC0613O2) {
        super(interfaceC0613O, interfaceC0613O2);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final void forEach(Consumer consumer) {
        this.f33342a.forEach(consumer);
        this.f33343b.forEach(consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: n */
    public final Object[] mo12601n(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        mo12603r(objArr, 0);
        return objArr;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: q */
    public final InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long jCount = this.f33342a.count();
        if (j >= jCount) {
            return this.f33343b.mo12602q(j - jCount, j2 - jCount, intFunction);
        }
        return j2 <= jCount ? this.f33342a.mo12602q(j, j2, intFunction) : AbstractC0584E0.m12632k(EnumC0714v1.REFERENCE, this.f33342a.mo12602q(j, jCount, intFunction), this.f33343b.mo12602q(0L, j2 - jCount, intFunction));
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: r */
    public final void mo12603r(Object[] objArr, int i) {
        objArr.getClass();
        InterfaceC0613O interfaceC0613O = this.f33342a;
        interfaceC0613O.mo12603r(objArr, i);
        this.f33343b.mo12603r(objArr, i + ((int) interfaceC0613O.count()));
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final Spliterator spliterator() {
        return new C0701r0(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f33342a, this.f33343b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
