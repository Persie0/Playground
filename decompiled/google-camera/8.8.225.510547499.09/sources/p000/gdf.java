package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdf implements kfb, kba {

    /* JADX INFO: renamed from: a */
    public final Object f24285a = new Object();

    /* JADX INFO: renamed from: b */
    public boolean f24286b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gdh f24287c;

    /* JADX INFO: renamed from: d */
    private final msi f24288d;

    /* JADX INFO: renamed from: e */
    private long f24289e;

    public gdf(gdh gdhVar, msi msiVar) {
        this.f24287c = gdhVar;
        this.f24288d = msiVar;
    }

    @Override // p000.kfb
    /* JADX INFO: renamed from: c */
    public final void mo3625c(kiq kiqVar) {
        kfd kfdVarM14358b = kiqVar.m14358b();
        if (kfdVarM14358b == null) {
            return;
        }
        long j = kfdVarM14358b.f35812c;
        if (j < this.f24289e + ((long) ((Integer) this.f24288d.mo6051a()).intValue())) {
            return;
        }
        this.f24289e = j;
        kfv.m14174w(kiqVar, new cts(this, kfdVarM14358b, 3));
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f24287c.f24295c) {
            this.f24287c.f24303k.m9071c();
        }
    }
}
