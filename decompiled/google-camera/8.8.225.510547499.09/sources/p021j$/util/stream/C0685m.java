package p021j$.util.stream;

import java.util.function.Predicate;
import java.util.function.Supplier;
import p021j$.util.Optional;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.m */
/* JADX INFO: loaded from: classes3.dex */
final class C0685m implements InterfaceC0641X1 {

    /* JADX INFO: renamed from: a */
    final int f33444a;

    /* JADX INFO: renamed from: b */
    final Object f33445b;

    /* JADX INFO: renamed from: c */
    final Predicate f33446c;

    /* JADX INFO: renamed from: d */
    final Supplier f33447d;

    C0685m(boolean z, EnumC0714v1 enumC0714v1, Optional optional, C0652b c0652b, C0652b c0652b2) {
        this.f33444a = (z ? 0 : EnumC0711u1.f33500q) | EnumC0711u1.f33503t;
        this.f33445b = optional;
        this.f33446c = c0652b;
        this.f33447d = c0652b2;
    }

    @Override // p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: b */
    public final int mo12618b() {
        return this.f33444a;
    }

    @Override // p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: c */
    public final Object mo12619c(AbstractC0586F abstractC0586F, Spliterator spliterator) {
        return new C0694p(this, EnumC0711u1.ORDERED.m12740e(abstractC0586F.mo12665x()), abstractC0586F, spliterator).invoke();
    }

    @Override // p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: d */
    public final Object mo12620d(AbstractC0586F abstractC0586F, Spliterator spliterator) {
        InterfaceC0644Y1 interfaceC0644Y1 = (InterfaceC0644Y1) this.f33447d.get();
        abstractC0586F.mo12660A(spliterator, interfaceC0644Y1);
        Object obj = interfaceC0644Y1.get();
        return obj != null ? obj : this.f33445b;
    }
}
