package p021j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.d */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0658d extends AbstractC0664f {

    /* JADX INFO: renamed from: h */
    protected final AtomicReference f33395h;

    /* JADX INFO: renamed from: i */
    protected volatile boolean f33396i;

    protected AbstractC0658d(AbstractC0658d abstractC0658d, Spliterator spliterator) {
        super(abstractC0658d, spliterator);
        this.f33395h = abstractC0658d.f33395h;
    }

    @Override // p021j$.util.stream.AbstractC0664f
    /* JADX INFO: renamed from: c */
    public final Object mo12698c() {
        if (!(m12710d() == null)) {
            return super.mo12698c();
        }
        Object obj = this.f33395h.get();
        return obj == null ? mo12624j() : obj;
    }

    @Override // p021j$.util.stream.AbstractC0664f, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objMo12624j;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f33410b;
        long jEstimateSize = spliterator.estimateSize();
        long jM12709g = this.f33411c;
        if (jM12709g == 0) {
            jM12709g = AbstractC0664f.m12709g(jEstimateSize);
            this.f33411c = jM12709g;
        }
        AtomicReference atomicReference = this.f33395h;
        boolean z = false;
        AbstractC0658d abstractC0658d = this;
        while (true) {
            objMo12624j = atomicReference.get();
            if (objMo12624j != null) {
                break;
            }
            boolean z2 = abstractC0658d.f33396i;
            if (!z2) {
                AbstractC0664f abstractC0664fM12710d = abstractC0658d.m12710d();
                while (true) {
                    AbstractC0658d abstractC0658d2 = (AbstractC0658d) abstractC0664fM12710d;
                    if (z2 || abstractC0658d2 == null) {
                        break;
                    }
                    z2 = abstractC0658d2.f33396i;
                    abstractC0664fM12710d = abstractC0658d2.m12710d();
                }
            }
            if (z2) {
                objMo12624j = abstractC0658d.mo12624j();
                break;
            }
            if (jEstimateSize <= jM12709g || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                objMo12624j = abstractC0658d.mo12622a();
                break;
            }
            AbstractC0658d abstractC0658d3 = (AbstractC0658d) abstractC0658d.mo12623e(spliteratorTrySplit);
            abstractC0658d.f33412d = abstractC0658d3;
            AbstractC0658d abstractC0658d4 = (AbstractC0658d) abstractC0658d.mo12623e(spliterator);
            abstractC0658d.f33413e = abstractC0658d4;
            abstractC0658d.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0658d = abstractC0658d3;
                abstractC0658d3 = abstractC0658d4;
            } else {
                abstractC0658d = abstractC0658d4;
            }
            z = !z;
            abstractC0658d3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC0658d.mo12699f(objMo12624j);
        abstractC0658d.tryComplete();
    }

    @Override // p021j$.util.stream.AbstractC0664f
    /* JADX INFO: renamed from: f */
    protected final void mo12699f(Object obj) {
        if (!(m12710d() == null)) {
            super.mo12699f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f33395h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // p021j$.util.stream.AbstractC0664f, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return mo12698c();
    }

    /* JADX INFO: renamed from: h */
    protected void mo12700h() {
        this.f33396i = true;
    }

    /* JADX INFO: renamed from: i */
    protected final void m12701i() {
        AbstractC0658d abstractC0658d = this;
        for (AbstractC0658d abstractC0658d2 = (AbstractC0658d) m12710d(); abstractC0658d2 != null; abstractC0658d2 = (AbstractC0658d) abstractC0658d2.m12710d()) {
            if (abstractC0658d2.f33412d == abstractC0658d) {
                AbstractC0658d abstractC0658d3 = (AbstractC0658d) abstractC0658d2.f33413e;
                if (!abstractC0658d3.f33396i) {
                    abstractC0658d3.mo12700h();
                }
            }
            abstractC0658d = abstractC0658d2;
        }
    }

    /* JADX INFO: renamed from: j */
    protected abstract Object mo12624j();

    protected AbstractC0658d(AbstractC0586F abstractC0586F, Spliterator spliterator) {
        super(abstractC0586F, spliterator);
        this.f33395h = new AtomicReference(null);
    }
}
