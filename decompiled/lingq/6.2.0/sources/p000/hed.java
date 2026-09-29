package p000;

import android.os.Bundle;
import androidx.compose.material3.AbstractC0226d0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hed {
    /* JADX WARN: Code duplicated, block: B:162:0x043d  */
    /* JADX WARN: Code duplicated, block: B:163:0x043f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0442  */
    /* JADX WARN: Code duplicated, block: B:166:0x0444  */
    /* JADX WARN: Code duplicated, block: B:169:0x044b  */
    /* JADX WARN: Code duplicated, block: B:170:0x044d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0457  */
    /* JADX WARN: Code duplicated, block: B:179:0x048d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0497  */
    /* JADX WARN: Code duplicated, block: B:182:0x0499  */
    /* JADX WARN: Code duplicated, block: B:186:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:189:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:192:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:194:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:197:0x0515  */
    /* JADX WARN: Code duplicated, block: B:198:0x0517  */
    /* JADX WARN: Code duplicated, block: B:202:0x0520  */
    /* JADX WARN: Code duplicated, block: B:205:0x0552  */
    /* JADX WARN: Code duplicated, block: B:206:0x0567  */
    /* JADX WARN: Code duplicated, block: B:209:0x0583  */
    /* JADX WARN: Code duplicated, block: B:210:0x0585  */
    /* JADX WARN: Code duplicated, block: B:214:0x058e  */
    /* JADX WARN: Code duplicated, block: B:217:0x05af  */
    /* JADX WARN: Code duplicated, block: B:219:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:220:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:224:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:226:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:228:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:229:0x0606  */
    /* JADX WARN: Code duplicated, block: B:232:0x0621  */
    /* JADX WARN: Code duplicated, block: B:233:0x0623  */
    /* JADX WARN: Code duplicated, block: B:237:0x062c  */
    /* JADX INFO: renamed from: a */
    public static final void m13213a(e16 e16Var, final int i, final int i2, final boolean z, final boolean z2, final boolean z3, final boolean z4, ac7 ac7Var, final String str, vi3 vi3Var, final vi3 vi3Var2, ye1 ye1Var, final int i3) {
        int i4;
        int i5;
        tj3 tj3Var;
        final ac7 ac7Var2;
        e16 e16Var2;
        p84 p84Var;
        boolean z5;
        Object obj;
        int i6;
        boolean z6;
        final String str2;
        final vi3 vi3Var3;
        final vi3 vi3Var4;
        p84 p84Var2;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Object objM22097O;
        tj3 tj3Var2;
        boolean z12;
        Object objM22097O2;
        tj3 tj3Var3;
        long jM198b;
        boolean z13;
        Object objM22097O3;
        long jM198b2;
        boolean z14;
        Object objM22097O4;
        boolean z15;
        Object objM22097O5;
        boolean z16;
        Object objM22097O6;
        final vi3 vi3Var5 = vi3Var;
        ac7Var.getClass();
        vi3Var5.getClass();
        tj3 tj3Var4 = (tj3) ye1Var;
        tj3Var4.m22115d0(-1666135678);
        int i7 = i3 | 6;
        if ((i3 & 48) == 0) {
            i7 |= tj3Var4.m22116e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= tj3Var4.m22116e(i2) ? 256 : 128;
        }
        int i8 = i7;
        if ((i3 & 3072) == 0) {
            i4 = i8 | (tj3Var4.m22122h(z) ? 2048 : 1024);
        } else {
            i4 = i8;
        }
        if ((i3 & 24576) == 0) {
            i4 |= tj3Var4.m22122h(z2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= tj3Var4.m22122h(z3) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= tj3Var4.m22122h(z4) ? 1048576 : 524288;
        }
        int i9 = (tj3Var4.m22120g(ac7Var) ? 8388608 : 4194304) | i4;
        if ((100663296 & i3) == 0) {
            i5 = i9 | (tj3Var4.m22120g(str) ? 67108864 : 33554432);
        } else {
            i5 = i9;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= tj3Var4.m22124i(vi3Var5) ? 536870912 : 268435456;
        }
        if (tj3Var4.m22099R(i5 & 1, (i5 & 306783379) != 306783378)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var4).f38957f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var4, 0);
            int iHashCode = Long.hashCode(tj3Var4.f62385T);
            l77 l77VarM22132m = tj3Var4.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var4, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var4.m22119f0();
            if (tj3Var4.f62384S) {
                tj3Var4.m22130l(ui3Var);
            } else {
                tj3Var4.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var4, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var4, zi3Var3, numValueOf);
            vi3 vi3Var6 = C0352b.f4305h;
            oha.m18000f(tj3Var4, vi3Var6);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c);
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            float fM17125i0 = AbstractC3352my.m17125i0(i);
            float fM17125i1 = AbstractC3352my.m17125i0(i2);
            if (fM17125i0 > fM17125i1) {
                fM17125i0 = fM17125i1;
            }
            int i10 = i5;
            h41 h41Var = new h41(0.0f, AbstractC3352my.m17125i0(i2));
            int i11 = i10 & 1879048192;
            int i12 = i10 & 234881024;
            boolean z17 = (i11 == 536870912) | (i12 == 67108864);
            Object objM22097O7 = tj3Var4.m22097O();
            p84 p84Var3 = we1.f66679a;
            if (z17 || objM22097O7 == p84Var3) {
                objM22097O7 = new C3485q5(15, vi3Var5, vi3Var2, str);
                tj3Var4.m22131l0(objM22097O7);
            }
            AbstractC0226d0.m1132c(fM17125i0, (vi3) objM22097O7, e16VarM4412e, false, h41Var, 0, null, null, null, tj3Var4, 384, 488);
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var4, 6);
            int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
            l77 l77VarM22132m2 = tj3Var4.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, e16VarM4412e2);
            tj3Var4.m22119f0();
            if (tj3Var4.f62384S) {
                tj3Var4.m22130l(ui3Var);
            } else {
                tj3Var4.m22137o0();
            }
            oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var4, zi3Var3, tj3Var4, vi3Var6);
            oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c2);
            lw9.m16554b(AbstractC3352my.m17123h0(i), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
            int i13 = i2 - i;
            if (i13 < 0) {
                i13 = 0;
            }
            lw9.m16554b(AbstractC3352my.m17123h0(i13), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
            tj3 tj3Var5 = tj3Var4;
            tj3Var5.m22139q(true);
            e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
            bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var5).f38952a, true, new gm5(28)), nj0.f52792K, tj3Var5, 48);
            int iHashCode3 = Long.hashCode(tj3Var5.f62385T);
            l77 l77VarM22132m3 = tj3Var5.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var5, e16VarM4412e3);
            tj3Var5.m22119f0();
            if (tj3Var5.f62384S) {
                tj3Var5.m22130l(ui3Var);
            } else {
                tj3Var5.m22137o0();
            }
            oha.m18001g(tj3Var5, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var5, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var5, zi3Var3, tj3Var5, vi3Var6);
            oha.m18001g(tj3Var5, zi3Var4, e16VarM1322c3);
            e16 e16VarM4412e4 = c99.m4412e(b16Var, 1.0f);
            u06 u06Var = eh0.f37241g;
            fc0 fc0Var = nj0.f52789H;
            sj8 sj8VarM20003a2 = qj8.m20003a(u06Var, fc0Var, tj3Var5, 54);
            int iHashCode4 = Long.hashCode(tj3Var5.f62385T);
            l77 l77VarM22132m4 = tj3Var5.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var5, e16VarM4412e4);
            tj3Var5.m22119f0();
            if (tj3Var5.f62384S) {
                tj3Var5.m22130l(ui3Var);
            } else {
                tj3Var5.m22137o0();
            }
            oha.m18001g(tj3Var5, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var5, zi3Var2, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var5, zi3Var3, tj3Var5, vi3Var6);
            oha.m18001g(tj3Var5, zi3Var4, e16VarM1322c4);
            if (z2) {
                p84Var = p84Var3;
                z5 = false;
                tj3Var5.m22111b0(-1163120976);
                tj3Var5.m22139q(false);
            } else {
                tj3Var5.m22111b0(-1163471741);
                boolean z18 = i11 == 536870912;
                Object objM22097O8 = tj3Var5.m22097O();
                if (z18) {
                    p84Var = p84Var3;
                } else {
                    p84Var = p84Var3;
                    if (objM22097O8 == p84Var) {
                    }
                    omd.m18141c((ui3) objM22097O8, null, false, null, null, iqb.f44440a, tj3Var5, 1572864, 62);
                    tj3Var5 = tj3Var5;
                    z5 = false;
                    tj3Var5.m22139q(false);
                }
                objM22097O8 = new nw1(vi3Var, 20);
                tj3Var5.m22131l0(objM22097O8);
                omd.m18141c((ui3) objM22097O8, null, false, null, null, iqb.f44440a, tj3Var5, 1572864, 62);
                tj3Var5 = tj3Var5;
                z5 = false;
                tj3Var5.m22139q(false);
            }
            int i14 = i10 & 112;
            boolean z19 = (i11 == 536870912 ? true : z5) | (i12 == 67108864) | (i14 == 32);
            Object objM22097O9 = tj3Var5.m22097O();
            if (z19 || objM22097O9 == p84Var) {
                final int i15 = 0;
                i6 = i11;
                z6 = false;
                str2 = str;
                vi3Var3 = vi3Var;
                vi3Var4 = vi3Var2;
                obj = new ui3() { // from class: si3
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i16 = i15;
                        xfa xfaVar = xfa.f68157a;
                        int i17 = i;
                        vi3 vi3Var7 = vi3Var4;
                        String str3 = str2;
                        vi3 vi3Var8 = vi3Var3;
                        switch (i16) {
                            case 0:
                                vi3Var8.invoke(ga7.f40463a);
                                if (str3 != null) {
                                    vi3Var7.invoke(new gbb(i17 - 5000));
                                }
                                break;
                            default:
                                vi3Var8.invoke(ra7.f58973a);
                                if (str3 != null) {
                                    vi3Var7.invoke(new ibb(i17 + 5000));
                                }
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var5.m22131l0(obj);
            } else {
                obj = objM22097O9;
                i6 = i11;
                z6 = false;
                str2 = str;
                vi3Var3 = vi3Var;
                vi3Var4 = vi3Var2;
            }
            int i16 = i6;
            tj3 tj3Var6 = tj3Var5;
            omd.m18141c((ui3) obj, null, false, null, null, iqb.f44441b, tj3Var6, 1572864, 62);
            e16 e16VarM10007D = d32.m10007D(c99.m4422o(b16Var, 56.0f), p58.m18900f(tj3Var6).f55842a, p58.m18901i(tj3Var6).f64857c);
            boolean z20 = ((i10 & 7168) == 2048) | (i16 == 536870912) | (i12 == 67108864);
            Object objM22097O10 = tj3Var6.m22097O();
            if (z20) {
                p84Var2 = p84Var;
            } else {
                p84Var2 = p84Var;
                if (objM22097O10 != p84Var2) {
                    z7 = z;
                }
                e16Var2 = b16Var;
                omd.m18141c((ui3) objM22097O10, e16VarM10007D, false, null, null, ci8.m4703P(1319887655, new c81(3, z7), tj3Var6), tj3Var6, 1572864, 60);
                if (i16 == 536870912) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (i12 == 67108864) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z21 = z8 | z9;
                if (i14 == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z21 | z10;
                objM22097O = tj3Var6.m22097O();
                if (!z11 || objM22097O == p84Var2) {
                    final int i17 = 1;
                    vi3Var5 = vi3Var;
                    ui3 ui3Var2 = new ui3() { // from class: si3
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i18 = i17;
                            xfa xfaVar = xfa.f68157a;
                            int i19 = i;
                            vi3 vi3Var7 = vi3Var4;
                            String str3 = str2;
                            vi3 vi3Var8 = vi3Var5;
                            switch (i18) {
                                case 0:
                                    vi3Var8.invoke(ga7.f40463a);
                                    if (str3 != null) {
                                        vi3Var7.invoke(new gbb(i19 - 5000));
                                    }
                                    break;
                                default:
                                    vi3Var8.invoke(ra7.f58973a);
                                    if (str3 != null) {
                                        vi3Var7.invoke(new ibb(i19 + 5000));
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var6.m22131l0(ui3Var2);
                    objM22097O = ui3Var2;
                } else {
                    vi3Var5 = vi3Var;
                }
                p84 p84Var4 = p84Var2;
                omd.m18141c((ui3) objM22097O, null, false, null, null, iqb.f44442c, tj3Var6, 1572864, 62);
                tj3Var2 = tj3Var6;
                if (z2) {
                    tj3Var2.m22111b0(-1160429680);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(-1160768913);
                    if (i16 == 536870912) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM22097O6 = tj3Var2.m22097O();
                    if (z16 || objM22097O6 == p84Var4) {
                        objM22097O6 = new nw1(vi3Var5, 16);
                        tj3Var2.m22131l0(objM22097O6);
                    }
                    omd.m18141c((ui3) objM22097O6, null, false, null, null, iqb.f44443d, tj3Var2, 1572864, 62);
                    tj3Var2 = tj3Var2;
                    tj3Var2.m22139q(false);
                }
                tj3Var2.m22139q(true);
                e16 e16VarM4412e5 = c99.m4412e(e16Var2, 1.0f);
                sj8 sj8VarM20003a3 = qj8.m20003a(u06Var, fc0Var, tj3Var2, 54);
                int iHashCode5 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m5 = tj3Var2.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e5);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a3);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m5);
                AbstractC3393o1.m17747v(iHashCode5, tj3Var2, zi3Var3, tj3Var2, vi3Var6);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c5);
                if (r4 == 536870912) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objM22097O2 = tj3Var2.m22097O();
                if (z12 || objM22097O2 == p84Var4) {
                    objM22097O2 = new nw1(vi3Var5, 17);
                    tj3Var2.m22131l0(objM22097O2);
                }
                ac7Var2 = ac7Var;
                tj3Var3 = tj3Var2;
                omd.m18141c((ui3) objM22097O2, null, false, null, null, ci8.m4703P(-266096025, new qi3(ac7Var2, 0), tj3Var2), tj3Var3, 1572864, 62);
                if (z3) {
                    tj3Var3.m22111b0(1190260077);
                    jM198b = aa1.m198b(0.1f, p58.m18900f(tj3Var3).f55842a);
                    tj3Var3.m22139q(false);
                } else {
                    tj3Var3.m22111b0(1190372080);
                    tj3Var3.m22139q(false);
                    int i18 = aa1.f413l;
                    jM198b = aa1.f411j;
                }
                e16 e16VarM10007D2 = d32.m10007D(e16Var2, jM198b, p58.m18901i(tj3Var3).f64857c);
                if (r4 == 536870912) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM22097O3 = tj3Var3.m22097O();
                if (z13 || objM22097O3 == p84Var4) {
                    objM22097O3 = new nw1(vi3Var5, 15);
                    tj3Var3.m22131l0(objM22097O3);
                }
                omd.m18141c((ui3) objM22097O3, e16VarM10007D2, false, null, null, iqb.f44444e, tj3Var3, 1572864, 60);
                if (z2) {
                    tj3Var3.m22111b0(1190885285);
                    if (r4 == 536870912) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM22097O5 = tj3Var3.m22097O();
                    if (z15 || objM22097O5 == p84Var4) {
                        objM22097O5 = new nw1(vi3Var5, 18);
                        tj3Var3.m22131l0(objM22097O5);
                    }
                    omd.m18141c((ui3) objM22097O5, null, false, null, null, iqb.f44445f, tj3Var3, 1572864, 62);
                    tj3Var = tj3Var3;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var3.m22111b0(1191324741);
                    if (z4) {
                        tj3Var3.m22111b0(1191416997);
                        jM198b2 = aa1.m198b(0.1f, p58.m18900f(tj3Var3).f55842a);
                        tj3Var3.m22139q(false);
                    } else {
                        tj3Var3.m22111b0(1191536936);
                        tj3Var3.m22139q(false);
                        int i19 = aa1.f413l;
                        jM198b2 = aa1.f411j;
                    }
                    e16 e16VarM10007D3 = d32.m10007D(e16Var2, jM198b2, p58.m18901i(tj3Var3).f64857c);
                    if (r4 == 536870912) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM22097O4 = tj3Var3.m22097O();
                    if (z14 || objM22097O4 == p84Var4) {
                        objM22097O4 = new nw1(vi3Var5, 19);
                        tj3Var3.m22131l0(objM22097O4);
                    }
                    omd.m18141c((ui3) objM22097O4, e16VarM10007D3, false, null, null, iqb.f44446g, tj3Var3, 1572864, 60);
                    tj3Var = tj3Var3;
                    tj3Var.m22139q(false);
                }
                AbstractC3393o1.m17723A(tj3Var, true, true, true);
            }
            z7 = z;
            objM22097O10 = new C3560s4(vi3Var3, str2, vi3Var4, z7);
            tj3Var6.m22131l0(objM22097O10);
            e16Var2 = b16Var;
            omd.m18141c((ui3) objM22097O10, e16VarM10007D, false, null, null, ci8.m4703P(1319887655, new c81(3, z7), tj3Var6), tj3Var6, 1572864, 60);
            if (i16 == 536870912) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (i12 == 67108864) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z22 = z8 | z9;
            if (i14 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z22 | z10;
            objM22097O = tj3Var6.m22097O();
            if (z11) {
                final int i110 = 1;
                vi3Var5 = vi3Var;
                ui3 ui3Var3 = new ui3() { // from class: si3
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i111 = i110;
                        xfa xfaVar = xfa.f68157a;
                        int i112 = i;
                        vi3 vi3Var7 = vi3Var4;
                        String str3 = str2;
                        vi3 vi3Var8 = vi3Var5;
                        switch (i111) {
                            case 0:
                                vi3Var8.invoke(ga7.f40463a);
                                if (str3 != null) {
                                    vi3Var7.invoke(new gbb(i112 - 5000));
                                }
                                break;
                            default:
                                vi3Var8.invoke(ra7.f58973a);
                                if (str3 != null) {
                                    vi3Var7.invoke(new ibb(i112 + 5000));
                                }
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var6.m22131l0(ui3Var3);
                objM22097O = ui3Var3;
            } else {
                final int i111 = 1;
                vi3Var5 = vi3Var;
                ui3 ui3Var4 = new ui3() { // from class: si3
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i112 = i111;
                        xfa xfaVar = xfa.f68157a;
                        int i113 = i;
                        vi3 vi3Var7 = vi3Var4;
                        String str3 = str2;
                        vi3 vi3Var8 = vi3Var5;
                        switch (i112) {
                            case 0:
                                vi3Var8.invoke(ga7.f40463a);
                                if (str3 != null) {
                                    vi3Var7.invoke(new gbb(i113 - 5000));
                                }
                                break;
                            default:
                                vi3Var8.invoke(ra7.f58973a);
                                if (str3 != null) {
                                    vi3Var7.invoke(new ibb(i113 + 5000));
                                }
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var6.m22131l0(ui3Var4);
                objM22097O = ui3Var4;
            }
            p84 p84Var5 = p84Var2;
            omd.m18141c((ui3) objM22097O, null, false, null, null, iqb.f44442c, tj3Var6, 1572864, 62);
            tj3Var2 = tj3Var6;
            if (z2) {
                tj3Var2.m22111b0(-1160768913);
                if (i16 == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM22097O6 = tj3Var2.m22097O();
                if (z16) {
                    objM22097O6 = new nw1(vi3Var5, 16);
                    tj3Var2.m22131l0(objM22097O6);
                } else {
                    objM22097O6 = new nw1(vi3Var5, 16);
                    tj3Var2.m22131l0(objM22097O6);
                }
                omd.m18141c((ui3) objM22097O6, null, false, null, null, iqb.f44443d, tj3Var2, 1572864, 62);
                tj3Var2 = tj3Var2;
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-1160429680);
                tj3Var2.m22139q(false);
            }
            tj3Var2.m22139q(true);
            e16 e16VarM4412e6 = c99.m4412e(e16Var2, 1.0f);
            sj8 sj8VarM20003a4 = qj8.m20003a(u06Var, fc0Var, tj3Var2, 54);
            int iHashCode6 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m6 = tj3Var2.m22132m();
            e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e6);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a4);
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m6);
            AbstractC3393o1.m17747v(iHashCode6, tj3Var2, zi3Var3, tj3Var2, vi3Var6);
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c6);
            if (r4 == 536870912) {
                z12 = true;
            } else {
                z12 = false;
            }
            objM22097O2 = tj3Var2.m22097O();
            if (z12) {
                objM22097O2 = new nw1(vi3Var5, 17);
                tj3Var2.m22131l0(objM22097O2);
            } else {
                objM22097O2 = new nw1(vi3Var5, 17);
                tj3Var2.m22131l0(objM22097O2);
            }
            ac7Var2 = ac7Var;
            tj3Var3 = tj3Var2;
            omd.m18141c((ui3) objM22097O2, null, false, null, null, ci8.m4703P(-266096025, new qi3(ac7Var2, 0), tj3Var2), tj3Var3, 1572864, 62);
            if (z3) {
                tj3Var3.m22111b0(1190260077);
                jM198b = aa1.m198b(0.1f, p58.m18900f(tj3Var3).f55842a);
                tj3Var3.m22139q(false);
            } else {
                tj3Var3.m22111b0(1190372080);
                tj3Var3.m22139q(false);
                int i112 = aa1.f413l;
                jM198b = aa1.f411j;
            }
            e16 e16VarM10007D4 = d32.m10007D(e16Var2, jM198b, p58.m18901i(tj3Var3).f64857c);
            if (r4 == 536870912) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM22097O3 = tj3Var3.m22097O();
            if (z13) {
                objM22097O3 = new nw1(vi3Var5, 15);
                tj3Var3.m22131l0(objM22097O3);
            } else {
                objM22097O3 = new nw1(vi3Var5, 15);
                tj3Var3.m22131l0(objM22097O3);
            }
            omd.m18141c((ui3) objM22097O3, e16VarM10007D4, false, null, null, iqb.f44444e, tj3Var3, 1572864, 60);
            if (z2) {
                tj3Var3.m22111b0(1190885285);
                if (r4 == 536870912) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM22097O5 = tj3Var3.m22097O();
                if (z15) {
                    objM22097O5 = new nw1(vi3Var5, 18);
                    tj3Var3.m22131l0(objM22097O5);
                } else {
                    objM22097O5 = new nw1(vi3Var5, 18);
                    tj3Var3.m22131l0(objM22097O5);
                }
                omd.m18141c((ui3) objM22097O5, null, false, null, null, iqb.f44445f, tj3Var3, 1572864, 62);
                tj3Var = tj3Var3;
                tj3Var.m22139q(false);
            } else {
                tj3Var3.m22111b0(1191324741);
                if (z4) {
                    tj3Var3.m22111b0(1191416997);
                    jM198b2 = aa1.m198b(0.1f, p58.m18900f(tj3Var3).f55842a);
                    tj3Var3.m22139q(false);
                } else {
                    tj3Var3.m22111b0(1191536936);
                    tj3Var3.m22139q(false);
                    int i113 = aa1.f413l;
                    jM198b2 = aa1.f411j;
                }
                e16 e16VarM10007D5 = d32.m10007D(e16Var2, jM198b2, p58.m18901i(tj3Var3).f64857c);
                if (r4 == 536870912) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM22097O4 = tj3Var3.m22097O();
                if (z14) {
                    objM22097O4 = new nw1(vi3Var5, 19);
                    tj3Var3.m22131l0(objM22097O4);
                } else {
                    objM22097O4 = new nw1(vi3Var5, 19);
                    tj3Var3.m22131l0(objM22097O4);
                }
                omd.m18141c((ui3) objM22097O4, e16VarM10007D5, false, null, null, iqb.f44446g, tj3Var3, 1572864, 60);
                tj3Var = tj3Var3;
                tj3Var.m22139q(false);
            }
            AbstractC3393o1.m17723A(tj3Var, true, true, true);
        } else {
            tj3Var = tj3Var4;
            ac7Var2 = ac7Var;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final vi3 vi3Var7 = vi3Var5;
            final e16 e16Var3 = e16Var2;
            x18VarM22143u.f67642d = new zi3() { // from class: ri3
                @Override // p000.zi3
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    hed.m13213a(e16Var3, i, i2, z, z2, z3, z4, ac7Var2, str, vi3Var7, vi3Var2, (ye1) obj2, pk9.m19383z(i3 | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m13214b(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m13215c(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        C3386nv.m17633t(AbstractC3393o1.m17738m(ux5.m23000w("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }
}
