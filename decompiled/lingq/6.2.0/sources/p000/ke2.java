package p000;

import androidx.compose.animation.core.C0059a;
import androidx.compose.material3.C0261r;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.database.dao.C1319g;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.entity.LanguageContextEntity;
import com.lingq.core.database.entity.LanguageStatsEntity;
import com.lingq.core.database.entity.LessonBookmarkEntity;
import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.database.entity.LessonStatsEntity;
import com.lingq.core.database.entity.LessonsSimplifiedJoin;
import com.lingq.core.database.entity.StatsCalendarEntity;
import com.lingq.core.database.entity.TranslationSentenceEntity;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import com.lingq.core.domain.model.language.StudyStatsScores;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.download.C1549d;
import com.lingq.feature.dictionary.C2058c;
import com.lingq.feature.dictionary.C2061e;
import com.lingq.feature.dictionary.C2069m;
import com.lingq.feature.search.fastsearch.C2768b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ke2 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47087a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f47088b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f47089c;

    public /* synthetic */ ke2(int i, Object obj, Object obj2) {
        this.f47087a = i;
        this.f47088b = obj;
        this.f47089c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f47087a;
        int i2 = 12;
        int i3 = 19;
        int i4 = 6;
        int i5 = 5;
        int i6 = 4;
        int i7 = 0;
        Object languageStudyStats = null;
        int i8 = 1;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f47089c;
        Object obj3 = this.f47088b;
        switch (i) {
            case 0:
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                List list = ((le2) ((t66) obj3).getValue()).f49540a;
                vu4Var.m23547h(list.size(), null, new C3520r2(7, list), new C0282a(802480018, true, new C2058c(list, (C2061e) obj2)));
                return xfaVar;
            case 1:
                t66 t66Var = (t66) obj3;
                vu4 vu4Var2 = (vu4) obj;
                vu4Var2.getClass();
                List list2 = ((lf2) t66Var.getValue()).f49587f;
                vu4Var2.m23547h(list2.size(), null, new C3520r2(11, list2), new C0282a(802480018, true, new ve0(list2, (C2069m) obj2, t66Var, i6)));
                return xfaVar;
            case 2:
                ub5 ub5Var = (ub5) obj3;
                ((ai2) obj).getClass();
                q03 q03Var = new q03((C2768b) obj2, i7);
                ub5Var.mo256K().mo21323g(q03Var);
                return new j91(i8, ub5Var, q03Var);
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                C3244l c3244l = ((C1549d) obj3).f20230g;
                uj2 uj2Var = new uj2((ReaderFont) obj2, iIntValue);
                c3244l.getClass();
                c3244l.m15572j(null, uj2Var);
                return xfaVar;
            case 4:
                C3211a c3211a = (C3211a) obj2;
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    c3211a.mo4677k(xfaVar);
                }
                return xfaVar;
            case 5:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) obj2;
                dr5 dr5Var = (dr5) obj;
                if (ref$IntRef.f47716a == -1) {
                    ref$IntRef.f47716a = dr5Var.m10611b().f40379a;
                }
                ref$IntRef2.f47716a = dr5Var.m10611b().f40380b + 1;
                return "";
            case 6:
                String str = (String) obj2;
                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                mutablePreferences.set(wr3.f67202d, str);
                ((wr3) obj3).m24135d(mutablePreferences, str);
                return null;
            case 7:
                C3500qj c3500qj = (C3500qj) obj3;
                C0358h c0358h = (C0358h) obj;
                c0358h.m1614b();
                C0059a c0059a = ((C0261r) obj2).f3623T;
                c0059a.getClass();
                InterfaceC0310a.m1413G0(c0358h, c3500qj, new pd9(((aa1) c0059a.m745d()).f414a), 0.0f, null, null, 60);
                return xfaVar;
            case 8:
                vi3 vi3Var = (vi3) obj3;
                ra4 ra4Var = (ra4) obj2;
                vu4 vu4Var3 = (vu4) obj;
                vu4Var3.getClass();
                vu4.m23545g(vu4Var3, null, new C0282a(-1720912401, true, new qe0(vi3Var, i3)), 3);
                vu4.m23545g(vu4Var3, null, xqb.f68553a, 3);
                vu4.m23545g(vu4Var3, null, xqb.f68554b, 3);
                vu4.m23545g(vu4Var3, null, new C0282a(-784747544, true, new C3180kd(22, ra4Var, vi3Var)), 3);
                vu4.m23545g(vu4Var3, null, new C0282a(433532073, true, new se0(ra4Var, i2)), 3);
                return xfaVar;
            case 9:
                dh9 dh9Var = (dh9) obj2;
                q98 q98Var = (q98) obj;
                q98Var.getClass();
                q98Var.m19828x(omd.m18157m(AbstractC3184kh.m15194A((String) obj3) ? 1.0f : 0.0f, 1.0f));
                q98Var.m19823p(((Number) dh9Var.getValue()).floatValue());
                q98Var.m19824q(((Number) dh9Var.getValue()).floatValue());
                q98Var.m19813c(q98Var.f57473d);
                return xfaVar;
            case 10:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                return Long.valueOf(((ul4) obj3).f64043L.m3842X(bk8Var, (LanguageContextEntity) obj2));
            case 11:
                vu4 vu4Var4 = (vu4) obj;
                vu4Var4.getClass();
                List list3 = ((an4) obj3).f876a;
                vu4Var4.m23547h(list3.size(), new ue0(9, new qy3(11), list3), new C3520r2(15, list3), new C0282a(802480018, true, new df2(i8, (vi3) obj2, list3)));
                return xfaVar;
            case 12:
                zi3 zi3Var = (zi3) obj2;
                ((LanguageProgressMetric) obj).getClass();
                yh9 yh9Var = (yh9) ((zh9) obj3);
                LanguageProgressMetric languageProgressMetric = yh9Var.f69853b.f8547a;
                if (languageProgressMetric != null) {
                    zi3Var.invoke(yh9Var.f69852a, languageProgressMetric);
                }
                return xfaVar;
            case 13:
                String str2 = (String) obj3;
                C1319g c1319g = (C1319g) obj2;
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e0 = bk8Var2.mo2873e0("SELECT `language`, `dailyGoal`, `streakDays`, `coins`, `knownWords`, `dailyScores`, `activityLevel` FROM (SELECT * FROM StudyStatsEntity WHERE code = ?)");
                try {
                    ik8VarMo2873e0.mo2874C(1, str2);
                    if (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(0);
                        int i9 = (int) ik8VarMo2873e0.getLong(1);
                        int i10 = (int) ik8VarMo2873e0.getLong(2);
                        int i11 = (int) ik8VarMo2873e0.getLong(3);
                        int i12 = (int) ik8VarMo2873e0.getLong(4);
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(5);
                        qn3 qn3Var = c1319g.f17028M;
                        qn3Var.getClass();
                        strMo2875L2.getClass();
                        yf4 yf4Var = (yf4) qn3Var.f57974a;
                        yf4Var.getClass();
                        languageStudyStats = new LanguageStudyStats(strMo2875L, i9, i10, i11, i12, (List) yf4Var.m10321a(strMo2875L2, new C2978ev(StudyStatsScores.Companion.serializer())), (int) ik8VarMo2873e0.getLong(6));
                    }
                    return languageStudyStats;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 14:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ((C1319g) obj3).f17032Q.m3841W(bk8Var3, (LanguageStatsEntity) obj2);
                return xfaVar;
            case 15:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ((C1319g) obj3).f17033R.m3841W(bk8Var4, (StatsCalendarEntity) obj2);
                return xfaVar;
            case 16:
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ((C1319g) obj3).f17029N.m3840V(bk8Var5, (ArrayList) obj2);
                return xfaVar;
            case 17:
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ((hx4) obj3).f43097b.m3840V(bk8Var6, (ArrayList) obj2);
                return xfaVar;
            case 18:
                b32 b32Var = (b32) obj3;
                vu4 vu4Var5 = (vu4) obj;
                vu4Var5.getClass();
                vu4.m23545g(vu4Var5, null, atb.f7475b, 3);
                vu4.m23545g(vu4Var5, null, atb.f7476c, 3);
                List list4 = b32Var.f7836a;
                vu4Var5.m23547h(list4.size(), new ue0(i2, new ry4(i6), list4), new C3520r2(18, list4), new C0282a(802480018, true, new ve0(i5, (vi3) obj2, list4, b32Var)));
                return xfaVar;
            case 19:
                e1b e1bVar = (e1b) obj3;
                vu4 vu4Var6 = (vu4) obj;
                vu4Var6.getClass();
                vu4.m23545g(vu4Var6, null, new C0282a(973057537, true, new se0(e1bVar, i3)), 3);
                vu4.m23545g(vu4Var6, null, gtb.f41312d, 3);
                List list5 = e1bVar.f36582a;
                vu4Var6.m23547h(list5.size(), new ue0(13, new ry4(i5), list5), new C3520r2(19, list5), new C0282a(802480018, true, new ve0(i4, (vi3) obj2, list5, e1bVar)));
                return xfaVar;
            case 20:
                bk8 bk8Var7 = (bk8) obj;
                bk8Var7.getClass();
                ((q05) obj3).f57075O.m21729K(bk8Var7, (TranslationSentenceEntity) obj2);
                return xfaVar;
            case 21:
                bk8 bk8Var8 = (bk8) obj;
                bk8Var8.getClass();
                ((q05) obj3).f57080T.m3841W(bk8Var8, (LessonBookmarkEntity) obj2);
                return xfaVar;
            case 22:
                bk8 bk8Var9 = (bk8) obj;
                bk8Var9.getClass();
                return Integer.valueOf(((q05) obj3).f57072L.m21729K(bk8Var9, (r45) obj2));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                bk8 bk8Var10 = (bk8) obj;
                bk8Var10.getClass();
                ((q05) obj3).f57081U.m3841W(bk8Var10, (LessonStatsEntity) obj2);
                return xfaVar;
            case 24:
                bk8 bk8Var11 = (bk8) obj;
                bk8Var11.getClass();
                return Integer.valueOf(((q05) obj3).f57074N.m21729K(bk8Var11, (l65) obj2));
            case 25:
                String str3 = (String) obj3;
                q05 q05Var = (q05) obj2;
                bk8 bk8Var12 = (bk8) obj;
                bk8Var12.getClass();
                ik8 ik8VarMo2873e1 = bk8Var12.mo2873e0("SELECT `tokens`, `text`, `normalizedText`, `index`, `timestamp`, `startParagraph`, `url`, `opentag` FROM (SELECT * FROM LessonSentenceEntity WHERE normalizedText LIKE '%' ||? || '%' ORDER BY `index` LIMIT 1)");
                try {
                    ik8VarMo2873e1.mo2874C(1, str3);
                    if (ik8VarMo2873e1.mo2876a0()) {
                        List listM20063R = q05Var.f57073M.m20063R(ik8VarMo2873e1.mo2875L(0));
                        String strMo2875L3 = ik8VarMo2873e1.isNull(1) ? null : ik8VarMo2873e1.mo2875L(1);
                        String strMo2875L4 = ik8VarMo2873e1.isNull(2) ? null : ik8VarMo2873e1.mo2875L(2);
                        int i13 = (int) ik8VarMo2873e1.getLong(3);
                        String strMo2875L5 = ik8VarMo2873e1.isNull(4) ? null : ik8VarMo2873e1.mo2875L(4);
                        languageStudyStats = new LessonSentence(listM20063R, strMo2875L3, strMo2875L4, i13, strMo2875L5 == null ? null : q05Var.f57073M.m20055J(strMo2875L5), ((int) ik8VarMo2873e1.getLong(5)) != 0, ik8VarMo2873e1.isNull(6) ? null : ik8VarMo2873e1.mo2875L(6), ik8VarMo2873e1.isNull(7) ? null : ik8VarMo2873e1.mo2875L(7));
                    }
                    return languageStudyStats;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 26:
                bk8 bk8Var13 = (bk8) obj;
                bk8Var13.getClass();
                ((q05) obj3).f57077Q.m3841W(bk8Var13, (m55) obj2);
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                bk8 bk8Var14 = (bk8) obj;
                bk8Var14.getClass();
                return Long.valueOf(((q05) obj3).f57076P.m3842X(bk8Var14, (LessonEntity) obj2));
            case 28:
                bk8 bk8Var15 = (bk8) obj;
                bk8Var15.getClass();
                ((q05) obj3).f57090d0.m3841W(bk8Var15, (LessonsSimplifiedJoin) obj2);
                return xfaVar;
            default:
                bk8 bk8Var16 = (bk8) obj;
                bk8Var16.getClass();
                ((C1321i) obj3).f17041R.m3840V(bk8Var16, (List) obj2);
                return xfaVar;
        }
    }
}
