package com.lingq.core.playlists;

import androidx.compose.runtime.AbstractC0278f;
import p000.C0839c9;
import p000.C3144je;
import p000.C3288l7;
import p000.apb;
import p000.ci8;
import p000.d32;
import p000.ey0;
import p000.lr1;
import p000.p84;
import p000.q2d;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.vi3;
import p000.we1;
import p000.x18;
import p000.xfa;
import p000.ye1;
import p000.yy0;
import p000.z93;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.playlists.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1825a {
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0147  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m8506a(String str, ui3 ui3Var, vi3 vi3Var, ui3 ui3Var2, ye1 ye1Var, int i, int i2) {
        int i3;
        ui3 ui3Var3;
        int i4;
        boolean z;
        tj3 tj3Var;
        ui3 ui3Var4;
        x18 x18VarM22143u;
        p84 p84Var;
        ui3 ui3Var5;
        Object objM22097O;
        Object objM22097O2;
        z93 z93Var;
        Object objM22097O3;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objM22097O4;
        Object objM22097O5;
        ui3Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-600888852);
        if ((i & 48) == 0) {
            i3 = (tj3Var2.m22120g(str) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var2.m22124i(ui3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                ui3Var3 = ui3Var2;
                i3 |= tj3Var2.m22124i(ui3Var3) ? 16384 : 8192;
            }
            i4 = 1;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var2.m22099R(i3 & 1, z)) {
                p84Var = we1.f66679a;
                if (i5 != 0) {
                    objM22097O5 = tj3Var2.m22097O();
                    if (objM22097O5 == p84Var) {
                        objM22097O5 = new C3288l7(7);
                        tj3Var2.m22131l0(objM22097O5);
                    }
                    ui3Var5 = (ui3) objM22097O5;
                } else {
                    ui3Var5 = ui3Var3;
                }
                objM22097O = tj3Var2.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j("");
                    tj3Var2.m22131l0(objM22097O);
                }
                t66 t66Var = (t66) objM22097O;
                objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new z93();
                    tj3Var2.m22131l0(objM22097O2);
                }
                z93Var = (z93) objM22097O2;
                objM22097O3 = tj3Var2.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new CreatePlaylistDialogKt$CreatePlaylistDialog$3$1(z93Var, null);
                    tj3Var2.m22131l0(objM22097O3);
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O3, xfa.f68157a);
                String str2 = (String) t66Var.getValue();
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((57344 & i3) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z2 | z3;
                objM22097O4 = tj3Var2.m22097O();
                if (z4 || objM22097O4 == p84Var) {
                    objM22097O4 = new CreatePlaylistDialogKt$CreatePlaylistDialog$4$1(str, ui3Var5, null);
                    tj3Var2.m22131l0(objM22097O4);
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O4, str2);
                tj3Var = tj3Var2;
                q2d.m19625a(ui3Var, ci8.m4703P(523006516, new yy0(vi3Var, t66Var, i4), tj3Var2), null, ci8.m4703P(1969587382, new C0839c9(4, ui3Var), tj3Var2), null, apb.f7342c, ci8.m4703P(-155508615, new lr1(z93Var, str, vi3Var, t66Var), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, ((i3 >> 6) & 14) | 1772592, 16276);
                ui3Var4 = ui3Var5;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                ui3Var4 = ui3Var3;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new C3144je(str, ui3Var, vi3Var, ui3Var4, i, i2);
            }
        }
        i3 |= 24576;
        ui3Var3 = ui3Var2;
        i4 = 1;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var2.m22099R(i3 & 1, z)) {
            p84Var = we1.f66679a;
            if (i5 != 0) {
                objM22097O5 = tj3Var2.m22097O();
                if (objM22097O5 == p84Var) {
                    objM22097O5 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O5);
                }
                ui3Var5 = (ui3) objM22097O5;
            } else {
                ui3Var5 = ui3Var3;
            }
            objM22097O = tj3Var2.m22097O();
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j("");
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var2 = (t66) objM22097O;
            objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new z93();
                tj3Var2.m22131l0(objM22097O2);
            }
            z93Var = (z93) objM22097O2;
            objM22097O3 = tj3Var2.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new CreatePlaylistDialogKt$CreatePlaylistDialog$3$1(z93Var, null);
                tj3Var2.m22131l0(objM22097O3);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O3, xfa.f68157a);
            String str3 = (String) t66Var2.getValue();
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((57344 & i3) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z2 | z3;
            objM22097O4 = tj3Var2.m22097O();
            if (z4) {
                objM22097O4 = new CreatePlaylistDialogKt$CreatePlaylistDialog$4$1(str, ui3Var5, null);
                tj3Var2.m22131l0(objM22097O4);
            } else {
                objM22097O4 = new CreatePlaylistDialogKt$CreatePlaylistDialog$4$1(str, ui3Var5, null);
                tj3Var2.m22131l0(objM22097O4);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O4, str3);
            tj3Var = tj3Var2;
            q2d.m19625a(ui3Var, ci8.m4703P(523006516, new yy0(vi3Var, t66Var2, i4), tj3Var2), null, ci8.m4703P(1969587382, new C0839c9(4, ui3Var), tj3Var2), null, apb.f7342c, ci8.m4703P(-155508615, new lr1(z93Var, str, vi3Var, t66Var2), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, ((i3 >> 6) & 14) | 1772592, 16276);
            ui3Var4 = ui3Var5;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            ui3Var4 = ui3Var3;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3144je(str, ui3Var, vi3Var, ui3Var4, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x016a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0176  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m8507b(String str, String str2, ui3 ui3Var, vi3 vi3Var, ui3 ui3Var2, ye1 ye1Var, int i, int i2) {
        String str3;
        int i3;
        ui3 ui3Var3;
        boolean z;
        tj3 tj3Var;
        ui3 ui3Var4;
        x18 x18VarM22143u;
        p84 p84Var;
        ui3 ui3Var5;
        boolean z2;
        Object objM22097O;
        Object objM22097O2;
        z93 z93Var;
        Object objM22097O3;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objM22097O4;
        Object objM22097O5;
        str.getClass();
        ui3Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1194274483);
        if ((i & 48) == 0) {
            str3 = str;
            i3 = (tj3Var2.m22120g(str3) ? 32 : 16) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var2.m22120g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var2.m22124i(ui3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                ui3Var3 = ui3Var2;
                i3 |= tj3Var2.m22124i(ui3Var3) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var2.m22099R(i3 & 1, z)) {
                p84Var = we1.f66679a;
                if (i4 != 0) {
                    objM22097O5 = tj3Var2.m22097O();
                    if (objM22097O5 == p84Var) {
                        objM22097O5 = new C3288l7(7);
                        tj3Var2.m22131l0(objM22097O5);
                    }
                    ui3Var5 = (ui3) objM22097O5;
                } else {
                    ui3Var5 = ui3Var3;
                }
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objM22097O = tj3Var2.m22097O();
                if (z2 || objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j(str3);
                    tj3Var2.m22131l0(objM22097O);
                }
                t66 t66Var = (t66) objM22097O;
                objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new z93();
                    tj3Var2.m22131l0(objM22097O2);
                }
                z93Var = (z93) objM22097O2;
                objM22097O3 = tj3Var2.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new CreatePlaylistDialogKt$EditPlaylistDialog$3$1(z93Var, null);
                    tj3Var2.m22131l0(objM22097O3);
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O3, xfa.f68157a);
                String str4 = (String) t66Var.getValue();
                if ((i3 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((458752 & i3) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z3 | z4;
                objM22097O4 = tj3Var2.m22097O();
                if (z5 || objM22097O4 == p84Var) {
                    objM22097O4 = new CreatePlaylistDialogKt$EditPlaylistDialog$4$1(str2, ui3Var5, null);
                    tj3Var2.m22131l0(objM22097O4);
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O4, str4);
                tj3Var = tj3Var2;
                q2d.m19625a(ui3Var, ci8.m4703P(-1306799253, new yy0(vi3Var, t66Var, 2), tj3Var2), null, ci8.m4703P(-325844439, new C0839c9(5, ui3Var), tj3Var2), null, apb.f7347h, ci8.m4703P(-1001895866, new lr1(z93Var, str2, t66Var, vi3Var), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, ((i3 >> 9) & 14) | 1772592, 16276);
                ui3Var4 = ui3Var5;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                ui3Var4 = ui3Var3;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new ey0(str, str2, ui3Var, vi3Var, ui3Var4, i, i2);
            }
        }
        i3 |= 196608;
        ui3Var3 = ui3Var2;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var2.m22099R(i3 & 1, z)) {
            p84Var = we1.f66679a;
            if (i4 != 0) {
                objM22097O5 = tj3Var2.m22097O();
                if (objM22097O5 == p84Var) {
                    objM22097O5 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O5);
                }
                ui3Var5 = (ui3) objM22097O5;
            } else {
                ui3Var5 = ui3Var3;
            }
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objM22097O = tj3Var2.m22097O();
            if (z2) {
                objM22097O = AbstractC0278f.m1260j(str3);
                tj3Var2.m22131l0(objM22097O);
            } else {
                objM22097O = AbstractC0278f.m1260j(str3);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var2 = (t66) objM22097O;
            objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new z93();
                tj3Var2.m22131l0(objM22097O2);
            }
            z93Var = (z93) objM22097O2;
            objM22097O3 = tj3Var2.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new CreatePlaylistDialogKt$EditPlaylistDialog$3$1(z93Var, null);
                tj3Var2.m22131l0(objM22097O3);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O3, xfa.f68157a);
            String str5 = (String) t66Var2.getValue();
            if ((i3 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((458752 & i3) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z3 | z4;
            objM22097O4 = tj3Var2.m22097O();
            if (z5) {
                objM22097O4 = new CreatePlaylistDialogKt$EditPlaylistDialog$4$1(str2, ui3Var5, null);
                tj3Var2.m22131l0(objM22097O4);
            } else {
                objM22097O4 = new CreatePlaylistDialogKt$EditPlaylistDialog$4$1(str2, ui3Var5, null);
                tj3Var2.m22131l0(objM22097O4);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O4, str5);
            tj3Var = tj3Var2;
            q2d.m19625a(ui3Var, ci8.m4703P(-1306799253, new yy0(vi3Var, t66Var2, 2), tj3Var2), null, ci8.m4703P(-325844439, new C0839c9(5, ui3Var), tj3Var2), null, apb.f7347h, ci8.m4703P(-1001895866, new lr1(z93Var, str2, t66Var2, vi3Var), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, ((i3 >> 9) & 14) | 1772592, 16276);
            ui3Var4 = ui3Var5;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            ui3Var4 = ui3Var3;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ey0(str, str2, ui3Var, vi3Var, ui3Var4, i, i2);
        }
    }
}
