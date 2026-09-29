package androidx.compose.material3;

import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.animation.core.C0059a;
import androidx.compose.material3.AbstractC0229f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.R$string;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import p000.AbstractC3393o1;
import p000.AbstractC3489q9;
import p000.C0817bn;
import p000.C2951e4;
import p000.C3186kj;
import p000.C3386nv;
import p000.C3504qn;
import p000.C3536rh;
import p000.InterfaceC3483q3;
import p000.a45;
import p000.aa1;
import p000.aj3;
import p000.am8;
import p000.b16;
import p000.bz2;
import p000.ci8;
import p000.ck0;
import p000.cz2;
import p000.d07;
import p000.d32;
import p000.e16;
import p000.fa4;
import p000.fb2;
import p000.fi3;
import p000.fs6;
import p000.gd1;
import p000.ho9;
import p000.ht5;
import p000.k59;
import p000.l43;
import p000.l77;
import p000.lj7;
import p000.ms5;
import p000.n59;
import p000.ng0;
import p000.nj0;
import p000.nv8;
import p000.o39;
import p000.oha;
import p000.p84;
import p000.pk9;
import p000.ps5;
import p000.q06;
import p000.q84;
import p000.q93;
import p000.qh0;
import p000.ra1;
import p000.rv3;
import p000.sb9;
import p000.se1;
import p000.ss5;
import p000.t17;
import p000.tf4;
import p000.tj3;
import p000.u91;
import p000.ua5;
import p000.ui3;
import p000.un1;
import p000.v56;
import p000.vf0;
import p000.vi3;
import p000.vj0;
import p000.we1;
import p000.wj0;
import p000.x17;
import p000.x18;
import p000.x49;
import p000.xc9;
import p000.xfa;
import p000.xj0;
import p000.xj2;
import p000.xpb;
import p000.xwc;
import p000.y0c;
import p000.ye1;
import p000.yj0;
import p000.yn0;
import p000.yu4;
import p000.zi3;
import p000.zj0;

