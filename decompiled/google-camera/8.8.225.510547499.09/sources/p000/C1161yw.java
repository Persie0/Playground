package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: yw */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1161yw extends AbstractC1174zi {

    /* JADX INFO: renamed from: a */
    ArrayList f48295a;

    /* JADX INFO: renamed from: b */
    private int f48296b;

    public C1161yw(C1152yn c1152yn, int i) {
        super(c1152yn);
        this.f48295a = new ArrayList();
        this.f48345g = i;
        C1152yn c1152yn2 = this.f48342d;
        C1152yn c1152ynM19694o = c1152yn2.m19694o(i);
        C1152yn c1152yn3 = c1152yn2;
        C1152yn c1152ynM19694o2 = c1152ynM19694o;
        while (c1152ynM19694o2 != null) {
            c1152yn3 = c1152ynM19694o2;
            c1152ynM19694o2 = c1152ynM19694o2.m19694o(this.f48345g);
        }
        this.f48342d = c1152yn3;
        this.f48295a.add(c1152yn3.m19695p(this.f48345g));
        C1152yn c1152ynM19693n = c1152yn3.m19693n(this.f48345g);
        while (c1152ynM19693n != null) {
            this.f48295a.add(c1152ynM19693n.m19695p(this.f48345g));
            c1152ynM19693n = c1152ynM19693n.m19693n(this.f48345g);
        }
        ArrayList arrayList = this.f48295a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1174zi abstractC1174zi = (AbstractC1174zi) arrayList.get(i2);
            int i3 = this.f48345g;
            if (i3 == 0) {
                abstractC1174zi.f48342d.f48232f = this;
            } else if (i3 == 1) {
                abstractC1174zi.f48342d.f48233g = this;
            }
        }
        if (this.f48345g == 0 && ((C1153yo) this.f48342d.f48206V).f48273c && this.f48295a.size() > 1) {
            ArrayList arrayList2 = this.f48295a;
            this.f48342d = ((AbstractC1174zi) arrayList2.get(arrayList2.size() - 1)).f48342d;
        }
        this.f48296b = this.f48345g == 0 ? this.f48342d.f48222ak : this.f48342d.f48223al;
    }

    /* JADX INFO: renamed from: g */
    private final C1152yn m19723g() {
        for (int i = 0; i < this.f48295a.size(); i++) {
            C1152yn c1152yn = ((AbstractC1174zi) this.f48295a.get(i)).f48342d;
            if (c1152yn.f48220ai != 8) {
                return c1152yn;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    private final C1152yn m19724n() {
        for (int size = this.f48295a.size() - 1; size >= 0; size--) {
            C1152yn c1152yn = ((AbstractC1174zi) this.f48295a.get(size)).f48342d;
            if (c1152yn.f48220ai != 8) {
                return c1152yn;
            }
        }
        return null;
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: a */
    public final long mo19725a() {
        int size = this.f48295a.size();
        long jMo19725a = 0;
        for (int i = 0; i < size; i++) {
            AbstractC1174zi abstractC1174zi = (AbstractC1174zi) this.f48295a.get(i);
            jMo19725a = jMo19725a + ((long) abstractC1174zi.f48347i.f48309e) + abstractC1174zi.mo19725a() + ((long) abstractC1174zi.f48348j.f48309e);
        }
        return jMo19725a;
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: b */
    public final void mo19726b() {
        ArrayList arrayList = this.f48295a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1174zi) arrayList.get(i)).mo19726b();
        }
        int size2 = this.f48295a.size();
        if (size2 <= 0) {
            return;
        }
        C1152yn c1152yn = ((AbstractC1174zi) this.f48295a.get(0)).f48342d;
        C1152yn c1152yn2 = ((AbstractC1174zi) this.f48295a.get(size2 - 1)).f48342d;
        if (this.f48345g == 0) {
            C1151ym c1151ym = c1152yn.f48195K;
            C1151ym c1151ym2 = c1152yn2.f48197M;
            C1164yz c1164yzL = m19784l(c1151ym, 0);
            int iM19651b = c1151ym.m19651b();
            C1152yn c1152ynM19723g = m19723g();
            if (c1152ynM19723g != null) {
                iM19651b = c1152ynM19723g.f48195K.m19651b();
            }
            if (c1164yzL != null) {
                m19782j(this.f48347i, c1164yzL, iM19651b);
            }
            C1164yz c1164yzL2 = m19784l(c1151ym2, 0);
            int iM19651b2 = c1151ym2.m19651b();
            C1152yn c1152ynM19724n = m19724n();
            if (c1152ynM19724n != null) {
                iM19651b2 = c1152ynM19724n.f48197M.m19651b();
            }
            if (c1164yzL2 != null) {
                m19782j(this.f48348j, c1164yzL2, -iM19651b2);
            }
        } else {
            C1151ym c1151ym3 = c1152yn.f48196L;
            C1151ym c1151ym4 = c1152yn2.f48198N;
            C1164yz c1164yzL3 = m19784l(c1151ym3, 1);
            int iM19651b3 = c1151ym3.m19651b();
            C1152yn c1152ynM19723g2 = m19723g();
            if (c1152ynM19723g2 != null) {
                iM19651b3 = c1152ynM19723g2.f48196L.m19651b();
            }
            if (c1164yzL3 != null) {
                m19782j(this.f48347i, c1164yzL3, iM19651b3);
            }
            C1164yz c1164yzL4 = m19784l(c1151ym4, 1);
            int iM19651b4 = c1151ym4.m19651b();
            C1152yn c1152ynM19724n2 = m19724n();
            if (c1152ynM19724n2 != null) {
                iM19651b4 = c1152ynM19724n2.f48198N.m19651b();
            }
            if (c1164yzL4 != null) {
                m19782j(this.f48348j, c1164yzL4, -iM19651b4);
            }
        }
        this.f48347i.f48305a = this;
        this.f48348j.f48305a = this;
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: c */
    public final void mo19727c() {
        for (int i = 0; i < this.f48295a.size(); i++) {
            ((AbstractC1174zi) this.f48295a.get(i)).mo19727c();
        }
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: d */
    public final void mo19728d() {
        this.f48343e = null;
        ArrayList arrayList = this.f48295a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1174zi) arrayList.get(i)).mo19728d();
        }
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: e */
    public final boolean mo19729e() {
        int size = this.f48295a.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC1174zi) this.f48295a.get(i)).mo19729e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d7  */
    @Override // p000.AbstractC1174zi, p000.InterfaceC1162yx
    /* JADX INFO: renamed from: f */
    public final void mo19730f() {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f2;
        C1164yz c1164yz = this.f48347i;
        if (c1164yz.f48313i) {
            C1164yz c1164yz2 = this.f48348j;
            if (c1164yz2.f48313i) {
                C1152yn c1152yn = this.f48342d.f48206V;
                boolean z2 = c1152yn instanceof C1153yo ? ((C1153yo) c1152yn).f48273c : false;
                int i12 = c1164yz2.f48310f - c1164yz.f48310f;
                int size = this.f48295a.size();
                int i13 = 0;
                while (true) {
                    i = 8;
                    if (i13 >= size) {
                        i13 = -1;
                        break;
                    } else if (((AbstractC1174zi) this.f48295a.get(i13)).f48342d.f48220ai != 8) {
                        break;
                    } else {
                        i13++;
                    }
                }
                int i14 = size - 1;
                int i15 = i14;
                while (true) {
                    if (i15 < 0) {
                        i15 = -1;
                        break;
                    } else if (((AbstractC1174zi) this.f48295a.get(i15)).f48342d.f48220ai != 8) {
                        break;
                    } else {
                        i15--;
                    }
                }
                int i16 = 0;
                while (true) {
                    int i17 = 3;
                    if (i16 >= 2) {
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        f = 0.0f;
                        break;
                    }
                    i3 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    f = 0.0f;
                    while (i18 < size) {
                        AbstractC1174zi abstractC1174zi = (AbstractC1174zi) this.f48295a.get(i18);
                        C1152yn c1152yn2 = abstractC1174zi.f48342d;
                        if (c1152yn2.f48220ai != i) {
                            i20++;
                            if (i18 > 0 && i18 >= i13) {
                                i3 += abstractC1174zi.f48347i.f48309e;
                            }
                            C1166za c1166za = abstractC1174zi.f48344f;
                            int i21 = c1166za.f48310f;
                            boolean z3 = abstractC1174zi.f48349k != i17;
                            if (z3) {
                                int i22 = this.f48345g;
                                if (i22 == 0) {
                                    if (!c1152yn2.f48234h.f48344f.f48313i) {
                                        return;
                                    } else {
                                        i10 = i21;
                                    }
                                } else if (i22 == 1 && !c1152yn2.f48235i.f48344f.f48313i) {
                                    return;
                                } else {
                                    i10 = i21;
                                }
                            } else {
                                i10 = i21;
                                if (abstractC1174zi.f48341c == 1 && i16 == 0) {
                                    i11 = c1166za.f48325m;
                                    i19++;
                                    z3 = true;
                                } else if (c1166za.f48313i) {
                                    i11 = i10;
                                    z3 = true;
                                }
                                if (z3) {
                                    i3 += i11;
                                } else {
                                    i19++;
                                    f2 = c1152yn2.f48224am[this.f48345g];
                                    if (f2 >= 0.0f) {
                                        f += f2;
                                    }
                                }
                                if (i18 >= i14 && i18 < i15) {
                                    i3 += -abstractC1174zi.f48348j.f48309e;
                                }
                            }
                            i11 = i10;
                            if (z3) {
                                i19++;
                                f2 = c1152yn2.f48224am[this.f48345g];
                                if (f2 >= 0.0f) {
                                    f += f2;
                                }
                            } else {
                                i3 += i11;
                            }
                            if (i18 >= i14) {
                            }
                        }
                        i18++;
                        i = 8;
                        i17 = 3;
                    }
                    if (i3 < i12 || i19 == 0) {
                        i2 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i16++;
                        i = 8;
                    }
                }
                int i23 = this.f48347i.f48310f;
                if (z2) {
                    i23 = this.f48348j.f48310f;
                }
                if (i3 > i12) {
                    i23 = z2 ? i23 + ((int) (((i3 - i12) / 2.0f) + 0.5f)) : i23 - ((int) (((i3 - i12) / 2.0f) + 0.5f));
                }
                if (i2 > 0) {
                    float f3 = i12 - i3;
                    float f4 = (f3 / i2) + 0.5f;
                    int i24 = 0;
                    int i25 = 0;
                    while (i24 < size) {
                        AbstractC1174zi abstractC1174zi2 = (AbstractC1174zi) this.f48295a.get(i24);
                        int i26 = i3;
                        C1152yn c1152yn3 = abstractC1174zi2.f48342d;
                        int i27 = i23;
                        boolean z4 = z2;
                        if (c1152yn3.f48220ai == 8) {
                            f4 = f4;
                        } else if (abstractC1174zi2.f48349k == 3) {
                            C1166za c1166za2 = abstractC1174zi2.f48344f;
                            if (c1166za2.f48313i) {
                                f4 = f4;
                            } else {
                                int i28 = (int) f4;
                                if (f > 0.0f) {
                                    i28 = (int) (((c1152yn3.f48224am[this.f48345g] * f3) / f) + 0.5f);
                                }
                                if (this.f48345g == 0) {
                                    i8 = c1152yn3.f48250x;
                                    i9 = c1152yn3.f48249w;
                                } else {
                                    i8 = c1152yn3.f48185A;
                                    i9 = c1152yn3.f48252z;
                                }
                                int iMax = Math.max(i9, abstractC1174zi2.f48341c == 1 ? Math.min(i28, c1166za2.f48325m) : i28);
                                if (i8 > 0) {
                                    iMax = Math.min(i8, iMax);
                                }
                                if (iMax != i28) {
                                    i25++;
                                    i28 = iMax;
                                }
                                abstractC1174zi2.f48344f.mo19740c(i28);
                            }
                        } else {
                            f4 = f4;
                        }
                        i24++;
                        i3 = i26;
                        i23 = i27;
                        z2 = z4;
                        f4 = f4;
                        f3 = f3;
                        i4 = i4;
                    }
                    z = z2;
                    int i29 = i3;
                    i5 = i4;
                    i6 = i23;
                    if (i25 > 0) {
                        i2 -= i25;
                        i3 = 0;
                        for (int i30 = 0; i30 < size; i30++) {
                            AbstractC1174zi abstractC1174zi3 = (AbstractC1174zi) this.f48295a.get(i30);
                            if (abstractC1174zi3.f48342d.f48220ai != 8) {
                                if (i30 > 0 && i30 >= i13) {
                                    i3 += abstractC1174zi3.f48347i.f48309e;
                                }
                                i3 += abstractC1174zi3.f48344f.f48310f;
                                if (i30 < i14 && i30 < i15) {
                                    i3 += -abstractC1174zi3.f48348j.f48309e;
                                }
                            }
                        }
                    } else {
                        i3 = i29;
                    }
                    if (this.f48296b == 2 && i25 == 0) {
                        this.f48296b = 0;
                    }
                } else {
                    z = z2;
                    i5 = i4;
                    i6 = i23;
                }
                if (i3 > i12) {
                    i7 = 2;
                    this.f48296b = 2;
                } else {
                    i7 = 2;
                }
                if (i5 > 0 && i2 == 0) {
                    if (i13 == i15) {
                        this.f48296b = i7;
                        i2 = 0;
                    } else {
                        i2 = 0;
                    }
                }
                int i31 = this.f48296b;
                if (i31 == 1) {
                    int i32 = i5;
                    int i33 = i32 > 1 ? (i12 - i3) / (i32 - 1) : i32 == 1 ? (i12 - i3) / 2 : 0;
                    if (i2 > 0) {
                        i33 = 0;
                    }
                    int i34 = i6;
                    for (int i35 = 0; i35 < size; i35++) {
                        AbstractC1174zi abstractC1174zi4 = (AbstractC1174zi) this.f48295a.get(z ? size - (i35 + 1) : i35);
                        if (abstractC1174zi4.f48342d.f48220ai == 8) {
                            abstractC1174zi4.f48347i.mo19740c(i34);
                            abstractC1174zi4.f48348j.mo19740c(i34);
                        } else {
                            if (i35 > 0) {
                                i34 = z ? i34 - i33 : i34 + i33;
                            }
                            if (i35 > 0 && i35 >= i13) {
                                i34 = z ? i34 - abstractC1174zi4.f48347i.f48309e : i34 + abstractC1174zi4.f48347i.f48309e;
                            }
                            if (z) {
                                abstractC1174zi4.f48348j.mo19740c(i34);
                            } else {
                                abstractC1174zi4.f48347i.mo19740c(i34);
                            }
                            C1166za c1166za3 = abstractC1174zi4.f48344f;
                            int i36 = c1166za3.f48310f;
                            if (abstractC1174zi4.f48349k == 3 && abstractC1174zi4.f48341c == 1) {
                                i36 = c1166za3.f48325m;
                            }
                            i34 = z ? i34 - i36 : i34 + i36;
                            if (z) {
                                abstractC1174zi4.f48347i.mo19740c(i34);
                            } else {
                                abstractC1174zi4.f48348j.mo19740c(i34);
                            }
                            abstractC1174zi4.f48346h = true;
                            if (i35 < i14 && i35 < i15) {
                                i34 = z ? i34 - (-abstractC1174zi4.f48348j.f48309e) : i34 + (-abstractC1174zi4.f48348j.f48309e);
                            }
                        }
                    }
                    return;
                }
                int i37 = i5;
                if (i31 == 0) {
                    int i38 = (i12 - i3) / (i37 + 1);
                    if (i2 > 0) {
                        i38 = 0;
                    }
                    int i39 = i6;
                    for (int i40 = 0; i40 < size; i40++) {
                        AbstractC1174zi abstractC1174zi5 = (AbstractC1174zi) this.f48295a.get(z ? size - (i40 + 1) : i40);
                        if (abstractC1174zi5.f48342d.f48220ai == 8) {
                            abstractC1174zi5.f48347i.mo19740c(i39);
                            abstractC1174zi5.f48348j.mo19740c(i39);
                        } else {
                            int i41 = z ? i39 - i38 : i39 + i38;
                            if (i40 > 0 && i40 >= i13) {
                                i41 = z ? i41 - abstractC1174zi5.f48347i.f48309e : i41 + abstractC1174zi5.f48347i.f48309e;
                            }
                            if (z) {
                                abstractC1174zi5.f48348j.mo19740c(i41);
                            } else {
                                abstractC1174zi5.f48347i.mo19740c(i41);
                            }
                            C1166za c1166za4 = abstractC1174zi5.f48344f;
                            int iMin = c1166za4.f48310f;
                            if (abstractC1174zi5.f48349k == 3 && abstractC1174zi5.f48341c == 1) {
                                iMin = Math.min(iMin, c1166za4.f48325m);
                            }
                            i39 = z ? i41 - iMin : i41 + iMin;
                            if (z) {
                                abstractC1174zi5.f48347i.mo19740c(i39);
                            } else {
                                abstractC1174zi5.f48348j.mo19740c(i39);
                            }
                            if (i40 < i14 && i40 < i15) {
                                i39 = z ? i39 - (-abstractC1174zi5.f48348j.f48309e) : i39 + (-abstractC1174zi5.f48348j.f48309e);
                            }
                        }
                    }
                    return;
                }
                if (i31 == 2) {
                    float f5 = this.f48345g == 0 ? this.f48342d.f48217af : this.f48342d.f48218ag;
                    if (z) {
                        f5 = 1.0f - f5;
                    }
                    int i42 = (int) (((i12 - i3) * f5) + 0.5f);
                    if (i42 < 0 || i2 > 0) {
                        i42 = 0;
                    }
                    int i43 = z ? i6 - i42 : i6 + i42;
                    for (int i44 = 0; i44 < size; i44++) {
                        AbstractC1174zi abstractC1174zi6 = (AbstractC1174zi) this.f48295a.get(z ? size - (i44 + 1) : i44);
                        if (abstractC1174zi6.f48342d.f48220ai == 8) {
                            abstractC1174zi6.f48347i.mo19740c(i43);
                            abstractC1174zi6.f48348j.mo19740c(i43);
                        } else {
                            if (i44 > 0 && i44 >= i13) {
                                i43 = z ? i43 - abstractC1174zi6.f48347i.f48309e : i43 + abstractC1174zi6.f48347i.f48309e;
                            }
                            if (z) {
                                abstractC1174zi6.f48348j.mo19740c(i43);
                            } else {
                                abstractC1174zi6.f48347i.mo19740c(i43);
                            }
                            C1166za c1166za5 = abstractC1174zi6.f48344f;
                            int i45 = c1166za5.f48310f;
                            if (abstractC1174zi6.f48349k == 3 && abstractC1174zi6.f48341c == 1) {
                                i45 = c1166za5.f48325m;
                            }
                            i43 = z ? i43 - i45 : i43 + i45;
                            if (z) {
                                abstractC1174zi6.f48347i.mo19740c(i43);
                            } else {
                                abstractC1174zi6.f48348j.mo19740c(i43);
                            }
                            if (i44 < i14 && i44 < i15) {
                                i43 = z ? i43 - (-abstractC1174zi6.f48348j.f48309e) : i43 + (-abstractC1174zi6.f48348j.f48309e);
                            }
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f48345g == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f48295a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1174zi abstractC1174zi = (AbstractC1174zi) arrayList.get(i);
            sb.append("<");
            sb.append(abstractC1174zi);
            sb.append("> ");
        }
        return sb.toString();
    }
}
