package p000;

import android.content.Context;
import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.achievements.AbstractC1234a;
import com.lingq.core.achievements.R$drawable;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.stats.ActivityScore;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.p012ui.sheet.LanguageProgressInputType;
import com.lingq.core.premium.AbstractC1839a;
import com.lingq.feature.dictionary.AbstractC2059d;
import com.lingq.feature.vocabulary.AbstractC2823a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: renamed from: n2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3357n2 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52204a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f52205b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f52206c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f52207d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f52208e;

    public /* synthetic */ C3357n2(y27 y27Var, o39 o39Var, jl1 jl1Var, String str) {
        this.f52204a = 12;
        this.f52206c = y27Var;
        this.f52208e = o39Var;
        this.f52205b = jl1Var;
        this.f52207d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX INFO: renamed from: d */
    private final Object m17172d(Object obj, Object obj2, Object obj3) {
        ActivityScore activityScore;
        Object obj4;
        double d;
        double d2;
        int i;
        double d3;
        double d4;
        tj3 tj3Var;
        Object obj5;
        tj3 tj3Var2;
        String string;
        t66 t66Var;
        long jM4213f;
        ?? r6;
        long jM4213f2;
        Object objValueOf;
        double d5;
        Object objValueOf2;
        jo4 jo4Var = (jo4) this.f52206c;
        Context context = (Context) this.f52207d;
        Object obj6 = (zi3) this.f52208e;
        t66 t66Var2 = (t66) this.f52205b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var3 = (tj3) ye1Var;
        if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var3).f38957f, ge9.m12515a(tj3Var3).f38956e);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
            int iHashCode = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m = tj3Var3.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var);
            } else {
                tj3Var3.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var3, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var3, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
            e16 e16VarM4429v = c99.m4429v(c99.m4412e(b16Var, 1.0f));
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m2 = tj3Var3.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM4429v);
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var);
            } else {
                tj3Var3.m22137o0();
            }
            oha.m18001g(tj3Var3, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var);
            oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
            e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
            gc0 gc0Var = nj0.f52811f;
            ci0 ci0Var = ci0.f10109a;
            e16 e16VarMo3727a = ci0Var.mo3727a(e16VarM4430w, gc0Var);
            String strM23620a0 = vz1.m23620a0(tj3Var3, R$string.stats_seven_day_activity);
            Locale locale = Locale.getDefault();
            locale.getClass();
            String upperCase = strM23620a0.toUpperCase(locale);
            upperCase.getClass();
            lw9.m16554b(upperCase, e16VarMo3727a, p58.m18900f(tj3Var3).f55858i, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, 0, 0, 130040);
            tj3 tj3Var4 = tj3Var3;
            boolean z = jo4Var.f45915f;
            ActivityScore activityScore2 = jo4Var.f45917h;
            double d6 = jo4Var.f45913d;
            double d7 = jo4Var.f45914e;
            cn4 cn4Var = jo4Var.f45910a;
            Object obj7 = we1.f66679a;
            if (z) {
                tj3Var4.m22111b0(2038485234);
                Object objM22097O = tj3Var4.m22097O();
                if (objM22097O == obj7) {
                    objM22097O = new do4(1, t66Var2);
                    tj3Var4.m22131l0(objM22097O);
                }
                ui3 ui3Var2 = (ui3) objM22097O;
                e16 e16VarM10007D = d32.m10007D(pb1.m19045o(b16Var, p58.m18901i(tj3Var4).f64859e), p58.m18900f(tj3Var4).f55856h, ss5.f61356d);
                ge9.m12515a(tj3Var4).getClass();
                activityScore = activityScore2;
                obj4 = obj7;
                d2 = d7;
                d = d6;
                omd.m18141c(ui3Var2, ci0Var.mo3727a(c99.m4422o(e16VarM10007D, 32.0f), nj0.f52813h), false, null, null, jsb.f46088e, tj3Var4, 1572870, 60);
                tj3Var4 = tj3Var4;
                tj3Var4.m22139q(false);
            } else {
                activityScore = activityScore2;
                obj4 = obj7;
                d = d6;
                d2 = d7;
                tj3Var4.m22111b0(2039377445);
                ge9.m12515a(tj3Var4).getClass();
                thb.m22044c(tj3Var4, c99.m4422o(b16Var, 32.0f));
                tj3Var4.m22139q(false);
            }
            tj3Var4.m22139q(true);
            e16 e16VarM22984g = ux5.m22984g(b16Var, ge9.m12515a(tj3Var4).f38952a, tj3Var4, b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52790I, tj3Var4, 48);
            Object obj8 = obj4;
            int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
            l77 l77VarM22132m3 = tj3Var4.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, e16VarM22984g);
            tj3Var4.m22119f0();
            if (tj3Var4.f62384S) {
                tj3Var4.m22130l(ui3Var);
            } else {
                tj3Var4.m22137o0();
            }
            oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var4, zi3Var3, tj3Var4, vi3Var);
            oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c3);
            int i2 = 8;
            if (d2 > 0.0d) {
                tj3Var4.m22111b0(-1332120038);
                LanguageProgressMetric languageProgressMetric = cn4Var.f10320a;
                if (shd.m21391a(languageProgressMetric)) {
                    d3 = d;
                    objValueOf = Integer.valueOf((int) d3);
                } else {
                    d3 = d;
                    objValueOf = Double.valueOf(nob.m17572a(2, d3));
                }
                if (shd.m21391a(languageProgressMetric)) {
                    d5 = d2;
                    objValueOf2 = Integer.valueOf((int) d5);
                } else {
                    d5 = d2;
                    objValueOf2 = Double.valueOf(nob.m17572a(2, d5));
                }
                String str = objValueOf + "/" + objValueOf2 + " " + vz1.m23620a0(tj3Var4, AbstractC3423or.m18223H(languageProgressMetric));
                tj3Var4.m22111b0(-1982607747);
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb.append(str);
                arrayList.add(new C3304ln(new he9(0L, p58.m18902j(tj3Var4).f71401e.f66065a.f42265b, bc3.f8322h, p58.m18902j(tj3Var4).f71401e.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65521), 0, vk9.m23371G0(str, "/").length(), i2));
                tj3 tj3Var5 = tj3Var4;
                arrayList.add(new C3304ln(new he9(p58.m18900f(tj3Var4).f55875s, p58.m18902j(tj3Var4).f71403g.f66065a.f42265b, null, p58.m18902j(tj3Var4).f71403g.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65524), vk9.m23371G0(str, "/").length(), str.length(), 8));
                String string2 = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add(((C3304ln) arrayList.get(i3)).m16392a(sb.length()));
                }
                C3419on c3419on = new C3419on(string2, arrayList2);
                tj3Var5.m22139q(false);
                b16Var = b16Var;
                i = 48;
                lw9.m16555c(c3419on, c99.m4430w(b16Var, null, 3), p58.m18900f(tj3Var5).f55873q, null, 0L, null, null, 0L, new ks9(5), 0L, 0, false, 0, 0, null, null, p58.m18902j(tj3Var5).f71403g, tj3Var5, 48, 0, 261112);
                tj3 tj3Var6 = tj3Var5;
                tj3Var6.m22139q(false);
                d4 = d5;
                tj3Var = tj3Var6;
            } else {
                i = 48;
                d3 = d;
                tj3Var4.m22111b0(-1329790760);
                String str2 = (r19.f10320a == LanguageProgressMetric.StudyTime ? yhd.m25151g(d3) : Double.valueOf(nob.m17572a(2, d3))) + " " + vz1.m23620a0(tj3Var4, AbstractC3423or.m18223H(r19.f10320a));
                tj3Var4.m22111b0(-1982543555);
                StringBuilder sb2 = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                new ArrayList();
                sb2.append(str2);
                tj3 tj3Var7 = tj3Var4;
                arrayList3.add(new C3304ln(new he9(0L, p58.m18902j(tj3Var4).f71401e.f66065a.f42265b, bc3.f8322h, p58.m18902j(tj3Var4).f71401e.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65521), 0, vk9.m23371G0(str2, " ").length(), 8));
                arrayList3.add(new C3304ln(new he9(p58.m18900f(tj3Var7).f55875s, p58.m18902j(tj3Var7).f71403g.f66065a.f42265b, null, p58.m18902j(tj3Var7).f71403g.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65524), vk9.m23371G0(str2, " ").length(), str2.length(), 8));
                String string3 = sb2.toString();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList4.add(((C3304ln) arrayList3.get(i4)).m16392a(sb2.length()));
                }
                C3419on c3419on2 = new C3419on(string3, arrayList4);
                tj3Var7.m22139q(false);
                d4 = d2;
                lw9.m16555c(c3419on2, c99.m4430w(b16Var, null, 3), p58.m18900f(tj3Var7).f55873q, null, 0L, null, null, 0L, new ks9(5), 0L, 0, false, 0, 0, null, null, p58.m18902j(tj3Var7).f71401e, tj3Var7, 48, 0, 261112);
                tj3 tj3Var8 = tj3Var7;
                tj3Var8.m22139q(false);
                tj3Var = tj3Var8;
            }
            tj3Var.m22139q(true);
            if (d2 > 0.0d) {
                tj3Var.m22111b0(-844029447);
                e16 e16VarM22984g2 = ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38957f, tj3Var, b16Var, 1.0f);
                String strM23620a1 = vz1.m23620a0(tj3Var, AbstractC3423or.m18228M(activityScore));
                vx9 vx9Var = p58.m18902j(tj3Var).f71404h;
                int[] iArr = ho4.f42686a;
                int i5 = iArr[activityScore.ordinal()];
                if (i5 == 1) {
                    tj3Var.m22111b0(1496806905);
                    jM4213f = cx2.m9917a(tj3Var).m4213f();
                    tj3Var.m22139q(false);
                } else if (i5 == 2) {
                    tj3Var.m22111b0(1496809625);
                    jM4213f = cx2.m9917a(tj3Var).m4218k();
                    tj3Var.m22139q(false);
                } else if (i5 == 3) {
                    tj3Var.m22111b0(1496812473);
                    jM4213f = cx2.m9917a(tj3Var).m4218k();
                    tj3Var.m22139q(false);
                } else {
                    if (i5 != 4) {
                        throw ux5.m23001x(tj3Var, 1496803220, false);
                    }
                    tj3Var.m22111b0(1496815288);
                    jM4213f = cx2.m9917a(tj3Var).m4212e();
                    tj3Var.m22139q(false);
                }
                tj3 tj3Var9 = tj3Var;
                lw9.m16554b(strM23620a1, e16VarM22984g2, jM4213f, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var, tj3Var9, 48, 0, 130040);
                thb.m22044c(tj3Var9, c99.m4414g(b16Var, ge9.m12515a(tj3Var9).f38952a));
                dh9 dh9VarM750b = AbstractC0060b.m750b(((float) d3) / ((float) d4), x74.f67879b, null, null, tj3Var9, 0, 28);
                e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4415h(c99.m4412e(b16Var, 1.0f), 32.0f, 64.0f), 0.0f, ge9.m12515a(tj3Var9).f38956e, 1);
                float f = ge9.m12515a(tj3Var9).f38955d;
                int i6 = iArr[activityScore.ordinal()];
                if (i6 == 1) {
                    r6 = 0;
                    tj3Var9.m22111b0(1496850745);
                    jM4213f2 = cx2.m9917a(tj3Var9).m4213f();
                    tj3Var9.m22139q(false);
                } else if (i6 == 2) {
                    r6 = 0;
                    tj3Var9.m22111b0(1496853465);
                    jM4213f2 = cx2.m9917a(tj3Var9).m4218k();
                    tj3Var9.m22139q(false);
                } else if (i6 == 3) {
                    r6 = 0;
                    tj3Var9.m22111b0(1496856313);
                    jM4213f2 = cx2.m9917a(tj3Var9).m4218k();
                    tj3Var9.m22139q(false);
                } else {
                    if (i6 != 4) {
                        throw ux5.m23001x(tj3Var9, 1496847060, false);
                    }
                    tj3Var9.m22111b0(1496859128);
                    jM4213f2 = cx2.m9917a(tj3Var9).m4212e();
                    r6 = 0;
                    tj3Var9.m22139q(false);
                }
                long j = jM4213f2;
                boolean zM22120g = tj3Var9.m22120g(dh9VarM750b);
                Object objM22097O2 = tj3Var9.m22097O();
                if (zM22120g) {
                    obj5 = obj8;
                } else {
                    obj5 = obj8;
                    if (objM22097O2 == obj5) {
                    }
                    dn7.m10494c((ui3) objM22097O2, e16VarM21609V, j, 0L, 0, f, null, tj3Var9, 0, 88);
                    tj3 tj3Var10 = tj3Var9;
                    tj3Var10.m22139q(r6);
                    tj3Var2 = tj3Var10;
                }
                objM22097O2 = new eo4(dh9VarM750b, r6);
                tj3Var9.m22131l0(objM22097O2);
                dn7.m10494c((ui3) objM22097O2, e16VarM21609V, j, 0L, 0, f, null, tj3Var9, 0, 88);
                tj3 tj3Var11 = tj3Var9;
                tj3Var11.m22139q(r6);
                tj3Var2 = tj3Var11;
            } else {
                obj5 = obj8;
                tj3Var.m22111b0(-841947921);
                tj3Var.m22139q(false);
                tj3Var2 = tj3Var;
            }
            if (((Boolean) t66Var2.getValue()).booleanValue()) {
                tj3Var2.m22111b0(-841861369);
                LanguageProgressMetric languageProgressMetric2 = r19.f10320a;
                int[] iArr2 = ho4.f42687b;
                int i7 = iArr2[languageProgressMetric2.ordinal()];
                if (i7 == 1) {
                    string = context.getString(R$string.stats_add_listening);
                } else if (i7 == 2) {
                    string = context.getString(R$string.stats_add_reading);
                } else if (i7 != 3) {
                    string = i7 != 4 ? "" : context.getString(com.lingq.feature.statistics.R$string.stats_add_speaking);
                } else {
                    string = context.getString(com.lingq.feature.statistics.R$string.stats_add_writing);
                }
                string.getClass();
                int i8 = iArr2[r19.f10320a.ordinal()];
                LanguageProgressInputType languageProgressInputType = i8 != 1 ? (i8 == 2 || i8 == 3 || i8 != 4) ? LanguageProgressInputType.WordCount : LanguageProgressInputType.HoursMinutes : LanguageProgressInputType.HoursMinutes;
                jm4 jm4Var = new jm4(string, languageProgressInputType);
                Object objM22097O3 = tj3Var2.m22097O();
                if (objM22097O3 == obj5) {
                    t66Var = t66Var2;
                    objM22097O3 = new do4(2, t66Var);
                    tj3Var2.m22131l0(objM22097O3);
                } else {
                    t66Var = t66Var2;
                }
                ui3 ui3Var3 = (ui3) objM22097O3;
                boolean zM22120g2 = tj3Var2.m22120g(obj6) | tj3Var2.m22124i(jo4Var);
                Object objM22097O4 = tj3Var2.m22097O();
                if (zM22120g2 || objM22097O4 == obj5) {
                    objM22097O4 = new C3485q5(obj6, jo4Var, t66Var, 20);
                    tj3Var2.m22131l0(objM22097O4);
                }
                vhd.m23289a(jm4Var, ui3Var3, (vi3) objM22097O4, tj3Var2, i);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-840316081);
                tj3Var2.m22139q(false);
            }
            tj3Var2.m22139q(true);
        } else {
            tj3Var3.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00da  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:29:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:32:0x0231 A[LOOP:0: B:31:0x022f->B:32:0x0231, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:36:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:47:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:51:0x037c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0380  */
    /* JADX WARN: Code duplicated, block: B:55:0x0393  */
    /* JADX WARN: Code duplicated, block: B:56:0x03b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:64:0x0415  */
    /* JADX WARN: Code duplicated, block: B:67:0x0421  */
    /* JADX WARN: Code duplicated, block: B:69:0x0424  */
    /* JADX WARN: Code duplicated, block: B:72:0x042c  */
    /* JADX WARN: Code duplicated, block: B:73:0x042e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0446  */
    /* JADX WARN: Code duplicated, block: B:81:0x0451  */
    /* JADX WARN: Code duplicated, block: B:83:0x046f  */
    /* JADX INFO: renamed from: g */
    private final Object m17173g(Object obj, Object obj2, Object obj3) {
        int i;
        String str;
        boolean z;
        String strM23618Z;
        StringBuilder sb;
        ArrayList arrayList;
        String strValueOf;
        int iM23389l0;
        ArrayList arrayList2;
        int size;
        int i2;
        String strM23620a0;
        h68 h68Var;
        boolean z2;
        boolean z3;
        float f;
        boolean z4;
        h68 h68Var2 = (h68) this.f52206c;
        String str2 = h68Var2.f41842c;
        ui3 ui3Var = (ui3) this.f52207d;
        ui3 ui3Var2 = (ui3) this.f52208e;
        ui3 ui3Var3 = (ui3) this.f52205b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            float f2 = ge9.m12515a(tj3Var).f38956e;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, f2);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var4 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var4);
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
            int i3 = h68Var2.f41846g;
            boolean z5 = h68Var2.f41845f;
            String str3 = h68Var2.f41844e;
            boolean zM22120g = tj3Var.m22120g(str2);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g) {
                i = i3;
            } else {
                i = i3;
                if (objM22097O == we1.f66679a) {
                }
                str = (String) objM22097O;
                if (str == null) {
                    tj3Var.m22111b0(-595047350);
                    z = false;
                    tj3Var.m22139q(false);
                    strM23618Z = null;
                } else {
                    z = false;
                    tj3Var.m22111b0(-595047349);
                    strM23618Z = vz1.m23618Z(com.lingq.core.achievements.R$string.streak_you_lost_your_streak_on_date, new Object[]{str}, tj3Var);
                    tj3Var.m22139q(false);
                }
                if (strM23618Z == null) {
                    tj3Var.m22111b0(-1266116625);
                    strM23618Z = vz1.m23618Z(com.lingq.core.achievements.R$string.streak_you_lost_your_n_day_streak, new Object[]{Integer.valueOf(h68Var2.f41841b)}, tj3Var);
                    tj3Var.m22139q(z);
                } else {
                    tj3Var.m22111b0(-1266121368);
                    tj3Var.m22139q(z);
                }
                lw9.m16554b(strM23618Z, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 130046);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38956e));
                bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_fire_big, tj3Var, 0), null, c99.m4422o(b16Var, 70.0f), null, null, 0.0f, null, tj3Var, 440, 120);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, 18.0f));
                lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.core.achievements.R$string.streak_want_to_repair_streak), null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 130046);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38955d));
                tj3Var.m22111b0(-1266083022);
                sb = new StringBuilder(16);
                new ArrayList();
                arrayList = new ArrayList();
                new ArrayList();
                String strM23620a1 = vz1.m23620a0(tj3Var, com.lingq.core.achievements.R$string.streak_for_just_n_coins);
                strValueOf = String.valueOf(i);
                String str4 = String.format(Locale.getDefault(), strM23620a1, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                sb.append(str4);
                iM23389l0 = vk9.m23389l0(str4, strValueOf, 0, false, 6);
                if (iM23389l0 != -1) {
                    arrayList.add(new C3304ln(new he9(0L, 0L, bc3.f8324j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), iM23389l0, strValueOf.length() + iM23389l0, 8));
                }
                String string = sb.toString();
                arrayList2 = new ArrayList(arrayList.size());
                size = arrayList.size();
                i2 = 0;
                while (i2 < size) {
                    StringBuilder sb2 = sb;
                    arrayList2.add(((C3304ln) arrayList.get(i2)).m16392a(sb2.length()));
                    i2++;
                    sb = sb2;
                }
                C3419on c3419on = new C3419on(string, arrayList2);
                tj3Var.m22139q(false);
                lw9.m16555c(c3419on, null, 0L, null, 0L, null, null, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 261118);
                e16 e16VarM4409b = c99.m4409b(ux5.m22984g(b16Var, 20.0f, tj3Var, b16Var, 1.0f), 0.0f, 40.0f, 1);
                gc0 gc0Var = nj0.f52812g;
                ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4409b);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var4);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                if (str3 == null || z5) {
                    tj3Var.m22111b0(-1398558515);
                    if (z5) {
                        tj3Var.m22111b0(-183659866);
                        strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.achievements.R$string.stats_not_enough_coins);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-183656893);
                        tj3Var.m22139q(false);
                        strM23620a0 = str3;
                    }
                    h68Var = h68Var2;
                    bq1.m4039O(c99.m4412e(b16Var, 1.0f), p58.m18901i(tj3Var).f64857c, te1.m21999m(0, 14, p58.m18900f(tj3Var).f55881y, 0L, tj3Var), null, null, ci8.m4703P(-1486173916, new a05(strM23620a0, h68Var, ui3Var, 10), tj3Var), tj3Var, 196614, 24);
                    z2 = false;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-1397022837);
                    z2 = false;
                    tj3Var.m22139q(false);
                    h68Var = h68Var2;
                }
                tj3Var.m22139q(true);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, 16.0f));
                e16 e16VarM4414g = c99.m4414g(c99.m4412e(b16Var, 1.0f), 48.0f);
                ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, z2);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4414g);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var4);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
                if (h68Var.f41843d) {
                    tj3Var.m22111b0(1083304930);
                    dn7.m10492a(c99.m4422o(b16Var, 32.0f), 0L, 0.0f, 0L, 0, 0.0f, tj3Var, 6, 62);
                    tj3Var.m22139q(false);
                    z3 = true;
                } else if (z5) {
                    z3 = true;
                    tj3Var.m22111b0(1084471956);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1083479243);
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52817l, tj3Var, 0);
                    int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m4 = tj3Var.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var4);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m4);
                    AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var3, tj3Var, vi3Var);
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c4);
                    if (1.0f <= 0.0d) {
                        g54.m12362a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    as4 as4Var = new as4(f, true);
                    if (str3 == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ss5.m21708e(1572864, 28, null, tj3Var, ui3Var2, zic.f71626a, as4Var, null, null, z4);
                    if (1.0f <= 0.0d) {
                        g54.m12362a("invalid weight; must be greater than zero");
                    }
                    z3 = true;
                    ss5.m21711g(new as4(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), false, null, 0L, null, null, ui3Var3, zic.f71627b, tj3Var, 12582912, 62);
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(z3);
                ux5.m23003z(b16Var, ge9.m12515a(tj3Var).f38955d, tj3Var, z3);
            }
            objM22097O = zoc.m25735a(str2);
            tj3Var.m22131l0(objM22097O);
            str = (String) objM22097O;
            if (str == null) {
                tj3Var.m22111b0(-595047350);
                z = false;
                tj3Var.m22139q(false);
                strM23618Z = null;
            } else {
                z = false;
                tj3Var.m22111b0(-595047349);
                strM23618Z = vz1.m23618Z(com.lingq.core.achievements.R$string.streak_you_lost_your_streak_on_date, new Object[]{str}, tj3Var);
                tj3Var.m22139q(false);
            }
            if (strM23618Z == null) {
                tj3Var.m22111b0(-1266116625);
                strM23618Z = vz1.m23618Z(com.lingq.core.achievements.R$string.streak_you_lost_your_n_day_streak, new Object[]{Integer.valueOf(h68Var2.f41841b)}, tj3Var);
                tj3Var.m22139q(z);
            } else {
                tj3Var.m22111b0(-1266121368);
                tj3Var.m22139q(z);
            }
            lw9.m16554b(strM23618Z, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 130046);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38956e));
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_fire_big, tj3Var, 0), null, c99.m4422o(b16Var, 70.0f), null, null, 0.0f, null, tj3Var, 440, 120);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, 18.0f));
            lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.core.achievements.R$string.streak_want_to_repair_streak), null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 130046);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38955d));
            tj3Var.m22111b0(-1266083022);
            sb = new StringBuilder(16);
            new ArrayList();
            arrayList = new ArrayList();
            new ArrayList();
            String strM23620a2 = vz1.m23620a0(tj3Var, com.lingq.core.achievements.R$string.streak_for_just_n_coins);
            strValueOf = String.valueOf(i);
            String str5 = String.format(Locale.getDefault(), strM23620a2, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            sb.append(str5);
            iM23389l0 = vk9.m23389l0(str5, strValueOf, 0, false, 6);
            if (iM23389l0 != -1) {
                arrayList.add(new C3304ln(new he9(0L, 0L, bc3.f8324j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), iM23389l0, strValueOf.length() + iM23389l0, 8));
            }
            String string2 = sb.toString();
            arrayList2 = new ArrayList(arrayList.size());
            size = arrayList.size();
            i2 = 0;
            while (i2 < size) {
                StringBuilder sb3 = sb;
                arrayList2.add(((C3304ln) arrayList.get(i2)).m16392a(sb3.length()));
                i2++;
                sb = sb3;
            }
            C3419on c3419on2 = new C3419on(string2, arrayList2);
            tj3Var.m22139q(false);
            lw9.m16555c(c3419on2, null, 0L, null, 0L, null, null, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 261118);
            e16 e16VarM4409b2 = c99.m4409b(ux5.m22984g(b16Var, 20.0f, tj3Var, b16Var, 1.0f), 0.0f, 40.0f, 1);
            gc0 gc0Var2 = nj0.f52812g;
            ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var2, false);
            int iHashCode5 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m5 = tj3Var.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM4409b2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var4);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d3);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m5);
            AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c5);
            if (str3 == null) {
                tj3Var.m22111b0(-1398558515);
                if (z5) {
                    tj3Var.m22111b0(-183659866);
                    strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.achievements.R$string.stats_not_enough_coins);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-183656893);
                    tj3Var.m22139q(false);
                    strM23620a0 = str3;
                }
                h68Var = h68Var2;
                bq1.m4039O(c99.m4412e(b16Var, 1.0f), p58.m18901i(tj3Var).f64857c, te1.m21999m(0, 14, p58.m18900f(tj3Var).f55881y, 0L, tj3Var), null, null, ci8.m4703P(-1486173916, new a05(strM23620a0, h68Var, ui3Var, 10), tj3Var), tj3Var, 196614, 24);
                z2 = false;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1398558515);
                if (z5) {
                    tj3Var.m22111b0(-183659866);
                    strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.achievements.R$string.stats_not_enough_coins);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-183656893);
                    tj3Var.m22139q(false);
                    strM23620a0 = str3;
                }
                h68Var = h68Var2;
                bq1.m4039O(c99.m4412e(b16Var, 1.0f), p58.m18901i(tj3Var).f64857c, te1.m21999m(0, 14, p58.m18900f(tj3Var).f55881y, 0L, tj3Var), null, null, ci8.m4703P(-1486173916, new a05(strM23620a0, h68Var, ui3Var, 10), tj3Var), tj3Var, 196614, 24);
                z2 = false;
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, 16.0f));
            e16 e16VarM4414g2 = c99.m4414g(c99.m4412e(b16Var, 1.0f), 48.0f);
            ht5 ht5VarM19966d4 = qh0.m19966d(gc0Var2, z2);
            int iHashCode6 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m6 = tj3Var.m22132m();
            e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, e16VarM4414g2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var4);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d4);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m6);
            AbstractC3393o1.m17747v(iHashCode6, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c6);
            if (h68Var.f41843d) {
                tj3Var.m22111b0(1083304930);
                dn7.m10492a(c99.m4422o(b16Var, 32.0f), 0L, 0.0f, 0L, 0, 0.0f, tj3Var, 6, 62);
                tj3Var.m22139q(false);
                z3 = true;
            } else if (z5) {
                tj3Var.m22111b0(1083479243);
                e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52817l, tj3Var, 0);
                int iHashCode7 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m7 = tj3Var.m22132m();
                e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var4);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m7);
                AbstractC3393o1.m17747v(iHashCode7, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c7);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f;
                }
                as4 as4Var2 = new as4(f, true);
                if (str3 == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ss5.m21708e(1572864, 28, null, tj3Var, ui3Var2, zic.f71626a, as4Var2, null, null, z4);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                z3 = true;
                ss5.m21711g(new as4(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), false, null, 0L, null, null, ui3Var3, zic.f71627b, tj3Var, 12582912, 62);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            } else {
                z3 = true;
                tj3Var.m22111b0(1084471956);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(z3);
            ux5.m23003z(b16Var, ge9.m12515a(tj3Var).f38955d, tj3Var, z3);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m17174j(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) this.f52206c;
        vi3 vi3Var = (vi3) this.f52205b;
        u19 u19Var = (u19) this.f52207d;
        t66 t66Var = (t66) this.f52208e;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            int i = 0;
            for (Object obj4 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                String str = (String) obj4;
                float f = ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a;
                b16 b16Var = b16.f7762a;
                e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, f);
                boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22124i(u19Var) | tj3Var.m22116e(i);
                Object objM22097O = tj3Var.m22097O();
                if (zM22120g || objM22097O == we1.f66679a) {
                    yo6 yo6Var = new yo6(i, 1, vi3Var, u19Var, t66Var);
                    tj3Var.m22131l0(yo6Var);
                    objM22097O = yo6Var;
                }
                e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM21607T, 15);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 0);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
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
                lw9.m16554b(str, c99.m4412e(b16Var, 1.0f), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 48, 0, 262140);
                tj3Var.m22139q(true);
                i = i2;
            }
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m17175k(Object obj, Object obj2, Object obj3) {
        wia wiaVar = (wia) this.f52207d;
        List list = (List) this.f52206c;
        via viaVar = (via) this.f52208e;
        sc9 sc9Var = (sc9) this.f52205b;
        t17 t17Var = (t17) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t17Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
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
            int iM21222h = sc9Var.m21222h();
            boolean zM22124i = tj3Var.m22124i(viaVar) | tj3Var.m22124i(list);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new ws6(viaVar, list, sc9Var, 17);
                tj3Var.m22131l0(objM22097O);
            }
            vi3 vi3Var = (vi3) objM22097O;
            boolean zM22124i2 = tj3Var.m22124i(viaVar);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var) {
                objM22097O2 = new mia(viaVar, 2);
                tj3Var.m22131l0(objM22097O2);
            }
            ui3 ui3Var2 = (ui3) objM22097O2;
            boolean zM22124i3 = tj3Var.m22124i(viaVar);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i3 || objM22097O3 == p84Var) {
                objM22097O3 = new mia(viaVar, 3);
                tj3Var.m22131l0(objM22097O3);
            }
            ui3 ui3Var3 = (ui3) objM22097O3;
            boolean zM22124i4 = tj3Var.m22124i(viaVar);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i4 || objM22097O4 == p84Var) {
                objM22097O4 = new mia(viaVar, 4);
                tj3Var.m22131l0(objM22097O4);
            }
            ui3 ui3Var4 = (ui3) objM22097O4;
            boolean zM22124i5 = tj3Var.m22124i(viaVar);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22124i5 || objM22097O5 == p84Var) {
                objM22097O5 = new mia(viaVar, 5);
                tj3Var.m22131l0(objM22097O5);
            }
            AbstractC1839a.m8539q(wiaVar, list, iM21222h, t17Var, vi3Var, ui3Var2, ui3Var3, ui3Var4, (ui3) objM22097O5, tj3Var, (iIntValue << 9) & 7168);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: l */
    private final Object m17176l(Object obj, Object obj2, Object obj3) {
        Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.f52206c;
        Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) this.f52207d;
        Ref$FloatRef ref$FloatRef3 = (Ref$FloatRef) this.f52208e;
        Ref$FloatRef ref$FloatRef4 = (Ref$FloatRef) this.f52205b;
        C3500qj c3500qj = (C3500qj) obj;
        x89 x89Var = (x89) obj2;
        c3500qj.getClass();
        ((LayoutDirection) obj3).getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (x89Var.f67935a >> 32)) - (ref$FloatRef.f47715a * 2.0f);
        long j = x89Var.f67935a;
        int i = (int) (j & 4294967295L);
        c3500qj.m19989f(fIntBitsToFloat, Float.intBitsToFloat(i));
        int i2 = (int) (j >> 32);
        c3500qj.m19988e((ref$FloatRef2.f47715a * 2.0f) + (Float.intBitsToFloat(i2) - (ref$FloatRef.f47715a * 2.0f)), Float.intBitsToFloat(i) + ref$FloatRef3.f47715a);
        c3500qj.m19988e((Float.intBitsToFloat(i2) - (ref$FloatRef.f47715a * 2.0f)) + ref$FloatRef2.f47715a, Float.intBitsToFloat(i));
        e28 e28VarM23907b = wfb.m23907b((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i))) & 4294967295L));
        float f = ref$FloatRef4.f47715a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        C3500qj.m19986c(c3500qj, omd.m18154j(e28VarM23907b.f36620a, e28VarM23907b.f36621b, e28VarM23907b.f36622c, e28VarM23907b.f36623d, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))));
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: m */
    private final Object m17177m(Object obj, Object obj2, Object obj3) {
        ArrayList<aia> arrayList = (ArrayList) this.f52206c;
        wia wiaVar = (wia) this.f52208e;
        String str = (String) this.f52207d;
        vi3 vi3Var = (vi3) this.f52205b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            e16 e16VarM4428u = c99.m4428u(b16.f7762a, 0.0f, 600.0f, 1);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4428u);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            tj3Var.m22111b0(1158022994);
            for (aia aiaVar : arrayList) {
                boolean zM11650l = fa4.m11650l(aiaVar.f701a, wiaVar.f66890o);
                boolean zM11650l2 = fa4.m11650l(aiaVar.f701a, str);
                boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22124i(aiaVar);
                Object objM22097O = tj3Var.m22097O();
                if (zM22120g || objM22097O == we1.f66679a) {
                    objM22097O = new lia(vi3Var, aiaVar, 0);
                    tj3Var.m22131l0(objM22097O);
                }
                AbstractC1839a.m8535m(aiaVar, zM11650l, zM11650l2, (ui3) objM22097O, tj3Var, 0);
            }
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:35:0x0106  */
    /* JADX WARN: Code duplicated, block: B:39:0x011f  */
    /* JADX INFO: renamed from: n */
    private final Object m17178n(Object obj, Object obj2, Object obj3) {
        ty1 ty1Var;
        boolean zM22124i;
        Object objM22097O;
        Object objM22097O2;
        boolean zM22120g;
        Object objM22097O3;
        boolean zM22120g2;
        Object objM22097O4;
        h24 h24Var = (h24) this.f52206c;
        Context context = (Context) this.f52208e;
        String str = (String) this.f52207d;
        vi3 vi3Var = (vi3) this.f52205b;
        ye1 ye1Var = (ye1) obj2;
        ((Integer) obj3).getClass();
        ((InterfaceC0067f) obj).getClass();
        if (h24Var == null) {
            tj3 tj3Var = (tj3) ye1Var;
            tj3Var.m22111b0(363424062);
            tj3Var.m22139q(false);
        } else {
            Object obj4 = h24Var.f41699e;
            tj3 tj3Var2 = (tj3) ye1Var;
            tj3Var2.m22111b0(363424063);
            int i = fqa.f39496a[h24Var.f41695a.ordinal()];
            int i2 = 1;
            p84 p84Var = we1.f66679a;
            if (i != 1) {
                int i3 = 2;
                if (i == 2) {
                    tj3Var2.m22111b0(-1485595515);
                    obj4.getClass();
                    ty1Var = (ty1) obj4;
                    zM22124i = tj3Var2.m22124i(context) | tj3Var2.m22124i(ty1Var) | tj3Var2.m22120g(str);
                    objM22097O = tj3Var2.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new az7(context, ty1Var, str, i2);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O;
                    objM22097O2 = tj3Var2.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new C3288l7(7);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    ui3 ui3Var = (ui3) objM22097O2;
                    zM22120g = tj3Var2.m22120g(vi3Var);
                    objM22097O3 = tj3Var2.m22097O();
                    if (zM22120g || objM22097O3 == p84Var) {
                        objM22097O3 = new x4a(vi3Var, 20);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    ui3 ui3Var2 = (ui3) objM22097O3;
                    zM22120g2 = tj3Var2.m22120g(vi3Var);
                    objM22097O4 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O4 == p84Var) {
                        objM22097O4 = new x4a(vi3Var, 21);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    AbstractC1234a.m6998a(null, ty1Var, vi3Var2, ui3Var, ui3Var2, (ui3) objM22097O4, tj3Var2, 3072);
                    tj3Var2 = tj3Var2;
                    tj3Var2.m22139q(false);
                } else if (i != 3) {
                    tj3Var2.m22111b0(-1483999325);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(-1484661361);
                    obj4.getClass();
                    Milestone milestone = (Milestone) obj4;
                    boolean zM22124i2 = tj3Var2.m22124i(context) | tj3Var2.m22124i(milestone);
                    Object objM22097O5 = tj3Var2.m22097O();
                    if (zM22124i2 || objM22097O5 == p84Var) {
                        objM22097O5 = new an6(i3, context, milestone);
                        tj3Var2.m22131l0(objM22097O5);
                    }
                    vi3 vi3Var3 = (vi3) objM22097O5;
                    boolean zM22120g3 = tj3Var2.m22120g(vi3Var);
                    Object objM22097O6 = tj3Var2.m22097O();
                    if (zM22120g3 || objM22097O6 == p84Var) {
                        objM22097O6 = new x4a(vi3Var, 22);
                        tj3Var2.m22131l0(objM22097O6);
                    }
                    ui3 ui3Var3 = (ui3) objM22097O6;
                    boolean zM22120g4 = tj3Var2.m22120g(vi3Var);
                    Object objM22097O7 = tj3Var2.m22097O();
                    if (zM22120g4 || objM22097O7 == p84Var) {
                        objM22097O7 = new x4a(vi3Var, 23);
                        tj3Var2.m22131l0(objM22097O7);
                    }
                    AbstractC1234a.m7000c(null, milestone, vi3Var3, ui3Var3, (ui3) objM22097O7, tj3Var2, 0);
                    tj3Var2.m22139q(false);
                }
            } else {
                tj3Var2.m22111b0(-1485595515);
                obj4.getClass();
                ty1Var = (ty1) obj4;
                zM22124i = tj3Var2.m22124i(context) | tj3Var2.m22124i(ty1Var) | tj3Var2.m22120g(str);
                objM22097O = tj3Var2.m22097O();
                if (zM22124i) {
                    objM22097O = new az7(context, ty1Var, str, i2);
                    tj3Var2.m22131l0(objM22097O);
                } else {
                    objM22097O = new az7(context, ty1Var, str, i2);
                    tj3Var2.m22131l0(objM22097O);
                }
                vi3 vi3Var4 = (vi3) objM22097O;
                objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O2);
                }
                ui3 ui3Var4 = (ui3) objM22097O2;
                zM22120g = tj3Var2.m22120g(vi3Var);
                objM22097O3 = tj3Var2.m22097O();
                if (zM22120g) {
                    objM22097O3 = new x4a(vi3Var, 20);
                    tj3Var2.m22131l0(objM22097O3);
                } else {
                    objM22097O3 = new x4a(vi3Var, 20);
                    tj3Var2.m22131l0(objM22097O3);
                }
                ui3 ui3Var5 = (ui3) objM22097O3;
                zM22120g2 = tj3Var2.m22120g(vi3Var);
                objM22097O4 = tj3Var2.m22097O();
                if (zM22120g2) {
                    objM22097O4 = new x4a(vi3Var, 21);
                    tj3Var2.m22131l0(objM22097O4);
                } else {
                    objM22097O4 = new x4a(vi3Var, 21);
                    tj3Var2.m22131l0(objM22097O4);
                }
                AbstractC1234a.m6998a(null, ty1Var, vi3Var4, ui3Var4, ui3Var5, (ui3) objM22097O4, tj3Var2, 3072);
                tj3Var2 = tj3Var2;
                tj3Var2.m22139q(false);
            }
            tj3Var2.m22139q(false);
        }
        return xfa.f68157a;
    }

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
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        String strM17082A;
        boolean z2;
        Object obj4;
        int i = this.f52204a;
        int i2 = 18;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        Object obj5 = this.f52208e;
        Object obj6 = this.f52207d;
        Object obj7 = this.f52205b;
        Object obj8 = this.f52206c;
        switch (i) {
            case 0:
                List list = (List) obj8;
                String str = (String) obj6;
                String str2 = (String) obj5;
                vi3 vi3Var = (vi3) obj7;
                db1 db1Var = (db1) obj;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                db1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((tj3) ye1Var).m22120g(db1Var) ? 4 : 2;
                }
                boolean z3 = (iIntValue & 19) != 18;
                int i3 = iIntValue & 1;
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(i3, z3)) {
                    e16 e16VarM10266b = db1Var.m10266b(b16Var, true);
                    zf1 zf1Var = ge9.f40637a;
                    x17 x17VarM21622e = AbstractC3584sr.m21622e(0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38955d, 1);
                    C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38963l, true, new gm5(28));
                    boolean zM22124i = tj3Var.m22124i(list) | tj3Var.m22120g(str) | tj3Var.m22120g(str2) | tj3Var.m22120g(vi3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new C3445p2(list, str, str2, vi3Var, 0);
                        tj3Var.m22131l0(objM22097O);
                    }
                    fa4.m11642c(e16VarM10266b, null, x17VarM21622e, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 490);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                final vi3 vi3Var2 = (vi3) obj7;
                final de0 de0Var = (de0) obj8;
                final vi3 vi3Var3 = (vi3) obj6;
                final vi3 vi3Var4 = (vi3) obj5;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                    return xfaVar;
                }
                e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var2).f38957f);
                C3661uu c3661uu2 = new C3661uu(ge9.m12515a(tj3Var2).f38952a, true, new gm5(28));
                ec0 ec0Var = nj0.f52791J;
                bb1 bb1VarM230a = ab1.m230a(c3661uu2, ec0Var, tj3Var2, 0);
                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m = tj3Var2.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21607T);
                se1.f60731q.getClass();
                ui3 ui3Var = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
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
                vi3 vi3Var5 = C0352b.f4305h;
                oha.m18000f(tj3Var2, vi3Var5);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                boolean zM22120g = tj3Var2.m22120g(vi3Var2) | tj3Var2.m22124i(de0Var);
                Object objM22097O2 = tj3Var2.m22097O();
                if (zM22120g || objM22097O2 == p84Var) {
                    z = false;
                    final boolean z4 = false ? 1 : 0;
                    objM22097O2 = new ui3() { // from class: ge0
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i4 = z4;
                            xfa xfaVar2 = xfa.f68157a;
                            de0 de0Var2 = de0Var;
                            vi3 vi3Var6 = vi3Var2;
                            switch (i4) {
                                case 0:
                                    vi3Var6.invoke(de0Var2);
                                    break;
                                case 1:
                                    vi3Var6.invoke(Integer.valueOf(de0Var2.f35485a));
                                    break;
                                default:
                                    vi3Var6.invoke(Integer.valueOf(de0Var2.f35485a));
                                    break;
                            }
                            return xfaVar2;
                        }
                    };
                    tj3Var2.m22131l0(objM22097O2);
                } else {
                    z = false;
                }
                e16 e16VarM815b = AbstractC0080f.m815b(null, z, (ui3) objM22097O2, e16VarM4412e, 15);
                sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var2).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var2, 48);
                int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m2 = tj3Var2.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM815b);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var5);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                ge9.m12515a(tj3Var2).getClass();
                ss5.m21702b(de0Var.f35487c, null, c99.m4422o(b16Var, 40.0f), null, null, tj3Var2, 48, 4088);
                as4 as4Var = new as4(1.0f, true);
                bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, ec0Var, tj3Var2, 0);
                int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m3 = tj3Var2.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, as4Var);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, bb1VarM230a2);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var3, tj3Var2, vi3Var5);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c3);
                lw9.m16554b(de0Var.f35486b, null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71404h, tj3Var2, 1572864, 0, 131006);
                if (de0Var.m10306a()) {
                    tj3Var2.m22111b0(-1427923384);
                    strM17082A = vz1.m23620a0(tj3Var2, com.lingq.feature.challenges.R$string.challenge_book_completed);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(-1427813799);
                    tj3Var2.m22139q(false);
                    strM17082A = AbstractC3352my.m17082A(de0Var.f35489e);
                }
                lw9.m16554b(strM17082A, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71409m, tj3Var2, 0, 0, 131070);
                tj3Var2.m22139q(true);
                tj3Var2.m22139q(true);
                e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                boolean zM22124i2 = tj3Var2.m22124i(de0Var);
                Object objM22097O3 = tj3Var2.m22097O();
                if (zM22124i2 || objM22097O3 == p84Var) {
                    objM22097O3 = new C3539rk(de0Var, 2);
                    tj3Var2.m22131l0(objM22097O3);
                }
                dn7.m10494c((ui3) objM22097O3, e16VarM4412e2, 0L, 0L, 0, 0.0f, null, tj3Var2, 48, 124);
                if (de0Var.m10306a()) {
                    z2 = true;
                    tj3Var2.m22111b0(984663767);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(984155398);
                    e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37237c, nj0.f52817l, tj3Var2, 6);
                    int iHashCode4 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m4 = tj3Var2.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e3);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a2);
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m4);
                    AbstractC3393o1.m17747v(iHashCode4, tj3Var2, zi3Var3, tj3Var2, vi3Var5);
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c4);
                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var3) | tj3Var2.m22124i(de0Var);
                    Object objM22097O4 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O4 == p84Var) {
                        final int i4 = 1;
                        objM22097O4 = new ui3() { // from class: ge0
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i5 = i4;
                                xfa xfaVar2 = xfa.f68157a;
                                de0 de0Var2 = de0Var;
                                vi3 vi3Var6 = vi3Var3;
                                switch (i5) {
                                    case 0:
                                        vi3Var6.invoke(de0Var2);
                                        break;
                                    case 1:
                                        vi3Var6.invoke(Integer.valueOf(de0Var2.f35485a));
                                        break;
                                    default:
                                        vi3Var6.invoke(Integer.valueOf(de0Var2.f35485a));
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var2, (ui3) objM22097O4, anb.f934c, null, null, null, false);
                    boolean zM22120g3 = tj3Var2.m22120g(vi3Var4) | tj3Var2.m22124i(de0Var);
                    Object objM22097O5 = tj3Var2.m22097O();
                    if (zM22120g3 || objM22097O5 == p84Var) {
                        final int i5 = 2;
                        objM22097O5 = new ui3() { // from class: ge0
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i6 = i5;
                                xfa xfaVar2 = xfa.f68157a;
                                de0 de0Var2 = de0Var;
                                vi3 vi3Var6 = vi3Var4;
                                switch (i6) {
                                    case 0:
                                        vi3Var6.invoke(de0Var2);
                                        break;
                                    case 1:
                                        vi3Var6.invoke(Integer.valueOf(de0Var2.f35485a));
                                        break;
                                    default:
                                        vi3Var6.invoke(Integer.valueOf(de0Var2.f35485a));
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O5);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var2, (ui3) objM22097O5, anb.f935d, null, null, null, false);
                    z2 = true;
                    tj3Var2.m22139q(true);
                    tj3Var2.m22139q(false);
                }
                tj3Var2.m22139q(z2);
                return xfaVar;
            case 2:
                zi3 zi3Var5 = (zi3) obj8;
                sl1 sl1Var = (sl1) obj6;
                aj3 aj3Var = (aj3) obj5;
                ui3 ui3Var2 = (ui3) obj7;
                rl1 rl1Var = (rl1) obj;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((tj3) ye1Var3).m22120g(rl1Var) ? 4 : 2;
                }
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    String str3 = (String) zi3Var5.invoke(tj3Var3, 0);
                    if (vk9.m23391n0(str3)) {
                        l54.m15816c("Label must not be blank");
                    }
                    sl1Var.getClass();
                    do7.f35952a.mo1288f(str3, Boolean.TRUE, rl1Var, aj3Var, ui3Var2, tj3Var3, Integer.valueOf((iIntValue3 << 9) & 7168));
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 3:
                lv1 lv1Var = (lv1) obj8;
                vi3 vi3Var6 = (vi3) obj7;
                ui3 ui3Var3 = (ui3) obj6;
                vi3 vi3Var7 = (vi3) obj5;
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zt1 zt1Var = lv1Var.f50172c;
                    List list2 = lv1Var.f50174e;
                    rv1.m20857b(zt1Var, lv1Var.f50170a, null, tj3Var4, 0);
                    if (lv1Var.f50176g == null) {
                        tj3Var4.m22111b0(314436743);
                    } else {
                        tj3Var4.m22111b0(314436744);
                        rv1.m20862g(0, tj3Var4, ui3Var3, null);
                    }
                    tj3Var4.m22139q(false);
                    fz1 fz1Var = lv1Var.f50173d;
                    if (fz1Var == null) {
                        tj3Var4.m22111b0(314523915);
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(314523916);
                        boolean zM22120g4 = tj3Var4.m22120g(vi3Var7);
                        Object objM22097O6 = tj3Var4.m22097O();
                        if (zM22120g4 || objM22097O6 == p84Var) {
                            objM22097O6 = new hv1(vi3Var7, 1);
                            tj3Var4.m22131l0(objM22097O6);
                        }
                        ui3 ui3Var4 = (ui3) objM22097O6;
                        boolean zM22120g5 = tj3Var4.m22120g(vi3Var6);
                        Object objM22097O7 = tj3Var4.m22097O();
                        if (zM22120g5 || objM22097O7 == p84Var) {
                            objM22097O7 = new hv1(vi3Var6, 2);
                            tj3Var4.m22131l0(objM22097O7);
                        }
                        fad.m11680c(fz1Var, ui3Var4, (ui3) objM22097O7, null, tj3Var4, 0);
                        tj3Var4.m22139q(false);
                    }
                    if (list2.isEmpty()) {
                        tj3Var4.m22111b0(315080149);
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(314868729);
                        boolean zM22120g6 = tj3Var4.m22120g(vi3Var6);
                        Object objM22097O8 = tj3Var4.m22097O();
                        if (zM22120g6 || objM22097O8 == p84Var) {
                            objM22097O8 = new hv1(vi3Var6, 3);
                            tj3Var4.m22131l0(objM22097O8);
                        }
                        rv1.m20864i(0, tj3Var4, (ui3) objM22097O8, null, list2);
                        tj3Var4.m22139q(false);
                    }
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 4:
                String str4 = (String) obj6;
                String str5 = (String) obj5;
                TokenMeaning tokenMeaning = (TokenMeaning) obj8;
                ui3 ui3Var5 = (ui3) obj7;
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC2059d.m8968d(str4, str5, tokenMeaning, ui3Var5, null, tj3Var5, 0);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 5:
                List list3 = (List) obj8;
                Context context = (Context) obj6;
                final vi3 vi3Var8 = (vi3) obj7;
                final t66 t66Var = (t66) obj5;
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    for (final DictionaryLocale dictionaryLocale : u91.m22614f1(list3, new C2993f9(context, true ? 1 : 0))) {
                        C0282a c0282aM4703P = ci8.m4703P(1656191087, new rw1(5, context, dictionaryLocale), tj3Var6);
                        boolean zM22120g7 = tj3Var6.m22120g(vi3Var8) | tj3Var6.m22124i(dictionaryLocale);
                        Object objM22097O9 = tj3Var6.m22097O();
                        if (zM22120g7 || objM22097O9 == p84Var) {
                            final int i6 = false ? 1 : 0;
                            objM22097O9 = new ui3() { // from class: ye2
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i7 = i6;
                                    xfa xfaVar2 = xfa.f68157a;
                                    t66 t66Var2 = t66Var;
                                    DictionaryLocale dictionaryLocale2 = dictionaryLocale;
                                    vi3 vi3Var9 = vi3Var8;
                                    switch (i7) {
                                        case 0:
                                            vi3Var9.invoke(dictionaryLocale2.f19021a);
                                            t66Var2.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            vi3Var9.invoke(new e2a(dictionaryLocale2.f19021a));
                                            t66Var2.setValue(Boolean.FALSE);
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            };
                            tj3Var6.m22131l0(objM22097O9);
                        }
                        AbstractC3003fj.m11886b(c0282aM4703P, (ui3) objM22097O9, null, null, null, false, null, null, tj3Var6, 6, 508);
                    }
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 6:
                String str6 = (String) obj6;
                ui3 ui3Var6 = (ui3) obj8;
                String str7 = (String) obj5;
                wf2 wf2Var = (wf2) obj7;
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    e16 e16VarM4412e4 = c99.m4412e(b16Var, 1.0f);
                    bb1 bb1VarM230a3 = ab1.m230a(new C3661uu(((fe9) tj3Var7.m22128k(ge9.f40637a)).f38956e, true, new gm5(28)), nj0.f52791J, tj3Var7, 0);
                    int iHashCode5 = Long.hashCode(tj3Var7.f62385T);
                    l77 l77VarM22132m5 = tj3Var7.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var7, e16VarM4412e4);
                    se1.f60731q.getClass();
                    ui3 ui3Var7 = C0352b.f4299b;
                    tj3Var7.m22119f0();
                    if (tj3Var7.f62384S) {
                        tj3Var7.m22130l(ui3Var7);
                    } else {
                        tj3Var7.m22137o0();
                    }
                    oha.m18001g(tj3Var7, C0352b.f4303f, bb1VarM230a3);
                    oha.m18001g(tj3Var7, C0352b.f4302e, l77VarM22132m5);
                    oha.m18001g(tj3Var7, C0352b.f4304g, Integer.valueOf(iHashCode5));
                    oha.m18000f(tj3Var7, C0352b.f4305h);
                    oha.m18001g(tj3Var7, C0352b.f4301d, e16VarM1322c5);
                    vf2.m23259a(str6, ui3Var6, tj3Var7, 0);
                    vf2.m23262d(str6, str7, wf2Var.f66750a, wf2Var.f66751b, tj3Var7, 0);
                    tj3Var7.m22139q(true);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 7:
                a13 a13Var = (a13) obj8;
                t17 t17Var = (t17) obj6;
                vi3 vi3Var9 = (vi3) obj7;
                vi3 vi3Var10 = (vi3) obj5;
                ye1 ye1Var8 = (ye1) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((bi0) obj).getClass();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    ycd.m25071a(new f03(a13Var.f58b, t17Var), vi3Var9, vi3Var10, tj3Var8, 0);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 8:
                return m17172d(obj, obj2, obj3);
            case 9:
                fe9 fe9Var = (fe9) obj8;
                lp4 lp4Var = (lp4) obj6;
                vi3 vi3Var11 = (vi3) obj7;
                Context context2 = (Context) obj5;
                t17 t17Var2 = (t17) obj;
                ye1 ye1Var9 = (ye1) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                t17Var2.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((tj3) ye1Var9).m22120g(t17Var2) ? 4 : 2;
                }
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    e16 e16VarM21606S = AbstractC3584sr.m21606S(l70.m15962y(b16Var), t17Var2);
                    ec0 ec0Var2 = nj0.f52792K;
                    C3661uu c3661uu3 = new C3661uu(fe9Var.f38963l, true, new gm5(28));
                    float f = fe9Var.f38960i;
                    x17 x17Var = new x17(f, f, f, f);
                    boolean zM22124i3 = tj3Var9.m22124i(lp4Var) | tj3Var9.m22120g(vi3Var11) | tj3Var9.m22124i(fe9Var) | tj3Var9.m22124i(context2);
                    Object objM22097O10 = tj3Var9.m22097O();
                    if (zM22124i3 || objM22097O10 == p84Var) {
                        C3445p2 c3445p2 = new C3445p2((Object) lp4Var, vi3Var11, (Object) fe9Var, (Object) context2, 13);
                        tj3Var9.m22131l0(c3445p2);
                        objM22097O10 = c3445p2;
                    }
                    fa4.m11642c(e16VarM21606S, null, x17Var, c3661uu3, ec0Var2, null, false, null, (vi3) objM22097O10, tj3Var9, 196608, 458);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 10:
                a85 a85Var = (a85) obj8;
                s65 s65Var = (s65) obj6;
                d4b d4bVar = (d4b) obj5;
                y65 y65Var = (y65) obj7;
                ye1 ye1Var10 = (ye1) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((vv4) obj).getClass();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    qid.m19982b(AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var10.m22128k(ge9.f40637a)).f38957f, 7), ci8.m4703P(-1572927076, new C2919d9(a85Var, s65Var, d4bVar, y65Var, 16), tj3Var10), tj3Var10, 48, 0);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 11:
                fe9 fe9Var2 = (fe9) obj8;
                C3633u2 c3633u2 = (C3633u2) obj5;
                String str8 = (String) obj6;
                vi3 vi3Var12 = (vi3) obj7;
                t17 t17Var3 = (t17) obj;
                ye1 ye1Var11 = (ye1) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                t17Var3.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((tj3) ye1Var11).m22120g(t17Var3) ? 4 : 2;
                }
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    e16 e16VarM21606S2 = AbstractC3584sr.m21606S(l70.m15962y(b16Var), t17Var3);
                    ec0 ec0Var3 = nj0.f52792K;
                    C3661uu c3661uu4 = new C3661uu(fe9Var2.f38963l, true, new gm5(28));
                    float f2 = fe9Var2.f38960i;
                    x17 x17Var2 = new x17(f2, f2, f2, f2);
                    boolean zM22124i4 = tj3Var11.m22124i(c3633u2) | tj3Var11.m22120g(str8) | tj3Var11.m22120g(vi3Var12) | tj3Var11.m22124i(fe9Var2);
                    Object objM22097O11 = tj3Var11.m22097O();
                    if (zM22124i4 || objM22097O11 == p84Var) {
                        C3445p2 c3445p3 = new C3445p2((Object) c3633u2, (Object) str8, vi3Var12, (Object) fe9Var2, 15);
                        tj3Var11.m22131l0(c3445p3);
                        objM22097O11 = c3445p3;
                    }
                    fa4.m11642c(e16VarM21606S2, null, x17Var2, c3661uu4, ec0Var3, null, false, null, (vi3) objM22097O11, tj3Var11, 196608, 458);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
            case 12:
                y27 y27Var = (y27) obj8;
                o39 o39Var = (o39) obj5;
                jl1 jl1Var = (jl1) obj7;
                String str9 = (String) obj6;
                ye1 ye1Var12 = (ye1) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (tj3Var12.m22099R(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    e16 e16VarM4412e5 = c99.m4412e(b16Var, 1.0f);
                    zf1 zf1Var2 = ge9.f40637a;
                    e16 e16VarM21607T2 = AbstractC3584sr.m21607T(e16VarM4412e5, ((fe9) tj3Var12.m22128k(zf1Var2)).f38952a);
                    sj8 sj8VarM20003a3 = qj8.m20003a(new C3661uu(((fe9) tj3Var12.m22128k(zf1Var2)).f38955d, true, new gm5(28)), nj0.f52789H, tj3Var12, 48);
                    int iHashCode6 = Long.hashCode(tj3Var12.f62385T);
                    l77 l77VarM22132m6 = tj3Var12.m22132m();
                    e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var12, e16VarM21607T2);
                    se1.f60731q.getClass();
                    ui3 ui3Var8 = C0352b.f4299b;
                    tj3Var12.m22119f0();
                    if (tj3Var12.f62384S) {
                        tj3Var12.m22130l(ui3Var8);
                    } else {
                        tj3Var12.m22137o0();
                    }
                    oha.m18001g(tj3Var12, C0352b.f4303f, sj8VarM20003a3);
                    oha.m18001g(tj3Var12, C0352b.f4302e, l77VarM22132m6);
                    oha.m18001g(tj3Var12, C0352b.f4304g, Integer.valueOf(iHashCode6));
                    oha.m18000f(tj3Var12, C0352b.f4305h);
                    oha.m18001g(tj3Var12, C0352b.f4301d, e16VarM1322c6);
                    bq1.m4042R(y27Var, null, pb1.m19045o(c99.m4422o(b16Var, 40.0f), o39Var), null, jl1Var, 0.0f, null, tj3Var12, 56, 104);
                    thb.m22044c(tj3Var12, c99.m4426s(b16Var, ((fe9) tj3Var12.m22128k(zf1Var2)).f38952a));
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(str9, null, ((ms5) tj3Var12.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 2, false, 0, 0, null, ((ms5) tj3Var12.m22128k(vh9Var)).f51800b.f71406j, tj3Var12, 1572864, 384, 126906);
                    tj3Var12.m22139q(true);
                } else {
                    tj3Var12.m22102U();
                }
                return xfaVar;
            case 13:
                ArrayList<DictionaryLocale> arrayList = (ArrayList) obj8;
                final vi3 vi3Var13 = (vi3) obj7;
                final t66 t66Var2 = (t66) obj6;
                t66 t66Var3 = (t66) obj5;
                ye1 ye1Var13 = (ye1) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    tj3Var13.m22111b0(-953986374);
                    for (final DictionaryLocale dictionaryLocale2 : arrayList) {
                        C0282a c0282aM4703P2 = ci8.m4703P(-1832676649, new ht6(dictionaryLocale2, 10), tj3Var13);
                        boolean zM22120g8 = tj3Var13.m22120g(vi3Var13) | tj3Var13.m22124i(dictionaryLocale2);
                        Object objM22097O12 = tj3Var13.m22097O();
                        if (zM22120g8 || objM22097O12 == p84Var) {
                            final boolean z5 = true ? 1 : 0;
                            objM22097O12 = new ui3() { // from class: ye2
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i7 = z5;
                                    xfa xfaVar2 = xfa.f68157a;
                                    t66 t66Var4 = t66Var2;
                                    DictionaryLocale dictionaryLocale3 = dictionaryLocale2;
                                    vi3 vi3Var14 = vi3Var13;
                                    switch (i7) {
                                        case 0:
                                            vi3Var14.invoke(dictionaryLocale3.f19021a);
                                            t66Var4.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            vi3Var14.invoke(new e2a(dictionaryLocale3.f19021a));
                                            t66Var4.setValue(Boolean.FALSE);
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            };
                            tj3Var13.m22131l0(objM22097O12);
                        }
                        AbstractC3003fj.m11886b(c0282aM4703P2, (ui3) objM22097O12, null, null, null, false, null, null, tj3Var13, 6, 508);
                    }
                    tj3Var13.m22139q(false);
                    if (((Boolean) t66Var3.getValue()).booleanValue()) {
                        tj3Var13.m22111b0(492598028);
                        tj3Var13.m22139q(false);
                    } else {
                        tj3Var13.m22111b0(491639911);
                        Object objM22097O13 = tj3Var13.m22097O();
                        if (objM22097O13 == p84Var) {
                            obj4 = objM22097O13;
                            do4 do4Var = new do4(26, t66Var3);
                            tj3Var13.m22131l0(do4Var);
                            obj4 = do4Var;
                        }
                        obj4 = objM22097O13;
                        AbstractC3003fj.m11886b(ngc.f52719a, (ui3) obj4, null, null, ngc.f52720b, false, null, null, tj3Var13, 24630, 492);
                        tj3Var13.m22139q(false);
                    }
                } else {
                    tj3Var13.m22102U();
                }
                return xfaVar;
            case 14:
                return m17173g(obj, obj2, obj3);
            case 15:
                sq8 sq8Var = (sq8) obj6;
                t66 t66Var4 = (t66) obj5;
                List list4 = (List) obj8;
                vi3 vi3Var14 = (vi3) obj7;
                ye1 ye1Var14 = (ye1) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (tj3Var14.m22099R(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    e16 e16VarM4412e6 = c99.m4412e(b16Var, 1.0f);
                    zf1 zf1Var3 = ge9.f40637a;
                    ((fe9) tj3Var14.m22128k(zf1Var3)).getClass();
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4416i(e16VarM4412e6, 48.0f, 0.0f, 2), ((fe9) tj3Var14.m22128k(zf1Var3)).f38952a, ((fe9) tj3Var14.m22128k(zf1Var3)).f38955d);
                    sj8 sj8VarM20003a4 = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var14, 54);
                    int iHashCode7 = Long.hashCode(tj3Var14.f62385T);
                    l77 l77VarM22132m7 = tj3Var14.m22132m();
                    e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var14, e16VarM21608U);
                    se1.f60731q.getClass();
                    ui3 ui3Var9 = C0352b.f4299b;
                    tj3Var14.m22119f0();
                    if (tj3Var14.f62384S) {
                        tj3Var14.m22130l(ui3Var9);
                    } else {
                        tj3Var14.m22137o0();
                    }
                    oha.m18001g(tj3Var14, C0352b.f4303f, sj8VarM20003a4);
                    oha.m18001g(tj3Var14, C0352b.f4302e, l77VarM22132m7);
                    oha.m18001g(tj3Var14, C0352b.f4304g, Integer.valueOf(iHashCode7));
                    oha.m18000f(tj3Var14, C0352b.f4305h);
                    oha.m18001g(tj3Var14, C0352b.f4301d, e16VarM1322c7);
                    lw9.m16554b(vz1.m23620a0(tj3Var14, AbstractC3423or.m18255g0(sq8Var.f61266b)), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var14.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var14, 0, 0, 131070);
                    ty3.m22351a(pvc.m19521q(), null, null, 0L, tj3Var14, 48, 12);
                    tj3Var14.m22139q(true);
                    boolean zBooleanValue = ((Boolean) t66Var4.getValue()).booleanValue();
                    Object objM22097O14 = tj3Var14.m22097O();
                    if (objM22097O14 == p84Var) {
                        objM22097O14 = new un7(10, t66Var4);
                        tj3Var14.m22131l0(objM22097O14);
                    }
                    AbstractC3003fj.m11885a(zBooleanValue, (ui3) objM22097O14, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(-643147818, new m91(list4, vi3Var14, t66Var4, true ? 1 : 0), tj3Var14), tj3Var14, 48, 2044);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
            case 16:
                return m17174j(obj, obj2, obj3);
            case 17:
                return m17175k(obj, obj2, obj3);
            case 18:
                wia wiaVar = (wia) obj8;
                bx6 bx6Var = (bx6) obj6;
                t66 t66Var5 = (t66) obj5;
                via viaVar = (via) obj7;
                t17 t17Var4 = (t17) obj;
                ye1 ye1Var15 = (ye1) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                t17Var4.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= ((tj3) ye1Var15).m22120g(t17Var4) ? 4 : 2;
                }
                tj3 tj3Var15 = (tj3) ye1Var15;
                if (tj3Var15.m22099R(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    ArrayList arrayList2 = bx6Var.f9135c;
                    String str10 = (String) t66Var5.getValue();
                    boolean zM22120g9 = tj3Var15.m22120g(t66Var5) | tj3Var15.m22124i(wiaVar) | tj3Var15.m22124i(viaVar);
                    Object objM22097O15 = tj3Var15.m22097O();
                    if (zM22120g9 || objM22097O15 == p84Var) {
                        objM22097O15 = new ws6(wiaVar, viaVar, t66Var5, i2);
                        tj3Var15.m22131l0(objM22097O15);
                    }
                    AbstractC1839a.m8534l(wiaVar, arrayList2, str10, t17Var4, (vi3) objM22097O15, tj3Var15, (iIntValue15 << 9) & 7168);
                } else {
                    tj3Var15.m22102U();
                }
                return xfaVar;
            case 19:
                return m17176l(obj, obj2, obj3);
            case 20:
                return m17177m(obj, obj2, obj3);
            case 21:
                return m17178n(obj, obj2, obj3);
            default:
                n1b n1bVar = (n1b) obj8;
                vi3 vi3Var15 = (vi3) obj7;
                vi3 vi3Var16 = (vi3) obj6;
                t66 t66Var6 = (t66) obj5;
                t17 t17Var5 = (t17) obj;
                ye1 ye1Var16 = (ye1) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                t17Var5.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= ((tj3) ye1Var16).m22120g(t17Var5) ? 4 : 2;
                }
                tj3 tj3Var16 = (tj3) ye1Var16;
                if (tj3Var16.m22099R(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    boolean zM22120g10 = tj3Var16.m22120g(vi3Var16);
                    Object objM22097O16 = tj3Var16.m22097O();
                    if (zM22120g10 || objM22097O16 == p84Var) {
                        objM22097O16 = new rza(vi3Var16, t66Var6, 3);
                        tj3Var16.m22131l0(objM22097O16);
                    }
                    AbstractC2823a.m9735b(n1bVar, vi3Var15, (vi3) objM22097O16, AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), t17Var5), tj3Var16, 0);
                } else {
                    tj3Var16.m22102U();
                }
                return xfaVar;
        }
    }

    public /* synthetic */ C3357n2(zi3 zi3Var, sl1 sl1Var, aj3 aj3Var, ui3 ui3Var) {
        this.f52204a = 2;
        this.f52206c = zi3Var;
        this.f52207d = sl1Var;
        this.f52208e = aj3Var;
        this.f52205b = ui3Var;
    }

    public /* synthetic */ C3357n2(vi3 vi3Var, de0 de0Var, vi3 vi3Var2, vi3 vi3Var3) {
        this.f52204a = 1;
        this.f52205b = vi3Var;
        this.f52206c = de0Var;
        this.f52207d = vi3Var2;
        this.f52208e = vi3Var3;
    }

    public /* synthetic */ C3357n2(Object obj, vi3 vi3Var, Object obj2, Object obj3, int i) {
        this.f52204a = i;
        this.f52206c = obj;
        this.f52205b = vi3Var;
        this.f52207d = obj2;
        this.f52208e = obj3;
    }

    public /* synthetic */ C3357n2(Object obj, Object obj2, vi3 vi3Var, Object obj3, int i) {
        this.f52204a = i;
        this.f52206c = obj;
        this.f52207d = obj2;
        this.f52205b = vi3Var;
        this.f52208e = obj3;
    }

    public /* synthetic */ C3357n2(Object obj, Object obj2, Object obj3, xi3 xi3Var, int i) {
        this.f52204a = i;
        this.f52207d = obj;
        this.f52208e = obj2;
        this.f52206c = obj3;
        this.f52205b = xi3Var;
    }

    public /* synthetic */ C3357n2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f52204a = i;
        this.f52206c = obj;
        this.f52207d = obj2;
        this.f52208e = obj3;
        this.f52205b = obj4;
    }

    public /* synthetic */ C3357n2(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.f52204a = i;
        this.f52207d = obj;
        this.f52206c = obj2;
        this.f52208e = obj3;
        this.f52205b = obj4;
    }

    public /* synthetic */ C3357n2(Object obj, Object obj2, String str, vi3 vi3Var, int i) {
        this.f52204a = i;
        this.f52206c = obj;
        this.f52208e = obj2;
        this.f52207d = str;
        this.f52205b = vi3Var;
    }
}
