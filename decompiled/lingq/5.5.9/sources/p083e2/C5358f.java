package p083e2;

import androidx.constraintlayout.core.widgets.C0738d;
import androidx.constraintlayout.core.widgets.C0740f;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: e2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5358f {

    /* JADX INFO: renamed from: a */
    public static final C5354b.a f33681a = new C5354b.a();

    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX INFO: renamed from: a */
    public static boolean m11489a(ConstraintWidget constraintWidget) {
        boolean z10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4857V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.f4858W;
        C0738d c0738d = constraintWidget2 != null ? (C0738d) constraintWidget2 : null;
        if (c0738d != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = c0738d.f4857V[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (c0738d != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = c0738d.f4857V[1];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z11 = dimensionBehaviour3 == dimensionBehaviour9 || constraintWidget.mo2706E() || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour3 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f4898s == 0 && constraintWidget.f4861Z == 0.0f && constraintWidget.m2738x(0)) || (dimensionBehaviour3 == dimensionBehaviour2 && constraintWidget.f4898s == 1 && constraintWidget.m2739y(0, constraintWidget.m2735u()));
        if (dimensionBehaviour4 == dimensionBehaviour9 || constraintWidget.mo2707F() || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour4 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f4900t == 0 && constraintWidget.f4861Z == 0.0f && constraintWidget.m2738x(1))) {
            z10 = true;
        } else if (dimensionBehaviour4 == dimensionBehaviour && constraintWidget.f4900t == 1 && constraintWidget.m2739y(1, constraintWidget.m2731o())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (constraintWidget.f4861Z <= 0.0f || (!z11 && !z10)) {
            return z11 && z10;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m11490b(int i10, ConstraintWidget constraintWidget, C5354b.b bVar, boolean z10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.f4888n) {
            return;
        }
        if (!(constraintWidget instanceof C0738d) && constraintWidget.m2705D() && m11489a(constraintWidget)) {
            C0738d.m2763Y(constraintWidget, bVar, new C5354b.a());
        }
        ConstraintAnchor constraintAnchorMo2729m = constraintWidget.mo2729m(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorMo2729m2 = constraintWidget.mo2729m(ConstraintAnchor.Type.RIGHT);
        int iM2689d = constraintAnchorMo2729m.m2689d();
        int iM2689d2 = constraintAnchorMo2729m2.m2689d();
        HashSet<ConstraintAnchor> hashSet = constraintAnchorMo2729m.f4826a;
        char c10 = 0;
        if (hashSet != null && constraintAnchorMo2729m.f4828c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f4829d;
                int i11 = i10 + 1;
                boolean zM11489a = m11489a(constraintWidget2);
                if (constraintWidget2.m2705D() && zM11489a) {
                    C0738d.m2763Y(constraintWidget2, bVar, new C5354b.a());
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.f4846K;
                ConstraintAnchor constraintAnchor6 = constraintWidget2.f4848M;
                char c11 = ((next == constraintAnchor5 && (constraintAnchor4 = constraintAnchor6.f4831f) != null && constraintAnchor4.f4828c) || (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor5.f4831f) != null && constraintAnchor3.f4828c)) ? (char) 1 : c10;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.f4857V[c10];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour2 || zM11489a) {
                    if (!constraintWidget2.m2705D()) {
                        if (next == constraintAnchor5 && constraintAnchor6.f4831f == null) {
                            int iM2690e = constraintAnchor5.m2690e() + iM2689d;
                            constraintWidget2.m2712M(iM2690e, constraintWidget2.m2735u() + iM2690e);
                            m11490b(i11, constraintWidget2, bVar, z10);
                        } else if (next == constraintAnchor6 && constraintAnchor5.f4831f == null) {
                            int iM2690e2 = iM2689d - constraintAnchor6.m2690e();
                            constraintWidget2.m2712M(iM2690e2 - constraintWidget2.m2735u(), iM2690e2);
                            m11490b(i11, constraintWidget2, bVar, z10);
                        } else if (c11 != 0 && !constraintWidget2.m2703B()) {
                            m11491c(i11, constraintWidget2, bVar, z10);
                        }
                    }
                } else if (dimensionBehaviour == dimensionBehaviour2 && constraintWidget2.f4906w >= 0 && constraintWidget2.f4904v >= 0 && ((constraintWidget2.f4881j0 == 8 || (constraintWidget2.f4898s == 0 && constraintWidget2.f4861Z == 0.0f)) && !constraintWidget2.m2703B() && !constraintWidget2.f4843H && c11 != 0 && !constraintWidget2.m2703B())) {
                    m11492d(i11, constraintWidget, bVar, constraintWidget2, z10);
                }
                c10 = 0;
            }
        }
        if (constraintWidget instanceof C0740f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorMo2729m2.f4826a;
        if (hashSet2 != null && constraintAnchorMo2729m2.f4828c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f4829d;
                int i12 = i10 + 1;
                boolean zM11489a2 = m11489a(constraintWidget3);
                if (constraintWidget3.m2705D() && zM11489a2) {
                    C0738d.m2763Y(constraintWidget3, bVar, new C5354b.a());
                }
                ConstraintAnchor constraintAnchor7 = constraintWidget3.f4846K;
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f4848M;
                boolean z11 = (next2 == constraintAnchor7 && (constraintAnchor2 = constraintAnchor8.f4831f) != null && constraintAnchor2.f4828c) || (next2 == constraintAnchor8 && (constraintAnchor = constraintAnchor7.f4831f) != null && constraintAnchor.f4828c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.f4857V[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || zM11489a2) {
                    if (!constraintWidget3.m2705D()) {
                        if (next2 == constraintAnchor7 && constraintAnchor8.f4831f == null) {
                            int iM2690e3 = constraintAnchor7.m2690e() + iM2689d2;
                            constraintWidget3.m2712M(iM2690e3, constraintWidget3.m2735u() + iM2690e3);
                            m11490b(i12, constraintWidget3, bVar, z10);
                        } else if (next2 == constraintAnchor8 && constraintAnchor7.f4831f == null) {
                            int iM2690e4 = iM2689d2 - constraintAnchor8.m2690e();
                            constraintWidget3.m2712M(iM2690e4 - constraintWidget3.m2735u(), iM2690e4);
                            m11490b(i12, constraintWidget3, bVar, z10);
                        } else if (z11 && !constraintWidget3.m2703B()) {
                            m11491c(i12, constraintWidget3, bVar, z10);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget3.f4906w >= 0 && constraintWidget3.f4904v >= 0) {
                    if (constraintWidget3.f4881j0 != 8) {
                        if (constraintWidget3.f4898s == 0) {
                            if (constraintWidget3.f4861Z == 0.0f) {
                            }
                        }
                    }
                    if (!constraintWidget3.m2703B() && !constraintWidget3.f4843H && z11 && !constraintWidget3.m2703B()) {
                        m11492d(i12, constraintWidget, bVar, constraintWidget3, z10);
                    }
                }
            }
        }
        constraintWidget.f4888n = true;
    }

    /* JADX INFO: renamed from: c */
    public static void m11491c(int i10, ConstraintWidget constraintWidget, C5354b.b bVar, boolean z10) {
        float f3 = constraintWidget.f4875g0;
        ConstraintAnchor constraintAnchor = constraintWidget.f4846K;
        int iM2689d = constraintAnchor.f4831f.m2689d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.f4848M;
        int iM2689d2 = constraintAnchor2.f4831f.m2689d();
        int iM2690e = constraintAnchor.m2690e() + iM2689d;
        int iM2690e2 = iM2689d2 - constraintAnchor2.m2690e();
        if (iM2689d == iM2689d2) {
            f3 = 0.5f;
        } else {
            iM2689d = iM2690e;
            iM2689d2 = iM2690e2;
        }
        int iM2735u = constraintWidget.m2735u();
        int i11 = (iM2689d2 - iM2689d) - iM2735u;
        if (iM2689d > iM2689d2) {
            i11 = (iM2689d - iM2689d2) - iM2735u;
        }
        int i12 = ((int) (i11 > 0 ? (f3 * i11) + 0.5f : f3 * i11)) + iM2689d;
        int i13 = i12 + iM2735u;
        if (iM2689d > iM2689d2) {
            i13 = i12 - iM2735u;
        }
        constraintWidget.m2712M(i12, i13);
        m11490b(i10 + 1, constraintWidget, bVar, z10);
    }

    /* JADX INFO: renamed from: d */
    public static void m11492d(int i10, ConstraintWidget constraintWidget, C5354b.b bVar, ConstraintWidget constraintWidget2, boolean z10) {
        float f3 = constraintWidget2.f4875g0;
        ConstraintAnchor constraintAnchor = constraintWidget2.f4846K;
        int iM2690e = constraintAnchor.m2690e() + constraintAnchor.f4831f.m2689d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.f4848M;
        int iM2689d = constraintAnchor2.f4831f.m2689d() - constraintAnchor2.m2690e();
        if (iM2689d >= iM2690e) {
            int iM2735u = constraintWidget2.m2735u();
            if (constraintWidget2.f4881j0 != 8) {
                int i11 = constraintWidget2.f4898s;
                if (i11 == 2) {
                    iM2735u = (int) (constraintWidget2.f4875g0 * 0.5f * (constraintWidget instanceof C0738d ? constraintWidget.m2735u() : constraintWidget.f4858W.m2735u()));
                } else if (i11 == 0) {
                    iM2735u = iM2689d - iM2690e;
                }
                iM2735u = Math.max(constraintWidget2.f4904v, iM2735u);
                int i12 = constraintWidget2.f4906w;
                if (i12 > 0) {
                    iM2735u = Math.min(i12, iM2735u);
                }
            }
            int i13 = iM2690e + ((int) ((f3 * ((iM2689d - iM2690e) - iM2735u)) + 0.5f));
            constraintWidget2.m2712M(i13, iM2735u + i13);
            m11490b(i10 + 1, constraintWidget2, bVar, z10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m11493e(int i10, ConstraintWidget constraintWidget, C5354b.b bVar) {
        float f3 = constraintWidget.f4877h0;
        ConstraintAnchor constraintAnchor = constraintWidget.f4847L;
        int iM2689d = constraintAnchor.f4831f.m2689d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.f4849N;
        int iM2689d2 = constraintAnchor2.f4831f.m2689d();
        int iM2690e = constraintAnchor.m2690e() + iM2689d;
        int iM2690e2 = iM2689d2 - constraintAnchor2.m2690e();
        if (iM2689d == iM2689d2) {
            f3 = 0.5f;
        } else {
            iM2689d = iM2690e;
            iM2689d2 = iM2690e2;
        }
        int iM2731o = constraintWidget.m2731o();
        int i11 = (iM2689d2 - iM2689d) - iM2731o;
        if (iM2689d > iM2689d2) {
            i11 = (iM2689d - iM2689d2) - iM2731o;
        }
        int i12 = (int) (i11 > 0 ? (f3 * i11) + 0.5f : f3 * i11);
        int i13 = iM2689d + i12;
        int i14 = i13 + iM2731o;
        if (iM2689d > iM2689d2) {
            i13 = iM2689d - i12;
            i14 = i13 - iM2731o;
        }
        constraintWidget.m2713N(i13, i14);
        m11495g(i10 + 1, constraintWidget, bVar);
    }

    /* JADX INFO: renamed from: f */
    public static void m11494f(int i10, ConstraintWidget constraintWidget, C5354b.b bVar, ConstraintWidget constraintWidget2) {
        float f3 = constraintWidget2.f4877h0;
        ConstraintAnchor constraintAnchor = constraintWidget2.f4847L;
        int iM2690e = constraintAnchor.m2690e() + constraintAnchor.f4831f.m2689d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.f4849N;
        int iM2689d = constraintAnchor2.f4831f.m2689d() - constraintAnchor2.m2690e();
        if (iM2689d >= iM2690e) {
            int iM2731o = constraintWidget2.m2731o();
            if (constraintWidget2.f4881j0 != 8) {
                int i11 = constraintWidget2.f4900t;
                if (i11 == 2) {
                    iM2731o = (int) (f3 * 0.5f * (constraintWidget instanceof C0738d ? constraintWidget.m2731o() : constraintWidget.f4858W.m2731o()));
                } else if (i11 == 0) {
                    iM2731o = iM2689d - iM2690e;
                }
                iM2731o = Math.max(constraintWidget2.f4908y, iM2731o);
                int i12 = constraintWidget2.f4909z;
                if (i12 > 0) {
                    iM2731o = Math.min(i12, iM2731o);
                }
            }
            int i13 = iM2690e + ((int) ((f3 * ((iM2689d - iM2690e) - iM2731o)) + 0.5f));
            constraintWidget2.m2713N(i13, iM2731o + i13);
            m11495g(i10 + 1, constraintWidget2, bVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m11495g(int i10, ConstraintWidget constraintWidget, C5354b.b bVar) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        if (constraintWidget.f4890o) {
            return;
        }
        if (!(constraintWidget instanceof C0738d) && constraintWidget.m2705D() && m11489a(constraintWidget)) {
            C0738d.m2763Y(constraintWidget, bVar, new C5354b.a());
        }
        ConstraintAnchor constraintAnchorMo2729m = constraintWidget.mo2729m(ConstraintAnchor.Type.TOP);
        ConstraintAnchor constraintAnchorMo2729m2 = constraintWidget.mo2729m(ConstraintAnchor.Type.BOTTOM);
        int iM2689d = constraintAnchorMo2729m.m2689d();
        int iM2689d2 = constraintAnchorMo2729m2.m2689d();
        HashSet<ConstraintAnchor> hashSet = constraintAnchorMo2729m.f4826a;
        char c10 = 1;
        if (hashSet != null && constraintAnchorMo2729m.f4828c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f4829d;
                int i11 = i10 + 1;
                boolean zM11489a = m11489a(constraintWidget2);
                if (constraintWidget2.m2705D() && zM11489a) {
                    C0738d.m2763Y(constraintWidget2, bVar, new C5354b.a());
                }
                ConstraintAnchor constraintAnchor6 = constraintWidget2.f4847L;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.f4849N;
                char c11 = ((next == constraintAnchor6 && (constraintAnchor5 = constraintAnchor7.f4831f) != null && constraintAnchor5.f4828c) || (next == constraintAnchor7 && (constraintAnchor4 = constraintAnchor6.f4831f) != null && constraintAnchor4.f4828c)) ? c10 : (char) 0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.f4857V[c10];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour2 || zM11489a) {
                    if (!constraintWidget2.m2705D()) {
                        if (next == constraintAnchor6 && constraintAnchor7.f4831f == null) {
                            int iM2690e = constraintAnchor6.m2690e() + iM2689d;
                            constraintWidget2.m2713N(iM2690e, constraintWidget2.m2731o() + iM2690e);
                            m11495g(i11, constraintWidget2, bVar);
                        } else if (next == constraintAnchor7 && constraintAnchor6.f4831f == null) {
                            int iM2690e2 = iM2689d - constraintAnchor7.m2690e();
                            constraintWidget2.m2713N(iM2690e2 - constraintWidget2.m2731o(), iM2690e2);
                            m11495g(i11, constraintWidget2, bVar);
                        } else if (c11 != 0 && !constraintWidget2.m2704C()) {
                            m11493e(i11, constraintWidget2, bVar);
                        }
                    }
                } else if (dimensionBehaviour == dimensionBehaviour2 && constraintWidget2.f4909z >= 0 && constraintWidget2.f4908y >= 0 && ((constraintWidget2.f4881j0 == 8 || (constraintWidget2.f4900t == 0 && constraintWidget2.f4861Z == 0.0f)) && !constraintWidget2.m2704C() && !constraintWidget2.f4843H && c11 != 0 && !constraintWidget2.m2704C())) {
                    m11494f(i11, constraintWidget, bVar, constraintWidget2);
                }
                c10 = 1;
            }
        }
        if (constraintWidget instanceof C0740f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorMo2729m2.f4826a;
        if (hashSet2 != null && constraintAnchorMo2729m2.f4828c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f4829d;
                int i12 = i10 + 1;
                boolean zM11489a2 = m11489a(constraintWidget3);
                if (constraintWidget3.m2705D() && zM11489a2) {
                    C0738d.m2763Y(constraintWidget3, bVar, new C5354b.a());
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f4847L;
                ConstraintAnchor constraintAnchor9 = constraintWidget3.f4849N;
                boolean z10 = (next2 == constraintAnchor8 && (constraintAnchor3 = constraintAnchor9.f4831f) != null && constraintAnchor3.f4828c) || (next2 == constraintAnchor9 && (constraintAnchor2 = constraintAnchor8.f4831f) != null && constraintAnchor2.f4828c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.f4857V[1];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || zM11489a2) {
                    if (!constraintWidget3.m2705D()) {
                        if (next2 == constraintAnchor8 && constraintAnchor9.f4831f == null) {
                            int iM2690e3 = constraintAnchor8.m2690e() + iM2689d2;
                            constraintWidget3.m2713N(iM2690e3, constraintWidget3.m2731o() + iM2690e3);
                            m11495g(i12, constraintWidget3, bVar);
                        } else if (next2 == constraintAnchor9 && constraintAnchor8.f4831f == null) {
                            int iM2690e4 = iM2689d2 - constraintAnchor9.m2690e();
                            constraintWidget3.m2713N(iM2690e4 - constraintWidget3.m2731o(), iM2690e4);
                            m11495g(i12, constraintWidget3, bVar);
                        } else if (z10 && !constraintWidget3.m2704C()) {
                            m11493e(i12, constraintWidget3, bVar);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget3.f4909z >= 0 && constraintWidget3.f4908y >= 0) {
                    if (constraintWidget3.f4881j0 != 8) {
                        if (constraintWidget3.f4900t == 0) {
                            if (constraintWidget3.f4861Z == 0.0f) {
                            }
                        }
                    }
                    if (!constraintWidget3.m2704C() && !constraintWidget3.f4843H && z10 && !constraintWidget3.m2704C()) {
                        m11494f(i12, constraintWidget, bVar, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorMo2729m3 = constraintWidget.mo2729m(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorMo2729m3.f4826a != null && constraintAnchorMo2729m3.f4828c) {
            int iM2689d3 = constraintAnchorMo2729m3.m2689d();
            for (ConstraintAnchor constraintAnchor10 : constraintAnchorMo2729m3.f4826a) {
                ConstraintWidget constraintWidget4 = constraintAnchor10.f4829d;
                int i13 = i10 + 1;
                boolean zM11489a3 = m11489a(constraintWidget4);
                if (constraintWidget4.m2705D() && zM11489a3) {
                    C0738d.m2763Y(constraintWidget4, bVar, new C5354b.a());
                }
                if (constraintWidget4.f4857V[1] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || zM11489a3) {
                    if (!constraintWidget4.m2705D() && constraintAnchor10 == (constraintAnchor = constraintWidget4.f4850O)) {
                        int iM2690e5 = constraintAnchor10.m2690e() + iM2689d3;
                        if (constraintWidget4.f4841F) {
                            int i14 = iM2690e5 - constraintWidget4.f4869d0;
                            int i15 = constraintWidget4.f4860Y + i14;
                            constraintWidget4.f4867c0 = i14;
                            constraintWidget4.f4847L.m2697l(i14);
                            constraintWidget4.f4849N.m2697l(i15);
                            constraintAnchor.m2697l(iM2690e5);
                            constraintWidget4.f4886m = true;
                        }
                        m11495g(i13, constraintWidget4, bVar);
                    }
                }
            }
        }
        constraintWidget.f4890o = true;
    }
}
