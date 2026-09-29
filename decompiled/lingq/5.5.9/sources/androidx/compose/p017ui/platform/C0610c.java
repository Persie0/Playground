package androidx.compose.p017ui.platform;

import androidx.compose.p017ui.text.style.ResolvedTextDirection;
import dm.C5207g;
import p231l1.C7216j;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0610c extends AbstractC0601a {

    /* JADX INFO: renamed from: d */
    public static C0610c f4287d;

    /* JADX INFO: renamed from: e */
    public static final ResolvedTextDirection f4288e = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: f */
    public static final ResolvedTextDirection f4289f = ResolvedTextDirection.Ltr;

    /* JADX INFO: renamed from: c */
    public C7216j f4290c;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.compose.p017ui.platform.InterfaceC0621f
    /* JADX INFO: renamed from: a */
    public final int[] mo2335a(int i10) {
        int iM14533b;
        if (m2327d().length() > 0 && i10 < m2327d().length()) {
            ResolvedTextDirection resolvedTextDirection = f4288e;
            if (i10 < 0) {
                C7216j c7216j = this.f4290c;
                if (c7216j == null) {
                    C5207g.m11117l("layoutResult");
                    throw null;
                }
                iM14533b = c7216j.m14533b(0);
            } else {
                C7216j c7216j2 = this.f4290c;
                if (c7216j2 == null) {
                    C5207g.m11117l("layoutResult");
                    throw null;
                }
                int iM14533b2 = c7216j2.m14533b(i10);
                iM14533b = m2340e(iM14533b2, resolvedTextDirection) == i10 ? iM14533b2 : iM14533b2 + 1;
            }
            C7216j c7216j3 = this.f4290c;
            if (c7216j3 == null) {
                C5207g.m11117l("layoutResult");
                throw null;
            }
            if (iM14533b >= c7216j3.f40591b.f4561f) {
                return null;
            }
            return m2326c(m2340e(iM14533b, resolvedTextDirection), m2340e(iM14533b, f4289f) + 1);
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.compose.p017ui.platform.InterfaceC0621f
    /* JADX INFO: renamed from: b */
    public final int[] mo2336b(int i10) {
        int iM14533b;
        if (m2327d().length() <= 0 || i10 <= 0) {
            return null;
        }
        int length = m2327d().length();
        ResolvedTextDirection resolvedTextDirection = f4289f;
        if (i10 > length) {
            C7216j c7216j = this.f4290c;
            if (c7216j == null) {
                C5207g.m11117l("layoutResult");
                throw null;
            }
            iM14533b = c7216j.m14533b(m2327d().length());
        } else {
            C7216j c7216j2 = this.f4290c;
            if (c7216j2 == null) {
                C5207g.m11117l("layoutResult");
                throw null;
            }
            int iM14533b2 = c7216j2.m14533b(i10);
            iM14533b = m2340e(iM14533b2, resolvedTextDirection) + 1 == i10 ? iM14533b2 : iM14533b2 - 1;
        }
        if (iM14533b < 0) {
            return null;
        }
        return m2326c(m2340e(iM14533b, f4288e), m2340e(iM14533b, resolvedTextDirection) + 1);
    }

    /* JADX INFO: renamed from: e */
    public final int m2340e(int i10, ResolvedTextDirection resolvedTextDirection) {
        C7216j c7216j = this.f4290c;
        if (c7216j == null) {
            C5207g.m11117l("layoutResult");
            throw null;
        }
        int iM14535d = c7216j.m14535d(i10);
        C7216j c7216j2 = this.f4290c;
        if (c7216j2 == null) {
            C5207g.m11117l("layoutResult");
            throw null;
        }
        if (resolvedTextDirection != c7216j2.m14538g(iM14535d)) {
            C7216j c7216j3 = this.f4290c;
            if (c7216j3 != null) {
                return c7216j3.m14535d(i10);
            }
            C5207g.m11117l("layoutResult");
            throw null;
        }
        C7216j c7216j4 = this.f4290c;
        if (c7216j4 != null) {
            return c7216j4.m14532a(i10, false) - 1;
        }
        C5207g.m11117l("layoutResult");
        throw null;
    }
}
