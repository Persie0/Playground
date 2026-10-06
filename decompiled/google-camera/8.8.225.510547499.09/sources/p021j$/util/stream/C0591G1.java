package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0731x;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.G1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0591G1 extends AbstractC0717w1 implements InterfaceC0731x {
    C0591G1(AbstractC0586F abstractC0586F, Spliterator spliterator, boolean z) {
        super(abstractC0586F, spliterator, z);
    }

    @Override // p021j$.util.stream.AbstractC0717w1
    /* JADX INFO: renamed from: d */
    final void mo12638d() {
        C0693o1 c0693o1 = new C0693o1();
        this.f33522h = c0693o1;
        this.f33519e = this.f33516b.mo12661B(new C0588F1(c0693o1, 0));
        this.f33520f = new C0648a(5, this);
    }

    @Override // p021j$.util.stream.AbstractC0717w1
    /* JADX INFO: renamed from: e */
    final AbstractC0717w1 mo12639e(Spliterator spliterator) {
        return new C0591G1(this.f33516b, spliterator, this.f33515a);
    }

    @Override // p021j$.util.stream.AbstractC0717w1, p021j$.util.Spliterator
    public final InterfaceC0731x trySplit() {
        return (InterfaceC0731x) super.trySplit();
    }

    C0591G1(AbstractC0586F abstractC0586F, C0648a c0648a, boolean z) {
        super(abstractC0586F, c0648a, z);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12529c(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12538l(this, consumer);
    }

    @Override // p021j$.util.InterfaceC0498A
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f33522h != null || this.f33523i) {
            while (tryAdvance(longConsumer)) {
            }
            return;
        }
        longConsumer.getClass();
        m12746c();
        C0588F1 c0588f1 = new C0588F1(longConsumer, 1);
        this.f33516b.mo12660A(this.f33518d, c0588f1);
        this.f33523i = true;
    }

    @Override // p021j$.util.InterfaceC0498A
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        boolean zM12745a = m12745a();
        if (zM12745a) {
            C0693o1 c0693o1 = (C0693o1) this.f33522h;
            long j = this.f33521g;
            int iM12727B = c0693o1.m12727B(j);
            longConsumer.accept((c0693o1.f33404b == 0 && iM12727B == 0) ? ((long[]) c0693o1.f33461d)[(int) j] : ((long[][]) c0693o1.f33462e)[iM12727B][(int) (j - c0693o1.f33405c[iM12727B])]);
        }
        return zM12745a;
    }
}
