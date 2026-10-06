package p021j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.f */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0664f extends CountedCompleter {

    /* JADX INFO: renamed from: g */
    private static final int f33408g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* JADX INFO: renamed from: a */
    protected final AbstractC0586F f33409a;

    /* JADX INFO: renamed from: b */
    protected Spliterator f33410b;

    /* JADX INFO: renamed from: c */
    protected long f33411c;

    /* JADX INFO: renamed from: d */
    protected AbstractC0664f f33412d;

    /* JADX INFO: renamed from: e */
    protected AbstractC0664f f33413e;

    /* JADX INFO: renamed from: f */
    private Object f33414f;

    protected AbstractC0664f(AbstractC0664f abstractC0664f, Spliterator spliterator) {
        super(abstractC0664f);
        this.f33410b = spliterator;
        this.f33409a = abstractC0664f.f33409a;
        this.f33411c = abstractC0664f.f33411c;
    }

    /* JADX INFO: renamed from: b */
    public static int m12708b() {
        return f33408g;
    }

    /* JADX INFO: renamed from: g */
    public static long m12709g(long j) {
        long j2 = j / ((long) f33408g);
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo12622a();

    /* JADX INFO: renamed from: c */
    protected Object mo12698c() {
        return this.f33414f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f33410b;
        long jEstimateSize = spliterator.estimateSize();
        long jM12709g = this.f33411c;
        if (jM12709g == 0) {
            jM12709g = m12709g(jEstimateSize);
            this.f33411c = jM12709g;
        }
        boolean z = false;
        AbstractC0664f abstractC0664f = this;
        while (jEstimateSize > jM12709g && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC0664f abstractC0664fMo12623e = abstractC0664f.mo12623e(spliteratorTrySplit);
            abstractC0664f.f33412d = abstractC0664fMo12623e;
            AbstractC0664f abstractC0664fMo12623e2 = abstractC0664f.mo12623e(spliterator);
            abstractC0664f.f33413e = abstractC0664fMo12623e2;
            abstractC0664f.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0664f = abstractC0664fMo12623e;
                abstractC0664fMo12623e = abstractC0664fMo12623e2;
            } else {
                abstractC0664f = abstractC0664fMo12623e2;
            }
            z = !z;
            abstractC0664fMo12623e.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC0664f.mo12699f(abstractC0664f.mo12622a());
        abstractC0664f.tryComplete();
    }

    /* JADX INFO: renamed from: d */
    protected final AbstractC0664f m12710d() {
        return (AbstractC0664f) getCompleter();
    }

    /* JADX INFO: renamed from: e */
    protected abstract AbstractC0664f mo12623e(Spliterator spliterator);

    /* JADX INFO: renamed from: f */
    protected void mo12699f(Object obj) {
        this.f33414f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f33414f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f33410b = null;
        this.f33413e = null;
        this.f33412d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    protected AbstractC0664f(AbstractC0586F abstractC0586F, Spliterator spliterator) {
        super(null);
        this.f33409a = abstractC0586F;
        this.f33410b = spliterator;
        this.f33411c = 0L;
    }
}
