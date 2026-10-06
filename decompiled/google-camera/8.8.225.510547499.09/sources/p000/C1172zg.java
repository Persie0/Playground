package p000;

import com.google.lens.sdk.LensApi;

/* JADX INFO: renamed from: zg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1172zg extends AbstractC1174zi {

    /* JADX INFO: renamed from: a */
    public final C1164yz f48333a;

    /* JADX INFO: renamed from: b */
    C1166za f48334b;

    public C1172zg(C1152yn c1152yn) {
        super(c1152yn);
        C1164yz c1164yz = new C1164yz(this);
        this.f48333a = c1164yz;
        this.f48334b = null;
        this.f48347i.f48316l = 6;
        this.f48348j.f48316l = 7;
        c1164yz.f48316l = 8;
        this.f48345g = 1;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:120:0x0300  */
    /* JADX WARN: Code duplicated, block: B:122:0x031e  */
    /* JADX WARN: Code duplicated, block: B:125:0x032b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0333  */
    /* JADX WARN: Code duplicated, block: B:129:0x0339  */
    /* JADX WARN: Code duplicated, block: B:130:0x0355  */
    /* JADX WARN: Code duplicated, block: B:132:0x035d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0363  */
    /* JADX WARN: Code duplicated, block: B:136:0x0382  */
    /* JADX WARN: Code duplicated, block: B:137:0x038d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0394  */
    /* JADX WARN: Code duplicated, block: B:141:0x039a  */
    /* JADX WARN: Code duplicated, block: B:142:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:148:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:151:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:153:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:155:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:158:0x0415  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: b */
    public final void mo19726b() {
        C1152yn c1152yn;
        C1152yn c1152yn2;
        C1151ym[] c1151ymArr;
        C1151ym c1151ym;
        C1151ym c1151ym2;
        C1151ym c1151ym3;
        C1151ym c1151ym4;
        C1152yn c1152yn3;
        C1152yn c1152yn4;
        C1170ze c1170ze;
        C1164yz c1164yzK;
        C1164yz c1164yzK2;
        C1164yz c1164yzK3;
        C1152yn c1152yn5;
        C1170ze c1170ze2;
        C1152yn c1152yn6;
        C1152yn c1152yn7 = this.f48342d;
        if (c1152yn7.f48231e) {
            this.f48344f.mo19740c(c1152yn7.m19687h());
        }
        if (!this.f48344f.f48313i) {
            this.f48349k = this.f48342d.m19681P();
            if (this.f48342d.f48191G) {
                this.f48334b = new C1166za(this);
            }
            if (this.f48349k != 3) {
                if (this.f48349k == 4 && (c1152yn6 = this.f48342d.f48206V) != null && c1152yn6.m19681P() == 1) {
                    int iM19687h = (c1152yn6.m19687h() - this.f48342d.f48196L.m19651b()) - this.f48342d.f48198N.m19651b();
                    m19782j(this.f48347i, c1152yn6.f48235i.f48347i, this.f48342d.f48196L.m19651b());
                    m19782j(this.f48348j, c1152yn6.f48235i.f48348j, -this.f48342d.f48198N.m19651b());
                    this.f48344f.mo19740c(iM19687h);
                    return;
                }
                if (this.f48349k == 1) {
                    this.f48344f.mo19740c(this.f48342d.m19687h());
                }
            }
        } else if (this.f48349k == 4 && (c1152yn = this.f48342d.f48206V) != null && c1152yn.m19681P() == 1) {
            m19782j(this.f48347i, c1152yn.f48235i.f48347i, this.f48342d.f48196L.m19651b());
            m19782j(this.f48348j, c1152yn.f48235i.f48348j, -this.f48342d.f48198N.m19651b());
            return;
        }
        C1166za c1166za = this.f48344f;
        if (!c1166za.f48313i) {
            if (this.f48349k == 3) {
                C1152yn c1152yn8 = this.f48342d;
                switch (c1152yn8.f48247u) {
                    case 2:
                        C1152yn c1152yn9 = c1152yn8.f48206V;
                        if (c1152yn9 != null) {
                            C1166za c1166za2 = c1152yn9.f48235i.f48344f;
                            c1166za.f48315k.add(c1166za2);
                            c1166za2.f48314j.add(this.f48344f);
                            C1166za c1166za3 = this.f48344f;
                            c1166za3.f48306b = true;
                            c1166za3.f48314j.add(this.f48347i);
                            this.f48344f.f48314j.add(this.f48348j);
                        }
                        break;
                    case 3:
                        if (!c1152yn8.m19677L()) {
                            C1152yn c1152yn10 = this.f48342d;
                            if (c1152yn10.f48246t != 3) {
                                C1166za c1166za4 = c1152yn10.f48234h.f48344f;
                                this.f48344f.f48315k.add(c1166za4);
                                c1166za4.f48314j.add(this.f48344f);
                                C1166za c1166za5 = this.f48344f;
                                c1166za5.f48306b = true;
                                c1166za5.f48314j.add(this.f48347i);
                                this.f48344f.f48314j.add(this.f48348j);
                            }
                        }
                        break;
                }
            }
            c1152yn2 = this.f48342d;
            c1151ymArr = c1152yn2.f48203S;
            c1151ym = c1151ymArr[2];
            c1151ym2 = c1151ym.f48181f;
            if (c1151ym2 == null && c1151ymArr[3].f48181f != null) {
                if (c1152yn2.m19677L()) {
                    this.f48347i.f48309e = this.f48342d.f48203S[2].m19651b();
                    this.f48348j.f48309e = -this.f48342d.f48203S[3].m19651b();
                } else {
                    C1164yz c1164yzK4 = m19783k(this.f48342d.f48203S[2]);
                    C1164yz c1164yzK5 = m19783k(this.f48342d.f48203S[3]);
                    if (c1164yzK4 != null) {
                        c1164yzK4.m19738a(this);
                    }
                    if (c1164yzK5 != null) {
                        c1164yzK5.m19738a(this);
                    }
                    this.f48350l = 4;
                }
                if (this.f48342d.f48191G) {
                    m19786i(this.f48333a, this.f48347i, 1, this.f48334b);
                }
            } else if (c1151ym2 != null) {
                c1164yzK3 = m19783k(c1151ym);
                if (c1164yzK3 != null) {
                    m19782j(this.f48347i, c1164yzK3, this.f48342d.f48203S[2].m19651b());
                    m19786i(this.f48348j, this.f48347i, 1, this.f48344f);
                    if (this.f48342d.f48191G) {
                        m19786i(this.f48333a, this.f48347i, 1, this.f48334b);
                    }
                    if (this.f48349k == 3) {
                        c1152yn5 = this.f48342d;
                        if (c1152yn5.f48209Y > 0.0f) {
                            c1170ze2 = c1152yn5.f48234h;
                            if (c1170ze2.f48349k == 3) {
                                c1170ze2.f48344f.f48314j.add(this.f48344f);
                                this.f48344f.f48315k.add(this.f48342d.f48234h.f48344f);
                                this.f48344f.f48305a = this;
                            }
                        }
                    }
                }
            } else {
                c1151ym3 = c1151ymArr[3];
                if (c1151ym3.f48181f != null) {
                    c1164yzK2 = m19783k(c1151ym3);
                    if (c1164yzK2 != null) {
                        m19782j(this.f48348j, c1164yzK2, -this.f48342d.f48203S[3].m19651b());
                        m19786i(this.f48347i, this.f48348j, -1, this.f48344f);
                        if (this.f48342d.f48191G) {
                            m19786i(this.f48333a, this.f48347i, 1, this.f48334b);
                        }
                    }
                } else {
                    c1151ym4 = c1151ymArr[4];
                    if (c1151ym4.f48181f != null) {
                        c1164yzK = m19783k(c1151ym4);
                        if (c1164yzK != null) {
                            m19782j(this.f48333a, c1164yzK, 0);
                            m19786i(this.f48347i, this.f48333a, -1, this.f48334b);
                            m19786i(this.f48348j, this.f48347i, 1, this.f48344f);
                        }
                    } else if (!(c1152yn2 instanceof C1156yr) && (c1152yn3 = c1152yn2.f48206V) != null) {
                        m19782j(this.f48347i, c1152yn3.f48235i.f48347i, c1152yn2.m19691l());
                        m19786i(this.f48348j, this.f48347i, 1, this.f48344f);
                        if (this.f48342d.f48191G) {
                            m19786i(this.f48333a, this.f48347i, 1, this.f48334b);
                        }
                        if (this.f48349k == 3) {
                            c1152yn4 = this.f48342d;
                            if (c1152yn4.f48209Y > 0.0f) {
                                c1170ze = c1152yn4.f48234h;
                                if (c1170ze.f48349k == 3) {
                                    c1170ze.f48344f.f48314j.add(this.f48344f);
                                    this.f48344f.f48315k.add(this.f48342d.f48234h.f48344f);
                                    this.f48344f.f48305a = this;
                                }
                            }
                        }
                    }
                }
            }
            if (this.f48344f.f48315k.size() == 0) {
                this.f48344f.f48307c = true;
            }
        }
        C1152yn c1152yn11 = this.f48342d;
        if (c1152yn11.f48231e) {
            C1151ym[] c1151ymArr2 = c1152yn11.f48203S;
            C1151ym c1151ym5 = c1151ymArr2[2];
            C1151ym c1151ym6 = c1151ym5.f48181f;
            if (c1151ym6 != null && c1151ymArr2[3].f48181f != null) {
                if (c1152yn11.m19677L()) {
                    this.f48347i.f48309e = this.f48342d.f48203S[2].m19651b();
                    this.f48348j.f48309e = -this.f48342d.f48203S[3].m19651b();
                } else {
                    C1164yz c1164yzK6 = m19783k(this.f48342d.f48203S[2]);
                    if (c1164yzK6 != null) {
                        m19782j(this.f48347i, c1164yzK6, this.f48342d.f48203S[2].m19651b());
                    }
                    C1164yz c1164yzK7 = m19783k(this.f48342d.f48203S[3]);
                    if (c1164yzK7 != null) {
                        m19782j(this.f48348j, c1164yzK7, -this.f48342d.f48203S[3].m19651b());
                    }
                    this.f48347i.f48306b = true;
                    this.f48348j.f48306b = true;
                }
                C1152yn c1152yn12 = this.f48342d;
                if (c1152yn12.f48191G) {
                    m19782j(this.f48333a, this.f48347i, c1152yn12.f48214ac);
                    return;
                }
                return;
            }
            if (c1151ym6 != null) {
                C1164yz c1164yzK8 = m19783k(c1151ym5);
                if (c1164yzK8 != null) {
                    m19782j(this.f48347i, c1164yzK8, this.f48342d.f48203S[2].m19651b());
                    m19782j(this.f48348j, this.f48347i, this.f48344f.f48310f);
                    C1152yn c1152yn13 = this.f48342d;
                    if (c1152yn13.f48191G) {
                        m19782j(this.f48333a, this.f48347i, c1152yn13.f48214ac);
                        return;
                    }
                    return;
                }
                return;
            }
            C1151ym c1151ym7 = c1151ymArr2[3];
            if (c1151ym7.f48181f != null) {
                C1164yz c1164yzK9 = m19783k(c1151ym7);
                if (c1164yzK9 != null) {
                    m19782j(this.f48348j, c1164yzK9, -this.f48342d.f48203S[3].m19651b());
                    m19782j(this.f48347i, this.f48348j, -this.f48344f.f48310f);
                }
                C1152yn c1152yn14 = this.f48342d;
                if (c1152yn14.f48191G) {
                    m19782j(this.f48333a, this.f48347i, c1152yn14.f48214ac);
                    return;
                }
                return;
            }
            C1151ym c1151ym8 = c1151ymArr2[4];
            if (c1151ym8.f48181f != null) {
                C1164yz c1164yzK10 = m19783k(c1151ym8);
                if (c1164yzK10 != null) {
                    m19782j(this.f48333a, c1164yzK10, 0);
                    m19782j(this.f48347i, this.f48333a, -this.f48342d.f48214ac);
                    m19782j(this.f48348j, this.f48347i, this.f48344f.f48310f);
                    return;
                }
                return;
            }
            if ((c1152yn11 instanceof C1156yr) || c1152yn11.f48206V == null || c1152yn11.mo19692m(EnumC1150yl.CENTER).f48181f != null) {
                return;
            }
            C1152yn c1152yn15 = this.f48342d;
            m19782j(this.f48347i, c1152yn15.f48206V.f48235i.f48347i, c1152yn15.m19691l());
            m19782j(this.f48348j, this.f48347i, this.f48344f.f48310f);
            C1152yn c1152yn16 = this.f48342d;
            if (c1152yn16.f48191G) {
                m19782j(this.f48333a, this.f48347i, c1152yn16.f48214ac);
                return;
            }
            return;
        }
        c1166za.m19738a(this);
        c1152yn2 = this.f48342d;
        c1151ymArr = c1152yn2.f48203S;
        c1151ym = c1151ymArr[2];
        c1151ym2 = c1151ym.f48181f;
        if (c1151ym2 == null) {
            if (c1151ym2 != null) {
                c1164yzK3 = m19783k(c1151ym);
                if (c1164yzK3 != null) {
                    m19782j(this.f48347i, c1164yzK3, this.f48342d.f48203S[2].m19651b());
                    m19786i(this.f48348j, this.f48347i, 1, this.f48344f);
                    if (this.f48342d.f48191G) {
                        m19786i(this.f48333a, this.f48347i, 1, this.f48334b);
                    }
                    if (this.f48349k == 3) {
                        c1152yn5 = this.f48342d;
                        if (c1152yn5.f48209Y > 0.0f) {
                            c1170ze2 = c1152yn5.f48234h;
                            if (c1170ze2.f48349k == 3) {
                                c1170ze2.f48344f.f48314j.add(this.f48344f);
                                this.f48344f.f48315k.add(this.f48342d.f48234h.f48344f);
                                this.f48344f.f48305a = this;
                            }
                        }
                    }
                }
            } else {
                c1151ym3 = c1151ymArr[3];
                if (c1151ym3.f48181f != null) {
                    c1164yzK2 = m19783k(c1151ym3);
                    if (c1164yzK2 != null) {
                        m19782j(this.f48348j, c1164yzK2, -this.f48342d.f48203S[3].m19651b());
                        m19786i(this.f48347i, this.f48348j, -1, this.f48344f);
                        if (this.f48342d.f48191G) {
                            m19786i(this.f48333a, this.f48347i, 1, this.f48334b);
                        }
                    }
                } else {
                    c1151ym4 = c1151ymArr[4];
                    if (c1151ym4.f48181f != null) {
                        c1164yzK = m19783k(c1151ym4);
                        if (c1164yzK != null) {
                            m19782j(this.f48333a, c1164yzK, 0);
                            m19786i(this.f48347i, this.f48333a, -1, this.f48334b);
                            m19786i(this.f48348j, this.f48347i, 1, this.f48344f);
                        }
                    } else if (!(c1152yn2 instanceof C1156yr)) {
                        m19782j(this.f48347i, c1152yn3.f48235i.f48347i, c1152yn2.m19691l());
                        m19786i(this.f48348j, this.f48347i, 1, this.f48344f);
                        if (this.f48342d.f48191G) {
                            m19786i(this.f48333a, this.f48347i, 1, this.f48334b);
                        }
                        if (this.f48349k == 3) {
                            c1152yn4 = this.f48342d;
                            if (c1152yn4.f48209Y > 0.0f) {
                                c1170ze = c1152yn4.f48234h;
                                if (c1170ze.f48349k == 3) {
                                    c1170ze.f48344f.f48314j.add(this.f48344f);
                                    this.f48344f.f48315k.add(this.f48342d.f48234h.f48344f);
                                    this.f48344f.f48305a = this;
                                }
                            }
                        }
                    }
                }
            }
        } else if (c1151ym2 != null) {
            c1164yzK3 = m19783k(c1151ym);
            if (c1164yzK3 != null) {
                m19782j(this.f48347i, c1164yzK3, this.f48342d.f48203S[2].m19651b());
                m19786i(this.f48348j, this.f48347i, 1, this.f48344f);
                if (this.f48342d.f48191G) {
                    m19786i(this.f48333a, this.f48347i, 1, this.f48334b);
                }
                if (this.f48349k == 3) {
                    c1152yn5 = this.f48342d;
                    if (c1152yn5.f48209Y > 0.0f) {
                        c1170ze2 = c1152yn5.f48234h;
                        if (c1170ze2.f48349k == 3) {
                            c1170ze2.f48344f.f48314j.add(this.f48344f);
                            this.f48344f.f48315k.add(this.f48342d.f48234h.f48344f);
                            this.f48344f.f48305a = this;
                        }
                    }
                }
            }
        } else {
            c1151ym3 = c1151ymArr[3];
            if (c1151ym3.f48181f != null) {
                c1164yzK2 = m19783k(c1151ym3);
                if (c1164yzK2 != null) {
                    m19782j(this.f48348j, c1164yzK2, -this.f48342d.f48203S[3].m19651b());
                    m19786i(this.f48347i, this.f48348j, -1, this.f48344f);
                    if (this.f48342d.f48191G) {
                        m19786i(this.f48333a, this.f48347i, 1, this.f48334b);
                    }
                }
            } else {
                c1151ym4 = c1151ymArr[4];
                if (c1151ym4.f48181f != null) {
                    c1164yzK = m19783k(c1151ym4);
                    if (c1164yzK != null) {
                        m19782j(this.f48333a, c1164yzK, 0);
                        m19786i(this.f48347i, this.f48333a, -1, this.f48334b);
                        m19786i(this.f48348j, this.f48347i, 1, this.f48344f);
                    }
                } else if (!(c1152yn2 instanceof C1156yr)) {
                    m19782j(this.f48347i, c1152yn3.f48235i.f48347i, c1152yn2.m19691l());
                    m19786i(this.f48348j, this.f48347i, 1, this.f48344f);
                    if (this.f48342d.f48191G) {
                        m19786i(this.f48333a, this.f48347i, 1, this.f48334b);
                    }
                    if (this.f48349k == 3) {
                        c1152yn4 = this.f48342d;
                        if (c1152yn4.f48209Y > 0.0f) {
                            c1170ze = c1152yn4.f48234h;
                            if (c1170ze.f48349k == 3) {
                                c1170ze.f48344f.f48314j.add(this.f48344f);
                                this.f48344f.f48315k.add(this.f48342d.f48234h.f48344f);
                                this.f48344f.f48305a = this;
                            }
                        }
                    }
                }
            }
        }
        if (this.f48344f.f48315k.size() == 0) {
            this.f48344f.f48307c = true;
        }
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: c */
    public final void mo19727c() {
        C1164yz c1164yz = this.f48347i;
        if (c1164yz.f48313i) {
            this.f48342d.f48213ab = c1164yz.f48310f;
        }
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: d */
    public final void mo19728d() {
        this.f48343e = null;
        this.f48347i.m19739b();
        this.f48348j.m19739b();
        this.f48333a.m19739b();
        this.f48344f.m19739b();
        this.f48346h = false;
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: e */
    public final boolean mo19729e() {
        return this.f48349k != 3 || this.f48342d.f48247u == 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m19777g() {
        this.f48346h = false;
        this.f48347i.m19739b();
        this.f48347i.f48313i = false;
        this.f48348j.m19739b();
        this.f48348j.f48313i = false;
        this.f48333a.m19739b();
        this.f48333a.f48313i = false;
        this.f48344f.f48313i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.f48342d.f48221aj));
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
                m19787m(c1152yn.f48196L, c1152yn.f48198N, 1);
                return;
            default:
                C1166za c1166za = this.f48344f;
                if (c1166za.f48307c && !c1166za.f48313i && this.f48349k == 3) {
                    C1152yn c1152yn2 = this.f48342d;
                    switch (c1152yn2.f48247u) {
                        case 2:
                            C1152yn c1152yn3 = c1152yn2.f48206V;
                            if (c1152yn3 != null) {
                                C1166za c1166za2 = c1152yn3.f48235i.f48344f;
                                if (c1166za2.f48313i) {
                                    c1166za.mo19740c((int) ((c1166za2.f48310f * c1152yn2.f48186B) + 0.5f));
                                }
                            }
                            break;
                        case 3:
                            C1166za c1166za3 = c1152yn2.f48234h.f48344f;
                            if (c1166za3.f48313i) {
                                switch (c1152yn2.f48210Z) {
                                    case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                                        i = (int) ((c1166za3.f48310f / c1152yn2.f48209Y) + 0.5f);
                                        break;
                                    case 0:
                                        i = (int) ((c1166za3.f48310f * c1152yn2.f48209Y) + 0.5f);
                                        break;
                                    default:
                                        i = (int) ((c1166za3.f48310f / c1152yn2.f48209Y) + 0.5f);
                                        break;
                                }
                                c1166za.mo19740c(i);
                            }
                            break;
                    }
                }
                C1164yz c1164yz = this.f48347i;
                if (c1164yz.f48307c) {
                    C1164yz c1164yz2 = this.f48348j;
                    if (c1164yz2.f48307c) {
                        if (c1164yz.f48313i && c1164yz2.f48313i && this.f48344f.f48313i) {
                            return;
                        }
                        if (!this.f48344f.f48313i && this.f48349k == 3) {
                            C1152yn c1152yn4 = this.f48342d;
                            if (c1152yn4.f48246t == 0 && !c1152yn4.m19677L()) {
                                C1164yz c1164yz3 = (C1164yz) this.f48347i.f48315k.get(0);
                                C1164yz c1164yz4 = (C1164yz) this.f48348j.f48315k.get(0);
                                int i4 = c1164yz3.f48310f;
                                C1164yz c1164yz5 = this.f48347i;
                                int i5 = i4 + c1164yz5.f48309e;
                                int i6 = c1164yz4.f48310f + this.f48348j.f48309e;
                                c1164yz5.mo19740c(i5);
                                this.f48348j.mo19740c(i6);
                                this.f48344f.mo19740c(i6 - i5);
                                return;
                            }
                        }
                        if (!this.f48344f.f48313i && this.f48349k == 3 && this.f48341c == 1 && this.f48347i.f48315k.size() > 0 && this.f48348j.f48315k.size() > 0) {
                            C1164yz c1164yz6 = (C1164yz) this.f48347i.f48315k.get(0);
                            C1164yz c1164yz7 = (C1164yz) this.f48348j.f48315k.get(0);
                            int i7 = c1164yz6.f48310f + this.f48347i.f48309e;
                            int i8 = c1164yz7.f48310f + this.f48348j.f48309e;
                            C1166za c1166za4 = this.f48344f;
                            int i9 = c1166za4.f48325m;
                            int i10 = i8 - i7;
                            if (i10 < i9) {
                                c1166za4.mo19740c(i10);
                            } else {
                                c1166za4.mo19740c(i9);
                            }
                        }
                        if (this.f48344f.f48313i && this.f48347i.f48315k.size() > 0 && this.f48348j.f48315k.size() > 0) {
                            C1164yz c1164yz8 = (C1164yz) this.f48347i.f48315k.get(0);
                            C1164yz c1164yz9 = (C1164yz) this.f48348j.f48315k.get(0);
                            int i11 = c1164yz8.f48310f;
                            C1164yz c1164yz10 = this.f48347i;
                            int i12 = c1164yz10.f48309e + i11;
                            int i13 = c1164yz9.f48310f;
                            int i14 = this.f48348j.f48309e + i13;
                            float f = this.f48342d.f48218ag;
                            if (c1164yz8 == c1164yz9) {
                                f = 0.5f;
                            }
                            if (c1164yz8 != c1164yz9) {
                                i13 = i14;
                            }
                            if (c1164yz8 != c1164yz9) {
                                i11 = i12;
                            }
                            c1164yz10.mo19740c((int) (i11 + 0.5f + (((i13 - i11) - this.f48344f.f48310f) * f)));
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
