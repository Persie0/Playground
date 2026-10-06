package p000;

import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class kky implements kgg {

    /* JADX INFO: renamed from: a */
    private static int f36443a = 0;

    /* JADX INFO: renamed from: b */
    private final int f36444b = m14474j();

    /* JADX INFO: renamed from: f */
    public final kmg f36445f;

    /* JADX INFO: renamed from: g */
    public final boolean f36446g;

    /* JADX INFO: renamed from: h */
    public final kgi f36447h;

    public kky(kgi kgiVar, kmg kmgVar, boolean z) {
        this.f36447h = kgiVar;
        this.f36445f = kmgVar;
        this.f36446g = z;
    }

    /* JADX INFO: renamed from: j */
    private static synchronized int m14474j() {
        int i;
        i = f36443a;
        f36443a = i + 1;
        return i;
    }

    @Override // p000.kgg
    /* JADX INFO: renamed from: c */
    public final kmg mo14193c() {
        return this.f36445f;
    }

    @Override // p000.kgg
    /* JADX INFO: renamed from: e */
    public final boolean mo14195e() {
        return this.f36447h.f35907i;
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo14451f();

    /* JADX INFO: renamed from: g */
    public abstract Surface mo14452g();

    /* JADX INFO: renamed from: h */
    public abstract kgj mo14453h();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo14454i();

    public final String toString() {
        return "Stream-" + this.f36444b;
    }
}
