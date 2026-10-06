package p000;

/* JADX INFO: renamed from: vm */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1070vm implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1072vo f47851a;

    /* JADX INFO: renamed from: b */
    private final long f47852b;

    /* JADX INFO: renamed from: c */
    private final opk f47853c = ook.m18793g(false);

    public C1070vm(C1072vo c1072vo, long j) {
        this.f47851a = c1072vo;
        this.f47852b = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m19506a() {
        if (this.f47853c.m18843b()) {
            this.f47851a.m19507a(this.f47852b);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m19506a();
    }
}
