package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xid {
    /* JADX WARN: Code duplicated, block: B:100:0x016a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0171  */
    /* JADX WARN: Code duplicated, block: B:104:0x0174  */
    /* JADX WARN: Code duplicated, block: B:108:0x017e  */
    /* JADX WARN: Code duplicated, block: B:112:0x018c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0196  */
    /* JADX WARN: Code duplicated, block: B:118:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0137  */
    /* JADX WARN: Code duplicated, block: B:90:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0143  */
    /* JADX WARN: Code duplicated, block: B:97:0x015f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0167  */
    /* JADX INFO: renamed from: a */
    public static final void m24555a(f35 f35Var, int i, c55 c55Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i2) {
        int i3;
        p84 p84Var;
        boolean z;
        Object objM22097O;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objM22097O2;
        boolean z5;
        Object objM22097O3;
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-595434597);
        if ((i2 & 6) == 0) {
            i3 = (tj3Var.m22120g(f35Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var.m22116e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var.m22124i(c55Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= tj3Var.m22124i(vi3Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= tj3Var.m22124i(vi3Var2) ? 16384 : 8192;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            lk0 lk0Var = f35Var.f38341a;
            boolean z6 = lk0Var.f49753a;
            int i4 = lk0Var.f49754b;
            int i5 = lk0Var.f49755c;
            int i6 = i3 & 7168;
            int i7 = i3 & 14;
            int i8 = i3 & 57344;
            boolean zM22124i = (i6 == 2048) | (i7 == 4) | (i8 == 16384) | tj3Var.m22124i(c55Var);
            Object objM22097O4 = tj3Var.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (zM22124i || objM22097O4 == p84Var2) {
                objM22097O4 = new g91(vi3Var, f35Var, vi3Var2, c55Var);
                tj3Var.m22131l0(objM22097O4);
            }
            ui3 ui3Var = (ui3) objM22097O4;
            boolean z7 = i6 == 2048;
            Object objM22097O5 = tj3Var.m22097O();
            if (z7 || objM22097O5 == p84Var2) {
                objM22097O5 = new fl4(vi3Var, 23);
                tj3Var.m22131l0(objM22097O5);
            }
            int i9 = i3;
            xgc.m24513b(z6, i4, i5, ui3Var, (ui3) objM22097O5, tj3Var, 0);
            gm6 gm6Var = f35Var.f38342b;
            boolean z8 = gm6Var.f41011a;
            int i10 = gm6Var.f41012b;
            int i11 = gm6Var.f41013c;
            boolean z9 = (i8 == 16384) | (i6 == 2048) | (i7 == 4);
            Object objM22097O6 = tj3Var.m22097O();
            if (z9) {
                p84Var = p84Var2;
            } else {
                p84Var = p84Var2;
                if (objM22097O6 == p84Var) {
                }
                ui3 ui3Var2 = (ui3) objM22097O6;
                if (i6 == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objM22097O = tj3Var.m22097O();
                if (z || objM22097O == p84Var) {
                    objM22097O = new fl4(vi3Var, 24);
                    tj3Var.m22131l0(objM22097O);
                }
                xgc.m24512a(z8, i10, i11, ui3Var2, (ui3) objM22097O, tj3Var, 0);
                if (f35Var.f38343c.f64023a) {
                    tj3Var.m22111b0(-375631589);
                    if (i6 == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((i9 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z3 | z2;
                    objM22097O2 = tj3Var.m22097O();
                    if (z4 || objM22097O2 == p84Var) {
                        objM22097O2 = new C3390nz(vi3Var, i, 7);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    ui3 ui3Var3 = (ui3) objM22097O2;
                    z5 = i6 == 2048;
                    objM22097O3 = tj3Var.m22097O();
                    if (z5 || objM22097O3 == p84Var) {
                        objM22097O3 = new fl4(vi3Var, 25);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    m24556b(ui3Var3, (ui3) objM22097O3, tj3Var, 0);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-375404793);
                    tj3Var.m22139q(false);
                }
            }
            objM22097O6 = new zg0(vi3Var, vi3Var2, f35Var, 15);
            tj3Var.m22131l0(objM22097O6);
            ui3 ui3Var4 = (ui3) objM22097O6;
            if (i6 == 2048) {
                z = true;
            } else {
                z = false;
            }
            objM22097O = tj3Var.m22097O();
            if (z) {
                objM22097O = new fl4(vi3Var, 24);
                tj3Var.m22131l0(objM22097O);
            } else {
                objM22097O = new fl4(vi3Var, 24);
                tj3Var.m22131l0(objM22097O);
            }
            xgc.m24512a(z8, i10, i11, ui3Var4, (ui3) objM22097O, tj3Var, 0);
            if (f35Var.f38343c.f64023a) {
                tj3Var.m22111b0(-375631589);
                if (i6 == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i9 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z3 | z2;
                objM22097O2 = tj3Var.m22097O();
                if (z4) {
                    objM22097O2 = new C3390nz(vi3Var, i, 7);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new C3390nz(vi3Var, i, 7);
                    tj3Var.m22131l0(objM22097O2);
                }
                ui3 ui3Var5 = (ui3) objM22097O2;
                if (i6 == 2048) {
                }
                objM22097O3 = tj3Var.m22097O();
                if (z5) {
                    objM22097O3 = new fl4(vi3Var, 25);
                    tj3Var.m22131l0(objM22097O3);
                } else {
                    objM22097O3 = new fl4(vi3Var, 25);
                    tj3Var.m22131l0(objM22097O3);
                }
                m24556b(ui3Var5, (ui3) objM22097O3, tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-375404793);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3144je(f35Var, i, c55Var, vi3Var, vi3Var2, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m24556b(ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1826786959);
        int i2 = i | (tj3Var2.m22124i(ui3Var) ? 4 : 2) | (tj3Var2.m22124i(ui3Var2) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var = tj3Var2;
            q2d.m19625a(ui3Var2, ci8.m4703P(1460146391, new C0839c9(20, ui3Var), tj3Var2), null, ci8.m4703P(1304165849, new C0839c9(21, ui3Var2), tj3Var2), null, xtb.f68778c, xtb.f68779d, null, 0L, 0L, 0L, 0L, null, tj3Var, ((i2 >> 3) & 14) | 1772592, 16276);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cw0(ui3Var, ui3Var2, i, 4);
        }
    }
}
