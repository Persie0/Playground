package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: yy */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1163yy {

    /* JADX INFO: renamed from: a */
    public final C1153yo f48297a;

    /* JADX INFO: renamed from: d */
    public final C1153yo f48300d;

    /* JADX INFO: renamed from: f */
    final ArrayList f48302f;

    /* JADX INFO: renamed from: g */
    public C1179zn f48303g;

    /* JADX INFO: renamed from: h */
    private final C1160yv f48304h;

    /* JADX INFO: renamed from: b */
    public boolean f48298b = true;

    /* JADX INFO: renamed from: c */
    public boolean f48299c = true;

    /* JADX INFO: renamed from: e */
    public final ArrayList f48301e = new ArrayList();

    public C1163yy(C1153yo c1153yo) {
        new ArrayList();
        this.f48303g = null;
        this.f48304h = new C1160yv();
        this.f48302f = new ArrayList();
        this.f48297a = c1153yo;
        this.f48300d = c1153yo;
    }

    /* JADX INFO: renamed from: e */
    private final void m19731e(AbstractC1174zi abstractC1174zi, int i, ArrayList arrayList) {
        for (InterfaceC1162yx interfaceC1162yx : abstractC1174zi.f48347i.f48314j) {
            if (interfaceC1162yx instanceof C1164yz) {
                m19733g((C1164yz) interfaceC1162yx, i, abstractC1174zi.f48348j, arrayList, null);
            } else if (interfaceC1162yx instanceof AbstractC1174zi) {
                m19733g(((AbstractC1174zi) interfaceC1162yx).f48347i, i, abstractC1174zi.f48348j, arrayList, null);
            }
        }
        for (InterfaceC1162yx interfaceC1162yx2 : abstractC1174zi.f48348j.f48314j) {
            if (interfaceC1162yx2 instanceof C1164yz) {
                m19733g((C1164yz) interfaceC1162yx2, i, abstractC1174zi.f48347i, arrayList, null);
            } else if (interfaceC1162yx2 instanceof AbstractC1174zi) {
                m19733g(((AbstractC1174zi) interfaceC1162yx2).f48348j, i, abstractC1174zi.f48347i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC1162yx interfaceC1162yx3 : ((C1172zg) abstractC1174zi).f48333a.f48314j) {
                if (interfaceC1162yx3 instanceof C1164yz) {
                    m19733g((C1164yz) interfaceC1162yx3, 1, null, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m19732f(C1152yn c1152yn, int i, int i2, int i3, int i4) {
        C1160yv c1160yv = this.f48304h;
        c1160yv.f48293i = i;
        c1160yv.f48294j = i3;
        c1160yv.f48285a = i2;
        c1160yv.f48286b = i4;
        this.f48303g.m19799a(c1152yn, c1160yv);
        c1152yn.m19671F(this.f48304h.f48287c);
        c1152yn.m19666A(this.f48304h.f48288d);
        C1160yv c1160yv2 = this.f48304h;
        c1152yn.f48191G = c1160yv2.f48290f;
        c1152yn.m19703x(c1160yv2.f48289e);
    }

    /* JADX INFO: renamed from: g */
    private final void m19733g(C1164yz c1164yz, int i, C1164yz c1164yz2, ArrayList arrayList, C1171zf c1171zf) {
        AbstractC1174zi abstractC1174zi = c1164yz.f48308d;
        if (abstractC1174zi.f48343e == null) {
            C1153yo c1153yo = this.f48297a;
            if (abstractC1174zi == c1153yo.f48234h || abstractC1174zi == c1153yo.f48235i) {
                return;
            }
            if (c1171zf == null) {
                c1171zf = new C1171zf(abstractC1174zi);
                arrayList.add(c1171zf);
            }
            abstractC1174zi.f48343e = c1171zf;
            c1171zf.f48332c.add(abstractC1174zi);
            for (InterfaceC1162yx interfaceC1162yx : abstractC1174zi.f48347i.f48314j) {
                if (interfaceC1162yx instanceof C1164yz) {
                    m19733g((C1164yz) interfaceC1162yx, i, c1164yz2, arrayList, c1171zf);
                }
            }
            for (InterfaceC1162yx interfaceC1162yx2 : abstractC1174zi.f48348j.f48314j) {
                if (interfaceC1162yx2 instanceof C1164yz) {
                    m19733g((C1164yz) interfaceC1162yx2, i, c1164yz2, arrayList, c1171zf);
                }
            }
            if (i == 1 && (abstractC1174zi instanceof C1172zg)) {
                for (InterfaceC1162yx interfaceC1162yx3 : ((C1172zg) abstractC1174zi).f48333a.f48314j) {
                    if (interfaceC1162yx3 instanceof C1164yz) {
                        m19733g((C1164yz) interfaceC1162yx3, 1, c1164yz2, arrayList, c1171zf);
                    }
                }
            }
            Iterator it = abstractC1174zi.f48347i.f48315k.iterator();
            while (it.hasNext()) {
                m19733g((C1164yz) it.next(), i, c1164yz2, arrayList, c1171zf);
            }
            Iterator it2 = abstractC1174zi.f48348j.f48315k.iterator();
            while (it2.hasNext()) {
                m19733g((C1164yz) it2.next(), i, c1164yz2, arrayList, c1171zf);
            }
            if (i == 1 && (abstractC1174zi instanceof C1172zg)) {
                Iterator it3 = ((C1172zg) abstractC1174zi).f48333a.f48315k.iterator();
                while (it3.hasNext()) {
                    m19733g((C1164yz) it3.next(), 1, c1164yz2, arrayList, c1171zf);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX INFO: renamed from: a */
    public final int m19734a(C1153yo c1153yo, int i) {
        long jMo19725a;
        C1164yz c1164yz;
        C1164yz c1164yz2;
        boolean zContains;
        boolean zContains2;
        long jMo19725a2;
        C1163yy c1163yy = this;
        int size = c1163yy.f48302f.size();
        int i2 = 0;
        long j = 0;
        long jMax = 0;
        while (i2 < size) {
            C1171zf c1171zf = (C1171zf) c1163yy.f48302f.get(i2);
            AbstractC1174zi abstractC1174zi = c1171zf.f48331b;
            if (abstractC1174zi instanceof C1161yw) {
                if (((C1161yw) abstractC1174zi).f48345g != i) {
                    jMo19725a = j;
                } else {
                    if (i == 0) {
                        c1164yz = c1153yo.f48234h.f48347i;
                    } else {
                        c1164yz = c1153yo.f48235i.f48347i;
                    }
                    if (i == 0) {
                        c1164yz2 = c1153yo.f48234h.f48348j;
                    } else {
                        c1164yz2 = c1153yo.f48235i.f48348j;
                    }
                    zContains = abstractC1174zi.f48347i.f48315k.contains(c1164yz);
                    zContains2 = c1171zf.f48331b.f48348j.f48315k.contains(c1164yz2);
                    jMo19725a2 = c1171zf.f48331b.mo19725a();
                    if (!zContains && zContains2) {
                        long jM19776b = c1171zf.m19776b(c1171zf.f48331b.f48347i, j);
                        long jM19775a = c1171zf.m19775a(c1171zf.f48331b.f48348j, j);
                        long j2 = jM19776b - jMo19725a2;
                        AbstractC1174zi abstractC1174zi2 = c1171zf.f48331b;
                        int i3 = abstractC1174zi2.f48348j.f48309e;
                        if (j2 >= (-i3)) {
                            j2 += (long) i3;
                        }
                        long j3 = (-jM19775a) - jMo19725a2;
                        long j4 = abstractC1174zi2.f48347i.f48309e;
                        long j5 = j3 - j4;
                        if (j5 >= j4) {
                            j5 -= j4;
                        }
                        C1152yn c1152yn = abstractC1174zi2.f48342d;
                        float f = i == 0 ? c1152yn.f48217af : c1152yn.f48218ag;
                        float f2 = f > 0.0f ? (long) ((j5 / f) + (j2 / (1.0f - f))) : 0L;
                        jMo19725a = (j4 + ((((long) ((f2 * f) + 0.5f)) + jMo19725a2) + ((long) ((f2 * (1.0f - f)) + 0.5f)))) - ((long) i3);
                    } else if (zContains) {
                        C1164yz c1164yz3 = c1171zf.f48331b.f48347i;
                        jMo19725a = Math.max(c1171zf.m19776b(c1164yz3, c1164yz3.f48309e), ((long) c1171zf.f48331b.f48347i.f48309e) + jMo19725a2);
                    } else if (zContains2) {
                        C1164yz c1164yz4 = c1171zf.f48331b.f48348j;
                        jMo19725a = Math.max(-c1171zf.m19775a(c1164yz4, c1164yz4.f48309e), ((long) (-c1171zf.f48331b.f48348j.f48309e)) + jMo19725a2);
                    } else {
                        AbstractC1174zi abstractC1174zi3 = c1171zf.f48331b;
                        jMo19725a = (((long) abstractC1174zi3.f48347i.f48309e) + abstractC1174zi3.mo19725a()) - ((long) c1171zf.f48331b.f48348j.f48309e);
                    }
                }
            } else if (i == 0) {
                if (abstractC1174zi instanceof C1170ze) {
                    if (i == 0) {
                        c1164yz = c1153yo.f48234h.f48347i;
                    } else {
                        c1164yz = c1153yo.f48235i.f48347i;
                    }
                    if (i == 0) {
                        c1164yz2 = c1153yo.f48234h.f48348j;
                    } else {
                        c1164yz2 = c1153yo.f48235i.f48348j;
                    }
                    zContains = abstractC1174zi.f48347i.f48315k.contains(c1164yz);
                    zContains2 = c1171zf.f48331b.f48348j.f48315k.contains(c1164yz2);
                    jMo19725a2 = c1171zf.f48331b.mo19725a();
                    if (!zContains) {
                        if (zContains) {
                            C1164yz c1164yz5 = c1171zf.f48331b.f48347i;
                            jMo19725a = Math.max(c1171zf.m19776b(c1164yz5, c1164yz5.f48309e), ((long) c1171zf.f48331b.f48347i.f48309e) + jMo19725a2);
                        } else if (zContains2) {
                            C1164yz c1164yz6 = c1171zf.f48331b.f48348j;
                            jMo19725a = Math.max(-c1171zf.m19775a(c1164yz6, c1164yz6.f48309e), ((long) (-c1171zf.f48331b.f48348j.f48309e)) + jMo19725a2);
                        } else {
                            AbstractC1174zi abstractC1174zi4 = c1171zf.f48331b;
                            jMo19725a = (((long) abstractC1174zi4.f48347i.f48309e) + abstractC1174zi4.mo19725a()) - ((long) c1171zf.f48331b.f48348j.f48309e);
                        }
                    } else if (zContains) {
                        C1164yz c1164yz7 = c1171zf.f48331b.f48347i;
                        jMo19725a = Math.max(c1171zf.m19776b(c1164yz7, c1164yz7.f48309e), ((long) c1171zf.f48331b.f48347i.f48309e) + jMo19725a2);
                    } else if (zContains2) {
                        C1164yz c1164yz8 = c1171zf.f48331b.f48348j;
                        jMo19725a = Math.max(-c1171zf.m19775a(c1164yz8, c1164yz8.f48309e), ((long) (-c1171zf.f48331b.f48348j.f48309e)) + jMo19725a2);
                    } else {
                        AbstractC1174zi abstractC1174zi5 = c1171zf.f48331b;
                        jMo19725a = (((long) abstractC1174zi5.f48347i.f48309e) + abstractC1174zi5.mo19725a()) - ((long) c1171zf.f48331b.f48348j.f48309e);
                    }
                } else {
                    jMo19725a = j;
                }
            } else if (abstractC1174zi instanceof C1172zg) {
                if (i == 0) {
                    c1164yz = c1153yo.f48234h.f48347i;
                } else {
                    c1164yz = c1153yo.f48235i.f48347i;
                }
                if (i == 0) {
                    c1164yz2 = c1153yo.f48234h.f48348j;
                } else {
                    c1164yz2 = c1153yo.f48235i.f48348j;
                }
                zContains = abstractC1174zi.f48347i.f48315k.contains(c1164yz);
                zContains2 = c1171zf.f48331b.f48348j.f48315k.contains(c1164yz2);
                jMo19725a2 = c1171zf.f48331b.mo19725a();
                if (!zContains) {
                    if (zContains) {
                        C1164yz c1164yz9 = c1171zf.f48331b.f48347i;
                        jMo19725a = Math.max(c1171zf.m19776b(c1164yz9, c1164yz9.f48309e), ((long) c1171zf.f48331b.f48347i.f48309e) + jMo19725a2);
                    } else if (zContains2) {
                        C1164yz c1164yz10 = c1171zf.f48331b.f48348j;
                        jMo19725a = Math.max(-c1171zf.m19775a(c1164yz10, c1164yz10.f48309e), ((long) (-c1171zf.f48331b.f48348j.f48309e)) + jMo19725a2);
                    } else {
                        AbstractC1174zi abstractC1174zi6 = c1171zf.f48331b;
                        jMo19725a = (((long) abstractC1174zi6.f48347i.f48309e) + abstractC1174zi6.mo19725a()) - ((long) c1171zf.f48331b.f48348j.f48309e);
                    }
                } else if (zContains) {
                    C1164yz c1164yz11 = c1171zf.f48331b.f48347i;
                    jMo19725a = Math.max(c1171zf.m19776b(c1164yz11, c1164yz11.f48309e), ((long) c1171zf.f48331b.f48347i.f48309e) + jMo19725a2);
                } else if (zContains2) {
                    C1164yz c1164yz12 = c1171zf.f48331b.f48348j;
                    jMo19725a = Math.max(-c1171zf.m19775a(c1164yz12, c1164yz12.f48309e), ((long) (-c1171zf.f48331b.f48348j.f48309e)) + jMo19725a2);
                } else {
                    AbstractC1174zi abstractC1174zi7 = c1171zf.f48331b;
                    jMo19725a = (((long) abstractC1174zi7.f48347i.f48309e) + abstractC1174zi7.mo19725a()) - ((long) c1171zf.f48331b.f48348j.f48309e);
                }
            } else {
                jMo19725a = j;
            }
            jMax = Math.max(jMax, jMo19725a);
            i2++;
            c1163yy = this;
            j = 0;
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: b */
    public final void m19735b() {
        ArrayList arrayList = this.f48301e;
        arrayList.clear();
        this.f48300d.f48234h.mo19728d();
        this.f48300d.f48235i.mo19728d();
        arrayList.add(this.f48300d.f48234h);
        arrayList.add(this.f48300d.f48235i);
        ArrayList arrayList2 = this.f48300d.f48284aK;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            C1152yn c1152yn = (C1152yn) arrayList2.get(i);
            if (c1152yn instanceof C1155yq) {
                arrayList.add(new C1168zc(c1152yn));
            } else {
                if (c1152yn.m19676K()) {
                    if (c1152yn.f48232f == null) {
                        c1152yn.f48232f = new C1161yw(c1152yn, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1152yn.f48232f);
                } else {
                    arrayList.add(c1152yn.f48234h);
                }
                if (c1152yn.m19677L()) {
                    if (c1152yn.f48233g == null) {
                        c1152yn.f48233g = new C1161yw(c1152yn, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1152yn.f48233g);
                } else {
                    arrayList.add(c1152yn.f48235i);
                }
                if (c1152yn instanceof C1156yr) {
                    arrayList.add(new C1169zd(c1152yn));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((AbstractC1174zi) arrayList.get(i2)).mo19728d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            AbstractC1174zi abstractC1174zi = (AbstractC1174zi) arrayList.get(i3);
            if (abstractC1174zi.f48342d != this.f48300d) {
                abstractC1174zi.mo19726b();
            }
        }
        this.f48302f.clear();
        C1171zf.f48330a = 0;
        m19731e(this.f48297a.f48234h, 0, this.f48302f);
        m19731e(this.f48297a.f48235i, 1, this.f48302f);
        this.f48298b = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m19736c() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        C1166za c1166za;
        ArrayList arrayList = this.f48297a.f48284aK;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1152yn c1152yn = (C1152yn) arrayList.get(i3);
            if (!c1152yn.f48231e) {
                int[] iArr = c1152yn.f48229ar;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = c1152yn.f48246t;
                int i7 = c1152yn.f48247u;
                if (i4 == 2) {
                    i = i4;
                    z = true;
                } else if (i4 != 3) {
                    i = i4;
                    z = false;
                } else if (i6 == 1) {
                    z = true;
                    i = 3;
                } else {
                    z = false;
                    i = 3;
                }
                if (i5 == 2) {
                    i2 = i5;
                    z2 = true;
                } else if (i5 != 3) {
                    i2 = i5;
                    z2 = false;
                } else if (i7 == 1) {
                    z2 = true;
                    i2 = 3;
                } else {
                    z2 = false;
                    i2 = 3;
                }
                C1166za c1166za2 = c1152yn.f48234h.f48344f;
                boolean z3 = c1166za2.f48313i;
                C1166za c1166za3 = c1152yn.f48235i.f48344f;
                boolean z4 = c1166za3.f48313i;
                if (z3 && z4) {
                    m19732f(c1152yn, 1, c1166za2.f48310f, 1, c1166za3.f48310f);
                    c1152yn.f48231e = true;
                } else if (z3 && z2) {
                    m19732f(c1152yn, 1, c1166za2.f48310f, 2, c1166za3.f48310f);
                    if (i2 == 3) {
                        c1152yn.f48235i.f48344f.f48325m = c1152yn.m19687h();
                    } else {
                        c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                        c1152yn.f48231e = true;
                    }
                } else if (z4 && z) {
                    m19732f(c1152yn, 2, c1166za2.f48310f, 1, c1166za3.f48310f);
                    if (i == 3) {
                        c1152yn.f48234h.f48344f.f48325m = c1152yn.m19689j();
                    } else {
                        c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                        c1152yn.f48231e = true;
                    }
                }
                if (c1152yn.f48231e && (c1166za = c1152yn.f48235i.f48334b) != null) {
                    c1166za.mo19740c(c1152yn.f48214ac);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:104:0x022d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0236  */
    /* JADX WARN: Code duplicated, block: B:109:0x0261  */
    /* JADX WARN: Code duplicated, block: B:111:0x0264 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:135:0x030a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4 A[PHI: r7
      0x00b4: PHI (r7v10 int) = (r7v3 int), (r7v2 int) binds: [B:59:0x00af, B:55:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0184  */
    /* JADX WARN: Code duplicated, block: B:84:0x0187 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x018d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x018f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0192  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f1  */
    /* JADX INFO: renamed from: d */
    public final void m19737d(C1153yo c1153yo) {
        int iM19689j;
        int i;
        int iM19687h;
        int iM19687h2;
        int i2;
        int i3;
        C1151ym[] c1151ymArr;
        int i4;
        float f;
        ArrayList arrayList = c1153yo.f48284aK;
        int size = arrayList.size();
        char c = 0;
        int i5 = 0;
        while (i5 < size) {
            C1152yn c1152yn = (C1152yn) arrayList.get(i5);
            int[] iArr = c1152yn.f48229ar;
            int i6 = iArr[c];
            int i7 = iArr[1];
            if (c1152yn.f48220ai == 8) {
                c1152yn.f48231e = true;
            } else {
                float f2 = c1152yn.f48251y;
                int i8 = 2;
                if (f2 < 1.0f && i6 == 3) {
                    c1152yn.f48246t = 2;
                    i6 = 3;
                }
                float f3 = c1152yn.f48186B;
                if (f3 < 1.0f && i7 == 3) {
                    c1152yn.f48247u = 2;
                    i7 = 3;
                }
                if (c1152yn.f48209Y > 0.0f) {
                    if (i6 == 3 && (i7 == 2 || i7 == 1)) {
                        c1152yn.f48246t = 3;
                    } else if (i7 == 3 && (i6 == 2 || i6 == 1)) {
                        c1152yn.f48247u = 3;
                    } else if (i6 == 3 && i7 == 3) {
                        if (c1152yn.f48246t == 0) {
                            c1152yn.f48246t = 3;
                        }
                        if (c1152yn.f48247u == 0) {
                            c1152yn.f48247u = 3;
                        }
                    }
                }
                if (i6 == 3 && c1152yn.f48246t == 1 && (c1152yn.f48195K.f48181f == null || c1152yn.f48197M.f48181f == null)) {
                    i6 = 2;
                }
                int i9 = (i7 == 3 && c1152yn.f48247u == 1 && (c1152yn.f48196L.f48181f == null || c1152yn.f48198N.f48181f == null)) ? 2 : i7;
                C1170ze c1170ze = c1152yn.f48234h;
                c1170ze.f48349k = i6;
                int i10 = c1152yn.f48246t;
                c1170ze.f48341c = i10;
                C1172zg c1172zg = c1152yn.f48235i;
                c1172zg.f48349k = i9;
                int i11 = c1152yn.f48247u;
                c1172zg.f48341c = i11;
                if (i6 == 4 || i6 == 1) {
                    if (i9 != 4 || i9 == 1) {
                        i8 = i9;
                    } else if (i9 != 2) {
                        if (i6 == 3 || !(i9 == 2 || i9 == 1)) {
                            if (i9 != 3) {
                                i3 = i6;
                            } else if (i6 == 2 && i6 != 1) {
                                i3 = i6;
                            } else if (i11 == 3) {
                                if (i6 == 2) {
                                    m19732f(c1152yn, 2, 0, 2, 0);
                                }
                                int iM19689j2 = c1152yn.m19689j();
                                f = c1152yn.f48209Y;
                                if (c1152yn.f48210Z == -1) {
                                    f = 1.0f / f;
                                }
                                m19732f(c1152yn, 1, iM19689j2, 1, (int) ((iM19689j2 * f) + 0.5f));
                                c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                c1152yn.f48231e = true;
                            } else if (i11 == 1) {
                                m19732f(c1152yn, i6, 0, 2, 0);
                                c1152yn.f48235i.f48344f.f48325m = c1152yn.m19687h();
                            } else {
                                i3 = i6;
                                if (i11 == 2) {
                                    i4 = c1153yo.f48229ar[1];
                                    if (i4 != 1 || i4 == 4) {
                                        m19732f(c1152yn, i3, c1152yn.m19689j(), 1, (int) ((f3 * c1153yo.m19687h()) + 0.5f));
                                        c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                        c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                        c1152yn.f48231e = true;
                                    }
                                } else {
                                    c1151ymArr = c1152yn.f48203S;
                                    if (c1151ymArr[2].f48181f != null || c1151ymArr[3].f48181f == null) {
                                        m19732f(c1152yn, 2, 0, 3, 0);
                                        c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                        c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                        c1152yn.f48231e = true;
                                    }
                                }
                            }
                            if (i3 != 3 && i9 == 3) {
                                if (i10 == 1 || i11 == 1) {
                                    m19732f(c1152yn, 2, 0, 2, 0);
                                    c1152yn.f48234h.f48344f.f48325m = c1152yn.m19689j();
                                    c1152yn.f48235i.f48344f.f48325m = c1152yn.m19687h();
                                } else if (i11 == 2 && i10 == 2) {
                                    int[] iArr2 = c1153yo.f48229ar;
                                    if (iArr2[0] == 1 && iArr2[1] == 1) {
                                        m19732f(c1152yn, 1, (int) ((f2 * c1153yo.m19689j()) + 0.5f), 1, (int) ((f3 * c1153yo.m19687h()) + 0.5f));
                                        c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                        c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                        c1152yn.f48231e = true;
                                    }
                                }
                            }
                        } else if (i10 == 3) {
                            if (i9 == 2) {
                                m19732f(c1152yn, 2, 0, 2, 0);
                            }
                            int iM19687h3 = c1152yn.m19687h();
                            m19732f(c1152yn, 1, (int) ((iM19687h3 * c1152yn.f48209Y) + 0.5f), 1, iM19687h3);
                            c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                            c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                            c1152yn.f48231e = true;
                        } else if (i10 == 1) {
                            m19732f(c1152yn, 2, 0, i9, 0);
                            c1152yn.f48234h.f48344f.f48325m = c1152yn.m19689j();
                        } else if (i10 == 2) {
                            int i12 = c1153yo.f48229ar[c];
                            if (i12 == 1 || i12 == 4) {
                                m19732f(c1152yn, 1, (int) ((f2 * c1153yo.m19689j()) + 0.5f), i9, c1152yn.m19687h());
                                c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                c1152yn.f48231e = true;
                            } else {
                                if (i9 != 3) {
                                    i3 = i6;
                                } else if (i6 == 2) {
                                    if (i11 == 3) {
                                        if (i6 == 2) {
                                            m19732f(c1152yn, 2, 0, 2, 0);
                                        }
                                        int iM19689j3 = c1152yn.m19689j();
                                        f = c1152yn.f48209Y;
                                        if (c1152yn.f48210Z == -1) {
                                            f = 1.0f / f;
                                        }
                                        m19732f(c1152yn, 1, iM19689j3, 1, (int) ((iM19689j3 * f) + 0.5f));
                                        c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                        c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                        c1152yn.f48231e = true;
                                    } else if (i11 == 1) {
                                        m19732f(c1152yn, i6, 0, 2, 0);
                                        c1152yn.f48235i.f48344f.f48325m = c1152yn.m19687h();
                                    } else {
                                        i3 = i6;
                                        if (i11 == 2) {
                                            i4 = c1153yo.f48229ar[1];
                                            if (i4 != 1) {
                                            }
                                            m19732f(c1152yn, i3, c1152yn.m19689j(), 1, (int) ((f3 * c1153yo.m19687h()) + 0.5f));
                                            c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                            c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                            c1152yn.f48231e = true;
                                        } else {
                                            c1151ymArr = c1152yn.f48203S;
                                            if (c1151ymArr[2].f48181f != null) {
                                            }
                                            m19732f(c1152yn, 2, 0, 3, 0);
                                            c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                            c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                            c1152yn.f48231e = true;
                                        }
                                    }
                                } else if (i11 == 3) {
                                    if (i6 == 2) {
                                        m19732f(c1152yn, 2, 0, 2, 0);
                                    }
                                    int iM19689j4 = c1152yn.m19689j();
                                    f = c1152yn.f48209Y;
                                    if (c1152yn.f48210Z == -1) {
                                        f = 1.0f / f;
                                    }
                                    m19732f(c1152yn, 1, iM19689j4, 1, (int) ((iM19689j4 * f) + 0.5f));
                                    c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                    c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                    c1152yn.f48231e = true;
                                } else if (i11 == 1) {
                                    m19732f(c1152yn, i6, 0, 2, 0);
                                    c1152yn.f48235i.f48344f.f48325m = c1152yn.m19687h();
                                } else {
                                    i3 = i6;
                                    if (i11 == 2) {
                                        i4 = c1153yo.f48229ar[1];
                                        if (i4 != 1) {
                                        }
                                        m19732f(c1152yn, i3, c1152yn.m19689j(), 1, (int) ((f3 * c1153yo.m19687h()) + 0.5f));
                                        c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                        c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                        c1152yn.f48231e = true;
                                    } else {
                                        c1151ymArr = c1152yn.f48203S;
                                        if (c1151ymArr[2].f48181f != null) {
                                        }
                                        m19732f(c1152yn, 2, 0, 3, 0);
                                        c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                        c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                        c1152yn.f48231e = true;
                                    }
                                }
                                if (i3 != 3) {
                                }
                            }
                        } else {
                            C1151ym[] c1151ymArr2 = c1152yn.f48203S;
                            if (c1151ymArr2[c].f48181f == null || c1151ymArr2[1].f48181f == null) {
                                m19732f(c1152yn, 2, 0, i9, 0);
                                c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                c1152yn.f48231e = true;
                            } else {
                                if (i9 != 3) {
                                    i3 = i6;
                                } else if (i6 == 2) {
                                    if (i11 == 3) {
                                        if (i6 == 2) {
                                            m19732f(c1152yn, 2, 0, 2, 0);
                                        }
                                        int iM19689j5 = c1152yn.m19689j();
                                        f = c1152yn.f48209Y;
                                        if (c1152yn.f48210Z == -1) {
                                            f = 1.0f / f;
                                        }
                                        m19732f(c1152yn, 1, iM19689j5, 1, (int) ((iM19689j5 * f) + 0.5f));
                                        c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                        c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                        c1152yn.f48231e = true;
                                    } else if (i11 == 1) {
                                        m19732f(c1152yn, i6, 0, 2, 0);
                                        c1152yn.f48235i.f48344f.f48325m = c1152yn.m19687h();
                                    } else {
                                        i3 = i6;
                                        if (i11 == 2) {
                                            i4 = c1153yo.f48229ar[1];
                                            if (i4 != 1) {
                                            }
                                            m19732f(c1152yn, i3, c1152yn.m19689j(), 1, (int) ((f3 * c1153yo.m19687h()) + 0.5f));
                                            c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                            c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                            c1152yn.f48231e = true;
                                        } else {
                                            c1151ymArr = c1152yn.f48203S;
                                            if (c1151ymArr[2].f48181f != null) {
                                            }
                                            m19732f(c1152yn, 2, 0, 3, 0);
                                            c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                            c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                            c1152yn.f48231e = true;
                                        }
                                    }
                                } else if (i11 == 3) {
                                    if (i6 == 2) {
                                        m19732f(c1152yn, 2, 0, 2, 0);
                                    }
                                    int iM19689j6 = c1152yn.m19689j();
                                    f = c1152yn.f48209Y;
                                    if (c1152yn.f48210Z == -1) {
                                        f = 1.0f / f;
                                    }
                                    m19732f(c1152yn, 1, iM19689j6, 1, (int) ((iM19689j6 * f) + 0.5f));
                                    c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                    c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                    c1152yn.f48231e = true;
                                } else if (i11 == 1) {
                                    m19732f(c1152yn, i6, 0, 2, 0);
                                    c1152yn.f48235i.f48344f.f48325m = c1152yn.m19687h();
                                } else {
                                    i3 = i6;
                                    if (i11 == 2) {
                                        i4 = c1153yo.f48229ar[1];
                                        if (i4 != 1) {
                                        }
                                        m19732f(c1152yn, i3, c1152yn.m19689j(), 1, (int) ((f3 * c1153yo.m19687h()) + 0.5f));
                                        c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                        c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                        c1152yn.f48231e = true;
                                    } else {
                                        c1151ymArr = c1152yn.f48203S;
                                        if (c1151ymArr[2].f48181f != null) {
                                        }
                                        m19732f(c1152yn, 2, 0, 3, 0);
                                        c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                        c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                        c1152yn.f48231e = true;
                                    }
                                }
                                if (i3 != 3) {
                                }
                            }
                        }
                    }
                    iM19689j = c1152yn.m19689j();
                    if (i6 == 4) {
                        iM19689j = (c1153yo.m19689j() - c1152yn.f48195K.f48182g) - c1152yn.f48197M.f48182g;
                        i = 1;
                    } else {
                        i = i6;
                    }
                    iM19687h = c1152yn.m19687h();
                    if (i8 == 4) {
                        iM19687h2 = (c1153yo.m19687h() - c1152yn.f48196L.f48182g) - c1152yn.f48198N.f48182g;
                        i2 = 1;
                    } else {
                        iM19687h2 = iM19687h;
                        i2 = i8;
                    }
                    m19732f(c1152yn, i, iM19689j, i2, iM19687h2);
                    c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                    c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                    c1152yn.f48231e = true;
                } else if (i6 == 2) {
                    i6 = 2;
                    if (i9 != 4) {
                        i8 = i9;
                    } else {
                        i8 = i9;
                    }
                    iM19689j = c1152yn.m19689j();
                    if (i6 == 4) {
                        iM19689j = (c1153yo.m19689j() - c1152yn.f48195K.f48182g) - c1152yn.f48197M.f48182g;
                        i = 1;
                    } else {
                        i = i6;
                    }
                    iM19687h = c1152yn.m19687h();
                    if (i8 == 4) {
                        iM19687h2 = (c1153yo.m19687h() - c1152yn.f48196L.f48182g) - c1152yn.f48198N.f48182g;
                        i2 = 1;
                    } else {
                        iM19687h2 = iM19687h;
                        i2 = i8;
                    }
                    m19732f(c1152yn, i, iM19689j, i2, iM19687h2);
                    c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                    c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                    c1152yn.f48231e = true;
                } else if (i6 == 3) {
                    if (i9 != 3) {
                        i3 = i6;
                    } else if (i6 == 2) {
                        if (i11 == 3) {
                            if (i6 == 2) {
                                m19732f(c1152yn, 2, 0, 2, 0);
                            }
                            int iM19689j7 = c1152yn.m19689j();
                            f = c1152yn.f48209Y;
                            if (c1152yn.f48210Z == -1) {
                                f = 1.0f / f;
                            }
                            m19732f(c1152yn, 1, iM19689j7, 1, (int) ((iM19689j7 * f) + 0.5f));
                            c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                            c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                            c1152yn.f48231e = true;
                        } else if (i11 == 1) {
                            m19732f(c1152yn, i6, 0, 2, 0);
                            c1152yn.f48235i.f48344f.f48325m = c1152yn.m19687h();
                        } else {
                            i3 = i6;
                            if (i11 == 2) {
                                i4 = c1153yo.f48229ar[1];
                                if (i4 != 1) {
                                }
                                m19732f(c1152yn, i3, c1152yn.m19689j(), 1, (int) ((f3 * c1153yo.m19687h()) + 0.5f));
                                c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                c1152yn.f48231e = true;
                            } else {
                                c1151ymArr = c1152yn.f48203S;
                                if (c1151ymArr[2].f48181f != null) {
                                }
                                m19732f(c1152yn, 2, 0, 3, 0);
                                c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                c1152yn.f48231e = true;
                            }
                        }
                    } else if (i11 == 3) {
                        if (i6 == 2) {
                            m19732f(c1152yn, 2, 0, 2, 0);
                        }
                        int iM19689j8 = c1152yn.m19689j();
                        f = c1152yn.f48209Y;
                        if (c1152yn.f48210Z == -1) {
                            f = 1.0f / f;
                        }
                        m19732f(c1152yn, 1, iM19689j8, 1, (int) ((iM19689j8 * f) + 0.5f));
                        c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                        c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                        c1152yn.f48231e = true;
                    } else if (i11 == 1) {
                        m19732f(c1152yn, i6, 0, 2, 0);
                        c1152yn.f48235i.f48344f.f48325m = c1152yn.m19687h();
                    } else {
                        i3 = i6;
                        if (i11 == 2) {
                            i4 = c1153yo.f48229ar[1];
                            if (i4 != 1) {
                            }
                            m19732f(c1152yn, i3, c1152yn.m19689j(), 1, (int) ((f3 * c1153yo.m19687h()) + 0.5f));
                            c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                            c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                            c1152yn.f48231e = true;
                        } else {
                            c1151ymArr = c1152yn.f48203S;
                            if (c1151ymArr[2].f48181f != null) {
                            }
                            m19732f(c1152yn, 2, 0, 3, 0);
                            c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                            c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                            c1152yn.f48231e = true;
                        }
                    }
                    if (i3 != 3) {
                    }
                } else {
                    if (i9 != 3) {
                        i3 = i6;
                    } else if (i6 == 2) {
                        if (i11 == 3) {
                            if (i6 == 2) {
                                m19732f(c1152yn, 2, 0, 2, 0);
                            }
                            int iM19689j9 = c1152yn.m19689j();
                            f = c1152yn.f48209Y;
                            if (c1152yn.f48210Z == -1) {
                                f = 1.0f / f;
                            }
                            m19732f(c1152yn, 1, iM19689j9, 1, (int) ((iM19689j9 * f) + 0.5f));
                            c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                            c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                            c1152yn.f48231e = true;
                        } else if (i11 == 1) {
                            m19732f(c1152yn, i6, 0, 2, 0);
                            c1152yn.f48235i.f48344f.f48325m = c1152yn.m19687h();
                        } else {
                            i3 = i6;
                            if (i11 == 2) {
                                i4 = c1153yo.f48229ar[1];
                                if (i4 != 1) {
                                }
                                m19732f(c1152yn, i3, c1152yn.m19689j(), 1, (int) ((f3 * c1153yo.m19687h()) + 0.5f));
                                c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                c1152yn.f48231e = true;
                            } else {
                                c1151ymArr = c1152yn.f48203S;
                                if (c1151ymArr[2].f48181f != null) {
                                }
                                m19732f(c1152yn, 2, 0, 3, 0);
                                c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                                c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                                c1152yn.f48231e = true;
                            }
                        }
                    } else if (i11 == 3) {
                        if (i6 == 2) {
                            m19732f(c1152yn, 2, 0, 2, 0);
                        }
                        int iM19689j10 = c1152yn.m19689j();
                        f = c1152yn.f48209Y;
                        if (c1152yn.f48210Z == -1) {
                            f = 1.0f / f;
                        }
                        m19732f(c1152yn, 1, iM19689j10, 1, (int) ((iM19689j10 * f) + 0.5f));
                        c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                        c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                        c1152yn.f48231e = true;
                    } else if (i11 == 1) {
                        m19732f(c1152yn, i6, 0, 2, 0);
                        c1152yn.f48235i.f48344f.f48325m = c1152yn.m19687h();
                    } else {
                        i3 = i6;
                        if (i11 == 2) {
                            i4 = c1153yo.f48229ar[1];
                            if (i4 != 1) {
                            }
                            m19732f(c1152yn, i3, c1152yn.m19689j(), 1, (int) ((f3 * c1153yo.m19687h()) + 0.5f));
                            c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                            c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                            c1152yn.f48231e = true;
                        } else {
                            c1151ymArr = c1152yn.f48203S;
                            if (c1151ymArr[2].f48181f != null) {
                            }
                            m19732f(c1152yn, 2, 0, 3, 0);
                            c1152yn.f48234h.f48344f.mo19740c(c1152yn.m19689j());
                            c1152yn.f48235i.f48344f.mo19740c(c1152yn.m19687h());
                            c1152yn.f48231e = true;
                        }
                    }
                    if (i3 != 3) {
                    }
                }
            }
            i5++;
            c = 0;
        }
    }
}
