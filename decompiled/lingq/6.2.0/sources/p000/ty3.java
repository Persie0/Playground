package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class ty3 {

    /* JADX INFO: renamed from: a */
    public static final e16 f63092a = c99.m4422o(b16.f7762a, ib9.f43908c);

    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m22351a(p04 p04Var, String str, e16 e16Var, long j, ye1 ye1Var, int i, int i2) {
        int i3;
        e16 e16Var2;
        long j2;
        boolean z;
        long j3;
        e16 e16Var3;
        x18 x18VarM22143u;
        e16 e16Var4;
        e16 e16Var5;
        long j4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-126890956);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(p04Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22120g(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                e16Var2 = e16Var;
                i3 |= tj3Var.m22120g(e16Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    int i5 = tj3Var.m22118f(j2) ? 2048 : 1024;
                    i3 |= i5;
                } else {
                    j2 = j;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i3 & 1, z)) {
                tj3Var.m22104W();
                if ((i & 1) != 0 || tj3Var.m22084B()) {
                    if (i4 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        e16Var5 = e16Var4;
                        j4 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                    } else {
                        e16Var5 = e16Var4;
                    }
                    tj3Var.m22140r();
                    m22352b(yda.m25096c(p04Var, tj3Var), str, e16Var5, j4, tj3Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
                    e16Var3 = e16Var5;
                    j3 = j4;
                } else {
                    tj3Var.m22102U();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    e16Var5 = e16Var2;
                }
                j4 = j2;
                tj3Var.m22140r();
                m22352b(yda.m25096c(p04Var, tj3Var), str, e16Var5, j4, tj3Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
                e16Var3 = e16Var5;
                j3 = j4;
            } else {
                tj3Var.m22102U();
                j3 = j2;
                e16Var3 = e16Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new sy3(p04Var, str, e16Var3, j3, i, i2, 0);
            }
        }
        i3 |= 384;
        e16Var2 = e16Var;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j2 = j;
                if (tj3Var.m22118f(j2)) {
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i3 & 1, z)) {
            tj3Var.m22104W();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    e16Var5 = e16Var4;
                    j4 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                } else {
                    e16Var5 = e16Var4;
                    j4 = j2;
                }
            } else {
                if (i4 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    e16Var5 = e16Var4;
                    j4 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                } else {
                    e16Var5 = e16Var4;
                    j4 = j2;
                }
            }
            tj3Var.m22140r();
            m22352b(yda.m25096c(p04Var, tj3Var), str, e16Var5, j4, tj3Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
            e16Var3 = e16Var5;
            j3 = j4;
        } else {
            tj3Var.m22102U();
            j3 = j2;
            e16Var3 = e16Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new sy3(p04Var, str, e16Var3, j3, i, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0115  */
    /* JADX WARN: Code duplicated, block: B:92:0x0133  */
    /* JADX WARN: Code duplicated, block: B:96:0x0155  */
    /* JADX WARN: Code duplicated, block: B:98:0x0173  */
    /* JADX INFO: renamed from: b */
    public static final void m22352b(y27 y27Var, String str, e16 e16Var, long j, ye1 ye1Var, int i, int i2) {
        int i3;
        e16 e16Var2;
        long j2;
        boolean z;
        e16 e16Var3;
        long j3;
        x18 x18VarM22143u;
        int i4;
        e16 e16Var4;
        long j4;
        boolean z2;
        Object objM22097O;
        qd0 qd0Var;
        e16 e16Var5;
        long jMo1445i;
        boolean z3;
        Object objM22097O2;
        int i5;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2142239481);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? tj3Var.m22120g(y27Var) : tj3Var.m22124i(y27Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22120g(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                e16Var2 = e16Var;
                i3 |= tj3Var.m22120g(e16Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !tj3Var.m22118f(j2)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i3 & 1, z)) {
                tj3Var.m22104W();
                i4 = i & 1;
                e16Var4 = b16.f7762a;
                if (i4 != 0 || tj3Var.m22084B()) {
                    if (i6 != 0) {
                        e16Var2 = e16Var4;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                        i3 &= -7169;
                    }
                } else {
                    tj3Var.m22102U();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                j4 = j2;
                e16 e16Var6 = e16Var2;
                tj3Var.m22140r();
                z2 = (((i3 & 7168) ^ 3072) <= 2048 && tj3Var.m22118f(j4)) || (i3 & 3072) == 2048;
                objM22097O = tj3Var.m22097O();
                p84 p84Var = we1.f66679a;
                if (z2 || objM22097O == p84Var) {
                    if (aa1.m199c(j4, aa1.f412k)) {
                        qd0Var = null;
                    } else {
                        qd0Var = new qd0(5, j4);
                    }
                    objM22097O = qd0Var;
                    tj3Var.m22131l0(objM22097O);
                }
                fa1 fa1Var = (fa1) objM22097O;
                if (str != null) {
                    tj3Var.m22111b0(-537002883);
                    if ((i3 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objM22097O2 = tj3Var.m22097O();
                    if (z3 || objM22097O2 == p84Var) {
                        objM22097O2 = new jd0(str, 9);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    e16 e16VarM17643c = nv8.m17643c(e16Var4, false, (vi3) objM22097O2);
                    tj3Var.m22139q(false);
                    e16Var5 = e16VarM17643c;
                } else {
                    tj3Var.m22111b0(-536844101);
                    tj3Var.m22139q(false);
                    e16Var5 = e16Var4;
                }
                if (x89.m24404a(y27Var.mo1445i(), 9205357640488583168L)) {
                    e16Var4 = f63092a;
                } else {
                    jMo1445i = y27Var.mo1445i();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jMo1445i >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jMo1445i & 4294967295L)))) {
                        e16Var4 = f63092a;
                    }
                }
                qh0.m19963a(AbstractC3695vr.m23484B(e16Var6.mo3161g(e16Var4), y27Var, null, hl1.f42565b, 0.0f, fa1Var, 22).mo3161g(e16Var5), tj3Var, 0);
                e16Var3 = e16Var6;
                j3 = j4;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                j3 = j2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new sy3(y27Var, str, e16Var3, j3, i, i2, 1);
            }
        }
        i3 |= 384;
        e16Var2 = e16Var;
        if ((i & 3072) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i5 = 1024;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i3 & 1, z)) {
            tj3Var.m22104W();
            i4 = i & 1;
            e16Var4 = b16.f7762a;
            if (i4 != 0) {
                if (i6 != 0) {
                    e16Var2 = e16Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                    i3 &= -7169;
                }
            } else {
                if (i6 != 0) {
                    e16Var2 = e16Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                    i3 &= -7169;
                }
            }
            j4 = j2;
            e16 e16Var7 = e16Var2;
            tj3Var.m22140r();
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            objM22097O = tj3Var.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (z2) {
                if (aa1.m199c(j4, aa1.f412k)) {
                    qd0Var = null;
                } else {
                    qd0Var = new qd0(5, j4);
                }
                objM22097O = qd0Var;
                tj3Var.m22131l0(objM22097O);
            } else {
                if (aa1.m199c(j4, aa1.f412k)) {
                    qd0Var = null;
                } else {
                    qd0Var = new qd0(5, j4);
                }
                objM22097O = qd0Var;
                tj3Var.m22131l0(objM22097O);
            }
            fa1 fa1Var2 = (fa1) objM22097O;
            if (str != null) {
                tj3Var.m22111b0(-537002883);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objM22097O2 = tj3Var.m22097O();
                if (z3) {
                    objM22097O2 = new jd0(str, 9);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new jd0(str, 9);
                    tj3Var.m22131l0(objM22097O2);
                }
                e16 e16VarM17643c2 = nv8.m17643c(e16Var4, false, (vi3) objM22097O2);
                tj3Var.m22139q(false);
                e16Var5 = e16VarM17643c2;
            } else {
                tj3Var.m22111b0(-536844101);
                tj3Var.m22139q(false);
                e16Var5 = e16Var4;
            }
            if (x89.m24404a(y27Var.mo1445i(), 9205357640488583168L)) {
                jMo1445i = y27Var.mo1445i();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jMo1445i >> 32)))) {
                    e16Var4 = f63092a;
                }
            } else {
                e16Var4 = f63092a;
            }
            qh0.m19963a(AbstractC3695vr.m23484B(e16Var7.mo3161g(e16Var4), y27Var, null, hl1.f42565b, 0.0f, fa1Var2, 22).mo3161g(e16Var5), tj3Var, 0);
            e16Var3 = e16Var7;
            j3 = j4;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
            j3 = j2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new sy3(y27Var, str, e16Var3, j3, i, i2, 1);
        }
    }
}
