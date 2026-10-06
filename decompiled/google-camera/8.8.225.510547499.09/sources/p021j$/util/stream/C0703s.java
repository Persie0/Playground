package p021j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p021j$.util.Spliterator;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.util.stream.s */
/* JADX INFO: loaded from: classes3.dex */
final class C0703s extends CountedCompleter {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f33466h = 0;

    /* JADX INFO: renamed from: a */
    private final AbstractC0586F f33467a;

    /* JADX INFO: renamed from: b */
    private Spliterator f33468b;

    /* JADX INFO: renamed from: c */
    private final long f33469c;

    /* JADX INFO: renamed from: d */
    private final ConcurrentHashMap f33470d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0646Z0 f33471e;

    /* JADX INFO: renamed from: f */
    private final C0703s f33472f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0613O f33473g;

    C0703s(C0703s c0703s, Spliterator spliterator, C0703s c0703s2) {
        super(c0703s);
        this.f33467a = c0703s.f33467a;
        this.f33468b = spliterator;
        this.f33469c = c0703s.f33469c;
        this.f33470d = c0703s.f33470d;
        this.f33471e = c0703s.f33471e;
        this.f33472f = c0703s2;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f33468b;
        long j = this.f33469c;
        boolean z = false;
        C0703s c0703s = this;
        while (spliterator.estimateSize() > j && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            C0703s c0703s2 = new C0703s(c0703s, spliteratorTrySplit, c0703s.f33472f);
            C0703s c0703s3 = new C0703s(c0703s, spliterator, c0703s2);
            c0703s.addToPendingCount(1);
            c0703s3.addToPendingCount(1);
            c0703s.f33470d.put(c0703s2, c0703s3);
            if (c0703s.f33472f != null) {
                c0703s2.addToPendingCount(1);
                if (c0703s.f33470d.replace(c0703s.f33472f, c0703s, c0703s2)) {
                    c0703s.addToPendingCount(-1);
                } else {
                    c0703s2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = spliteratorTrySplit;
                c0703s = c0703s2;
                c0703s2 = c0703s3;
            } else {
                c0703s = c0703s3;
            }
            z = !z;
            c0703s2.fork();
        }
        if (c0703s.getPendingCount() > 0) {
            C0652b c0652b = new C0652b(8);
            AbstractC0586F abstractC0586F = c0703s.f33467a;
            InterfaceC0598J interfaceC0598JMo12595y = abstractC0586F.mo12595y(abstractC0586F.mo12664w(spliterator), c0652b);
            c0703s.f33467a.mo12660A(spliterator, interfaceC0598JMo12595y);
            c0703s.f33473g = interfaceC0598JMo12595y.mo12596a();
            c0703s.f33468b = null;
        }
        c0703s.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC0613O interfaceC0613O = this.f33473g;
        if (interfaceC0613O != null) {
            interfaceC0613O.forEach(this.f33471e);
            this.f33473g = null;
        } else {
            Spliterator spliterator = this.f33468b;
            if (spliterator != null) {
                this.f33467a.mo12660A(spliterator, this.f33471e);
                this.f33468b = null;
            }
        }
        C0703s c0703s = (C0703s) this.f33470d.remove(this);
        if (c0703s != null) {
            c0703s.tryComplete();
        }
    }

    protected C0703s(AbstractC0586F abstractC0586F, Spliterator spliterator, InterfaceC0646Z0 interfaceC0646Z0) {
        super(null);
        this.f33467a = abstractC0586F;
        this.f33468b = spliterator;
        this.f33469c = AbstractC0664f.m12709g(spliterator.estimateSize());
        this.f33470d = new ConcurrentHashMap(Math.max(16, AbstractC0664f.m12708b() << 1), 0.75f, 1);
        this.f33471e = interfaceC0646Z0;
        this.f33472f = null;
    }
}
