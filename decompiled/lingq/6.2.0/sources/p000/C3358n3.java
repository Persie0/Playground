package p000;

import androidx.compose.p002ui.text.style.ResolvedTextDirection;

/* JADX INFO: renamed from: n3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3358n3 extends AbstractC3284l3 {

    /* JADX INFO: renamed from: d */
    public static C3358n3 f52247d;

    /* JADX INFO: renamed from: e */
    public static final ResolvedTextDirection f52248e = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: f */
    public static final ResolvedTextDirection f52249f = ResolvedTextDirection.Ltr;

    /* JADX INFO: renamed from: c */
    public rw9 f52250c;

    @Override // p000.AbstractC3284l3
    /* JADX INFO: renamed from: e */
    public final int[] mo15760e(int i) {
        int iM23743d;
        if (m15763h().length() > 0 && i < m15763h().length()) {
            rw9 rw9Var = this.f52250c;
            ResolvedTextDirection resolvedTextDirection = f52248e;
            if (i < 0) {
                if (rw9Var == null) {
                    fa4.m11636J("layoutResult");
                    throw null;
                }
                iM23743d = rw9Var.f59976b.m23743d(0);
            } else {
                if (rw9Var == null) {
                    fa4.m11636J("layoutResult");
                    throw null;
                }
                int iM23743d2 = rw9Var.f59976b.m23743d(i);
                iM23743d = m17197m(iM23743d2, resolvedTextDirection) == i ? iM23743d2 : iM23743d2 + 1;
            }
            rw9 rw9Var2 = this.f52250c;
            if (rw9Var2 == null) {
                fa4.m11636J("layoutResult");
                throw null;
            }
            if (iM23743d < rw9Var2.f59976b.f66381f) {
                return m15762g(m17197m(iM23743d, resolvedTextDirection), m17197m(iM23743d, f52249f) + 1);
            }
        }
        return null;
    }

    @Override // p000.AbstractC3284l3
    /* JADX INFO: renamed from: k */
    public final int[] mo15766k(int i) {
        int iM23743d;
        if (m15763h().length() > 0 && i > 0) {
            int length = m15763h().length();
            rw9 rw9Var = this.f52250c;
            ResolvedTextDirection resolvedTextDirection = f52249f;
            if (i > length) {
                if (rw9Var == null) {
                    fa4.m11636J("layoutResult");
                    throw null;
                }
                iM23743d = rw9Var.f59976b.m23743d(m15763h().length());
            } else {
                if (rw9Var == null) {
                    fa4.m11636J("layoutResult");
                    throw null;
                }
                int iM23743d2 = rw9Var.f59976b.m23743d(i);
                iM23743d = m17197m(iM23743d2, resolvedTextDirection) + 1 == i ? iM23743d2 : iM23743d2 - 1;
            }
            if (iM23743d >= 0) {
                return m15762g(m17197m(iM23743d, f52248e), m17197m(iM23743d, resolvedTextDirection) + 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final int m17197m(int i, ResolvedTextDirection resolvedTextDirection) {
        rw9 rw9Var = this.f52250c;
        if (rw9Var == null) {
            fa4.m11636J("layoutResult");
            throw null;
        }
        int iM20960g = rw9Var.m20960g(i);
        rw9 rw9Var2 = this.f52250c;
        if (rw9Var2 == null) {
            fa4.m11636J("layoutResult");
            throw null;
        }
        ResolvedTextDirection resolvedTextDirectionM20961h = rw9Var2.m20961h(iM20960g);
        rw9 rw9Var3 = this.f52250c;
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
    public final void m17198n(String str, rw9 rw9Var) {
        this.f48950a = str;
        this.f52250c = rw9Var;
    }
}
