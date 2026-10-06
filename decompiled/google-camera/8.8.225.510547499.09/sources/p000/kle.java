package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kle {

    /* JADX INFO: renamed from: a */
    public int f36464a = 0;

    /* JADX INFO: renamed from: b */
    public int f36465b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f36466c;

    /* JADX INFO: renamed from: d */
    public final jvb f36467d;

    /* JADX INFO: renamed from: e */
    private final knw f36468e;

    /* JADX INFO: renamed from: f */
    private final knw f36469f;

    /* JADX INFO: renamed from: g */
    private final boolean f36470g;

    public kle(knw knwVar, knw knwVar2, jvb jvbVar, boolean z) {
        this.f36466c = false;
        this.f36467d = jvbVar;
        this.f36468e = knwVar;
        this.f36469f = knwVar2;
        this.f36466c = jvbVar.mo8995b();
        this.f36470g = z;
    }

    /* JADX INFO: renamed from: f */
    public static kle m14476f(knw knwVar, knw knwVar2, boolean z) {
        jvb jvbVar = new jvb();
        if (knwVar != null) {
            jvbVar.m13537d(knwVar);
        }
        if (knwVar2 != null) {
            jvbVar.m13537d(knwVar2);
        }
        if (knwVar == null && knwVar2 == null) {
            jvbVar.close();
        }
        return new kle(knwVar, knwVar2, jvbVar, z);
    }

    /* JADX INFO: renamed from: g */
    public static kle m14477g() {
        return m14476f(null, null, false);
    }

    /* JADX INFO: renamed from: a */
    public final kba m14478a() {
        boolean z;
        synchronized (this) {
            boolean z2 = this.f36466c;
            if (!z2) {
                this.f36464a++;
            }
            z = !z2;
        }
        m14480c();
        if (z) {
            return new kld(this, 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final kba m14479b() {
        boolean z;
        synchronized (this) {
            boolean z2 = this.f36466c;
            if (!z2) {
                this.f36465b++;
            }
            z = !z2;
        }
        m14480c();
        if (z) {
            return new kld(this, 0);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m14480c() {
        boolean z = false;
        if (!this.f36466c && this.f36465b == 0 && this.f36464a > 0) {
            z = true;
        }
        knw knwVar = this.f36469f;
        if (knwVar != null) {
            knwVar.m14609a(z);
        }
        if (this.f36470g) {
            return;
        }
        knw knwVar2 = this.f36468e;
        if (knwVar2 != null) {
            knwVar2.m14609a(z);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m14481d() {
        return this.f36466c;
    }

    /* JADX INFO: renamed from: e */
    public final void m14482e(kba kbaVar) {
        this.f36467d.m13537d(kbaVar);
    }
}
