package p000;

import java.util.HashSet;

/* JADX INFO: renamed from: zb */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1167zb {

    /* JADX INFO: renamed from: a */
    public static final C1160yv f48326a = new C1160yv();

    /* JADX INFO: renamed from: b */
    public static int f48327b = 0;

    /* JADX INFO: renamed from: c */
    public static int f48328c = 0;

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:43:0x006d  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX INFO: renamed from: a */
    public static boolean m19763a(C1152yn c1152yn) {
        boolean z;
        boolean z2;
        int iM19680O = c1152yn.m19680O();
        int iM19681P = c1152yn.m19681P();
        C1152yn c1152yn2 = c1152yn.f48206V;
        if (c1152yn2 == null) {
            c1152yn2 = null;
        }
        if (c1152yn2 != null) {
            c1152yn2.m19680O();
        }
        if (c1152yn2 != null) {
            c1152yn2.m19681P();
        }
        if (iM19680O == 1 || c1152yn.mo19648e() || iM19680O == 2) {
            z = true;
        } else {
            if (iM19680O == 3) {
                if (c1152yn.f48246t == 0 && c1152yn.f48209Y == 0.0f && c1152yn.m19674I(0)) {
                    z = true;
                }
            } else if (iM19680O != 3) {
                z = false;
            }
            if (c1152yn.f48246t == 1 && c1152yn.m19675J(0, c1152yn.m19689j())) {
                z = true;
            } else {
                z = false;
            }
        }
        if (iM19681P == 1 || c1152yn.mo19649f() || iM19681P == 2) {
            z2 = true;
        } else {
            if (iM19681P == 3) {
                if (c1152yn.f48247u == 0 && c1152yn.f48209Y == 0.0f && c1152yn.m19674I(1)) {
                    z2 = true;
                }
            } else if (iM19681P != 3) {
                z2 = false;
            }
            if (c1152yn.f48247u == 1 && c1152yn.m19675J(1, c1152yn.m19687h())) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (c1152yn.f48209Y > 0.0f) {
            if (z || z2) {
                return true;
            }
            z = false;
            z2 = false;
        }
        return z && z2;
    }

    /* JADX INFO: renamed from: b */
    public static void m19764b(int i, C1152yn c1152yn, C1179zn c1179zn, boolean z) {
        C1151ym c1151ym;
        C1151ym c1151ym2;
        C1151ym c1151ym3;
        C1151ym c1151ym4;
        if (c1152yn.f48241o) {
            return;
        }
        f48327b++;
        if (!(c1152yn instanceof C1153yo) && c1152yn.m19678M() && m19763a(c1152yn)) {
            C1153yo.m19706Z(c1152yn, c1179zn, new C1160yv());
        }
        C1151ym c1151ymMo19692m = c1152yn.mo19692m(EnumC1150yl.LEFT);
        C1151ym c1151ymMo19692m2 = c1152yn.mo19692m(EnumC1150yl.RIGHT);
        int iM19650a = c1151ymMo19692m.m19650a();
        int iM19650a2 = c1151ymMo19692m2.m19650a();
        HashSet<C1151ym> hashSet = c1151ymMo19692m.f48176a;
        if (hashSet != null && c1151ymMo19692m.f48178c) {
            for (C1151ym c1151ym5 : hashSet) {
                C1152yn c1152yn2 = c1151ym5.f48179d;
                int i2 = i + 1;
                boolean zM19763a = m19763a(c1152yn2);
                if (c1152yn2.m19678M() && zM19763a) {
                    C1153yo.m19706Z(c1152yn2, c1179zn, new C1160yv());
                }
                C1151ym c1151ym6 = c1152yn2.f48195K;
                boolean z2 = (c1151ym5 == c1151ym6 && (c1151ym4 = c1152yn2.f48197M.f48181f) != null && c1151ym4.f48178c) ? true : c1151ym5 == c1152yn2.f48197M && (c1151ym3 = c1151ym6.f48181f) != null && c1151ym3.f48178c;
                if (c1152yn2.m19680O() != 3 || zM19763a) {
                    if (!c1152yn2.m19678M()) {
                        C1151ym c1151ym7 = c1152yn2.f48195K;
                        if (c1151ym5 == c1151ym7 && c1152yn2.f48197M.f48181f == null) {
                            int iM19651b = c1151ym7.m19651b() + iM19650a;
                            c1152yn2.m19704y(iM19651b, c1152yn2.m19689j() + iM19651b);
                            m19764b(i2, c1152yn2, c1179zn, z);
                        } else {
                            C1151ym c1151ym8 = c1152yn2.f48197M;
                            if (c1151ym5 == c1151ym8 && c1151ym7.f48181f == null) {
                                int iM19651b2 = iM19650a - c1151ym8.m19651b();
                                c1152yn2.m19704y(iM19651b2 - c1152yn2.m19689j(), iM19651b2);
                                m19764b(i2, c1152yn2, c1179zn, z);
                            } else if (z2) {
                                if (!c1152yn2.m19676K()) {
                                    m19767e(i2, c1179zn, c1152yn2, z);
                                }
                            }
                        }
                    }
                } else if (c1152yn2.m19680O() == 3 && c1152yn2.f48250x >= 0 && c1152yn2.f48249w >= 0 && (c1152yn2.f48220ai == 8 || (c1152yn2.f48246t == 0 && c1152yn2.f48209Y == 0.0f))) {
                    if (!c1152yn2.m19676K() && z2) {
                        if (!c1152yn2.m19676K()) {
                            m19768f(i2, c1152yn, c1179zn, c1152yn2, z);
                        }
                    }
                }
            }
        }
        if (c1152yn instanceof C1155yq) {
            return;
        }
        HashSet<C1151ym> hashSet2 = c1151ymMo19692m2.f48176a;
        if (hashSet2 != null && c1151ymMo19692m2.f48178c) {
            for (C1151ym c1151ym9 : hashSet2) {
                C1152yn c1152yn3 = c1151ym9.f48179d;
                int i3 = i + 1;
                boolean zM19763a2 = m19763a(c1152yn3);
                if (c1152yn3.m19678M() && zM19763a2) {
                    C1153yo.m19706Z(c1152yn3, c1179zn, new C1160yv());
                }
                C1151ym c1151ym10 = c1152yn3.f48195K;
                boolean z3 = (c1151ym9 == c1151ym10 && (c1151ym2 = c1152yn3.f48197M.f48181f) != null && c1151ym2.f48178c) ? true : c1151ym9 == c1152yn3.f48197M && (c1151ym = c1151ym10.f48181f) != null && c1151ym.f48178c;
                if (c1152yn3.m19680O() != 3 || zM19763a2) {
                    if (!c1152yn3.m19678M()) {
                        C1151ym c1151ym11 = c1152yn3.f48195K;
                        if (c1151ym9 == c1151ym11 && c1152yn3.f48197M.f48181f == null) {
                            int iM19651b3 = c1151ym11.m19651b() + iM19650a2;
                            c1152yn3.m19704y(iM19651b3, c1152yn3.m19689j() + iM19651b3);
                            m19764b(i3, c1152yn3, c1179zn, z);
                        } else {
                            C1151ym c1151ym12 = c1152yn3.f48197M;
                            if (c1151ym9 == c1151ym12 && c1151ym11.f48181f == null) {
                                int iM19651b4 = iM19650a2 - c1151ym12.m19651b();
                                c1152yn3.m19704y(iM19651b4 - c1152yn3.m19689j(), iM19651b4);
                                m19764b(i3, c1152yn3, c1179zn, z);
                            } else if (z3 && !c1152yn3.m19676K()) {
                                m19767e(i3, c1179zn, c1152yn3, z);
                            }
                        }
                    }
                } else if (c1152yn3.m19680O() == 3 && c1152yn3.f48250x >= 0 && c1152yn3.f48249w >= 0 && (c1152yn3.f48220ai == 8 || (c1152yn3.f48246t == 0 && c1152yn3.f48209Y == 0.0f))) {
                    if (!c1152yn3.m19676K() && z3 && !c1152yn3.m19676K()) {
                        m19768f(i3, c1152yn, c1179zn, c1152yn3, z);
                    }
                }
            }
        }
        c1152yn.f48241o = true;
    }

    /* JADX INFO: renamed from: c */
    public static void m19765c(int i, C1152yn c1152yn, C1179zn c1179zn) {
        C1151ym c1151ym;
        C1151ym c1151ym2;
        C1151ym c1151ym3;
        C1151ym c1151ym4;
        if (c1152yn.f48242p) {
            return;
        }
        f48328c++;
        if (!(c1152yn instanceof C1153yo) && c1152yn.m19678M() && m19763a(c1152yn)) {
            C1153yo.m19706Z(c1152yn, c1179zn, new C1160yv());
        }
        C1151ym c1151ymMo19692m = c1152yn.mo19692m(EnumC1150yl.TOP);
        C1151ym c1151ymMo19692m2 = c1152yn.mo19692m(EnumC1150yl.BOTTOM);
        int iM19650a = c1151ymMo19692m.m19650a();
        int iM19650a2 = c1151ymMo19692m2.m19650a();
        HashSet<C1151ym> hashSet = c1151ymMo19692m.f48176a;
        if (hashSet != null && c1151ymMo19692m.f48178c) {
            for (C1151ym c1151ym5 : hashSet) {
                C1152yn c1152yn2 = c1151ym5.f48179d;
                int i2 = i + 1;
                boolean zM19763a = m19763a(c1152yn2);
                if (c1152yn2.m19678M() && zM19763a) {
                    C1153yo.m19706Z(c1152yn2, c1179zn, new C1160yv());
                }
                C1151ym c1151ym6 = c1152yn2.f48196L;
                boolean z = (c1151ym5 == c1151ym6 && (c1151ym4 = c1152yn2.f48198N.f48181f) != null && c1151ym4.f48178c) ? true : c1151ym5 == c1152yn2.f48198N && (c1151ym3 = c1151ym6.f48181f) != null && c1151ym3.f48178c;
                if (c1152yn2.m19681P() != 3 || zM19763a) {
                    if (!c1152yn2.m19678M()) {
                        C1151ym c1151ym7 = c1152yn2.f48196L;
                        if (c1151ym5 == c1151ym7 && c1152yn2.f48198N.f48181f == null) {
                            int iM19651b = c1151ym7.m19651b() + iM19650a;
                            c1152yn2.m19705z(iM19651b, c1152yn2.m19687h() + iM19651b);
                            m19765c(i2, c1152yn2, c1179zn);
                        } else {
                            C1151ym c1151ym8 = c1152yn2.f48198N;
                            if (c1151ym5 == c1151ym8 && c1151ym7.f48181f == null) {
                                int iM19651b2 = iM19650a - c1151ym8.m19651b();
                                c1152yn2.m19705z(iM19651b2 - c1152yn2.m19687h(), iM19651b2);
                                m19765c(i2, c1152yn2, c1179zn);
                            } else if (z && !c1152yn2.m19677L()) {
                                m19769g(i2, c1179zn, c1152yn2);
                            }
                        }
                    }
                } else if (c1152yn2.m19681P() == 3 && c1152yn2.f48185A >= 0 && c1152yn2.f48252z >= 0 && (c1152yn2.f48220ai == 8 || (c1152yn2.f48247u == 0 && c1152yn2.f48209Y == 0.0f))) {
                    if (!c1152yn2.m19677L() && z && !c1152yn2.m19677L()) {
                        m19770h(i2, c1152yn, c1179zn, c1152yn2);
                    }
                }
            }
        }
        if (c1152yn instanceof C1155yq) {
            return;
        }
        HashSet<C1151ym> hashSet2 = c1151ymMo19692m2.f48176a;
        if (hashSet2 != null && c1151ymMo19692m2.f48178c) {
            for (C1151ym c1151ym9 : hashSet2) {
                C1152yn c1152yn3 = c1151ym9.f48179d;
                int i3 = i + 1;
                boolean zM19763a2 = m19763a(c1152yn3);
                if (c1152yn3.m19678M() && zM19763a2) {
                    C1153yo.m19706Z(c1152yn3, c1179zn, new C1160yv());
                }
                C1151ym c1151ym10 = c1152yn3.f48196L;
                boolean z2 = (c1151ym9 == c1151ym10 && (c1151ym2 = c1152yn3.f48198N.f48181f) != null && c1151ym2.f48178c) ? true : c1151ym9 == c1152yn3.f48198N && (c1151ym = c1151ym10.f48181f) != null && c1151ym.f48178c;
                if (c1152yn3.m19681P() != 3 || zM19763a2) {
                    if (!c1152yn3.m19678M()) {
                        C1151ym c1151ym11 = c1152yn3.f48196L;
                        if (c1151ym9 == c1151ym11 && c1152yn3.f48198N.f48181f == null) {
                            int iM19651b3 = c1151ym11.m19651b() + iM19650a2;
                            c1152yn3.m19705z(iM19651b3, c1152yn3.m19687h() + iM19651b3);
                            m19765c(i3, c1152yn3, c1179zn);
                        } else {
                            C1151ym c1151ym12 = c1152yn3.f48198N;
                            if (c1151ym9 == c1151ym12 && c1151ym11.f48181f == null) {
                                int iM19651b4 = iM19650a2 - c1151ym12.m19651b();
                                c1152yn3.m19705z(iM19651b4 - c1152yn3.m19687h(), iM19651b4);
                                m19765c(i3, c1152yn3, c1179zn);
                            } else if (z2 && !c1152yn3.m19677L()) {
                                m19769g(i3, c1179zn, c1152yn3);
                            }
                        }
                    }
                } else if (c1152yn3.m19681P() == 3 && c1152yn3.f48185A >= 0 && c1152yn3.f48252z >= 0 && (c1152yn3.f48220ai == 8 || (c1152yn3.f48247u == 0 && c1152yn3.f48209Y == 0.0f))) {
                    if (!c1152yn3.m19677L() && z2 && !c1152yn3.m19677L()) {
                        m19770h(i3, c1152yn, c1179zn, c1152yn3);
                    }
                }
            }
        }
        C1151ym c1151ymMo19692m3 = c1152yn.mo19692m(EnumC1150yl.BASELINE);
        if (c1151ymMo19692m3.f48176a != null && c1151ymMo19692m3.f48178c) {
            int iM19650a3 = c1151ymMo19692m3.m19650a();
            for (C1151ym c1151ym13 : c1151ymMo19692m3.f48176a) {
                C1152yn c1152yn4 = c1151ym13.f48179d;
                int i4 = i + 1;
                boolean zM19763a3 = m19763a(c1152yn4);
                if (c1152yn4.m19678M() && zM19763a3) {
                    C1153yo.m19706Z(c1152yn4, c1179zn, new C1160yv());
                }
                if (c1152yn4.m19681P() != 3 || zM19763a3) {
                    if (!c1152yn4.m19678M() && c1151ym13 == c1152yn4.f48199O) {
                        int iM19651b5 = c1151ym13.m19651b() + iM19650a3;
                        if (c1152yn4.f48191G) {
                            int i5 = iM19651b5 - c1152yn4.f48214ac;
                            int i6 = c1152yn4.f48208X + i5;
                            c1152yn4.f48213ab = i5;
                            c1152yn4.f48196L.m19654e(i5);
                            c1152yn4.f48198N.m19654e(i6);
                            c1152yn4.f48199O.m19654e(iM19651b5);
                            c1152yn4.f48240n = true;
                        }
                        m19765c(i4, c1152yn4, c1179zn);
                    }
                }
            }
        }
        c1152yn.f48242p = true;
    }

    /* JADX INFO: renamed from: d */
    public static void m19766d(C1148yj c1148yj, C1179zn c1179zn, int i, boolean z) {
        if (c1148yj.m19646c()) {
            if (i == 0) {
                m19764b(1, c1148yj, c1179zn, z);
            } else {
                m19765c(1, c1148yj, c1179zn);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m19767e(int i, C1179zn c1179zn, C1152yn c1152yn, boolean z) {
        float f = c1152yn.f48217af;
        int iM19650a = c1152yn.f48195K.f48181f.m19650a();
        int iM19650a2 = c1152yn.f48197M.f48181f.m19650a();
        int iM19651b = c1152yn.f48195K.m19651b() + iM19650a;
        int iM19651b2 = iM19650a2 - c1152yn.f48197M.m19651b();
        if (iM19650a == iM19650a2) {
            iM19651b2 = iM19650a2;
        }
        if (iM19650a == iM19650a2) {
            iM19651b = iM19650a;
        }
        if (iM19650a == iM19650a2) {
            f = 0.5f;
        }
        int iM19689j = c1152yn.m19689j();
        int i2 = (iM19651b2 - iM19651b) - iM19689j;
        if (iM19651b > iM19651b2) {
            i2 = (iM19651b - iM19651b2) - iM19689j;
        }
        int i3 = (i2 > 0 ? (int) ((f * i2) + 0.5f) : (int) (f * i2)) + iM19651b;
        int i4 = i3 + iM19689j;
        if (iM19651b > iM19651b2) {
            i4 = i3 - iM19689j;
        }
        c1152yn.m19704y(i3, i4);
        m19764b(i + 1, c1152yn, c1179zn, z);
    }

    /* JADX INFO: renamed from: f */
    private static void m19768f(int i, C1152yn c1152yn, C1179zn c1179zn, C1152yn c1152yn2, boolean z) {
        float f = c1152yn2.f48217af;
        int iM19650a = c1152yn2.f48195K.f48181f.m19650a() + c1152yn2.f48195K.m19651b();
        int iM19650a2 = c1152yn2.f48197M.f48181f.m19650a() - c1152yn2.f48197M.m19651b();
        if (iM19650a2 >= iM19650a) {
            int iM19689j = c1152yn2.m19689j();
            if (c1152yn2.f48220ai != 8) {
                int i2 = c1152yn2.f48246t;
                if (i2 == 2) {
                    iM19689j = (int) (c1152yn2.f48217af * 0.5f * (c1152yn instanceof C1153yo ? c1152yn.m19689j() : c1152yn.f48206V.m19689j()));
                } else if (i2 == 0) {
                    iM19689j = iM19650a2 - iM19650a;
                }
                iM19689j = Math.max(c1152yn2.f48249w, iM19689j);
                int i3 = c1152yn2.f48250x;
                if (i3 > 0) {
                    iM19689j = Math.min(i3, iM19689j);
                }
            }
            int i4 = iM19650a + ((int) ((f * ((iM19650a2 - iM19650a) - iM19689j)) + 0.5f));
            c1152yn2.m19704y(i4, iM19689j + i4);
            m19764b(i + 1, c1152yn2, c1179zn, z);
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m19769g(int i, C1179zn c1179zn, C1152yn c1152yn) {
        float f = c1152yn.f48218ag;
        int iM19650a = c1152yn.f48196L.f48181f.m19650a();
        int iM19650a2 = c1152yn.f48198N.f48181f.m19650a();
        int iM19651b = c1152yn.f48196L.m19651b() + iM19650a;
        int iM19651b2 = iM19650a2 - c1152yn.f48198N.m19651b();
        if (iM19650a == iM19650a2) {
            iM19651b2 = iM19650a2;
        }
        if (iM19650a == iM19650a2) {
            iM19651b = iM19650a;
        }
        if (iM19650a == iM19650a2) {
            f = 0.5f;
        }
        int iM19687h = c1152yn.m19687h();
        int i2 = (iM19651b2 - iM19651b) - iM19687h;
        if (iM19651b > iM19651b2) {
            i2 = (iM19651b - iM19651b2) - iM19687h;
        }
        int i3 = i2 > 0 ? (int) ((f * i2) + 0.5f) : (int) (f * i2);
        int i4 = iM19651b + i3;
        int i5 = i4 + iM19687h;
        if (iM19651b > iM19651b2) {
            i4 = iM19651b - i3;
            i5 = i4 - iM19687h;
        }
        c1152yn.m19705z(i4, i5);
        m19765c(i + 1, c1152yn, c1179zn);
    }

    /* JADX INFO: renamed from: h */
    private static void m19770h(int i, C1152yn c1152yn, C1179zn c1179zn, C1152yn c1152yn2) {
        float f = c1152yn2.f48218ag;
        int iM19650a = c1152yn2.f48196L.f48181f.m19650a() + c1152yn2.f48196L.m19651b();
        int iM19650a2 = c1152yn2.f48198N.f48181f.m19650a() - c1152yn2.f48198N.m19651b();
        if (iM19650a2 >= iM19650a) {
            int iM19687h = c1152yn2.m19687h();
            if (c1152yn2.f48220ai != 8) {
                int i2 = c1152yn2.f48247u;
                if (i2 == 2) {
                    iM19687h = (int) (f * 0.5f * (c1152yn instanceof C1153yo ? c1152yn.m19687h() : c1152yn.f48206V.m19687h()));
                } else if (i2 == 0) {
                    iM19687h = iM19650a2 - iM19650a;
                }
                iM19687h = Math.max(c1152yn2.f48252z, iM19687h);
                int i3 = c1152yn2.f48185A;
                if (i3 > 0) {
                    iM19687h = Math.min(i3, iM19687h);
                }
            }
            int i4 = iM19650a + ((int) ((f * ((iM19650a2 - iM19650a) - iM19687h)) + 0.5f));
            c1152yn2.m19705z(i4, iM19687h + i4);
            m19765c(i + 1, c1152yn2, c1179zn);
        }
    }
}
