package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class whd {
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m23969a(jm4 jm4Var, ui3 ui3Var, vi3 vi3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        ui3 ui3Var2;
        int i4;
        vi3 vi3Var2;
        int i5;
        boolean z;
        tj3 tj3Var;
        vi3 vi3Var3;
        ui3 ui3Var3;
        x18 x18VarM22143u;
        p84 p84Var;
        ui3 ui3Var4;
        Object objM22097O;
        Object objM22097O2;
        Object objM22097O3;
        Object objM22097O4;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1600930291);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22120g(jm4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                ui3Var2 = ui3Var;
                i3 |= tj3Var2.m22124i(ui3Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    vi3Var2 = vi3Var;
                    if (tj3Var2.m22124i(vi3Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var2.m22099R(i3 & 1, z)) {
                    p84Var = we1.f66679a;
                    if (i6 != 0) {
                        objM22097O4 = tj3Var2.m22097O();
                        if (objM22097O4 == p84Var) {
                            objM22097O4 = new C3288l7(7);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        ui3Var4 = (ui3) objM22097O4;
                    } else {
                        ui3Var4 = ui3Var2;
                    }
                    if (i4 != 0) {
                        objM22097O3 = tj3Var2.m22097O();
                        if (objM22097O3 == p84Var) {
                            objM22097O3 = new qy3(10);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        vi3Var2 = (vi3) objM22097O3;
                    }
                    fe9 fe9Var = (fe9) tj3Var2.m22128k(ge9.f40637a);
                    C0269z c0269zM1154g = AbstractC0231g.m1154g(true, tj3Var2, 6, 2);
                    objM22097O = tj3Var2.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = AbstractC0278f.m1260j("");
                        tj3Var2.m22131l0(objM22097O);
                    }
                    t66 t66Var = (t66) objM22097O;
                    objM22097O2 = tj3Var2.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = AbstractC0278f.m1260j("");
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    tj3Var = tj3Var2;
                    ui3Var2 = ui3Var4;
                    AbstractC0231g.m1150c(ui3Var2, null, c0269zM1154g, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(-583413265, new hn0(7, vi3Var2, (t66) objM22097O2, fe9Var, jm4Var, t66Var), tj3Var2), tj3Var, (i3 >> 3) & 14, 3072, 8186);
                    vi3Var3 = vi3Var2;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    vi3Var3 = vi3Var2;
                }
                ui3Var3 = ui3Var2;
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new dz1(jm4Var, ui3Var3, vi3Var3, i, i2, 3);
                }
            }
            i3 |= 384;
            vi3Var2 = vi3Var;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var2.m22099R(i3 & 1, z)) {
                p84Var = we1.f66679a;
                if (i6 != 0) {
                    objM22097O4 = tj3Var2.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new C3288l7(7);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    ui3Var4 = (ui3) objM22097O4;
                } else {
                    ui3Var4 = ui3Var2;
                }
                if (i4 != 0) {
                    objM22097O3 = tj3Var2.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new qy3(10);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    vi3Var2 = (vi3) objM22097O3;
                }
                fe9 fe9Var2 = (fe9) tj3Var2.m22128k(ge9.f40637a);
                C0269z c0269zM1154g2 = AbstractC0231g.m1154g(true, tj3Var2, 6, 2);
                objM22097O = tj3Var2.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j("");
                    tj3Var2.m22131l0(objM22097O);
                }
                t66 t66Var2 = (t66) objM22097O;
                objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = AbstractC0278f.m1260j("");
                    tj3Var2.m22131l0(objM22097O2);
                }
                tj3Var = tj3Var2;
                ui3Var2 = ui3Var4;
                AbstractC0231g.m1150c(ui3Var2, null, c0269zM1154g2, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(-583413265, new hn0(7, vi3Var2, (t66) objM22097O2, fe9Var2, jm4Var, t66Var2), tj3Var2), tj3Var, (i3 >> 3) & 14, 3072, 8186);
                vi3Var3 = vi3Var2;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                vi3Var3 = vi3Var2;
            }
            ui3Var3 = ui3Var2;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new dz1(jm4Var, ui3Var3, vi3Var3, i, i2, 3);
            }
        }
        i3 |= 48;
        ui3Var2 = ui3Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                vi3Var2 = vi3Var;
                if (tj3Var2.m22124i(vi3Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var2.m22099R(i3 & 1, z)) {
                p84Var = we1.f66679a;
                if (i6 != 0) {
                    objM22097O4 = tj3Var2.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new C3288l7(7);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    ui3Var4 = (ui3) objM22097O4;
                } else {
                    ui3Var4 = ui3Var2;
                }
                if (i4 != 0) {
                    objM22097O3 = tj3Var2.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new qy3(10);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    vi3Var2 = (vi3) objM22097O3;
                }
                fe9 fe9Var3 = (fe9) tj3Var2.m22128k(ge9.f40637a);
                C0269z c0269zM1154g3 = AbstractC0231g.m1154g(true, tj3Var2, 6, 2);
                objM22097O = tj3Var2.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j("");
                    tj3Var2.m22131l0(objM22097O);
                }
                t66 t66Var3 = (t66) objM22097O;
                objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = AbstractC0278f.m1260j("");
                    tj3Var2.m22131l0(objM22097O2);
                }
                tj3Var = tj3Var2;
                ui3Var2 = ui3Var4;
                AbstractC0231g.m1150c(ui3Var2, null, c0269zM1154g3, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(-583413265, new hn0(7, vi3Var2, (t66) objM22097O2, fe9Var3, jm4Var, t66Var3), tj3Var2), tj3Var, (i3 >> 3) & 14, 3072, 8186);
                vi3Var3 = vi3Var2;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                vi3Var3 = vi3Var2;
            }
            ui3Var3 = ui3Var2;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new dz1(jm4Var, ui3Var3, vi3Var3, i, i2, 3);
            }
        }
        i3 |= 384;
        vi3Var2 = vi3Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var2.m22099R(i3 & 1, z)) {
            p84Var = we1.f66679a;
            if (i6 != 0) {
                objM22097O4 = tj3Var2.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O4);
                }
                ui3Var4 = (ui3) objM22097O4;
            } else {
                ui3Var4 = ui3Var2;
            }
            if (i4 != 0) {
                objM22097O3 = tj3Var2.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new qy3(10);
                    tj3Var2.m22131l0(objM22097O3);
                }
                vi3Var2 = (vi3) objM22097O3;
            }
            fe9 fe9Var4 = (fe9) tj3Var2.m22128k(ge9.f40637a);
            C0269z c0269zM1154g4 = AbstractC0231g.m1154g(true, tj3Var2, 6, 2);
            objM22097O = tj3Var2.m22097O();
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j("");
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var4 = (t66) objM22097O;
            objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j("");
                tj3Var2.m22131l0(objM22097O2);
            }
            tj3Var = tj3Var2;
            ui3Var2 = ui3Var4;
            AbstractC0231g.m1150c(ui3Var2, null, c0269zM1154g4, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(-583413265, new hn0(7, vi3Var2, (t66) objM22097O2, fe9Var4, jm4Var, t66Var4), tj3Var2), tj3Var, (i3 >> 3) & 14, 3072, 8186);
            vi3Var3 = vi3Var2;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            vi3Var3 = vi3Var2;
        }
        ui3Var3 = ui3Var2;
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dz1(jm4Var, ui3Var3, vi3Var3, i, i2, 3);
        }
    }
}
