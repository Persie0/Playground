package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.feature.token.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bgc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f8527a = new C0282a(-1263206504, false, new xd1(17));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m3707a(TokenMeaning tokenMeaning, boolean z, boolean z2, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3, ye1 ye1Var, int i) {
        String strM23620a0;
        boolean z3;
        vx9 vx9VarM23583a;
        long j;
        tokenMeaning.getClass();
        String str = tokenMeaning.f19595b;
        int i2 = tokenMeaning.f19594a;
        vi3Var.getClass();
        vi3Var2.getClass();
        vi3Var3.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1660603090);
        int i3 = (tj3Var.m22124i(tokenMeaning) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22122h(z) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var.m22124i(vi3Var) ? 2048 : 1024;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 1043) != 1042)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            b16 b16Var = b16.f7762a;
            e16 e16VarM10007D = d32.m10007D(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38965n, 0.0f, 2), p58.m18900f(tj3Var).f55821F, ss5.f61356d);
            int i4 = i3 & 7168;
            boolean zM22124i = (i4 == 2048) | tj3Var.m22124i(tokenMeaning);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new lh7(vi3Var, tokenMeaning, 0);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM10007D, 15), ge9.m12515a(tj3Var).f38956e, ge9.m12515a(tj3Var).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            if (i2 == -1) {
                tj3Var.m22111b0(105395404);
                strM23620a0 = vz1.m23620a0(tj3Var, R$string.loading_cwt);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(105486792);
                strM23620a0 = tokenMeaning.f19596c;
                if (strM23620a0 == null) {
                    tj3Var.m22111b0(-1797712022);
                    strM23620a0 = vz1.m23620a0(tj3Var, R$string.lesson_no_translation_available);
                } else {
                    tj3Var.m22111b0(-1797712518);
                }
                tj3Var.m22139q(false);
                tj3Var.m22139q(false);
            }
            String str2 = strM23620a0;
            as4 as4Var = new as4(1.0f, true);
            if (i2 == -1) {
                tj3Var.m22111b0(105707140);
                vx9VarM23583a = vx9.m23583a(p58.m18902j(tj3Var).f71406j, AbstractC1899b.m8704m(tj3Var), new wb3(1), 33554414);
                z3 = false;
                tj3Var.m22139q(false);
            } else {
                z3 = false;
                tj3Var.m22111b0(-1797701061);
                vx9VarM23583a = p58.m18902j(tj3Var).f71406j;
                tj3Var.m22139q(false);
            }
            vx9 vx9Var = vx9VarM23583a;
            if (i2 == -1) {
                tj3Var.m22111b0(-1797698142);
                j = p58.m18900f(tj3Var).f55875s;
            } else {
                tj3Var.m22111b0(-1797696613);
                j = p58.m18900f(tj3Var).f55873q;
            }
            tj3Var.m22139q(z3);
            long j2 = j;
            boolean z4 = z3;
            lw9.m16554b(str2, as4Var, j2, null, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, vx9Var, tj3Var, 0, 24960, 110584);
            tj3Var = tj3Var;
            if (t7d.m21898c(tokenMeaning)) {
                tj3Var.m22111b0(106120556);
                ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_ai, tj3Var, z4 ? 1 : 0), vz1.m23620a0(tj3Var, R$string.token_ai_generated), AbstractC3584sr.m21611X(c99.m4422o(b16Var, 24.0f), 0.0f, 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 11), p58.m18900f(tj3Var).f55852f, tj3Var, 8, 0);
                tj3Var.m22139q(z4);
            } else {
                tj3Var.m22111b0(106493424);
                tj3Var.m22139q(z4);
            }
            if (z) {
                tj3Var.m22111b0(106531213);
                boolean zM22120g = tj3Var.m22120g(str);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22120g || objM22097O2 == p84Var) {
                    objM22097O2 = Integer.valueOf(abd.m249e(R$drawable.ic_none, context, str));
                    tj3Var.m22131l0(objM22097O2);
                }
                int iIntValue = ((Number) objM22097O2).intValue();
                if (iIntValue != 0) {
                    tj3Var.m22111b0(106651989);
                    bq1.m4042R(AbstractC3423or.m18236U(iIntValue, tj3Var, z4 ? 1 : 0), tokenMeaning.f19595b, c99.m4422o(b16Var, 18.0f), null, null, 0.0f, null, tj3Var, 392, 120);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(z4);
                } else {
                    tj3Var.m22111b0(106893200);
                    tj3Var.m22139q(z4);
                }
                tj3Var.m22139q(z4);
            } else {
                tj3Var.m22111b0(106921596);
                boolean z5 = (tj3Var.m22124i(tokenMeaning) ? 1 : 0) | (i4 == 2048 ? (char) 1 : z4 ? 1 : 0);
                Object objM22097O3 = tj3Var.m22097O();
                if (z5 != 0 || objM22097O3 == p84Var) {
                    objM22097O3 = new lh7(vi3Var, tokenMeaning, 1);
                    tj3Var.m22131l0(objM22097O3);
                }
                omd.m18141c((ui3) objM22097O3, c99.m4422o(b16Var, 20.0f), false, null, null, ngc.f52721c, tj3Var, 1572912, 60);
                tj3Var = tj3Var;
                tj3Var.m22139q(z4);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new mh7(tokenMeaning, z, z2, vi3Var, vi3Var2, vi3Var3, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r14v11, types: [tj3] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [tj3] */
    /* JADX WARN: Type inference failed for: r14v15, types: [tj3] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [tj3] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v4, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r14v5, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r14v6, types: [tj3] */
    /* JADX WARN: Type inference failed for: r14v7, types: [tj3] */
    /* JADX WARN: Type inference failed for: r14v9, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r17v1, types: [ye1] */
    /* JADX WARN: Type inference failed for: r32v1, types: [ye1] */
    /* JADX WARN: Type inference failed for: r32v3, types: [ye1] */
    /* JADX WARN: Type inference failed for: r32v4, types: [ye1] */
    /* JADX INFO: renamed from: b */
    public static final void m3708b(f5a f5aVar, int i, vi3 vi3Var, ui3 ui3Var, ye1 ye1Var, int i2) {
        ?? r14;
        p84 p84Var;
        ?? r11;
        b16 b16Var;
        float f;
        ?? r10;
        int i3;
        ?? r15;
        boolean z;
        ?? r16;
        Object next;
        String str;
        char c;
        ArrayList arrayListM22603U0;
        Object next2;
        vi3 vi3Var2 = vi3Var;
        f5aVar.getClass();
        List<String> list = f5aVar.f38470b;
        String str2 = f5aVar.f38494z;
        List list2 = f5aVar.f38488t;
        List list3 = f5aVar.f38443A;
        vi3Var2.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(836889932);
        int i4 = (i2 & 6) == 0 ? (tj3Var.m22124i(f5aVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= tj3Var.m22116e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= tj3Var.m22124i(vi3Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= tj3Var.m22124i(ui3Var) ? 2048 : 1024;
        }
        if (tj3Var.m22099R(i4 & 1, (i4 & 1171) != 1170)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (objM22097O == p84Var2) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            int i5 = i4;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(e16VarM4412e, ((fe9) tj3Var.m22128k(zf1Var)).f38965n, 0.0f, 2), 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38963l, 0.0f, 0.0f, 13);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
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
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.card_popular_meanings), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var, 0, 0, 131070);
            tj3 tj3Var2 = tj3Var;
            if (list3.size() > 1) {
                tj3Var2.m22111b0(1572731961);
                Object objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var2) {
                    objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                    tj3Var2.m22131l0(objM22097O2);
                }
                t66 t66Var2 = (t66) objM22097O2;
                boolean zM22120g = tj3Var2.m22120g(str2) | tj3Var2.m22120g(list3);
                Object objM22097O3 = tj3Var2.m22097O();
                if (zM22120g || objM22097O3 == p84Var2) {
                    Iterator it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!fa4.m11650l(((DictionaryLocale) next).f19021a, str2));
                    DictionaryLocale dictionaryLocale = (DictionaryLocale) next;
                    if (dictionaryLocale != null && (str = dictionaryLocale.f19022b) != null) {
                        str2 = str;
                    }
                    tj3Var2.m22131l0(str2);
                    objM22097O3 = str2;
                }
                String str3 = (String) objM22097O3;
                b16Var = b16Var2;
                e16 e16VarM4429v = c99.m4429v(AbstractC3584sr.m21611X(b16Var2, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a, 0.0f, 0.0f, 0.0f, 14));
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m2 = tj3Var2.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4429v);
                se1.f60731q.getClass();
                ui3 ui3Var3 = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var3);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
                oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m2);
                oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode2));
                oha.m18000f(tj3Var2, C0352b.f4305h);
                oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c2);
                Object objM22097O4 = tj3Var2.m22097O();
                if (objM22097O4 == p84Var2) {
                    c = 27;
                    objM22097O4 = new do4(27, t66Var2);
                    tj3Var2.m22131l0(objM22097O4);
                } else {
                    c = 27;
                }
                AbstractC0231g.m1153f(817889334, 380, null, tj3Var2, (ui3) objM22097O4, ci8.m4703P(-258810418, new iz4(8, str3, t66Var2), tj3Var2), c99.m4430w(b16Var, null, 3), AbstractC3584sr.m21622e(0.0f, 0.0f, 2), null, false);
                if (((Boolean) t66Var.getValue()).booleanValue()) {
                    List list4 = list3;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list4) {
                        if (list.contains(((DictionaryLocale) obj).f19021a)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list4) {
                        if (!list.contains(((DictionaryLocale) obj2).f19021a)) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayListM22603U0 = u91.m22603U0(u91.m22614f1(arrayList2, new yd7(1)), arrayList);
                } else {
                    arrayListM22603U0 = new ArrayList();
                    for (String str4 : list) {
                        Iterator it2 = list3.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (!fa4.m11650l(((DictionaryLocale) next2).f19021a, str4));
                        DictionaryLocale dictionaryLocale2 = (DictionaryLocale) next2;
                        if (dictionaryLocale2 != null) {
                            arrayListM22603U0.add(dictionaryLocale2);
                        }
                    }
                }
                ArrayList arrayList3 = arrayListM22603U0;
                boolean zBooleanValue = ((Boolean) t66Var2.getValue()).booleanValue();
                Object objM22097O5 = tj3Var2.m22097O();
                if (objM22097O5 == p84Var2) {
                    objM22097O5 = new zy0(t66Var2, t66Var, 2);
                    tj3Var2.m22131l0(objM22097O5);
                }
                r10 = 0;
                vi3Var2 = vi3Var;
                p84Var = p84Var2;
                f = 0.0f;
                i3 = 256;
                AbstractC3003fj.m11885a(zBooleanValue, (ui3) objM22097O5, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(-774176202, new C3357n2((Object) arrayList3, vi3Var, (Object) t66Var2, (Object) t66Var, 13), tj3Var2), tj3Var2, 48, 2044);
                tj3 tj3Var3 = tj3Var2;
                r11 = 1;
                tj3Var3.m22139q(true);
                tj3Var3.m22139q(false);
                r15 = tj3Var3;
            } else {
                p84Var = p84Var2;
                r11 = 1;
                b16Var = b16Var2;
                f = 0.0f;
                r10 = 0;
                i3 = 256;
                vi3Var2 = vi3Var;
                tj3Var2.m22111b0(1576292466);
                tj3Var2.m22139q(false);
                r15 = tj3Var2;
            }
            r15.m22139q(r11);
            if (f5aVar.f38447E) {
                r15.m22111b0(-492671746);
                e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), f, ((fe9) r15.m22128k(ge9.f40637a)).f38952a, r11);
                ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52812g, r10);
                int iHashCode3 = Long.hashCode(r15.f62385T);
                l77 l77VarM22132m3 = r15.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(r15, e16VarM21609V);
                se1.f60731q.getClass();
                ui3 ui3Var4 = C0352b.f4299b;
                r15.m22119f0();
                if (r15.f62384S) {
                    r15.m22130l(ui3Var4);
                } else {
                    r15.m22137o0();
                }
                oha.m18001g(r15, C0352b.f4303f, ht5VarM19966d2);
                oha.m18001g(r15, C0352b.f4302e, l77VarM22132m3);
                oha.m18001g(r15, C0352b.f4304g, Integer.valueOf(iHashCode3));
                oha.m18000f(r15, C0352b.f4305h);
                oha.m18001g(r15, C0352b.f4301d, e16VarM1322c3);
                ?? r32 = r15;
                dn7.m10492a(c99.m4422o(b16Var, 24.0f), ((ms5) r15.m22128k(ps5.f56764b)).f51799a.f55852f, 2.0f, 0L, 0, 0.0f, r32, 390, 56);
                ?? r17 = r32;
                r17.m22139q(true);
                r17.m22139q(r10);
                r14 = r17;
            } else if (list2.isEmpty()) {
                r15.m22111b0(-492147009);
                String strM23620a0 = vz1.m23620a0(r15, R$string.card_no_popular_meanings_available);
                vx9 vx9Var = ((ms5) r15.m22128k(ps5.f56764b)).f51800b.f71407k;
                zf1 zf1Var2 = ge9.f40637a;
                ?? r33 = r15;
                lw9.m16554b(strM23620a0, AbstractC3584sr.m21608U(b16Var, ((fe9) r15.m22128k(zf1Var2)).f38956e, ((fe9) r15.m22128k(zf1Var2)).f38952a), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, r33, 0, 0, 131068);
                ?? r18 = r33;
                r18.m22139q(r10);
                r14 = r18;
            } else {
                r15.m22111b0(-491723797);
                b16 b16Var3 = b16Var;
                e16 e16VarM21611X2 = AbstractC3584sr.m21611X(b16Var3, 0.0f, 0.0f, 0.0f, ((fe9) r15.m22128k(ge9.f40637a)).f38955d, 7);
                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, r15, r10);
                int iHashCode4 = Long.hashCode(r15.f62385T);
                l77 l77VarM22132m4 = r15.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(r15, e16VarM21611X2);
                se1.f60731q.getClass();
                ui3 ui3Var5 = C0352b.f4299b;
                r15.m22119f0();
                if (r15.f62384S) {
                    r15.m22130l(ui3Var5);
                } else {
                    r15.m22137o0();
                }
                oha.m18001g(r15, C0352b.f4303f, bb1VarM230a);
                oha.m18001g(r15, C0352b.f4302e, l77VarM22132m4);
                oha.m18001g(r15, C0352b.f4304g, Integer.valueOf(iHashCode4));
                oha.m18000f(r15, C0352b.f4305h);
                oha.m18001g(r15, C0352b.f4301d, e16VarM1322c4);
                r15.m22111b0(977886229);
                Iterator it3 = u91.m22615g1(list2, i).iterator();
                while (true) {
                    int i6 = 25;
                    if (!it3.hasNext()) {
                        break;
                    }
                    TokenMeaning tokenMeaning = (TokenMeaning) it3.next();
                    boolean z2 = f5aVar.f38492x;
                    boolean z3 = f5aVar.f38474f instanceof LessonWord;
                    int i7 = i5 & 896;
                    ?? r19 = i7 == i3 ? 1 : r10;
                    Object objM22097O6 = r15.m22097O();
                    if (r19 != 0 || objM22097O6 == p84Var) {
                        objM22097O6 = new i75(vi3Var2, i6);
                        r15.m22131l0(objM22097O6);
                    }
                    vi3 vi3Var3 = (vi3) objM22097O6;
                    boolean z4 = i7 == i3;
                    Object objM22097O7 = r15.m22097O();
                    if (z4 || objM22097O7 == p84Var) {
                        objM22097O7 = new i75(vi3Var2, 26);
                        r15.m22131l0(objM22097O7);
                    }
                    vi3 vi3Var4 = (vi3) objM22097O7;
                    boolean z5 = i7 == i3;
                    Object objM22097O8 = r15.m22097O();
                    if (z5 || objM22097O8 == p84Var) {
                        objM22097O8 = new i75(vi3Var2, 27);
                        r15.m22131l0(objM22097O8);
                    }
                    ?? r110 = r15;
                    m3707a(tokenMeaning, z2, z3, vi3Var3, vi3Var4, (vi3) objM22097O8, r110, 0);
                    r15 = r110;
                    if (tokenMeaning.equals(u91.m22597O0(list2))) {
                        r10 = 0;
                        r15.m22111b0(-1187917636);
                        r15.m22139q(false);
                    } else {
                        r15.m22111b0(-1188250142);
                        zf1 zf1Var3 = ge9.f40637a;
                        pb1.m19031a(0.0f, 0, 6, 0L, r15, AbstractC3584sr.m21611X(b16Var3, ((fe9) r15.m22128k(zf1Var3)).f38965n, 0.0f, ((fe9) r15.m22128k(zf1Var3)).f38960i, 0.0f, 10));
                        r15 = r15;
                        r10 = 0;
                        r15.m22139q(false);
                    }
                }
                r15.m22139q(r10);
                if (list2.size() > i) {
                    r15.m22111b0(250969371);
                    gv3 gv3Var = new gv3(nj0.f52792K);
                    zf1 zf1Var4 = ge9.f40637a;
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(gv3Var, ((fe9) r15.m22128k(zf1Var4)).f38965n, ((fe9) r15.m22128k(zf1Var4)).f38952a);
                    boolean z6 = (i5 & 7168) == 2048;
                    Object objM22097O9 = r15.m22097O();
                    if (z6 || objM22097O9 == p84Var) {
                        objM22097O9 = new xa0(25, ui3Var);
                        r15.m22131l0(objM22097O9);
                    }
                    e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O9, e16VarM21608U, 15);
                    String strM23620a1 = vz1.m23620a0(r15, R$string.challenges_show_more);
                    vh9 vh9Var = ps5.f56764b;
                    ?? r34 = r15;
                    lw9.m16554b(strM23620a1, e16VarM815b, ((ms5) r15.m22128k(vh9Var)).f51799a.f55842a, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) r15.m22128k(vh9Var)).f51800b.f71410n, r34, 0, 0, 131064);
                    ?? r111 = r34;
                    z = false;
                    r111.m22139q(false);
                    r16 = r111;
                } else {
                    z = false;
                    r15.m22111b0(251606111);
                    r15.m22139q(false);
                    r16 = r15;
                }
                r16.m22139q(true);
                r16.m22139q(z);
                r14 = r16;
            }
        } else {
            tj3Var.m22102U();
            r14 = tj3Var;
        }
        x18 x18VarM22143u = r14.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dz1(f5aVar, i, vi3Var2, ui3Var, i2);
        }
    }
}
