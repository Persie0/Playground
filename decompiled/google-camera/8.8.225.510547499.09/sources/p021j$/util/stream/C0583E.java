package p021j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.E */
/* JADX INFO: loaded from: classes3.dex */
final class C0583E extends AbstractC0658d {

    /* JADX INFO: renamed from: j */
    private final C0580D f33303j;

    C0583E(C0580D c0580d, AbstractC0586F abstractC0586F, Spliterator spliterator) {
        super(abstractC0586F, spliterator);
        this.f33303j = c0580d;
    }

    @Override // p021j$.util.stream.AbstractC0664f
    /* JADX INFO: renamed from: a */
    protected final Object mo12622a() {
        Boolean boolValueOf;
        AbstractC0586F abstractC0586F = this.f33409a;
        C0574B c0574b = (C0574B) this.f33303j.f33298b.get();
        abstractC0586F.mo12660A(this.f33410b, c0574b);
        boolean z = c0574b.f33279b;
        if (z == this.f33303j.f33297a.f33286b && (boolValueOf = Boolean.valueOf(z)) != null) {
            AtomicReference atomicReference = this.f33395h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // p021j$.util.stream.AbstractC0664f
    /* JADX INFO: renamed from: e */
    protected final AbstractC0664f mo12623e(Spliterator spliterator) {
        return new C0583E(this, spliterator);
    }

    @Override // p021j$.util.stream.AbstractC0658d
    /* JADX INFO: renamed from: j */
    protected final Object mo12624j() {
        return Boolean.valueOf(!this.f33303j.f33297a.f33286b);
    }

    C0583E(C0583E c0583e, Spliterator spliterator) {
        super(c0583e, spliterator);
        this.f33303j = c0583e.f33303j;
    }
}
