package p021j$.util.stream;

import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.K0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0602K0 extends AbstractC0584E0 {
    C0602K0(EnumC0714v1 enumC0714v1) {
        super(enumC0714v1);
    }

    @Override // p021j$.util.stream.AbstractC0584E0, p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: b */
    public final int mo12618b() {
        return EnumC0711u1.f33500q;
    }

    @Override // p021j$.util.stream.AbstractC0584E0, p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: c */
    public final Object mo12619c(AbstractC0586F abstractC0586F, Spliterator spliterator) {
        return EnumC0711u1.SIZED.m12740e(abstractC0586F.mo12665x()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.mo12619c(abstractC0586F, spliterator);
    }

    @Override // p021j$.util.stream.AbstractC0584E0, p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: d */
    public final Object mo12620d(AbstractC0586F abstractC0586F, Spliterator spliterator) {
        return EnumC0711u1.SIZED.m12740e(abstractC0586F.mo12665x()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.mo12620d(abstractC0586F, spliterator);
    }

    @Override // p021j$.util.stream.AbstractC0584E0
    /* JADX INFO: renamed from: p */
    public final InterfaceC0608M0 mo12637p() {
        return new C0614O0();
    }
}
