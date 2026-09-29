package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.library.R$drawable;
import com.lingq.feature.library.R$string;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bkd {
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m3814a(e16 e16Var, final boolean z, boolean z2, final boolean z3, ui3 ui3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        final boolean z4;
        int i4;
        ui3 ui3Var2;
        boolean z5;
        boolean z6;
        ui3 ui3Var3;
        x18 x18VarM22143u;
        final ui3 ui3Var4;
        Object objM22097O;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1935491812);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22122h(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 384;
            z4 = z2;
        } else {
            z4 = z2;
            i4 = i3 | (tj3Var.m22122h(z4) ? 256 : 128);
        }
        if ((i & 3072) == 0) {
            i4 |= tj3Var.m22122h(z3) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                ui3Var2 = ui3Var;
                i4 |= tj3Var.m22124i(ui3Var2) ? 16384 : 8192;
            }
            if ((i4 & 9363) != 9362) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (tj3Var.m22099R(i4 & 1, z5)) {
                if (i5 != 0) {
                    z4 = false;
                }
                if (i6 != 0) {
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = new C3288l7(7);
                        tj3Var.m22131l0(objM22097O);
                    }
                    ui3Var4 = (ui3) objM22097O;
                } else {
                    ui3Var4 = ui3Var2;
                }
                r46.m20381f(e16Var, null, null, null, ci8.m4703P(-1850075058, new aj3() { // from class: aa5
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i7;
                        ye1 ye1Var2 = (ye1) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((db1) obj).getClass();
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                            b16 b16Var = b16.f7762a;
                            e16 e16VarM4409b = c99.m4409b(b16Var, 0.0f, 200.0f, 1);
                            long j = p58.m18900f(tj3Var2).f55864l;
                            mv3 mv3Var = ss5.f61356d;
                            e16 e16VarM10007D = d32.m10007D(e16VarM4409b, j, mv3Var);
                            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var2, 48);
                            int iHashCode = Long.hashCode(tj3Var2.f62385T);
                            l77 l77VarM22132m = tj3Var2.m22132m();
                            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM10007D);
                            se1.f60731q.getClass();
                            ui3 ui3Var5 = C0352b.f4299b;
                            tj3Var2.m22119f0();
                            if (tj3Var2.f62384S) {
                                tj3Var2.m22130l(ui3Var5);
                            } else {
                                tj3Var2.m22137o0();
                            }
                            zi3 zi3Var = C0352b.f4303f;
                            oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                            zi3 zi3Var2 = C0352b.f4302e;
                            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            zi3 zi3Var3 = C0352b.f4304g;
                            oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                            vi3 vi3Var = C0352b.f4305h;
                            oha.m18000f(tj3Var2, vi3Var);
                            zi3 zi3Var4 = C0352b.f4301d;
                            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                            e16 e16VarM10007D2 = d32.m10007D(c99.m4414g(c99.m4412e(b16Var, 1.0f), 100.0f), p58.m18900f(tj3Var2).f55873q, mv3Var);
                            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                            int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                            l77 l77VarM22132m2 = tj3Var2.m22132m();
                            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM10007D2);
                            tj3Var2.m22119f0();
                            if (tj3Var2.f62384S) {
                                tj3Var2.m22130l(ui3Var5);
                            } else {
                                tj3Var2.m22137o0();
                            }
                            oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d);
                            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                            AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_empty_library, tj3Var2, 0), null, c99.m4422o(b16Var, 54.0f), null, null, 0.0f, null, tj3Var2, 440, 120);
                            tj3Var2.m22139q(true);
                            e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var2).f38957f, 0.0f, 0.0f, 13), ge9.m12515a(tj3Var2).f38952a, 0.0f, 2);
                            if (z4) {
                                i7 = R$string.library_empty_playlist_message;
                            } else {
                                i7 = z ? R$string.library_empty_lesson_message : R$string.library_empty_course_message;
                            }
                            lw9.m16554b(vz1.m23620a0(tj3Var2, i7), e16VarM21609V, aa1.m198b(0.7f, p58.m18900f(tj3Var2).f55873q), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262136);
                            tj3 tj3Var3 = tj3Var2;
                            if (z3) {
                                tj3Var3.m22111b0(1461061191);
                                e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var3).f38957f, 7);
                                si8 si8Var = p58.m18901i(tj3Var3).f64856b;
                                x17 x17Var = wj0.f66899a;
                                AbstractC0231g.m1148a(ui3Var4, e16VarM21611X, false, si8Var, wj0.m23996a(p58.m18900f(tj3Var3).f55873q, 0L, 0L, tj3Var3, 14), null, null, AbstractC3584sr.m21622e(ge9.m12515a(tj3Var3).f38957f, 0.0f, 2), pyb.f57003a, tj3Var3, 805306368, 356);
                                tj3Var3 = tj3Var3;
                                tj3Var3.m22139q(false);
                            } else {
                                tj3Var3.m22111b0(1462308042);
                                tj3Var3.m22139q(false);
                            }
                            tj3Var3.m22139q(true);
                        } else {
                            tj3Var2.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var), tj3Var, (i4 & 14) | 24576, 14);
                boolean z7 = z4;
                ui3Var3 = ui3Var4;
                z6 = z7;
            } else {
                tj3Var.m22102U();
                z6 = z4;
                ui3Var3 = ui3Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new ba5(e16Var, z, z6, z3, ui3Var3, i, i2);
            }
        }
        i4 |= 24576;
        ui3Var2 = ui3Var;
        if ((i4 & 9363) != 9362) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (tj3Var.m22099R(i4 & 1, z5)) {
            if (i5 != 0) {
                z4 = false;
            }
            if (i6 != 0) {
                objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = new C3288l7(7);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3Var4 = (ui3) objM22097O;
            } else {
                ui3Var4 = ui3Var2;
            }
            r46.m20381f(e16Var, null, null, null, ci8.m4703P(-1850075058, new aj3() { // from class: aa5
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM4409b = c99.m4409b(b16Var, 0.0f, 200.0f, 1);
                        long j = p58.m18900f(tj3Var2).f55864l;
                        mv3 mv3Var = ss5.f61356d;
                        e16 e16VarM10007D = d32.m10007D(e16VarM4409b, j, mv3Var);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var2, 48);
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM10007D);
                        se1.f60731q.getClass();
                        ui3 ui3Var5 = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var5);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                        vi3 vi3Var = C0352b.f4305h;
                        oha.m18000f(tj3Var2, vi3Var);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                        e16 e16VarM10007D2 = d32.m10007D(c99.m4414g(c99.m4412e(b16Var, 1.0f), 100.0f), p58.m18900f(tj3Var2).f55873q, mv3Var);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                        int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m2 = tj3Var2.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM10007D2);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var5);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d);
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                        bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_empty_library, tj3Var2, 0), null, c99.m4422o(b16Var, 54.0f), null, null, 0.0f, null, tj3Var2, 440, 120);
                        tj3Var2.m22139q(true);
                        e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var2).f38957f, 0.0f, 0.0f, 13), ge9.m12515a(tj3Var2).f38952a, 0.0f, 2);
                        if (z4) {
                            i7 = R$string.library_empty_playlist_message;
                        } else {
                            i7 = z ? R$string.library_empty_lesson_message : R$string.library_empty_course_message;
                        }
                        lw9.m16554b(vz1.m23620a0(tj3Var2, i7), e16VarM21609V, aa1.m198b(0.7f, p58.m18900f(tj3Var2).f55873q), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262136);
                        tj3 tj3Var3 = tj3Var2;
                        if (z3) {
                            tj3Var3.m22111b0(1461061191);
                            e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var3).f38957f, 7);
                            si8 si8Var = p58.m18901i(tj3Var3).f64856b;
                            x17 x17Var = wj0.f66899a;
                            AbstractC0231g.m1148a(ui3Var4, e16VarM21611X, false, si8Var, wj0.m23996a(p58.m18900f(tj3Var3).f55873q, 0L, 0L, tj3Var3, 14), null, null, AbstractC3584sr.m21622e(ge9.m12515a(tj3Var3).f38957f, 0.0f, 2), pyb.f57003a, tj3Var3, 805306368, 356);
                            tj3Var3 = tj3Var3;
                            tj3Var3.m22139q(false);
                        } else {
                            tj3Var3.m22111b0(1462308042);
                            tj3Var3.m22139q(false);
                        }
                        tj3Var3.m22139q(true);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, (i4 & 14) | 24576, 14);
            boolean z8 = z4;
            ui3Var3 = ui3Var4;
            z6 = z8;
        } else {
            tj3Var.m22102U();
            z6 = z4;
            ui3Var3 = ui3Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ba5(e16Var, z, z6, z3, ui3Var3, i, i2);
        }
    }
}
