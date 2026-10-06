package p000;

import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;

/* JADX INFO: renamed from: yj */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1148yj extends C1156yr {

    /* JADX INFO: renamed from: a */
    public int f48142a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f48143b = true;

    /* JADX INFO: renamed from: c */
    public int f48144c = 0;

    /* JADX INFO: renamed from: d */
    boolean f48145d = false;

    /* JADX INFO: renamed from: a */
    public final int m19644a() {
        switch (this.f48142a) {
            case 0:
            case 1:
                return 0;
            case 2:
            case 3:
                return 1;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9 A[DONT_INVERT, PHI: r7
      0x00f9: PHI (r7v9 boolean) = (r7v3 boolean), (r7v10 boolean) binds: [B:77:0x00f4, B:79:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0102  */
    @Override // p000.C1152yn
    /* JADX INFO: renamed from: b */
    public final void mo19645b(C1141yc c1141yc, boolean z) {
        C1151ym[] c1151ymArr;
        boolean z2;
        int i;
        C1151ym[] c1151ymArr2 = this.f48203S;
        c1151ymArr2[0] = this.f48195K;
        c1151ymArr2[2] = this.f48196L;
        c1151ymArr2[1] = this.f48197M;
        c1151ymArr2[3] = this.f48198N;
        int i2 = 0;
        while (true) {
            c1151ymArr = this.f48203S;
            int length = c1151ymArr.length;
            if (i2 >= 6) {
                break;
            }
            C1151ym c1151ym = c1151ymArr[i2];
            c1151ym.f48184i = c1141yc.m19623b(c1151ym);
            i2++;
        }
        int i3 = this.f48142a;
        if (i3 < 0 || i3 >= 4) {
            return;
        }
        C1151ym c1151ym2 = c1151ymArr[i3];
        if (!this.f48145d) {
            m19646c();
        }
        if (this.f48145d) {
            this.f48145d = false;
            int i4 = this.f48142a;
            if (i4 == 0 || i4 == 1) {
                c1141yc.m19627f(this.f48195K.f48184i, this.f48212aa);
                c1141yc.m19627f(this.f48197M.f48184i, this.f48212aa);
                return;
            } else {
                if (i4 == 2 || i4 == 3) {
                    c1141yc.m19627f(this.f48196L.f48184i, this.f48213ab);
                    c1141yc.m19627f(this.f48198N.f48184i, this.f48213ab);
                    return;
                }
                return;
            }
        }
        int i5 = 0;
        while (true) {
            if (i5 >= this.f48282at) {
                z2 = false;
                break;
            }
            C1152yn c1152yn = this.f48281as[i5];
            if (this.f48143b || c1152yn.mo19647d()) {
                int i6 = this.f48142a;
                if ((i6 == 0 || i6 == 1) && c1152yn.m19680O() == 3 && c1152yn.f48195K.f48181f != null && c1152yn.f48197M.f48181f != null) {
                    z2 = true;
                    break;
                }
                int i7 = this.f48142a;
                if ((i7 == 2 || i7 == 3) && c1152yn.m19681P() == 3 && c1152yn.f48196L.f48181f != null && c1152yn.f48198N.f48181f != null) {
                    z2 = true;
                    break;
                }
            }
            i5++;
        }
        boolean z3 = this.f48195K.m19655f() || this.f48197M.m19655f();
        boolean z4 = this.f48196L.m19655f() || this.f48198N.m19655f();
        if (z2) {
            i = 4;
        } else {
            int i8 = this.f48142a;
            i = 5;
            if (i8 != 0) {
                if (i8 != 2) {
                    if ((i8 == 1 || !z3) && (i8 != 3 || !z4)) {
                        i = 4;
                    }
                } else if (!z4) {
                    z4 = false;
                    if (i8 == 1) {
                        i = 4;
                    } else {
                        i = 4;
                    }
                }
            } else if (!z3) {
                i8 = 0;
                z3 = false;
                if (i8 != 2) {
                    if (i8 == 1) {
                        i = 4;
                    } else {
                        i = 4;
                    }
                } else if (!z4) {
                    z4 = false;
                    if (i8 == 1) {
                        i = 4;
                    } else {
                        i = 4;
                    }
                }
            }
        }
        for (int i9 = 0; i9 < this.f48282at; i9++) {
            C1152yn c1152yn2 = this.f48281as[i9];
            if (this.f48143b || c1152yn2.mo19647d()) {
                C1146yh c1146yhM19623b = c1141yc.m19623b(c1152yn2.f48203S[this.f48142a]);
                C1151ym[] c1151ymArr3 = c1152yn2.f48203S;
                int i10 = this.f48142a;
                C1151ym c1151ym3 = c1151ymArr3[i10];
                c1151ym3.f48184i = c1146yhM19623b;
                C1151ym c1151ym4 = c1151ym3.f48181f;
                int i11 = (c1151ym4 == null || c1151ym4.f48179d != this) ? 0 : c1151ym3.f48182g;
                if (i10 == 0 || i10 == 2) {
                    C1146yh c1146yh = c1151ym2.f48184i;
                    int i12 = this.f48144c - i11;
                    C1140yb c1140ybM19622a = c1141yc.m19622a();
                    C1146yh c1146yhM19624c = c1141yc.m19624c();
                    c1146yhM19624c.f48131e = 0;
                    c1140ybM19622a.m19612i(c1146yh, c1146yhM19623b, c1146yhM19624c, i12);
                    c1141yc.m19626e(c1140ybM19622a);
                } else {
                    C1146yh c1146yh2 = c1151ym2.f48184i;
                    int i13 = this.f48144c + i11;
                    C1140yb c1140ybM19622a2 = c1141yc.m19622a();
                    C1146yh c1146yhM19624c2 = c1141yc.m19624c();
                    c1146yhM19624c2.f48131e = 0;
                    c1140ybM19622a2.m19611h(c1146yh2, c1146yhM19623b, c1146yhM19624c2, i13);
                    c1141yc.m19626e(c1140ybM19622a2);
                }
                c1141yc.m19634m(c1151ym2.f48184i, c1146yhM19623b, this.f48144c + i11, i);
            }
        }
        int i14 = this.f48142a;
        if (i14 == 0) {
            c1141yc.m19634m(this.f48197M.f48184i, this.f48195K.f48184i, 0, 8);
            c1141yc.m19634m(this.f48195K.f48184i, this.f48206V.f48197M.f48184i, 0, 4);
            c1141yc.m19634m(this.f48195K.f48184i, this.f48206V.f48195K.f48184i, 0, 0);
            return;
        }
        if (i14 == 1) {
            c1141yc.m19634m(this.f48195K.f48184i, this.f48197M.f48184i, 0, 8);
            c1141yc.m19634m(this.f48195K.f48184i, this.f48206V.f48195K.f48184i, 0, 4);
            c1141yc.m19634m(this.f48195K.f48184i, this.f48206V.f48197M.f48184i, 0, 0);
        } else if (i14 == 2) {
            c1141yc.m19634m(this.f48198N.f48184i, this.f48196L.f48184i, 0, 8);
            c1141yc.m19634m(this.f48196L.f48184i, this.f48206V.f48198N.f48184i, 0, 4);
            c1141yc.m19634m(this.f48196L.f48184i, this.f48206V.f48196L.f48184i, 0, 0);
        } else if (i14 == 3) {
            c1141yc.m19634m(this.f48196L.f48184i, this.f48198N.f48184i, 0, 8);
            c1141yc.m19634m(this.f48196L.f48184i, this.f48206V.f48196L.f48184i, 0, 4);
            c1141yc.m19634m(this.f48196L.f48184i, this.f48206V.f48198N.f48184i, 0, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19646c() {
        int i;
        int i2 = 0;
        boolean z = true;
        while (true) {
            i = this.f48282at;
            if (i2 >= i) {
                break;
            }
            C1152yn c1152yn = this.f48281as[i2];
            if (this.f48143b || c1152yn.mo19647d()) {
                int i3 = this.f48142a;
                if ((i3 == 0 || i3 == 1) && !c1152yn.mo19648e()) {
                    z = false;
                } else {
                    int i4 = this.f48142a;
                    if ((i4 == 2 || i4 == 3) && !c1152yn.mo19649f()) {
                        z = false;
                    }
                }
            }
            i2++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f48282at; i5++) {
            C1152yn c1152yn2 = this.f48281as[i5];
            if (this.f48143b || c1152yn2.mo19647d()) {
                if (!z2) {
                    int i6 = this.f48142a;
                    if (i6 == 0) {
                        iMax = c1152yn2.mo19692m(EnumC1150yl.LEFT).m19650a();
                    } else if (i6 == 1) {
                        iMax = c1152yn2.mo19692m(EnumC1150yl.RIGHT).m19650a();
                    } else if (i6 == 2) {
                        iMax = c1152yn2.mo19692m(EnumC1150yl.TOP).m19650a();
                    } else if (i6 == 3) {
                        iMax = c1152yn2.mo19692m(EnumC1150yl.BOTTOM).m19650a();
                    }
                }
                int i7 = this.f48142a;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c1152yn2.mo19692m(EnumC1150yl.LEFT).m19650a());
                    z2 = true;
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c1152yn2.mo19692m(EnumC1150yl.RIGHT).m19650a());
                    z2 = true;
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c1152yn2.mo19692m(EnumC1150yl.TOP).m19650a());
                    z2 = true;
                } else {
                    if (i7 == 3) {
                        iMax = Math.max(iMax, c1152yn2.mo19692m(EnumC1150yl.BOTTOM).m19650a());
                    }
                    z2 = true;
                }
            }
        }
        int i8 = iMax + this.f48144c;
        int i9 = this.f48142a;
        if (i9 == 0 || i9 == 1) {
            m19704y(i8, i8);
        } else {
            m19705z(i8, i8);
        }
        this.f48145d = true;
        return true;
    }

    @Override // p000.C1152yn
    /* JADX INFO: renamed from: d */
    public final boolean mo19647d() {
        return true;
    }

    @Override // p000.C1152yn
    /* JADX INFO: renamed from: e */
    public final boolean mo19648e() {
        return this.f48145d;
    }

    @Override // p000.C1152yn
    /* JADX INFO: renamed from: f */
    public final boolean mo19649f() {
        return this.f48145d;
    }

    @Override // p000.C1152yn
    public final String toString() {
        String strConcat = "[Barrier] " + this.f48221aj + " {";
        for (int i = 0; i < this.f48282at; i++) {
            C1152yn c1152yn = this.f48281as[i];
            if (i > 0) {
                strConcat = strConcat.concat(", ");
            }
            strConcat = strConcat.concat(String.valueOf(c1152yn.f48221aj));
        }
        return strConcat.concat(WIxTIdUIdfb.KMRxBjzAWU);
    }
}
