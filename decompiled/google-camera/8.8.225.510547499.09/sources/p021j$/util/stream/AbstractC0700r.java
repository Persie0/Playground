package p021j$.util.stream;

import java.util.function.Consumer;
import p021j$.util.Spliterator;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.r */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0700r implements InterfaceC0641X1, InterfaceC0644Y1 {

    /* JADX INFO: renamed from: a */
    private final boolean f33463a;

    protected AbstractC0700r(boolean z) {
        this.f33463a = z;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(int i) {
        AbstractC0586F.m12640b();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: b */
    public final int mo12618b() {
        if (this.f33463a) {
            return 0;
        }
        return EnumC0711u1.f33500q;
    }

    @Override // p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: c */
    public final Object mo12619c(AbstractC0586F abstractC0586F, Spliterator spliterator) {
        (this.f33463a ? new C0703s(abstractC0586F, spliterator, this) : new C0706t(abstractC0586F, spliterator, abstractC0586F.mo12661B(this))).invoke();
        return null;
    }

    @Override // p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: d */
    public final Object mo12620d(AbstractC0586F abstractC0586F, Spliterator spliterator) {
        abstractC0586F.mo12660A(spliterator, this);
        return null;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo12598f() {
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo12599h(long j) {
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean mo12600m() {
        return false;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        AbstractC0586F.m12645g();
        throw null;
    }
}
