package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0728u;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.E1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0585E1 extends AbstractC0717w1 implements InterfaceC0728u {
    C0585E1(AbstractC0586F abstractC0586F, Spliterator spliterator, boolean z) {
        super(abstractC0586F, spliterator, z);
    }

    @Override // p021j$.util.stream.AbstractC0717w1
    /* JADX INFO: renamed from: d */
    final void mo12638d() {
        C0687m1 c0687m1 = new C0687m1();
        this.f33522h = c0687m1;
        this.f33519e = this.f33516b.mo12661B(new C0582D1(c0687m1, 0));
        this.f33520f = new C0648a(4, this);
    }

    @Override // p021j$.util.stream.AbstractC0717w1
    /* JADX INFO: renamed from: e */
    final AbstractC0717w1 mo12639e(Spliterator spliterator) {
        return new C0585E1(this.f33516b, spliterator, this.f33515a);
    }

    @Override // p021j$.util.stream.AbstractC0717w1, p021j$.util.Spliterator
    public final InterfaceC0728u trySplit() {
        return (InterfaceC0728u) super.trySplit();
    }

    C0585E1(AbstractC0586F abstractC0586F, C0648a c0648a, boolean z) {
        super(abstractC0586F, c0648a, z);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12528b(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12537k(this, consumer);
    }

    @Override // p021j$.util.InterfaceC0498A
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f33522h != null || this.f33523i) {
            while (tryAdvance(intConsumer)) {
            }
            return;
        }
        intConsumer.getClass();
        m12746c();
        C0582D1 c0582d1 = new C0582D1(intConsumer, 1);
        this.f33516b.mo12660A(this.f33518d, c0582d1);
        this.f33523i = true;
    }

    @Override // p021j$.util.InterfaceC0498A
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        boolean zM12745a = m12745a();
        if (zM12745a) {
            C0687m1 c0687m1 = (C0687m1) this.f33522h;
            long j = this.f33521g;
            int iM12727B = c0687m1.m12727B(j);
            intConsumer.accept((c0687m1.f33404b == 0 && iM12727B == 0) ? ((int[]) c0687m1.f33461d)[(int) j] : ((int[][]) c0687m1.f33462e)[iM12727B][(int) (j - c0687m1.f33405c[iM12727B])]);
        }
        return zM12745a;
    }
}
