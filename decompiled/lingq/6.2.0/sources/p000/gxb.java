package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f41510a = new C0282a(-376595667, false, new sd1(14));

    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x0107  */
    /* JADX WARN: Code duplicated, block: B:76:0x010b  */
    /* JADX WARN: Code duplicated, block: B:79:0x012d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0179  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x0236  */
    /* JADX WARN: Code duplicated, block: B:87:0x0252  */
    /* JADX WARN: Code duplicated, block: B:89:0x0269  */
    /* JADX WARN: Code duplicated, block: B:91:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:94:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m12965a(String str, String str2, ui3 ui3Var, String str3, Integer num, aj3 aj3Var, ye1 ye1Var, int i, int i2) {
        String str4;
        int i3;
        Integer num2;
        int i4;
        aj3 aj3Var2;
        int i5;
        int i6;
        boolean z;
        Integer num3;
        aj3 aj3Var3;
        x18 x18VarM22143u;
        Integer num4;
        ui3 ui3Var2;
        boolean z2;
        aj3 aj3Var4;
        boolean z3;
        db1 db1Var;
        str.getClass();
        str2.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1726573004);
        if ((i & 6) == 0) {
            str4 = str;
            i3 = (tj3Var.m22120g(str4) ? 4 : 2) | i;
        } else {
            str4 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22120g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        int i7 = i & 3072;
        b16 b16Var = b16.f7762a;
        if (i7 == 0) {
            i3 |= tj3Var.m22120g(b16Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22120g(str3) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 == 0) {
            if ((196608 & i) == 0) {
                num2 = num;
                i3 |= tj3Var.m22120g(num2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    aj3Var2 = aj3Var;
                    if (tj3Var.m22124i(aj3Var2)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                if ((i6 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i6 & 1, z)) {
                    if (i8 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i4 != 0) {
                        aj3Var2 = null;
                    }
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(l70.m15962y(c99.m4411d(b16Var, 1.0f)), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
                    se1.f60731q.getClass();
                    ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    if (num4 != null) {
                        tj3Var.m22111b0(703101747);
                        thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
                        z2 = false;
                        bq1.m4042R(AbstractC3423or.m18236U(num4.intValue(), tj3Var, (i6 >> 15) & 14), null, c99.m4416i(c99.m4412e(b16Var, 1.0f), 0.0f, 240.0f, 1), null, hl1.f42565b, 0.0f, null, tj3Var, 25016, 104);
                        tj3Var = tj3Var;
                        ux5.m23003z(b16Var, ge9.m12515a(tj3Var).f38957f, tj3Var, false);
                    } else {
                        z2 = false;
                        tj3Var.m22111b0(703556300);
                        tj3Var.m22139q(false);
                    }
                    aj3Var4 = aj3Var2;
                    tj3 tj3Var2 = tj3Var;
                    lw9.m16554b(str4, null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71400d, tj3Var2, i6 & 14, 0, 130042);
                    tj3Var = tj3Var2;
                    if (str3 != null) {
                        tj3Var.m22111b0(703808423);
                        thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38955d));
                        lw9.m16554b(str3, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, (i6 >> 12) & 14, 0, 130042);
                        tj3Var = tj3Var;
                        z3 = false;
                        tj3Var.m22139q(false);
                    } else {
                        z3 = false;
                        tj3Var.m22111b0(704120748);
                        tj3Var.m22139q(false);
                    }
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
                    db1Var = db1.f35347a;
                    if (aj3Var4 != null) {
                        tj3Var.m22111b0(704262635);
                        aj3Var4.invoke(db1Var, tj3Var, Integer.valueOf(((i6 >> 15) & 112) | 6));
                        tj3Var.m22139q(z3);
                    } else {
                        tj3Var.m22111b0(704294348);
                        tj3Var.m22139q(z3);
                    }
                    thb.m22044c(tj3Var, db1Var.m10266b(b16Var, true));
                    ss5.m21710f(AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), null, null, true, ui3Var, ci8.m4703P(195985046, new iq0(str2, 10), tj3Var), tj3Var, ((i6 << 6) & 57344) | 199680, 6);
                    tj3Var.m22139q(true);
                    aj3Var3 = aj3Var4;
                    num3 = num4;
                } else {
                    tj3Var.m22102U();
                    num3 = num2;
                    aj3Var3 = aj3Var2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new nm5(str, str2, ui3Var, str3, num3, aj3Var3, i, i2);
                }
            }
            i3 |= 1572864;
            aj3Var2 = aj3Var;
            i6 = i3;
            if ((i6 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i6 & 1, z)) {
                if (i8 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i4 != 0) {
                    aj3Var2 = null;
                }
                e16 e16VarM21609V2 = AbstractC3584sr.m21609V(l70.m15962y(c99.m4411d(b16Var, 1.0f)), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
                bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V2);
                se1.f60731q.getClass();
                ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a2);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
                if (num4 != null) {
                    tj3Var.m22111b0(703101747);
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
                    z2 = false;
                    bq1.m4042R(AbstractC3423or.m18236U(num4.intValue(), tj3Var, (i6 >> 15) & 14), null, c99.m4416i(c99.m4412e(b16Var, 1.0f), 0.0f, 240.0f, 1), null, hl1.f42565b, 0.0f, null, tj3Var, 25016, 104);
                    tj3Var = tj3Var;
                    ux5.m23003z(b16Var, ge9.m12515a(tj3Var).f38957f, tj3Var, false);
                } else {
                    z2 = false;
                    tj3Var.m22111b0(703556300);
                    tj3Var.m22139q(false);
                }
                aj3Var4 = aj3Var2;
                tj3 tj3Var3 = tj3Var;
                lw9.m16554b(str4, null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71400d, tj3Var3, i6 & 14, 0, 130042);
                tj3Var = tj3Var3;
                if (str3 != null) {
                    tj3Var.m22111b0(703808423);
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38955d));
                    lw9.m16554b(str3, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, (i6 >> 12) & 14, 0, 130042);
                    tj3Var = tj3Var;
                    z3 = false;
                    tj3Var.m22139q(false);
                } else {
                    z3 = false;
                    tj3Var.m22111b0(704120748);
                    tj3Var.m22139q(false);
                }
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
                db1Var = db1.f35347a;
                if (aj3Var4 != null) {
                    tj3Var.m22111b0(704262635);
                    aj3Var4.invoke(db1Var, tj3Var, Integer.valueOf(((i6 >> 15) & 112) | 6));
                    tj3Var.m22139q(z3);
                } else {
                    tj3Var.m22111b0(704294348);
                    tj3Var.m22139q(z3);
                }
                thb.m22044c(tj3Var, db1Var.m10266b(b16Var, true));
                ss5.m21710f(AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), null, null, true, ui3Var, ci8.m4703P(195985046, new iq0(str2, 10), tj3Var), tj3Var, ((i6 << 6) & 57344) | 199680, 6);
                tj3Var.m22139q(true);
                aj3Var3 = aj3Var4;
                num3 = num4;
            } else {
                tj3Var.m22102U();
                num3 = num2;
                aj3Var3 = aj3Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new nm5(str, str2, ui3Var, str3, num3, aj3Var3, i, i2);
            }
        }
        i3 |= 196608;
        num2 = num;
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                aj3Var2 = aj3Var;
                if (tj3Var.m22124i(aj3Var2)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((i6 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i6 & 1, z)) {
                if (i8 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i4 != 0) {
                    aj3Var2 = null;
                }
                e16 e16VarM21609V3 = AbstractC3584sr.m21609V(l70.m15962y(c99.m4411d(b16Var, 1.0f)), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
                bb1 bb1VarM230a3 = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V3);
                se1.f60731q.getClass();
                ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a3);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m3);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode3));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c3);
                if (num4 != null) {
                    tj3Var.m22111b0(703101747);
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
                    z2 = false;
                    bq1.m4042R(AbstractC3423or.m18236U(num4.intValue(), tj3Var, (i6 >> 15) & 14), null, c99.m4416i(c99.m4412e(b16Var, 1.0f), 0.0f, 240.0f, 1), null, hl1.f42565b, 0.0f, null, tj3Var, 25016, 104);
                    tj3Var = tj3Var;
                    ux5.m23003z(b16Var, ge9.m12515a(tj3Var).f38957f, tj3Var, false);
                } else {
                    z2 = false;
                    tj3Var.m22111b0(703556300);
                    tj3Var.m22139q(false);
                }
                aj3Var4 = aj3Var2;
                tj3 tj3Var4 = tj3Var;
                lw9.m16554b(str4, null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71400d, tj3Var4, i6 & 14, 0, 130042);
                tj3Var = tj3Var4;
                if (str3 != null) {
                    tj3Var.m22111b0(703808423);
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38955d));
                    lw9.m16554b(str3, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, (i6 >> 12) & 14, 0, 130042);
                    tj3Var = tj3Var;
                    z3 = false;
                    tj3Var.m22139q(false);
                } else {
                    z3 = false;
                    tj3Var.m22111b0(704120748);
                    tj3Var.m22139q(false);
                }
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
                db1Var = db1.f35347a;
                if (aj3Var4 != null) {
                    tj3Var.m22111b0(704262635);
                    aj3Var4.invoke(db1Var, tj3Var, Integer.valueOf(((i6 >> 15) & 112) | 6));
                    tj3Var.m22139q(z3);
                } else {
                    tj3Var.m22111b0(704294348);
                    tj3Var.m22139q(z3);
                }
                thb.m22044c(tj3Var, db1Var.m10266b(b16Var, true));
                ss5.m21710f(AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), null, null, true, ui3Var, ci8.m4703P(195985046, new iq0(str2, 10), tj3Var), tj3Var, ((i6 << 6) & 57344) | 199680, 6);
                tj3Var.m22139q(true);
                aj3Var3 = aj3Var4;
                num3 = num4;
            } else {
                tj3Var.m22102U();
                num3 = num2;
                aj3Var3 = aj3Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new nm5(str, str2, ui3Var, str3, num3, aj3Var3, i, i2);
            }
        }
        i3 |= 1572864;
        aj3Var2 = aj3Var;
        i6 = i3;
        if ((i6 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i6 & 1, z)) {
            if (i8 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if (i4 != 0) {
                aj3Var2 = null;
            }
            e16 e16VarM21609V4 = AbstractC3584sr.m21609V(l70.m15962y(c99.m4411d(b16Var, 1.0f)), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
            bb1 bb1VarM230a4 = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V4);
            se1.f60731q.getClass();
            ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a4);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m4);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode4));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c4);
            if (num4 != null) {
                tj3Var.m22111b0(703101747);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
                z2 = false;
                bq1.m4042R(AbstractC3423or.m18236U(num4.intValue(), tj3Var, (i6 >> 15) & 14), null, c99.m4416i(c99.m4412e(b16Var, 1.0f), 0.0f, 240.0f, 1), null, hl1.f42565b, 0.0f, null, tj3Var, 25016, 104);
                tj3Var = tj3Var;
                ux5.m23003z(b16Var, ge9.m12515a(tj3Var).f38957f, tj3Var, false);
            } else {
                z2 = false;
                tj3Var.m22111b0(703556300);
                tj3Var.m22139q(false);
            }
            aj3Var4 = aj3Var2;
            tj3 tj3Var5 = tj3Var;
            lw9.m16554b(str4, null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71400d, tj3Var5, i6 & 14, 0, 130042);
            tj3Var = tj3Var5;
            if (str3 != null) {
                tj3Var.m22111b0(703808423);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38955d));
                lw9.m16554b(str3, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, (i6 >> 12) & 14, 0, 130042);
                tj3Var = tj3Var;
                z3 = false;
                tj3Var.m22139q(false);
            } else {
                z3 = false;
                tj3Var.m22111b0(704120748);
                tj3Var.m22139q(false);
            }
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            db1Var = db1.f35347a;
            if (aj3Var4 != null) {
                tj3Var.m22111b0(704262635);
                aj3Var4.invoke(db1Var, tj3Var, Integer.valueOf(((i6 >> 15) & 112) | 6));
                tj3Var.m22139q(z3);
            } else {
                tj3Var.m22111b0(704294348);
                tj3Var.m22139q(z3);
            }
            thb.m22044c(tj3Var, db1Var.m10266b(b16Var, true));
            ss5.m21710f(AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), null, null, true, ui3Var, ci8.m4703P(195985046, new iq0(str2, 10), tj3Var), tj3Var, ((i6 << 6) & 57344) | 199680, 6);
            tj3Var.m22139q(true);
            aj3Var3 = aj3Var4;
            num3 = num4;
        } else {
            tj3Var.m22102U();
            num3 = num2;
            aj3Var3 = aj3Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nm5(str, str2, ui3Var, str3, num3, aj3Var3, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:70:0x0100  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:74:0x0157  */
    /* JADX WARN: Code duplicated, block: B:77:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:78:0x0200  */
    /* JADX WARN: Code duplicated, block: B:80:0x026d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0278  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m12966b(String str, boolean z, String str2, ui3 ui3Var, e16 e16Var, String str3, C0282a c0282a, ye1 ye1Var, int i, int i2) {
        int i3;
        String str4;
        boolean z2;
        String str5;
        String str6;
        x18 x18VarM22143u;
        String str7;
        int i4;
        ui3 ui3Var2;
        b16 b16Var;
        String str8;
        int i5;
        str.getClass();
        str2.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(329827350);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22122h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22120g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22120g(e16Var) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 == 0) {
            if ((i & 196608) == 0) {
                str4 = str3;
                i3 |= tj3Var.m22120g(str4) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                if (tj3Var.m22124i(c0282a)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((599187 & i3) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var.m22099R(i3 & 1, z2)) {
                if (i6 != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                e16 e16VarM21609V = AbstractC3584sr.m21609V(l70.m15962y(c99.m4411d(e16Var, 1.0f)), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
                ec0 ec0Var = nj0.f52792K;
                C3587su c3587su = eh0.f37238d;
                bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var, 48);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
                se1.f60731q.getClass();
                i4 = i3;
                ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                zi3 zi3Var = C0352b.f4303f;
                oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
                zi3 zi3Var2 = C0352b.f4302e;
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                zi3 zi3Var3 = C0352b.f4304g;
                oha.m18001g(tj3Var, zi3Var3, numValueOf);
                vi3 vi3Var = C0352b.f4305h;
                oha.m18000f(tj3Var, vi3Var);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
                db1 db1Var = db1.f35347a;
                b16Var = b16.f7762a;
                str8 = str7;
                e16 e16VarM3912B0 = bna.m3912B0(db1Var.m10266b(b16Var, true), bna.m3972r0(tj3Var), false, 14);
                bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var, 48);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM3912B0);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                lw9.m16554b(str, null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71400d, tj3Var, i4 & 14, 0, 130042);
                tj3Var = tj3Var;
                if (str8 != null) {
                    tj3Var.m22111b0(108924726);
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38955d));
                    lw9.m16554b(str8, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, (i4 >> 15) & 14, 0, 130042);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(109295672);
                    tj3Var.m22139q(false);
                }
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
                c0282a.invoke(db1Var, tj3Var, Integer.valueOf(((i4 >> 15) & 112) | 6));
                tj3Var.m22139q(true);
                str5 = str2;
                ss5.m21710f(AbstractC3584sr.m21611X(ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38952a, tj3Var, b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), null, null, z, ui3Var, ci8.m4703P(-557038880, new iq0(str5, 8), tj3Var), tj3Var, ((i4 << 6) & 7168) | 196608 | (57344 & (i4 << 3)), 6);
                tj3Var.m22139q(true);
                str6 = str8;
            } else {
                str5 = str2;
                tj3Var.m22102U();
                str6 = str4;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new pz5(str, z, str5, ui3Var, e16Var, str6, c0282a, i, i2);
            }
        }
        i3 |= 196608;
        str4 = str3;
        if ((1572864 & i) == 0) {
            if (tj3Var.m22124i(c0282a)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (tj3Var.m22099R(i3 & 1, z2)) {
            if (i6 != 0) {
                str7 = null;
            } else {
                str7 = str4;
            }
            e16 e16VarM21609V2 = AbstractC3584sr.m21609V(l70.m15962y(c99.m4411d(e16Var, 1.0f)), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
            ec0 ec0Var2 = nj0.f52792K;
            C3587su c3587su2 = eh0.f37238d;
            bb1 bb1VarM230a3 = ab1.m230a(c3587su2, ec0Var2, tj3Var, 48);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V2);
            se1.f60731q.getClass();
            i4 = i3;
            ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var5 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var5, bb1VarM230a3);
            zi3 zi3Var6 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var6, l77VarM22132m3);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            zi3 zi3Var7 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var7, numValueOf2);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var2);
            zi3 zi3Var8 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var8, e16VarM1322c3);
            db1 db1Var2 = db1.f35347a;
            b16Var = b16.f7762a;
            str8 = str7;
            e16 e16VarM3912B1 = bna.m3912B0(db1Var2.m10266b(b16Var, true), bna.m3972r0(tj3Var), false, 14);
            bb1 bb1VarM230a4 = ab1.m230a(c3587su2, ec0Var2, tj3Var, 48);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM3912B1);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var5, bb1VarM230a4);
            oha.m18001g(tj3Var, zi3Var6, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var7, tj3Var, vi3Var2);
            oha.m18001g(tj3Var, zi3Var8, e16VarM1322c4);
            lw9.m16554b(str, null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71400d, tj3Var, i4 & 14, 0, 130042);
            tj3Var = tj3Var;
            if (str8 != null) {
                tj3Var.m22111b0(108924726);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38955d));
                lw9.m16554b(str8, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, (i4 >> 15) & 14, 0, 130042);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(109295672);
                tj3Var.m22139q(false);
            }
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            c0282a.invoke(db1Var2, tj3Var, Integer.valueOf(((i4 >> 15) & 112) | 6));
            tj3Var.m22139q(true);
            str5 = str2;
            ss5.m21710f(AbstractC3584sr.m21611X(ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38952a, tj3Var, b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), null, null, z, ui3Var, ci8.m4703P(-557038880, new iq0(str5, 8), tj3Var), tj3Var, ((i4 << 6) & 7168) | 196608 | (57344 & (i4 << 3)), 6);
            tj3Var.m22139q(true);
            str6 = str8;
        } else {
            str5 = str2;
            tj3Var.m22102U();
            str6 = str4;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new pz5(str, z, str5, ui3Var, e16Var, str6, c0282a, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [tj3] */
    /* JADX WARN: Type inference failed for: r1v14, types: [tj3] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [tj3] */
    /* JADX WARN: Type inference failed for: r1v5, types: [tj3] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, tj3, ye1] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.internal.a] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.runtime.internal.a] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.runtime.internal.a, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public static final void m12967c(String str, String str2, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        String str3;
        ?? r3;
        ?? r1;
        b16 b16Var;
        ?? r2;
        str.getClass();
        ?? r4 = (tj3) ye1Var;
        r4.m22115d0(-907144479);
        if ((i & 6) == 0) {
            i2 = (r4.m22120g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        b16 b16Var2 = b16.f7762a;
        if (i3 == 0) {
            i2 |= r4.m22120g(b16Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= r4.m22120g(str2) ? 256 : 128;
        }
        int i4 = i & 3072;
        ?? r9 = fcb.f38868a;
        if (i4 == 0) {
            i2 |= r4.m22124i(r9) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= r4.m22124i(c0282a) ? 16384 : 8192;
        }
        if (r4.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            e16 e16VarM21609V = AbstractC3584sr.m21609V(l70.m15962y(c99.m4411d(b16Var2, 1.0f)), ge9.m12515a(r4).f38957f, 0.0f, 2);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, r4, 48);
            int iHashCode = Long.hashCode(r4.f62385T);
            l77 l77VarM22132m = r4.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(r4, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            r4.m22119f0();
            if (r4.f62384S) {
                r4.m22130l(ui3Var);
            } else {
                r4.m22137o0();
            }
            oha.m18001g(r4, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(r4, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(r4, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(r4, C0352b.f4305h);
            oha.m18001g(r4, C0352b.f4301d, e16VarM1322c);
            int i5 = i2;
            lw9.m16554b(str, null, p58.m18900f(r4).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(r4).f71400d, r4, i2 & 14, 0, 130042);
            if (str2 != null) {
                r4.m22111b0(88346425);
                thb.m22044c(r4, c99.m4414g(b16Var2, ge9.m12515a(r4).f38955d));
                b16Var = b16Var2;
                str3 = str2;
                lw9.m16554b(str3, null, p58.m18900f(r4).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(r4).f71406j, r4, (i5 >> 6) & 14, 0, 130042);
                ?? r5 = r4;
                r5.m22139q(false);
                r2 = r5;
            } else {
                ?? r6 = r4;
                b16Var = b16Var2;
                str3 = str2;
                r6.m22111b0(88682775);
                r6.m22139q(false);
                r2 = r6;
            }
            b16 b16Var3 = b16Var;
            thb.m22044c(r2, c99.m4414g(b16Var3, ge9.m12515a(r2).f38957f));
            Integer numValueOf = Integer.valueOf(((i5 >> 6) & 112) | 6);
            db1 db1Var = db1.f35347a;
            r9.invoke(db1Var, r2, numValueOf);
            thb.m22044c(r2, c99.m4414g(b16Var3, ge9.m12515a(r2).f38952a));
            ?? r7 = c0282a;
            r7.invoke(db1Var, r2, Integer.valueOf(((i5 >> 9) & 112) | 6));
            r2.m22139q(true);
            r1 = r2;
            r3 = r7;
        } else {
            str3 = str2;
            r3 = c0282a;
            ?? r8 = r4;
            r8.m22102U();
            r1 = r8;
        }
        x18 x18VarM22143u = r1.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(str, str3, r3, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:73:0x017c  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x0241  */
    /* JADX WARN: Code duplicated, block: B:79:0x024b  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m12968d(String str, boolean z, String str2, ui3 ui3Var, String str3, C0282a c0282a, ye1 ye1Var, int i, int i2) {
        int i3;
        boolean z2;
        ui3 ui3Var2;
        String str4;
        boolean z3;
        String str5;
        x18 x18VarM22143u;
        ui3 ui3Var3;
        int i4;
        int i5;
        str.getClass();
        str2.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(527553864);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i3 |= tj3Var.m22122h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22120g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            ui3Var2 = ui3Var;
            i3 |= tj3Var.m22124i(ui3Var2) ? 2048 : 1024;
        } else {
            ui3Var2 = ui3Var;
        }
        int i6 = i & 24576;
        b16 b16Var = b16.f7762a;
        if (i6 == 0) {
            i3 |= tj3Var.m22120g(b16Var) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((i & 196608) == 0) {
                str4 = str3;
                i3 |= tj3Var.m22120g(str4) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                if (tj3Var.m22124i(c0282a)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i3 & 1, z3)) {
                if (i7 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                e16 e16VarM21609V = AbstractC3584sr.m21609V(l70.m15962y(c99.m4411d(b16Var, 1.0f)), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
                se1.f60731q.getClass();
                ui3Var3 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var3);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                i4 = i3;
                lw9.m16554b(str, null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71400d, tj3Var, i3 & 14, 0, 130042);
                tj3Var = tj3Var;
                if (str5 != null) {
                    tj3Var.m22111b0(1967120242);
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38955d));
                    lw9.m16554b(str5, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, (i4 >> 15) & 14, 0, 130042);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1967456592);
                    tj3Var.m22139q(false);
                }
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
                c0282a.invoke(db1.f35347a, tj3Var, Integer.valueOf(((i4 >> 15) & 112) | 6));
                ss5.m21710f(AbstractC3584sr.m21611X(ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38952a, tj3Var, b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), null, null, z2, ui3Var2, ci8.m4703P(-1003034094, new iq0(str2, 9), tj3Var), tj3Var, ((i4 << 6) & 7168) | 196608 | ((i4 << 3) & 57344), 6);
                tj3Var.m22139q(true);
            } else {
                tj3Var.m22102U();
                str5 = str4;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new a65(str, z, str2, ui3Var, str5, c0282a, i, i2);
            }
        }
        i3 |= 196608;
        str4 = str3;
        if ((1572864 & i) == 0) {
            if (tj3Var.m22124i(c0282a)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var.m22099R(i3 & 1, z3)) {
            if (i7 != 0) {
                str5 = null;
            } else {
                str5 = str4;
            }
            e16 e16VarM21609V2 = AbstractC3584sr.m21609V(l70.m15962y(c99.m4411d(b16Var, 1.0f)), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
            bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V2);
            se1.f60731q.getClass();
            ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a2);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
            i4 = i3;
            lw9.m16554b(str, null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71400d, tj3Var, i3 & 14, 0, 130042);
            tj3Var = tj3Var;
            if (str5 != null) {
                tj3Var.m22111b0(1967120242);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38955d));
                lw9.m16554b(str5, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, (i4 >> 15) & 14, 0, 130042);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1967456592);
                tj3Var.m22139q(false);
            }
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            c0282a.invoke(db1.f35347a, tj3Var, Integer.valueOf(((i4 >> 15) & 112) | 6));
            ss5.m21710f(AbstractC3584sr.m21611X(ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38952a, tj3Var, b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), null, null, z2, ui3Var2, ci8.m4703P(-1003034094, new iq0(str2, 9), tj3Var), tj3Var, ((i4 << 6) & 7168) | 196608 | ((i4 << 3) & 57344), 6);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
            str5 = str4;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new a65(str, z, str2, ui3Var, str5, c0282a, i, i2);
        }
    }
}
