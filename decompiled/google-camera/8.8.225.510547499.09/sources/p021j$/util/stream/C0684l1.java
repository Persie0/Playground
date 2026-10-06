package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p021j$.util.AbstractC0517U;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0498A;
import p021j$.util.InterfaceC0728u;

/* JADX INFO: renamed from: j$.util.stream.l1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0684l1 extends AbstractC0696p1 implements InterfaceC0728u {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ C0687m1 f33443g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0684l1(C0687m1 c0687m1, int i, int i2, int i3, int i4) {
        super(c0687m1, i, i2, i3, i4);
        this.f33443g = c0687m1;
    }

    @Override // p021j$.util.stream.AbstractC0696p1
    /* JADX INFO: renamed from: a */
    final void mo12715a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // p021j$.util.stream.AbstractC0696p1
    /* JADX INFO: renamed from: b */
    final InterfaceC0498A mo12716b(Object obj, int i, int i2) {
        return AbstractC0517U.m12521k((int[]) obj, i, i2 + i);
    }

    @Override // p021j$.util.stream.AbstractC0696p1
    /* JADX INFO: renamed from: c */
    final InterfaceC0498A mo12717c(int i, int i2, int i3, int i4) {
        return new C0684l1(this.f33443g, i, i2, i3, i4);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12528b(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12537k(this, consumer);
    }
}
