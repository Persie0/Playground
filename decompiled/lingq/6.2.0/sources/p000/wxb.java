package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.onboarding.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wxb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f67490a = new C0282a(297552141, false, new td1(26));

    /* JADX WARN: Code duplicated, block: B:100:0x0171  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x0164  */
    /* JADX INFO: renamed from: a */
    public static final void m24202a(final int i, final List list, final String str, final vi3 vi3Var, final boolean z, final ui3 ui3Var, String str2, Integer num, ye1 ye1Var, final int i2, final int i3) {
        int i4;
        String str3;
        int i5;
        Integer num2;
        int i6;
        int i7;
        boolean z2;
        tj3 tj3Var;
        final String str4;
        final Integer num3;
        x18 x18VarM22143u;
        String strM23620a0;
        String strM23620a1;
        list.getClass();
        str.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-806941681);
        if ((i2 & 6) == 0) {
            i4 = (tj3Var2.m22116e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var2.m22124i(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= tj3Var2.m22120g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= tj3Var2.m22124i(vi3Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= tj3Var2.m22122h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= tj3Var2.m22124i(ui3Var) ? 131072 : 65536;
        }
        int i8 = i2 & 1572864;
        b16 b16Var = b16.f7762a;
        if (i8 == 0) {
            i4 |= tj3Var2.m22120g(b16Var) ? 1048576 : 524288;
        }
        int i9 = i3 & 128;
        if (i9 == 0) {
            if ((12582912 & i2) == 0) {
                str3 = str2;
                i4 |= tj3Var2.m22120g(str3) ? 8388608 : 4194304;
            }
            i5 = i3 & 256;
            if (i5 != 0) {
                if ((100663296 & i2) == 0) {
                    num2 = num;
                    if (tj3Var2.m22120g(num2)) {
                        i6 = 67108864;
                    } else {
                        i6 = 33554432;
                    }
                    i4 |= i6;
                }
                i7 = i4;
                if ((i4 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var2.m22099R(i7 & 1, z2)) {
                    strM23620a0 = null;
                    if (i9 != 0) {
                        str4 = null;
                    } else {
                        str4 = str3;
                    }
                    if (i5 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (str4 != null) {
                        tj3Var2.m22111b0(1918137233);
                        strM23620a1 = vz1.m23618Z(i, new Object[]{str4}, tj3Var2);
                    } else {
                        tj3Var2.m22111b0(1918138503);
                        strM23620a1 = vz1.m23620a0(tj3Var2, i);
                    }
                    tj3Var2.m22139q(false);
                    if (num3 == null) {
                        tj3Var2.m22111b0(-667190952);
                    } else {
                        tj3Var2.m22111b0(-667190951);
                        strM23620a0 = vz1.m23620a0(tj3Var2, num3.intValue());
                    }
                    tj3Var2.m22139q(false);
                    int i10 = i7 >> 6;
                    tj3Var = tj3Var2;
                    gxb.m12966b(strM23620a1, z, vz1.m23620a0(tj3Var2, R$string.onboarding_v2_continue), ui3Var, b16Var, strM23620a0, ci8.m4703P(-514255907, new t75(list, str, vi3Var, 3), tj3Var2), tj3Var, (i10 & 7168) | ((i7 >> 9) & 112) | 1572864 | (57344 & i10), 0);
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    str4 = str3;
                    num3 = num2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: qw6
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            wxb.m24202a(i, list, str, vi3Var, z, ui3Var, str4, num3, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            num2 = num;
            i7 = i4;
            if ((i4 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var2.m22099R(i7 & 1, z2)) {
                strM23620a0 = null;
                if (i9 != 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                if (i5 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (str4 != null) {
                    tj3Var2.m22111b0(1918137233);
                    strM23620a1 = vz1.m23618Z(i, new Object[]{str4}, tj3Var2);
                } else {
                    tj3Var2.m22111b0(1918138503);
                    strM23620a1 = vz1.m23620a0(tj3Var2, i);
                }
                tj3Var2.m22139q(false);
                if (num3 == null) {
                    tj3Var2.m22111b0(-667190952);
                } else {
                    tj3Var2.m22111b0(-667190951);
                    strM23620a0 = vz1.m23620a0(tj3Var2, num3.intValue());
                }
                tj3Var2.m22139q(false);
                int i11 = i7 >> 6;
                tj3Var = tj3Var2;
                gxb.m12966b(strM23620a1, z, vz1.m23620a0(tj3Var2, R$string.onboarding_v2_continue), ui3Var, b16Var, strM23620a0, ci8.m4703P(-514255907, new t75(list, str, vi3Var, 3), tj3Var2), tj3Var, (i11 & 7168) | ((i7 >> 9) & 112) | 1572864 | (57344 & i11), 0);
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                str4 = str3;
                num3 = num2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: qw6
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        wxb.m24202a(i, list, str, vi3Var, z, ui3Var, str4, num3, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i4 |= 12582912;
        str3 = str2;
        i5 = i3 & 256;
        if (i5 != 0) {
            if ((100663296 & i2) == 0) {
                num2 = num;
                if (tj3Var2.m22120g(num2)) {
                    i6 = 67108864;
                } else {
                    i6 = 33554432;
                }
                i4 |= i6;
            }
            i7 = i4;
            if ((i4 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var2.m22099R(i7 & 1, z2)) {
                strM23620a0 = null;
                if (i9 != 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                if (i5 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (str4 != null) {
                    tj3Var2.m22111b0(1918137233);
                    strM23620a1 = vz1.m23618Z(i, new Object[]{str4}, tj3Var2);
                } else {
                    tj3Var2.m22111b0(1918138503);
                    strM23620a1 = vz1.m23620a0(tj3Var2, i);
                }
                tj3Var2.m22139q(false);
                if (num3 == null) {
                    tj3Var2.m22111b0(-667190952);
                } else {
                    tj3Var2.m22111b0(-667190951);
                    strM23620a0 = vz1.m23620a0(tj3Var2, num3.intValue());
                }
                tj3Var2.m22139q(false);
                int i12 = i7 >> 6;
                tj3Var = tj3Var2;
                gxb.m12966b(strM23620a1, z, vz1.m23620a0(tj3Var2, R$string.onboarding_v2_continue), ui3Var, b16Var, strM23620a0, ci8.m4703P(-514255907, new t75(list, str, vi3Var, 3), tj3Var2), tj3Var, (i12 & 7168) | ((i7 >> 9) & 112) | 1572864 | (57344 & i12), 0);
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                str4 = str3;
                num3 = num2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: qw6
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        wxb.m24202a(i, list, str, vi3Var, z, ui3Var, str4, num3, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i4 |= 100663296;
        num2 = num;
        i7 = i4;
        if ((i4 & 38347923) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (tj3Var2.m22099R(i7 & 1, z2)) {
            strM23620a0 = null;
            if (i9 != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
            if (i5 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (str4 != null) {
                tj3Var2.m22111b0(1918137233);
                strM23620a1 = vz1.m23618Z(i, new Object[]{str4}, tj3Var2);
            } else {
                tj3Var2.m22111b0(1918138503);
                strM23620a1 = vz1.m23620a0(tj3Var2, i);
            }
            tj3Var2.m22139q(false);
            if (num3 == null) {
                tj3Var2.m22111b0(-667190952);
            } else {
                tj3Var2.m22111b0(-667190951);
                strM23620a0 = vz1.m23620a0(tj3Var2, num3.intValue());
            }
            tj3Var2.m22139q(false);
            int i13 = i7 >> 6;
            tj3Var = tj3Var2;
            gxb.m12966b(strM23620a1, z, vz1.m23620a0(tj3Var2, R$string.onboarding_v2_continue), ui3Var, b16Var, strM23620a0, ci8.m4703P(-514255907, new t75(list, str, vi3Var, 3), tj3Var2), tj3Var, (i13 & 7168) | ((i7 >> 9) & 112) | 1572864 | (57344 & i13), 0);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            str4 = str3;
            num3 = num2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: qw6
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wxb.m24202a(i, list, str, vi3Var, z, ui3Var, str4, num3, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                    return xfa.f68157a;
                }
            };
        }
    }
}
