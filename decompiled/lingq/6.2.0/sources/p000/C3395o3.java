package p000;

import androidx.compose.p002ui.semantics.C0423c;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;

/* JADX INFO: renamed from: o3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3395o3 extends AbstractC3284l3 {

    /* JADX INFO: renamed from: e */
    public static C3395o3 f53748e;

    /* JADX INFO: renamed from: f */
    public static final ResolvedTextDirection f53749f = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: g */
    public static final ResolvedTextDirection f53750g = ResolvedTextDirection.Ltr;

    /* JADX INFO: renamed from: c */
    public rw9 f53751c;

    /* JADX INFO: renamed from: d */
    public C0423c f53752d;

    @Override // p000.AbstractC3284l3
    /* JADX INFO: renamed from: e */
    public final int[] mo15760e(int i) {
        int iM23744e;
        if (m15763h().length() > 0 && i < m15763h().length()) {
            try {
                C0423c c0423c = this.f53752d;
                if (c0423c == null) {
                    fa4.m11636J("node");
                    throw null;
                }
                e28 e28VarM1846g = c0423c.m1846g();
                int iRound = Math.round(e28VarM1846g.f36623d - e28VarM1846g.f36621b);
                if (i <= 0) {
                    i = 0;
                }
                rw9 rw9Var = this.f53751c;
                if (rw9Var == null) {
                    fa4.m11636J("layoutResult");
                    throw null;
                }
                int iM23743d = rw9Var.f59976b.m23743d(i);
                rw9 rw9Var2 = this.f53751c;
                if (rw9Var2 == null) {
                    fa4.m11636J("layoutResult");
                    throw null;
                }
                float fM23745f = rw9Var2.f59976b.m23745f(iM23743d) + iRound;
                rw9 rw9Var3 = this.f53751c;
                if (rw9Var3 == null) {
                    fa4.m11636J("layoutResult");
                    throw null;
                }
                w46 w46Var = rw9Var3.f59976b;
                float fM23745f2 = w46Var.m23745f(w46Var.f66381f - 1);
                rw9 rw9Var4 = this.f53751c;
                if (fM23745f < fM23745f2) {
                    if (rw9Var4 == null) {
                        fa4.m11636J("layoutResult");
                        throw null;
                    }
                    iM23744e = rw9Var4.f59976b.m23744e(fM23745f);
                } else {
                    if (rw9Var4 == null) {
                        fa4.m11636J("layoutResult");
                        throw null;
                    }
                    iM23744e = rw9Var4.f59976b.f66381f;
                }
                return m15762g(i, m17772m(iM23744e - 1, f53750g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // p000.AbstractC3284l3
    /* JADX INFO: renamed from: k */
    public final int[] mo15766k(int i) {
        int iM23744e;
        if (m15763h().length() > 0 && i > 0) {
            try {
                C0423c c0423c = this.f53752d;
                if (c0423c == null) {
                    fa4.m11636J("node");
                    throw null;
                }
                e28 e28VarM1846g = c0423c.m1846g();
                int iRound = Math.round(e28VarM1846g.f36623d - e28VarM1846g.f36621b);
                int length = m15763h().length();
                if (length <= i) {
                    i = length;
                }
                rw9 rw9Var = this.f53751c;
                if (rw9Var == null) {
                    fa4.m11636J("layoutResult");
                    throw null;
                }
                int iM23743d = rw9Var.f59976b.m23743d(i);
                rw9 rw9Var2 = this.f53751c;
                if (rw9Var2 == null) {
                    fa4.m11636J("layoutResult");
                    throw null;
                }
                float fM23745f = rw9Var2.f59976b.m23745f(iM23743d) - iRound;
                if (fM23745f > 0.0f) {
                    rw9 rw9Var3 = this.f53751c;
                    if (rw9Var3 == null) {
                        fa4.m11636J("layoutResult");
                        throw null;
                    }
                    iM23744e = rw9Var3.f59976b.m23744e(fM23745f);
                } else {
                    iM23744e = 0;
                }
                if (i == m15763h().length() && iM23744e < iM23743d) {
                    iM23744e++;
                }
                return m15762g(m17772m(iM23744e, f53749f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final int m17772m(int i, ResolvedTextDirection resolvedTextDirection) {
        rw9 rw9Var = this.f53751c;
        if (rw9Var == null) {
            fa4.m11636J("layoutResult");
            throw null;
        }
        int iM20960g = rw9Var.m20960g(i);
        rw9 rw9Var2 = this.f53751c;
        if (rw9Var2 == null) {
            fa4.m11636J("layoutResult");
            throw null;
        }
        ResolvedTextDirection resolvedTextDirectionM20961h = rw9Var2.m20961h(iM20960g);
        rw9 rw9Var3 = this.f53751c;
        if (resolvedTextDirection != resolvedTextDirectionM20961h) {
            if (rw9Var3 != null) {
                return rw9Var3.m20960g(i);
            }
            fa4.m11636J("layoutResult");
            throw null;
        }
        if (rw9Var3 != null) {
            return rw9Var3.f59976b.m23742c(i, false) - 1;
        }
        fa4.m11636J("layoutResult");
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final void m17773n(String str, rw9 rw9Var, C0423c c0423c) {
        this.f48950a = str;
        this.f53751c = rw9Var;
        this.f53752d = c0423c;
    }
}
