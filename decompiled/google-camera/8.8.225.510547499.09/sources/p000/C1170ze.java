package p000;

import com.google.lens.sdk.LensApi;

/* JADX INFO: renamed from: ze */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1170ze extends AbstractC1174zi {

    /* JADX INFO: renamed from: a */
    private static final int[] f48329a = new int[2];

    public C1170ze(C1152yn c1152yn) {
        super(c1152yn);
        this.f48347i.f48316l = 4;
        this.f48348j.f48316l = 5;
        this.f48345g = 0;
    }

    /* JADX INFO: renamed from: n */
    private static final void m19773n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i4 - i3;
        int i7 = i2 - i;
        switch (i5) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                float f2 = (i7 / f) + 0.5f;
                int i8 = (int) ((i6 * f) + 0.5f);
                if (i8 > i7) {
                    int i9 = (int) f2;
                    if (i9 <= i6) {
                        iArr[0] = i7;
                        iArr[1] = i9;
                    }
                } else {
                    iArr[0] = i8;
                    iArr[1] = i6;
                }
                break;
            case 0:
                iArr[0] = (int) ((i6 * f) + 0.5f);
                iArr[1] = i6;
                break;
            default:
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                break;
        }
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: b */
    public final void mo19726b() {
        C1152yn c1152yn;
        C1152yn c1152yn2;
        C1152yn c1152yn3;
        C1152yn c1152yn4 = this.f48342d;
        if (c1152yn4.f48231e) {
            this.f48344f.mo19740c(c1152yn4.m19689j());
        }
        if (!this.f48344f.f48313i) {
            int iM19680O = this.f48342d.m19680O();
            this.f48349k = iM19680O;
            if (iM19680O != 3) {
                if (this.f48349k == 4 && (c1152yn3 = this.f48342d.f48206V) != null && (c1152yn3.m19680O() == 1 || c1152yn3.m19680O() == 4)) {
                    int iM19689j = (c1152yn3.m19689j() - this.f48342d.f48195K.m19651b()) - this.f48342d.f48197M.m19651b();
                    m19782j(this.f48347i, c1152yn3.f48234h.f48347i, this.f48342d.f48195K.m19651b());
                    m19782j(this.f48348j, c1152yn3.f48234h.f48348j, -this.f48342d.f48197M.m19651b());
                    this.f48344f.mo19740c(iM19689j);
                    return;
                }
                if (this.f48349k == 1) {
                    this.f48344f.mo19740c(this.f48342d.m19689j());
                }
            }
        } else if (this.f48349k == 4 && (c1152yn = this.f48342d.f48206V) != null && (c1152yn.m19680O() == 1 || c1152yn.m19680O() == 4)) {
            m19782j(this.f48347i, c1152yn.f48234h.f48347i, this.f48342d.f48195K.m19651b());
            m19782j(this.f48348j, c1152yn.f48234h.f48348j, -this.f48342d.f48197M.m19651b());
            return;
        }
        C1166za c1166za = this.f48344f;
        if (c1166za.f48313i) {
            C1152yn c1152yn5 = this.f48342d;
            if (c1152yn5.f48231e) {
                C1151ym[] c1151ymArr = c1152yn5.f48203S;
                C1151ym c1151ym = c1151ymArr[0];
                C1151ym c1151ym2 = c1151ym.f48181f;
                if (c1151ym2 != null && c1151ymArr[1].f48181f != null) {
                    if (c1152yn5.m19676K()) {
                        this.f48347i.f48309e = this.f48342d.f48203S[0].m19651b();
                        this.f48348j.f48309e = -this.f48342d.f48203S[1].m19651b();
                        return;
                    }
                    C1164yz c1164yzK = m19783k(this.f48342d.f48203S[0]);
                    if (c1164yzK != null) {
                        m19782j(this.f48347i, c1164yzK, this.f48342d.f48203S[0].m19651b());
                    }
                    C1164yz c1164yzK2 = m19783k(this.f48342d.f48203S[1]);
                    if (c1164yzK2 != null) {
                        m19782j(this.f48348j, c1164yzK2, -this.f48342d.f48203S[1].m19651b());
                    }
                    this.f48347i.f48306b = true;
                    this.f48348j.f48306b = true;
                    return;
                }
                if (c1151ym2 != null) {
                    C1164yz c1164yzK3 = m19783k(c1151ym);
                    if (c1164yzK3 != null) {
                        m19782j(this.f48347i, c1164yzK3, this.f48342d.f48203S[0].m19651b());
                        m19782j(this.f48348j, this.f48347i, this.f48344f.f48310f);
                        return;
                    }
                    return;
                }
                C1151ym c1151ym3 = c1151ymArr[1];
                if (c1151ym3.f48181f != null) {
                    C1164yz c1164yzK4 = m19783k(c1151ym3);
                    if (c1164yzK4 != null) {
                        m19782j(this.f48348j, c1164yzK4, -this.f48342d.f48203S[1].m19651b());
                        m19782j(this.f48347i, this.f48348j, -this.f48344f.f48310f);
                        return;
                    }
                    return;
                }
                if ((c1152yn5 instanceof C1156yr) || c1152yn5.f48206V == null || c1152yn5.mo19692m(EnumC1150yl.CENTER).f48181f != null) {
                    return;
                }
                C1152yn c1152yn6 = this.f48342d;
                m19782j(this.f48347i, c1152yn6.f48206V.f48234h.f48347i, c1152yn6.m19690k());
                m19782j(this.f48348j, this.f48347i, this.f48344f.f48310f);
                return;
            }
        }
        if (this.f48349k == 3) {
            C1152yn c1152yn7 = this.f48342d;
            switch (c1152yn7.f48246t) {
                case 2:
                    C1152yn c1152yn8 = c1152yn7.f48206V;
                    if (c1152yn8 != null) {
                        C1166za c1166za2 = c1152yn8.f48235i.f48344f;
                        c1166za.f48315k.add(c1166za2);
                        c1166za2.f48314j.add(this.f48344f);
                        C1166za c1166za3 = this.f48344f;
                        c1166za3.f48306b = true;
                        c1166za3.f48314j.add(this.f48347i);
                        this.f48344f.f48314j.add(this.f48348j);
                    }
                    break;
                case 3:
                    if (c1152yn7.f48247u != 3) {
                        C1166za c1166za4 = c1152yn7.f48235i.f48344f;
                        c1166za.f48315k.add(c1166za4);
                        c1166za4.f48314j.add(this.f48344f);
                        this.f48342d.f48235i.f48347i.f48314j.add(this.f48344f);
                        this.f48342d.f48235i.f48348j.f48314j.add(this.f48344f);
                        C1166za c1166za5 = this.f48344f;
                        c1166za5.f48306b = true;
                        c1166za5.f48314j.add(this.f48347i);
                        this.f48344f.f48314j.add(this.f48348j);
                        this.f48347i.f48315k.add(this.f48344f);
                        this.f48348j.f48315k.add(this.f48344f);
                    } else {
                        this.f48347i.f48305a = this;
                        this.f48348j.f48305a = this;
                        C1172zg c1172zg = c1152yn7.f48235i;
                        c1172zg.f48347i.f48305a = this;
                        c1172zg.f48348j.f48305a = this;
                        c1166za.f48305a = this;
                        if (c1152yn7.m19677L()) {
                            this.f48344f.f48315k.add(this.f48342d.f48235i.f48344f);
                            this.f48342d.f48235i.f48344f.f48314j.add(this.f48344f);
                            C1172zg c1172zg2 = this.f48342d.f48235i;
                            c1172zg2.f48344f.f48305a = this;
                            this.f48344f.f48315k.add(c1172zg2.f48347i);
                            this.f48344f.f48315k.add(this.f48342d.f48235i.f48348j);
                            this.f48342d.f48235i.f48347i.f48314j.add(this.f48344f);
                            this.f48342d.f48235i.f48348j.f48314j.add(this.f48344f);
                        } else if (!this.f48342d.m19676K()) {
                            this.f48342d.f48235i.f48344f.f48315k.add(this.f48344f);
                        } else {
                            this.f48342d.f48235i.f48344f.f48315k.add(this.f48344f);
                            this.f48344f.f48314j.add(this.f48342d.f48235i.f48344f);
                        }
                    }
                    break;
            }
        }
        C1152yn c1152yn9 = this.f48342d;
        C1151ym[] c1151ymArr2 = c1152yn9.f48203S;
        C1151ym c1151ym4 = c1151ymArr2[0];
        C1151ym c1151ym5 = c1151ym4.f48181f;
        if (c1151ym5 != null && c1151ymArr2[1].f48181f != null) {
            if (c1152yn9.m19676K()) {
                this.f48347i.f48309e = this.f48342d.f48203S[0].m19651b();
                this.f48348j.f48309e = -this.f48342d.f48203S[1].m19651b();
                return;
            }
            C1164yz c1164yzK5 = m19783k(this.f48342d.f48203S[0]);
            C1164yz c1164yzK6 = m19783k(this.f48342d.f48203S[1]);
            if (c1164yzK5 != null) {
                c1164yzK5.m19738a(this);
            }
            if (c1164yzK6 != null) {
                c1164yzK6.m19738a(this);
            }
            this.f48350l = 4;
            return;
        }
        if (c1151ym5 != null) {
            C1164yz c1164yzK7 = m19783k(c1151ym4);
            if (c1164yzK7 != null) {
                m19782j(this.f48347i, c1164yzK7, this.f48342d.f48203S[0].m19651b());
                m19786i(this.f48348j, this.f48347i, 1, this.f48344f);
                return;
            }
            return;
        }
        C1151ym c1151ym6 = c1151ymArr2[1];
        if (c1151ym6.f48181f != null) {
            C1164yz c1164yzK8 = m19783k(c1151ym6);
            if (c1164yzK8 != null) {
                m19782j(this.f48348j, c1164yzK8, -this.f48342d.f48203S[1].m19651b());
                m19786i(this.f48347i, this.f48348j, -1, this.f48344f);
                return;
            }
            return;
        }
        if ((c1152yn9 instanceof C1156yr) || (c1152yn2 = c1152yn9.f48206V) == null) {
            return;
        }
        m19782j(this.f48347i, c1152yn2.f48234h.f48347i, c1152yn9.m19690k());
        m19786i(this.f48348j, this.f48347i, 1, this.f48344f);
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: c */
    public final void mo19727c() {
        C1164yz c1164yz = this.f48347i;
        if (c1164yz.f48313i) {
            this.f48342d.f48212aa = c1164yz.f48310f;
        }
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: d */
    public final void mo19728d() {
        this.f48343e = null;
        this.f48347i.m19739b();
        this.f48348j.m19739b();
        this.f48344f.m19739b();
        this.f48346h = false;
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: e */
    public final boolean mo19729e() {
        return this.f48349k != 3 || this.f48342d.f48246t == 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m19774g() {
        this.f48346h = false;
        this.f48347i.m19739b();
        this.f48347i.f48313i = false;
        this.f48348j.m19739b();
        this.f48348j.f48313i = false;
        this.f48344f.f48313i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.f48342d.f48221aj));
    }

    @Override // p000.AbstractC1174zi, p000.InterfaceC1162yx
    /* JADX INFO: renamed from: f */
    public final void mo19730f() {
        int i;
        int i2 = this.f48350l;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        switch (i3) {
            case 3:
                C1152yn c1152yn = this.f48342d;
                m19787m(c1152yn.f48195K, c1152yn.f48197M, 0);
                return;
            default:
                C1166za c1166za = this.f48344f;
                if (!c1166za.f48313i && this.f48349k == 3) {
                    C1152yn c1152yn2 = this.f48342d;
                    switch (c1152yn2.f48246t) {
                        case 2:
                            C1152yn c1152yn3 = c1152yn2.f48206V;
                            if (c1152yn3 != null) {
                                C1166za c1166za2 = c1152yn3.f48234h.f48344f;
                                if (c1166za2.f48313i) {
                                    c1166za.mo19740c((int) ((c1166za2.f48310f * c1152yn2.f48251y) + 0.5f));
                                }
                            }
                            break;
                        case 3:
                            int i4 = c1152yn2.f48247u;
                            if (i4 != 0 && i4 != 3) {
                                switch (c1152yn2.f48210Z) {
                                    case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                                        i = (int) ((c1152yn2.f48235i.f48344f.f48310f * c1152yn2.f48209Y) + 0.5f);
                                        break;
                                    case 0:
                                        i = (int) ((c1152yn2.f48235i.f48344f.f48310f / c1152yn2.f48209Y) + 0.5f);
                                        break;
                                    default:
                                        i = (int) ((c1152yn2.f48235i.f48344f.f48310f * c1152yn2.f48209Y) + 0.5f);
                                        break;
                                }
                                c1166za.mo19740c(i);
                                break;
                            } else {
                                C1172zg c1172zg = c1152yn2.f48235i;
                                C1164yz c1164yz = c1172zg.f48347i;
                                C1164yz c1164yz2 = c1172zg.f48348j;
                                boolean z = c1152yn2.f48195K.f48181f != null;
                                boolean z2 = c1152yn2.f48196L.f48181f != null;
                                boolean z3 = c1152yn2.f48197M.f48181f != null;
                                boolean z4 = c1152yn2.f48198N.f48181f != null;
                                int i5 = c1152yn2.f48210Z;
                                if (z && z2 && z3 && z4) {
                                    float f = c1152yn2.f48209Y;
                                    if (c1164yz.f48313i && c1164yz2.f48313i) {
                                        C1164yz c1164yz3 = this.f48347i;
                                        if (c1164yz3.f48307c && this.f48348j.f48307c) {
                                            int i6 = ((C1164yz) c1164yz3.f48315k.get(0)).f48310f + this.f48347i.f48309e;
                                            int i7 = ((C1164yz) this.f48348j.f48315k.get(0)).f48310f - this.f48348j.f48309e;
                                            int i8 = c1164yz.f48310f + c1164yz.f48309e;
                                            int i9 = c1164yz2.f48310f - c1164yz2.f48309e;
                                            int[] iArr = f48329a;
                                            m19773n(iArr, i6, i7, i8, i9, f, i5);
                                            this.f48344f.mo19740c(iArr[0]);
                                            this.f48342d.f48235i.f48344f.mo19740c(iArr[1]);
                                            return;
                                        }
                                        return;
                                    }
                                    C1164yz c1164yz4 = this.f48347i;
                                    if (c1164yz4.f48313i) {
                                        C1164yz c1164yz5 = this.f48348j;
                                        if (c1164yz5.f48313i) {
                                            if (!c1164yz.f48307c || !c1164yz2.f48307c) {
                                                return;
                                            }
                                            int i10 = c1164yz4.f48310f + c1164yz4.f48309e;
                                            int i11 = c1164yz5.f48310f - c1164yz5.f48309e;
                                            int i12 = ((C1164yz) c1164yz.f48315k.get(0)).f48310f + c1164yz.f48309e;
                                            int i13 = ((C1164yz) c1164yz2.f48315k.get(0)).f48310f - c1164yz2.f48309e;
                                            int[] iArr2 = f48329a;
                                            m19773n(iArr2, i10, i11, i12, i13, f, i5);
                                            this.f48344f.mo19740c(iArr2[0]);
                                            this.f48342d.f48235i.f48344f.mo19740c(iArr2[1]);
                                        }
                                    }
                                    C1164yz c1164yz6 = this.f48347i;
                                    if (!c1164yz6.f48307c || !this.f48348j.f48307c || !c1164yz.f48307c || !c1164yz2.f48307c) {
                                        return;
                                    }
                                    int i14 = ((C1164yz) c1164yz6.f48315k.get(0)).f48310f + this.f48347i.f48309e;
                                    int i15 = ((C1164yz) this.f48348j.f48315k.get(0)).f48310f - this.f48348j.f48309e;
                                    int i16 = ((C1164yz) c1164yz.f48315k.get(0)).f48310f + c1164yz.f48309e;
                                    int i17 = ((C1164yz) c1164yz2.f48315k.get(0)).f48310f - c1164yz2.f48309e;
                                    int[] iArr3 = f48329a;
                                    m19773n(iArr3, i14, i15, i16, i17, f, i5);
                                    this.f48344f.mo19740c(iArr3[0]);
                                    this.f48342d.f48235i.f48344f.mo19740c(iArr3[1]);
                                    break;
                                } else if (z && z3) {
                                    C1164yz c1164yz7 = this.f48347i;
                                    if (c1164yz7.f48307c && this.f48348j.f48307c) {
                                        float f2 = c1152yn2.f48209Y;
                                        int i18 = ((C1164yz) c1164yz7.f48315k.get(0)).f48310f + this.f48347i.f48309e;
                                        int i19 = ((C1164yz) this.f48348j.f48315k.get(0)).f48310f - this.f48348j.f48309e;
                                        switch (i5) {
                                            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                                            case 0:
                                                int iM19785h = m19785h(i19 - i18, 0);
                                                int i20 = (int) ((iM19785h * f2) + 0.5f);
                                                int iM19785h2 = m19785h(i20, 1);
                                                if (i20 != iM19785h2) {
                                                    iM19785h = (int) ((iM19785h2 / f2) + 0.5f);
                                                }
                                                this.f48344f.mo19740c(iM19785h);
                                                this.f48342d.f48235i.f48344f.mo19740c(iM19785h2);
                                                break;
                                            default:
                                                int iM19785h3 = m19785h(i19 - i18, 0);
                                                int i21 = (int) ((iM19785h3 / f2) + 0.5f);
                                                int iM19785h4 = m19785h(i21, 1);
                                                if (i21 != iM19785h4) {
                                                    iM19785h3 = (int) ((iM19785h4 * f2) + 0.5f);
                                                }
                                                this.f48344f.mo19740c(iM19785h3);
                                                this.f48342d.f48235i.f48344f.mo19740c(iM19785h4);
                                                break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if (z2 && z4) {
                                    if (c1164yz.f48307c && c1164yz2.f48307c) {
                                        float f3 = c1152yn2.f48209Y;
                                        int i22 = ((C1164yz) c1164yz.f48315k.get(0)).f48310f + c1164yz.f48309e;
                                        int i23 = ((C1164yz) c1164yz2.f48315k.get(0)).f48310f - c1164yz2.f48309e;
                                        switch (i5) {
                                            case 0:
                                                int iM19785h5 = m19785h(i23 - i22, 1);
                                                int i24 = (int) ((iM19785h5 * f3) + 0.5f);
                                                int iM19785h6 = m19785h(i24, 0);
                                                if (i24 != iM19785h6) {
                                                    iM19785h5 = (int) ((iM19785h6 / f3) + 0.5f);
                                                }
                                                this.f48344f.mo19740c(iM19785h6);
                                                this.f48342d.f48235i.f48344f.mo19740c(iM19785h5);
                                                break;
                                            default:
                                                int iM19785h7 = m19785h(i23 - i22, 1);
                                                int i25 = (int) ((iM19785h7 / f3) + 0.5f);
                                                int iM19785h8 = m19785h(i25, 0);
                                                if (i25 != iM19785h8) {
                                                    iM19785h7 = (int) ((iM19785h8 * f3) + 0.5f);
                                                }
                                                this.f48344f.mo19740c(iM19785h8);
                                                this.f48342d.f48235i.f48344f.mo19740c(iM19785h7);
                                                break;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                            break;
                    }
                }
                C1164yz c1164yz8 = this.f48347i;
                if (c1164yz8.f48307c) {
                    C1164yz c1164yz9 = this.f48348j;
                    if (c1164yz9.f48307c) {
                        if (c1164yz8.f48313i && c1164yz9.f48313i && this.f48344f.f48313i) {
                            return;
                        }
                        if (!this.f48344f.f48313i && this.f48349k == 3) {
                            C1152yn c1152yn4 = this.f48342d;
                            if (c1152yn4.f48246t == 0 && !c1152yn4.m19676K()) {
                                C1164yz c1164yz10 = (C1164yz) this.f48347i.f48315k.get(0);
                                C1164yz c1164yz11 = (C1164yz) this.f48348j.f48315k.get(0);
                                int i26 = c1164yz10.f48310f;
                                C1164yz c1164yz12 = this.f48347i;
                                int i27 = i26 + c1164yz12.f48309e;
                                int i28 = c1164yz11.f48310f + this.f48348j.f48309e;
                                c1164yz12.mo19740c(i27);
                                this.f48348j.mo19740c(i28);
                                this.f48344f.mo19740c(i28 - i27);
                                return;
                            }
                        }
                        if (!this.f48344f.f48313i && this.f48349k == 3 && this.f48341c == 1 && this.f48347i.f48315k.size() > 0 && this.f48348j.f48315k.size() > 0) {
                            C1164yz c1164yz13 = (C1164yz) this.f48347i.f48315k.get(0);
                            int iMin = Math.min((((C1164yz) this.f48348j.f48315k.get(0)).f48310f + this.f48348j.f48309e) - (c1164yz13.f48310f + this.f48347i.f48309e), this.f48344f.f48325m);
                            C1152yn c1152yn5 = this.f48342d;
                            int i29 = c1152yn5.f48250x;
                            int iMax = Math.max(c1152yn5.f48249w, iMin);
                            if (i29 > 0) {
                                iMax = Math.min(i29, iMax);
                            }
                            this.f48344f.mo19740c(iMax);
                        }
                        if (this.f48344f.f48313i) {
                            C1164yz c1164yz14 = (C1164yz) this.f48347i.f48315k.get(0);
                            C1164yz c1164yz15 = (C1164yz) this.f48348j.f48315k.get(0);
                            int i30 = c1164yz14.f48310f;
                            C1164yz c1164yz16 = this.f48347i;
                            int i31 = c1164yz16.f48309e + i30;
                            int i32 = c1164yz15.f48310f;
                            int i33 = this.f48348j.f48309e + i32;
                            float f4 = this.f48342d.f48217af;
                            if (c1164yz14 == c1164yz15) {
                                f4 = 0.5f;
                            }
                            if (c1164yz14 != c1164yz15) {
                                i32 = i33;
                            }
                            if (c1164yz14 != c1164yz15) {
                                i30 = i31;
                            }
                            c1164yz16.mo19740c((int) (i30 + 0.5f + (((i32 - i30) - this.f48344f.f48310f) * f4)));
                            this.f48348j.mo19740c(this.f48347i.f48310f + this.f48344f.f48310f);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
