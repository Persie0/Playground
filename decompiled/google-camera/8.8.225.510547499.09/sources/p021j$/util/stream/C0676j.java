package p021j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.j */
/* JADX INFO: loaded from: classes3.dex */
final class C0676j extends AbstractC0637W0 {

    /* JADX INFO: renamed from: b */
    boolean f33436b;

    /* JADX INFO: renamed from: c */
    Object f33437c;

    C0676j(InterfaceC0646Z0 interfaceC0646Z0) {
        super(interfaceC0646Z0);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        InterfaceC0646Z0 interfaceC0646Z0 = this.f33366a;
        if (obj != null) {
            Object obj2 = this.f33437c;
            if (obj2 != null && obj.equals(obj2)) {
                return;
            }
        } else {
            if (this.f33436b) {
                return;
            }
            this.f33436b = true;
            obj = null;
        }
        this.f33437c = obj;
        interfaceC0646Z0.accept(obj);
    }

    @Override // p021j$.util.stream.AbstractC0637W0, p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final void mo12598f() {
        this.f33436b = false;
        this.f33437c = null;
        this.f33366a.mo12598f();
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        this.f33436b = false;
        this.f33437c = null;
        this.f33366a.mo12599h(-1L);
    }
}
