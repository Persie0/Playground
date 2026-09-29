package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.window.AbstractC0454b;
import com.lingq.core.domain.model.language.ActivityLevel;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import com.lingq.core.domain.model.language.StudyStatsScores;
import com.lingq.core.p012ui.R$string;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b5d {
    /* JADX INFO: renamed from: a */
    public static final void m3323a(boolean z, yx4 yx4Var, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        int i2;
        yx4Var.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1058168931);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (tj3Var.m22124i(yx4Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var.m22124i(ui3Var2) ? 2048 : 1024;
        }
        int i4 = 1;
        if (!tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            tj3Var.m22102U();
        } else if (z) {
            tj3Var.m22111b0(1149534224);
            boolean z2 = (i3 & 896) == 256;
            Object objM22097O = tj3Var.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new xa0(2, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0454b.m1895a((ui3) objM22097O, null, ci8.m4703P(368705487, new C3836zk(yx4Var, ui3Var, ui3Var2, i4), tj3Var), tj3Var, 384, 2);
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22111b0(1151430277);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3294ld(z, yx4Var, ui3Var, ui3Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3324b(ux4 ux4Var, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        int i2;
        ux4Var.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-877112364);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(ux4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(ui3Var2) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4411d(b16Var, 1.0f), ge9.m12515a(tj3Var).f38960i);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
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
            int i3 = i2;
            C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28));
            fc0 fc0Var = nj0.f52817l;
            sj8 sj8VarM20003a = qj8.m20003a(c3661uu, fc0Var, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            bq1.m4041Q(nfb.m17405a(), null, null, new qd0(5, p58.m18900f(tj3Var).f55873q), tj3Var, 48, 60);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.premium_lesson), null, p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71403g, tj3Var, 0, 0, 131066);
            tj3Var.m22139q(true);
            lw9.m16554b(vz1.m23618Z(R$string.not_enough_balance_purchase_lesson_details, new Object[]{Integer.valueOf(ux4Var.f64486a), Integer.valueOf(ux4Var.f64487b)}, tj3Var), AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 13), aa1.m198b(0.6f, p58.m18900f(tj3Var).f55873q), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131064);
            tj3Var = tj3Var;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var, 0);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
            thb.m22044c(tj3Var, e65.m10871c(tj3Var, e16VarM1322c3, zi3Var4, 1.0f, true));
            AbstractC0231g.m1153f(((i3 >> 3) & 14) | 805306368, 510, null, tj3Var, ui3Var, knb.f47565a, null, null, null, false);
            AbstractC0231g.m1153f(((i3 >> 6) & 14) | 805306368, 510, null, tj3Var, ui3Var2, knb.f47566b, null, null, null, false);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(ux4Var, ui3Var, ui3Var2, i, 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m3325c(vx4 vx4Var, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        int i2;
        vx4Var.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1255464836);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(vx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(ui3Var2) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4411d(b16Var, 1.0f), ge9.m12515a(tj3Var).f38960i);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
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
            int i3 = i2;
            C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28));
            fc0 fc0Var = nj0.f52817l;
            sj8 sj8VarM20003a = qj8.m20003a(c3661uu, fc0Var, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            bq1.m4041Q(nfb.m17405a(), null, null, new qd0(5, p58.m18900f(tj3Var).f55873q), tj3Var, 48, 60);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.premium_lesson), null, p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71403g, tj3Var, 0, 0, 131066);
            tj3Var.m22139q(true);
            lw9.m16554b(vz1.m23618Z(R$string.purchase_item_details, new Object[]{Integer.valueOf(vx4Var.f66044a), Integer.valueOf(vx4Var.f66045b)}, tj3Var), AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 13), aa1.m198b(0.6f, p58.m18900f(tj3Var).f55873q), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131064);
            tj3Var = tj3Var;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var, 0);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
            thb.m22044c(tj3Var, e65.m10871c(tj3Var, e16VarM1322c3, zi3Var4, 1.0f, true));
            AbstractC0231g.m1153f(((i3 >> 3) & 14) | 805306368, 510, null, tj3Var, ui3Var, knb.f47567c, null, null, null, false);
            AbstractC0231g.m1153f(((i3 >> 6) & 14) | 805306368, 510, null, tj3Var, ui3Var2, knb.f47568d, null, null, null, false);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(vx4Var, ui3Var, ui3Var2, i, 5);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final fj9 m3326d(LanguageStudyStats languageStudyStats, String str, String str2) {
        languageStudyStats.getClass();
        int i = languageStudyStats.f19108c;
        int i2 = languageStudyStats.f19112g;
        List list = languageStudyStats.f19111f;
        str2.getClass();
        if (str != null) {
            DateTime dateTime = new DateTime();
            int i3 = 1;
            long jM11274g = dateTime.mo18365a().mo18401h().m11274g(7, dateTime.mo18366b());
            if (jM11274g != dateTime.mo18366b()) {
                dateTime = new DateTime(jM11274g, dateTime.mo18365a());
            }
            if (str.compareTo(hy3.f43148E.m14766a(dateTime)) > 0) {
                StudyStatsScores studyStatsScores = (StudyStatsScores) u91.m22597O0(list);
                String str3 = studyStatsScores.f19127b;
                String str4 = str3 == null ? "" : str3;
                int i4 = studyStatsScores.f19128c;
                int i5 = languageStudyStats.f19107b;
                ActivityLevel activityLevel = studyStatsScores.f19129d;
                dx1 dx1Var = new dx1(i4, i5, activityLevel != null ? activityLevel.f19003a : i2, str4, i4 >= i5);
                ArrayList arrayList = new ArrayList();
                arrayList.add(studyStatsScores);
                List listM22610b1 = u91.m22610b1(list);
                for (int i6 = 1; i6 < listM22610b1.size() && ((StudyStatsScores) listM22610b1.get(i6)).f19128c >= languageStudyStats.f19107b; i6++) {
                    arrayList.add(listM22610b1.get(i6));
                }
                Collections.reverse(arrayList);
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str5 = ((StudyStatsScores) it.next()).f19126a;
                    if (str5 == null) {
                        str5 = "";
                    }
                    arrayList2.add(str5);
                }
                MutableDateTime mutableDateTime = new MutableDateTime();
                Locale localeForLanguageTag = Locale.forLanguageTag(cl9.m4839V(str2, "_", "-"));
                mutableDateTime.m18374e().m18378e((-arrayList2.size()) + 1);
                ArrayList arrayList3 = new ArrayList();
                int i7 = 0;
                while (i7 < 7) {
                    String strM18446a = mutableDateTime.m18374e().m18446a(localeForLanguageTag);
                    strM18446a.getClass();
                    arrayList3.add(strM18446a);
                    mutableDateTime.m18374e().m18378e(i3);
                    i7++;
                    i3 = 1;
                }
                if (arrayList.size() < 7) {
                    for (int size = arrayList.size(); size < 7; size++) {
                        arrayList.add(new StudyStatsScores("", "", 0, new ActivityLevel(0, 0)));
                    }
                }
                ArrayList arrayList4 = new ArrayList(v91.m23189q0(arrayList, 10));
                int i8 = 0;
                for (Object obj : arrayList) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    StudyStatsScores studyStatsScores2 = (StudyStatsScores) obj;
                    String str6 = (String) arrayList3.get(i8);
                    int i10 = studyStatsScores2.f19128c;
                    int i11 = languageStudyStats.f19107b;
                    ActivityLevel activityLevel2 = studyStatsScores2.f19129d;
                    int i12 = activityLevel2 != null ? activityLevel2.f19003a : i2;
                    String str7 = studyStatsScores2.f19126a;
                    arrayList4.add(new mj9(str6, i10, str7 == null ? "" : str7, i11, i12));
                    i8 = i9;
                }
                return new fj9(i, arrayList4, dx1Var, 0);
            }
        }
        StudyStatsScores studyStatsScores3 = (StudyStatsScores) u91.m22597O0(list);
        String str8 = studyStatsScores3.f19127b;
        String str9 = str8 == null ? "" : str8;
        int i13 = studyStatsScores3.f19128c;
        int i14 = languageStudyStats.f19107b;
        ActivityLevel activityLevel3 = studyStatsScores3.f19129d;
        dx1 dx1Var2 = new dx1(i13, i14, activityLevel3 != null ? activityLevel3.f19003a : i2, str9, i13 >= i14);
        MutableDateTime mutableDateTime2 = new MutableDateTime();
        Locale localeForLanguageTag2 = Locale.forLanguageTag(cl9.m4839V(str2, "_", "-"));
        mutableDateTime2.m18374e().m18378e(-6);
        ArrayList arrayList5 = new ArrayList();
        for (int i15 = 0; i15 < 7; i15++) {
            String strM18446a2 = mutableDateTime2.m18374e().m18446a(localeForLanguageTag2);
            strM18446a2.getClass();
            arrayList5.add(strM18446a2);
            mutableDateTime2.m18374e().m18378e(1);
        }
        List list2 = list;
        ArrayList arrayList6 = new ArrayList(v91.m23189q0(list2, 10));
        int i16 = 0;
        for (Object obj2 : list2) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                vz1.m23628e0();
                throw null;
            }
            StudyStatsScores studyStatsScores4 = (StudyStatsScores) obj2;
            String str10 = (String) arrayList5.get(i16);
            int i18 = studyStatsScores4.f19128c;
            int i19 = languageStudyStats.f19107b;
            ActivityLevel activityLevel4 = studyStatsScores4.f19129d;
            int i20 = activityLevel4 != null ? activityLevel4.f19003a : i2;
            String str11 = studyStatsScores4.f19126a;
            arrayList6.add(new mj9(str10, i18, str11 == null ? "" : str11, i19, i20));
            i16 = i17;
        }
        return new fj9(i, arrayList6, dx1Var2, 0);
    }
}
