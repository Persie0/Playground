package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.designsystem.R$drawable;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.feature.challenges.AbstractC1985e;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xh3 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68197a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f68198b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f68199c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f68200d;

    public /* synthetic */ xh3(Object obj, Object obj2, boolean z, int i) {
        this.f68197a = i;
        this.f68200d = obj;
        this.f68199c = obj2;
        this.f68198b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [boolean, int] */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b16 b16Var;
        ?? r14;
        C3419on c3419on;
        long j;
        int i = this.f68197a;
        Object obj4 = we1.f66679a;
        b16 b16Var2 = b16.f7762a;
        boolean z = this.f68198b;
        xfa xfaVar = xfa.f68157a;
        Object obj5 = this.f68199c;
        Object obj6 = this.f68200d;
        switch (i) {
            case 0:
                li3 li3Var = (li3) obj6;
                vi3 vi3Var = (vi3) obj5;
                t17 t17Var = (t17) obj;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e16 e16VarM4411d = c99.m4411d(b16Var2, 1.0f);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4411d);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var, zi3Var3, numValueOf);
                    vi3 vi3Var2 = C0352b.f4305h;
                    oha.m18000f(tj3Var, vi3Var2);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
                    e16 e16VarM4428u = c99.m4428u(c99.m4410c(b16Var2, 1.0f), 0.0f, 600.0f, 1);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4428u);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var2);
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                    e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4411d(b16Var2, 1.0f), t17Var);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(e16VarM21606S, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 2), 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 0.0f, 0.0f, 13);
                    ec0 ec0Var = nj0.f52792K;
                    boolean zM22122h = tj3Var.m22122h(z) | tj3Var.m22124i(li3Var) | tj3Var.m22120g(vi3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22122h || objM22097O == obj4) {
                        objM22097O = new fi3(z, li3Var, vi3Var, 0);
                        tj3Var.m22131l0(objM22097O);
                    }
                    fa4.m11642c(e16VarM21611X, null, null, null, ec0Var, null, false, null, (vi3) objM22097O, tj3Var, 196608, 478);
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(true);
                } else {
                    tj3Var.m22102U();
                }
                break;
            case 1:
                en4 en4Var = (en4) obj6;
                final vi3 vi3Var3 = (vi3) obj5;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    b16 b16Var3 = b16.f7762a;
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var3, 1.0f), ge9.m12515a(tj3Var2).f38956e, ge9.m12515a(tj3Var2).f38957f);
                    bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                    int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m3 = tj3Var2.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16VarM21608U);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var2);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a2);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m3);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c3);
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(d32.m10007D(pb1.m19045o(b16Var3, p58.m18901i(tj3Var2).f64856b), p58.m18900f(tj3Var2).f55874r, ss5.f61356d), ge9.m12515a(tj3Var2).f38952a);
                    int i2 = en4Var.f37560a;
                    List<dn4> list = en4Var.f37563d;
                    int i3 = en4Var.f37561b;
                    int i4 = en4Var.f37562c;
                    String upperCase = vz1.m23620a0(tj3Var2, i2).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    lw9.m16554b(upperCase, e16VarM21607T, p58.m18900f(tj3Var2).f55858i, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71407k, tj3Var2, 0, 0, 131064);
                    if (i3 != -1) {
                        tj3Var2.m22111b0(184869033);
                        thb.m22044c(tj3Var2, c99.m4414g(b16Var3, ge9.m12515a(tj3Var2).f38952a));
                        lw9.m16554b(vz1.m23620a0(tj3Var2, i3), null, p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71402f, tj3Var2, 0, 0, 131066);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(185191929);
                        tj3Var2.m22139q(false);
                    }
                    if (i4 != -1) {
                        tj3Var2.m22111b0(185314782);
                        thb.m22044c(tj3Var2, c99.m4414g(b16Var3, ge9.m12515a(tj3Var2).f38952a));
                        if (list.isEmpty()) {
                            tj3Var2.m22111b0(185401210);
                            StringBuilder sb = new StringBuilder(16);
                            new ArrayList();
                            ArrayList arrayList = new ArrayList();
                            new ArrayList();
                            sb.append(vz1.m23620a0(tj3Var2, i4));
                            String string = sb.toString();
                            ArrayList arrayList2 = new ArrayList(arrayList.size());
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                arrayList2.add(((C3304ln) arrayList.get(i5)).m16392a(sb.length()));
                            }
                            C3419on c3419on2 = new C3419on(string, arrayList2);
                            tj3Var2.m22139q(false);
                            b16Var = b16Var3;
                            c3419on = c3419on2;
                        } else {
                            tj3Var2.m22111b0(185614645);
                            String strM23620a0 = vz1.m23620a0(tj3Var2, i4);
                            StringBuilder sb2 = new StringBuilder(16);
                            new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            new ArrayList();
                            sb2.append(cl9.m4839V(strM23620a0, "**link**", ""));
                            tj3Var2.m22111b0(-132551247);
                            int length = 0;
                            for (final dn4 dn4Var : list) {
                                String strSubstring = strM23620a0.substring(length, strM23620a0.length());
                                String strM23371G0 = vk9.m23371G0(vk9.m23368D0(strSubstring, "**link**", strSubstring), "**link**");
                                String str = dn4Var + " " + length;
                                boolean zM22120g = tj3Var2.m22120g(vi3Var3) | tj3Var2.m22120g(dn4Var);
                                Object objM22097O2 = tj3Var2.m22097O();
                                if (zM22120g || objM22097O2 == obj4) {
                                    objM22097O2 = new ge5() { // from class: fo4
                                        @Override // p000.ge5
                                        /* JADX INFO: renamed from: a */
                                        public final void mo11967a(fe5 fe5Var) {
                                            fe5Var.getClass();
                                            vi3Var3.invoke(dn4Var);
                                        }
                                    };
                                    tj3Var2.m22131l0(objM22097O2);
                                }
                                arrayList3.add(new C3304ln(new de5(str, null, (ge5) objM22097O2), vk9.m23389l0(strM23620a0, strM23371G0, length, false, 4) - 8, strM23371G0.length() + (vk9.m23389l0(strM23620a0, strM23371G0, length, false, 4) - 8), 8));
                                arrayList3.add(new C3304ln(new he9(((bx2) tj3Var2.m22128k(cx2.f34676a)).m4208a(), 0L, bc3.f8322h, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530), vk9.m23389l0(strM23620a0, strM23371G0, length, false, 4) - 8, strM23371G0.length() + (vk9.m23389l0(strM23620a0, strM23371G0, length, false, 4) - 8), 8));
                                length = strM23371G0.length() + vk9.m23389l0(strM23620a0, strM23371G0, length, false, 4);
                                b16Var3 = b16Var3;
                            }
                            b16Var = b16Var3;
                            tj3Var2.m22139q(false);
                            String string2 = sb2.toString();
                            ArrayList arrayList4 = new ArrayList(arrayList3.size());
                            int size2 = arrayList3.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                arrayList4.add(((C3304ln) arrayList3.get(i6)).m16392a(sb2.length()));
                            }
                            C3419on c3419on3 = new C3419on(string2, arrayList4);
                            tj3Var2.m22139q(false);
                            c3419on = c3419on3;
                        }
                        vh9 vh9Var = ps5.f56764b;
                        lw9.m16555c(c3419on, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71406j, tj3Var2, 0, 0, 262138);
                        r14 = 0;
                        tj3Var2.m22139q(false);
                    } else {
                        b16Var = b16Var3;
                        r14 = 0;
                        tj3Var2.m22111b0(187524121);
                        tj3Var2.m22139q(false);
                    }
                    if (z) {
                        tj3Var2.m22111b0(187574620);
                        y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_lingq, tj3Var2, r14);
                        zf1 zf1Var2 = ge9.f40637a;
                        bq1.m4042R(y27VarM18236U, null, c99.m4422o(AbstractC3584sr.m21609V(AbstractC3584sr.m21611X(b16Var, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var2)).f38957f, 0.0f, 0.0f, 13), 0.0f, ((fe9) tj3Var2.m22128k(zf1Var2)).f38957f, 1), 48.0f).mo3161g(new gv3(nj0.f52792K)), null, null, 0.0f, new qd0(5, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55875s), tj3Var2, 56, 56);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(188125273);
                        tj3Var2.m22139q(r14);
                    }
                    tj3Var2.m22139q(true);
                } else {
                    tj3Var2.m22102U();
                }
                break;
            case 2:
                qn4 qn4Var = (qn4) obj6;
                rn4 rn4Var = (rn4) obj5;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((vv4) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zf1 zf1Var3 = ge9.f40637a;
                    bb1 bb1VarM230a3 = ab1.m230a(new C3661uu(((fe9) tj3Var3.m22128k(zf1Var3)).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var3, 0);
                    int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m4 = tj3Var3.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, b16Var2);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a3);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m4);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode4));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c4);
                    cid.m4758i(vz1.m23620a0(tj3Var3, R$string.lingq_challenges), vz1.m23620a0(tj3Var3, com.lingq.feature.statistics.R$string.lingq_view_all), qn4Var.f57984j, tj3Var3, 0);
                    ws1 ws1Var = rn4Var.f59587i;
                    if (ws1Var == null) {
                        tj3Var3.m22111b0(868204084);
                        tj3Var3.m22139q(false);
                    } else {
                        tj3Var3.m22111b0(868204085);
                        ui3 ui3Var4 = qn4Var.f57982h;
                        AbstractC1985e.m8850b(ws1Var, ui3Var4, ui3Var4, null, tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    }
                    if (z) {
                        tj3Var3.m22111b0(868509683);
                        cid.m4757h(rn4Var.f59585g, qn4Var.f57983i, tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    } else {
                        tj3Var3.m22111b0(868738401);
                        tj3Var3.m22139q(false);
                    }
                    ux5.m23003z(b16Var2, ((fe9) tj3Var3.m22128k(zf1Var3)).f38963l, tj3Var3, true);
                } else {
                    tj3Var3.m22102U();
                }
                break;
            case 3:
                ui3 ui3Var5 = (ui3) obj6;
                ui3 ui3Var6 = (ui3) obj5;
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e16 e16VarM21607T2 = AbstractC3584sr.m21607T(c99.m4412e(b16Var2, 1.0f), ge9.m12515a(tj3Var4).f38954c);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var4, 48);
                    int iHashCode5 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m5 = tj3Var4.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var4, e16VarM21607T2);
                    se1.f60731q.getClass();
                    ui3 ui3Var7 = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var7);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    zi3 zi3Var5 = C0352b.f4303f;
                    oha.m18001g(tj3Var4, zi3Var5, sj8VarM20003a);
                    zi3 zi3Var6 = C0352b.f4302e;
                    oha.m18001g(tj3Var4, zi3Var6, l77VarM22132m5);
                    Integer numValueOf2 = Integer.valueOf(iHashCode5);
                    zi3 zi3Var7 = C0352b.f4304g;
                    oha.m18001g(tj3Var4, zi3Var7, numValueOf2);
                    vi3 vi3Var4 = C0352b.f4305h;
                    oha.m18000f(tj3Var4, vi3Var4);
                    zi3 zi3Var8 = C0352b.f4301d;
                    oha.m18001g(tj3Var4, zi3Var8, e16VarM1322c5);
                    gc0 gc0Var = nj0.f52812g;
                    if (1.0f <= 0.0d) {
                        g54.m12362a("invalid weight; must be greater than zero");
                    }
                    e16 e16VarM815b = AbstractC0080f.m815b(null, z, ui3Var5, pb1.m19045o(new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), p58.m18901i(tj3Var4).f64859e), 14);
                    ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                    int iHashCode6 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m6 = tj3Var4.m22132m();
                    e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var4, e16VarM815b);
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var7);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, zi3Var5, ht5VarM19966d2);
                    oha.m18001g(tj3Var4, zi3Var6, l77VarM22132m6);
                    AbstractC3393o1.m17747v(iHashCode6, tj3Var4, zi3Var7, tj3Var4, vi3Var4);
                    oha.m18001g(tj3Var4, zi3Var8, e16VarM1322c6);
                    final e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var2, 1.0f), 0.0f, ge9.m12515a(tj3Var4).f38952a, 1);
                    if (z) {
                        tj3Var4.m22111b0(1569626991);
                        String strM23620a1 = vz1.m23620a0(tj3Var4, R$string.upgrade_premium);
                        vx9 vx9Var = p58.m18902j(tj3Var4).f71406j;
                        tj3Var4 = tj3Var4;
                        lw9.m16554b(strM23620a1, e16VarM21609V, p58.m18900f(tj3Var4).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var, tj3Var4, 0, 0, 130040);
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(1568703253);
                        final int i7 = 0;
                        bq1.m4039O(c99.m4412e(b16Var2, 1.0f), p58.m18901i(tj3Var4).f64859e, te1.m21999m(0, 14, p58.m18900f(tj3Var4).f55872p, 0L, tj3Var4), te1.m22000n(62, 2.0f), null, ci8.m4703P(-170453433, new aj3() { // from class: dg7
                            @Override // p000.aj3
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                int i8 = i7;
                                xfa xfaVar2 = xfa.f68157a;
                                switch (i8) {
                                    case 0:
                                        ye1 ye1Var5 = (ye1) obj8;
                                        int iIntValue5 = ((Integer) obj9).intValue();
                                        ((db1) obj7).getClass();
                                        tj3 tj3Var5 = (tj3) ye1Var5;
                                        if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                            tj3Var5.m22102U();
                                        } else {
                                            String strM23620a2 = vz1.m23620a0(tj3Var5, R$string.upgrade_premium);
                                            vh9 vh9Var2 = ps5.f56764b;
                                            lw9.m16554b(strM23620a2, e16VarM21609V, ((ms5) tj3Var5.m22128k(vh9Var2)).f51799a.f55873q, null, 0L, null, bc3.f8322h, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var5.m22128k(vh9Var2)).f51800b.f71406j, tj3Var5, 1572864, 0, 129976);
                                        }
                                        break;
                                    default:
                                        ye1 ye1Var6 = (ye1) obj8;
                                        int iIntValue6 = ((Integer) obj9).intValue();
                                        ((db1) obj7).getClass();
                                        tj3 tj3Var6 = (tj3) ye1Var6;
                                        if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                            tj3Var6.m22102U();
                                        } else {
                                            String strM23620a3 = vz1.m23620a0(tj3Var6, com.lingq.core.premium.R$string.upgrade_plus);
                                            vh9 vh9Var3 = ps5.f56764b;
                                            lw9.m16554b(strM23620a3, e16VarM21609V, ((ms5) tj3Var6.m22128k(vh9Var3)).f51799a.f55873q, null, 0L, null, bc3.f8322h, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var6.m22128k(vh9Var3)).f51800b.f71406j, tj3Var6, 1572864, 0, 129976);
                                        }
                                        break;
                                }
                                return xfaVar2;
                            }
                        }, tj3Var4), tj3Var4, 196614, 16);
                        tj3Var4.m22139q(false);
                    }
                    tj3Var4.m22139q(true);
                    if (1.0f <= 0.0d) {
                        g54.m12362a("invalid weight; must be greater than zero");
                    }
                    e16 e16VarM815b2 = AbstractC0080f.m815b(null, !z, ui3Var6, pb1.m19045o(new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), p58.m18901i(tj3Var4).f64859e), 14);
                    ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var, false);
                    int iHashCode7 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m7 = tj3Var4.m22132m();
                    e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var4, e16VarM815b2);
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var7);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, zi3Var5, ht5VarM19966d3);
                    oha.m18001g(tj3Var4, zi3Var6, l77VarM22132m7);
                    AbstractC3393o1.m17747v(iHashCode7, tj3Var4, zi3Var7, tj3Var4, vi3Var4);
                    oha.m18001g(tj3Var4, zi3Var8, e16VarM1322c7);
                    final e16 e16VarM21609V2 = AbstractC3584sr.m21609V(c99.m4412e(b16Var2, 1.0f), 0.0f, ge9.m12515a(tj3Var4).f38952a, 1);
                    if (z) {
                        tj3Var4.m22111b0(92534609);
                        tj3 tj3Var5 = tj3Var4;
                        final int i8 = 1;
                        bq1.m4039O(c99.m4412e(b16Var2, 1.0f), p58.m18901i(tj3Var4).f64859e, te1.m21999m(0, 14, p58.m18900f(tj3Var4).f55872p, 0L, tj3Var5), te1.m22000n(62, 2.0f), null, ci8.m4703P(721885232, new aj3() { // from class: dg7
                            @Override // p000.aj3
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                int i9 = i8;
                                xfa xfaVar2 = xfa.f68157a;
                                switch (i9) {
                                    case 0:
                                        ye1 ye1Var5 = (ye1) obj8;
                                        int iIntValue5 = ((Integer) obj9).intValue();
                                        ((db1) obj7).getClass();
                                        tj3 tj3Var6 = (tj3) ye1Var5;
                                        if (!tj3Var6.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                            tj3Var6.m22102U();
                                        } else {
                                            String strM23620a2 = vz1.m23620a0(tj3Var6, R$string.upgrade_premium);
                                            vh9 vh9Var2 = ps5.f56764b;
                                            lw9.m16554b(strM23620a2, e16VarM21609V2, ((ms5) tj3Var6.m22128k(vh9Var2)).f51799a.f55873q, null, 0L, null, bc3.f8322h, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var6.m22128k(vh9Var2)).f51800b.f71406j, tj3Var6, 1572864, 0, 129976);
                                        }
                                        break;
                                    default:
                                        ye1 ye1Var6 = (ye1) obj8;
                                        int iIntValue6 = ((Integer) obj9).intValue();
                                        ((db1) obj7).getClass();
                                        tj3 tj3Var7 = (tj3) ye1Var6;
                                        if (!tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                            tj3Var7.m22102U();
                                        } else {
                                            String strM23620a3 = vz1.m23620a0(tj3Var7, com.lingq.core.premium.R$string.upgrade_plus);
                                            vh9 vh9Var3 = ps5.f56764b;
                                            lw9.m16554b(strM23620a3, e16VarM21609V2, ((ms5) tj3Var7.m22128k(vh9Var3)).f51799a.f55873q, null, 0L, null, bc3.f8322h, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(vh9Var3)).f51800b.f71406j, tj3Var7, 1572864, 0, 129976);
                                        }
                                        break;
                                }
                                return xfaVar2;
                            }
                        }, tj3Var4), tj3Var5, 196614, 16);
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(93453387);
                        lw9.m16554b(vz1.m23620a0(tj3Var4, com.lingq.core.premium.R$string.upgrade_plus), e16VarM21609V2, p58.m18900f(tj3Var4).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var4).f71406j, tj3Var4, 0, 0, 130040);
                        tj3Var4.m22139q(false);
                    }
                    tj3Var4.m22139q(true);
                    tj3Var4.m22139q(true);
                } else {
                    tj3Var4.m22102U();
                }
                break;
            case 4:
                ((Integer) obj3).getClass();
                la9.f49371a.m16045a((v56) obj6, null, (fa9) obj5, this.f68198b, 0L, (ye1) obj2, 196608, 18);
                break;
            case 5:
                f5a f5aVar = (f5a) obj6;
                vi3 vi3Var5 = (vi3) obj5;
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var6 = (tj3) ye1Var5;
                if (tj3Var6.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    zf1 zf1Var4 = ge9.f40637a;
                    float f = ((fe9) tj3Var6.m22128k(zf1Var4)).f38965n;
                    float f2 = ((fe9) tj3Var6.m22128k(zf1Var4)).f38963l;
                    b16 b16Var4 = b16.f7762a;
                    e16 e16VarM21608U2 = AbstractC3584sr.m21608U(b16Var4, f, f2);
                    bb1 bb1VarM230a4 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var6, 0);
                    int iHashCode8 = Long.hashCode(tj3Var6.f62385T);
                    l77 l77VarM22132m8 = tj3Var6.m22132m();
                    e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var6, e16VarM21608U2);
                    se1.f60731q.getClass();
                    ui3 ui3Var8 = C0352b.f4299b;
                    tj3Var6.m22119f0();
                    if (tj3Var6.f62384S) {
                        tj3Var6.m22130l(ui3Var8);
                    } else {
                        tj3Var6.m22137o0();
                    }
                    oha.m18001g(tj3Var6, C0352b.f4303f, bb1VarM230a4);
                    oha.m18001g(tj3Var6, C0352b.f4302e, l77VarM22132m8);
                    oha.m18001g(tj3Var6, C0352b.f4304g, Integer.valueOf(iHashCode8));
                    oha.m18000f(tj3Var6, C0352b.f4305h);
                    oha.m18001g(tj3Var6, C0352b.f4301d, e16VarM1322c8);
                    if (!f5aVar.f38479k || z) {
                        tj3Var6.m22111b0(-1924897101);
                        tj3Var6.m22139q(false);
                    } else {
                        tj3Var6.m22111b0(-1925311292);
                        e16 e16VarM4414g = c99.m4414g(c99.m4426s(AbstractC3584sr.m21609V(new gv3(nj0.f52792K), 0.0f, ((fe9) tj3Var6.m22128k(zf1Var4)).f38955d, 1), 80.0f), 4.0f);
                        long j2 = ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51799a.f55816A;
                        si8 si8Var = ui8.f63972a;
                        qh0.m19963a(pb1.m19045o(d32.m10007D(e16VarM4414g, j2, si8Var), si8Var), tj3Var6, 0);
                        tj3Var6.m22139q(false);
                    }
                    w7d.m23811f(f5aVar, z, vi3Var5, tj3Var6, 0);
                    pb1.m19031a(0.0f, 0, 6, 0L, tj3Var6, AbstractC3584sr.m21611X(b16Var4, 0.0f, ((fe9) tj3Var6.m22128k(zf1Var4)).f38952a, 0.0f, 0.0f, 13));
                    AbstractC1899b.m8700i(f5aVar, z, vi3Var5, tj3Var6, 0);
                    tj3Var6.m22139q(true);
                } else {
                    tj3Var6.m22102U();
                }
                break;
            case 6:
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var7 = (tj3) ye1Var6;
                if (tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    e16 e16VarM21607T3 = AbstractC3584sr.m21607T(c99.m4412e(b16Var2, 1.0f), ge9.m12515a(tj3Var7).f38957f);
                    sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var7, 48);
                    int iHashCode9 = Long.hashCode(tj3Var7.f62385T);
                    l77 l77VarM22132m9 = tj3Var7.m22132m();
                    e16 e16VarM1322c9 = AbstractC0287b.m1322c(tj3Var7, e16VarM21607T3);
                    se1.f60731q.getClass();
                    ui3 ui3Var9 = C0352b.f4299b;
                    tj3Var7.m22119f0();
                    if (tj3Var7.f62384S) {
                        tj3Var7.m22130l(ui3Var9);
                    } else {
                        tj3Var7.m22137o0();
                    }
                    zi3 zi3Var9 = C0352b.f4303f;
                    oha.m18001g(tj3Var7, zi3Var9, sj8VarM20003a2);
                    zi3 zi3Var10 = C0352b.f4302e;
                    oha.m18001g(tj3Var7, zi3Var10, l77VarM22132m9);
                    Integer numValueOf3 = Integer.valueOf(iHashCode9);
                    zi3 zi3Var11 = C0352b.f4304g;
                    oha.m18001g(tj3Var7, zi3Var11, numValueOf3);
                    vi3 vi3Var6 = C0352b.f4305h;
                    oha.m18000f(tj3Var7, vi3Var6);
                    zi3 zi3Var12 = C0352b.f4301d;
                    as4 as4VarM10871c = e65.m10871c(tj3Var7, e16VarM1322c9, zi3Var12, 1.0f, true);
                    bb1 bb1VarM230a5 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var7, 0);
                    int iHashCode10 = Long.hashCode(tj3Var7.f62385T);
                    l77 l77VarM22132m10 = tj3Var7.m22132m();
                    e16 e16VarM1322c10 = AbstractC0287b.m1322c(tj3Var7, as4VarM10871c);
                    tj3Var7.m22119f0();
                    if (tj3Var7.f62384S) {
                        tj3Var7.m22130l(ui3Var9);
                    } else {
                        tj3Var7.m22137o0();
                    }
                    oha.m18001g(tj3Var7, zi3Var9, bb1VarM230a5);
                    oha.m18001g(tj3Var7, zi3Var10, l77VarM22132m10);
                    AbstractC3393o1.m17747v(iHashCode10, tj3Var7, zi3Var11, tj3Var7, vi3Var6);
                    oha.m18001g(tj3Var7, zi3Var12, e16VarM1322c10);
                    lw9.m16554b(str2, null, p58.m18900f(tj3Var7).f55870o, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var7).f71406j, tj3Var7, 0, 0, 131066);
                    lw9.m16554b(str3, null, p58.m18900f(tj3Var7).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var7).f71407k, tj3Var7, 0, 0, 131066);
                    tj3Var7.m22139q(true);
                    thb.m22044c(tj3Var7, c99.m4426s(b16Var2, ge9.m12515a(tj3Var7).f38956e));
                    p04 p04VarM10916b = e7d.m10916b();
                    if (z) {
                        tj3Var7.m22111b0(-1458642699);
                        j = p58.m18900f(tj3Var7).f55842a;
                        tj3Var7.m22139q(false);
                    } else {
                        tj3Var7.m22111b0(-1458564114);
                        j = p58.m18900f(tj3Var7).f55817B;
                        tj3Var7.m22139q(false);
                    }
                    ty3.m22351a(p04VarM10916b, null, wq1.m24108d(tj3Var7, b16Var2, 24.0f), j, tj3Var7, 48, 0);
                    tj3Var7.m22139q(true);
                } else {
                    tj3Var7.m22102U();
                }
                break;
            default:
                String str4 = (String) obj6;
                ui3 ui3Var10 = (ui3) obj5;
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var8 = (tj3) ye1Var7;
                if (tj3Var8.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    ht5 ht5VarM19966d4 = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode11 = Long.hashCode(tj3Var8.f62385T);
                    l77 l77VarM22132m11 = tj3Var8.m22132m();
                    e16 e16VarM1322c11 = AbstractC0287b.m1322c(tj3Var8, b16Var2);
                    se1.f60731q.getClass();
                    ui3 ui3Var11 = C0352b.f4299b;
                    tj3Var8.m22119f0();
                    if (tj3Var8.f62384S) {
                        tj3Var8.m22130l(ui3Var11);
                    } else {
                        tj3Var8.m22137o0();
                    }
                    oha.m18001g(tj3Var8, C0352b.f4303f, ht5VarM19966d4);
                    oha.m18001g(tj3Var8, C0352b.f4302e, l77VarM22132m11);
                    oha.m18001g(tj3Var8, C0352b.f4304g, Integer.valueOf(iHashCode11));
                    oha.m18000f(tj3Var8, C0352b.f4305h);
                    oha.m18001g(tj3Var8, C0352b.f4301d, e16VarM1322c11);
                    ss5.m21702b(str4, vz1.m23620a0(tj3Var8, com.lingq.core.premium.R$string.premium_upgrade_banner), c99.m4412e(b16Var2, 1.0f), null, hl1.f42567d, tj3Var8, 1573248, 4024);
                    if (z) {
                        tj3Var8.m22111b0(-1949283864);
                        p9d.m18995a(0, tj3Var8, ui3Var10, ci0.f10109a.mo3727a(b16Var2, nj0.f52814i));
                        tj3Var8.m22139q(false);
                    } else {
                        tj3Var8.m22111b0(-1949110884);
                        tj3Var8.m22139q(false);
                    }
                    tj3Var8.m22139q(true);
                } else {
                    tj3Var8.m22102U();
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ xh3(Object obj, boolean z, xi3 xi3Var, int i) {
        this.f68197a = i;
        this.f68200d = obj;
        this.f68198b = z;
        this.f68199c = xi3Var;
    }

    public /* synthetic */ xh3(boolean z, Object obj, Object obj2, int i) {
        this.f68197a = i;
        this.f68198b = z;
        this.f68200d = obj;
        this.f68199c = obj2;
    }
}
