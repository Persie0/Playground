package p000;

import android.content.Context;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.text.contextmenu.provider.C0175a;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.material.R$attr;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.premium.AbstractC1839a;
import com.lingq.core.premium.C1840b;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.feature.dictionary.AbstractC2059d;
import com.lingq.feature.lessoninfo.AbstractC2131b;
import com.lingq.feature.library.p013ui.components.ReportScope;
import com.lingq.feature.onboarding.auth.registration.C2196e;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import com.lingq.feature.reader.R$drawable;
import com.lingq.feature.reader.R$string;
import com.lingq.feature.reader.reader.AbstractC2501g;
import com.lingq.feature.reader.stats.p019ui.components.AbstractC2558b;
import com.lingq.feature.search.fastsearch.AbstractC2767a;
import com.lingq.feature.search.fastsearch.C2768b;
import com.lingq.feature.search.filter.components.AbstractC2771a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: d9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2919d9 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35191b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35192c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f35193d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f35194e;

    public /* synthetic */ C2919d9(rv2 rv2Var, String str, ui3 ui3Var, ui3 ui3Var2) {
        this.f35190a = 15;
        this.f35191b = rv2Var;
        this.f35192c = str;
        this.f35194e = ui3Var;
        this.f35193d = ui3Var2;
    }

    /* JADX INFO: renamed from: d */
    private final Object m10166d(Object obj, Object obj2) {
        b16 b16Var;
        int iIntValue;
        a85 a85Var = (a85) this.f35191b;
        s65 s65Var = (s65) this.f35192c;
        d4b d4bVar = (d4b) this.f35193d;
        y65 y65Var = (y65) this.f35194e;
        ye1 ye1Var = (ye1) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var2, 1.0f), ge9.m12515a(tj3Var).f38957f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
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
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            fc0 fc0Var = nj0.f52789H;
            e41 e41Var = eh0.f37240f;
            e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(e41Var, fc0Var, tj3Var, 54);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            bq1.m4042R(AbstractC3423or.m18236U(AbstractC3423or.m18282v(context, y65Var.f69373f), tj3Var, 0), null, pb1.m19045o(c99.m4422o(b16Var2, 40.0f), p58.m18901i(tj3Var).f64857c), null, hl1.f42564a, 0.0f, null, tj3Var, 24632, 104);
            thb.m22044c(tj3Var, c99.m4426s(b16Var2, ge9.m12515a(tj3Var).f38952a));
            String strM23618Z = vz1.m23618Z(R$string.complete_language_progress, new Object[]{AbstractC3352my.m17093L(context, y65Var.f69373f)}, tj3Var);
            long j = p58.m18900f(tj3Var).f55873q;
            vx9 vx9Var = p58.m18902j(tj3Var).f71402f;
            bc3 bc3Var = bc3.f8324j;
            lw9.m16554b(strM23618Z, null, j, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 1572864, 0, 131002);
            tj3Var.m22139q(true);
            e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4412e(b16Var2, 1.0f), 0.0f, ge9.m12515a(tj3Var).f38957f, 0.0f, 0.0f, 13);
            Integer num = s65Var.f60413g;
            if (num != null) {
                iIntValue = num.intValue();
                b16Var = b16Var2;
            } else {
                b16Var = b16Var2;
                iIntValue = 0;
            }
            b16 b16Var3 = b16Var;
            phd.m19147a(e16VarM21611X, a85Var, iIntValue, tj3Var, 0, 0);
            if (d4bVar instanceof c4b) {
                tj3Var.m22111b0(1507962007);
                e16 e16VarM21611X2 = AbstractC3584sr.m21611X(c99.m4412e(b16Var3, 1.0f), 0.0f, ge9.m12515a(tj3Var).f38957f, 0.0f, 0.0f, 13);
                sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var, 48);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
                ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_stats_calendar, tj3Var, 0), vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.stats_seven_day_activity), AbstractC3584sr.m21611X(wq1.m24108d(tj3Var, b16Var3, 24.0f), 0.0f, 0.0f, ge9.m12515a(tj3Var).f38955d, 0.0f, 11), 0L, tj3Var, 8, 8);
                lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.stats_seven_day_activity), null, p58.m18900f(tj3Var).f55873q, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 1572864, 0, 131002);
                tj3Var.m22139q(true);
                thb.m22044c(tj3Var, c99.m4414g(b16Var3, ge9.m12515a(tj3Var).f38952a));
                c4b c4bVar = (c4b) d4bVar;
                y1d.m24846a(LanguageProgressMetric.LingQsCreated, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.complete_lingqs_created), c4bVar.f9497g, c4bVar.f9498h, c4bVar.f9499i, tj3Var, 6);
                thb.m22044c(tj3Var, c99.m4414g(b16Var3, ge9.m12515a(tj3Var).f38952a));
                y1d.m24846a(LanguageProgressMetric.ListeningHours, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.stats_hours_listening), c4bVar.f9494d, c4bVar.f9495e, c4bVar.f9496f, tj3Var, 6);
                thb.m22044c(tj3Var, c99.m4414g(b16Var3, ge9.m12515a(tj3Var).f38952a));
                y1d.m24846a(LanguageProgressMetric.WordsOfReading, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.language_stats_words_read), c4bVar.f9491a, c4bVar.f9492b, c4bVar.f9493c, tj3Var, 6);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1510722960);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: g */
    private final Object m10167g(Object obj, Object obj2) {
        ec0 ec0Var;
        ui3 ui3Var;
        zi3 zi3Var;
        b16 b16Var;
        zi3 zi3Var2;
        zi3 zi3Var3;
        vi3 vi3Var;
        zi3 zi3Var4;
        final ?? r0;
        t66 t66Var;
        C3587su c3587su;
        tj3 tj3Var;
        Object obj3;
        tj3 tj3Var2;
        t66 t66Var2;
        final t66 t66Var3;
        String str = (String) this.f35192c;
        List list = (List) this.f35191b;
        t66 t66Var4 = (t66) this.f35193d;
        t66 t66Var5 = (t66) this.f35194e;
        ye1 ye1Var = (ye1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        tj3 tj3Var3 = (tj3) ye1Var;
        if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
            C3587su c3587su2 = eh0.f37238d;
            ec0 ec0Var2 = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(c3587su2, ec0Var2, tj3Var3, 0);
            int iHashCode = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m = tj3Var3.m22132m();
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, b16Var2);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var2);
            } else {
                tj3Var3.m22137o0();
            }
            zi3 zi3Var5 = C0352b.f4303f;
            oha.m18001g(tj3Var3, zi3Var5, bb1VarM230a);
            zi3 zi3Var6 = C0352b.f4302e;
            oha.m18001g(tj3Var3, zi3Var6, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var7 = C0352b.f4304g;
            oha.m18001g(tj3Var3, zi3Var7, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var3, vi3Var2);
            zi3 zi3Var8 = C0352b.f4301d;
            oha.m18001g(tj3Var3, zi3Var8, e16VarM1322c);
            if (str == null) {
                tj3Var3.m22111b0(1376965413);
                tj3Var3.m22139q(false);
                c3587su = c3587su2;
                t66Var = t66Var4;
                zi3Var2 = zi3Var8;
                ec0Var = ec0Var2;
                zi3Var3 = zi3Var6;
                vi3Var = vi3Var2;
                r0 = 0;
                zi3Var4 = zi3Var7;
                b16Var = b16Var2;
                ui3Var = ui3Var2;
                zi3Var = zi3Var5;
                tj3Var = tj3Var3;
            } else {
                tj3Var3.m22111b0(1376965414);
                ec0Var = ec0Var2;
                ui3Var = ui3Var2;
                zi3Var = zi3Var5;
                b16Var = b16Var2;
                zi3Var2 = zi3Var8;
                zi3Var3 = zi3Var6;
                vi3Var = vi3Var2;
                zi3Var4 = zi3Var7;
                r0 = 0;
                t66Var = t66Var4;
                lw9.m16554b(str, AbstractC3584sr.m21611X(b16Var2, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38956e, 7), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var3, 0, 0, 131068);
                tj3 tj3Var4 = tj3Var3;
                tj3Var4.m22139q(false);
                c3587su = c3587su2;
                tj3Var = tj3Var4;
            }
            bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var, r0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            b16 b16Var3 = b16Var;
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var3);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var4, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var2, e16VarM1322c2);
            tj3Var.m22111b0(983146895);
            Iterator it = list.iterator();
            tj3 tj3Var5 = tj3Var;
            while (true) {
                boolean zHasNext = it.hasNext();
                obj3 = we1.f66679a;
                if (!zHasNext) {
                    break;
                }
                final ReportScope reportScope = (ReportScope) it.next();
                e16 e16VarM4412e = c99.m4412e(b16Var3, 1.0f);
                boolean zM22116e = tj3Var5.m22116e(reportScope.ordinal());
                Object objM22097O = tj3Var5.m22097O();
                if (zM22116e || objM22097O == obj3) {
                    t66Var3 = t66Var;
                    objM22097O = new ui3() { // from class: o68
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i = r0;
                            xfa xfaVar = xfa.f68157a;
                            t66 t66Var6 = t66Var3;
                            ReportScope reportScope2 = reportScope;
                            switch (i) {
                                case 0:
                                    t66Var6.setValue(reportScope2);
                                    break;
                                default:
                                    t66Var6.setValue(reportScope2);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var5.m22131l0(objM22097O);
                } else {
                    t66Var3 = t66Var;
                }
                e16 e16VarM815b = AbstractC0080f.m815b(null, r0, (ui3) objM22097O, e16VarM4412e, 15);
                zf1 zf1Var = ge9.f40637a;
                e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM815b, 0.0f, ((fe9) tj3Var5.m22128k(zf1Var)).f38954c, 1);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var5, 48);
                int iHashCode3 = Long.hashCode(tj3Var5.f62385T);
                l77 l77VarM22132m3 = tj3Var5.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var5, e16VarM21609V);
                se1.f60731q.getClass();
                ui3 ui3Var3 = C0352b.f4299b;
                tj3Var5.m22119f0();
                if (tj3Var5.f62384S) {
                    tj3Var5.m22130l(ui3Var3);
                } else {
                    tj3Var5.m22137o0();
                }
                oha.m18001g(tj3Var5, C0352b.f4303f, sj8VarM20003a);
                oha.m18001g(tj3Var5, C0352b.f4302e, l77VarM22132m3);
                oha.m18001g(tj3Var5, C0352b.f4304g, Integer.valueOf(iHashCode3));
                oha.m18000f(tj3Var5, C0352b.f4305h);
                oha.m18001g(tj3Var5, C0352b.f4301d, e16VarM1322c3);
                boolean z = ((ReportScope) t66Var3.getValue()) == reportScope ? 1 : r0;
                boolean zM22116e2 = tj3Var5.m22116e(reportScope.ordinal());
                Object objM22097O2 = tj3Var5.m22097O();
                if (zM22116e2 || objM22097O2 == obj3) {
                    final int i = 1;
                    objM22097O2 = new ui3() { // from class: o68
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i2 = i;
                            xfa xfaVar = xfa.f68157a;
                            t66 t66Var6 = t66Var3;
                            ReportScope reportScope2 = reportScope;
                            switch (i2) {
                                case 0:
                                    t66Var6.setValue(reportScope2);
                                    break;
                                default:
                                    t66Var6.setValue(reportScope2);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var5.m22131l0(objM22097O2);
                }
                kic.m15264a(z, (ui3) objM22097O2, null, false, null, tj3Var5, 0);
                tj3 tj3Var6 = tj3Var5;
                lw9.m16554b(vz1.m23620a0(tj3Var5, reportScope.getDisplayResId()), AbstractC3584sr.m21611X(b16Var3, ((fe9) tj3Var5.m22128k(zf1Var)).f38952a, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var6, 0, 0, 131068);
                tj3 tj3Var7 = tj3Var6;
                tj3Var7.m22139q(true);
                t66Var = t66Var3;
                tj3Var5 = tj3Var7;
            }
            t66 t66Var6 = t66Var;
            tj3Var5.m22139q(r0);
            tj3Var5.m22139q(true);
            thb.m22044c(tj3Var5, c99.m4414g(b16Var3, ((fe9) tj3Var5.m22128k(ge9.f40637a)).f38956e));
            if (((ReportScope) t66Var6.getValue()) != null) {
                tj3Var5.m22111b0(1378500410);
                int i2 = ((ReportScope) t66Var6.getValue()) == ReportScope.Other ? com.lingq.core.p012ui.R$string.report_reason : com.lingq.core.p012ui.R$string.report_provide_details;
                String str2 = (String) t66Var5.getValue();
                e16 e16VarM4412e2 = c99.m4412e(b16Var3, 1.0f);
                Object objM22097O3 = tj3Var5.m22097O();
                if (objM22097O3 == obj3) {
                    t66Var2 = t66Var5;
                    objM22097O3 = new dt6(10, t66Var2);
                    tj3Var5.m22131l0(objM22097O3);
                } else {
                    t66Var2 = t66Var5;
                }
                tj3 tj3Var8 = tj3Var5;
                bna.m3942c(str2, (vi3) objM22097O3, e16VarM4412e2, false, null, ci8.m4703P(-244767097, new ex0(i2, 14), tj3Var5), null, null, null, null, ci8.m4703P(-1643184998, new C0812bj(9, t66Var2), tj3Var5), false, null, null, null, false, 4, 0, null, null, tj3Var8, 1573296, 100663680, 8122296);
                tj3 tj3Var9 = tj3Var8;
                tj3Var9.m22139q(r0);
                tj3Var2 = tj3Var9;
            } else {
                tj3Var5.m22111b0(1379372998);
                tj3Var5.m22139q(r0);
                tj3Var2 = tj3Var5;
            }
            tj3Var2.m22139q(true);
        } else {
            tj3Var3.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m10168j(Object obj, Object obj2) {
        vi3 vi3Var = (vi3) this.f35193d;
        String str = (String) this.f35191b;
        ui3 ui3Var = (ui3) this.f35194e;
        vi3 vi3Var2 = (vi3) this.f35192c;
        ye1 ye1Var = (ye1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
            vh9 vh9Var = ps5.f56764b;
            e16 e16VarM10007D = d32.m10007D(vz1.m23616X(b16.f7762a, 4.0f, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64859e, 0L, 0L, 24), ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55872p, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64859e);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(e16VarM10007D, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, ((fe9) tj3Var.m22128k(zf1Var)).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
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
            boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22120g(str) | tj3Var.m22120g(ui3Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new me7(vi3Var, str, ui3Var, 1);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0231g.m1153f(805306368, 510, null, tj3Var, (ui3) objM22097O, bmc.f8699a, null, null, null, false);
            if (vi3Var2 != null) {
                tj3Var.m22111b0(2026161079);
                boolean zM22120g2 = tj3Var.m22120g(vi3Var2) | tj3Var.m22120g(str) | tj3Var.m22120g(ui3Var);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22120g2 || objM22097O2 == p84Var) {
                    objM22097O2 = new me7(vi3Var2, str, ui3Var, 2);
                    tj3Var.m22131l0(objM22097O2);
                }
                AbstractC0231g.m1153f(805306368, 510, null, tj3Var, (ui3) objM22097O2, bmc.f8700b, null, null, null, false);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2026434003);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        gc0 gc0Var;
        String strM23618Z;
        boolean z2;
        int i = this.f35190a;
        int i2 = 9;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        int i3 = 2;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f35194e;
        Object obj4 = this.f35193d;
        Object obj5 = this.f35192c;
        Object obj6 = this.f35191b;
        switch (i) {
            case 0:
                List list = (List) obj6;
                Context context = (Context) obj5;
                vi3 vi3Var = (vi3) obj4;
                ui3 ui3Var = (ui3) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zM22124i = tj3Var.m22124i(list) | tj3Var.m22124i(context) | tj3Var.m22120g(vi3Var) | tj3Var.m22120g(ui3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        C3445p2 c3445p2 = new C3445p2((Object) list, (Object) context, vi3Var, (Object) ui3Var, 1);
                        tj3Var.m22131l0(c3445p2);
                        objM22097O = c3445p2;
                    }
                    fa4.m11642c(null, null, null, null, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 511);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                e16 e16Var = (e16) obj6;
                t66 t66Var = (t66) obj5;
                C0282a c0282a = (C0282a) obj4;
                C0175a c0175a = (C0175a) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new C0023al(3, t66Var);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    e16 e16VarM24741N = xwc.m24741N(e16Var, (vi3) objM22097O2);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, true);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM24741N);
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
                    c0282a.invoke(tj3Var2, 0);
                    Object objM22097O3 = tj3Var2.m22097O();
                    if (objM22097O3 == p84Var) {
                        z = true;
                        objM22097O3 = new C3799yk(1, t66Var);
                        tj3Var2.m22131l0(objM22097O3);
                    } else {
                        z = true;
                    }
                    c0175a.m1067b(6, tj3Var2, (ui3) objM22097O3);
                    tj3Var2.m22139q(z);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                ComposeView composeView = (ComposeView) obj6;
                Context context2 = (Context) obj5;
                C0282a c0282a2 = (C0282a) obj4;
                t66 t66Var2 = (t66) obj3;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    composeView.setBackgroundColor(jfa.m14431n(context2, R$attr.colorSurfaceContainer));
                    c0282a2.invoke(tj3Var3, 0);
                    t66Var2.setValue(Boolean.TRUE);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 3:
                ((Integer) obj2).getClass();
                q5d.m19674h((e16) obj6, (ArrayList) obj5, (String) obj3, (vi3) obj4, (ye1) obj, pk9.m19383z(7));
                return xfaVar;
            case 4:
                ((Integer) obj2).getClass();
                b6d.m3381a((e16) obj6, (jr0) obj5, (vi3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 5:
                mv3 mv3Var = ss5.f61356d;
                s65 s65Var = (s65) obj6;
                qj9 qj9Var = (qj9) obj5;
                uj9 uj9Var = (uj9) obj4;
                ui3 ui3Var3 = (ui3) obj3;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                gc0 gc0Var2 = nj0.f52808c;
                fc0 fc0Var = nj0.f52789H;
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var4).f38956e);
                    C3587su c3587su = eh0.f37238d;
                    ec0 ec0Var = nj0.f52791J;
                    bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var4, 0);
                    int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m2 = tj3Var4.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, e16VarM21607T);
                    se1.f60731q.getClass();
                    ui3 ui3Var4 = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var4);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var4, zi3Var, bb1VarM230a);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var4, zi3Var3, numValueOf);
                    vi3 vi3Var2 = C0352b.f4305h;
                    oha.m18000f(tj3Var4, vi3Var2);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c2);
                    Integer num = s65Var.f60414h;
                    int i4 = s65Var.f60415i;
                    if ((num != null ? num.intValue() : 0) > 0) {
                        tj3Var4.m22111b0(800481276);
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var4, 48);
                        int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
                        l77 l77VarM22132m3 = tj3Var4.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, e16VarM4412e);
                        tj3Var4.m22119f0();
                        if (tj3Var4.f62384S) {
                            tj3Var4.m22130l(ui3Var4);
                        } else {
                            tj3Var4.m22137o0();
                        }
                        oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a);
                        oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m3);
                        AbstractC3393o1.m17747v(iHashCode3, tj3Var4, zi3Var3, tj3Var4, vi3Var2);
                        oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c3);
                        ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52812g, false);
                        int iHashCode4 = Long.hashCode(tj3Var4.f62385T);
                        l77 l77VarM22132m4 = tj3Var4.m22132m();
                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var4, b16Var);
                        tj3Var4.m22119f0();
                        if (tj3Var4.f62384S) {
                            tj3Var4.m22130l(ui3Var4);
                        } else {
                            tj3Var4.m22137o0();
                        }
                        oha.m18001g(tj3Var4, zi3Var, ht5VarM19966d2);
                        oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m4);
                        AbstractC3393o1.m17747v(iHashCode4, tj3Var4, zi3Var3, tj3Var4, vi3Var2);
                        oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c4);
                        bq1.m4042R(AbstractC3423or.m18236U(ss5.m21728z(i4), tj3Var4, 0), null, wq1.m24108d(tj3Var4, b16Var, 40.0f), null, null, 0.0f, null, tj3Var4, 56, 120);
                        bq1.m4042R(AbstractC3423or.m18236U(com.lingq.core.p012ui.R$drawable.ic_coin_lingq, tj3Var4, 0), null, wq1.m24108d(tj3Var4, b16Var, 16.0f), null, null, 0.0f, new qd0(5, ss5.m21677B(i4)), tj3Var4, 56, 56);
                        tj3Var4.m22139q(true);
                        thb.m22044c(tj3Var4, c99.m4426s(b16Var, ge9.m12515a(tj3Var4).f38952a));
                        int i5 = R$string.stats_coins_plus;
                        Integer num2 = s65Var.f60414h;
                        lw9.m16554b(vz1.m23618Z(i5, new Object[]{Integer.valueOf(num2 != null ? num2.intValue() : 0)}, tj3Var4), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23583a(p58.m18902j(tj3Var4).f71401e, ui0.m22745a(vi0.Companion, vz1.m23605K(new aa1(d32.m10037f(4294940672L)), new aa1(d32.m10037f(4294956367L))), 0.0f, 0.0f, 14), null, 33554430), tj3Var4, 1572864, 0, 131006);
                        tj3Var4.m22139q(true);
                        ux5.m23003z(b16Var, ge9.m12515a(tj3Var4).f38957f, tj3Var4, false);
                    } else {
                        tj3Var4.m22111b0(802382134);
                        tj3Var4.m22139q(false);
                    }
                    if (qj9Var instanceof oj9) {
                        tj3Var4.m22111b0(802482543);
                        qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4412e(b16Var, 1.0f), 50.0f), p58.m18901i(tj3Var4).f64857c), cx2.m9917a(tj3Var4).m4211d(), mv3Var)), tj3Var4, 0);
                        tj3Var4.m22139q(false);
                        gc0Var = gc0Var2;
                    } else {
                        if (!(qj9Var instanceof pj9)) {
                            throw ux5.m23001x(tj3Var4, 1549907817, false);
                        }
                        tj3Var4.m22111b0(803024299);
                        dx1 dx1Var = ((pj9) qj9Var).f56324a;
                        int i6 = dx1Var.f36354b;
                        int i7 = dx1Var.f36355c;
                        float f = i7;
                        float fM15944g = f <= 0.0f ? 0.0f : l70.m15944g(i6 / f, 0.0f, 1.0f);
                        bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var4, 0);
                        int iHashCode5 = Long.hashCode(tj3Var4.f62385T);
                        l77 l77VarM22132m5 = tj3Var4.m22132m();
                        e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var4, b16Var);
                        tj3Var4.m22119f0();
                        float f2 = fM15944g;
                        if (tj3Var4.f62384S) {
                            tj3Var4.m22130l(ui3Var4);
                        } else {
                            tj3Var4.m22137o0();
                        }
                        oha.m18001g(tj3Var4, zi3Var, bb1VarM230a2);
                        oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m5);
                        AbstractC3393o1.m17747v(iHashCode5, tj3Var4, zi3Var3, tj3Var4, vi3Var2);
                        oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c5);
                        e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                        sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37242h, fc0Var, tj3Var4, 54);
                        int iHashCode6 = Long.hashCode(tj3Var4.f62385T);
                        l77 l77VarM22132m6 = tj3Var4.m22132m();
                        e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var4, e16VarM4412e2);
                        tj3Var4.m22119f0();
                        if (tj3Var4.f62384S) {
                            tj3Var4.m22130l(ui3Var4);
                        } else {
                            tj3Var4.m22137o0();
                        }
                        oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a2);
                        oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m6);
                        AbstractC3393o1.m17747v(iHashCode6, tj3Var4, zi3Var3, tj3Var4, vi3Var2);
                        oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c6);
                        lw9.m16554b(vz1.m23620a0(tj3Var4, R$string.stats_todays_progress), null, p58.m18900f(tj3Var4).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var4).f71405i, tj3Var4, 0, 0, 131066);
                        lw9.m16554b(ux5.m22990m(vz1.m23618Z(com.lingq.core.achievements.R$string.stats_coins_goal, new Object[]{Integer.valueOf(dx1Var.f36354b), Integer.valueOf(i7)}, tj3Var4), " 🔥"), null, p58.m18900f(tj3Var4).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var4).f71409m, tj3Var4, 0, 0, 131066);
                        tj3Var4.m22139q(true);
                        e16 e16VarM10007D = d32.m10007D(pb1.m19045o(c99.m4414g(ux5.m22984g(b16Var, ge9.m12515a(tj3Var4).f38952a, tj3Var4, b16Var, 1.0f), 12.0f), ui8.m22753b(6.0f)), p58.m18900f(tj3Var4).f55874r, mv3Var);
                        gc0Var = gc0Var2;
                        ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var, false);
                        int iHashCode7 = Long.hashCode(tj3Var4.f62385T);
                        l77 l77VarM22132m7 = tj3Var4.m22132m();
                        e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var4, e16VarM10007D);
                        tj3Var4.m22119f0();
                        if (tj3Var4.f62384S) {
                            tj3Var4.m22130l(ui3Var4);
                        } else {
                            tj3Var4.m22137o0();
                        }
                        oha.m18001g(tj3Var4, zi3Var, ht5VarM19966d3);
                        oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m7);
                        AbstractC3393o1.m17747v(iHashCode7, tj3Var4, zi3Var3, tj3Var4, vi3Var2);
                        oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c7);
                        qh0.m19963a(d32.m10006C(pb1.m19045o(c99.m4414g(c99.m4412e(b16Var, f2 > 1.0f ? 1.0f : f2), 12.0f), ui8.m22753b(6.0f)), ui0.m22745a(vi0.Companion, vz1.m23605K(new aa1(d32.m10037f(4294940672L)), new aa1(d32.m10037f(4294956367L))), 0.0f, 0.0f, 14)), tj3Var4, 0);
                        tj3Var4.m22139q(true);
                        tj3Var4.m22139q(true);
                        tj3Var4.m22139q(false);
                    }
                    thb.m22044c(tj3Var4, c99.m4414g(b16Var, ge9.m12515a(tj3Var4).f38957f));
                    boolean z3 = uj9Var instanceof tj9;
                    if (z3 || (uj9Var instanceof sj9)) {
                        tj3Var4.m22111b0(805971996);
                        e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                        ht5 ht5VarM19966d4 = qh0.m19966d(gc0Var, false);
                        int iHashCode8 = Long.hashCode(tj3Var4.f62385T);
                        l77 l77VarM22132m8 = tj3Var4.m22132m();
                        e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var4, e16VarM4412e3);
                        tj3Var4.m22119f0();
                        if (tj3Var4.f62384S) {
                            tj3Var4.m22130l(ui3Var4);
                        } else {
                            tj3Var4.m22137o0();
                        }
                        oha.m18001g(tj3Var4, zi3Var, ht5VarM19966d4);
                        oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m8);
                        AbstractC3393o1.m17747v(iHashCode8, tj3Var4, zi3Var3, tj3Var4, vi3Var2);
                        oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c8);
                        gc0 gc0Var3 = nj0.f52811f;
                        ci0 ci0Var = ci0.f10109a;
                        e16 e16VarMo3727a = ci0Var.mo3727a(b16Var, gc0Var3);
                        if (uj9Var instanceof sj9) {
                            tj3Var4.m22111b0(1133464992);
                            strM23618Z = vz1.m23620a0(tj3Var4, com.lingq.core.achievements.R$string.stats_streak);
                            tj3Var4.m22139q(false);
                        } else if (z3) {
                            tj3Var4.m22111b0(1133660261);
                            strM23618Z = vz1.m23618Z(com.lingq.core.achievements.R$string.stats_n_day_streak, new Object[]{Integer.valueOf(((tj9) uj9Var).f62421a)}, tj3Var4);
                            tj3Var4.m22139q(false);
                        } else {
                            if (!(uj9Var instanceof rj9)) {
                                throw ux5.m23001x(tj3Var4, -794722912, false);
                            }
                            tj3Var4.m22111b0(1133996084);
                            tj3Var4.m22139q(false);
                            strM23618Z = "";
                        }
                        lw9.m16554b(strM23618Z, e16VarMo3727a, p58.m18900f(tj3Var4).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var4).f71405i, tj3Var4, 0, 0, 131064);
                        AbstractC0231g.m1153f(805306368, 508, null, tj3Var4, ui3Var3, tob.f62646a, ci0Var.mo3727a(b16Var, nj0.f52813h), null, null, false);
                        z2 = true;
                        tj3Var4.m22139q(true);
                        e5d.m10858b(null, uj9Var, tj3Var4, 384, 1);
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(808149622);
                        tj3Var4.m22139q(false);
                        z2 = true;
                    }
                    tj3Var4.m22139q(z2);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 6:
                ((Integer) obj2).getClass();
                qu1.m20168e((String) obj6, (Integer) obj5, (Integer) obj4, (e16) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 7:
                ((Integer) obj2).getClass();
                fad.m11680c((fz1) obj6, (ui3) obj3, (ui3) obj5, (e16) obj4, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC2059d.m8967c((String) obj6, (String) obj5, (TokenMeaning) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 9:
                ((Integer) obj2).getClass();
                AbstractC2059d.m8975k((e16) obj5, (String) obj3, (List) obj6, (vi3) obj4, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 10:
                ((Integer) obj2).getClass();
                vf2.m23262d((String) obj6, (String) obj5, (MiniLessonTemplate) obj4, (vz5) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC2767a.m9677a((ud6) obj6, (w41) obj5, (bia) obj4, (C2768b) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC1839a.m8527e((C1840b) obj6, (rh3) obj5, (ud6) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 13:
                li3 li3Var = (li3) obj6;
                vi3 vi3Var3 = (vi3) obj4;
                vi3 vi3Var4 = (vi3) obj5;
                String str = (String) obj3;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var5.m22102U();
                    return xfaVar;
                }
                b16 b16Var2 = b16.f7762a;
                e16 e16VarM4428u = c99.m4428u(c99.m4430w(c99.m4412e(AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(thb.m22066y(b16Var2), ge9.m12515a(tj3Var5).f38960i, 0.0f, 2), 0.0f, ge9.m12515a(tj3Var5).f38956e, 0.0f, ge9.m12515a(tj3Var5).f38956e, 5), 1.0f), nj0.f52812g, 2), 0.0f, 600.0f, 1);
                bb1 bb1VarM230a3 = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var5, 48);
                int iHashCode9 = Long.hashCode(tj3Var5.f62385T);
                l77 l77VarM22132m9 = tj3Var5.m22132m();
                e16 e16VarM1322c9 = AbstractC0287b.m1322c(tj3Var5, e16VarM4428u);
                se1.f60731q.getClass();
                ui3 ui3Var5 = C0352b.f4299b;
                tj3Var5.m22119f0();
                if (tj3Var5.f62384S) {
                    tj3Var5.m22130l(ui3Var5);
                } else {
                    tj3Var5.m22137o0();
                }
                zi3 zi3Var5 = C0352b.f4303f;
                oha.m18001g(tj3Var5, zi3Var5, bb1VarM230a3);
                zi3 zi3Var6 = C0352b.f4302e;
                oha.m18001g(tj3Var5, zi3Var6, l77VarM22132m9);
                Integer numValueOf2 = Integer.valueOf(iHashCode9);
                zi3 zi3Var7 = C0352b.f4304g;
                oha.m18001g(tj3Var5, zi3Var7, numValueOf2);
                vi3 vi3Var5 = C0352b.f4305h;
                oha.m18000f(tj3Var5, vi3Var5);
                zi3 zi3Var8 = C0352b.f4301d;
                oha.m18001g(tj3Var5, zi3Var8, e16VarM1322c9);
                boolean z4 = li3Var.f49707j;
                String str2 = li3Var.f49698a;
                String str3 = li3Var.f49699b;
                boolean zM22120g = tj3Var5.m22120g(vi3Var3);
                Object objM22097O4 = tj3Var5.m22097O();
                if (zM22120g || objM22097O4 == p84Var) {
                    objM22097O4 = new nw1(vi3Var3, 9);
                    tj3Var5.m22131l0(objM22097O4);
                }
                ui3 ui3Var6 = (ui3) objM22097O4;
                boolean zM22120g2 = tj3Var5.m22120g(vi3Var3);
                Object objM22097O5 = tj3Var5.m22097O();
                if (zM22120g2 || objM22097O5 == p84Var) {
                    objM22097O5 = new nw1(vi3Var3, 10);
                    tj3Var5.m22131l0(objM22097O5);
                }
                q3c.m19631a(z4, ui3Var6, (ui3) objM22097O5, tj3Var5, 0);
                thb.m22044c(tj3Var5, c99.m4414g(b16Var2, ge9.m12515a(tj3Var5).f38956e));
                if (li3Var.f49706i) {
                    tj3Var5.m22111b0(1536350401);
                    sj8 sj8VarM20003a3 = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var5, 48);
                    int iHashCode10 = Long.hashCode(tj3Var5.f62385T);
                    l77 l77VarM22132m10 = tj3Var5.m22132m();
                    e16 e16VarM1322c10 = AbstractC0287b.m1322c(tj3Var5, b16Var2);
                    tj3Var5.m22119f0();
                    if (tj3Var5.f62384S) {
                        tj3Var5.m22130l(ui3Var5);
                    } else {
                        tj3Var5.m22137o0();
                    }
                    oha.m18001g(tj3Var5, zi3Var5, sj8VarM20003a3);
                    oha.m18001g(tj3Var5, zi3Var6, l77VarM22132m10);
                    AbstractC3393o1.m17747v(iHashCode10, tj3Var5, zi3Var7, tj3Var5, vi3Var5);
                    oha.m18001g(tj3Var5, zi3Var8, e16VarM1322c10);
                    ty3.m22351a(ezc.m11405b(), vz1.m23620a0(tj3Var5, com.lingq.core.premium.R$string.trial_limited_time_offer), null, p58.m18900f(tj3Var5).f55842a, tj3Var5, 0, 4);
                    thb.m22044c(tj3Var5, c99.m4426s(b16Var2, ge9.m12515a(tj3Var5).f38955d));
                    lw9.m16554b(vz1.m23620a0(tj3Var5, com.lingq.core.premium.R$string.trial_limited_time_offer), null, p58.m18900f(tj3Var5).f55842a, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var5).f71407k, tj3Var5, 0, 0, 131066);
                    tj3Var5.m22139q(true);
                    ux5.m23003z(b16Var2, ge9.m12515a(tj3Var5).f38956e, tj3Var5, false);
                } else {
                    tj3Var5.m22111b0(1537226833);
                    tj3Var5.m22139q(false);
                }
                lw9.m16554b(vz1.m23620a0(tj3Var5, com.lingq.core.premium.R$string.free_trial_price_title), null, p58.m18900f(tj3Var5).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var5).f71407k, tj3Var5, 0, 0, 130042);
                long j = p58.m18900f(tj3Var5).f55875s;
                C3341mn c3341mn = new C3341mn();
                if (!vk9.m23391n0(str3) && !str3.equals(str2)) {
                    int iM16932g = c3341mn.m16932g(new he9(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, rt9.f59803d, null, 61438));
                    try {
                        c3341mn.m16929d(str3);
                        c3341mn.m16931f(iM16932g);
                        c3341mn.m16929d(" ");
                    } catch (Throwable th) {
                        c3341mn.m16931f(iM16932g);
                        throw th;
                    }
                }
                int length = c3341mn.f51543a.length();
                c3341mn.m16929d(str);
                int iM23389l0 = vk9.m23389l0(str, str2, 0, false, 6);
                if (str2.length() > 0 && iM23389l0 >= 0) {
                    int i8 = length + iM23389l0;
                    c3341mn.m16927b(new he9(0L, 0L, bc3.f8322h, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), i8, str2.length() + i8);
                }
                lw9.m16555c(c3341mn.m16933h(), AbstractC3584sr.m21611X(b16Var2, 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var5).f38956e, 7), p58.m18900f(tj3Var5).f55875s, null, 0L, null, null, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, p58.m18902j(tj3Var5).f71407k, tj3Var5, 0, 0, 261112);
                e16 e16VarM4412e4 = c99.m4412e(b16Var2, 1.0f);
                boolean zM22120g3 = tj3Var5.m22120g(vi3Var3);
                Object objM22097O6 = tj3Var5.m22097O();
                if (zM22120g3 || objM22097O6 == p84Var) {
                    objM22097O6 = new nw1(vi3Var3, 11);
                    tj3Var5.m22131l0(objM22097O6);
                }
                ss5.m21710f(e16VarM4412e4, null, null, false, (ui3) objM22097O6, hqb.f42801b, tj3Var5, 196614, 14);
                boolean zM22120g4 = tj3Var5.m22120g(vi3Var3) | tj3Var5.m22120g(vi3Var4);
                Object objM22097O7 = tj3Var5.m22097O();
                if (zM22120g4 || objM22097O7 == p84Var) {
                    objM22097O7 = new ei3(vi3Var3, vi3Var4, 0);
                    tj3Var5.m22131l0(objM22097O7);
                }
                AbstractC0231g.m1153f(805306416, 508, null, tj3Var5, (ui3) objM22097O7, hqb.f42802c, b16Var2, null, null, false);
                tj3Var5.m22139q(true);
                return xfaVar;
            case 14:
                ((Integer) obj2).getClass();
                igd.m13905d((e16) obj6, (String) obj5, (ui3) obj3, (ui3) obj4, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 15:
                rv2 rv2Var = (rv2) obj6;
                String str4 = (String) obj5;
                ui3 ui3Var7 = (ui3) obj3;
                ui3 ui3Var8 = (ui3) obj4;
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    int i9 = 15;
                    AbstractC0218a.m1121a(ci8.m4703P(-1485560363, new C3441oz(str4, i9), tj3Var6), null, ci8.m4703P(-1910681641, new C0839c9(i9, ui3Var7), tj3Var6), ci8.m4703P(1533732992, new ze2(i3, ui3Var8), tj3Var6), 0.0f, null, null, rv2Var, null, tj3Var6, 3462, 370);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 16:
                return m10166d(obj, obj2);
            case 17:
                ((Integer) obj2).getClass();
                xz4.m24796d((e16) obj6, (vs3) obj5, (w65) obj3, (vi3) obj4, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 18:
                ((Integer) obj2).getClass();
                vid.m23296a((e16) obj6, (y65) obj5, (ui3) obj3, (ui3) obj4, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 19:
                ((Integer) obj2).getClass();
                AbstractC2131b.m9045d((w35) obj6, (vi3) obj4, (vi3) obj5, (C0269z) obj3, (ye1) obj, pk9.m19383z(49));
                return xfaVar;
            case 20:
                ((Integer) obj2).getClass();
                AbstractC2558b.m9469b((mn5) obj6, (ui3) obj3, (ui3) obj5, (ui3) obj4, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 21:
                ((Integer) obj2).getClass();
                ps5.m19472c((pa1) obj6, (v49) obj5, (zda) obj4, (C0282a) obj3, (ye1) obj, pk9.m19383z(3073));
                return xfaVar;
            case 22:
                ((Integer) obj2).getClass();
                oxb.m18564c((C2196e) obj6, (ui3) obj3, (ui3) obj5, (vi3) obj4, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                AbstractC2501g.m9402c((h24) obj6, (String) obj5, (ui3) obj3, (ui3) obj4, (ye1) obj, pk9.m19383z(7));
                return xfaVar;
            case 24:
                return m10167g(obj, obj2);
            case 25:
                InterfaceC0067f interfaceC0067f = (InterfaceC0067f) obj6;
                ui3 ui3Var9 = (ui3) obj3;
                String str5 = (String) obj4;
                Context context3 = (Context) obj5;
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e16 e16VarM4429v = c99.m4429v(c99.m4431x(b16Var));
                    vs2 vs2VarM772g = AbstractC0070i.m772g(null, 0.5f, 1);
                    fda fdaVarM21703b0 = ss5.m21703b0(400, 60, null, 4);
                    Object objM22097O8 = tj3Var7.m22097O();
                    if (objM22097O8 == p84Var) {
                        objM22097O8 = new qv7(8);
                        tj3Var7.m22131l0(objM22097O8);
                    }
                    vs2 vs2VarM23531a = vs2VarM772g.m23531a(AbstractC0070i.m777l(fdaVarM21703b0, (vi3) objM22097O8));
                    qv2 qv2VarM773h = AbstractC0070i.m773h(null, 3);
                    fda fdaVarM21703b1 = ss5.m21703b0(300, 0, null, 6);
                    Object objM22097O9 = tj3Var7.m22097O();
                    if (objM22097O9 == p84Var) {
                        objM22097O9 = new qv7(i2);
                        tj3Var7.m22131l0(objM22097O9);
                    }
                    e16 e16VarMo764a = interfaceC0067f.mo764a(e16VarM4429v, vs2VarM23531a, qv2VarM773h.m20180a(AbstractC0070i.m779n(fdaVarM21703b1, (vi3) objM22097O9)));
                    vh9 vh9Var = ps5.f56764b;
                    bq1.m4038N(ui3Var9, d32.m10007D(e16VarMo764a, ((ms5) tj3Var7.m22128k(vh9Var)).f51799a.f55872p, ((ms5) tj3Var7.m22128k(vh9Var)).f51801c.f64859e), false, null, null, te1.m22003q(63, 0.0f), null, ci8.m4703P(806274652, new st0(str5, context3), tj3Var7), tj3Var7, 100663296, 220);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 26:
                ((Integer) obj2).getClass();
                AbstractC2771a.m9692b((e16) obj6, (v19) obj5, (zi3) obj4, (zi3) obj3, (ye1) obj, pk9.m19383z(385));
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return m10168j(obj, obj2);
            case 28:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8609y((d39) obj6, (vi3) obj4, (ui3) obj3, (rc2) obj5, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            default:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8606v((e16) obj6, (d39) obj5, (vi3) obj4, (rc2) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
        }
    }

    public /* synthetic */ C2919d9(li3 li3Var, vi3 vi3Var, vi3 vi3Var2, String str) {
        this.f35190a = 13;
        this.f35191b = li3Var;
        this.f35193d = vi3Var;
        this.f35192c = vi3Var2;
        this.f35194e = str;
    }

    public /* synthetic */ C2919d9(vi3 vi3Var, String str, ui3 ui3Var, vi3 vi3Var2) {
        this.f35190a = 27;
        this.f35193d = vi3Var;
        this.f35191b = str;
        this.f35194e = ui3Var;
        this.f35192c = vi3Var2;
    }

    public /* synthetic */ C2919d9(w35 w35Var, vi3 vi3Var, vi3 vi3Var2, C0269z c0269z, int i) {
        this.f35190a = 19;
        this.f35191b = w35Var;
        this.f35193d = vi3Var;
        this.f35192c = vi3Var2;
        this.f35194e = c0269z;
    }

    public /* synthetic */ C2919d9(e16 e16Var, String str, List list, vi3 vi3Var, int i) {
        this.f35190a = 9;
        this.f35192c = e16Var;
        this.f35194e = str;
        this.f35191b = list;
        this.f35193d = vi3Var;
    }

    public /* synthetic */ C2919d9(d39 d39Var, vi3 vi3Var, ui3 ui3Var, rc2 rc2Var, int i) {
        this.f35190a = 28;
        this.f35191b = d39Var;
        this.f35193d = vi3Var;
        this.f35194e = ui3Var;
        this.f35192c = rc2Var;
    }

    public /* synthetic */ C2919d9(InterfaceC0067f interfaceC0067f, ui3 ui3Var, String str, Context context) {
        this.f35190a = 25;
        this.f35191b = interfaceC0067f;
        this.f35194e = ui3Var;
        this.f35193d = str;
        this.f35192c = context;
    }

    public /* synthetic */ C2919d9(Object obj, ui3 ui3Var, ui3 ui3Var2, Object obj2, int i, int i2) {
        this.f35190a = i2;
        this.f35191b = obj;
        this.f35194e = ui3Var;
        this.f35192c = ui3Var2;
        this.f35193d = obj2;
    }

    public /* synthetic */ C2919d9(Object obj, Object obj2, Object obj3, xi3 xi3Var, int i, int i2) {
        this.f35190a = i2;
        this.f35191b = obj;
        this.f35192c = obj2;
        this.f35194e = obj3;
        this.f35193d = xi3Var;
    }

    public /* synthetic */ C2919d9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f35190a = i;
        this.f35191b = obj;
        this.f35192c = obj2;
        this.f35193d = obj3;
        this.f35194e = obj4;
    }

    public /* synthetic */ C2919d9(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f35190a = i2;
        this.f35191b = obj;
        this.f35192c = obj2;
        this.f35193d = obj3;
        this.f35194e = obj4;
    }

    public /* synthetic */ C2919d9(String str, List list, t66 t66Var, t66 t66Var2) {
        this.f35190a = 24;
        this.f35192c = str;
        this.f35191b = list;
        this.f35193d = t66Var;
        this.f35194e = t66Var2;
    }
}
