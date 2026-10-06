package p021j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.t */
/* JADX INFO: loaded from: classes3.dex */
final class C0706t extends CountedCompleter {

    /* JADX INFO: renamed from: a */
    private Spliterator f33480a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0646Z0 f33481b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0586F f33482c;

    /* JADX INFO: renamed from: d */
    private long f33483d;

    C0706t(C0706t c0706t, Spliterator spliterator) {
        super(c0706t);
        this.f33480a = spliterator;
        this.f33481b = c0706t.f33481b;
        this.f33483d = c0706t.f33483d;
        this.f33482c = c0706t.f33482c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f33480a;
        long jEstimateSize = spliterator.estimateSize();
        long jM12709g = this.f33483d;
        if (jM12709g == 0) {
            jM12709g = AbstractC0664f.m12709g(jEstimateSize);
            this.f33483d = jM12709g;
        }
        boolean zM12740e = EnumC0711u1.SHORT_CIRCUIT.m12740e(this.f33482c.mo12665x());
        InterfaceC0646Z0 interfaceC0646Z0 = this.f33481b;
        boolean z = false;
        C0706t c0706t = this;
        while (true) {
            if (zM12740e && interfaceC0646Z0.mo12600m()) {
                break;
            }
            if (jEstimateSize <= jM12709g || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                c0706t.f33482c.mo12662u(spliterator, interfaceC0646Z0);
                break;
            }
            C0706t c0706t2 = new C0706t(c0706t, spliteratorTrySplit);
            c0706t.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                C0706t c0706t3 = c0706t;
                c0706t = c0706t2;
                c0706t2 = c0706t3;
            }
            z = !z;
            c0706t.fork();
            c0706t = c0706t2;
            jEstimateSize = spliterator.estimateSize();
        }
        c0706t.f33480a = null;
        c0706t.propagateCompletion();
    }

    C0706t(AbstractC0586F abstractC0586F, Spliterator spliterator, InterfaceC0646Z0 interfaceC0646Z0) {
        super(null);
        this.f33481b = interfaceC0646Z0;
        this.f33482c = abstractC0586F;
        this.f33480a = spliterator;
        this.f33483d = 0L;
    }
}
