package p000;

/* JADX INFO: renamed from: vv */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1079vv implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1083vz f47882a;

    /* JADX INFO: renamed from: b */
    public final opk f47883b;

    /* JADX INFO: renamed from: c */
    private final int f47884c;

    /* JADX INFO: renamed from: d */
    private final C1070vm f47885d;

    public C1079vv(C1070vm c1070vm, InterfaceC1083vz interfaceC1083vz) {
        c1070vm.getClass();
        this.f47885d = c1070vm;
        this.f47882a = interfaceC1083vz;
        this.f47884c = C1080vw.f47886a.m18846b();
        this.f47883b = ook.m18793g(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f47883b.m18843b();
        this.f47885d.m19506a();
    }

    public final String toString() {
        return "CameraGraph.Session-" + this.f47884c;
    }
}
