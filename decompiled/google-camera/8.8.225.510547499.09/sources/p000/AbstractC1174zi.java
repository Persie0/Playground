package p000;

/* JADX INFO: renamed from: zi */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1174zi implements InterfaceC1162yx {

    /* JADX INFO: renamed from: c */
    public int f48341c;

    /* JADX INFO: renamed from: d */
    public C1152yn f48342d;

    /* JADX INFO: renamed from: e */
    C1171zf f48343e;

    /* JADX INFO: renamed from: k */
    protected int f48349k;

    /* JADX INFO: renamed from: f */
    public final C1166za f48344f = new C1166za(this);

    /* JADX INFO: renamed from: g */
    public int f48345g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f48346h = false;

    /* JADX INFO: renamed from: i */
    public final C1164yz f48347i = new C1164yz(this);

    /* JADX INFO: renamed from: j */
    public final C1164yz f48348j = new C1164yz(this);

    /* JADX INFO: renamed from: l */
    protected int f48350l = 1;

    public AbstractC1174zi(C1152yn c1152yn) {
        this.f48342d = c1152yn;
    }

    /* JADX INFO: renamed from: j */
    protected static final void m19782j(C1164yz c1164yz, C1164yz c1164yz2, int i) {
        c1164yz.f48315k.add(c1164yz2);
        c1164yz.f48309e = i;
        c1164yz2.f48314j.add(c1164yz);
    }

    /* JADX INFO: renamed from: k */
    protected static final C1164yz m19783k(C1151ym c1151ym) {
        C1151ym c1151ym2 = c1151ym.f48181f;
        if (c1151ym2 == null) {
            return null;
        }
        C1152yn c1152yn = c1151ym2.f48179d;
        EnumC1150yl enumC1150yl = c1151ym2.f48180e;
        EnumC1150yl enumC1150yl2 = EnumC1150yl.NONE;
        switch (enumC1150yl.ordinal()) {
            case 1:
                return c1152yn.f48234h.f48347i;
            case 2:
                return c1152yn.f48235i.f48347i;
            case 3:
                return c1152yn.f48234h.f48348j;
            case 4:
                return c1152yn.f48235i.f48348j;
            case 5:
                return c1152yn.f48235i.f48333a;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: l */
    protected static final C1164yz m19784l(C1151ym c1151ym, int i) {
        C1151ym c1151ym2 = c1151ym.f48181f;
        if (c1151ym2 == null) {
            return null;
        }
        C1152yn c1152yn = c1151ym2.f48179d;
        AbstractC1174zi abstractC1174zi = i == 0 ? c1152yn.f48234h : c1152yn.f48235i;
        EnumC1150yl enumC1150yl = c1151ym2.f48180e;
        EnumC1150yl enumC1150yl2 = EnumC1150yl.NONE;
        switch (enumC1150yl.ordinal()) {
            case 1:
            case 2:
                return abstractC1174zi.f48347i;
            case 3:
            case 4:
                return abstractC1174zi.f48348j;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public long mo19725a() {
        C1166za c1166za = this.f48344f;
        if (c1166za.f48313i) {
            return c1166za.f48310f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo19726b();

    /* JADX INFO: renamed from: c */
    public abstract void mo19727c();

    /* JADX INFO: renamed from: d */
    public abstract void mo19728d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo19729e();

    @Override // p000.InterfaceC1162yx
    /* JADX INFO: renamed from: f */
    public void mo19730f() {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    protected final int m19785h(int i, int i2) {
        if (i2 == 0) {
            C1152yn c1152yn = this.f48342d;
            int i3 = c1152yn.f48250x;
            int iMax = Math.max(c1152yn.f48249w, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            return iMax == i ? i : iMax;
        }
        C1152yn c1152yn2 = this.f48342d;
        int i4 = c1152yn2.f48185A;
        int iMax2 = Math.max(c1152yn2.f48252z, i);
        if (i4 > 0) {
            iMax2 = Math.min(i4, i);
        }
        return iMax2 == i ? i : iMax2;
    }

    /* JADX INFO: renamed from: i */
    protected final void m19786i(C1164yz c1164yz, C1164yz c1164yz2, int i, C1166za c1166za) {
        c1164yz.f48315k.add(c1164yz2);
        c1164yz.f48315k.add(this.f48344f);
        c1164yz.f48311g = i;
        c1164yz.f48312h = c1166za;
        c1164yz2.f48314j.add(c1164yz);
        c1166za.f48314j.add(c1164yz);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [ze] */
    /* JADX WARN: Type inference failed for: r7v2, types: [zi] */
    /* JADX WARN: Type inference failed for: r7v5, types: [zg] */
    /* JADX INFO: renamed from: m */
    protected final void m19787m(C1151ym c1151ym, C1151ym c1151ym2, int i) {
        C1166za c1166za;
        float f;
        int i2;
        C1164yz c1164yzM19783k = m19783k(c1151ym);
        C1164yz c1164yzM19783k2 = m19783k(c1151ym2);
        if (c1164yzM19783k.f48313i && c1164yzM19783k2.f48313i) {
            int iM19651b = c1164yzM19783k.f48310f + c1151ym.m19651b();
            int iM19651b2 = c1164yzM19783k2.f48310f - c1151ym2.m19651b();
            C1166za c1166za2 = this.f48344f;
            int i3 = iM19651b2 - iM19651b;
            if (!c1166za2.f48313i && this.f48349k == 3) {
                switch (this.f48341c) {
                    case 0:
                        c1166za2.mo19740c(m19785h(i3, i));
                        break;
                    case 1:
                        this.f48344f.mo19740c(Math.min(m19785h(c1166za2.f48325m, i), i3));
                        break;
                    case 2:
                        C1152yn c1152yn = this.f48342d;
                        C1152yn c1152yn2 = c1152yn.f48206V;
                        if (c1152yn2 != null) {
                            C1166za c1166za3 = (i == 0 ? c1152yn2.f48234h : c1152yn2.f48235i).f48344f;
                            if (c1166za3.f48313i) {
                                c1166za2.mo19740c(m19785h((int) ((c1166za3.f48310f * (i == 0 ? c1152yn.f48251y : c1152yn.f48186B)) + 0.5f), i));
                            }
                        }
                        break;
                    case 3:
                        C1152yn c1152yn3 = this.f48342d;
                        ?? r7 = c1152yn3.f48234h;
                        if (r7.f48349k == 3 && r7.f48341c == 3) {
                            C1172zg c1172zg = c1152yn3.f48235i;
                            if (c1172zg.f48349k != 3 || c1172zg.f48341c != 3) {
                                if (i == 0) {
                                    r7 = c1152yn3.f48235i;
                                }
                                c1166za = r7.f48344f;
                                if (c1166za.f48313i) {
                                    f = c1152yn3.f48209Y;
                                    if (i == 1) {
                                        i2 = (int) ((c1166za.f48310f / f) + 0.5f);
                                    } else {
                                        i2 = (int) ((f * c1166za.f48310f) + 0.5f);
                                    }
                                    c1166za2.mo19740c(i2);
                                }
                            }
                        } else {
                            if (i == 0) {
                                r7 = c1152yn3.f48235i;
                            }
                            c1166za = r7.f48344f;
                            if (c1166za.f48313i) {
                                f = c1152yn3.f48209Y;
                                if (i == 1) {
                                    i2 = (int) ((c1166za.f48310f / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * c1166za.f48310f) + 0.5f);
                                }
                                c1166za2.mo19740c(i2);
                            }
                        }
                        break;
                }
            }
            C1166za c1166za4 = this.f48344f;
            if (c1166za4.f48313i) {
                int i4 = c1166za4.f48310f;
                if (i4 == i3) {
                    this.f48347i.mo19740c(iM19651b);
                    this.f48348j.mo19740c(iM19651b2);
                    return;
                }
                float f2 = i == 0 ? this.f48342d.f48217af : this.f48342d.f48218ag;
                if (c1164yzM19783k == c1164yzM19783k2) {
                    iM19651b = c1164yzM19783k.f48310f;
                    iM19651b2 = c1164yzM19783k2.f48310f;
                    f2 = 0.5f;
                }
                this.f48347i.mo19740c((int) (iM19651b + 0.5f + (((iM19651b2 - iM19651b) - i4) * f2)));
                this.f48348j.mo19740c(this.f48347i.f48310f + this.f48344f.f48310f);
            }
        }
    }
}
