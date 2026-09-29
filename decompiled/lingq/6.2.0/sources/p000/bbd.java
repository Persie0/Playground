package p000;

import android.content.Context;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0279g;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.feature.token.R$string;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bbd {

    /* JADX INFO: renamed from: a */
    public static p04 f8307a;

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:49:0x0168  */
    /* JADX WARN: Code duplicated, block: B:50:0x016a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0174  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0208  */
    /* JADX WARN: Code duplicated, block: B:69:0x0229  */
    /* JADX WARN: Code duplicated, block: B:71:0x028b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0295  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m3598a(f5a f5aVar, boolean z, vi3 vi3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        tj3 tj3Var;
        x18 x18VarM22143u;
        boolean z5;
        b16 b16Var;
        ui3 ui3Var;
        zi3 zi3Var;
        zi3 zi3Var2;
        zi3 zi3Var3;
        vi3 vi3Var2;
        zi3 zi3Var4;
        b16 b16Var2;
        int i4;
        float f;
        tj3 tj3Var2;
        tj3 tj3Var3;
        int i5;
        int i6;
        Object obj;
        boolean z6;
        Object obj2;
        int i7;
        f5aVar.getClass();
        vi3Var.getClass();
        tj3 tj3Var4 = (tj3) ye1Var;
        tj3Var4.m22115d0(-1381233587);
        if ((i & 6) == 0) {
            i3 = (tj3Var4.m22124i(f5aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= tj3Var4.m22122h(z2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (tj3Var4.m22124i(vi3Var)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var4.m22099R(i3 & 1, z3)) {
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var4, 0);
                int iHashCode = Long.hashCode(tj3Var4.f62385T);
                l77 l77VarM22132m = tj3Var4.m22132m();
                b16Var = b16.f7762a;
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var4, b16Var);
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var4.m22119f0();
                if (tj3Var4.f62384S) {
                    tj3Var4.m22130l(ui3Var);
                } else {
                    tj3Var4.m22137o0();
                }
                zi3Var = C0352b.f4303f;
                oha.m18001g(tj3Var4, zi3Var, bb1VarM230a);
                zi3Var2 = C0352b.f4302e;
                oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                zi3Var3 = C0352b.f4304g;
                oha.m18001g(tj3Var4, zi3Var3, numValueOf);
                vi3Var2 = C0352b.f4305h;
                oha.m18000f(tj3Var4, vi3Var2);
                zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c);
                Object obj3 = we1.f66679a;
                if (z5) {
                    tj3Var4.m22111b0(-209393144);
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38965n, 0.0f, 0.0f, 0.0f, 14);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var4, 54);
                    int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m2 = tj3Var4.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, e16VarM21611X);
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var4, zi3Var3, tj3Var4, vi3Var2);
                    oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c2);
                    lw9.m16554b(vz1.m23620a0(tj3Var4, R$string.card_dictionaries), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var4, 0, 0, 131070);
                    if ((i3 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    Object objM22097O = tj3Var4.m22097O();
                    obj2 = objM22097O;
                    if (z6 || objM22097O == obj3) {
                        Object nw1Var = new nw1(vi3Var, 3);
                        tj3Var4.m22131l0(nw1Var);
                        obj2 = nw1Var;
                    }
                    b16Var2 = b16Var;
                    f = 0.0f;
                    AbstractC0231g.m1153f(817889328, 380, null, tj3Var4, (ui3) obj2, ppb.f56639a, c99.m4430w(b16Var2, null, 3), new x17(0.0f, 0.0f, 0.0f, 0.0f), null, false);
                    tj3 tj3Var5 = tj3Var4;
                    tj3Var5.m22139q(true);
                    i4 = 0;
                    tj3Var5.m22139q(false);
                    tj3Var2 = tj3Var5;
                } else {
                    b16Var2 = b16Var;
                    i4 = 0;
                    f = 0.0f;
                    tj3Var4.m22111b0(-208223297);
                    tj3Var4.m22139q(false);
                    tj3Var2 = tj3Var4;
                }
                if (f5aVar.f38489u.isEmpty()) {
                    boolean z7 = i4;
                    tj3Var2.m22111b0(-206929977);
                    String strM23620a0 = vz1.m23620a0(tj3Var2, R$string.card_no_dictionaries_enabled);
                    AbstractC0279g abstractC0279g = ge9.f40637a;
                    tj3 tj3Var6 = tj3Var2;
                    lw9.m16554b(strM23620a0, AbstractC3584sr.m21608U(b16Var2, ((fe9) tj3Var2.m22128k(abstractC0279g)).f38965n, ((fe9) tj3Var2.m22128k(abstractC0279g)).f38952a), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71408l, tj3Var6, 0, 0, 131068);
                    tj3 tj3Var7 = tj3Var6;
                    tj3Var7.m22139q(z7);
                    tj3Var3 = tj3Var7;
                } else {
                    tj3Var2.m22111b0(-208136342);
                    e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
                    AbstractC0279g abstractC0279g2 = ge9.f40637a;
                    x17 x17VarM21622e = AbstractC3584sr.m21622e(((fe9) tj3Var2.m22128k(abstractC0279g2)).f38965n, f, 2);
                    C3661uu c3661uu = new C3661uu(((fe9) tj3Var2.m22128k(abstractC0279g2)).f38952a, true, new gm5(28));
                    boolean zM22124i = tj3Var2.m22124i(f5aVar);
                    if ((i3 & 896) == 256) {
                        i5 = 1;
                    } else {
                        i5 = i4;
                    }
                    i6 = (zM22124i ? 1 : 0) | i5;
                    Object objM22097O2 = tj3Var2.m22097O();
                    obj = objM22097O2;
                    if (i6 == 0 || objM22097O2 == obj3) {
                        Object hf2Var = new hf2(f5aVar, vi3Var, i4);
                        tj3Var2.m22131l0(hf2Var);
                        obj = hf2Var;
                    }
                    fa4.m11643d(e16VarM4412e, null, x17VarM21622e, c3661uu, null, null, false, null, (vi3) obj, tj3Var2, 6, 490);
                    tj3Var2.m22139q(i4);
                    tj3Var3 = tj3Var2;
                }
                tj3Var3.m22139q(true);
                z4 = z5;
                tj3Var = tj3Var3;
            } else {
                tj3Var4.m22102U();
                z4 = z2;
                tj3Var = tj3Var4;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new js1(f5aVar, z4, vi3Var, i, i2);
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i & 384) == 0) {
            if (tj3Var4.m22124i(vi3Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var4.m22099R(i3 & 1, z3)) {
            if (i8 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var4, 0);
            int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
            l77 l77VarM22132m3 = tj3Var4.m22132m();
            b16Var = b16.f7762a;
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, b16Var);
            se1.f60731q.getClass();
            ui3Var = C0352b.f4299b;
            tj3Var4.m22119f0();
            if (tj3Var4.f62384S) {
                tj3Var4.m22130l(ui3Var);
            } else {
                tj3Var4.m22137o0();
            }
            zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var4, zi3Var, bb1VarM230a2);
            zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m3);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var4, zi3Var3, numValueOf2);
            vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var4, vi3Var2);
            zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c3);
            Object obj4 = we1.f66679a;
            if (z5) {
                tj3Var4.m22111b0(-209393144);
                e16 e16VarM21611X2 = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38965n, 0.0f, 0.0f, 0.0f, 14);
                sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var4, 54);
                int iHashCode4 = Long.hashCode(tj3Var4.f62385T);
                l77 l77VarM22132m4 = tj3Var4.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var4, e16VarM21611X2);
                tj3Var4.m22119f0();
                if (tj3Var4.f62384S) {
                    tj3Var4.m22130l(ui3Var);
                } else {
                    tj3Var4.m22137o0();
                }
                oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a2);
                oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var4, zi3Var3, tj3Var4, vi3Var2);
                oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c4);
                lw9.m16554b(vz1.m23620a0(tj3Var4, R$string.card_dictionaries), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var4, 0, 0, 131070);
                if ((i3 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Object objM22097O3 = tj3Var4.m22097O();
                obj2 = objM22097O3;
                if (z6) {
                    Object nw1Var2 = new nw1(vi3Var, 3);
                    tj3Var4.m22131l0(nw1Var2);
                    obj2 = nw1Var2;
                } else {
                    Object nw1Var3 = new nw1(vi3Var, 3);
                    tj3Var4.m22131l0(nw1Var3);
                    obj2 = nw1Var3;
                }
                b16Var2 = b16Var;
                f = 0.0f;
                AbstractC0231g.m1153f(817889328, 380, null, tj3Var4, (ui3) obj2, ppb.f56639a, c99.m4430w(b16Var2, null, 3), new x17(0.0f, 0.0f, 0.0f, 0.0f), null, false);
                tj3 tj3Var8 = tj3Var4;
                tj3Var8.m22139q(true);
                i4 = 0;
                tj3Var8.m22139q(false);
                tj3Var2 = tj3Var8;
            } else {
                b16Var2 = b16Var;
                i4 = 0;
                f = 0.0f;
                tj3Var4.m22111b0(-208223297);
                tj3Var4.m22139q(false);
                tj3Var2 = tj3Var4;
            }
            if (f5aVar.f38489u.isEmpty()) {
                tj3Var2.m22111b0(-208136342);
                e16 e16VarM4412e2 = c99.m4412e(b16Var2, 1.0f);
                AbstractC0279g abstractC0279g3 = ge9.f40637a;
                x17 x17VarM21622e2 = AbstractC3584sr.m21622e(((fe9) tj3Var2.m22128k(abstractC0279g3)).f38965n, f, 2);
                C3661uu c3661uu2 = new C3661uu(((fe9) tj3Var2.m22128k(abstractC0279g3)).f38952a, true, new gm5(28));
                boolean zM22124i2 = tj3Var2.m22124i(f5aVar);
                if ((i3 & 896) == 256) {
                    i5 = 1;
                } else {
                    i5 = i4;
                }
                i6 = (zM22124i2 ? 1 : 0) | i5;
                Object objM22097O4 = tj3Var2.m22097O();
                obj = objM22097O4;
                if (i6 == 0) {
                    Object hf2Var2 = new hf2(f5aVar, vi3Var, i4);
                    tj3Var2.m22131l0(hf2Var2);
                    obj = hf2Var2;
                } else {
                    Object hf2Var3 = new hf2(f5aVar, vi3Var, i4);
                    tj3Var2.m22131l0(hf2Var3);
                    obj = hf2Var3;
                }
                fa4.m11643d(e16VarM4412e2, null, x17VarM21622e2, c3661uu2, null, null, false, null, (vi3) obj, tj3Var2, 6, 490);
                tj3Var2.m22139q(i4);
                tj3Var3 = tj3Var2;
            } else {
                boolean z8 = i4;
                tj3Var2.m22111b0(-206929977);
                String strM23620a1 = vz1.m23620a0(tj3Var2, R$string.card_no_dictionaries_enabled);
                AbstractC0279g abstractC0279g4 = ge9.f40637a;
                tj3 tj3Var9 = tj3Var2;
                lw9.m16554b(strM23620a1, AbstractC3584sr.m21608U(b16Var2, ((fe9) tj3Var2.m22128k(abstractC0279g4)).f38965n, ((fe9) tj3Var2.m22128k(abstractC0279g4)).f38952a), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71408l, tj3Var9, 0, 0, 131068);
                tj3 tj3Var10 = tj3Var9;
                tj3Var10.m22139q(z8);
                tj3Var3 = tj3Var10;
            }
            tj3Var3.m22139q(true);
            z4 = z5;
            tj3Var = tj3Var3;
        } else {
            tj3Var4.m22102U();
            z4 = z2;
            tj3Var = tj3Var4;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new js1(f5aVar, z4, vi3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3599b(DictionaryData dictionaryData, boolean z, vi3 vi3Var, ye1 ye1Var, int i) {
        dictionaryData.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1052258213);
        int i2 = (tj3Var.m22124i(dictionaryData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22122h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM4431x = c99.m4431x(b16.f7762a);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            mn0 mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55822G, 0L, tj3Var);
            boolean zM22124i = tj3Var.m22124i(dictionaryData) | ((i2 & 896) == 256);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ff2(vi3Var, dictionaryData, 0);
                tj3Var.m22131l0(objM22097O);
            }
            r46.m20380e(e16VarM4431x, si8Var, null, mn0VarM21999m, (ui3) objM22097O, ci8.m4703P(309216942, new gf2(dictionaryData, z, context), tj3Var), tj3Var, 196614, 4);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3493qd(dictionaryData, z, vi3Var, i, 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final p04 m3600c() {
        p04 p04Var = f8307a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57VarM17730e = AbstractC3393o1.m17730e(12.0f, 4.0f);
        f57VarM17730e.m11547b(7.0f, 4.0f, 2.73f, 7.11f, 1.0f, 11.5f);
        f57VarM17730e.m11547b(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
        f57VarM17730e.m11555j(9.27f, -3.11f, 11.0f, -7.5f);
        f57VarM17730e.m11547b(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(12.0f, 16.5f);
        f57VarM17730e.m11548c(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        f57VarM17730e.m11555j(2.24f, -5.0f, 5.0f, -5.0f);
        f57VarM17730e.m11555j(5.0f, 2.24f, 5.0f, 5.0f);
        f57VarM17730e.m11555j(-2.24f, 5.0f, -5.0f, 5.0f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(12.0f, 8.5f);
        f57VarM17730e.m11548c(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        f57VarM17730e.m11555j(1.34f, 3.0f, 3.0f, 3.0f);
        f57VarM17730e.m11555j(3.0f, -1.34f, 3.0f, -3.0f);
        f57VarM17730e.m11555j(-1.34f, -3.0f, -3.0f, -3.0f);
        f57VarM17730e.m11546a();
        o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f8307a = p04VarM17721b;
        return p04VarM17721b;
    }
}
