package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class txb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f63074a = new C0282a(-1415746269, false, new sd1(16));

    /* JADX INFO: renamed from: a */
    public static final void m22335a(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str, String str2, boolean z) {
        long j;
        str.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-114704323);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | (tj3Var.m22120g(e16Var) ? 16384 : 8192);
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            e16 e16VarM21995i = te1.m21995i(1.0f, e16Var, false);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            if (z) {
                tj3Var.m22111b0(1637843453);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1637920116);
                tj3Var.m22139q(false);
                j = aa1.f411j;
            }
            bq1.m4038N(ui3Var, e16VarM21995i, false, si8Var, te1.m21999m(0, 14, j, 0L, tj3Var), null, ci8.m4714a(1.0f, aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A)), ci8.m4703P(-1423922702, new wd5(str2, 4, str), tj3Var), tj3Var, ((i2 >> 9) & 14) | 100663296, 164);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ow6(str, str2, z, ui3Var, e16Var, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00db  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x0150  */
    /* JADX WARN: Code duplicated, block: B:67:0x015c  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m22336b(String str, boolean z, ui3 ui3Var, y27 y27Var, o39 o39Var, jl1 jl1Var, e16 e16Var, ye1 ye1Var, int i, int i2) {
        o39 o39Var2;
        int i3;
        int i4;
        jl1 jl1Var2;
        int i5;
        int i6;
        boolean z2;
        jl1 jl1Var3;
        e16 e16Var2;
        x18 x18VarM22143u;
        jl1 jl1Var4;
        int i7;
        o39 o39Var3;
        jl1 jl1Var5;
        e16 e16Var3;
        vh9 vh9Var;
        long j;
        str.getClass();
        ui3Var.getClass();
        y27Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(579139052);
        int i8 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | (tj3Var.m22124i(y27Var) ? 2048 : 1024);
        if ((i2 & 16) == 0) {
            o39Var2 = o39Var;
            int i9 = tj3Var.m22120g(o39Var2) ? 16384 : 8192;
            i3 = i8 | i9;
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((i & 196608) == 0) {
                    jl1Var2 = jl1Var;
                    if (tj3Var.m22120g(jl1Var2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 1572864;
                if ((599187 & i6) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var.m22099R(i6 & 1, z2)) {
                    tj3Var.m22104W();
                    if ((i & 1) != 0 || tj3Var.m22084B()) {
                        if ((i2 & 16) != 0) {
                            o39Var2 = ui8.f63972a;
                            i6 &= -57345;
                        }
                        if (i4 != 0) {
                            jl1Var4 = hl1.f42564a;
                        } else {
                            jl1Var4 = jl1Var2;
                        }
                        i7 = i6;
                        o39Var3 = o39Var2;
                        jl1Var5 = jl1Var4;
                        e16Var3 = b16.f7762a;
                    } else {
                        tj3Var.m22102U();
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                        }
                        e16Var3 = e16Var;
                        i7 = i6;
                        o39Var3 = o39Var2;
                        jl1Var5 = jl1Var2;
                    }
                    tj3Var.m22140r();
                    e16 e16VarM4412e = c99.m4412e(e16Var3, 1.0f);
                    vh9Var = ps5.f56764b;
                    si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
                    if (z) {
                        tj3Var.m22111b0(248329646);
                        j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r;
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(248406309);
                        tj3Var.m22139q(false);
                        j = aa1.f411j;
                    }
                    bq1.m4038N(ui3Var, e16VarM4412e, false, si8Var, te1.m21999m(0, 14, j, 0L, tj3Var), null, ci8.m4714a(1.0f, aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A)), ci8.m4703P(1052201121, new C3357n2(y27Var, o39Var3, jl1Var5, str), tj3Var), tj3Var, ((i7 >> 6) & 14) | 100663296, 164);
                    tj3Var = tj3Var;
                    o39Var2 = o39Var3;
                    e16Var2 = e16Var3;
                    jl1Var3 = jl1Var5;
                } else {
                    tj3Var.m22102U();
                    jl1Var3 = jl1Var2;
                    e16Var2 = e16Var;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new pz5(str, z, ui3Var, y27Var, o39Var2, jl1Var3, e16Var2, i, i2);
                }
            }
            i3 |= 196608;
            jl1Var2 = jl1Var;
            i6 = i3 | 1572864;
            if ((599187 & i6) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var.m22099R(i6 & 1, z2)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if ((i2 & 16) != 0) {
                        o39Var2 = ui8.f63972a;
                        i6 &= -57345;
                    }
                    if (i4 != 0) {
                        jl1Var4 = hl1.f42564a;
                    } else {
                        jl1Var4 = jl1Var2;
                    }
                    i7 = i6;
                    o39Var3 = o39Var2;
                    jl1Var5 = jl1Var4;
                    e16Var3 = b16.f7762a;
                } else {
                    if ((i2 & 16) != 0) {
                        o39Var2 = ui8.f63972a;
                        i6 &= -57345;
                    }
                    if (i4 != 0) {
                        jl1Var4 = hl1.f42564a;
                    } else {
                        jl1Var4 = jl1Var2;
                    }
                    i7 = i6;
                    o39Var3 = o39Var2;
                    jl1Var5 = jl1Var4;
                    e16Var3 = b16.f7762a;
                }
                tj3Var.m22140r();
                e16 e16VarM4412e2 = c99.m4412e(e16Var3, 1.0f);
                vh9Var = ps5.f56764b;
                si8 si8Var2 = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
                if (z) {
                    tj3Var.m22111b0(248329646);
                    j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(248406309);
                    tj3Var.m22139q(false);
                    j = aa1.f411j;
                }
                bq1.m4038N(ui3Var, e16VarM4412e2, false, si8Var2, te1.m21999m(0, 14, j, 0L, tj3Var), null, ci8.m4714a(1.0f, aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A)), ci8.m4703P(1052201121, new C3357n2(y27Var, o39Var3, jl1Var5, str), tj3Var), tj3Var, ((i7 >> 6) & 14) | 100663296, 164);
                tj3Var = tj3Var;
                o39Var2 = o39Var3;
                e16Var2 = e16Var3;
                jl1Var3 = jl1Var5;
            } else {
                tj3Var.m22102U();
                jl1Var3 = jl1Var2;
                e16Var2 = e16Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new pz5(str, z, ui3Var, y27Var, o39Var2, jl1Var3, e16Var2, i, i2);
            }
        }
        o39Var2 = o39Var;
        i3 = i8 | i9;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((i & 196608) == 0) {
                jl1Var2 = jl1Var;
                if (tj3Var.m22120g(jl1Var2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i6 = i3 | 1572864;
            if ((599187 & i6) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var.m22099R(i6 & 1, z2)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if ((i2 & 16) != 0) {
                        o39Var2 = ui8.f63972a;
                        i6 &= -57345;
                    }
                    if (i4 != 0) {
                        jl1Var4 = hl1.f42564a;
                    } else {
                        jl1Var4 = jl1Var2;
                    }
                    i7 = i6;
                    o39Var3 = o39Var2;
                    jl1Var5 = jl1Var4;
                    e16Var3 = b16.f7762a;
                } else {
                    if ((i2 & 16) != 0) {
                        o39Var2 = ui8.f63972a;
                        i6 &= -57345;
                    }
                    if (i4 != 0) {
                        jl1Var4 = hl1.f42564a;
                    } else {
                        jl1Var4 = jl1Var2;
                    }
                    i7 = i6;
                    o39Var3 = o39Var2;
                    jl1Var5 = jl1Var4;
                    e16Var3 = b16.f7762a;
                }
                tj3Var.m22140r();
                e16 e16VarM4412e3 = c99.m4412e(e16Var3, 1.0f);
                vh9Var = ps5.f56764b;
                si8 si8Var3 = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
                if (z) {
                    tj3Var.m22111b0(248329646);
                    j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(248406309);
                    tj3Var.m22139q(false);
                    j = aa1.f411j;
                }
                bq1.m4038N(ui3Var, e16VarM4412e3, false, si8Var3, te1.m21999m(0, 14, j, 0L, tj3Var), null, ci8.m4714a(1.0f, aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A)), ci8.m4703P(1052201121, new C3357n2(y27Var, o39Var3, jl1Var5, str), tj3Var), tj3Var, ((i7 >> 6) & 14) | 100663296, 164);
                tj3Var = tj3Var;
                o39Var2 = o39Var3;
                e16Var2 = e16Var3;
                jl1Var3 = jl1Var5;
            } else {
                tj3Var.m22102U();
                jl1Var3 = jl1Var2;
                e16Var2 = e16Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new pz5(str, z, ui3Var, y27Var, o39Var2, jl1Var3, e16Var2, i, i2);
            }
        }
        i3 |= 196608;
        jl1Var2 = jl1Var;
        i6 = i3 | 1572864;
        if ((599187 & i6) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (tj3Var.m22099R(i6 & 1, z2)) {
            tj3Var.m22104W();
            if ((i & 1) != 0) {
                if ((i2 & 16) != 0) {
                    o39Var2 = ui8.f63972a;
                    i6 &= -57345;
                }
                if (i4 != 0) {
                    jl1Var4 = hl1.f42564a;
                } else {
                    jl1Var4 = jl1Var2;
                }
                i7 = i6;
                o39Var3 = o39Var2;
                jl1Var5 = jl1Var4;
                e16Var3 = b16.f7762a;
            } else {
                if ((i2 & 16) != 0) {
                    o39Var2 = ui8.f63972a;
                    i6 &= -57345;
                }
                if (i4 != 0) {
                    jl1Var4 = hl1.f42564a;
                } else {
                    jl1Var4 = jl1Var2;
                }
                i7 = i6;
                o39Var3 = o39Var2;
                jl1Var5 = jl1Var4;
                e16Var3 = b16.f7762a;
            }
            tj3Var.m22140r();
            e16 e16VarM4412e4 = c99.m4412e(e16Var3, 1.0f);
            vh9Var = ps5.f56764b;
            si8 si8Var4 = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            if (z) {
                tj3Var.m22111b0(248329646);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(248406309);
                tj3Var.m22139q(false);
                j = aa1.f411j;
            }
            bq1.m4038N(ui3Var, e16VarM4412e4, false, si8Var4, te1.m21999m(0, 14, j, 0L, tj3Var), null, ci8.m4714a(1.0f, aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A)), ci8.m4703P(1052201121, new C3357n2(y27Var, o39Var3, jl1Var5, str), tj3Var), tj3Var, ((i7 >> 6) & 14) | 100663296, 164);
            tj3Var = tj3Var;
            o39Var2 = o39Var3;
            e16Var2 = e16Var3;
            jl1Var3 = jl1Var5;
        } else {
            tj3Var.m22102U();
            jl1Var3 = jl1Var2;
            e16Var2 = e16Var;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new pz5(str, z, ui3Var, y27Var, o39Var2, jl1Var3, e16Var2, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m22337c(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str, String str2, boolean z) {
        e16 e16Var2;
        long j;
        str.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1042967137);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | 3072 | (tj3Var.m22120g(str2) ? 16384 : 8192);
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            if (z) {
                tj3Var.m22111b0(1240935321);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1241011984);
                tj3Var.m22139q(false);
                j = aa1.f411j;
            }
            bq1.m4038N(ui3Var, e16VarM4412e, false, si8Var, te1.m21999m(0, 14, j, 0L, tj3Var), null, ci8.m4714a(1.0f, aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A)), ci8.m4703P(-276817140, new wd5(str2, 2, str), tj3Var), tj3Var, ((i2 >> 6) & 14) | 100663296, 164);
            tj3Var = tj3Var;
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ow6(str, z, ui3Var, e16Var2, str2, i, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m22338d(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str, String str2, boolean z) {
        e16 e16Var2;
        long j;
        str.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-16943734);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | 3072 | (tj3Var.m22120g(str2) ? 16384 : 8192);
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            e16Var2 = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(e16Var2, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            if (z) {
                tj3Var.m22111b0(2035735568);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2035812231);
                tj3Var.m22139q(false);
                j = aa1.f411j;
            }
            bq1.m4038N(ui3Var, e16VarM4412e, false, si8Var, te1.m21999m(0, 14, j, 0L, tj3Var), null, ci8.m4714a(1.0f, aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A)), ci8.m4703P(-456305419, new wd5(str2, 3, str), tj3Var), tj3Var, ((i2 >> 6) & 14) | 100663296, 164);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ow6(str, z, ui3Var, e16Var2, str2, i, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m22339e(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str, String str2, boolean z) {
        e16 e16Var2;
        long j;
        long jM198b;
        str.getClass();
        str2.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1277247603);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | 24576;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            if (z) {
                tj3Var.m22111b0(1368434983);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1368512142);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55872p;
                tj3Var.m22139q(false);
            }
            mn0 mn0VarM21999m = te1.m21999m(0, 14, j, 0L, tj3Var);
            if (z) {
                tj3Var.m22111b0(1368681371);
                jM198b = aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1368770651);
                jM198b = aa1.m198b(0.2f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A);
                tj3Var.m22139q(false);
            }
            bq1.m4038N(ui3Var, e16VarM4412e, false, si8Var, mn0VarM21999m, null, ci8.m4714a(1.0f, jM198b), ci8.m4703P(-31970776, new wd5(str, 1, str2), tj3Var), tj3Var, ((i2 >> 9) & 14) | 100663296, 164);
            tj3Var = tj3Var;
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ow6(str, str2, z, ui3Var, e16Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m22340f(String str, String str2, boolean z, ui3 ui3Var, e16 e16Var, String str3, ye1 ye1Var, int i) {
        e16 e16Var2;
        long j;
        long jM198b;
        str.getClass();
        str2.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-469026411);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | 24576 | (tj3Var.m22120g(str3) ? 131072 : 65536);
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            e16Var2 = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(e16Var2, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            if (z) {
                tj3Var.m22111b0(-1236798171);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1236721012);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55872p;
                tj3Var.m22139q(false);
            }
            mn0 mn0VarM21999m = te1.m21999m(0, 14, j, 0L, tj3Var);
            if (z) {
                tj3Var.m22111b0(-1236551783);
                jM198b = aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1236462503);
                jM198b = aa1.m198b(0.2f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A);
                tj3Var.m22139q(false);
            }
            bq1.m4038N(ui3Var, e16VarM4412e, false, si8Var, mn0VarM21999m, null, ci8.m4714a(1.0f, jM198b), ci8.m4703P(-2031794934, new a05(str3, str, str2, 6), tj3Var), tj3Var, ((i2 >> 9) & 14) | 100663296, 164);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new py3(str, str2, z, ui3Var, e16Var2, str3, i);
        }
    }
}
