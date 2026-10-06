package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ose implements oru {

    /* JADX INFO: renamed from: a */
    public final osj f46482a;

    /* JADX INFO: renamed from: c */
    private final opn f46484c;

    /* JADX INFO: renamed from: b */
    public final opk f46483b = ook.m18793g(false);

    /* JADX INFO: renamed from: d */
    private final opn f46485d = ook.m18796j(null);

    public ose(osj osjVar, Throwable th) {
        this.f46482a = osjVar;
        this.f46484c = ook.m18796j(th);
    }

    /* JADX INFO: renamed from: i */
    public static final ArrayList m18983i() {
        return new ArrayList(4);
    }

    /* JADX INFO: renamed from: c */
    public final Object m18984c() {
        return this.f46485d.f46397a;
    }

    @Override // p000.oru
    /* JADX INFO: renamed from: cE */
    public final osj mo18948cE() {
        return this.f46482a;
    }

    @Override // p000.oru
    /* JADX INFO: renamed from: cG */
    public final boolean mo18949cG() {
        return m18985d() == null;
    }

    /* JADX INFO: renamed from: d */
    public final Throwable m18985d() {
        return (Throwable) this.f46484c.f46397a;
    }

    /* JADX INFO: renamed from: e */
    public final void m18986e(Throwable th) {
        Throwable thM18985d = m18985d();
        if (thM18985d == null) {
            this.f46484c.m18855c(th);
            return;
        }
        if (th == thM18985d) {
            return;
        }
        Object objM18984c = m18984c();
        if (objM18984c == null) {
            m18987f(th);
            return;
        }
        if (objM18984c instanceof Throwable) {
            if (th == objM18984c) {
                return;
            }
            ArrayList arrayListM18983i = m18983i();
            arrayListM18983i.add(objM18984c);
            arrayListM18983i.add(th);
            m18987f(arrayListM18983i);
            return;
        }
        if (objM18984c instanceof ArrayList) {
            ((ArrayList) objM18984c).add(th);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("State is ");
        sb.append(objM18984c);
        throw new IllegalStateException("State is ".concat(objM18984c.toString()));
    }

    /* JADX INFO: renamed from: f */
    public final void m18987f(Object obj) {
        this.f46485d.m18855c(obj);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m18988g() {
        return m18985d() != null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m18989h() {
        return this.f46483b.m18842a();
    }

    public final String toString() {
        return "Finishing[cancelling=" + m18988g() + ", completing=" + m18989h() + ", rootCause=" + m18985d() + ", exceptions=" + m18984c() + ", list=" + this.f46482a + "]";
    }
}
