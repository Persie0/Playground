package p021j$.util.stream;

import java.util.function.IntConsumer;
import p021j$.util.Spliterator;
import p021j$.util.function.C0553e;

/* JADX INFO: renamed from: j$.util.stream.w0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0716w0 extends AbstractC0725z0 implements InterfaceC0640X0 {

    /* JADX INFO: renamed from: h */
    private final int[] f33514h;

    C0716w0(Spliterator spliterator, AbstractC0586F abstractC0586F, int[] iArr) {
        super(iArr.length, spliterator, abstractC0586F);
        this.f33514h = iArr;
    }

    @Override // p021j$.util.stream.AbstractC0725z0, p021j$.util.stream.InterfaceC0646Z0
    public final void accept(int i) {
        int i2 = this.f33538f;
        if (i2 >= this.f33539g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f33538f));
        }
        int[] iArr = this.f33514h;
        this.f33538f = i2 + 1;
        iArr[i2] = i;
    }

    public final IntConsumer andThen(IntConsumer intConsumer) {
        intConsumer.getClass();
        return new C0553e(this, intConsumer);
    }

    @Override // p021j$.util.stream.AbstractC0725z0
    /* JADX INFO: renamed from: b */
    final AbstractC0725z0 mo12743b(Spliterator spliterator, long j, long j2) {
        return new C0716w0(this, spliterator, j, j2);
    }

    @Override // p021j$.util.stream.InterfaceC0640X0
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo12621j(Integer num) {
        AbstractC0586F.m12641c(this, num);
    }

    C0716w0(C0716w0 c0716w0, Spliterator spliterator, long j, long j2) {
        super(c0716w0, spliterator, j, j2, c0716w0.f33514h.length);
        this.f33514h = c0716w0.f33514h;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo12621j((Integer) obj);
    }
}
