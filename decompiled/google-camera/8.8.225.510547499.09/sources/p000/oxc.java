package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oxc {

    /* JADX INFO: renamed from: a */
    public final opn f46759a;

    /* JADX INFO: renamed from: b */
    public final long f46760b;

    /* JADX INFO: renamed from: c */
    public final opl f46761c;

    /* JADX INFO: renamed from: e */
    private final opn f46763e = ook.m18796j(null);

    /* JADX INFO: renamed from: d */
    public final liv f46762d = ooc.m18759y(oyu.f46870f);

    public oxc(long j, oxc oxcVar, int i) {
        this.f46759a = ook.m18796j(oxcVar);
        this.f46760b = j;
        this.f46761c = ook.m18794h(i << 16);
    }

    /* JADX INFO: renamed from: a */
    public final Object m19121a() {
        return this.f46763e.f46397a;
    }

    /* JADX INFO: renamed from: b */
    public final oxc m19122b() {
        Object objM19121a = m19121a();
        if (objM19121a == oxb.f46758a) {
            return null;
        }
        return (oxc) objM19121a;
    }

    /* JADX INFO: renamed from: c */
    public final void m19123c() {
        boolean z = oqu.f46432a;
        while (true) {
            oxc oxcVar = (oxc) this.f46759a.f46397a;
            while (oxcVar != null && oxcVar.m19127g()) {
                oxcVar = (oxc) oxcVar.f46759a.f46397a;
            }
            oxc oxcVarM19122b = m19122b();
            oxcVarM19122b.getClass();
            while (oxcVarM19122b.m19127g()) {
                oxcVarM19122b = oxcVarM19122b.m19122b();
                oxcVarM19122b.getClass();
            }
            oxcVarM19122b.f46759a.m18855c(oxcVar);
            if (oxcVar != null) {
                oxcVar.f46763e.m18855c(oxcVarM19122b);
            }
            if (!oxcVarM19122b.m19127g() && (oxcVar == null || !oxcVar.m19127g())) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19124d() {
        return m19122b() == null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m19125e(oxc oxcVar) {
        return this.f46763e.m18856d(null, oxcVar);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m19126f() {
        return opl.f46390a.addAndGet(this.f46761c, -65536) == oyu.f46870f && !m19124d();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m19127g() {
        return this.f46761c.f46391b == oyu.f46870f && !m19124d();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m19128h() {
        int i;
        opl oplVar = this.f46761c;
        do {
            i = oplVar.f46391b;
            if (i == oyu.f46870f && !m19124d()) {
                return false;
            }
        } while (!oplVar.m18847c(i, 65536 + i));
        return true;
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f46760b + ", hashCode=" + hashCode() + "]";
    }
}
