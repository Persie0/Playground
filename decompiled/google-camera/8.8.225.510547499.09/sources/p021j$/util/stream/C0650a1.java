package p021j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.a1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0650a1 extends AbstractC0637W0 {

    /* JADX INFO: renamed from: b */
    long f33373b;

    /* JADX INFO: renamed from: c */
    long f33374c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0654b1 f33375d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0650a1(C0654b1 c0654b1, InterfaceC0646Z0 interfaceC0646Z0) {
        super(interfaceC0646Z0);
        this.f33375d = c0654b1;
        this.f33373b = c0654b1.f33380m;
        long j = c0654b1.f33381n;
        this.f33374c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j = this.f33373b;
        if (j != 0) {
            this.f33373b = j - 1;
            return;
        }
        long j2 = this.f33374c;
        if (j2 > 0) {
            this.f33374c = j2 - 1;
            this.f33366a.accept(obj);
        }
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        this.f33366a.mo12599h(j >= 0 ? Math.max(-1L, Math.min(j - this.f33375d.f33380m, this.f33374c)) : -1L);
    }

    @Override // p021j$.util.stream.AbstractC0637W0, p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final boolean mo12600m() {
        return this.f33374c == 0 || this.f33366a.mo12600m();
    }
}
