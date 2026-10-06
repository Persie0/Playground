package p021j$.util.stream;

import java.util.function.LongConsumer;
import p021j$.util.Spliterator;
import p021j$.util.function.C0555g;

/* JADX INFO: renamed from: j$.util.stream.x0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0719x0 extends AbstractC0725z0 implements InterfaceC0643Y0 {

    /* JADX INFO: renamed from: h */
    private final long[] f33524h;

    C0719x0(Spliterator spliterator, AbstractC0586F abstractC0586F, long[] jArr) {
        super(jArr.length, spliterator, abstractC0586F);
        this.f33524h = jArr;
    }

    @Override // p021j$.util.stream.AbstractC0725z0, p021j$.util.stream.InterfaceC0646Z0
    public final void accept(long j) {
        int i = this.f33538f;
        if (i >= this.f33539g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f33538f));
        }
        long[] jArr = this.f33524h;
        this.f33538f = i + 1;
        jArr[i] = j;
    }

    public final LongConsumer andThen(LongConsumer longConsumer) {
        longConsumer.getClass();
        return new C0555g(this, longConsumer);
    }

    @Override // p021j$.util.stream.AbstractC0725z0
    /* JADX INFO: renamed from: b */
    final AbstractC0725z0 mo12743b(Spliterator spliterator, long j, long j2) {
        return new C0719x0(this, spliterator, j, j2);
    }

    @Override // p021j$.util.stream.InterfaceC0643Y0
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void mo12666s(Long l) {
        AbstractC0586F.m12643e(this, l);
    }

    C0719x0(C0719x0 c0719x0, Spliterator spliterator, long j, long j2) {
        super(c0719x0, spliterator, j, j2, c0719x0.f33524h.length);
        this.f33524h = c0719x0.f33524h;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo12666s((Long) obj);
    }
}
