package p021j$.util.stream;

import java.util.function.Supplier;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.D */
/* JADX INFO: loaded from: classes3.dex */
final class C0580D implements InterfaceC0641X1 {

    /* JADX INFO: renamed from: a */
    final EnumC0577C f33297a;

    /* JADX INFO: renamed from: b */
    final Supplier f33298b;

    C0580D(EnumC0714v1 enumC0714v1, EnumC0577C enumC0577C, C0673i c0673i) {
        this.f33297a = enumC0577C;
        this.f33298b = c0673i;
    }

    @Override // p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: b */
    public final int mo12618b() {
        return EnumC0711u1.f33503t | EnumC0711u1.f33500q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: c */
    public final Object mo12619c(AbstractC0586F abstractC0586F, Spliterator spliterator) {
        return (Boolean) new C0583E(this, abstractC0586F, spliterator).invoke();
    }

    @Override // p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: d */
    public final Object mo12620d(AbstractC0586F abstractC0586F, Spliterator spliterator) {
        C0574B c0574b = (C0574B) this.f33298b.get();
        abstractC0586F.mo12660A(spliterator, c0574b);
        return Boolean.valueOf(c0574b.f33279b);
    }
}
