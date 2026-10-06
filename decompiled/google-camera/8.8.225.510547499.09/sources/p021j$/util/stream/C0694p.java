package p021j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.p */
/* JADX INFO: loaded from: classes3.dex */
final class C0694p extends AbstractC0658d {

    /* JADX INFO: renamed from: j */
    private final C0685m f33452j;

    /* JADX INFO: renamed from: k */
    private final boolean f33453k;

    C0694p(C0685m c0685m, boolean z, AbstractC0586F abstractC0586F, Spliterator spliterator) {
        super(abstractC0586F, spliterator);
        this.f33453k = z;
        this.f33452j = c0685m;
    }

    @Override // p021j$.util.stream.AbstractC0664f
    /* JADX INFO: renamed from: a */
    protected final Object mo12622a() {
        boolean z;
        AbstractC0586F abstractC0586F = this.f33409a;
        InterfaceC0644Y1 interfaceC0644Y1 = (InterfaceC0644Y1) this.f33452j.f33447d.get();
        abstractC0586F.mo12660A(this.f33410b, interfaceC0644Y1);
        Object obj = interfaceC0644Y1.get();
        if (!this.f33453k) {
            if (obj != null) {
                AtomicReference atomicReference = this.f33395h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        AbstractC0664f abstractC0664f = this;
        while (true) {
            if (abstractC0664f != null) {
                AbstractC0664f abstractC0664fM12710d = abstractC0664f.m12710d();
                if (abstractC0664fM12710d != null && abstractC0664fM12710d.f33412d != abstractC0664f) {
                    z = false;
                    break;
                }
                abstractC0664f = abstractC0664fM12710d;
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            AtomicReference atomicReference2 = this.f33395h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        } else {
            m12701i();
        }
        return obj;
    }

    @Override // p021j$.util.stream.AbstractC0664f
    /* JADX INFO: renamed from: e */
    protected final AbstractC0664f mo12623e(Spliterator spliterator) {
        return new C0694p(this, spliterator);
    }

    @Override // p021j$.util.stream.AbstractC0658d
    /* JADX INFO: renamed from: j */
    protected final Object mo12624j() {
        return this.f33452j.f33445b;
    }

    @Override // p021j$.util.stream.AbstractC0664f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        boolean z;
        if (this.f33453k) {
            C0694p c0694p = (C0694p) this.f33412d;
            C0694p c0694p2 = null;
            while (c0694p != c0694p2) {
                Object objMo12698c = c0694p.mo12698c();
                if (objMo12698c != null && this.f33452j.f33446c.test(objMo12698c)) {
                    mo12699f(objMo12698c);
                    AbstractC0664f abstractC0664f = this;
                    while (true) {
                        if (abstractC0664f != null) {
                            AbstractC0664f abstractC0664fM12710d = abstractC0664f.m12710d();
                            if (abstractC0664fM12710d != null && abstractC0664fM12710d.f33412d != abstractC0664f) {
                                z = false;
                                break;
                            }
                            abstractC0664f = abstractC0664fM12710d;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        m12701i();
                        break;
                    }
                    AtomicReference atomicReference = this.f33395h;
                    while (!atomicReference.compareAndSet(null, objMo12698c) && atomicReference.get() == null) {
                    }
                    break;
                }
                c0694p2 = c0694p;
                c0694p = (C0694p) this.f33413e;
            }
        }
        super.onCompletion(countedCompleter);
    }

    C0694p(C0694p c0694p, Spliterator spliterator) {
        super(c0694p, spliterator);
        this.f33453k = c0694p.f33453k;
        this.f33452j = c0694p.f33452j;
    }
}
