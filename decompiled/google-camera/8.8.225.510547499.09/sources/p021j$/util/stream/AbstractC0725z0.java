package p021j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;
import p021j$.util.Spliterator;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.z0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0725z0 extends CountedCompleter implements InterfaceC0646Z0 {

    /* JADX INFO: renamed from: a */
    protected final Spliterator f33533a;

    /* JADX INFO: renamed from: b */
    protected final AbstractC0586F f33534b;

    /* JADX INFO: renamed from: c */
    protected final long f33535c;

    /* JADX INFO: renamed from: d */
    protected long f33536d;

    /* JADX INFO: renamed from: e */
    protected long f33537e;

    /* JADX INFO: renamed from: f */
    protected int f33538f;

    /* JADX INFO: renamed from: g */
    protected int f33539g;

    AbstractC0725z0(int i, Spliterator spliterator, AbstractC0586F abstractC0586F) {
        this.f33533a = spliterator;
        this.f33534b = abstractC0586F;
        this.f33535c = AbstractC0664f.m12709g(spliterator.estimateSize());
        this.f33536d = 0L;
        this.f33537e = i;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC0586F.m12640b();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX INFO: renamed from: b */
    abstract AbstractC0725z0 mo12743b(Spliterator spliterator, long j, long j2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f33533a;
        AbstractC0725z0 abstractC0725z0Mo12743b = this;
        while (spliterator.estimateSize() > abstractC0725z0Mo12743b.f33535c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC0725z0Mo12743b.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            abstractC0725z0Mo12743b.mo12743b(spliteratorTrySplit, abstractC0725z0Mo12743b.f33536d, jEstimateSize).fork();
            abstractC0725z0Mo12743b = abstractC0725z0Mo12743b.mo12743b(spliterator, abstractC0725z0Mo12743b.f33536d + jEstimateSize, abstractC0725z0Mo12743b.f33537e - jEstimateSize);
        }
        abstractC0725z0Mo12743b.f33534b.mo12660A(spliterator, abstractC0725z0Mo12743b);
        abstractC0725z0Mo12743b.propagateCompletion();
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo12598f() {
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        long j2 = this.f33537e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.f33536d;
        this.f33538f = i;
        this.f33539g = i + ((int) j2);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean mo12600m() {
        return false;
    }

    AbstractC0725z0(AbstractC0725z0 abstractC0725z0, Spliterator spliterator, long j, long j2, int i) {
        super(abstractC0725z0);
        this.f33533a = spliterator;
        this.f33534b = abstractC0725z0.f33534b;
        this.f33535c = abstractC0725z0.f33535c;
        this.f33536d = j;
        this.f33537e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public /* synthetic */ void accept(long j) {
        AbstractC0586F.m12645g();
        throw null;
    }
}
