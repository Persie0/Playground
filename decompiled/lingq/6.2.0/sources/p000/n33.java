package p000;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class n33 extends g04 {

    /* JADX INFO: renamed from: a */
    public final d57 f52262a;

    /* JADX INFO: renamed from: b */
    public final u33 f52263b;

    /* JADX INFO: renamed from: c */
    public final String f52264c;

    /* JADX INFO: renamed from: d */
    public final Closeable f52265d;

    /* JADX INFO: renamed from: e */
    public boolean f52266e;

    /* JADX INFO: renamed from: f */
    public e18 f52267f;

    public n33(d57 d57Var, u33 u33Var, String str, Closeable closeable) {
        this.f52262a = d57Var;
        this.f52263b = u33Var;
        this.f52264c = str;
        this.f52265d = closeable;
    }

    @Override // p000.g04
    /* JADX INFO: renamed from: a */
    public final vz1 mo315a() {
        return null;
    }

    @Override // p000.g04
    /* JADX INFO: renamed from: b */
    public final synchronized hj0 mo316b() {
        if (this.f52266e) {
            throw new IllegalStateException("closed");
        }
        e18 e18Var = this.f52267f;
        if (e18Var != null) {
            return e18Var;
        }
        e18 e18VarM20390p = r46.m20390p(this.f52263b.mo261N(this.f52262a));
        this.f52267f = e18VarM20390p;
        return e18VarM20390p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f52266e = true;
            e18 e18Var = this.f52267f;
            if (e18Var != null) {
                AbstractC3057h.m12986a(e18Var);
            }
            Closeable closeable = this.f52265d;
            if (closeable != null) {
                AbstractC3057h.m12986a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