/* JADX INFO: renamed from: androidx.compose.material3.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0231g {
    /* JADX WARN: Code duplicated, block: B:100:0x0113  */
    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0130  */
    /* JADX WARN: Code duplicated, block: B:109:0x0139  */
    /* JADX WARN: Code duplicated, block: B:111:0x0146  */
    /* JADX WARN: Code duplicated, block: B:125:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x016e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0171  */
    /* JADX WARN: Code duplicated, block: B:129:0x0175  */
    /* JADX WARN: Code duplicated, block: B:132:0x017b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0186  */
    /* JADX WARN: Code duplicated, block: B:136:0x018b  */
    /* JADX WARN: Code duplicated, block: B:137:0x019e  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:154:0x01db  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x0202  */
    /* JADX WARN: Code duplicated, block: B:164:0x021c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x0234  */
    /* JADX WARN: Code duplicated, block: B:171:0x024a  */
    /* JADX WARN: Code duplicated, block: B:172:0x024d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0256  */
    /* JADX WARN: Code duplicated, block: B:178:0x0259  */
    /* JADX WARN: Code duplicated, block: B:181:0x025e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0266  */
    /* JADX WARN: Code duplicated, block: B:185:0x0281  */
    /* JADX WARN: Code duplicated, block: B:188:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:190:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:196:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:198:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:204:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:207:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:210:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:213:0x0312  */
    /* JADX WARN: Code duplicated, block: B:215:0x035e  */
    /* JADX WARN: Code duplicated, block: B:218:0x0372  */
    /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:98:0x010d  */
    /* JADX INFO: renamed from: a */
    public static final void m1148a(ui3 ui3Var, e16 e16Var, boolean z, o39 o39Var, vj0 vj0Var, xj0 xj0Var, vf0 vf0Var, t17 t17Var, aj3 aj3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        o39 o39Var2;
        vj0 vj0Var2;
        xj0 xj0Var2;
        int i6;
        vf0 vf0Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        boolean z4;
        tj3 tj3Var;
        e16 e16Var2;
        boolean z5;
        o39 o39Var3;
        vj0 vj0Var3;
        t17 t17Var2;
        vf0 vf0Var3;
        xj0 xj0Var3;
        x18 x18VarM22143u;
        o39 o39VarM24271b;
        vj0 vj0VarM23998c;
        xj0 xj0VarM23997b;
        t17 t17Var3;
        o39 o39Var4;
        vf0 vf0Var4;
        boolean z6;
        Object objM22097O;
        p84 p84Var;
        v56 v56Var;
        long j;
        long j2;
        int i13;
        Object objM22097O2;
        SnapshotStateList snapshotStateList;
        boolean zM22120g;
        Object objM22097O3;
        q84 q84Var;
        float f;
        Object objM22097O4;
        C0059a c0059a;
        boolean zM22124i;
        Object objM22097O5;
        xj0 xj0Var4;
        C0817bn c0817bn;
        Object objM22097O6;
        int i14;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1310015664);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                i3 |= tj3Var2.m22120g(e16Var) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (tj3Var2.m22122h(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        o39Var2 = o39Var;
                        int i16 = tj3Var2.m22120g(o39Var2) ? 2048 : 1024;
                        i3 |= i16;
                    } else {
                        o39Var2 = o39Var;
                    }
                    i3 |= i16;
                } else {
                    o39Var2 = o39Var;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vj0Var2 = vj0Var;
                        int i17 = tj3Var2.m22120g(vj0Var2) ? 16384 : 8192;
                        i3 |= i17;
                    } else {
                        vj0Var2 = vj0Var;
                    }
                    i3 |= i17;
                } else {
                    vj0Var2 = vj0Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        xj0Var2 = xj0Var;
                        int i18 = tj3Var2.m22120g(xj0Var2) ? 131072 : 65536;
                        i3 |= i18;
                    } else {
                        xj0Var2 = xj0Var;
                    }
                    i3 |= i18;
                } else {
                    xj0Var2 = xj0Var;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    vf0Var2 = vf0Var;
                } else {
                    vf0Var2 = vf0Var;
                    if ((i & 1572864) == 0) {
                        if (tj3Var2.m22120g(vf0Var2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((i & 12582912) == 0) {
                        int i19 = i3;
                        if (tj3Var2.m22120g(t17Var)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i10 = i19 | i9;
                    }
                    if ((i2 & 256) != 0) {
                        i10 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (tj3Var2.m22120g(null)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i10 |= i11;
                    }
                    if ((i & 805306368) == 0) {
                        if (tj3Var2.m22124i(aj3Var)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i10 |= i14;
                    }
                    i12 = i10;
                    z3 = true;
                    if ((i12 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (tj3Var2.m22099R(i12 & 1, z4)) {
                        tj3Var2.m22104W();
                        if ((i & 1) != 0 || tj3Var2.m22084B()) {
                            if (i15 != 0) {
                                e16Var2 = b16.f7762a;
                            } else {
                                e16Var2 = e16Var;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                x17 x17Var = wj0.f66899a;
                                o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                                i12 &= -7169;
                            } else {
                                o39VarM24271b = o39Var2;
                            }
                            if ((i2 & 16) != 0) {
                                x17 x17Var2 = wj0.f66899a;
                                vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                                i12 &= -57345;
                            } else {
                                vj0VarM23998c = vj0Var2;
                            }
                            if ((i2 & 32) != 0) {
                                xj0VarM23997b = wj0.m23997b(31);
                                i12 &= -458753;
                            } else {
                                xj0VarM23997b = xj0Var2;
                            }
                            if (i6 != 0) {
                                vf0Var2 = null;
                            }
                            if (i8 != 0) {
                                t17Var3 = wj0.f66899a;
                            } else {
                                t17Var3 = t17Var;
                            }
                            o39Var4 = o39VarM24271b;
                            vf0Var4 = vf0Var2;
                        } else {
                            tj3Var2.m22102U();
                            if ((i2 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                            }
                            e16Var2 = e16Var;
                            t17Var3 = t17Var;
                            vf0Var4 = vf0Var2;
                            o39Var4 = o39Var2;
                            vj0VarM23998c = vj0Var2;
                            xj0VarM23997b = xj0Var2;
                        }
                        z6 = z2;
                        tj3Var2.m22140r();
                        tj3Var2.m22111b0(1691726283);
                        objM22097O = tj3Var2.m22097O();
                        p84Var = we1.f66679a;
                        if (objM22097O == p84Var) {
                            objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                        }
                        v56Var = (v56) objM22097O;
                        tj3Var2.m22139q(false);
                        if (z6) {
                            j = vj0VarM23998c.f65428a;
                        } else {
                            j = vj0VarM23998c.f65430c;
                        }
                        long j3 = j;
                        if (z6) {
                            j2 = vj0VarM23998c.f65429b;
                        } else {
                            j2 = vj0VarM23998c.f65431d;
                        }
                        if (xj0VarM23997b == null) {
                            tj3Var2.m22111b0(1691909926);
                            tj3Var2.m22139q(false);
                            i12 = i12;
                            t17Var3 = t17Var3;
                            xj0Var4 = xj0VarM23997b;
                            o39Var4 = o39Var4;
                            c0817bn = null;
                        } else {
                            tj3Var2.m22111b0(-499611589);
                            i13 = ((i12 >> 6) & 14) | ((i12 >> 9) & 896);
                            objM22097O2 = tj3Var2.m22097O();
                            if (objM22097O2 == p84Var) {
                                objM22097O2 = new SnapshotStateList();
                                tj3Var2.m22131l0(objM22097O2);
                            }
                            snapshotStateList = (SnapshotStateList) objM22097O2;
                            v56Var = v56Var;
                            zM22120g = tj3Var2.m22120g(v56Var);
                            objM22097O3 = tj3Var2.m22097O();
                            if (zM22120g || objM22097O3 == p84Var) {
                                objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                                tj3Var2.m22131l0(objM22097O3);
                            }
                            d32.m10047k(tj3Var2, (zi3) objM22097O3, v56Var);
                            q84Var = (q84) u91.m22598P0(snapshotStateList);
                            if (z6 || (q84Var instanceof lj7)) {
                                f = 0.0f;
                            } else if (q84Var instanceof rv3) {
                                f = xj0VarM23997b.f68279b;
                            } else if (q84Var instanceof q93) {
                                f = 0.0f;
                            } else {
                                f = xj0VarM23997b.f68278a;
                            }
                            objM22097O4 = tj3Var2.m22097O();
                            if (objM22097O4 == p84Var) {
                                objM22097O4 = new C0059a(new xj2(f), pk9.f56365j, null, 12);
                                tj3Var2.m22131l0(objM22097O4);
                            }
                            c0059a = (C0059a) objM22097O4;
                            xj2 xj2Var = new xj2(f);
                            boolean zM22124i2 = tj3Var2.m22124i(c0059a) | tj3Var2.m22114d(f) | ((((i13 & 14) ^ 6) <= 4 && tj3Var2.m22122h(z6)) || (i13 & 6) == 4);
                            if ((((i13 & 896) ^ 384) > 256 || !tj3Var2.m22120g(xj0VarM23997b)) && (i13 & 384) != 256) {
                            }
                            zM22124i = zM22124i2 | z3 | tj3Var2.m22124i(q84Var);
                            objM22097O5 = tj3Var2.m22097O();
                            if (!zM22124i || objM22097O5 == p84Var) {
                                xj0 xj0Var5 = xj0VarM23997b;
                                objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var5, q84Var, null);
                                xj0Var4 = xj0Var5;
                                tj3Var2.m22131l0(objM22097O5);
                            } else {
                                xj0Var4 = xj0VarM23997b;
                            }
                            d32.m10047k(tj3Var2, (zi3) objM22097O5, xj2Var);
                            c0817bn = c0059a.f1540c;
                            tj3Var2.m22139q(false);
                        }
                        float f2 = c0817bn != null ? ((xj2) ((xc9) c0817bn.f8704b).getValue()).f68285a : 0.0f;
                        objM22097O6 = tj3Var2.m22097O();
                        if (objM22097O6 == p84Var) {
                            objM22097O6 = new C2951e4(12);
                            tj3Var2.m22131l0(objM22097O6);
                        }
                        t17 t17Var4 = t17Var3;
                        int i20 = i12;
                        o39 o39Var5 = o39Var4;
                        tj3Var = tj3Var2;
                        ho9.m13415b(ui3Var, nv8.m17643c(e16Var2, false, (vi3) objM22097O6), z6, o39Var5, j3, j2, 0.0f, f2, vf0Var4, v56Var, ci8.m4703P(-535639973, new C3536rh(j2, t17Var4, aj3Var), tj3Var2), tj3Var, ((i20 << 6) & 234881024) | (i20 & 8078), 64);
                        t17Var2 = t17Var4;
                        vf0Var3 = vf0Var4;
                        o39Var3 = o39Var5;
                        vj0Var3 = vj0VarM23998c;
                        xj0Var3 = xj0Var4;
                        z5 = z6;
                    } else {
                        tj3Var = tj3Var2;
                        tj3Var.m22102U();
                        e16Var2 = e16Var;
                        z5 = z2;
                        o39Var3 = o39Var2;
                        vj0Var3 = vj0Var2;
                        t17Var2 = t17Var;
                        vf0Var3 = vf0Var2;
                        xj0Var3 = xj0Var2;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new yj0(ui3Var, e16Var2, z5, o39Var3, vj0Var3, xj0Var3, vf0Var3, t17Var2, aj3Var, i, i2);
                    }
                }
                i3 |= 12582912;
                i10 = i3;
                if ((i2 & 256) != 0) {
                    i10 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (tj3Var2.m22120g(null)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i10 |= i11;
                }
                if ((i & 805306368) == 0) {
                    if (tj3Var2.m22124i(aj3Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i10 |= i14;
                }
                i12 = i10;
                z3 = true;
                if ((i12 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (tj3Var2.m22099R(i12 & 1, z4)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            e16Var2 = b16.f7762a;
                        } else {
                            e16Var2 = e16Var;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            x17 x17Var3 = wj0.f66899a;
                            o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                            i12 &= -7169;
                        } else {
                            o39VarM24271b = o39Var2;
                        }
                        if ((i2 & 16) != 0) {
                            x17 x17Var4 = wj0.f66899a;
                            vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                            i12 &= -57345;
                        } else {
                            vj0VarM23998c = vj0Var2;
                        }
                        if ((i2 & 32) != 0) {
                            xj0VarM23997b = wj0.m23997b(31);
                            i12 &= -458753;
                        } else {
                            xj0VarM23997b = xj0Var2;
                        }
                        if (i6 != 0) {
                            vf0Var2 = null;
                        }
                        if (i8 != 0) {
                            t17Var3 = wj0.f66899a;
                        } else {
                            t17Var3 = t17Var;
                        }
                        o39Var4 = o39VarM24271b;
                        vf0Var4 = vf0Var2;
                    } else {
                        if (i15 != 0) {
                            e16Var2 = b16.f7762a;
                        } else {
                            e16Var2 = e16Var;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            x17 x17Var5 = wj0.f66899a;
                            o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                            i12 &= -7169;
                        } else {
                            o39VarM24271b = o39Var2;
                        }
                        if ((i2 & 16) != 0) {
                            x17 x17Var6 = wj0.f66899a;
                            vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                            i12 &= -57345;
                        } else {
                            vj0VarM23998c = vj0Var2;
                        }
                        if ((i2 & 32) != 0) {
                            xj0VarM23997b = wj0.m23997b(31);
                            i12 &= -458753;
                        } else {
                            xj0VarM23997b = xj0Var2;
                        }
                        if (i6 != 0) {
                            vf0Var2 = null;
                        }
                        if (i8 != 0) {
                            t17Var3 = wj0.f66899a;
                        } else {
                            t17Var3 = t17Var;
                        }
                        o39Var4 = o39VarM24271b;
                        vf0Var4 = vf0Var2;
                    }
                    z6 = z2;
                    tj3Var2.m22140r();
                    tj3Var2.m22111b0(1691726283);
                    objM22097O = tj3Var2.m22097O();
                    p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                    }
                    v56Var = (v56) objM22097O;
                    tj3Var2.m22139q(false);
                    if (z6) {
                        j = vj0VarM23998c.f65428a;
                    } else {
                        j = vj0VarM23998c.f65430c;
                    }
                    long j4 = j;
                    if (z6) {
                        j2 = vj0VarM23998c.f65429b;
                    } else {
                        j2 = vj0VarM23998c.f65431d;
                    }
                    if (xj0VarM23997b == null) {
                        tj3Var2.m22111b0(1691909926);
                        tj3Var2.m22139q(false);
                        i12 = i12;
                        t17Var3 = t17Var3;
                        xj0Var4 = xj0VarM23997b;
                        o39Var4 = o39Var4;
                        c0817bn = null;
                    } else {
                        tj3Var2.m22111b0(-499611589);
                        i13 = ((i12 >> 6) & 14) | ((i12 >> 9) & 896);
                        objM22097O2 = tj3Var2.m22097O();
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = new SnapshotStateList();
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        snapshotStateList = (SnapshotStateList) objM22097O2;
                        v56Var = v56Var;
                        zM22120g = tj3Var2.m22120g(v56Var);
                        objM22097O3 = tj3Var2.m22097O();
                        if (zM22120g) {
                            objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                            tj3Var2.m22131l0(objM22097O3);
                        } else {
                            objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        d32.m10047k(tj3Var2, (zi3) objM22097O3, v56Var);
                        q84Var = (q84) u91.m22598P0(snapshotStateList);
                        if (z6) {
                            f = 0.0f;
                        } else if (q84Var instanceof rv3) {
                            f = xj0VarM23997b.f68279b;
                        } else if (q84Var instanceof q93) {
                            f = 0.0f;
                        } else {
                            f = xj0VarM23997b.f68278a;
                        }
                        objM22097O4 = tj3Var2.m22097O();
                        if (objM22097O4 == p84Var) {
                            objM22097O4 = new C0059a(new xj2(f), pk9.f56365j, null, 12);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        c0059a = (C0059a) objM22097O4;
                        xj2 xj2Var2 = new xj2(f);
                        boolean zM22124i3 = tj3Var2.m22124i(c0059a) | tj3Var2.m22114d(f) | ((((i13 & 14) ^ 6) <= 4 && tj3Var2.m22122h(z6)) || (i13 & 6) == 4);
                        z3 = ((i13 & 896) ^ 384) > 256 ? false : false;
                        zM22124i = zM22124i3 | z3 | tj3Var2.m22124i(q84Var);
                        objM22097O5 = tj3Var2.m22097O();
                        if (zM22124i) {
                            xj0 xj0Var6 = xj0VarM23997b;
                            objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var6, q84Var, null);
                            xj0Var4 = xj0Var6;
                            tj3Var2.m22131l0(objM22097O5);
                        } else {
                            xj0 xj0Var7 = xj0VarM23997b;
                            objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var7, q84Var, null);
                            xj0Var4 = xj0Var7;
                            tj3Var2.m22131l0(objM22097O5);
                        }
                        d32.m10047k(tj3Var2, (zi3) objM22097O5, xj2Var2);
                        c0817bn = c0059a.f1540c;
                        tj3Var2.m22139q(false);
                    }
                    if (c0817bn != null) {
                    }
                    objM22097O6 = tj3Var2.m22097O();
                    if (objM22097O6 == p84Var) {
                        objM22097O6 = new C2951e4(12);
                        tj3Var2.m22131l0(objM22097O6);
                    }
                    t17 t17Var5 = t17Var3;
                    int i21 = i12;
                    o39 o39Var6 = o39Var4;
                    tj3Var = tj3Var2;
                    ho9.m13415b(ui3Var, nv8.m17643c(e16Var2, false, (vi3) objM22097O6), z6, o39Var6, j4, j2, 0.0f, f2, vf0Var4, v56Var, ci8.m4703P(-535639973, new C3536rh(j2, t17Var5, aj3Var), tj3Var2), tj3Var, ((i21 << 6) & 234881024) | (i21 & 8078), 64);
                    t17Var2 = t17Var5;
                    vf0Var3 = vf0Var4;
                    o39Var3 = o39Var6;
                    vj0Var3 = vj0VarM23998c;
                    xj0Var3 = xj0Var4;
                    z5 = z6;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    z5 = z2;
                    o39Var3 = o39Var2;
                    vj0Var3 = vj0Var2;
                    t17Var2 = t17Var;
                    vf0Var3 = vf0Var2;
                    xj0Var3 = xj0Var2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new yj0(ui3Var, e16Var2, z5, o39Var3, vj0Var3, xj0Var3, vf0Var3, t17Var2, aj3Var, i, i2);
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    o39Var2 = o39Var;
                    if (tj3Var2.m22120g(o39Var2)) {
                    }
                    i3 |= i16;
                } else {
                    o39Var2 = o39Var;
                }
                i3 |= i16;
            } else {
                o39Var2 = o39Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vj0Var2 = vj0Var;
                    if (tj3Var2.m22120g(vj0Var2)) {
                    }
                    i3 |= i17;
                } else {
                    vj0Var2 = vj0Var;
                }
                i3 |= i17;
            } else {
                vj0Var2 = vj0Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    xj0Var2 = xj0Var;
                    if (tj3Var2.m22120g(xj0Var2)) {
                    }
                    i3 |= i18;
                } else {
                    xj0Var2 = xj0Var;
                }
                i3 |= i18;
            } else {
                xj0Var2 = xj0Var;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                vf0Var2 = vf0Var;
            } else {
                vf0Var2 = vf0Var;
                if ((i & 1572864) == 0) {
                    if (tj3Var2.m22120g(vf0Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    int i110 = i3;
                    if (tj3Var2.m22120g(t17Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i10 = i110 | i9;
                }
                if ((i2 & 256) != 0) {
                    i10 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (tj3Var2.m22120g(null)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i10 |= i11;
                }
                if ((i & 805306368) == 0) {
                    if (tj3Var2.m22124i(aj3Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i10 |= i14;
                }
                i12 = i10;
                z3 = true;
                if ((i12 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (tj3Var2.m22099R(i12 & 1, z4)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            e16Var2 = b16.f7762a;
                        } else {
                            e16Var2 = e16Var;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            x17 x17Var7 = wj0.f66899a;
                            o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                            i12 &= -7169;
                        } else {
                            o39VarM24271b = o39Var2;
                        }
                        if ((i2 & 16) != 0) {
                            x17 x17Var8 = wj0.f66899a;
                            vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                            i12 &= -57345;
                        } else {
                            vj0VarM23998c = vj0Var2;
                        }
                        if ((i2 & 32) != 0) {
                            xj0VarM23997b = wj0.m23997b(31);
                            i12 &= -458753;
                        } else {
                            xj0VarM23997b = xj0Var2;
                        }
                        if (i6 != 0) {
                            vf0Var2 = null;
                        }
                        if (i8 != 0) {
                            t17Var3 = wj0.f66899a;
                        } else {
                            t17Var3 = t17Var;
                        }
                        o39Var4 = o39VarM24271b;
                        vf0Var4 = vf0Var2;
                    } else {
                        if (i15 != 0) {
                            e16Var2 = b16.f7762a;
                        } else {
                            e16Var2 = e16Var;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            x17 x17Var9 = wj0.f66899a;
                            o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                            i12 &= -7169;
                        } else {
                            o39VarM24271b = o39Var2;
                        }
                        if ((i2 & 16) != 0) {
                            x17 x17Var10 = wj0.f66899a;
                            vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                            i12 &= -57345;
                        } else {
                            vj0VarM23998c = vj0Var2;
                        }
                        if ((i2 & 32) != 0) {
                            xj0VarM23997b = wj0.m23997b(31);
                            i12 &= -458753;
                        } else {
                            xj0VarM23997b = xj0Var2;
                        }
                        if (i6 != 0) {
                            vf0Var2 = null;
                        }
                        if (i8 != 0) {
                            t17Var3 = wj0.f66899a;
                        } else {
                            t17Var3 = t17Var;
                        }
                        o39Var4 = o39VarM24271b;
                        vf0Var4 = vf0Var2;
                    }
                    z6 = z2;
                    tj3Var2.m22140r();
                    tj3Var2.m22111b0(1691726283);
                    objM22097O = tj3Var2.m22097O();
                    p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                    }
                    v56Var = (v56) objM22097O;
                    tj3Var2.m22139q(false);
                    if (z6) {
                        j = vj0VarM23998c.f65428a;
                    } else {
                        j = vj0VarM23998c.f65430c;
                    }
                    long j5 = j;
                    if (z6) {
                        j2 = vj0VarM23998c.f65429b;
                    } else {
                        j2 = vj0VarM23998c.f65431d;
                    }
                    if (xj0VarM23997b == null) {
                        tj3Var2.m22111b0(1691909926);
                        tj3Var2.m22139q(false);
                        i12 = i12;
                        t17Var3 = t17Var3;
                        xj0Var4 = xj0VarM23997b;
                        o39Var4 = o39Var4;
                        c0817bn = null;
                    } else {
                        tj3Var2.m22111b0(-499611589);
                        i13 = ((i12 >> 6) & 14) | ((i12 >> 9) & 896);
                        objM22097O2 = tj3Var2.m22097O();
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = new SnapshotStateList();
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        snapshotStateList = (SnapshotStateList) objM22097O2;
                        v56Var = v56Var;
                        zM22120g = tj3Var2.m22120g(v56Var);
                        objM22097O3 = tj3Var2.m22097O();
                        if (zM22120g) {
                            objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                            tj3Var2.m22131l0(objM22097O3);
                        } else {
                            objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        d32.m10047k(tj3Var2, (zi3) objM22097O3, v56Var);
                        q84Var = (q84) u91.m22598P0(snapshotStateList);
                        if (z6) {
                            f = 0.0f;
                        } else if (q84Var instanceof rv3) {
                            f = xj0VarM23997b.f68279b;
                        } else if (q84Var instanceof q93) {
                            f = 0.0f;
                        } else {
                            f = xj0VarM23997b.f68278a;
                        }
                        objM22097O4 = tj3Var2.m22097O();
                        if (objM22097O4 == p84Var) {
                            objM22097O4 = new C0059a(new xj2(f), pk9.f56365j, null, 12);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        c0059a = (C0059a) objM22097O4;
                        xj2 xj2Var3 = new xj2(f);
                        boolean zM22124i4 = tj3Var2.m22124i(c0059a) | tj3Var2.m22114d(f) | ((((i13 & 14) ^ 6) <= 4 && tj3Var2.m22122h(z6)) || (i13 & 6) == 4);
                        if (((i13 & 896) ^ 384) > 256) {
                        }
                        zM22124i = zM22124i4 | z3 | tj3Var2.m22124i(q84Var);
                        objM22097O5 = tj3Var2.m22097O();
                        if (zM22124i) {
                            xj0 xj0Var8 = xj0VarM23997b;
                            objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var8, q84Var, null);
                            xj0Var4 = xj0Var8;
                            tj3Var2.m22131l0(objM22097O5);
                        } else {
                            xj0 xj0Var9 = xj0VarM23997b;
                            objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var9, q84Var, null);
                            xj0Var4 = xj0Var9;
                            tj3Var2.m22131l0(objM22097O5);
                        }
                        d32.m10047k(tj3Var2, (zi3) objM22097O5, xj2Var3);
                        c0817bn = c0059a.f1540c;
                        tj3Var2.m22139q(false);
                    }
                    if (c0817bn != null) {
                    }
                    objM22097O6 = tj3Var2.m22097O();
                    if (objM22097O6 == p84Var) {
                        objM22097O6 = new C2951e4(12);
                        tj3Var2.m22131l0(objM22097O6);
                    }
                    t17 t17Var6 = t17Var3;
                    int i22 = i12;
                    o39 o39Var7 = o39Var4;
                    tj3Var = tj3Var2;
                    ho9.m13415b(ui3Var, nv8.m17643c(e16Var2, false, (vi3) objM22097O6), z6, o39Var7, j5, j2, 0.0f, f2, vf0Var4, v56Var, ci8.m4703P(-535639973, new C3536rh(j2, t17Var6, aj3Var), tj3Var2), tj3Var, ((i22 << 6) & 234881024) | (i22 & 8078), 64);
                    t17Var2 = t17Var6;
                    vf0Var3 = vf0Var4;
                    o39Var3 = o39Var7;
                    vj0Var3 = vj0VarM23998c;
                    xj0Var3 = xj0Var4;
                    z5 = z6;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    z5 = z2;
                    o39Var3 = o39Var2;
                    vj0Var3 = vj0Var2;
                    t17Var2 = t17Var;
                    vf0Var3 = vf0Var2;
                    xj0Var3 = xj0Var2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new yj0(ui3Var, e16Var2, z5, o39Var3, vj0Var3, xj0Var3, vf0Var3, t17Var2, aj3Var, i, i2);
                }
            }
            i3 |= 12582912;
            i10 = i3;
            if ((i2 & 256) != 0) {
                i10 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (tj3Var2.m22120g(null)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i10 |= i11;
            }
            if ((i & 805306368) == 0) {
                if (tj3Var2.m22124i(aj3Var)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i10 |= i14;
            }
            i12 = i10;
            z3 = true;
            if ((i12 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var2.m22099R(i12 & 1, z4)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        e16Var2 = b16.f7762a;
                    } else {
                        e16Var2 = e16Var;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        x17 x17Var11 = wj0.f66899a;
                        o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                        i12 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        x17 x17Var12 = wj0.f66899a;
                        vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                        i12 &= -57345;
                    } else {
                        vj0VarM23998c = vj0Var2;
                    }
                    if ((i2 & 32) != 0) {
                        xj0VarM23997b = wj0.m23997b(31);
                        i12 &= -458753;
                    } else {
                        xj0VarM23997b = xj0Var2;
                    }
                    if (i6 != 0) {
                        vf0Var2 = null;
                    }
                    if (i8 != 0) {
                        t17Var3 = wj0.f66899a;
                    } else {
                        t17Var3 = t17Var;
                    }
                    o39Var4 = o39VarM24271b;
                    vf0Var4 = vf0Var2;
                } else {
                    if (i15 != 0) {
                        e16Var2 = b16.f7762a;
                    } else {
                        e16Var2 = e16Var;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        x17 x17Var13 = wj0.f66899a;
                        o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                        i12 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        x17 x17Var14 = wj0.f66899a;
                        vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                        i12 &= -57345;
                    } else {
                        vj0VarM23998c = vj0Var2;
                    }
                    if ((i2 & 32) != 0) {
                        xj0VarM23997b = wj0.m23997b(31);
                        i12 &= -458753;
                    } else {
                        xj0VarM23997b = xj0Var2;
                    }
                    if (i6 != 0) {
                        vf0Var2 = null;
                    }
                    if (i8 != 0) {
                        t17Var3 = wj0.f66899a;
                    } else {
                        t17Var3 = t17Var;
                    }
                    o39Var4 = o39VarM24271b;
                    vf0Var4 = vf0Var2;
                }
                z6 = z2;
                tj3Var2.m22140r();
                tj3Var2.m22111b0(1691726283);
                objM22097O = tj3Var2.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                }
                v56Var = (v56) objM22097O;
                tj3Var2.m22139q(false);
                if (z6) {
                    j = vj0VarM23998c.f65428a;
                } else {
                    j = vj0VarM23998c.f65430c;
                }
                long j6 = j;
                if (z6) {
                    j2 = vj0VarM23998c.f65429b;
                } else {
                    j2 = vj0VarM23998c.f65431d;
                }
                if (xj0VarM23997b == null) {
                    tj3Var2.m22111b0(1691909926);
                    tj3Var2.m22139q(false);
                    i12 = i12;
                    t17Var3 = t17Var3;
                    xj0Var4 = xj0VarM23997b;
                    o39Var4 = o39Var4;
                    c0817bn = null;
                } else {
                    tj3Var2.m22111b0(-499611589);
                    i13 = ((i12 >> 6) & 14) | ((i12 >> 9) & 896);
                    objM22097O2 = tj3Var2.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new SnapshotStateList();
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    snapshotStateList = (SnapshotStateList) objM22097O2;
                    v56Var = v56Var;
                    zM22120g = tj3Var2.m22120g(v56Var);
                    objM22097O3 = tj3Var2.m22097O();
                    if (zM22120g) {
                        objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                        tj3Var2.m22131l0(objM22097O3);
                    } else {
                        objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    d32.m10047k(tj3Var2, (zi3) objM22097O3, v56Var);
                    q84Var = (q84) u91.m22598P0(snapshotStateList);
                    if (z6) {
                        f = 0.0f;
                    } else if (q84Var instanceof rv3) {
                        f = xj0VarM23997b.f68279b;
                    } else if (q84Var instanceof q93) {
                        f = 0.0f;
                    } else {
                        f = xj0VarM23997b.f68278a;
                    }
                    objM22097O4 = tj3Var2.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new C0059a(new xj2(f), pk9.f56365j, null, 12);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    c0059a = (C0059a) objM22097O4;
                    xj2 xj2Var4 = new xj2(f);
                    boolean zM22124i5 = tj3Var2.m22124i(c0059a) | tj3Var2.m22114d(f) | ((((i13 & 14) ^ 6) <= 4 && tj3Var2.m22122h(z6)) || (i13 & 6) == 4);
                    if (((i13 & 896) ^ 384) > 256) {
                    }
                    zM22124i = zM22124i5 | z3 | tj3Var2.m22124i(q84Var);
                    objM22097O5 = tj3Var2.m22097O();
                    if (zM22124i) {
                        xj0 xj0Var10 = xj0VarM23997b;
                        objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var10, q84Var, null);
                        xj0Var4 = xj0Var10;
                        tj3Var2.m22131l0(objM22097O5);
                    } else {
                        xj0 xj0Var11 = xj0VarM23997b;
                        objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var11, q84Var, null);
                        xj0Var4 = xj0Var11;
                        tj3Var2.m22131l0(objM22097O5);
                    }
                    d32.m10047k(tj3Var2, (zi3) objM22097O5, xj2Var4);
                    c0817bn = c0059a.f1540c;
                    tj3Var2.m22139q(false);
                }
                if (c0817bn != null) {
                }
                objM22097O6 = tj3Var2.m22097O();
                if (objM22097O6 == p84Var) {
                    objM22097O6 = new C2951e4(12);
                    tj3Var2.m22131l0(objM22097O6);
                }
                t17 t17Var7 = t17Var3;
                int i23 = i12;
                o39 o39Var8 = o39Var4;
                tj3Var = tj3Var2;
                ho9.m13415b(ui3Var, nv8.m17643c(e16Var2, false, (vi3) objM22097O6), z6, o39Var8, j6, j2, 0.0f, f2, vf0Var4, v56Var, ci8.m4703P(-535639973, new C3536rh(j2, t17Var7, aj3Var), tj3Var2), tj3Var, ((i23 << 6) & 234881024) | (i23 & 8078), 64);
                t17Var2 = t17Var7;
                vf0Var3 = vf0Var4;
                o39Var3 = o39Var8;
                vj0Var3 = vj0VarM23998c;
                xj0Var3 = xj0Var4;
                z5 = z6;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                e16Var2 = e16Var;
                z5 = z2;
                o39Var3 = o39Var2;
                vj0Var3 = vj0Var2;
                t17Var2 = t17Var;
                vf0Var3 = vf0Var2;
                xj0Var3 = xj0Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new yj0(ui3Var, e16Var2, z5, o39Var3, vj0Var3, xj0Var3, vf0Var3, t17Var2, aj3Var, i, i2);
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (tj3Var2.m22122h(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    o39Var2 = o39Var;
                    if (tj3Var2.m22120g(o39Var2)) {
                    }
                    i3 |= i16;
                } else {
                    o39Var2 = o39Var;
                }
                i3 |= i16;
            } else {
                o39Var2 = o39Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vj0Var2 = vj0Var;
                    if (tj3Var2.m22120g(vj0Var2)) {
                    }
                    i3 |= i17;
                } else {
                    vj0Var2 = vj0Var;
                }
                i3 |= i17;
            } else {
                vj0Var2 = vj0Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    xj0Var2 = xj0Var;
                    if (tj3Var2.m22120g(xj0Var2)) {
                    }
                    i3 |= i18;
                } else {
                    xj0Var2 = xj0Var;
                }
                i3 |= i18;
            } else {
                xj0Var2 = xj0Var;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                vf0Var2 = vf0Var;
            } else {
                vf0Var2 = vf0Var;
                if ((i & 1572864) == 0) {
                    if (tj3Var2.m22120g(vf0Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    int i111 = i3;
                    if (tj3Var2.m22120g(t17Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i10 = i111 | i9;
                }
                if ((i2 & 256) != 0) {
                    i10 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (tj3Var2.m22120g(null)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i10 |= i11;
                }
                if ((i & 805306368) == 0) {
                    if (tj3Var2.m22124i(aj3Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i10 |= i14;
                }
                i12 = i10;
                z3 = true;
                if ((i12 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (tj3Var2.m22099R(i12 & 1, z4)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            e16Var2 = b16.f7762a;
                        } else {
                            e16Var2 = e16Var;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            x17 x17Var15 = wj0.f66899a;
                            o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                            i12 &= -7169;
                        } else {
                            o39VarM24271b = o39Var2;
                        }
                        if ((i2 & 16) != 0) {
                            x17 x17Var16 = wj0.f66899a;
                            vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                            i12 &= -57345;
                        } else {
                            vj0VarM23998c = vj0Var2;
                        }
                        if ((i2 & 32) != 0) {
                            xj0VarM23997b = wj0.m23997b(31);
                            i12 &= -458753;
                        } else {
                            xj0VarM23997b = xj0Var2;
                        }
                        if (i6 != 0) {
                            vf0Var2 = null;
                        }
                        if (i8 != 0) {
                            t17Var3 = wj0.f66899a;
                        } else {
                            t17Var3 = t17Var;
                        }
                        o39Var4 = o39VarM24271b;
                        vf0Var4 = vf0Var2;
                    } else {
                        if (i15 != 0) {
                            e16Var2 = b16.f7762a;
                        } else {
                            e16Var2 = e16Var;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            x17 x17Var17 = wj0.f66899a;
                            o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                            i12 &= -7169;
                        } else {
                            o39VarM24271b = o39Var2;
                        }
                        if ((i2 & 16) != 0) {
                            x17 x17Var18 = wj0.f66899a;
                            vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                            i12 &= -57345;
                        } else {
                            vj0VarM23998c = vj0Var2;
                        }
                        if ((i2 & 32) != 0) {
                            xj0VarM23997b = wj0.m23997b(31);
                            i12 &= -458753;
                        } else {
                            xj0VarM23997b = xj0Var2;
                        }
                        if (i6 != 0) {
                            vf0Var2 = null;
                        }
                        if (i8 != 0) {
                            t17Var3 = wj0.f66899a;
                        } else {
                            t17Var3 = t17Var;
                        }
                        o39Var4 = o39VarM24271b;
                        vf0Var4 = vf0Var2;
                    }
                    z6 = z2;
                    tj3Var2.m22140r();
                    tj3Var2.m22111b0(1691726283);
                    objM22097O = tj3Var2.m22097O();
                    p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                    }
                    v56Var = (v56) objM22097O;
                    tj3Var2.m22139q(false);
                    if (z6) {
                        j = vj0VarM23998c.f65428a;
                    } else {
                        j = vj0VarM23998c.f65430c;
                    }
                    long j7 = j;
                    if (z6) {
                        j2 = vj0VarM23998c.f65429b;
                    } else {
                        j2 = vj0VarM23998c.f65431d;
                    }
                    if (xj0VarM23997b == null) {
                        tj3Var2.m22111b0(1691909926);
                        tj3Var2.m22139q(false);
                        i12 = i12;
                        t17Var3 = t17Var3;
                        xj0Var4 = xj0VarM23997b;
                        o39Var4 = o39Var4;
                        c0817bn = null;
                    } else {
                        tj3Var2.m22111b0(-499611589);
                        i13 = ((i12 >> 6) & 14) | ((i12 >> 9) & 896);
                        objM22097O2 = tj3Var2.m22097O();
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = new SnapshotStateList();
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        snapshotStateList = (SnapshotStateList) objM22097O2;
                        v56Var = v56Var;
                        zM22120g = tj3Var2.m22120g(v56Var);
                        objM22097O3 = tj3Var2.m22097O();
                        if (zM22120g) {
                            objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                            tj3Var2.m22131l0(objM22097O3);
                        } else {
                            objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        d32.m10047k(tj3Var2, (zi3) objM22097O3, v56Var);
                        q84Var = (q84) u91.m22598P0(snapshotStateList);
                        if (z6) {
                            f = 0.0f;
                        } else if (q84Var instanceof rv3) {
                            f = xj0VarM23997b.f68279b;
                        } else if (q84Var instanceof q93) {
                            f = 0.0f;
                        } else {
                            f = xj0VarM23997b.f68278a;
                        }
                        objM22097O4 = tj3Var2.m22097O();
                        if (objM22097O4 == p84Var) {
                            objM22097O4 = new C0059a(new xj2(f), pk9.f56365j, null, 12);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        c0059a = (C0059a) objM22097O4;
                        xj2 xj2Var5 = new xj2(f);
                        boolean zM22124i6 = tj3Var2.m22124i(c0059a) | tj3Var2.m22114d(f) | ((((i13 & 14) ^ 6) <= 4 && tj3Var2.m22122h(z6)) || (i13 & 6) == 4);
                        if (((i13 & 896) ^ 384) > 256) {
                        }
                        zM22124i = zM22124i6 | z3 | tj3Var2.m22124i(q84Var);
                        objM22097O5 = tj3Var2.m22097O();
                        if (zM22124i) {
                            xj0 xj0Var12 = xj0VarM23997b;
                            objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var12, q84Var, null);
                            xj0Var4 = xj0Var12;
                            tj3Var2.m22131l0(objM22097O5);
                        } else {
                            xj0 xj0Var13 = xj0VarM23997b;
                            objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var13, q84Var, null);
                            xj0Var4 = xj0Var13;
                            tj3Var2.m22131l0(objM22097O5);
                        }
                        d32.m10047k(tj3Var2, (zi3) objM22097O5, xj2Var5);
                        c0817bn = c0059a.f1540c;
                        tj3Var2.m22139q(false);
                    }
                    if (c0817bn != null) {
                    }
                    objM22097O6 = tj3Var2.m22097O();
                    if (objM22097O6 == p84Var) {
                        objM22097O6 = new C2951e4(12);
                        tj3Var2.m22131l0(objM22097O6);
                    }
                    t17 t17Var8 = t17Var3;
                    int i24 = i12;
                    o39 o39Var9 = o39Var4;
                    tj3Var = tj3Var2;
                    ho9.m13415b(ui3Var, nv8.m17643c(e16Var2, false, (vi3) objM22097O6), z6, o39Var9, j7, j2, 0.0f, f2, vf0Var4, v56Var, ci8.m4703P(-535639973, new C3536rh(j2, t17Var8, aj3Var), tj3Var2), tj3Var, ((i24 << 6) & 234881024) | (i24 & 8078), 64);
                    t17Var2 = t17Var8;
                    vf0Var3 = vf0Var4;
                    o39Var3 = o39Var9;
                    vj0Var3 = vj0VarM23998c;
                    xj0Var3 = xj0Var4;
                    z5 = z6;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    z5 = z2;
                    o39Var3 = o39Var2;
                    vj0Var3 = vj0Var2;
                    t17Var2 = t17Var;
                    vf0Var3 = vf0Var2;
                    xj0Var3 = xj0Var2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new yj0(ui3Var, e16Var2, z5, o39Var3, vj0Var3, xj0Var3, vf0Var3, t17Var2, aj3Var, i, i2);
                }
            }
            i3 |= 12582912;
            i10 = i3;
            if ((i2 & 256) != 0) {
                i10 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (tj3Var2.m22120g(null)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i10 |= i11;
            }
            if ((i & 805306368) == 0) {
                if (tj3Var2.m22124i(aj3Var)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i10 |= i14;
            }
            i12 = i10;
            z3 = true;
            if ((i12 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var2.m22099R(i12 & 1, z4)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        e16Var2 = b16.f7762a;
                    } else {
                        e16Var2 = e16Var;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        x17 x17Var19 = wj0.f66899a;
                        o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                        i12 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        x17 x17Var110 = wj0.f66899a;
                        vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                        i12 &= -57345;
                    } else {
                        vj0VarM23998c = vj0Var2;
                    }
                    if ((i2 & 32) != 0) {
                        xj0VarM23997b = wj0.m23997b(31);
                        i12 &= -458753;
                    } else {
                        xj0VarM23997b = xj0Var2;
                    }
                    if (i6 != 0) {
                        vf0Var2 = null;
                    }
                    if (i8 != 0) {
                        t17Var3 = wj0.f66899a;
                    } else {
                        t17Var3 = t17Var;
                    }
                    o39Var4 = o39VarM24271b;
                    vf0Var4 = vf0Var2;
                } else {
                    if (i15 != 0) {
                        e16Var2 = b16.f7762a;
                    } else {
                        e16Var2 = e16Var;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        x17 x17Var111 = wj0.f66899a;
                        o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                        i12 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        x17 x17Var112 = wj0.f66899a;
                        vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                        i12 &= -57345;
                    } else {
                        vj0VarM23998c = vj0Var2;
                    }
                    if ((i2 & 32) != 0) {
                        xj0VarM23997b = wj0.m23997b(31);
                        i12 &= -458753;
                    } else {
                        xj0VarM23997b = xj0Var2;
                    }
                    if (i6 != 0) {
                        vf0Var2 = null;
                    }
                    if (i8 != 0) {
                        t17Var3 = wj0.f66899a;
                    } else {
                        t17Var3 = t17Var;
                    }
                    o39Var4 = o39VarM24271b;
                    vf0Var4 = vf0Var2;
                }
                z6 = z2;
                tj3Var2.m22140r();
                tj3Var2.m22111b0(1691726283);
                objM22097O = tj3Var2.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                }
                v56Var = (v56) objM22097O;
                tj3Var2.m22139q(false);
                if (z6) {
                    j = vj0VarM23998c.f65428a;
                } else {
                    j = vj0VarM23998c.f65430c;
                }
                long j8 = j;
                if (z6) {
                    j2 = vj0VarM23998c.f65429b;
                } else {
                    j2 = vj0VarM23998c.f65431d;
                }
                if (xj0VarM23997b == null) {
                    tj3Var2.m22111b0(1691909926);
                    tj3Var2.m22139q(false);
                    i12 = i12;
                    t17Var3 = t17Var3;
                    xj0Var4 = xj0VarM23997b;
                    o39Var4 = o39Var4;
                    c0817bn = null;
                } else {
                    tj3Var2.m22111b0(-499611589);
                    i13 = ((i12 >> 6) & 14) | ((i12 >> 9) & 896);
                    objM22097O2 = tj3Var2.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new SnapshotStateList();
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    snapshotStateList = (SnapshotStateList) objM22097O2;
                    v56Var = v56Var;
                    zM22120g = tj3Var2.m22120g(v56Var);
                    objM22097O3 = tj3Var2.m22097O();
                    if (zM22120g) {
                        objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                        tj3Var2.m22131l0(objM22097O3);
                    } else {
                        objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    d32.m10047k(tj3Var2, (zi3) objM22097O3, v56Var);
                    q84Var = (q84) u91.m22598P0(snapshotStateList);
                    if (z6) {
                        f = 0.0f;
                    } else if (q84Var instanceof rv3) {
                        f = xj0VarM23997b.f68279b;
                    } else if (q84Var instanceof q93) {
                        f = 0.0f;
                    } else {
                        f = xj0VarM23997b.f68278a;
                    }
                    objM22097O4 = tj3Var2.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new C0059a(new xj2(f), pk9.f56365j, null, 12);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    c0059a = (C0059a) objM22097O4;
                    xj2 xj2Var6 = new xj2(f);
                    boolean zM22124i7 = tj3Var2.m22124i(c0059a) | tj3Var2.m22114d(f) | ((((i13 & 14) ^ 6) <= 4 && tj3Var2.m22122h(z6)) || (i13 & 6) == 4);
                    if (((i13 & 896) ^ 384) > 256) {
                    }
                    zM22124i = zM22124i7 | z3 | tj3Var2.m22124i(q84Var);
                    objM22097O5 = tj3Var2.m22097O();
                    if (zM22124i) {
                        xj0 xj0Var14 = xj0VarM23997b;
                        objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var14, q84Var, null);
                        xj0Var4 = xj0Var14;
                        tj3Var2.m22131l0(objM22097O5);
                    } else {
                        xj0 xj0Var15 = xj0VarM23997b;
                        objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var15, q84Var, null);
                        xj0Var4 = xj0Var15;
                        tj3Var2.m22131l0(objM22097O5);
                    }
                    d32.m10047k(tj3Var2, (zi3) objM22097O5, xj2Var6);
                    c0817bn = c0059a.f1540c;
                    tj3Var2.m22139q(false);
                }
                if (c0817bn != null) {
                }
                objM22097O6 = tj3Var2.m22097O();
                if (objM22097O6 == p84Var) {
                    objM22097O6 = new C2951e4(12);
                    tj3Var2.m22131l0(objM22097O6);
                }
                t17 t17Var9 = t17Var3;
                int i25 = i12;
                o39 o39Var10 = o39Var4;
                tj3Var = tj3Var2;
                ho9.m13415b(ui3Var, nv8.m17643c(e16Var2, false, (vi3) objM22097O6), z6, o39Var10, j8, j2, 0.0f, f2, vf0Var4, v56Var, ci8.m4703P(-535639973, new C3536rh(j2, t17Var9, aj3Var), tj3Var2), tj3Var, ((i25 << 6) & 234881024) | (i25 & 8078), 64);
                t17Var2 = t17Var9;
                vf0Var3 = vf0Var4;
                o39Var3 = o39Var10;
                vj0Var3 = vj0VarM23998c;
                xj0Var3 = xj0Var4;
                z5 = z6;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                e16Var2 = e16Var;
                z5 = z2;
                o39Var3 = o39Var2;
                vj0Var3 = vj0Var2;
                t17Var2 = t17Var;
                vf0Var3 = vf0Var2;
                xj0Var3 = xj0Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new yj0(ui3Var, e16Var2, z5, o39Var3, vj0Var3, xj0Var3, vf0Var3, t17Var2, aj3Var, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                o39Var2 = o39Var;
                if (tj3Var2.m22120g(o39Var2)) {
                }
                i3 |= i16;
            } else {
                o39Var2 = o39Var;
            }
            i3 |= i16;
        } else {
            o39Var2 = o39Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                vj0Var2 = vj0Var;
                if (tj3Var2.m22120g(vj0Var2)) {
                }
                i3 |= i17;
            } else {
                vj0Var2 = vj0Var;
            }
            i3 |= i17;
        } else {
            vj0Var2 = vj0Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                xj0Var2 = xj0Var;
                if (tj3Var2.m22120g(xj0Var2)) {
                }
                i3 |= i18;
            } else {
                xj0Var2 = xj0Var;
            }
            i3 |= i18;
        } else {
            xj0Var2 = xj0Var;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
            vf0Var2 = vf0Var;
        } else {
            vf0Var2 = vf0Var;
            if ((i & 1572864) == 0) {
                if (tj3Var2.m22120g(vf0Var2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            if ((i & 12582912) == 0) {
                int i112 = i3;
                if (tj3Var2.m22120g(t17Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i10 = i112 | i9;
            }
            if ((i2 & 256) != 0) {
                i10 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (tj3Var2.m22120g(null)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i10 |= i11;
            }
            if ((i & 805306368) == 0) {
                if (tj3Var2.m22124i(aj3Var)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i10 |= i14;
            }
            i12 = i10;
            z3 = true;
            if ((i12 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var2.m22099R(i12 & 1, z4)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        e16Var2 = b16.f7762a;
                    } else {
                        e16Var2 = e16Var;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        x17 x17Var113 = wj0.f66899a;
                        o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                        i12 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        x17 x17Var114 = wj0.f66899a;
                        vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                        i12 &= -57345;
                    } else {
                        vj0VarM23998c = vj0Var2;
                    }
                    if ((i2 & 32) != 0) {
                        xj0VarM23997b = wj0.m23997b(31);
                        i12 &= -458753;
                    } else {
                        xj0VarM23997b = xj0Var2;
                    }
                    if (i6 != 0) {
                        vf0Var2 = null;
                    }
                    if (i8 != 0) {
                        t17Var3 = wj0.f66899a;
                    } else {
                        t17Var3 = t17Var;
                    }
                    o39Var4 = o39VarM24271b;
                    vf0Var4 = vf0Var2;
                } else {
                    if (i15 != 0) {
                        e16Var2 = b16.f7762a;
                    } else {
                        e16Var2 = e16Var;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        x17 x17Var115 = wj0.f66899a;
                        o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                        i12 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        x17 x17Var116 = wj0.f66899a;
                        vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                        i12 &= -57345;
                    } else {
                        vj0VarM23998c = vj0Var2;
                    }
                    if ((i2 & 32) != 0) {
                        xj0VarM23997b = wj0.m23997b(31);
                        i12 &= -458753;
                    } else {
                        xj0VarM23997b = xj0Var2;
                    }
                    if (i6 != 0) {
                        vf0Var2 = null;
                    }
                    if (i8 != 0) {
                        t17Var3 = wj0.f66899a;
                    } else {
                        t17Var3 = t17Var;
                    }
                    o39Var4 = o39VarM24271b;
                    vf0Var4 = vf0Var2;
                }
                z6 = z2;
                tj3Var2.m22140r();
                tj3Var2.m22111b0(1691726283);
                objM22097O = tj3Var2.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                }
                v56Var = (v56) objM22097O;
                tj3Var2.m22139q(false);
                if (z6) {
                    j = vj0VarM23998c.f65428a;
                } else {
                    j = vj0VarM23998c.f65430c;
                }
                long j9 = j;
                if (z6) {
                    j2 = vj0VarM23998c.f65429b;
                } else {
                    j2 = vj0VarM23998c.f65431d;
                }
                if (xj0VarM23997b == null) {
                    tj3Var2.m22111b0(1691909926);
                    tj3Var2.m22139q(false);
                    i12 = i12;
                    t17Var3 = t17Var3;
                    xj0Var4 = xj0VarM23997b;
                    o39Var4 = o39Var4;
                    c0817bn = null;
                } else {
                    tj3Var2.m22111b0(-499611589);
                    i13 = ((i12 >> 6) & 14) | ((i12 >> 9) & 896);
                    objM22097O2 = tj3Var2.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new SnapshotStateList();
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    snapshotStateList = (SnapshotStateList) objM22097O2;
                    v56Var = v56Var;
                    zM22120g = tj3Var2.m22120g(v56Var);
                    objM22097O3 = tj3Var2.m22097O();
                    if (zM22120g) {
                        objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                        tj3Var2.m22131l0(objM22097O3);
                    } else {
                        objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    d32.m10047k(tj3Var2, (zi3) objM22097O3, v56Var);
                    q84Var = (q84) u91.m22598P0(snapshotStateList);
                    if (z6) {
                        f = 0.0f;
                    } else if (q84Var instanceof rv3) {
                        f = xj0VarM23997b.f68279b;
                    } else if (q84Var instanceof q93) {
                        f = 0.0f;
                    } else {
                        f = xj0VarM23997b.f68278a;
                    }
                    objM22097O4 = tj3Var2.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new C0059a(new xj2(f), pk9.f56365j, null, 12);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    c0059a = (C0059a) objM22097O4;
                    xj2 xj2Var7 = new xj2(f);
                    boolean zM22124i8 = tj3Var2.m22124i(c0059a) | tj3Var2.m22114d(f) | ((((i13 & 14) ^ 6) <= 4 && tj3Var2.m22122h(z6)) || (i13 & 6) == 4);
                    if (((i13 & 896) ^ 384) > 256) {
                    }
                    zM22124i = zM22124i8 | z3 | tj3Var2.m22124i(q84Var);
                    objM22097O5 = tj3Var2.m22097O();
                    if (zM22124i) {
                        xj0 xj0Var16 = xj0VarM23997b;
                        objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var16, q84Var, null);
                        xj0Var4 = xj0Var16;
                        tj3Var2.m22131l0(objM22097O5);
                    } else {
                        xj0 xj0Var17 = xj0VarM23997b;
                        objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var17, q84Var, null);
                        xj0Var4 = xj0Var17;
                        tj3Var2.m22131l0(objM22097O5);
                    }
                    d32.m10047k(tj3Var2, (zi3) objM22097O5, xj2Var7);
                    c0817bn = c0059a.f1540c;
                    tj3Var2.m22139q(false);
                }
                if (c0817bn != null) {
                }
                objM22097O6 = tj3Var2.m22097O();
                if (objM22097O6 == p84Var) {
                    objM22097O6 = new C2951e4(12);
                    tj3Var2.m22131l0(objM22097O6);
                }
                t17 t17Var10 = t17Var3;
                int i26 = i12;
                o39 o39Var11 = o39Var4;
                tj3Var = tj3Var2;
                ho9.m13415b(ui3Var, nv8.m17643c(e16Var2, false, (vi3) objM22097O6), z6, o39Var11, j9, j2, 0.0f, f2, vf0Var4, v56Var, ci8.m4703P(-535639973, new C3536rh(j2, t17Var10, aj3Var), tj3Var2), tj3Var, ((i26 << 6) & 234881024) | (i26 & 8078), 64);
                t17Var2 = t17Var10;
                vf0Var3 = vf0Var4;
                o39Var3 = o39Var11;
                vj0Var3 = vj0VarM23998c;
                xj0Var3 = xj0Var4;
                z5 = z6;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                e16Var2 = e16Var;
                z5 = z2;
                o39Var3 = o39Var2;
                vj0Var3 = vj0Var2;
                t17Var2 = t17Var;
                vf0Var3 = vf0Var2;
                xj0Var3 = xj0Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new yj0(ui3Var, e16Var2, z5, o39Var3, vj0Var3, xj0Var3, vf0Var3, t17Var2, aj3Var, i, i2);
            }
        }
        i3 |= 12582912;
        i10 = i3;
        if ((i2 & 256) != 0) {
            i10 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (tj3Var2.m22120g(null)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i10 |= i11;
        }
        if ((i & 805306368) == 0) {
            if (tj3Var2.m22124i(aj3Var)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i10 |= i14;
        }
        i12 = i10;
        z3 = true;
        if ((i12 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (tj3Var2.m22099R(i12 & 1, z4)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    e16Var2 = b16.f7762a;
                } else {
                    e16Var2 = e16Var;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    x17 x17Var117 = wj0.f66899a;
                    o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                    i12 &= -7169;
                } else {
                    o39VarM24271b = o39Var2;
                }
                if ((i2 & 16) != 0) {
                    x17 x17Var118 = wj0.f66899a;
                    vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                    i12 &= -57345;
                } else {
                    vj0VarM23998c = vj0Var2;
                }
                if ((i2 & 32) != 0) {
                    xj0VarM23997b = wj0.m23997b(31);
                    i12 &= -458753;
                } else {
                    xj0VarM23997b = xj0Var2;
                }
                if (i6 != 0) {
                    vf0Var2 = null;
                }
                if (i8 != 0) {
                    t17Var3 = wj0.f66899a;
                } else {
                    t17Var3 = t17Var;
                }
                o39Var4 = o39VarM24271b;
                vf0Var4 = vf0Var2;
            } else {
                if (i15 != 0) {
                    e16Var2 = b16.f7762a;
                } else {
                    e16Var2 = e16Var;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    x17 x17Var119 = wj0.f66899a;
                    o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                    i12 &= -7169;
                } else {
                    o39VarM24271b = o39Var2;
                }
                if ((i2 & 16) != 0) {
                    x17 x17Var1110 = wj0.f66899a;
                    vj0VarM23998c = wj0.m23998c(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                    i12 &= -57345;
                } else {
                    vj0VarM23998c = vj0Var2;
                }
                if ((i2 & 32) != 0) {
                    xj0VarM23997b = wj0.m23997b(31);
                    i12 &= -458753;
                } else {
                    xj0VarM23997b = xj0Var2;
                }
                if (i6 != 0) {
                    vf0Var2 = null;
                }
                if (i8 != 0) {
                    t17Var3 = wj0.f66899a;
                } else {
                    t17Var3 = t17Var;
                }
                o39Var4 = o39VarM24271b;
                vf0Var4 = vf0Var2;
            }
            z6 = z2;
            tj3Var2.m22140r();
            tj3Var2.m22111b0(1691726283);
            objM22097O = tj3Var2.m22097O();
            p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC3393o1.m17729d(tj3Var2);
            }
            v56Var = (v56) objM22097O;
            tj3Var2.m22139q(false);
            if (z6) {
                j = vj0VarM23998c.f65428a;
            } else {
                j = vj0VarM23998c.f65430c;
            }
            long j10 = j;
            if (z6) {
                j2 = vj0VarM23998c.f65429b;
            } else {
                j2 = vj0VarM23998c.f65431d;
            }
            if (xj0VarM23997b == null) {
                tj3Var2.m22111b0(1691909926);
                tj3Var2.m22139q(false);
                i12 = i12;
                t17Var3 = t17Var3;
                xj0Var4 = xj0VarM23997b;
                o39Var4 = o39Var4;
                c0817bn = null;
            } else {
                tj3Var2.m22111b0(-499611589);
                i13 = ((i12 >> 6) & 14) | ((i12 >> 9) & 896);
                objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new SnapshotStateList();
                    tj3Var2.m22131l0(objM22097O2);
                }
                snapshotStateList = (SnapshotStateList) objM22097O2;
                v56Var = v56Var;
                zM22120g = tj3Var2.m22120g(v56Var);
                objM22097O3 = tj3Var2.m22097O();
                if (zM22120g) {
                    objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                    tj3Var2.m22131l0(objM22097O3);
                } else {
                    objM22097O3 = new ButtonElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                    tj3Var2.m22131l0(objM22097O3);
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O3, v56Var);
                q84Var = (q84) u91.m22598P0(snapshotStateList);
                if (z6) {
                    f = 0.0f;
                } else if (q84Var instanceof rv3) {
                    f = xj0VarM23997b.f68279b;
                } else if (q84Var instanceof q93) {
                    f = 0.0f;
                } else {
                    f = xj0VarM23997b.f68278a;
                }
                objM22097O4 = tj3Var2.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new C0059a(new xj2(f), pk9.f56365j, null, 12);
                    tj3Var2.m22131l0(objM22097O4);
                }
                c0059a = (C0059a) objM22097O4;
                xj2 xj2Var8 = new xj2(f);
                boolean zM22124i9 = tj3Var2.m22124i(c0059a) | tj3Var2.m22114d(f) | ((((i13 & 14) ^ 6) <= 4 && tj3Var2.m22122h(z6)) || (i13 & 6) == 4);
                if (((i13 & 896) ^ 384) > 256) {
                }
                zM22124i = zM22124i9 | z3 | tj3Var2.m22124i(q84Var);
                objM22097O5 = tj3Var2.m22097O();
                if (zM22124i) {
                    xj0 xj0Var18 = xj0VarM23997b;
                    objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var18, q84Var, null);
                    xj0Var4 = xj0Var18;
                    tj3Var2.m22131l0(objM22097O5);
                } else {
                    xj0 xj0Var19 = xj0VarM23997b;
                    objM22097O5 = new ButtonElevation$animateElevation$2$1(c0059a, f, z6, xj0Var19, q84Var, null);
                    xj0Var4 = xj0Var19;
                    tj3Var2.m22131l0(objM22097O5);
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O5, xj2Var8);
                c0817bn = c0059a.f1540c;
                tj3Var2.m22139q(false);
            }
            if (c0817bn != null) {
            }
            objM22097O6 = tj3Var2.m22097O();
            if (objM22097O6 == p84Var) {
                objM22097O6 = new C2951e4(12);
                tj3Var2.m22131l0(objM22097O6);
            }
            t17 t17Var11 = t17Var3;
            int i27 = i12;
            o39 o39Var12 = o39Var4;
            tj3Var = tj3Var2;
            ho9.m13415b(ui3Var, nv8.m17643c(e16Var2, false, (vi3) objM22097O6), z6, o39Var12, j10, j2, 0.0f, f2, vf0Var4, v56Var, ci8.m4703P(-535639973, new C3536rh(j2, t17Var11, aj3Var), tj3Var2), tj3Var, ((i27 << 6) & 234881024) | (i27 & 8078), 64);
            t17Var2 = t17Var11;
            vf0Var3 = vf0Var4;
            o39Var3 = o39Var12;
            vj0Var3 = vj0VarM23998c;
            xj0Var3 = xj0Var4;
            z5 = z6;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
            z5 = z2;
            o39Var3 = o39Var2;
            vj0Var3 = vj0Var2;
            t17Var2 = t17Var;
            vf0Var3 = vf0Var2;
            xj0Var3 = xj0Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yj0(ui3Var, e16Var2, z5, o39Var3, vj0Var3, xj0Var3, vf0Var3, t17Var2, aj3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1149b(final sb9 sb9Var, e16 e16Var, ye1 ye1Var, int i) {
        Object obj;
        C0282a c0282a = xwc.f68912b;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-977568115);
        int i2 = (i & 6) == 0 ? (tj3Var.m22120g(sb9Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            final String strM11661w = fa4.m11661w(tj3Var, R$string.m3c_snackbar_pane_title);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                obj = objM22097O;
                cz2 cz2Var = new cz2();
                cz2Var.f34731a = new Object();
                cz2Var.f34732b = new ArrayList();
                tj3Var.m22131l0(cz2Var);
                obj = cz2Var;
            }
            obj = objM22097O;
            final cz2 cz2Var2 = (cz2) obj;
            Object obj2 = cz2Var2.f34731a;
            ArrayList arrayList = cz2Var2.f34732b;
            if (fa4.m11650l(sb9Var, obj2)) {
                tj3Var.m22111b0(1443889109);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1441886385);
                cz2Var2.f34731a = sb9Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((sb9) ((bz2) arrayList.get(i3)).m4237c());
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(sb9Var)) {
                    arrayList3.add(sb9Var);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj3 = arrayList3.get(i4);
                    if (obj3 != null) {
                        arrayList4.add(obj3);
                    }
                }
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    final sb9 sb9Var2 = (sb9) arrayList4.get(i5);
                    arrayList.add(new bz2(sb9Var2, ci8.m4703P(-1952400805, new aj3() { // from class: androidx.compose.material3.f0
                        @Override // p000.aj3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            zi3 zi3Var = (zi3) obj4;
                            ye1 ye1Var2 = (ye1) obj5;
                            int iIntValue = ((Integer) obj6).intValue();
                            int i6 = 2;
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= ((tj3) ye1Var2).m22124i(zi3Var) ? 4 : 2;
                            }
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                sb9 sb9Var3 = sb9Var2;
                                boolean zM11650l = fa4.m11650l(sb9Var3, sb9Var);
                                l43 l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var2);
                                boolean zM22120g = tj3Var2.m22120g(sb9Var3);
                                cz2 cz2Var3 = cz2Var2;
                                boolean zM22124i = zM22120g | tj3Var2.m22124i(cz2Var3);
                                Object objM22097O2 = tj3Var2.m22097O();
                                p84 p84Var = we1.f66679a;
                                if (zM22124i || objM22097O2 == p84Var) {
                                    objM22097O2 = new a45(27, sb9Var3, cz2Var3);
                                    tj3Var2.m22131l0(objM22097O2);
                                }
                                ui3 ui3Var = (ui3) objM22097O2;
                                Object objM22097O3 = tj3Var2.m22097O();
                                if (objM22097O3 == p84Var) {
                                    objM22097O3 = AbstractC3489q9.m19771a(!zM11650l ? 1.0f : 0.0f);
                                    tj3Var2.m22131l0(objM22097O3);
                                }
                                C0059a c0059a = (C0059a) objM22097O3;
                                Boolean boolValueOf = Boolean.valueOf(zM11650l);
                                boolean zM22124i2 = tj3Var2.m22124i(c0059a) | tj3Var2.m22122h(zM11650l) | tj3Var2.m22124i(l43VarM21705c0) | tj3Var2.m22120g(ui3Var);
                                Object objM22097O4 = tj3Var2.m22097O();
                                if (zM22124i2 || objM22097O4 == p84Var) {
                                    SnackbarHostKt$animatedOpacity$2$1 snackbarHostKt$animatedOpacity$2$1 = new SnackbarHostKt$animatedOpacity$2$1(c0059a, zM11650l, l43VarM21705c0, ui3Var, null);
                                    tj3Var2.m22131l0(snackbarHostKt$animatedOpacity$2$1);
                                    objM22097O4 = snackbarHostKt$animatedOpacity$2$1;
                                }
                                d32.m10047k(tj3Var2, (zi3) objM22097O4, boolValueOf);
                                C0817bn c0817bn = c0059a.f1540c;
                                l43 l43VarM21705c1 = ss5.m21705c0(MotionSchemeKeyTokens.FastSpatial, tj3Var2);
                                Object objM22097O5 = tj3Var2.m22097O();
                                if (objM22097O5 == p84Var) {
                                    objM22097O5 = AbstractC3489q9.m19771a(zM11650l ? 0.8f : 1.0f);
                                    tj3Var2.m22131l0(objM22097O5);
                                }
                                C0059a c0059a2 = (C0059a) objM22097O5;
                                Boolean boolValueOf2 = Boolean.valueOf(zM11650l);
                                boolean zM22124i3 = tj3Var2.m22124i(c0059a2) | tj3Var2.m22122h(zM11650l) | tj3Var2.m22124i(l43VarM21705c1);
                                Object objM22097O6 = tj3Var2.m22097O();
                                if (zM22124i3 || objM22097O6 == p84Var) {
                                    objM22097O6 = new SnackbarHostKt$animatedScale$1$1(c0059a2, zM11650l, l43VarM21705c1, null);
                                    tj3Var2.m22131l0(objM22097O6);
                                }
                                d32.m10047k(tj3Var2, (zi3) objM22097O6, boolValueOf2);
                                C0817bn c0817bn2 = c0059a2.f1540c;
                                e16 e16VarM1407b = AbstractC0309d.m1407b(b16.f7762a, ((Number) ((xc9) c0817bn2.f8704b).getValue()).floatValue(), ((Number) ((xc9) c0817bn2.f8704b).getValue()).floatValue(), ((Number) ((xc9) c0817bn.f8704b).getValue()).floatValue(), 0.0f, 0.0f, 0L, null, false, 1048568);
                                boolean zM22122h = tj3Var2.m22122h(zM11650l) | tj3Var2.m22120g(sb9Var3);
                                String str = strM11661w;
                                boolean zM22120g2 = zM22122h | tj3Var2.m22120g(str);
                                Object objM22097O7 = tj3Var2.m22097O();
                                if (zM22120g2 || objM22097O7 == p84Var) {
                                    objM22097O7 = new fi3(zM11650l, str, sb9Var3, i6);
                                    tj3Var2.m22131l0(objM22097O7);
                                }
                                e16 e16VarM17643c = nv8.m17643c(e16VarM1407b, false, (vi3) objM22097O7);
                                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                                l77 l77VarM22132m = tj3Var2.m22132m();
                                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM17643c);
                                se1.f60731q.getClass();
                                ui3 ui3Var2 = C0352b.f4299b;
                                tj3Var2.m22119f0();
                                if (tj3Var2.f62384S) {
                                    tj3Var2.m22130l(ui3Var2);
                                } else {
                                    tj3Var2.m22137o0();
                                }
                                oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
                                oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                                oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                                oha.m18000f(tj3Var2, C0352b.f4305h);
                                oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                                zi3Var.invoke(tj3Var2, Integer.valueOf(iIntValue & 14));
                                tj3Var2.m22139q(true);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var)));
                }
                tj3Var.m22139q(false);
            }
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            x18 x18VarM22083A = tj3Var.m22083A();
            if (x18VarM22083A == null) {
                C3386nv.m17633t("no recompose scope found");
                return;
            }
            x18VarM22083A.f67640b |= 1;
            cz2Var2.f34733c = x18VarM22083A;
            tj3Var.m22111b0(-1888182177);
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                bz2 bz2Var = (bz2) arrayList.get(i6);
                sb9 sb9Var3 = (sb9) bz2Var.m4235a();
                aj3 aj3VarM4236b = bz2Var.m4236b();
                tj3Var.m22106Y(1325010085, sb9Var3);
                ((C0282a) aj3VarM4236b).invoke(ci8.m4703P(-1893791890, new C3186kj(sb9Var3, 20), tj3Var), tj3Var, 6);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3504qn(sb9Var, i, 12, e16Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x0166  */
    /* JADX WARN: Code duplicated, block: B:116:0x016b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0172  */
    /* JADX WARN: Code duplicated, block: B:120:0x0177  */
    /* JADX WARN: Code duplicated, block: B:121:0x017a  */
    /* JADX WARN: Code duplicated, block: B:124:0x018a  */
    /* JADX WARN: Code duplicated, block: B:127:0x019e  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:138:0x01db  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:147:0x0200 A[PHI: r38
      0x0200: PHI (r38v4 float) = (r38v1 float), (r38v5 float) binds: [B:146:0x01fe, B:144:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x0203  */
    /* JADX WARN: Code duplicated, block: B:151:0x0210  */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:155:0x021e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x0224  */
    /* JADX WARN: Code duplicated, block: B:161:0x0235  */
    /* JADX WARN: Code duplicated, block: B:165:0x023f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0245 A[PHI: r18
      0x0245: PHI (r18v3 int) = (r18v1 int), (r18v5 int) binds: [B:166:0x0243, B:164:0x023c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:168:0x0248  */
    /* JADX WARN: Code duplicated, block: B:171:0x0252  */
    /* JADX WARN: Code duplicated, block: B:172:0x0255  */
    /* JADX WARN: Code duplicated, block: B:175:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x025f  */
    /* JADX WARN: Code duplicated, block: B:179:0x02af  */
    /* JADX WARN: Code duplicated, block: B:181:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:189:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:191:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:193:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:195:0x0305  */
    /* JADX WARN: Code duplicated, block: B:198:0x0323  */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0105  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x012c  */
    /* JADX INFO: renamed from: c */
    public static final void m1150c(final ui3 ui3Var, e16 e16Var, C0269z c0269z, float f, boolean z, o39 o39Var, long j, long j2, long j3, zi3 zi3Var, zi3 zi3Var2, q06 q06Var, final C0282a c0282a, ye1 ye1Var, final int i, final int i2, final int i3) {
        int i4;
        e16 e16Var2;
        C0269z c0269z2;
        int i5;
        int i6;
        int i7;
        long jM20492e;
        int i8;
        int i9;
        zi3 zi3Var3;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        final float f2;
        final boolean z4;
        final o39 o39Var2;
        final zi3 zi3Var4;
        final q06 q06Var2;
        tj3 tj3Var;
        final long j4;
        final e16 e16Var3;
        final C0269z c0269z3;
        final zi3 zi3Var5;
        final long j5;
        final long j6;
        x18 x18VarM22143u;
        e16 e16Var4;
        C0269z c0269zM1154g;
        boolean z5;
        int i12;
        int i13;
        long jM17408b;
        zi3 yu4Var;
        q06 q06Var3;
        final long j7;
        final zi3 zi3Var6;
        int i14;
        float f3;
        boolean z6;
        final zi3 zi3Var7;
        final o39 o39Var3;
        final long j8;
        Object objM22097O;
        p84 p84Var;
        un1 un1Var;
        int i15;
        float f4;
        boolean z7;
        int i16;
        boolean z8;
        boolean z9;
        Object objM22097O2;
        int i17;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objM22097O3;
        final C0269z c0269z4;
        int i18;
        Object objM22097O4;
        int i19;
        int i20;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1904798512);
        if ((i & 6) == 0) {
            i4 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i21 = i3 & 2;
        if (i21 == 0) {
            if ((i & 48) == 0) {
                e16Var2 = e16Var;
                i4 |= tj3Var2.m22120g(e16Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i3 & 4) == 0) {
                    c0269z2 = c0269z;
                    int i22 = tj3Var2.m22120g(c0269z2) ? 256 : 128;
                    i4 |= i22;
                } else {
                    c0269z2 = c0269z;
                }
                i4 |= i22;
            } else {
                c0269z2 = c0269z;
            }
            i5 = i4 | 3072;
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    if (tj3Var2.m22122h(z)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                if ((196608 & i) == 0) {
                    i5 |= 65536;
                }
                if ((1572864 & i) == 0) {
                    jM20492e = j;
                    if ((i3 & 64) == 0 || !tj3Var2.m22118f(jM20492e)) {
                        i20 = 524288;
                    } else {
                        i20 = 1048576;
                    }
                    i5 |= i20;
                } else {
                    jM20492e = j;
                }
                if ((i & 12582912) == 0) {
                    i5 |= 4194304;
                }
                i8 = i5 | 100663296;
                if ((i & 805306368) != 0) {
                    if ((i3 & 512) == 0 || !tj3Var2.m22118f(j3)) {
                        i19 = 268435456;
                    } else {
                        i19 = 536870912;
                    }
                    i8 |= i19;
                }
                i9 = i3 & 1024;
                if (i9 != 0) {
                    zi3Var3 = zi3Var;
                    i10 = 3078;
                } else {
                    zi3Var3 = zi3Var;
                    if ((i2 & 6) == 0) {
                        if (tj3Var2.m22124i(zi3Var3)) {
                            i11 = 4;
                        } else {
                            i11 = 2;
                        }
                        i10 = i2 | i11;
                    } else {
                        i10 = i2;
                    }
                }
                int i23 = i10 | (((i3 & 2048) == 0 || !tj3Var2.m22124i(zi3Var2)) ? 16 : 32) | 384;
                z2 = true;
                if ((i8 & 306783379) == 306783378 || (i23 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i8 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0 || tj3Var2.m22084B()) {
                        if (i21 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if ((i3 & 4) != 0) {
                            c0269zM1154g = m1154g(false, tj3Var2, 0, 3);
                            i8 &= -897;
                        } else {
                            c0269zM1154g = c0269z2;
                        }
                        float f5 = ng0.f52695b;
                        if (i6 != 0) {
                            z5 = true;
                        } else {
                            z5 = z;
                        }
                        ng0 ng0Var = ng0.f52694a;
                        o39 o39VarM24271b = x49.m24271b(k59.f46733b, tj3Var2);
                        i12 = i8 & (-458753);
                        if ((i3 & 64) != 0) {
                            jM20492e = ra1.m20492e(k59.f46732a, tj3Var2);
                            i12 = i8 & (-4128769);
                        }
                        long jM20489b = ra1.m20489b(jM20492e, tj3Var2);
                        i13 = i12 & (-29360129);
                        if ((i3 & 512) != 0) {
                            jM17408b = ng0.m17408b(tj3Var2);
                            i13 = i12 & (-1908408321);
                        } else {
                            jM17408b = j3;
                        }
                        if (i9 != 0) {
                            zi3Var3 = y0c.f69082a;
                        }
                        if ((i3 & 2048) != 0) {
                            yu4Var = new yu4(15);
                        } else {
                            yu4Var = zi3Var2;
                        }
                        q06Var3 = new q06();
                        j7 = jM20489b;
                        boolean z13 = z5;
                        zi3Var6 = yu4Var;
                        i14 = i13;
                        long j9 = jM20492e;
                        f3 = f5;
                        z6 = z13;
                        zi3Var7 = zi3Var3;
                        o39Var3 = o39VarM24271b;
                        j8 = j9;
                    } else {
                        tj3Var2.m22102U();
                        if ((i3 & 4) != 0) {
                            i8 &= -897;
                        }
                        int i24 = i8 & (-458753);
                        if ((i3 & 64) != 0) {
                            i24 = i8 & (-4128769);
                        }
                        int i25 = i24 & (-29360129);
                        if ((i3 & 512) != 0) {
                            i25 = i24 & (-1908408321);
                        }
                        j7 = j2;
                        jM17408b = j3;
                        q06Var3 = q06Var;
                        i14 = i25;
                        j8 = jM20492e;
                        e16Var4 = e16Var2;
                        c0269zM1154g = c0269z2;
                        zi3Var7 = zi3Var3;
                        f3 = f;
                        z6 = z;
                        o39Var3 = o39Var;
                        zi3Var6 = zi3Var2;
                    }
                    tj3Var2.m22140r();
                    objM22097O = tj3Var2.m22097O();
                    p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = d32.m10013K(tj3Var2);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    un1Var = (un1) objM22097O;
                    final e16 e16Var5 = e16Var4;
                    i15 = (i14 & 896) ^ 384;
                    final q06 q06Var4 = q06Var3;
                    if (i15 > 256 || !tj3Var2.m22120g(c0269zM1154g)) {
                        f4 = f3;
                        if ((i14 & 384) != 256) {
                            z7 = false;
                        }
                        boolean zM22124i = z7 | tj3Var2.m22124i(un1Var);
                        i16 = i14 & 14;
                        if (i16 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = zM22124i | z8;
                        objM22097O2 = tj3Var2.m22097O();
                        if (z9 || objM22097O2 == p84Var) {
                            objM22097O2 = new C0221b(c0269zM1154g, un1Var, ui3Var, 2);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        final ui3 ui3Var2 = (ui3) objM22097O2;
                        if (i15 > 256 || !tj3Var2.m22120g(c0269zM1154g)) {
                            i17 = i15;
                            if ((i14 & 384) != 256) {
                                z10 = false;
                            }
                            boolean zM22124i2 = z10 | tj3Var2.m22124i(un1Var);
                            if (i16 == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = zM22124i2 | z11;
                            objM22097O3 = tj3Var2.m22097O();
                            if (z12 || objM22097O3 == p84Var) {
                                objM22097O3 = new C0221b(c0269zM1154g, un1Var, ui3Var, 3);
                                tj3Var2.m22131l0(objM22097O3);
                            }
                            ui3 ui3Var3 = (ui3) objM22097O3;
                            c0269z4 = c0269zM1154g;
                            final float f6 = f4;
                            final boolean z14 = z6;
                            int i26 = i14;
                            i18 = i17;
                            final long j10 = jM17408b;
                            xpb.m24635a(ui3Var3, j7, q06Var4, ci8.m4703P(-1328793519, new zi3() { // from class: o06
                                @Override // p000.zi3
                                public final Object invoke(Object obj, Object obj2) {
                                    ye1 ye1Var2 = (ye1) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    tj3 tj3Var3 = (tj3) ye1Var2;
                                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
                                        Object objM22097O5 = tj3Var3.m22097O();
                                        p84 p84Var2 = we1.f66679a;
                                        if (objM22097O5 == p84Var2) {
                                            objM22097O5 = new lz5(3);
                                            tj3Var3.m22131l0(objM22097O5);
                                        }
                                        e16 e16VarM17643c = nv8.m17643c(e16VarM4411d, false, (vi3) objM22097O5);
                                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                                        l77 l77VarM22132m = tj3Var3.m22132m();
                                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM17643c);
                                        se1.f60731q.getClass();
                                        ui3 ui3Var4 = C0352b.f4299b;
                                        tj3Var3.m22119f0();
                                        if (tj3Var3.f62384S) {
                                            tj3Var3.m22130l(ui3Var4);
                                        } else {
                                            tj3Var3.m22137o0();
                                        }
                                        oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d);
                                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                                        oha.m18000f(tj3Var3, C0352b.f4305h);
                                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                                        C0269z c0269z5 = c0269z4;
                                        boolean zM22120g = tj3Var3.m22120g(c0269z5);
                                        Object objM22097O6 = tj3Var3.m22097O();
                                        if (zM22120g || objM22097O6 == p84Var2) {
                                            objM22097O6 = new p59(c0269z5);
                                            tj3Var3.m22131l0(objM22097O6);
                                        }
                                        p59 p59Var = (p59) objM22097O6;
                                        Object objM22097O7 = tj3Var3.m22097O();
                                        if (objM22097O7 == p84Var2) {
                                            objM22097O7 = AbstractC0278f.m1254d(new hz4(c0269z5, 9));
                                            tj3Var3.m22131l0(objM22097O7);
                                        }
                                        dh9 dh9VarM750b = AbstractC0060b.m750b(((Boolean) ((dh9) objM22097O7).getValue()).booleanValue() ? 1.0f : 0.0f, ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var3), "ScrimAlphaAnimation", null, tj3Var3, 3072, 20);
                                        String strM11661w = fa4.m11661w(tj3Var3, R$string.close_sheet);
                                        q06 q06Var5 = q06Var4;
                                        ui3 ui3Var5 = q06Var5.f57095c ? ui3Var2 : null;
                                        boolean zM22120g2 = tj3Var3.m22120g(dh9VarM750b);
                                        Object objM22097O8 = tj3Var3.m22097O();
                                        if (zM22120g2 || objM22097O8 == p84Var2) {
                                            objM22097O8 = new eo4(dh9VarM750b, 3);
                                            tj3Var3.m22131l0(objM22097O8);
                                        }
                                        wyc.m24221a(strM11661w, null, ui3Var5, (ui3) objM22097O8, j10, tj3Var3, 0);
                                        AbstractC0229f.m1144a(wfb.m23915j(ci0.f10109a.mo3727a(e16Var5, nj0.f52809d), p59Var), c0269z5, ui3Var, f6, z14, q06Var5.f57094b, zi3Var7, zi3Var6, o39Var3, j8, j7, 0.0f, c0282a, tj3Var3, 0);
                                        tj3Var3.m22139q(true);
                                    } else {
                                        tj3Var3.m22102U();
                                    }
                                    return xfa.f68157a;
                                }
                            }, tj3Var2), tj3Var2, 3456);
                            if (c0269z4.f3651e.m849c().m130c(SheetValue.Expanded)) {
                                tj3Var2.m22111b0(748164146);
                                if ((i18 > 256 || !tj3Var2.m22120g(c0269z4)) && (i26 & 384) != 256) {
                                }
                                objM22097O4 = tj3Var2.m22097O();
                                if (z2 || objM22097O4 == p84Var) {
                                    objM22097O4 = new ModalBottomSheetKt$ModalBottomSheet$3$1(c0269z4, null);
                                    tj3Var2.m22131l0(objM22097O4);
                                }
                                d32.m10047k(tj3Var2, (zi3) objM22097O4, c0269z4);
                                tj3Var2.m22139q(false);
                            } else {
                                tj3Var2.m22111b0(748225650);
                                tj3Var2.m22139q(false);
                            }
                            c0269z3 = c0269z4;
                            tj3Var = tj3Var2;
                            long j11 = j7;
                            q06Var2 = q06Var4;
                            e16Var3 = e16Var5;
                            o39Var2 = o39Var3;
                            f2 = f6;
                            z4 = z14;
                            j4 = j8;
                            zi3Var5 = zi3Var7;
                            zi3Var4 = zi3Var6;
                            j5 = j11;
                            j6 = j10;
                        } else {
                            i17 = i15;
                        }
                        z10 = true;
                        boolean zM22124i3 = z10 | tj3Var2.m22124i(un1Var);
                        if (i16 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = zM22124i3 | z11;
                        objM22097O3 = tj3Var2.m22097O();
                        if (z12) {
                            objM22097O3 = new C0221b(c0269zM1154g, un1Var, ui3Var, 3);
                            tj3Var2.m22131l0(objM22097O3);
                        } else {
                            objM22097O3 = new C0221b(c0269zM1154g, un1Var, ui3Var, 3);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        ui3 ui3Var4 = (ui3) objM22097O3;
                        c0269z4 = c0269zM1154g;
                        final float f7 = f4;
                        final boolean z15 = z6;
                        int i27 = i14;
                        i18 = i17;
                        final long j12 = jM17408b;
                        xpb.m24635a(ui3Var4, j7, q06Var4, ci8.m4703P(-1328793519, new zi3() { // from class: o06
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                tj3 tj3Var3 = (tj3) ye1Var2;
                                if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
                                    Object objM22097O5 = tj3Var3.m22097O();
                                    p84 p84Var2 = we1.f66679a;
                                    if (objM22097O5 == p84Var2) {
                                        objM22097O5 = new lz5(3);
                                        tj3Var3.m22131l0(objM22097O5);
                                    }
                                    e16 e16VarM17643c = nv8.m17643c(e16VarM4411d, false, (vi3) objM22097O5);
                                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                                    int iHashCode = Long.hashCode(tj3Var3.f62385T);
                                    l77 l77VarM22132m = tj3Var3.m22132m();
                                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM17643c);
                                    se1.f60731q.getClass();
                                    ui3 ui3Var5 = C0352b.f4299b;
                                    tj3Var3.m22119f0();
                                    if (tj3Var3.f62384S) {
                                        tj3Var3.m22130l(ui3Var5);
                                    } else {
                                        tj3Var3.m22137o0();
                                    }
                                    oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d);
                                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                                    oha.m18000f(tj3Var3, C0352b.f4305h);
                                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                                    C0269z c0269z5 = c0269z4;
                                    boolean zM22120g = tj3Var3.m22120g(c0269z5);
                                    Object objM22097O6 = tj3Var3.m22097O();
                                    if (zM22120g || objM22097O6 == p84Var2) {
                                        objM22097O6 = new p59(c0269z5);
                                        tj3Var3.m22131l0(objM22097O6);
                                    }
                                    p59 p59Var = (p59) objM22097O6;
                                    Object objM22097O7 = tj3Var3.m22097O();
                                    if (objM22097O7 == p84Var2) {
                                        objM22097O7 = AbstractC0278f.m1254d(new hz4(c0269z5, 9));
                                        tj3Var3.m22131l0(objM22097O7);
                                    }
                                    dh9 dh9VarM750b = AbstractC0060b.m750b(((Boolean) ((dh9) objM22097O7).getValue()).booleanValue() ? 1.0f : 0.0f, ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var3), "ScrimAlphaAnimation", null, tj3Var3, 3072, 20);
                                    String strM11661w = fa4.m11661w(tj3Var3, R$string.close_sheet);
                                    q06 q06Var5 = q06Var4;
                                    ui3 ui3Var6 = q06Var5.f57095c ? ui3Var2 : null;
                                    boolean zM22120g2 = tj3Var3.m22120g(dh9VarM750b);
                                    Object objM22097O8 = tj3Var3.m22097O();
                                    if (zM22120g2 || objM22097O8 == p84Var2) {
                                        objM22097O8 = new eo4(dh9VarM750b, 3);
                                        tj3Var3.m22131l0(objM22097O8);
                                    }
                                    wyc.m24221a(strM11661w, null, ui3Var6, (ui3) objM22097O8, j12, tj3Var3, 0);
                                    AbstractC0229f.m1144a(wfb.m23915j(ci0.f10109a.mo3727a(e16Var5, nj0.f52809d), p59Var), c0269z5, ui3Var, f7, z15, q06Var5.f57094b, zi3Var7, zi3Var6, o39Var3, j8, j7, 0.0f, c0282a, tj3Var3, 0);
                                    tj3Var3.m22139q(true);
                                } else {
                                    tj3Var3.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }, tj3Var2), tj3Var2, 3456);
                        if (c0269z4.f3651e.m849c().m130c(SheetValue.Expanded)) {
                            tj3Var2.m22111b0(748164146);
                            z2 = i18 > 256 ? false : false;
                            objM22097O4 = tj3Var2.m22097O();
                            if (z2) {
                                objM22097O4 = new ModalBottomSheetKt$ModalBottomSheet$3$1(c0269z4, null);
                                tj3Var2.m22131l0(objM22097O4);
                            } else {
                                objM22097O4 = new ModalBottomSheetKt$ModalBottomSheet$3$1(c0269z4, null);
                                tj3Var2.m22131l0(objM22097O4);
                            }
                            d32.m10047k(tj3Var2, (zi3) objM22097O4, c0269z4);
                            tj3Var2.m22139q(false);
                        } else {
                            tj3Var2.m22111b0(748225650);
                            tj3Var2.m22139q(false);
                        }
                        c0269z3 = c0269z4;
                        tj3Var = tj3Var2;
                        long j13 = j7;
                        q06Var2 = q06Var4;
                        e16Var3 = e16Var5;
                        o39Var2 = o39Var3;
                        f2 = f7;
                        z4 = z15;
                        j4 = j8;
                        zi3Var5 = zi3Var7;
                        zi3Var4 = zi3Var6;
                        j5 = j13;
                        j6 = j12;
                    } else {
                        f4 = f3;
                    }
                    z7 = true;
                    boolean zM22124i4 = z7 | tj3Var2.m22124i(un1Var);
                    i16 = i14 & 14;
                    if (i16 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = zM22124i4 | z8;
                    objM22097O2 = tj3Var2.m22097O();
                    if (z9) {
                        objM22097O2 = new C0221b(c0269zM1154g, un1Var, ui3Var, 2);
                        tj3Var2.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new C0221b(c0269zM1154g, un1Var, ui3Var, 2);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    final ui3 ui3Var5 = (ui3) objM22097O2;
                    if (i15 > 256) {
                        i17 = i15;
                        if ((i14 & 384) != 256) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        i17 = i15;
                        if ((i14 & 384) != 256) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    boolean zM22124i5 = z10 | tj3Var2.m22124i(un1Var);
                    if (i16 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zM22124i5 | z11;
                    objM22097O3 = tj3Var2.m22097O();
                    if (z12) {
                        objM22097O3 = new C0221b(c0269zM1154g, un1Var, ui3Var, 3);
                        tj3Var2.m22131l0(objM22097O3);
                    } else {
                        objM22097O3 = new C0221b(c0269zM1154g, un1Var, ui3Var, 3);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    ui3 ui3Var6 = (ui3) objM22097O3;
                    c0269z4 = c0269zM1154g;
                    final float f8 = f4;
                    final boolean z16 = z6;
                    int i28 = i14;
                    i18 = i17;
                    final long j14 = jM17408b;
                    xpb.m24635a(ui3Var6, j7, q06Var4, ci8.m4703P(-1328793519, new zi3() { // from class: o06
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            tj3 tj3Var3 = (tj3) ye1Var2;
                            if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
                                Object objM22097O5 = tj3Var3.m22097O();
                                p84 p84Var2 = we1.f66679a;
                                if (objM22097O5 == p84Var2) {
                                    objM22097O5 = new lz5(3);
                                    tj3Var3.m22131l0(objM22097O5);
                                }
                                e16 e16VarM17643c = nv8.m17643c(e16VarM4411d, false, (vi3) objM22097O5);
                                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                                int iHashCode = Long.hashCode(tj3Var3.f62385T);
                                l77 l77VarM22132m = tj3Var3.m22132m();
                                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM17643c);
                                se1.f60731q.getClass();
                                ui3 ui3Var7 = C0352b.f4299b;
                                tj3Var3.m22119f0();
                                if (tj3Var3.f62384S) {
                                    tj3Var3.m22130l(ui3Var7);
                                } else {
                                    tj3Var3.m22137o0();
                                }
                                oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d);
                                oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                                oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                                oha.m18000f(tj3Var3, C0352b.f4305h);
                                oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                                C0269z c0269z5 = c0269z4;
                                boolean zM22120g = tj3Var3.m22120g(c0269z5);
                                Object objM22097O6 = tj3Var3.m22097O();
                                if (zM22120g || objM22097O6 == p84Var2) {
                                    objM22097O6 = new p59(c0269z5);
                                    tj3Var3.m22131l0(objM22097O6);
                                }
                                p59 p59Var = (p59) objM22097O6;
                                Object objM22097O7 = tj3Var3.m22097O();
                                if (objM22097O7 == p84Var2) {
                                    objM22097O7 = AbstractC0278f.m1254d(new hz4(c0269z5, 9));
                                    tj3Var3.m22131l0(objM22097O7);
                                }
                                dh9 dh9VarM750b = AbstractC0060b.m750b(((Boolean) ((dh9) objM22097O7).getValue()).booleanValue() ? 1.0f : 0.0f, ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var3), "ScrimAlphaAnimation", null, tj3Var3, 3072, 20);
                                String strM11661w = fa4.m11661w(tj3Var3, R$string.close_sheet);
                                q06 q06Var5 = q06Var4;
                                ui3 ui3Var8 = q06Var5.f57095c ? ui3Var5 : null;
                                boolean zM22120g2 = tj3Var3.m22120g(dh9VarM750b);
                                Object objM22097O8 = tj3Var3.m22097O();
                                if (zM22120g2 || objM22097O8 == p84Var2) {
                                    objM22097O8 = new eo4(dh9VarM750b, 3);
                                    tj3Var3.m22131l0(objM22097O8);
                                }
                                wyc.m24221a(strM11661w, null, ui3Var8, (ui3) objM22097O8, j14, tj3Var3, 0);
                                AbstractC0229f.m1144a(wfb.m23915j(ci0.f10109a.mo3727a(e16Var5, nj0.f52809d), p59Var), c0269z5, ui3Var, f8, z16, q06Var5.f57094b, zi3Var7, zi3Var6, o39Var3, j8, j7, 0.0f, c0282a, tj3Var3, 0);
                                tj3Var3.m22139q(true);
                            } else {
                                tj3Var3.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var2), tj3Var2, 3456);
                    if (c0269z4.f3651e.m849c().m130c(SheetValue.Expanded)) {
                        tj3Var2.m22111b0(748164146);
                        if (i18 > 256) {
                        }
                        objM22097O4 = tj3Var2.m22097O();
                        if (z2) {
                            objM22097O4 = new ModalBottomSheetKt$ModalBottomSheet$3$1(c0269z4, null);
                            tj3Var2.m22131l0(objM22097O4);
                        } else {
                            objM22097O4 = new ModalBottomSheetKt$ModalBottomSheet$3$1(c0269z4, null);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        d32.m10047k(tj3Var2, (zi3) objM22097O4, c0269z4);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(748225650);
                        tj3Var2.m22139q(false);
                    }
                    c0269z3 = c0269z4;
                    tj3Var = tj3Var2;
                    long j15 = j7;
                    q06Var2 = q06Var4;
                    e16Var3 = e16Var5;
                    o39Var2 = o39Var3;
                    f2 = f8;
                    z4 = z16;
                    j4 = j8;
                    zi3Var5 = zi3Var7;
                    zi3Var4 = zi3Var6;
                    j5 = j15;
                    j6 = j14;
                } else {
                    tj3Var2.m22102U();
                    f2 = f;
                    z4 = z;
                    o39Var2 = o39Var;
                    zi3Var4 = zi3Var2;
                    q06Var2 = q06Var;
                    tj3Var = tj3Var2;
                    j4 = jM20492e;
                    e16Var3 = e16Var2;
                    c0269z3 = c0269z2;
                    zi3Var5 = zi3Var3;
                    j5 = j2;
                    j6 = j3;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: p06
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i | 1);
                            int iM19383z2 = pk9.m19383z(i2);
                            AbstractC0231g.m1150c(ui3Var, e16Var3, c0269z3, f2, z4, o39Var2, j4, j5, j6, zi3Var5, zi3Var4, q06Var2, c0282a, (ye1) obj, iM19383z, iM19383z2, i3);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i5 = i4 | 27648;
            if ((196608 & i) == 0) {
                i5 |= 65536;
            }
            if ((1572864 & i) == 0) {
                jM20492e = j;
                if ((i3 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i5 |= i20;
            } else {
                jM20492e = j;
            }
            if ((i & 12582912) == 0) {
                i5 |= 4194304;
            }
            i8 = i5 | 100663296;
            if ((i & 805306368) != 0) {
                if ((i3 & 512) == 0) {
                    i19 = 268435456;
                } else {
                    i19 = 268435456;
                }
                i8 |= i19;
            }
            i9 = i3 & 1024;
            if (i9 != 0) {
                zi3Var3 = zi3Var;
                i10 = 3078;
            } else {
                zi3Var3 = zi3Var;
                if ((i2 & 6) == 0) {
                    if (tj3Var2.m22124i(zi3Var3)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    i10 = i2 | i11;
                } else {
                    i10 = i2;
                }
            }
            int i29 = i10 | (((i3 & 2048) == 0 || !tj3Var2.m22124i(zi3Var2)) ? 16 : 32) | 384;
            z2 = true;
            if ((i8 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (tj3Var2.m22099R(i8 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i21 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i3 & 4) != 0) {
                        c0269zM1154g = m1154g(false, tj3Var2, 0, 3);
                        i8 &= -897;
                    } else {
                        c0269zM1154g = c0269z2;
                    }
                    float f9 = ng0.f52695b;
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    ng0 ng0Var2 = ng0.f52694a;
                    o39 o39VarM24271b2 = x49.m24271b(k59.f46733b, tj3Var2);
                    i12 = i8 & (-458753);
                    if ((i3 & 64) != 0) {
                        jM20492e = ra1.m20492e(k59.f46732a, tj3Var2);
                        i12 = i8 & (-4128769);
                    }
                    long jM20489b2 = ra1.m20489b(jM20492e, tj3Var2);
                    i13 = i12 & (-29360129);
                    if ((i3 & 512) != 0) {
                        jM17408b = ng0.m17408b(tj3Var2);
                        i13 = i12 & (-1908408321);
                    } else {
                        jM17408b = j3;
                    }
                    if (i9 != 0) {
                        zi3Var3 = y0c.f69082a;
                    }
                    if ((i3 & 2048) != 0) {
                        yu4Var = new yu4(15);
                    } else {
                        yu4Var = zi3Var2;
                    }
                    q06Var3 = new q06();
                    j7 = jM20489b2;
                    boolean z17 = z5;
                    zi3Var6 = yu4Var;
                    i14 = i13;
                    long j16 = jM20492e;
                    f3 = f9;
                    z6 = z17;
                    zi3Var7 = zi3Var3;
                    o39Var3 = o39VarM24271b2;
                    j8 = j16;
                } else {
                    if (i21 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i3 & 4) != 0) {
                        c0269zM1154g = m1154g(false, tj3Var2, 0, 3);
                        i8 &= -897;
                    } else {
                        c0269zM1154g = c0269z2;
                    }
                    float f10 = ng0.f52695b;
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    ng0 ng0Var3 = ng0.f52694a;
                    o39 o39VarM24271b3 = x49.m24271b(k59.f46733b, tj3Var2);
                    i12 = i8 & (-458753);
                    if ((i3 & 64) != 0) {
                        jM20492e = ra1.m20492e(k59.f46732a, tj3Var2);
                        i12 = i8 & (-4128769);
                    }
                    long jM20489b3 = ra1.m20489b(jM20492e, tj3Var2);
                    i13 = i12 & (-29360129);
                    if ((i3 & 512) != 0) {
                        jM17408b = ng0.m17408b(tj3Var2);
                        i13 = i12 & (-1908408321);
                    } else {
                        jM17408b = j3;
                    }
                    if (i9 != 0) {
                        zi3Var3 = y0c.f69082a;
                    }
                    if ((i3 & 2048) != 0) {
                        yu4Var = new yu4(15);
                    } else {
                        yu4Var = zi3Var2;
                    }
                    q06Var3 = new q06();
                    j7 = jM20489b3;
                    boolean z18 = z5;
                    zi3Var6 = yu4Var;
                    i14 = i13;
                    long j17 = jM20492e;
                    f3 = f10;
                    z6 = z18;
                    zi3Var7 = zi3Var3;
                    o39Var3 = o39VarM24271b3;
                    j8 = j17;
                }
                tj3Var2.m22140r();
                objM22097O = tj3Var2.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = d32.m10013K(tj3Var2);
                    tj3Var2.m22131l0(objM22097O);
                }
                un1Var = (un1) objM22097O;
                final e16 e16Var6 = e16Var4;
                i15 = (i14 & 896) ^ 384;
                final q06 q06Var5 = q06Var3;
                if (i15 > 256) {
                    f4 = f3;
                    if ((i14 & 384) != 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    f4 = f3;
                    if ((i14 & 384) != 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                }
                boolean zM22124i6 = z7 | tj3Var2.m22124i(un1Var);
                i16 = i14 & 14;
                if (i16 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zM22124i6 | z8;
                objM22097O2 = tj3Var2.m22097O();
                if (z9) {
                    objM22097O2 = new C0221b(c0269zM1154g, un1Var, ui3Var, 2);
                    tj3Var2.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new C0221b(c0269zM1154g, un1Var, ui3Var, 2);
                    tj3Var2.m22131l0(objM22097O2);
                }
                final ui3 ui3Var7 = (ui3) objM22097O2;
                if (i15 > 256) {
                    i17 = i15;
                    if ((i14 & 384) != 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    i17 = i15;
                    if ((i14 & 384) != 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                boolean zM22124i7 = z10 | tj3Var2.m22124i(un1Var);
                if (i16 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zM22124i7 | z11;
                objM22097O3 = tj3Var2.m22097O();
                if (z12) {
                    objM22097O3 = new C0221b(c0269zM1154g, un1Var, ui3Var, 3);
                    tj3Var2.m22131l0(objM22097O3);
                } else {
                    objM22097O3 = new C0221b(c0269zM1154g, un1Var, ui3Var, 3);
                    tj3Var2.m22131l0(objM22097O3);
                }
                ui3 ui3Var8 = (ui3) objM22097O3;
                c0269z4 = c0269zM1154g;
                final float f11 = f4;
                final boolean z19 = z6;
                int i210 = i14;
                i18 = i17;
                final long j18 = jM17408b;
                xpb.m24635a(ui3Var8, j7, q06Var5, ci8.m4703P(-1328793519, new zi3() { // from class: o06
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        tj3 tj3Var3 = (tj3) ye1Var2;
                        if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
                            Object objM22097O5 = tj3Var3.m22097O();
                            p84 p84Var2 = we1.f66679a;
                            if (objM22097O5 == p84Var2) {
                                objM22097O5 = new lz5(3);
                                tj3Var3.m22131l0(objM22097O5);
                            }
                            e16 e16VarM17643c = nv8.m17643c(e16VarM4411d, false, (vi3) objM22097O5);
                            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                            int iHashCode = Long.hashCode(tj3Var3.f62385T);
                            l77 l77VarM22132m = tj3Var3.m22132m();
                            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM17643c);
                            se1.f60731q.getClass();
                            ui3 ui3Var9 = C0352b.f4299b;
                            tj3Var3.m22119f0();
                            if (tj3Var3.f62384S) {
                                tj3Var3.m22130l(ui3Var9);
                            } else {
                                tj3Var3.m22137o0();
                            }
                            oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d);
                            oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                            oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                            oha.m18000f(tj3Var3, C0352b.f4305h);
                            oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                            C0269z c0269z5 = c0269z4;
                            boolean zM22120g = tj3Var3.m22120g(c0269z5);
                            Object objM22097O6 = tj3Var3.m22097O();
                            if (zM22120g || objM22097O6 == p84Var2) {
                                objM22097O6 = new p59(c0269z5);
                                tj3Var3.m22131l0(objM22097O6);
                            }
                            p59 p59Var = (p59) objM22097O6;
                            Object objM22097O7 = tj3Var3.m22097O();
                            if (objM22097O7 == p84Var2) {
                                objM22097O7 = AbstractC0278f.m1254d(new hz4(c0269z5, 9));
                                tj3Var3.m22131l0(objM22097O7);
                            }
                            dh9 dh9VarM750b = AbstractC0060b.m750b(((Boolean) ((dh9) objM22097O7).getValue()).booleanValue() ? 1.0f : 0.0f, ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var3), "ScrimAlphaAnimation", null, tj3Var3, 3072, 20);
                            String strM11661w = fa4.m11661w(tj3Var3, R$string.close_sheet);
                            q06 q06Var6 = q06Var5;
                            ui3 ui3Var10 = q06Var6.f57095c ? ui3Var7 : null;
                            boolean zM22120g2 = tj3Var3.m22120g(dh9VarM750b);
                            Object objM22097O8 = tj3Var3.m22097O();
                            if (zM22120g2 || objM22097O8 == p84Var2) {
                                objM22097O8 = new eo4(dh9VarM750b, 3);
                                tj3Var3.m22131l0(objM22097O8);
                            }
                            wyc.m24221a(strM11661w, null, ui3Var10, (ui3) objM22097O8, j18, tj3Var3, 0);
                            AbstractC0229f.m1144a(wfb.m23915j(ci0.f10109a.mo3727a(e16Var6, nj0.f52809d), p59Var), c0269z5, ui3Var, f11, z19, q06Var6.f57094b, zi3Var7, zi3Var6, o39Var3, j8, j7, 0.0f, c0282a, tj3Var3, 0);
                            tj3Var3.m22139q(true);
                        } else {
                            tj3Var3.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var2), tj3Var2, 3456);
                if (c0269z4.f3651e.m849c().m130c(SheetValue.Expanded)) {
                    tj3Var2.m22111b0(748164146);
                    if (i18 > 256) {
                    }
                    objM22097O4 = tj3Var2.m22097O();
                    if (z2) {
                        objM22097O4 = new ModalBottomSheetKt$ModalBottomSheet$3$1(c0269z4, null);
                        tj3Var2.m22131l0(objM22097O4);
                    } else {
                        objM22097O4 = new ModalBottomSheetKt$ModalBottomSheet$3$1(c0269z4, null);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    d32.m10047k(tj3Var2, (zi3) objM22097O4, c0269z4);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(748225650);
                    tj3Var2.m22139q(false);
                }
                c0269z3 = c0269z4;
                tj3Var = tj3Var2;
                long j19 = j7;
                q06Var2 = q06Var5;
                e16Var3 = e16Var6;
                o39Var2 = o39Var3;
                f2 = f11;
                z4 = z19;
                j4 = j8;
                zi3Var5 = zi3Var7;
                zi3Var4 = zi3Var6;
                j5 = j19;
                j6 = j18;
            } else {
                tj3Var2.m22102U();
                f2 = f;
                z4 = z;
                o39Var2 = o39Var;
                zi3Var4 = zi3Var2;
                q06Var2 = q06Var;
                tj3Var = tj3Var2;
                j4 = jM20492e;
                e16Var3 = e16Var2;
                c0269z3 = c0269z2;
                zi3Var5 = zi3Var3;
                j5 = j2;
                j6 = j3;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: p06
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i | 1);
                        int iM19383z2 = pk9.m19383z(i2);
                        AbstractC0231g.m1150c(ui3Var, e16Var3, c0269z3, f2, z4, o39Var2, j4, j5, j6, zi3Var5, zi3Var4, q06Var2, c0282a, (ye1) obj, iM19383z, iM19383z2, i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i4 |= 48;
        e16Var2 = e16Var;
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                c0269z2 = c0269z;
                if (tj3Var2.m22120g(c0269z2)) {
                }
                i4 |= i22;
            } else {
                c0269z2 = c0269z;
            }
            i4 |= i22;
        } else {
            c0269z2 = c0269z;
        }
        i5 = i4 | 3072;
        i6 = i3 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                if (tj3Var2.m22122h(z)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            if ((196608 & i) == 0) {
                i5 |= 65536;
            }
            if ((1572864 & i) == 0) {
                jM20492e = j;
                if ((i3 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i5 |= i20;
            } else {
                jM20492e = j;
            }
            if ((i & 12582912) == 0) {
                i5 |= 4194304;
            }
            i8 = i5 | 100663296;
            if ((i & 805306368) != 0) {
                if ((i3 & 512) == 0) {
                    i19 = 268435456;
                } else {
                    i19 = 268435456;
                }
                i8 |= i19;
            }
            i9 = i3 & 1024;
            if (i9 != 0) {
                zi3Var3 = zi3Var;
                i10 = 3078;
            } else {
                zi3Var3 = zi3Var;
                if ((i2 & 6) == 0) {
                    if (tj3Var2.m22124i(zi3Var3)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    i10 = i2 | i11;
                } else {
                    i10 = i2;
                }
            }
            int i211 = i10 | (((i3 & 2048) == 0 || !tj3Var2.m22124i(zi3Var2)) ? 16 : 32) | 384;
            z2 = true;
            if ((i8 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (tj3Var2.m22099R(i8 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i21 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i3 & 4) != 0) {
                        c0269zM1154g = m1154g(false, tj3Var2, 0, 3);
                        i8 &= -897;
                    } else {
                        c0269zM1154g = c0269z2;
                    }
                    float f12 = ng0.f52695b;
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    ng0 ng0Var4 = ng0.f52694a;
                    o39 o39VarM24271b4 = x49.m24271b(k59.f46733b, tj3Var2);
                    i12 = i8 & (-458753);
                    if ((i3 & 64) != 0) {
                        jM20492e = ra1.m20492e(k59.f46732a, tj3Var2);
                        i12 = i8 & (-4128769);
                    }
                    long jM20489b4 = ra1.m20489b(jM20492e, tj3Var2);
                    i13 = i12 & (-29360129);
                    if ((i3 & 512) != 0) {
                        jM17408b = ng0.m17408b(tj3Var2);
                        i13 = i12 & (-1908408321);
                    } else {
                        jM17408b = j3;
                    }
                    if (i9 != 0) {
                        zi3Var3 = y0c.f69082a;
                    }
                    if ((i3 & 2048) != 0) {
                        yu4Var = new yu4(15);
                    } else {
                        yu4Var = zi3Var2;
                    }
                    q06Var3 = new q06();
                    j7 = jM20489b4;
                    boolean z110 = z5;
                    zi3Var6 = yu4Var;
                    i14 = i13;
                    long j110 = jM20492e;
                    f3 = f12;
                    z6 = z110;
                    zi3Var7 = zi3Var3;
                    o39Var3 = o39VarM24271b4;
                    j8 = j110;
                } else {
                    if (i21 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i3 & 4) != 0) {
                        c0269zM1154g = m1154g(false, tj3Var2, 0, 3);
                        i8 &= -897;
                    } else {
                        c0269zM1154g = c0269z2;
                    }
                    float f13 = ng0.f52695b;
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    ng0 ng0Var5 = ng0.f52694a;
                    o39 o39VarM24271b5 = x49.m24271b(k59.f46733b, tj3Var2);
                    i12 = i8 & (-458753);
                    if ((i3 & 64) != 0) {
                        jM20492e = ra1.m20492e(k59.f46732a, tj3Var2);
                        i12 = i8 & (-4128769);
                    }
                    long jM20489b5 = ra1.m20489b(jM20492e, tj3Var2);
                    i13 = i12 & (-29360129);
                    if ((i3 & 512) != 0) {
                        jM17408b = ng0.m17408b(tj3Var2);
                        i13 = i12 & (-1908408321);
                    } else {
                        jM17408b = j3;
                    }
                    if (i9 != 0) {
                        zi3Var3 = y0c.f69082a;
                    }
                    if ((i3 & 2048) != 0) {
                        yu4Var = new yu4(15);
                    } else {
                        yu4Var = zi3Var2;
                    }
                    q06Var3 = new q06();
                    j7 = jM20489b5;
                    boolean z111 = z5;
                    zi3Var6 = yu4Var;
                    i14 = i13;
                    long j111 = jM20492e;
                    f3 = f13;
                    z6 = z111;
                    zi3Var7 = zi3Var3;
                    o39Var3 = o39VarM24271b5;
                    j8 = j111;
                }
                tj3Var2.m22140r();
                objM22097O = tj3Var2.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = d32.m10013K(tj3Var2);
                    tj3Var2.m22131l0(objM22097O);
                }
                un1Var = (un1) objM22097O;
                final e16 e16Var7 = e16Var4;
                i15 = (i14 & 896) ^ 384;
                final q06 q06Var6 = q06Var3;
                if (i15 > 256) {
                    f4 = f3;
                    if ((i14 & 384) != 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    f4 = f3;
                    if ((i14 & 384) != 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                }
                boolean zM22124i8 = z7 | tj3Var2.m22124i(un1Var);
                i16 = i14 & 14;
                if (i16 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zM22124i8 | z8;
                objM22097O2 = tj3Var2.m22097O();
                if (z9) {
                    objM22097O2 = new C0221b(c0269zM1154g, un1Var, ui3Var, 2);
                    tj3Var2.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new C0221b(c0269zM1154g, un1Var, ui3Var, 2);
                    tj3Var2.m22131l0(objM22097O2);
                }
                final ui3 ui3Var9 = (ui3) objM22097O2;
                if (i15 > 256) {
                    i17 = i15;
                    if ((i14 & 384) != 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    i17 = i15;
                    if ((i14 & 384) != 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                boolean zM22124i9 = z10 | tj3Var2.m22124i(un1Var);
                if (i16 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zM22124i9 | z11;
                objM22097O3 = tj3Var2.m22097O();
                if (z12) {
                    objM22097O3 = new C0221b(c0269zM1154g, un1Var, ui3Var, 3);
                    tj3Var2.m22131l0(objM22097O3);
                } else {
                    objM22097O3 = new C0221b(c0269zM1154g, un1Var, ui3Var, 3);
                    tj3Var2.m22131l0(objM22097O3);
                }
                ui3 ui3Var10 = (ui3) objM22097O3;
                c0269z4 = c0269zM1154g;
                final float f14 = f4;
                final boolean z112 = z6;
                int i212 = i14;
                i18 = i17;
                final long j112 = jM17408b;
                xpb.m24635a(ui3Var10, j7, q06Var6, ci8.m4703P(-1328793519, new zi3() { // from class: o06
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        tj3 tj3Var3 = (tj3) ye1Var2;
                        if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
                            Object objM22097O5 = tj3Var3.m22097O();
                            p84 p84Var2 = we1.f66679a;
                            if (objM22097O5 == p84Var2) {
                                objM22097O5 = new lz5(3);
                                tj3Var3.m22131l0(objM22097O5);
                            }
                            e16 e16VarM17643c = nv8.m17643c(e16VarM4411d, false, (vi3) objM22097O5);
                            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                            int iHashCode = Long.hashCode(tj3Var3.f62385T);
                            l77 l77VarM22132m = tj3Var3.m22132m();
                            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM17643c);
                            se1.f60731q.getClass();
                            ui3 ui3Var11 = C0352b.f4299b;
                            tj3Var3.m22119f0();
                            if (tj3Var3.f62384S) {
                                tj3Var3.m22130l(ui3Var11);
                            } else {
                                tj3Var3.m22137o0();
                            }
                            oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d);
                            oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                            oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                            oha.m18000f(tj3Var3, C0352b.f4305h);
                            oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                            C0269z c0269z5 = c0269z4;
                            boolean zM22120g = tj3Var3.m22120g(c0269z5);
                            Object objM22097O6 = tj3Var3.m22097O();
                            if (zM22120g || objM22097O6 == p84Var2) {
                                objM22097O6 = new p59(c0269z5);
                                tj3Var3.m22131l0(objM22097O6);
                            }
                            p59 p59Var = (p59) objM22097O6;
                            Object objM22097O7 = tj3Var3.m22097O();
                            if (objM22097O7 == p84Var2) {
                                objM22097O7 = AbstractC0278f.m1254d(new hz4(c0269z5, 9));
                                tj3Var3.m22131l0(objM22097O7);
                            }
                            dh9 dh9VarM750b = AbstractC0060b.m750b(((Boolean) ((dh9) objM22097O7).getValue()).booleanValue() ? 1.0f : 0.0f, ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var3), "ScrimAlphaAnimation", null, tj3Var3, 3072, 20);
                            String strM11661w = fa4.m11661w(tj3Var3, R$string.close_sheet);
                            q06 q06Var7 = q06Var6;
                            ui3 ui3Var12 = q06Var7.f57095c ? ui3Var9 : null;
                            boolean zM22120g2 = tj3Var3.m22120g(dh9VarM750b);
                            Object objM22097O8 = tj3Var3.m22097O();
                            if (zM22120g2 || objM22097O8 == p84Var2) {
                                objM22097O8 = new eo4(dh9VarM750b, 3);
                                tj3Var3.m22131l0(objM22097O8);
                            }
                            wyc.m24221a(strM11661w, null, ui3Var12, (ui3) objM22097O8, j112, tj3Var3, 0);
                            AbstractC0229f.m1144a(wfb.m23915j(ci0.f10109a.mo3727a(e16Var7, nj0.f52809d), p59Var), c0269z5, ui3Var, f14, z112, q06Var7.f57094b, zi3Var7, zi3Var6, o39Var3, j8, j7, 0.0f, c0282a, tj3Var3, 0);
                            tj3Var3.m22139q(true);
                        } else {
                            tj3Var3.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var2), tj3Var2, 3456);
                if (c0269z4.f3651e.m849c().m130c(SheetValue.Expanded)) {
                    tj3Var2.m22111b0(748164146);
                    if (i18 > 256) {
                    }
                    objM22097O4 = tj3Var2.m22097O();
                    if (z2) {
                        objM22097O4 = new ModalBottomSheetKt$ModalBottomSheet$3$1(c0269z4, null);
                        tj3Var2.m22131l0(objM22097O4);
                    } else {
                        objM22097O4 = new ModalBottomSheetKt$ModalBottomSheet$3$1(c0269z4, null);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    d32.m10047k(tj3Var2, (zi3) objM22097O4, c0269z4);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(748225650);
                    tj3Var2.m22139q(false);
                }
                c0269z3 = c0269z4;
                tj3Var = tj3Var2;
                long j113 = j7;
                q06Var2 = q06Var6;
                e16Var3 = e16Var7;
                o39Var2 = o39Var3;
                f2 = f14;
                z4 = z112;
                j4 = j8;
                zi3Var5 = zi3Var7;
                zi3Var4 = zi3Var6;
                j5 = j113;
                j6 = j112;
            } else {
                tj3Var2.m22102U();
                f2 = f;
                z4 = z;
                o39Var2 = o39Var;
                zi3Var4 = zi3Var2;
                q06Var2 = q06Var;
                tj3Var = tj3Var2;
                j4 = jM20492e;
                e16Var3 = e16Var2;
                c0269z3 = c0269z2;
                zi3Var5 = zi3Var3;
                j5 = j2;
                j6 = j3;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: p06
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i | 1);
                        int iM19383z2 = pk9.m19383z(i2);
                        AbstractC0231g.m1150c(ui3Var, e16Var3, c0269z3, f2, z4, o39Var2, j4, j5, j6, zi3Var5, zi3Var4, q06Var2, c0282a, (ye1) obj, iM19383z, iM19383z2, i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i5 = i4 | 27648;
        if ((196608 & i) == 0) {
            i5 |= 65536;
        }
        if ((1572864 & i) == 0) {
            jM20492e = j;
            if ((i3 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i5 |= i20;
        } else {
            jM20492e = j;
        }
        if ((i & 12582912) == 0) {
            i5 |= 4194304;
        }
        i8 = i5 | 100663296;
        if ((i & 805306368) != 0) {
            if ((i3 & 512) == 0) {
                i19 = 268435456;
            } else {
                i19 = 268435456;
            }
            i8 |= i19;
        }
        i9 = i3 & 1024;
        if (i9 != 0) {
            zi3Var3 = zi3Var;
            i10 = 3078;
        } else {
            zi3Var3 = zi3Var;
            if ((i2 & 6) == 0) {
                if (tj3Var2.m22124i(zi3Var3)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i10 = i2 | i11;
            } else {
                i10 = i2;
            }
        }
        int i213 = i10 | (((i3 & 2048) == 0 || !tj3Var2.m22124i(zi3Var2)) ? 16 : 32) | 384;
        z2 = true;
        if ((i8 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (tj3Var2.m22099R(i8 & 1, z3)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0) {
                if (i21 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if ((i3 & 4) != 0) {
                    c0269zM1154g = m1154g(false, tj3Var2, 0, 3);
                    i8 &= -897;
                } else {
                    c0269zM1154g = c0269z2;
                }
                float f15 = ng0.f52695b;
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z;
                }
                ng0 ng0Var6 = ng0.f52694a;
                o39 o39VarM24271b6 = x49.m24271b(k59.f46733b, tj3Var2);
                i12 = i8 & (-458753);
                if ((i3 & 64) != 0) {
                    jM20492e = ra1.m20492e(k59.f46732a, tj3Var2);
                    i12 = i8 & (-4128769);
                }
                long jM20489b6 = ra1.m20489b(jM20492e, tj3Var2);
                i13 = i12 & (-29360129);
                if ((i3 & 512) != 0) {
                    jM17408b = ng0.m17408b(tj3Var2);
                    i13 = i12 & (-1908408321);
                } else {
                    jM17408b = j3;
                }
                if (i9 != 0) {
                    zi3Var3 = y0c.f69082a;
                }
                if ((i3 & 2048) != 0) {
                    yu4Var = new yu4(15);
                } else {
                    yu4Var = zi3Var2;
                }
                q06Var3 = new q06();
                j7 = jM20489b6;
                boolean z113 = z5;
                zi3Var6 = yu4Var;
                i14 = i13;
                long j114 = jM20492e;
                f3 = f15;
                z6 = z113;
                zi3Var7 = zi3Var3;
                o39Var3 = o39VarM24271b6;
                j8 = j114;
            } else {
                if (i21 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if ((i3 & 4) != 0) {
                    c0269zM1154g = m1154g(false, tj3Var2, 0, 3);
                    i8 &= -897;
                } else {
                    c0269zM1154g = c0269z2;
                }
                float f16 = ng0.f52695b;
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z;
                }
                ng0 ng0Var7 = ng0.f52694a;
                o39 o39VarM24271b7 = x49.m24271b(k59.f46733b, tj3Var2);
                i12 = i8 & (-458753);
                if ((i3 & 64) != 0) {
                    jM20492e = ra1.m20492e(k59.f46732a, tj3Var2);
                    i12 = i8 & (-4128769);
                }
                long jM20489b7 = ra1.m20489b(jM20492e, tj3Var2);
                i13 = i12 & (-29360129);
                if ((i3 & 512) != 0) {
                    jM17408b = ng0.m17408b(tj3Var2);
                    i13 = i12 & (-1908408321);
                } else {
                    jM17408b = j3;
                }
                if (i9 != 0) {
                    zi3Var3 = y0c.f69082a;
                }
                if ((i3 & 2048) != 0) {
                    yu4Var = new yu4(15);
                } else {
                    yu4Var = zi3Var2;
                }
                q06Var3 = new q06();
                j7 = jM20489b7;
                boolean z114 = z5;
                zi3Var6 = yu4Var;
                i14 = i13;
                long j115 = jM20492e;
                f3 = f16;
                z6 = z114;
                zi3Var7 = zi3Var3;
                o39Var3 = o39VarM24271b7;
                j8 = j115;
            }
            tj3Var2.m22140r();
            objM22097O = tj3Var2.m22097O();
            p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = d32.m10013K(tj3Var2);
                tj3Var2.m22131l0(objM22097O);
            }
            un1Var = (un1) objM22097O;
            final e16 e16Var8 = e16Var4;
            i15 = (i14 & 896) ^ 384;
            final q06 q06Var7 = q06Var3;
            if (i15 > 256) {
                f4 = f3;
                if ((i14 & 384) != 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            } else {
                f4 = f3;
                if ((i14 & 384) != 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            boolean zM22124i10 = z7 | tj3Var2.m22124i(un1Var);
            i16 = i14 & 14;
            if (i16 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = zM22124i10 | z8;
            objM22097O2 = tj3Var2.m22097O();
            if (z9) {
                objM22097O2 = new C0221b(c0269zM1154g, un1Var, ui3Var, 2);
                tj3Var2.m22131l0(objM22097O2);
            } else {
                objM22097O2 = new C0221b(c0269zM1154g, un1Var, ui3Var, 2);
                tj3Var2.m22131l0(objM22097O2);
            }
            final ui3 ui3Var11 = (ui3) objM22097O2;
            if (i15 > 256) {
                i17 = i15;
                if ((i14 & 384) != 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                i17 = i15;
                if ((i14 & 384) != 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            boolean zM22124i11 = z10 | tj3Var2.m22124i(un1Var);
            if (i16 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = zM22124i11 | z11;
            objM22097O3 = tj3Var2.m22097O();
            if (z12) {
                objM22097O3 = new C0221b(c0269zM1154g, un1Var, ui3Var, 3);
                tj3Var2.m22131l0(objM22097O3);
            } else {
                objM22097O3 = new C0221b(c0269zM1154g, un1Var, ui3Var, 3);
                tj3Var2.m22131l0(objM22097O3);
            }
            ui3 ui3Var12 = (ui3) objM22097O3;
            c0269z4 = c0269zM1154g;
            final float f17 = f4;
            final boolean z115 = z6;
            int i214 = i14;
            i18 = i17;
            final long j116 = jM17408b;
            xpb.m24635a(ui3Var12, j7, q06Var7, ci8.m4703P(-1328793519, new zi3() { // from class: o06
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
                        Object objM22097O5 = tj3Var3.m22097O();
                        p84 p84Var2 = we1.f66679a;
                        if (objM22097O5 == p84Var2) {
                            objM22097O5 = new lz5(3);
                            tj3Var3.m22131l0(objM22097O5);
                        }
                        e16 e16VarM17643c = nv8.m17643c(e16VarM4411d, false, (vi3) objM22097O5);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM17643c);
                        se1.f60731q.getClass();
                        ui3 ui3Var13 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var13);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d);
                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var3, C0352b.f4305h);
                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                        C0269z c0269z5 = c0269z4;
                        boolean zM22120g = tj3Var3.m22120g(c0269z5);
                        Object objM22097O6 = tj3Var3.m22097O();
                        if (zM22120g || objM22097O6 == p84Var2) {
                            objM22097O6 = new p59(c0269z5);
                            tj3Var3.m22131l0(objM22097O6);
                        }
                        p59 p59Var = (p59) objM22097O6;
                        Object objM22097O7 = tj3Var3.m22097O();
                        if (objM22097O7 == p84Var2) {
                            objM22097O7 = AbstractC0278f.m1254d(new hz4(c0269z5, 9));
                            tj3Var3.m22131l0(objM22097O7);
                        }
                        dh9 dh9VarM750b = AbstractC0060b.m750b(((Boolean) ((dh9) objM22097O7).getValue()).booleanValue() ? 1.0f : 0.0f, ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var3), "ScrimAlphaAnimation", null, tj3Var3, 3072, 20);
                        String strM11661w = fa4.m11661w(tj3Var3, R$string.close_sheet);
                        q06 q06Var8 = q06Var7;
                        ui3 ui3Var14 = q06Var8.f57095c ? ui3Var11 : null;
                        boolean zM22120g2 = tj3Var3.m22120g(dh9VarM750b);
                        Object objM22097O8 = tj3Var3.m22097O();
                        if (zM22120g2 || objM22097O8 == p84Var2) {
                            objM22097O8 = new eo4(dh9VarM750b, 3);
                            tj3Var3.m22131l0(objM22097O8);
                        }
                        wyc.m24221a(strM11661w, null, ui3Var14, (ui3) objM22097O8, j116, tj3Var3, 0);
                        AbstractC0229f.m1144a(wfb.m23915j(ci0.f10109a.mo3727a(e16Var8, nj0.f52809d), p59Var), c0269z5, ui3Var, f17, z115, q06Var8.f57094b, zi3Var7, zi3Var6, o39Var3, j8, j7, 0.0f, c0282a, tj3Var3, 0);
                        tj3Var3.m22139q(true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var2, 3456);
            if (c0269z4.f3651e.m849c().m130c(SheetValue.Expanded)) {
                tj3Var2.m22111b0(748164146);
                if (i18 > 256) {
                }
                objM22097O4 = tj3Var2.m22097O();
                if (z2) {
                    objM22097O4 = new ModalBottomSheetKt$ModalBottomSheet$3$1(c0269z4, null);
                    tj3Var2.m22131l0(objM22097O4);
                } else {
                    objM22097O4 = new ModalBottomSheetKt$ModalBottomSheet$3$1(c0269z4, null);
                    tj3Var2.m22131l0(objM22097O4);
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O4, c0269z4);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(748225650);
                tj3Var2.m22139q(false);
            }
            c0269z3 = c0269z4;
            tj3Var = tj3Var2;
            long j117 = j7;
            q06Var2 = q06Var7;
            e16Var3 = e16Var8;
            o39Var2 = o39Var3;
            f2 = f17;
            z4 = z115;
            j4 = j8;
            zi3Var5 = zi3Var7;
            zi3Var4 = zi3Var6;
            j5 = j117;
            j6 = j116;
        } else {
            tj3Var2.m22102U();
            f2 = f;
            z4 = z;
            o39Var2 = o39Var;
            zi3Var4 = zi3Var2;
            q06Var2 = q06Var;
            tj3Var = tj3Var2;
            j4 = jM20492e;
            e16Var3 = e16Var2;
            c0269z3 = c0269z2;
            zi3Var5 = zi3Var3;
            j5 = j2;
            j6 = j3;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: p06
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    int iM19383z2 = pk9.m19383z(i2);
                    AbstractC0231g.m1150c(ui3Var, e16Var3, c0269z3, f2, z4, o39Var2, j4, j5, j6, zi3Var5, zi3Var4, q06Var2, c0282a, (ye1) obj, iM19383z, iM19383z2, i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:107:0x0134  */
    /* JADX WARN: Code duplicated, block: B:110:0x0139  */
    /* JADX WARN: Code duplicated, block: B:113:0x0150  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:117:0x016a  */
    /* JADX WARN: Code duplicated, block: B:119:0x018b  */
    /* JADX WARN: Code duplicated, block: B:121:0x018f  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX INFO: renamed from: d */
    public static final void m1151d(ui3 ui3Var, e16 e16Var, boolean z, o39 o39Var, vj0 vj0Var, vf0 vf0Var, t17 t17Var, C0282a c0282a, ye1 ye1Var, int i, int i2) {
        int i3;
        boolean z2;
        o39 o39Var2;
        vj0 vj0VarM23999d;
        int i4;
        vf0 vf0VarM4714a;
        int i5;
        t17 t17Var2;
        int i6;
        int i7;
        C0282a c0282a2;
        boolean z3;
        tj3 tj3Var;
        t17 t17Var3;
        x18 x18VarM22143u;
        boolean z4;
        o39 o39VarM24271b;
        o39 o39Var3;
        vj0 vj0Var2;
        vf0 vf0Var2;
        t17 t17Var4;
        long jM198b;
        int i8;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(399974542);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22120g(e16Var) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= tj3Var2.m22122h(z2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    o39Var2 = o39Var;
                    int i10 = tj3Var2.m22120g(o39Var2) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    o39Var2 = o39Var;
                }
                i3 |= i10;
            } else {
                o39Var2 = o39Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vj0VarM23999d = vj0Var;
                    int i11 = tj3Var2.m22120g(vj0VarM23999d) ? 16384 : 8192;
                    i3 |= i11;
                } else {
                    vj0VarM23999d = vj0Var;
                }
                i3 |= i11;
            } else {
                vj0VarM23999d = vj0Var;
            }
            i4 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    vf0VarM4714a = vf0Var;
                    int i12 = tj3Var2.m22120g(vf0VarM4714a) ? 1048576 : 524288;
                    i4 |= i12;
                } else {
                    vf0VarM4714a = vf0Var;
                }
                i4 |= i12;
            } else {
                vf0VarM4714a = vf0Var;
            }
            i5 = i2 & 128;
            if (i5 != 0) {
                if ((12582912 & i) == 0) {
                    t17Var2 = t17Var;
                    if (tj3Var2.m22120g(t17Var2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 100663296;
                if ((805306368 & i) == 0) {
                    c0282a2 = c0282a;
                    if (tj3Var2.m22124i(c0282a2)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i7 |= i8;
                } else {
                    c0282a2 = c0282a;
                }
                if ((306783379 & i7) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i7 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0 || tj3Var2.m22084B()) {
                        z4 = i9 == 0 ? z2 : true;
                        if ((i2 & 8) != 0) {
                            x17 x17Var = wj0.f66899a;
                            o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                            i7 &= -7169;
                        } else {
                            o39VarM24271b = o39Var2;
                        }
                        if ((i2 & 16) != 0) {
                            x17 x17Var2 = wj0.f66899a;
                            i7 &= -57345;
                            vj0VarM23999d = wj0.m23999d(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                        }
                        if ((i2 & 64) != 0) {
                            x17 x17Var3 = wj0.f66899a;
                            float f = ck0.f10189b;
                            if (z4) {
                                tj3Var2.m22111b0(-112362814);
                                jM198b = ra1.m20492e(d07.f34809d, tj3Var2);
                                tj3Var2.m22139q(false);
                            } else {
                                tj3Var2.m22111b0(-112275208);
                                jM198b = aa1.m198b(0.1f, ra1.m20492e(d07.f34809d, tj3Var2));
                                tj3Var2.m22139q(false);
                            }
                            i7 &= -3670017;
                            vf0VarM4714a = ci8.m4714a(f, jM198b);
                        } else {
                            o39VarM24271b = o39VarM24271b;
                        }
                        if (i5 != 0) {
                            t17Var2 = wj0.f66899a;
                        }
                        o39Var3 = o39VarM24271b;
                        vj0Var2 = vj0VarM23999d;
                        vf0Var2 = vf0VarM4714a;
                        t17Var4 = t17Var2;
                        z2 = z4;
                    } else {
                        tj3Var2.m22102U();
                        if ((i2 & 8) != 0) {
                            i7 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i7 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i7 &= -3670017;
                        }
                        o39Var3 = o39Var2;
                        vj0Var2 = vj0VarM23999d;
                        vf0Var2 = vf0VarM4714a;
                        t17Var4 = t17Var2;
                    }
                    tj3Var2.m22140r();
                    tj3Var = tj3Var2;
                    m1148a(ui3Var, e16Var, z2, o39Var3, vj0Var2, null, vf0Var2, t17Var4, c0282a2, tj3Var, i7 & 2147483646, 0);
                    o39Var2 = o39Var3;
                    vj0VarM23999d = vj0Var2;
                    vf0VarM4714a = vf0Var2;
                    t17Var3 = t17Var4;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    t17Var3 = t17Var2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new yn0(ui3Var, e16Var, z2, o39Var2, vj0VarM23999d, vf0VarM4714a, t17Var3, c0282a, i, i2);
                }
            }
            i4 |= 12582912;
            t17Var2 = t17Var;
            i7 = i4 | 100663296;
            if ((805306368 & i) == 0) {
                c0282a2 = c0282a;
                if (tj3Var2.m22124i(c0282a2)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i7 |= i8;
            } else {
                c0282a2 = c0282a;
            }
            if ((306783379 & i7) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i7 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        x17 x17Var4 = wj0.f66899a;
                        o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                        i7 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        x17 x17Var5 = wj0.f66899a;
                        i7 &= -57345;
                        vj0VarM23999d = wj0.m23999d(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                    }
                    if ((i2 & 64) != 0) {
                        x17 x17Var6 = wj0.f66899a;
                        float f2 = ck0.f10189b;
                        if (z4) {
                            tj3Var2.m22111b0(-112362814);
                            jM198b = ra1.m20492e(d07.f34809d, tj3Var2);
                            tj3Var2.m22139q(false);
                        } else {
                            tj3Var2.m22111b0(-112275208);
                            jM198b = aa1.m198b(0.1f, ra1.m20492e(d07.f34809d, tj3Var2));
                            tj3Var2.m22139q(false);
                        }
                        i7 &= -3670017;
                        vf0VarM4714a = ci8.m4714a(f2, jM198b);
                    } else {
                        o39VarM24271b = o39VarM24271b;
                    }
                    if (i5 != 0) {
                        t17Var2 = wj0.f66899a;
                    }
                    o39Var3 = o39VarM24271b;
                    vj0Var2 = vj0VarM23999d;
                    vf0Var2 = vf0VarM4714a;
                    t17Var4 = t17Var2;
                    z2 = z4;
                } else {
                    if (i9 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        x17 x17Var7 = wj0.f66899a;
                        o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                        i7 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        x17 x17Var8 = wj0.f66899a;
                        i7 &= -57345;
                        vj0VarM23999d = wj0.m23999d(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                    }
                    if ((i2 & 64) != 0) {
                        x17 x17Var9 = wj0.f66899a;
                        float f3 = ck0.f10189b;
                        if (z4) {
                            tj3Var2.m22111b0(-112362814);
                            jM198b = ra1.m20492e(d07.f34809d, tj3Var2);
                            tj3Var2.m22139q(false);
                        } else {
                            tj3Var2.m22111b0(-112275208);
                            jM198b = aa1.m198b(0.1f, ra1.m20492e(d07.f34809d, tj3Var2));
                            tj3Var2.m22139q(false);
                        }
                        i7 &= -3670017;
                        vf0VarM4714a = ci8.m4714a(f3, jM198b);
                    } else {
                        o39VarM24271b = o39VarM24271b;
                    }
                    if (i5 != 0) {
                        t17Var2 = wj0.f66899a;
                    }
                    o39Var3 = o39VarM24271b;
                    vj0Var2 = vj0VarM23999d;
                    vf0Var2 = vf0VarM4714a;
                    t17Var4 = t17Var2;
                    z2 = z4;
                }
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                m1148a(ui3Var, e16Var, z2, o39Var3, vj0Var2, null, vf0Var2, t17Var4, c0282a2, tj3Var, i7 & 2147483646, 0);
                o39Var2 = o39Var3;
                vj0VarM23999d = vj0Var2;
                vf0VarM4714a = vf0Var2;
                t17Var3 = t17Var4;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                t17Var3 = t17Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new yn0(ui3Var, e16Var, z2, o39Var2, vj0VarM23999d, vf0VarM4714a, t17Var3, c0282a, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                o39Var2 = o39Var;
                if (tj3Var2.m22120g(o39Var2)) {
                }
                i3 |= i10;
            } else {
                o39Var2 = o39Var;
            }
            i3 |= i10;
        } else {
            o39Var2 = o39Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                vj0VarM23999d = vj0Var;
                if (tj3Var2.m22120g(vj0VarM23999d)) {
                }
                i3 |= i11;
            } else {
                vj0VarM23999d = vj0Var;
            }
            i3 |= i11;
        } else {
            vj0VarM23999d = vj0Var;
        }
        i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                vf0VarM4714a = vf0Var;
                if (tj3Var2.m22120g(vf0VarM4714a)) {
                }
                i4 |= i12;
            } else {
                vf0VarM4714a = vf0Var;
            }
            i4 |= i12;
        } else {
            vf0VarM4714a = vf0Var;
        }
        i5 = i2 & 128;
        if (i5 != 0) {
            if ((12582912 & i) == 0) {
                t17Var2 = t17Var;
                if (tj3Var2.m22120g(t17Var2)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
            i7 = i4 | 100663296;
            if ((805306368 & i) == 0) {
                c0282a2 = c0282a;
                if (tj3Var2.m22124i(c0282a2)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i7 |= i8;
            } else {
                c0282a2 = c0282a;
            }
            if ((306783379 & i7) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i7 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        x17 x17Var10 = wj0.f66899a;
                        o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                        i7 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        x17 x17Var11 = wj0.f66899a;
                        i7 &= -57345;
                        vj0VarM23999d = wj0.m23999d(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                    }
                    if ((i2 & 64) != 0) {
                        x17 x17Var12 = wj0.f66899a;
                        float f4 = ck0.f10189b;
                        if (z4) {
                            tj3Var2.m22111b0(-112362814);
                            jM198b = ra1.m20492e(d07.f34809d, tj3Var2);
                            tj3Var2.m22139q(false);
                        } else {
                            tj3Var2.m22111b0(-112275208);
                            jM198b = aa1.m198b(0.1f, ra1.m20492e(d07.f34809d, tj3Var2));
                            tj3Var2.m22139q(false);
                        }
                        i7 &= -3670017;
                        vf0VarM4714a = ci8.m4714a(f4, jM198b);
                    } else {
                        o39VarM24271b = o39VarM24271b;
                    }
                    if (i5 != 0) {
                        t17Var2 = wj0.f66899a;
                    }
                    o39Var3 = o39VarM24271b;
                    vj0Var2 = vj0VarM23999d;
                    vf0Var2 = vf0VarM4714a;
                    t17Var4 = t17Var2;
                    z2 = z4;
                } else {
                    if (i9 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        x17 x17Var13 = wj0.f66899a;
                        o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                        i7 &= -7169;
                    } else {
                        o39VarM24271b = o39Var2;
                    }
                    if ((i2 & 16) != 0) {
                        x17 x17Var14 = wj0.f66899a;
                        i7 &= -57345;
                        vj0VarM23999d = wj0.m23999d(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                    }
                    if ((i2 & 64) != 0) {
                        x17 x17Var15 = wj0.f66899a;
                        float f5 = ck0.f10189b;
                        if (z4) {
                            tj3Var2.m22111b0(-112362814);
                            jM198b = ra1.m20492e(d07.f34809d, tj3Var2);
                            tj3Var2.m22139q(false);
                        } else {
                            tj3Var2.m22111b0(-112275208);
                            jM198b = aa1.m198b(0.1f, ra1.m20492e(d07.f34809d, tj3Var2));
                            tj3Var2.m22139q(false);
                        }
                        i7 &= -3670017;
                        vf0VarM4714a = ci8.m4714a(f5, jM198b);
                    } else {
                        o39VarM24271b = o39VarM24271b;
                    }
                    if (i5 != 0) {
                        t17Var2 = wj0.f66899a;
                    }
                    o39Var3 = o39VarM24271b;
                    vj0Var2 = vj0VarM23999d;
                    vf0Var2 = vf0VarM4714a;
                    t17Var4 = t17Var2;
                    z2 = z4;
                }
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                m1148a(ui3Var, e16Var, z2, o39Var3, vj0Var2, null, vf0Var2, t17Var4, c0282a2, tj3Var, i7 & 2147483646, 0);
                o39Var2 = o39Var3;
                vj0VarM23999d = vj0Var2;
                vf0VarM4714a = vf0Var2;
                t17Var3 = t17Var4;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                t17Var3 = t17Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new yn0(ui3Var, e16Var, z2, o39Var2, vj0VarM23999d, vf0VarM4714a, t17Var3, c0282a, i, i2);
            }
        }
        i4 |= 12582912;
        t17Var2 = t17Var;
        i7 = i4 | 100663296;
        if ((805306368 & i) == 0) {
            c0282a2 = c0282a;
            if (tj3Var2.m22124i(c0282a2)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i7 |= i8;
        } else {
            c0282a2 = c0282a;
        }
        if ((306783379 & i7) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var2.m22099R(i7 & 1, z3)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0) {
                if (i9 == 0) {
                }
                if ((i2 & 8) != 0) {
                    x17 x17Var16 = wj0.f66899a;
                    o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                    i7 &= -7169;
                } else {
                    o39VarM24271b = o39Var2;
                }
                if ((i2 & 16) != 0) {
                    x17 x17Var17 = wj0.f66899a;
                    i7 &= -57345;
                    vj0VarM23999d = wj0.m23999d(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                }
                if ((i2 & 64) != 0) {
                    x17 x17Var18 = wj0.f66899a;
                    float f6 = ck0.f10189b;
                    if (z4) {
                        tj3Var2.m22111b0(-112362814);
                        jM198b = ra1.m20492e(d07.f34809d, tj3Var2);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(-112275208);
                        jM198b = aa1.m198b(0.1f, ra1.m20492e(d07.f34809d, tj3Var2));
                        tj3Var2.m22139q(false);
                    }
                    i7 &= -3670017;
                    vf0VarM4714a = ci8.m4714a(f6, jM198b);
                } else {
                    o39VarM24271b = o39VarM24271b;
                }
                if (i5 != 0) {
                    t17Var2 = wj0.f66899a;
                }
                o39Var3 = o39VarM24271b;
                vj0Var2 = vj0VarM23999d;
                vf0Var2 = vf0VarM4714a;
                t17Var4 = t17Var2;
                z2 = z4;
            } else {
                if (i9 == 0) {
                }
                if ((i2 & 8) != 0) {
                    x17 x17Var19 = wj0.f66899a;
                    o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                    i7 &= -7169;
                } else {
                    o39VarM24271b = o39Var2;
                }
                if ((i2 & 16) != 0) {
                    x17 x17Var110 = wj0.f66899a;
                    i7 &= -57345;
                    vj0VarM23999d = wj0.m23999d(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                }
                if ((i2 & 64) != 0) {
                    x17 x17Var111 = wj0.f66899a;
                    float f7 = ck0.f10189b;
                    if (z4) {
                        tj3Var2.m22111b0(-112362814);
                        jM198b = ra1.m20492e(d07.f34809d, tj3Var2);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(-112275208);
                        jM198b = aa1.m198b(0.1f, ra1.m20492e(d07.f34809d, tj3Var2));
                        tj3Var2.m22139q(false);
                    }
                    i7 &= -3670017;
                    vf0VarM4714a = ci8.m4714a(f7, jM198b);
                } else {
                    o39VarM24271b = o39VarM24271b;
                }
                if (i5 != 0) {
                    t17Var2 = wj0.f66899a;
                }
                o39Var3 = o39VarM24271b;
                vj0Var2 = vj0VarM23999d;
                vf0Var2 = vf0VarM4714a;
                t17Var4 = t17Var2;
                z2 = z4;
            }
            tj3Var2.m22140r();
            tj3Var = tj3Var2;
            m1148a(ui3Var, e16Var, z2, o39Var3, vj0Var2, null, vf0Var2, t17Var4, c0282a2, tj3Var, i7 & 2147483646, 0);
            o39Var2 = o39Var3;
            vj0VarM23999d = vj0Var2;
            vf0VarM4714a = vf0Var2;
            t17Var3 = t17Var4;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            t17Var3 = t17Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yn0(ui3Var, e16Var, z2, o39Var2, vj0VarM23999d, vf0VarM4714a, t17Var3, c0282a, i, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m1152e(C0232g0 c0232g0, e16 e16Var, aj3 aj3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1077081618);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
        } else {
            i3 = (tj3Var.m22120g(e16Var) ? 32 : 16) | i;
        }
        int i5 = i3 | 384;
        if (tj3Var.m22099R(i5 & 1, (i5 & 147) != 146)) {
            if (i4 != 0) {
                e16Var = b16.f7762a;
            }
            aj3Var = xwc.f68912b;
            sb9 sb9Var = (sb9) ((xc9) c0232g0.f3425b).getValue();
            InterfaceC3483q3 interfaceC3483q3 = (InterfaceC3483q3) tj3Var.m22128k(AbstractC0402n.f4809a);
            boolean zM22120g = tj3Var.m22120g(sb9Var) | tj3Var.m22124i(interfaceC3483q3);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new SnackbarHostKt$SnackbarHost$1$1(sb9Var, interfaceC3483q3, null);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O, sb9Var);
            m1149b((sb9) ((xc9) c0232g0.f3425b).getValue(), e16Var, tj3Var, i5 & 1008);
        } else {
            tj3Var.m22102U();
        }
        e16 e16Var2 = e16Var;
        aj3 aj3Var2 = aj3Var;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gd1(c0232g0, e16Var2, aj3Var2, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x0115  */
    /* JADX WARN: Code duplicated, block: B:93:0x0139  */
    /* JADX WARN: Code duplicated, block: B:96:0x014a  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m1153f(int i, int i2, vj0 vj0Var, ye1 ye1Var, ui3 ui3Var, aj3 aj3Var, e16 e16Var, t17 t17Var, o39 o39Var, boolean z) {
        int i3;
        e16 e16Var2;
        int i4;
        boolean z2;
        int i5;
        vj0 vj0VarM24000e;
        int i6;
        int i7;
        t17 t17Var2;
        int i8;
        int i9;
        boolean z3;
        tj3 tj3Var;
        o39 o39Var2;
        e16 e16Var3;
        boolean z4;
        vj0 vj0Var2;
        t17 t17Var3;
        x18 x18VarM22143u;
        e16 e16Var4;
        int i10;
        t17 t17Var4;
        e16 e16Var5;
        o39 o39Var3;
        int i11;
        vj0 vj0Var3;
        boolean z5;
        int i12;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1061374109);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                e16Var2 = e16Var;
                i3 |= tj3Var2.m22120g(e16Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (tj3Var2.m22122h(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    i3 |= 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vj0VarM24000e = vj0Var;
                        int i14 = tj3Var2.m22120g(vj0VarM24000e) ? 16384 : 8192;
                        i3 |= i14;
                    } else {
                        vj0VarM24000e = vj0Var;
                    }
                    i3 |= i14;
                } else {
                    vj0VarM24000e = vj0Var;
                }
                i6 = 1769472 | i3;
                i7 = i2 & 128;
                if (i7 != 0) {
                    if ((12582912 & i) == 0) {
                        t17Var2 = t17Var;
                        if (tj3Var2.m22120g(t17Var2)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i6 |= i8;
                    }
                    i9 = i6 | 100663296;
                    if ((805306368 & i) != 0) {
                        if (tj3Var2.m22124i(aj3Var)) {
                            i12 = 536870912;
                        } else {
                            i12 = 268435456;
                        }
                        i9 |= i12;
                    }
                    if ((306783379 & i9) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (tj3Var2.m22099R(i9 & 1, z3)) {
                        tj3Var2.m22104W();
                        if ((i & 1) != 0 || tj3Var2.m22084B()) {
                            if (i13 != 0) {
                                e16Var4 = b16.f7762a;
                            } else {
                                e16Var4 = e16Var2;
                            }
                            boolean z6 = i4 == 0 ? z2 : true;
                            x17 x17Var = wj0.f66899a;
                            o39 o39VarM24271b = x49.m24271b(ck0.f10188a, tj3Var2);
                            i10 = i9 & (-7169);
                            if ((i2 & 16) != 0) {
                                vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                                i10 = i9 & (-64513);
                            }
                            if (i7 != 0) {
                                t17Var2 = wj0.f66900b;
                            }
                            t17Var4 = t17Var2;
                            e16Var5 = e16Var4;
                            o39Var3 = o39VarM24271b;
                            i11 = i10;
                            vj0Var3 = vj0VarM24000e;
                            z5 = z6;
                        } else {
                            tj3Var2.m22102U();
                            i11 = i9 & (-7169);
                            if ((i2 & 16) != 0) {
                                i11 = i9 & (-64513);
                            }
                            o39Var3 = o39Var;
                            t17Var4 = t17Var2;
                            e16Var5 = e16Var2;
                            z5 = z2;
                            vj0Var3 = vj0VarM24000e;
                        }
                        tj3Var2.m22140r();
                        tj3Var = tj3Var2;
                        m1148a(ui3Var, e16Var5, z5, o39Var3, vj0Var3, null, null, t17Var4, aj3Var, tj3Var, i11 & 2147483646, 0);
                        e16Var3 = e16Var5;
                        z4 = z5;
                        o39Var2 = o39Var3;
                        vj0Var2 = vj0Var3;
                        t17Var3 = t17Var4;
                    } else {
                        tj3Var = tj3Var2;
                        tj3Var.m22102U();
                        o39Var2 = o39Var;
                        e16Var3 = e16Var2;
                        z4 = z2;
                        vj0Var2 = vj0VarM24000e;
                        t17Var3 = t17Var2;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zj0(ui3Var, e16Var3, z4, o39Var2, vj0Var2, t17Var3, aj3Var, i, i2);
                    }
                }
                i6 = 14352384 | i3;
                t17Var2 = t17Var;
                i9 = i6 | 100663296;
                if ((805306368 & i) != 0) {
                    if (tj3Var2.m22124i(aj3Var)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i9 |= i12;
                }
                if ((306783379 & i9) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i9 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i4 == 0) {
                        }
                        x17 x17Var2 = wj0.f66899a;
                        o39 o39VarM24271b2 = x49.m24271b(ck0.f10188a, tj3Var2);
                        i10 = i9 & (-7169);
                        if ((i2 & 16) != 0) {
                            vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                            i10 = i9 & (-64513);
                        }
                        if (i7 != 0) {
                            t17Var2 = wj0.f66900b;
                        }
                        t17Var4 = t17Var2;
                        e16Var5 = e16Var4;
                        o39Var3 = o39VarM24271b2;
                        i11 = i10;
                        vj0Var3 = vj0VarM24000e;
                        z5 = z6;
                    } else {
                        if (i13 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i4 == 0) {
                        }
                        x17 x17Var3 = wj0.f66899a;
                        o39 o39VarM24271b3 = x49.m24271b(ck0.f10188a, tj3Var2);
                        i10 = i9 & (-7169);
                        if ((i2 & 16) != 0) {
                            vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                            i10 = i9 & (-64513);
                        }
                        if (i7 != 0) {
                            t17Var2 = wj0.f66900b;
                        }
                        t17Var4 = t17Var2;
                        e16Var5 = e16Var4;
                        o39Var3 = o39VarM24271b3;
                        i11 = i10;
                        vj0Var3 = vj0VarM24000e;
                        z5 = z6;
                    }
                    tj3Var2.m22140r();
                    tj3Var = tj3Var2;
                    m1148a(ui3Var, e16Var5, z5, o39Var3, vj0Var3, null, null, t17Var4, aj3Var, tj3Var, i11 & 2147483646, 0);
                    e16Var3 = e16Var5;
                    z4 = z5;
                    o39Var2 = o39Var3;
                    vj0Var2 = vj0Var3;
                    t17Var3 = t17Var4;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    o39Var2 = o39Var;
                    e16Var3 = e16Var2;
                    z4 = z2;
                    vj0Var2 = vj0VarM24000e;
                    t17Var3 = t17Var2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zj0(ui3Var, e16Var3, z4, o39Var2, vj0Var2, t17Var3, aj3Var, i, i2);
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vj0VarM24000e = vj0Var;
                    if (tj3Var2.m22120g(vj0VarM24000e)) {
                    }
                    i3 |= i14;
                } else {
                    vj0VarM24000e = vj0Var;
                }
                i3 |= i14;
            } else {
                vj0VarM24000e = vj0Var;
            }
            i6 = 1769472 | i3;
            i7 = i2 & 128;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    t17Var2 = t17Var;
                    if (tj3Var2.m22120g(t17Var2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i6 |= i8;
                }
                i9 = i6 | 100663296;
                if ((805306368 & i) != 0) {
                    if (tj3Var2.m22124i(aj3Var)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i9 |= i12;
                }
                if ((306783379 & i9) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i9 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i4 == 0) {
                        }
                        x17 x17Var4 = wj0.f66899a;
                        o39 o39VarM24271b4 = x49.m24271b(ck0.f10188a, tj3Var2);
                        i10 = i9 & (-7169);
                        if ((i2 & 16) != 0) {
                            vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                            i10 = i9 & (-64513);
                        }
                        if (i7 != 0) {
                            t17Var2 = wj0.f66900b;
                        }
                        t17Var4 = t17Var2;
                        e16Var5 = e16Var4;
                        o39Var3 = o39VarM24271b4;
                        i11 = i10;
                        vj0Var3 = vj0VarM24000e;
                        z5 = z6;
                    } else {
                        if (i13 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i4 == 0) {
                        }
                        x17 x17Var5 = wj0.f66899a;
                        o39 o39VarM24271b5 = x49.m24271b(ck0.f10188a, tj3Var2);
                        i10 = i9 & (-7169);
                        if ((i2 & 16) != 0) {
                            vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                            i10 = i9 & (-64513);
                        }
                        if (i7 != 0) {
                            t17Var2 = wj0.f66900b;
                        }
                        t17Var4 = t17Var2;
                        e16Var5 = e16Var4;
                        o39Var3 = o39VarM24271b5;
                        i11 = i10;
                        vj0Var3 = vj0VarM24000e;
                        z5 = z6;
                    }
                    tj3Var2.m22140r();
                    tj3Var = tj3Var2;
                    m1148a(ui3Var, e16Var5, z5, o39Var3, vj0Var3, null, null, t17Var4, aj3Var, tj3Var, i11 & 2147483646, 0);
                    e16Var3 = e16Var5;
                    z4 = z5;
                    o39Var2 = o39Var3;
                    vj0Var2 = vj0Var3;
                    t17Var3 = t17Var4;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    o39Var2 = o39Var;
                    e16Var3 = e16Var2;
                    z4 = z2;
                    vj0Var2 = vj0VarM24000e;
                    t17Var3 = t17Var2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zj0(ui3Var, e16Var3, z4, o39Var2, vj0Var2, t17Var3, aj3Var, i, i2);
                }
            }
            i6 = 14352384 | i3;
            t17Var2 = t17Var;
            i9 = i6 | 100663296;
            if ((805306368 & i) != 0) {
                if (tj3Var2.m22124i(aj3Var)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i9 |= i12;
            }
            if ((306783379 & i9) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i9 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i4 == 0) {
                    }
                    x17 x17Var6 = wj0.f66899a;
                    o39 o39VarM24271b6 = x49.m24271b(ck0.f10188a, tj3Var2);
                    i10 = i9 & (-7169);
                    if ((i2 & 16) != 0) {
                        vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                        i10 = i9 & (-64513);
                    }
                    if (i7 != 0) {
                        t17Var2 = wj0.f66900b;
                    }
                    t17Var4 = t17Var2;
                    e16Var5 = e16Var4;
                    o39Var3 = o39VarM24271b6;
                    i11 = i10;
                    vj0Var3 = vj0VarM24000e;
                    z5 = z6;
                } else {
                    if (i13 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i4 == 0) {
                    }
                    x17 x17Var7 = wj0.f66899a;
                    o39 o39VarM24271b7 = x49.m24271b(ck0.f10188a, tj3Var2);
                    i10 = i9 & (-7169);
                    if ((i2 & 16) != 0) {
                        vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                        i10 = i9 & (-64513);
                    }
                    if (i7 != 0) {
                        t17Var2 = wj0.f66900b;
                    }
                    t17Var4 = t17Var2;
                    e16Var5 = e16Var4;
                    o39Var3 = o39VarM24271b7;
                    i11 = i10;
                    vj0Var3 = vj0VarM24000e;
                    z5 = z6;
                }
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                m1148a(ui3Var, e16Var5, z5, o39Var3, vj0Var3, null, null, t17Var4, aj3Var, tj3Var, i11 & 2147483646, 0);
                e16Var3 = e16Var5;
                z4 = z5;
                o39Var2 = o39Var3;
                vj0Var2 = vj0Var3;
                t17Var3 = t17Var4;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                o39Var2 = o39Var;
                e16Var3 = e16Var2;
                z4 = z2;
                vj0Var2 = vj0VarM24000e;
                t17Var3 = t17Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zj0(ui3Var, e16Var3, z4, o39Var2, vj0Var2, t17Var3, aj3Var, i, i2);
            }
        }
        i3 |= 48;
        e16Var2 = e16Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (tj3Var2.m22122h(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vj0VarM24000e = vj0Var;
                    if (tj3Var2.m22120g(vj0VarM24000e)) {
                    }
                    i3 |= i14;
                } else {
                    vj0VarM24000e = vj0Var;
                }
                i3 |= i14;
            } else {
                vj0VarM24000e = vj0Var;
            }
            i6 = 1769472 | i3;
            i7 = i2 & 128;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    t17Var2 = t17Var;
                    if (tj3Var2.m22120g(t17Var2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i6 |= i8;
                }
                i9 = i6 | 100663296;
                if ((805306368 & i) != 0) {
                    if (tj3Var2.m22124i(aj3Var)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i9 |= i12;
                }
                if ((306783379 & i9) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i9 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i4 == 0) {
                        }
                        x17 x17Var8 = wj0.f66899a;
                        o39 o39VarM24271b8 = x49.m24271b(ck0.f10188a, tj3Var2);
                        i10 = i9 & (-7169);
                        if ((i2 & 16) != 0) {
                            vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                            i10 = i9 & (-64513);
                        }
                        if (i7 != 0) {
                            t17Var2 = wj0.f66900b;
                        }
                        t17Var4 = t17Var2;
                        e16Var5 = e16Var4;
                        o39Var3 = o39VarM24271b8;
                        i11 = i10;
                        vj0Var3 = vj0VarM24000e;
                        z5 = z6;
                    } else {
                        if (i13 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i4 == 0) {
                        }
                        x17 x17Var9 = wj0.f66899a;
                        o39 o39VarM24271b9 = x49.m24271b(ck0.f10188a, tj3Var2);
                        i10 = i9 & (-7169);
                        if ((i2 & 16) != 0) {
                            vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                            i10 = i9 & (-64513);
                        }
                        if (i7 != 0) {
                            t17Var2 = wj0.f66900b;
                        }
                        t17Var4 = t17Var2;
                        e16Var5 = e16Var4;
                        o39Var3 = o39VarM24271b9;
                        i11 = i10;
                        vj0Var3 = vj0VarM24000e;
                        z5 = z6;
                    }
                    tj3Var2.m22140r();
                    tj3Var = tj3Var2;
                    m1148a(ui3Var, e16Var5, z5, o39Var3, vj0Var3, null, null, t17Var4, aj3Var, tj3Var, i11 & 2147483646, 0);
                    e16Var3 = e16Var5;
                    z4 = z5;
                    o39Var2 = o39Var3;
                    vj0Var2 = vj0Var3;
                    t17Var3 = t17Var4;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    o39Var2 = o39Var;
                    e16Var3 = e16Var2;
                    z4 = z2;
                    vj0Var2 = vj0VarM24000e;
                    t17Var3 = t17Var2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zj0(ui3Var, e16Var3, z4, o39Var2, vj0Var2, t17Var3, aj3Var, i, i2);
                }
            }
            i6 = 14352384 | i3;
            t17Var2 = t17Var;
            i9 = i6 | 100663296;
            if ((805306368 & i) != 0) {
                if (tj3Var2.m22124i(aj3Var)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i9 |= i12;
            }
            if ((306783379 & i9) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i9 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i4 == 0) {
                    }
                    x17 x17Var10 = wj0.f66899a;
                    o39 o39VarM24271b10 = x49.m24271b(ck0.f10188a, tj3Var2);
                    i10 = i9 & (-7169);
                    if ((i2 & 16) != 0) {
                        vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                        i10 = i9 & (-64513);
                    }
                    if (i7 != 0) {
                        t17Var2 = wj0.f66900b;
                    }
                    t17Var4 = t17Var2;
                    e16Var5 = e16Var4;
                    o39Var3 = o39VarM24271b10;
                    i11 = i10;
                    vj0Var3 = vj0VarM24000e;
                    z5 = z6;
                } else {
                    if (i13 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i4 == 0) {
                    }
                    x17 x17Var11 = wj0.f66899a;
                    o39 o39VarM24271b11 = x49.m24271b(ck0.f10188a, tj3Var2);
                    i10 = i9 & (-7169);
                    if ((i2 & 16) != 0) {
                        vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                        i10 = i9 & (-64513);
                    }
                    if (i7 != 0) {
                        t17Var2 = wj0.f66900b;
                    }
                    t17Var4 = t17Var2;
                    e16Var5 = e16Var4;
                    o39Var3 = o39VarM24271b11;
                    i11 = i10;
                    vj0Var3 = vj0VarM24000e;
                    z5 = z6;
                }
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                m1148a(ui3Var, e16Var5, z5, o39Var3, vj0Var3, null, null, t17Var4, aj3Var, tj3Var, i11 & 2147483646, 0);
                e16Var3 = e16Var5;
                z4 = z5;
                o39Var2 = o39Var3;
                vj0Var2 = vj0Var3;
                t17Var3 = t17Var4;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                o39Var2 = o39Var;
                e16Var3 = e16Var2;
                z4 = z2;
                vj0Var2 = vj0VarM24000e;
                t17Var3 = t17Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zj0(ui3Var, e16Var3, z4, o39Var2, vj0Var2, t17Var3, aj3Var, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                vj0VarM24000e = vj0Var;
                if (tj3Var2.m22120g(vj0VarM24000e)) {
                }
                i3 |= i14;
            } else {
                vj0VarM24000e = vj0Var;
            }
            i3 |= i14;
        } else {
            vj0VarM24000e = vj0Var;
        }
        i6 = 1769472 | i3;
        i7 = i2 & 128;
        if (i7 != 0) {
            if ((12582912 & i) == 0) {
                t17Var2 = t17Var;
                if (tj3Var2.m22120g(t17Var2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i6 |= i8;
            }
            i9 = i6 | 100663296;
            if ((805306368 & i) != 0) {
                if (tj3Var2.m22124i(aj3Var)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i9 |= i12;
            }
            if ((306783379 & i9) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i9 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i4 == 0) {
                    }
                    x17 x17Var12 = wj0.f66899a;
                    o39 o39VarM24271b12 = x49.m24271b(ck0.f10188a, tj3Var2);
                    i10 = i9 & (-7169);
                    if ((i2 & 16) != 0) {
                        vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                        i10 = i9 & (-64513);
                    }
                    if (i7 != 0) {
                        t17Var2 = wj0.f66900b;
                    }
                    t17Var4 = t17Var2;
                    e16Var5 = e16Var4;
                    o39Var3 = o39VarM24271b12;
                    i11 = i10;
                    vj0Var3 = vj0VarM24000e;
                    z5 = z6;
                } else {
                    if (i13 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i4 == 0) {
                    }
                    x17 x17Var13 = wj0.f66899a;
                    o39 o39VarM24271b13 = x49.m24271b(ck0.f10188a, tj3Var2);
                    i10 = i9 & (-7169);
                    if ((i2 & 16) != 0) {
                        vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                        i10 = i9 & (-64513);
                    }
                    if (i7 != 0) {
                        t17Var2 = wj0.f66900b;
                    }
                    t17Var4 = t17Var2;
                    e16Var5 = e16Var4;
                    o39Var3 = o39VarM24271b13;
                    i11 = i10;
                    vj0Var3 = vj0VarM24000e;
                    z5 = z6;
                }
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                m1148a(ui3Var, e16Var5, z5, o39Var3, vj0Var3, null, null, t17Var4, aj3Var, tj3Var, i11 & 2147483646, 0);
                e16Var3 = e16Var5;
                z4 = z5;
                o39Var2 = o39Var3;
                vj0Var2 = vj0Var3;
                t17Var3 = t17Var4;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                o39Var2 = o39Var;
                e16Var3 = e16Var2;
                z4 = z2;
                vj0Var2 = vj0VarM24000e;
                t17Var3 = t17Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zj0(ui3Var, e16Var3, z4, o39Var2, vj0Var2, t17Var3, aj3Var, i, i2);
            }
        }
        i6 = 14352384 | i3;
        t17Var2 = t17Var;
        i9 = i6 | 100663296;
        if ((805306368 & i) != 0) {
            if (tj3Var2.m22124i(aj3Var)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i9 |= i12;
        }
        if ((306783379 & i9) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var2.m22099R(i9 & 1, z3)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if (i4 == 0) {
                }
                x17 x17Var14 = wj0.f66899a;
                o39 o39VarM24271b14 = x49.m24271b(ck0.f10188a, tj3Var2);
                i10 = i9 & (-7169);
                if ((i2 & 16) != 0) {
                    vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                    i10 = i9 & (-64513);
                }
                if (i7 != 0) {
                    t17Var2 = wj0.f66900b;
                }
                t17Var4 = t17Var2;
                e16Var5 = e16Var4;
                o39Var3 = o39VarM24271b14;
                i11 = i10;
                vj0Var3 = vj0VarM24000e;
                z5 = z6;
            } else {
                if (i13 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if (i4 == 0) {
                }
                x17 x17Var15 = wj0.f66899a;
                o39 o39VarM24271b15 = x49.m24271b(ck0.f10188a, tj3Var2);
                i10 = i9 & (-7169);
                if ((i2 & 16) != 0) {
                    vj0VarM24000e = wj0.m24000e(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a);
                    i10 = i9 & (-64513);
                }
                if (i7 != 0) {
                    t17Var2 = wj0.f66900b;
                }
                t17Var4 = t17Var2;
                e16Var5 = e16Var4;
                o39Var3 = o39VarM24271b15;
                i11 = i10;
                vj0Var3 = vj0VarM24000e;
                z5 = z6;
            }
            tj3Var2.m22140r();
            tj3Var = tj3Var2;
            m1148a(ui3Var, e16Var5, z5, o39Var3, vj0Var3, null, null, t17Var4, aj3Var, tj3Var, i11 & 2147483646, 0);
            e16Var3 = e16Var5;
            z4 = z5;
            o39Var2 = o39Var3;
            vj0Var2 = vj0Var3;
            t17Var3 = t17Var4;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            o39Var2 = o39Var;
            e16Var3 = e16Var2;
            z4 = z2;
            vj0Var2 = vj0VarM24000e;
            t17Var3 = t17Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zj0(ui3Var, e16Var3, z4, o39Var2, vj0Var2, t17Var3, aj3Var, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final C0269z m1154g(boolean z, ye1 ye1Var, int i, int i2) {
        final int i3 = 1;
        final int i4 = 0;
        final boolean z2 = (i2 & 1) != 0 ? false : z;
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        Object obj = we1.f66679a;
        if (objM22097O == obj) {
            objM22097O = new tf4(18);
            tj3Var.m22131l0(objM22097O);
        }
        final vi3 vi3Var = (vi3) objM22097O;
        final SheetValue sheetValue = SheetValue.Hidden;
        int i5 = (i & 14) | 384;
        float f = n59.f52380a;
        final float f2 = ng0.f52696c;
        final float f3 = ng0.f52697d;
        tj3 tj3Var2 = (tj3) ye1Var;
        final fb2 fb2Var = (fb2) tj3Var2.m22128k(AbstractC0402n.f4816h);
        boolean zM22120g = tj3Var2.m22120g(fb2Var) | tj3Var2.m22114d(f2);
        Object objM22097O2 = tj3Var2.m22097O();
        if (zM22120g || objM22097O2 == obj) {
            objM22097O2 = new ui3() { // from class: l59
                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    float fMo912g0;
                    int i6 = i4;
                    float f4 = f2;
                    fb2 fb2Var2 = fb2Var;
                    switch (i6) {
                        case 0:
                            fMo912g0 = fb2Var2.mo912g0(f4);
                            break;
                        default:
                            fMo912g0 = fb2Var2.mo912g0(f4);
                            break;
                    }
                    return Float.valueOf(fMo912g0);
                }
            };
            tj3Var2.m22131l0(objM22097O2);
        }
        final ui3 ui3Var = (ui3) objM22097O2;
        boolean zM22120g2 = tj3Var2.m22120g(fb2Var) | tj3Var2.m22114d(f3);
        Object objM22097O3 = tj3Var2.m22097O();
        if (zM22120g2 || objM22097O3 == obj) {
            objM22097O3 = new ui3() { // from class: l59
                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    float fMo912g0;
                    int i6 = i3;
                    float f4 = f3;
                    fb2 fb2Var2 = fb2Var;
                    switch (i6) {
                        case 0:
                            fMo912g0 = fb2Var2.mo912g0(f4);
                            break;
                        default:
                            fMo912g0 = fb2Var2.mo912g0(f4);
                            break;
                    }
                    return Float.valueOf(fMo912g0);
                }
            };
            tj3Var2.m22131l0(objM22097O3);
        }
        final ui3 ui3Var2 = (ui3) objM22097O3;
        Object[] objArr = {Boolean.valueOf(z2), vi3Var, Boolean.FALSE};
        fs6 fs6Var = new fs6(19, new am8(24), new ua5(z2, ui3Var, ui3Var2, vi3Var));
        if ((((i5 & 14) ^ 6) <= 4 || !tj3Var2.m22122h(z2)) && (i5 & 6) != 4) {
            i3 = 0;
        }
        boolean z3 = ((((tj3Var2.m22120g(ui3Var) ? 1 : 0) | i3) | (tj3Var2.m22120g(ui3Var2) ? 1 : 0)) == true ? 1 : 0) | (tj3Var2.m22120g(vi3Var) ? 1 : 0) | (tj3Var2.m22122h(false) ? 1 : 0);
        Object objM22097O4 = tj3Var2.m22097O();
        if (z3 != 0 || objM22097O4 == obj) {
            Object obj2 = new ui3(z2, ui3Var, ui3Var2, sheetValue, vi3Var) { // from class: m59

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f50619a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ui3 f50620b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ SheetValue f50621c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ vi3 f50622d;

                {
                    this.f50621c = sheetValue;
                    this.f50622d = vi3Var;
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    return new C0269z(this.f50619a, this.f50620b, this.f50621c, this.f50622d);
                }
            };
            tj3Var2.m22131l0(obj2);
            objM22097O4 = obj2;
        }
        return (C0269z) xwc.m24747T(objArr, fs6Var, (ui3) objM22097O4, tj3Var2, 0);
    }
}
