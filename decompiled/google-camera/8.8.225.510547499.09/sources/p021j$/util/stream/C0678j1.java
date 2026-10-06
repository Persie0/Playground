package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p021j$.util.AbstractC0517U;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0498A;
import p021j$.util.InterfaceC0569r;

/* JADX INFO: renamed from: j$.util.stream.j1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0678j1 extends AbstractC0696p1 implements InterfaceC0569r {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ AbstractC0681k1 f33438g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0678j1(AbstractC0681k1 abstractC0681k1, int i, int i2, int i3, int i4) {
        super(abstractC0681k1, i, i2, i3, i4);
        this.f33438g = abstractC0681k1;
    }

    @Override // p021j$.util.stream.AbstractC0696p1
    /* JADX INFO: renamed from: a */
    final void mo12715a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // p021j$.util.stream.AbstractC0696p1
    /* JADX INFO: renamed from: b */
    final InterfaceC0498A mo12716b(Object obj, int i, int i2) {
        return AbstractC0517U.m12520j((double[]) obj, i, i2 + i);
    }

    @Override // p021j$.util.stream.AbstractC0696p1
    /* JADX INFO: renamed from: c */
    final InterfaceC0498A mo12717c(int i, int i2, int i3, int i4) {
        return new C0678j1(this.f33438g, i, i2, i3, i4);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12527a(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12536j(this, consumer);
    }
}
