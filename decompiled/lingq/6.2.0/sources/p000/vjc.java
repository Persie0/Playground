package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.C0233h;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.window.AbstractC0454b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.reader.R$drawable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vjc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f65517a = new C0282a(-1223353337, false, new ce1(12));

    /* JADX INFO: renamed from: b */
    public static final C0282a f65518b = new C0282a(813877857, false, new be1(5));

    /* JADX INFO: renamed from: c */
    public static final C0282a f65519c = new C0282a(866215641, false, new ce1(13));

    /* JADX INFO: renamed from: d */
    public static final C0282a f65520d = new C0282a(-1952128119, false, new be1(6));

    /* JADX INFO: renamed from: e */
    public static final C0282a f65521e = new C0282a(-1588661621, false, new be1(7));

    /* JADX INFO: renamed from: f */
    public static final C0282a f65522f = new C0282a(-620936048, false, new ce1(14));

    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x017e  */
    /* JADX WARN: Code duplicated, block: B:64:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m23355a(final int i, final String str, final ui3 ui3Var, e16 e16Var, Integer num, long j, ye1 ye1Var, final int i2, final int i3) {
        e16 e16Var2;
        int i4;
        Integer num2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        final e16 e16Var3;
        final Integer num3;
        final long j2;
        x18 x18VarM22143u;
        b16 b16Var;
        long j3;
        ui3 ui3Var2;
        int i10;
        long j4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(857703142);
        int i11 = (tj3Var.m22116e(i) ? 4 : 2) | i2 | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128);
        int i12 = i3 & 8;
        if (i12 == 0) {
            if ((i2 & 3072) == 0) {
                e16Var2 = e16Var;
                i11 |= tj3Var.m22120g(e16Var2) ? 2048 : 1024;
            }
            i4 = i3 & 16;
            if (i4 != 0) {
                i6 = i11 | 24576;
                num2 = num;
            } else {
                num2 = num;
                if (tj3Var.m22120g(num2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i6 = i11 | i5;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i9 = i6 | 196608;
            } else {
                if (tj3Var.m22118f(j)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i9 = i6 | i8;
            }
            if ((74899 & i9) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i9 & 1, z)) {
                b16Var = b16.f7762a;
                if (i12 != 0) {
                    e16Var2 = b16Var;
                }
                if (i4 != 0) {
                    num2 = null;
                }
                if (i7 != 0) {
                    j3 = aa1.f412k;
                } else {
                    j3 = j;
                }
                e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, ui3Var, c99.m4412e(e16Var2, 1.0f), 15), 16.0f, 12.0f);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
                se1.f60731q.getClass();
                ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                y27 y27VarM18236U = AbstractC3423or.m18236U(i, tj3Var, i9 & 14);
                e16 e16VarM4422o = c99.m4422o(b16Var, 20.0f);
                vh9 vh9Var = ps5.f56764b;
                e16 e16Var4 = e16Var2;
                i10 = i9;
                ty3.m22352b(y27VarM18236U, null, e16VarM4422o, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, tj3Var, 440, 0);
                thb.m22044c(tj3Var, c99.m4426s(b16Var, 16.0f));
                lw9.m16554b(str, new as4(1.0f, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, (i10 >> 3) & 14, 0, 131068);
                tj3Var = tj3Var;
                if (num2 != null) {
                    tj3Var.m22111b0(-1797017333);
                    j4 = j3;
                    ty3.m22352b(AbstractC3423or.m18236U(num2.intValue(), tj3Var, (i10 >> 12) & 14), null, c99.m4422o(b16Var, 20.0f), j4, tj3Var, 440 | ((i10 >> 6) & 7168), 0);
                    tj3Var.m22139q(false);
                } else {
                    j4 = j3;
                    tj3Var.m22111b0(-1796789576);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(true);
                num3 = num2;
                j2 = j4;
                e16Var3 = e16Var4;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                num3 = num2;
                j2 = j;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: ex7
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        vjc.m23355a(i, str, ui3Var, e16Var3, num3, j2, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i11 |= 3072;
        e16Var2 = e16Var;
        i4 = i3 & 16;
        if (i4 != 0) {
            i6 = i11 | 24576;
            num2 = num;
        } else {
            num2 = num;
            if (tj3Var.m22120g(num2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i6 = i11 | i5;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            i9 = i6 | 196608;
        } else {
            if (tj3Var.m22118f(j)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i9 = i6 | i8;
        }
        if ((74899 & i9) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i9 & 1, z)) {
            b16Var = b16.f7762a;
            if (i12 != 0) {
                e16Var2 = b16Var;
            }
            if (i4 != 0) {
                num2 = null;
            }
            if (i7 != 0) {
                j3 = aa1.f412k;
            } else {
                j3 = j;
            }
            e16 e16VarM21608U2 = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, ui3Var, c99.m4412e(e16Var2, 1.0f), 15), 16.0f, 12.0f);
            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21608U2);
            se1.f60731q.getClass();
            ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a2);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
            y27 y27VarM18236U2 = AbstractC3423or.m18236U(i, tj3Var, i9 & 14);
            e16 e16VarM4422o2 = c99.m4422o(b16Var, 20.0f);
            vh9 vh9Var2 = ps5.f56764b;
            e16 e16Var5 = e16Var2;
            i10 = i9;
            ty3.m22352b(y27VarM18236U2, null, e16VarM4422o2, ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55873q, tj3Var, 440, 0);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, 16.0f));
            lw9.m16554b(str, new as4(1.0f, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var2)).f51800b.f71407k, tj3Var, (i10 >> 3) & 14, 0, 131068);
            tj3Var = tj3Var;
            if (num2 != null) {
                tj3Var.m22111b0(-1797017333);
                j4 = j3;
                ty3.m22352b(AbstractC3423or.m18236U(num2.intValue(), tj3Var, (i10 >> 12) & 14), null, c99.m4422o(b16Var, 20.0f), j4, tj3Var, 440 | ((i10 >> 6) & 7168), 0);
                tj3Var.m22139q(false);
            } else {
                j4 = j3;
                tj3Var.m22111b0(-1796789576);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            num3 = num2;
            j2 = j4;
            e16Var3 = e16Var5;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
            num3 = num2;
            j2 = j;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: ex7
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vjc.m23355a(i, str, ui3Var, e16Var3, num3, j2, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m23356b(final boolean z, final String str, final Integer num, final Integer num2, final boolean z2, final boolean z3, final a89 a89Var, final boolean z4, final boolean z5, final boolean z6, final ui3 ui3Var, final ui3 ui3Var2, final ui3 ui3Var3, final ui3 ui3Var4, final ui3 ui3Var5, final ui3 ui3Var6, final ui3 ui3Var7, final ui3 ui3Var8, final ui3 ui3Var9, final ui3 ui3Var10, final ui3 ui3Var11, final ui3 ui3Var12, ye1 ye1Var, final int i, final int i2) {
        ui3 ui3Var13;
        int i3;
        a89Var.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        ui3Var3.getClass();
        ui3Var4.getClass();
        ui3Var5.getClass();
        ui3Var6.getClass();
        ui3Var7.getClass();
        ui3Var8.getClass();
        ui3Var9.getClass();
        ui3Var10.getClass();
        ui3Var11.getClass();
        ui3Var12.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1827199086);
        int i4 = i | (tj3Var.m22122h(z) ? 4 : 2) | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22120g(num) ? 256 : 128) | (tj3Var.m22120g(num2) ? 2048 : 1024) | (tj3Var.m22122h(z2) ? 16384 : 8192) | (tj3Var.m22122h(z3) ? 131072 : 65536);
        if ((i & 1572864) == 0) {
            i4 |= tj3Var.m22120g(a89Var) ? 1048576 : 524288;
        }
        int i5 = i4 | (tj3Var.m22122h(z5) ? 67108864 : 33554432) | (tj3Var.m22122h(z6) ? 536870912 : 268435456);
        int i6 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | (tj3Var.m22124i(ui3Var2) ? 32 : 16) | (tj3Var.m22124i(ui3Var3) ? 256 : 128) | (tj3Var.m22124i(ui3Var4) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var5) ? 16384 : 8192) | (tj3Var.m22124i(ui3Var6) ? 131072 : 65536) | (tj3Var.m22124i(ui3Var7) ? 1048576 : 524288) | (tj3Var.m22124i(ui3Var8) ? 8388608 : 4194304) | (tj3Var.m22124i(ui3Var9) ? 67108864 : 33554432) | (tj3Var.m22124i(ui3Var10) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            ui3Var13 = ui3Var11;
            i3 = i2 | (tj3Var.m22124i(ui3Var13) ? 4 : 2);
        } else {
            ui3Var13 = ui3Var11;
            i3 = i2;
        }
        if (!tj3Var.m22099R(i5 & 1, ((i5 & 302589075) == 302589074 && (i6 & 306783379) == 306783378 && ((i3 | (tj3Var.m22124i(ui3Var12) ? 32 : 16)) & 19) == 18) ? false : true)) {
            tj3Var.m22102U();
        } else if (z) {
            tj3Var.m22111b0(-326644808);
            final ui3 ui3Var14 = ui3Var13;
            AbstractC0454b.m1895a(ui3Var, new ge2(3, false, false), ci8.m4703P(-1879046368, new zi3() { // from class: dx7
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                        Object objM22097O = tj3Var2.m22097O();
                        p84 p84Var = we1.f66679a;
                        if (objM22097O == p84Var) {
                            objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                        }
                        v56 v56Var = (v56) objM22097O;
                        final ui3 ui3Var15 = ui3Var;
                        boolean zM22120g = tj3Var2.m22120g(ui3Var15);
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (zM22120g || objM22097O2 == p84Var) {
                            objM22097O2 = new xa0(28, ui3Var15);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        e16 e16VarM814a = AbstractC0080f.m814a(e16VarM4411d, v56Var, null, false, null, (ui3) objM22097O2, 28);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM814a);
                        se1.f60731q.getClass();
                        ui3 ui3Var16 = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var16);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
                        oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var2, C0352b.f4305h);
                        oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                        e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4428u(b16Var, 0.0f, 400.0f, 1), 30.0f, 0.0f, 2);
                        Object objM22097O3 = tj3Var2.m22097O();
                        if (objM22097O3 == p84Var) {
                            objM22097O3 = new C3288l7(7);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O3, e16VarM21609V, 14);
                        si8 si8VarM22753b = ui8.m22753b(10.0f);
                        mn0 mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var2);
                        C0233h c0233hM22000n = te1.m22000n(62, 12.0f);
                        final ui3 ui3Var17 = ui3Var4;
                        final ui3 ui3Var18 = ui3Var5;
                        final ui3 ui3Var19 = ui3Var6;
                        final boolean z7 = z3;
                        final ui3 ui3Var20 = ui3Var9;
                        final boolean z8 = z5;
                        final boolean z9 = z6;
                        final ui3 ui3Var21 = ui3Var10;
                        final ui3 ui3Var22 = ui3Var7;
                        final boolean z10 = z2;
                        final ui3 ui3Var23 = ui3Var8;
                        final a89 a89Var2 = a89Var;
                        final ui3 ui3Var24 = ui3Var14;
                        final ui3 ui3Var25 = ui3Var12;
                        final Integer num3 = num;
                        final ui3 ui3Var26 = ui3Var2;
                        final String str2 = str;
                        final Integer num4 = num2;
                        final ui3 ui3Var27 = ui3Var3;
                        bq1.m4039O(e16VarM815b, si8VarM22753b, mn0VarM21999m, c0233hM22000n, null, ci8.m4703P(-1865148392, new aj3() { // from class: gx7
                            @Override // p000.aj3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                String strM23620a0;
                                ye1 ye1Var3 = (ye1) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((db1) obj3).getClass();
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                                    int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                                    l77 l77VarM22132m2 = tj3Var3.m22132m();
                                    b16 b16Var2 = b16.f7762a;
                                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, b16Var2);
                                    se1.f60731q.getClass();
                                    ui3 ui3Var28 = C0352b.f4299b;
                                    tj3Var3.m22119f0();
                                    if (tj3Var3.f62384S) {
                                        tj3Var3.m22130l(ui3Var28);
                                    } else {
                                        tj3Var3.m22137o0();
                                    }
                                    zi3 zi3Var = C0352b.f4303f;
                                    oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
                                    zi3 zi3Var2 = C0352b.f4302e;
                                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                                    Integer numValueOf = Integer.valueOf(iHashCode2);
                                    zi3 zi3Var3 = C0352b.f4304g;
                                    oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                                    vi3 vi3Var = C0352b.f4305h;
                                    oha.m18000f(tj3Var3, vi3Var);
                                    zi3 zi3Var4 = C0352b.f4301d;
                                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                                    e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
                                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var3, 48);
                                    int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                                    l77 l77VarM22132m3 = tj3Var3.m22132m();
                                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e);
                                    tj3Var3.m22119f0();
                                    if (tj3Var3.f62384S) {
                                        tj3Var3.m22130l(ui3Var28);
                                    } else {
                                        tj3Var3.m22137o0();
                                    }
                                    oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m3);
                                    AbstractC3393o1.m17747v(iHashCode3, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c3);
                                    if (num3 != null) {
                                        tj3Var3.m22111b0(-817035347);
                                        omd.m18141c(ui3Var26, null, false, null, null, thc.f62331a, tj3Var3, 1572864, 62);
                                        tj3Var3 = tj3Var3;
                                        tj3Var3.m22139q(false);
                                    } else {
                                        tj3Var3.m22111b0(-816531287);
                                        thb.m22044c(tj3Var3, c99.m4422o(b16Var2, 48.0f));
                                        tj3Var3.m22139q(false);
                                    }
                                    tj3 tj3Var4 = tj3Var3;
                                    lw9.m16554b(str2, new as4(1.0f, true), 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 2, false, 1, 0, null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var4, 0, 24960, 109564);
                                    tj3 tj3Var5 = tj3Var4;
                                    if (num4 != null) {
                                        tj3Var5.m22111b0(-815934444);
                                        omd.m18141c(ui3Var27, null, false, null, null, thc.f62332b, tj3Var5, 1572864, 62);
                                        tj3Var5 = tj3Var5;
                                        tj3Var5.m22139q(false);
                                    } else {
                                        tj3Var5.m22111b0(-815437111);
                                        thb.m22044c(tj3Var5, c99.m4422o(b16Var2, 48.0f));
                                        tj3Var5.m22139q(false);
                                    }
                                    tj3Var5.m22139q(true);
                                    pb1.m19031a(0.0f, 6, 6, 0L, tj3Var5, AbstractC3584sr.m21609V(b16Var2, 16.0f, 0.0f, 2));
                                    int i7 = R$drawable.ic_cog_m;
                                    String strM23620a1 = vz1.m23620a0(tj3Var5, R$string.settings_text_settings);
                                    ui3 ui3Var29 = ui3Var15;
                                    boolean zM22120g2 = tj3Var5.m22120g(ui3Var29);
                                    ui3 ui3Var30 = ui3Var17;
                                    boolean zM22120g3 = zM22120g2 | tj3Var5.m22120g(ui3Var30);
                                    Object objM22097O4 = tj3Var5.m22097O();
                                    p84 p84Var2 = we1.f66679a;
                                    if (zM22120g3 || objM22097O4 == p84Var2) {
                                        objM22097O4 = new pn5(ui3Var29, ui3Var30, 6);
                                        tj3Var5.m22131l0(objM22097O4);
                                    }
                                    vjc.m23355a(i7, strM23620a1, (ui3) objM22097O4, null, null, 0L, tj3Var5, 0, 56);
                                    int i8 = R$drawable.ic_refresh_m;
                                    String strM23620a2 = vz1.m23620a0(tj3Var5, R$string.ui_refresh);
                                    boolean zM22120g4 = tj3Var5.m22120g(ui3Var29);
                                    ui3 ui3Var31 = ui3Var18;
                                    boolean zM22120g5 = zM22120g4 | tj3Var5.m22120g(ui3Var31);
                                    Object objM22097O5 = tj3Var5.m22097O();
                                    if (zM22120g5 || objM22097O5 == p84Var2) {
                                        objM22097O5 = new pn5(ui3Var29, ui3Var31, 7);
                                        tj3Var5.m22131l0(objM22097O5);
                                    }
                                    vjc.m23355a(i8, strM23620a2, (ui3) objM22097O5, null, null, 0L, tj3Var5, 0, 56);
                                    int i9 = R$drawable.ic_info_m;
                                    String strM23620a3 = vz1.m23620a0(tj3Var5, R$string.lesson_lesson_info);
                                    boolean zM22120g6 = tj3Var5.m22120g(ui3Var29);
                                    ui3 ui3Var32 = ui3Var19;
                                    boolean zM22120g7 = zM22120g6 | tj3Var5.m22120g(ui3Var32);
                                    Object objM22097O6 = tj3Var5.m22097O();
                                    if (zM22120g7 || objM22097O6 == p84Var2) {
                                        objM22097O6 = new pn5(ui3Var29, ui3Var32, 8);
                                        tj3Var5.m22131l0(objM22097O6);
                                    }
                                    vjc.m23355a(i9, strM23620a3, (ui3) objM22097O6, null, null, 0L, tj3Var5, 0, 56);
                                    if (z7) {
                                        tj3Var5.m22111b0(185859942);
                                        int i10 = com.lingq.core.p012ui.R$drawable.ic_edit_outline;
                                        String strM23620a4 = vz1.m23620a0(tj3Var5, R$string.lesson_sentence_edit);
                                        boolean zM22120g8 = tj3Var5.m22120g(ui3Var29);
                                        ui3 ui3Var33 = ui3Var20;
                                        boolean zM22120g9 = zM22120g8 | tj3Var5.m22120g(ui3Var33);
                                        Object objM22097O7 = tj3Var5.m22097O();
                                        if (zM22120g9 || objM22097O7 == p84Var2) {
                                            objM22097O7 = new pn5(ui3Var29, ui3Var33, 9);
                                            tj3Var5.m22131l0(objM22097O7);
                                        }
                                        vjc.m23355a(i10, strM23620a4, (ui3) objM22097O7, null, null, 0L, tj3Var5, 0, 56);
                                        tj3Var5.m22139q(false);
                                    } else {
                                        tj3Var5.m22111b0(186180916);
                                        tj3Var5.m22139q(false);
                                    }
                                    if (z8) {
                                        tj3Var5.m22111b0(186249395);
                                        boolean z11 = z9;
                                        int i11 = z11 ? com.lingq.core.p012ui.R$drawable.ic_bell_filled_m : com.lingq.core.p012ui.R$drawable.ic_bell_m;
                                        String strM23620a5 = vz1.m23620a0(tj3Var5, z11 ? R$string.course_unsubscribe : R$string.course_subscribe);
                                        boolean zM22120g10 = tj3Var5.m22120g(ui3Var29);
                                        ui3 ui3Var34 = ui3Var21;
                                        boolean zM22120g11 = zM22120g10 | tj3Var5.m22120g(ui3Var34);
                                        Object objM22097O8 = tj3Var5.m22097O();
                                        if (zM22120g11 || objM22097O8 == p84Var2) {
                                            objM22097O8 = new pn5(ui3Var29, ui3Var34, 10);
                                            tj3Var5.m22131l0(objM22097O8);
                                        }
                                        vjc.m23355a(i11, strM23620a5, (ui3) objM22097O8, null, null, 0L, tj3Var5, 0, 56);
                                        tj3Var5.m22139q(false);
                                    } else {
                                        tj3Var5.m22111b0(187019156);
                                        tj3Var5.m22139q(false);
                                    }
                                    int i12 = R$drawable.ic_stats_info_m;
                                    String strM23620a6 = vz1.m23620a0(tj3Var5, com.lingq.feature.reader.R$string.stats_statistics);
                                    boolean zM22120g12 = tj3Var5.m22120g(ui3Var29);
                                    ui3 ui3Var35 = ui3Var22;
                                    boolean zM22120g13 = zM22120g12 | tj3Var5.m22120g(ui3Var35);
                                    Object objM22097O9 = tj3Var5.m22097O();
                                    if (zM22120g13 || objM22097O9 == p84Var2) {
                                        objM22097O9 = new pn5(ui3Var29, ui3Var35, 11);
                                        tj3Var5.m22131l0(objM22097O9);
                                    }
                                    vjc.m23355a(i12, strM23620a6, (ui3) objM22097O9, null, null, 0L, tj3Var5, 0, 56);
                                    if (z10) {
                                        tj3Var5.m22111b0(187351011);
                                        int i13 = R$drawable.ic_grammar_guide_m;
                                        String strM23620a7 = vz1.m23620a0(tj3Var5, R$string.lingq_grammar_resource);
                                        boolean zM22120g14 = tj3Var5.m22120g(ui3Var29);
                                        ui3 ui3Var36 = ui3Var23;
                                        boolean zM22120g15 = zM22120g14 | tj3Var5.m22120g(ui3Var36);
                                        Object objM22097O10 = tj3Var5.m22097O();
                                        if (zM22120g15 || objM22097O10 == p84Var2) {
                                            objM22097O10 = new pn5(ui3Var29, ui3Var36, 3);
                                            tj3Var5.m22131l0(objM22097O10);
                                        }
                                        vjc.m23355a(i13, strM23620a7, (ui3) objM22097O10, null, null, 0L, tj3Var5, 0, 56);
                                        tj3Var5.m22139q(false);
                                    } else {
                                        tj3Var5.m22111b0(187674868);
                                        tj3Var5.m22139q(false);
                                    }
                                    a89 a89Var3 = a89Var2;
                                    q79 q79Var = q79.f57353a;
                                    if (fa4.m11650l(a89Var3, q79Var)) {
                                        tj3Var5.m22111b0(188864276);
                                        tj3Var5.m22139q(false);
                                    } else {
                                        tj3Var5.m22111b0(187785073);
                                        if (fa4.m11650l(a89Var3, s79.f60490a)) {
                                            tj3Var5.m22111b0(-2072149253);
                                            strM23620a0 = vz1.m23620a0(tj3Var5, com.lingq.feature.reader.R$string.lesson_simplify);
                                            tj3Var5.m22139q(false);
                                        } else if (fa4.m11650l(a89Var3, u79.f63521a)) {
                                            tj3Var5.m22111b0(-2072145653);
                                            strM23620a0 = vz1.m23620a0(tj3Var5, com.lingq.feature.reader.R$string.lesson_simplify_menu_processing);
                                            tj3Var5.m22139q(false);
                                        } else if (a89Var3 instanceof y79) {
                                            tj3Var5.m22111b0(-2072141488);
                                            strM23620a0 = vz1.m23620a0(tj3Var5, com.lingq.feature.reader.R$string.lesson_simplify_switch_to_simplified);
                                            tj3Var5.m22139q(false);
                                        } else if (a89Var3 instanceof w79) {
                                            tj3Var5.m22111b0(-2072137170);
                                            strM23620a0 = vz1.m23620a0(tj3Var5, com.lingq.feature.reader.R$string.lesson_simplify_switch_to_original);
                                            tj3Var5.m22139q(false);
                                        } else {
                                            if (!fa4.m11650l(a89Var3, q79Var)) {
                                                throw ux5.m23001x(tj3Var5, -2072151334, false);
                                            }
                                            tj3Var5.m22111b0(188382224);
                                            tj3Var5.m22139q(false);
                                            strM23620a0 = "";
                                        }
                                        String str3 = strM23620a0;
                                        int i14 = R$drawable.ic_simplified_simplify;
                                        int i15 = com.lingq.core.p012ui.R$drawable.ic_ai;
                                        long jM4218k = ((bx2) tj3Var5.m22128k(cx2.f34676a)).m4218k();
                                        boolean zM22120g16 = tj3Var5.m22120g(ui3Var29);
                                        ui3 ui3Var37 = ui3Var24;
                                        boolean zM22120g17 = zM22120g16 | tj3Var5.m22120g(ui3Var37);
                                        Object objM22097O11 = tj3Var5.m22097O();
                                        if (zM22120g17 || objM22097O11 == p84Var2) {
                                            objM22097O11 = new pn5(ui3Var29, ui3Var37, 4);
                                            tj3Var5.m22131l0(objM22097O11);
                                        }
                                        vjc.m23355a(i14, str3, (ui3) objM22097O11, null, Integer.valueOf(i15), jM4218k, tj3Var5, 0, 8);
                                        tj3Var5.m22139q(false);
                                    }
                                    int i16 = R$drawable.ic_help_m;
                                    String strM23620a8 = vz1.m23620a0(tj3Var5, R$string.settings_text_help);
                                    boolean zM22120g18 = tj3Var5.m22120g(ui3Var29);
                                    ui3 ui3Var38 = ui3Var25;
                                    boolean zM22120g19 = zM22120g18 | tj3Var5.m22120g(ui3Var38);
                                    Object objM22097O12 = tj3Var5.m22097O();
                                    if (zM22120g19 || objM22097O12 == p84Var2) {
                                        objM22097O12 = new pn5(ui3Var29, ui3Var38, 5);
                                        tj3Var5.m22131l0(objM22097O12);
                                    }
                                    vjc.m23355a(i16, strM23620a8, (ui3) objM22097O12, AbstractC3584sr.m21611X(b16Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7), null, 0L, tj3Var5, 3072, 48);
                                    tj3Var5.m22139q(true);
                                } else {
                                    tj3Var3.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }, tj3Var2), tj3Var2, 196608, 16);
                        tj3Var2.m22139q(true);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, (i6 & 14) | 432, 0);
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22111b0(-319360428);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: fx7
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    int iM19383z2 = pk9.m19383z(i2);
                    vjc.m23356b(z, str, num, num2, z2, z3, a89Var, z4, z5, z6, ui3Var, ui3Var2, ui3Var3, ui3Var4, ui3Var5, ui3Var6, ui3Var7, ui3Var8, ui3Var9, ui3Var10, ui3Var11, ui3Var12, (ye1) obj, iM19383z, iM19383z2);
                    return xfa.f68157a;
                }
            };
        }
    }
}
