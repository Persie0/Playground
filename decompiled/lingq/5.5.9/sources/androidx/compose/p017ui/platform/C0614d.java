package androidx.compose.p017ui.platform;

import android.graphics.Rect;
import androidx.compose.p017ui.semantics.SemanticsNode;
import androidx.compose.p017ui.text.style.ResolvedTextDirection;
import dm.C5207g;
import p231l1.C7216j;
import p338qd.C8573r0;
import p375s0.C8942d;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0614d extends AbstractC0601a {

    /* JADX INFO: renamed from: e */
    public static C0614d f4293e;

    /* JADX INFO: renamed from: f */
    public static final ResolvedTextDirection f4294f = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: g */
    public static final ResolvedTextDirection f4295g = ResolvedTextDirection.Ltr;

    /* JADX INFO: renamed from: c */
    public C7216j f4296c;

    /* JADX INFO: renamed from: d */
    public SemanticsNode f4297d;

    public C0614d() {
        new Rect();
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    @Override // androidx.compose.p017ui.platform.InterfaceC0621f
    /* JADX INFO: renamed from: a */
    public final int[] mo2335a(int i10) {
        int iM14534c;
        if (m2327d().length() > 0 && i10 < m2327d().length()) {
            try {
                SemanticsNode semanticsNode = this.f4297d;
                if (semanticsNode == null) {
                    C5207g.m11117l("node");
                    throw null;
                }
                C8942d c8942dM2533d = semanticsNode.m2533d();
                int iM16710Y0 = C8573r0.m16710Y0(c8942dM2533d.f46897d - c8942dM2533d.f46895b);
                if (i10 <= 0) {
                    i10 = 0;
                }
                C7216j c7216j = this.f4296c;
                if (c7216j == null) {
                    C5207g.m11117l("layoutResult");
                    throw null;
                }
                int iM14533b = c7216j.m14533b(i10);
                C7216j c7216j2 = this.f4296c;
                if (c7216j2 == null) {
                    C5207g.m11117l("layoutResult");
                    throw null;
                }
                float fM14536e = c7216j2.m14536e(iM14533b) + iM16710Y0;
                C7216j c7216j3 = this.f4296c;
                if (c7216j3 == null) {
                    C5207g.m11117l("layoutResult");
                    throw null;
                }
                if (fM14536e < c7216j3.m14536e(c7216j3.f40591b.f4561f - 1)) {
                    C7216j c7216j4 = this.f4296c;
                    if (c7216j4 == null) {
                        C5207g.m11117l("layoutResult");
                        throw null;
                    }
                    iM14534c = c7216j4.m14534c(fM14536e);
                } else {
                    C7216j c7216j5 = this.f4296c;
                    if (c7216j5 == null) {
                        C5207g.m11117l("layoutResult");
                        throw null;
                    }
                    iM14534c = c7216j5.f40591b.f4561f;
                }
                return m2326c(i10, m2346e(iM14534c - 1, f4295g) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // androidx.compose.p017ui.platform.InterfaceC0621f
    /* JADX INFO: renamed from: b */
    public final int[] mo2336b(int i10) {
        int iM14534c;
        if (m2327d().length() > 0 && i10 > 0) {
            try {
                SemanticsNode semanticsNode = this.f4297d;
                if (semanticsNode == null) {
                    C5207g.m11117l("node");
                    throw null;
                }
                C8942d c8942dM2533d = semanticsNode.m2533d();
                int iM16710Y0 = C8573r0.m16710Y0(c8942dM2533d.f46897d - c8942dM2533d.f46895b);
                int length = m2327d().length();
                if (length <= i10) {
                    i10 = length;
                }
                C7216j c7216j = this.f4296c;
                if (c7216j == null) {
                    C5207g.m11117l("layoutResult");
                    throw null;
                }
                int iM14533b = c7216j.m14533b(i10);
                C7216j c7216j2 = this.f4296c;
                if (c7216j2 == null) {
                    C5207g.m11117l("layoutResult");
                    throw null;
                }
                float fM14536e = c7216j2.m14536e(iM14533b) - iM16710Y0;
                if (fM14536e > 0.0f) {
                    C7216j c7216j3 = this.f4296c;
                    if (c7216j3 == null) {
                        C5207g.m11117l("layoutResult");
                        throw null;
                    }
                    iM14534c = c7216j3.m14534c(fM14536e);
                } else {
                    iM14534c = 0;
                }
                if (i10 == m2327d().length() && iM14534c < iM14533b) {
                    iM14534c++;
                }
                return m2326c(m2346e(iM14534c, f4294f), i10);
            } catch (IllegalStateException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: e */
    public final int m2346e(int i10, ResolvedTextDirection resolvedTextDirection) {
        C7216j c7216j = this.f4296c;
        if (c7216j == null) {
            C5207g.m11117l("layoutResult");
            throw null;
        }
        int iM14535d = c7216j.m14535d(i10);
        C7216j c7216j2 = this.f4296c;
        if (c7216j2 == null) {
            C5207g.m11117l("layoutResult");
            throw null;
        }
        if (resolvedTextDirection != c7216j2.m14538g(iM14535d)) {
            C7216j c7216j3 = this.f4296c;
            if (c7216j3 != null) {
                return c7216j3.m14535d(i10);
            }
            C5207g.m11117l("layoutResult");
            throw null;
        }
        C7216j c7216j4 = this.f4296c;
        if (c7216j4 != null) {
            return c7216j4.m14532a(i10, false) - 1;
        }
        C5207g.m11117l("layoutResult");
        throw null;
    }
}
