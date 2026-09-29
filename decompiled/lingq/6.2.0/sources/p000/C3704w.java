package p000;

import androidx.compose.animation.core.C0061c;
import androidx.compose.foundation.gestures.C0096d;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.C0358h;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.database.dao.C1315c;
import com.lingq.core.database.dao.C1316d;
import com.lingq.core.database.dao.C1317e;
import com.lingq.core.database.dao.C1318f;
import com.lingq.core.database.dao.C1319g;
import com.lingq.core.database.entity.LanguageContextEntity;
import com.lingq.core.database.entity.LanguageProgressEntity;
import com.lingq.core.database.entity.StreakEntity;
import com.lingq.core.database.entity.StudyStatsEntity;
import com.lingq.core.domain.model.language.LanguageContextNotification;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import com.lingq.core.domain.model.language.StudyStatsScores;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.p012ui.library.CourseContextMenuItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3704w implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66151a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f66152b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f66153c;

    public /* synthetic */ C3704w(int i, Object obj, Object obj2) {
        this.f66151a = i;
        this.f66152b = obj;
        this.f66153c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0444 A[Catch: all -> 0x0326, TryCatch #0 {all -> 0x0326, blocks: (B:63:0x023a, B:65:0x02d1, B:69:0x02ea, B:73:0x02fb, B:75:0x0303, B:80:0x0316, B:84:0x031f, B:88:0x032b, B:92:0x033a, B:96:0x034e, B:100:0x035f, B:102:0x0365, B:107:0x0378, B:111:0x0381, B:113:0x038a, B:117:0x0399, B:122:0x03ab, B:127:0x03c2, B:132:0x03d4, B:136:0x03e0, B:141:0x03f9, B:145:0x0402, B:148:0x040e, B:150:0x0414, B:156:0x0424, B:157:0x0434, B:159:0x043a, B:164:0x0453, B:163:0x0444, B:139:0x03ee, B:135:0x03dc, B:131:0x03cd, B:126:0x03b6, B:121:0x03a4, B:116:0x0393, B:105:0x036d, B:165:0x0461, B:166:0x0468, B:99:0x035b, B:95:0x0343, B:91:0x0334, B:78:0x030b, B:167:0x0469, B:168:0x0470, B:72:0x02f7, B:68:0x02e4), top: B:239:0x023a }] */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        LanguageContextEntity languageContextEntity;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        int i;
        LanguageContextNotification languageContextNotification;
        LanguageContextNotification languageContextNotification2;
        LanguageStudyStats languageStudyStats;
        int i2 = 2;
        int i3 = 0;
        switch (this.f66151a) {
            case 0:
                ((v56) this.f66152b).m23126b((kj7) this.f66153c);
                return xfa.f68157a;
            case 1:
                C0096d c0096d = (C0096d) this.f66152b;
                C0809bg c0809bg = (C0809bg) this.f66153c;
                long jM12826g = gq6.m12826g(c0096d.m845v1() ? -1.0f : 1.0f, ((pk2) obj).f56334a);
                c0809bg.m3692a(c0096d.f2227e0.m851e(Float.intBitsToFloat((int) (c0096d.f2267L == Orientation.Vertical ? jM12826g & 4294967295L : jM12826g >> 32))), 0.0f);
                return xfa.f68157a;
            case 2:
                p60 p60Var = (p60) this.f66152b;
                q60 q60Var = (q60) this.f66153c;
                xfa xfaVar = xfa.f68157a;
                xz9 xz9Var = p60Var.f55628J;
                if (xz9Var != null) {
                    xz9Var.m24800b();
                }
                p60Var.f55628J = null;
                xb1 xb1Var = q60Var.f57305c;
                if (xb1Var != null) {
                    xb1Var.m15505Y(xfaVar);
                }
                q60Var.f57305c = null;
                return xfaVar;
            case 3:
                y60 y60Var = (y60) this.f66152b;
                ke1 ke1Var = (ke1) this.f66153c;
                y60Var.m24951a(ke1Var);
                return new d70(0, y60Var, ke1Var);
            case 4:
                vv9 vv9Var = (vv9) this.f66152b;
                vi3 vi3Var = (vi3) this.f66153c;
                vv9 vv9Var2 = (vv9) obj;
                if (!fa4.m11650l(vv9Var, vv9Var2)) {
                    vi3Var.invoke(vv9Var2);
                }
                return xfa.f68157a;
            case 5:
                C3500qj c3500qj = (C3500qj) this.f66152b;
                vi0 vi0Var = (vi0) this.f66153c;
                C0358h c0358h = (C0358h) obj;
                c0358h.m1614b();
                InterfaceC0310a.m1413G0(c0358h, c3500qj, vi0Var, 0.0f, null, null, 60);
                return xfa.f68157a;
            case 6:
                a07 a07Var = (a07) this.f66152b;
                vi0 vi0Var2 = (vi0) this.f66153c;
                C0358h c0358h2 = (C0358h) obj;
                c0358h2.m1614b();
                InterfaceC0310a.m1413G0(c0358h2, a07Var.f34A, vi0Var2, 0.0f, null, null, 60);
                return xfa.f68157a;
            case 7:
                ((ii0) this.f66152b).f44131a.m24313k((vk1) this.f66153c);
                return xfa.f68157a;
            case 8:
                C1315c c1315c = (C1315c) this.f66152b;
                List list = (List) this.f66153c;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                c1315c.f17004N.m3840V(bk8Var, list);
                return xfa.f68157a;
            case 9:
                C1316d c1316d = (C1316d) this.f66152b;
                List list2 = (List) this.f66153c;
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                return c1316d.f17013L.m3843Y(bk8Var2, list2);
            case 10:
                yw4 yw4Var = (yw4) this.f66152b;
                vi0 vi0Var3 = (vi0) this.f66153c;
                C0358h c0358h3 = (C0358h) obj;
                c0358h3.m1614b();
                if (((Boolean) ((xc9) yw4Var.f70587s).getValue()).booleanValue() || ((Boolean) ((xc9) yw4Var.f70588t).getValue()).booleanValue()) {
                    InterfaceC0310a.m1418s0(c0358h3, vi0Var3, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                return xfa.f68157a;
            case 11:
                C1317e c1317e = (C1317e) this.f66152b;
                xt1 xt1Var = (xt1) this.f66153c;
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                c1317e.f17015b.m3841W(bk8Var3, xt1Var);
                return xfa.f68157a;
            case 12:
                C1318f c1318f = (C1318f) this.f66152b;
                ll4 ll4Var = (ll4) this.f66153c;
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                c1318f.f17025O.m3841W(bk8Var4, ll4Var);
                return xfa.f68157a;
            case 13:
                gh2 gh2Var = (gh2) this.f66152b;
                C3552rx c3552rx = (C3552rx) this.f66153c;
                ((IOException) obj).getClass();
                synchronized (gh2Var) {
                    c3552rx.m20970e();
                }
                return xfa.f68157a;
            case 14:
                ((v56) this.f66152b).m23126b((q84) this.f66153c);
                return xfa.f68157a;
            case 15:
                ((xq3) this.f66152b).f68535c.removeCallbacks((RunnableC3470pr) this.f66153c);
                return xfa.f68157a;
            case 16:
                C0061c c0061c = (C0061c) this.f66152b;
                l44 l44Var = (l44) this.f66153c;
                c0061c.f1550a.m24305c(l44Var);
                ((xc9) c0061c.f1551b).setValue(Boolean.TRUE);
                return new d70(1, c0061c, l44Var);
            case 17:
                String str = (String) this.f66152b;
                ul4 ul4Var = (ul4) this.f66153c;
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ik8 ik8VarMo2873e0 = bk8Var5.mo2873e0("SELECT * FROM LanguageContextEntity WHERE code = ?");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "code");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "pk");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "url");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "repetitionLingQs");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lotdDates");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isUseFeed");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "intense");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "streakGoal");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "streakDays");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e0, "tags");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e0, "supported");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e0, "title");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lastUsed");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e0, "knownWords");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e0, "grammarResourceSlug");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e0, "feedLevels");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e0, "scheduledForDeletion");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e0, "email_lotd");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e0, "email_weekly");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e0, "site_lotd");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e0, "site_weekly");
                    if (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                        int i4 = (int) ik8VarMo2873e0.getLong(iM14108v2);
                        String strMo2875L2 = ik8VarMo2873e0.isNull(iM14108v3) ? null : ik8VarMo2873e0.mo2875L(iM14108v3);
                        int i5 = (int) ik8VarMo2873e0.getLong(iM14108v4);
                        String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v5) ? null : ik8VarMo2873e0.mo2875L(iM14108v5);
                        qn3 qn3Var = ul4Var.f64044M;
                        List listM20058M = qn3Var.m20058M(strMo2875L3);
                        if (listM20058M == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v6) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v6));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v7) ? null : ik8VarMo2873e0.mo2875L(iM14108v7);
                        Integer numValueOf2 = ik8VarMo2873e0.isNull(iM14108v8) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v8));
                        int i6 = (int) ik8VarMo2873e0.getLong(iM14108v9);
                        List listM20058M2 = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10));
                        if (listM20058M2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        Integer numValueOf3 = ik8VarMo2873e0.isNull(iM14108v11) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v11));
                        if (numValueOf3 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        String strMo2875L5 = ik8VarMo2873e0.isNull(iM14108v12) ? null : ik8VarMo2873e0.mo2875L(iM14108v12);
                        String strMo2875L6 = ik8VarMo2873e0.isNull(iM14108v13) ? null : ik8VarMo2873e0.mo2875L(iM14108v13);
                        Integer numValueOf4 = ik8VarMo2873e0.isNull(iM14108v14) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v14));
                        String strMo2875L7 = ik8VarMo2873e0.isNull(iM14108v15) ? null : ik8VarMo2873e0.mo2875L(iM14108v15);
                        List listM20058M3 = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v16) ? null : ik8VarMo2873e0.mo2875L(iM14108v16));
                        Integer numValueOf5 = ik8VarMo2873e0.isNull(iM14108v17) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v17));
                        if (numValueOf5 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf5.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        if (ik8VarMo2873e0.isNull(iM14108v18)) {
                            i = iM14108v19;
                            if (ik8VarMo2873e0.isNull(i)) {
                                languageContextNotification = null;
                            }
                            if (ik8VarMo2873e0.isNull(iM14108v20) || !ik8VarMo2873e0.isNull(iM14108v21)) {
                                languageContextNotification2 = new LanguageContextNotification(ik8VarMo2873e0.mo2875L(iM14108v20), ik8VarMo2873e0.mo2875L(iM14108v21));
                            } else {
                                languageContextNotification2 = null;
                            }
                            languageContextEntity = new LanguageContextEntity(strMo2875L, i4, strMo2875L2, i5, listM20058M, languageContextNotification, languageContextNotification2, boolValueOf, strMo2875L4, numValueOf2, i6, listM20058M2, boolValueOf2, strMo2875L5, strMo2875L6, numValueOf4, strMo2875L7, listM20058M3, boolValueOf3);
                        } else {
                            i = iM14108v19;
                        }
                        languageContextNotification = new LanguageContextNotification(ik8VarMo2873e0.mo2875L(iM14108v18), ik8VarMo2873e0.mo2875L(i));
                        if (ik8VarMo2873e0.isNull(iM14108v20)) {
                            languageContextNotification2 = new LanguageContextNotification(ik8VarMo2873e0.mo2875L(iM14108v20), ik8VarMo2873e0.mo2875L(iM14108v21));
                        } else {
                            languageContextNotification2 = new LanguageContextNotification(ik8VarMo2873e0.mo2875L(iM14108v20), ik8VarMo2873e0.mo2875L(iM14108v21));
                        }
                        languageContextEntity = new LanguageContextEntity(strMo2875L, i4, strMo2875L2, i5, listM20058M, languageContextNotification, languageContextNotification2, boolValueOf, strMo2875L4, numValueOf2, i6, listM20058M2, boolValueOf2, strMo2875L5, strMo2875L6, numValueOf4, strMo2875L7, listM20058M3, boolValueOf3);
                    } else {
                        languageContextEntity = null;
                    }
                    ik8VarMo2873e0.close();
                    return languageContextEntity;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 18:
                C1319g c1319g = (C1319g) this.f66152b;
                StudyStatsEntity studyStatsEntity = (StudyStatsEntity) this.f66153c;
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                c1319g.f17030O.m3841W(bk8Var6, studyStatsEntity);
                return xfa.f68157a;
            case 19:
                C1319g c1319g2 = (C1319g) this.f66152b;
                LanguageProgressEntity languageProgressEntity = (LanguageProgressEntity) this.f66153c;
                bk8 bk8Var7 = (bk8) obj;
                bk8Var7.getClass();
                return Long.valueOf(c1319g2.f17027L.m3842X(bk8Var7, languageProgressEntity));
            case 20:
                String str2 = (String) this.f66152b;
                C1319g c1319g3 = (C1319g) this.f66153c;
                bk8 bk8Var8 = (bk8) obj;
                bk8Var8.getClass();
                ik8 ik8VarMo2873e1 = bk8Var8.mo2873e0("SELECT `language`, `dailyGoal`, `streakDays`, `coins`, `knownWords`, `dailyScores`, `activityLevel` FROM (SELECT * FROM StudyStatsEntity WHERE code = ?)");
                try {
                    ik8VarMo2873e1.mo2874C(1, str2);
                    if (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L8 = ik8VarMo2873e1.mo2875L(0);
                        int i7 = (int) ik8VarMo2873e1.getLong(1);
                        int i8 = (int) ik8VarMo2873e1.getLong(2);
                        int i9 = (int) ik8VarMo2873e1.getLong(3);
                        int i10 = (int) ik8VarMo2873e1.getLong(4);
                        String strMo2875L9 = ik8VarMo2873e1.mo2875L(5);
                        qn3 qn3Var2 = c1319g3.f17028M;
                        qn3Var2.getClass();
                        strMo2875L9.getClass();
                        yf4 yf4Var = (yf4) qn3Var2.f57974a;
                        yf4Var.getClass();
                        languageStudyStats = new LanguageStudyStats(strMo2875L8, i7, i8, i9, i10, (List) yf4Var.m10321a(strMo2875L9, new C2978ev(StudyStatsScores.Companion.serializer())), (int) ik8VarMo2873e1.getLong(6));
                    } else {
                        languageStudyStats = null;
                    }
                    return languageStudyStats;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 21:
                C1319g c1319g4 = (C1319g) this.f66152b;
                StreakEntity streakEntity = (StreakEntity) this.f66153c;
                bk8 bk8Var9 = (bk8) obj;
                bk8Var9.getClass();
                c1319g4.f17031P.m3841W(bk8Var9, streakEntity);
                return xfa.f68157a;
            case 22:
                at4 at4Var = (at4) this.f66152b;
                ps4 ps4Var = (ps4) this.f66153c;
                C3126ix c3126ixM3028c = at4Var.m3028c(((Integer) obj).intValue());
                int i11 = c3126ixM3028c.f44720b;
                List list3 = (List) c3126ixM3028c.f44721c;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                int i12 = 0;
                while (i3 < size) {
                    int i13 = (int) ((aq3) list3.get(i3)).f7358a;
                    arrayList.add(new Pair(Integer.valueOf(i11), new bk1(ps4Var.m19468a(i12, i13))));
                    i11++;
                    i12 += i13;
                    i3++;
                }
                return arrayList;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ps4 ps4Var2 = (ps4) this.f66152b;
                os4 os4Var = (os4) this.f66153c;
                int iIntValue = ((Integer) obj).intValue();
                at4 at4Var2 = ps4Var2.f56761e;
                int i14 = at4Var2.f7462f;
                int iM3032g = at4Var2.m3032g(iIntValue);
                return os4Var.m18462E(iIntValue, 0, iM3032g, os4Var.f54934d, ps4Var2.m19468a(0, iM3032g));
            case 24:
                ov4 ov4Var = (ov4) this.f66152b;
                Object obj2 = this.f66153c;
                ov4Var.f55033c.m17816i(obj2);
                return new d70(i2, ov4Var, obj2);
            case 25:
                return new ov4((il8) this.f66152b, (Map) obj, (gl8) this.f66153c);
            case 26:
                q05 q05Var = (q05) this.f66152b;
                List list4 = (List) this.f66153c;
                bk8 bk8Var10 = (bk8) obj;
                bk8Var10.getClass();
                q05Var.f57083W.m3840V(bk8Var10, list4);
                return xfa.f68157a;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                b85 b85Var = (b85) this.f66152b;
                r59 r59Var = (r59) this.f66153c;
                LibraryItem libraryItem = r59Var.f58780d;
                CourseContextMenuItem courseContextMenuItem = (CourseContextMenuItem) obj;
                courseContextMenuItem.getClass();
                switch (db5.f35357b[courseContextMenuItem.ordinal()]) {
                    case 1:
                        b85Var.mo3441U(libraryItem.f19426a);
                        break;
                    case 2:
                        b85Var.mo3467t(libraryItem.f19426a);
                        break;
                    case 3:
                        b85Var.mo3450c(libraryItem, false);
                        break;
                    case 4:
                        b85Var.mo3446Z(libraryItem, r59Var.f58777a.f35163p);
                        break;
                    case 5:
                        b85Var.mo3470w(libraryItem);
                        break;
                    case 6:
                        int i15 = libraryItem.f19426a;
                        String str3 = libraryItem.f19433e;
                        if (str3 == null) {
                            str3 = "";
                        }
                        b85Var.mo3431K(i15, str3);
                        break;
                    case 7:
                        b85Var.mo3466s(r59Var.f58778b);
                        break;
                    default:
                        gm5.m12750e();
                        return null;
                }
                return xfa.f68157a;
            case 28:
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                ArrayList arrayListM10066z = d32.m10066z((List) this.f66152b, ((ne5) this.f66153c).f52643a);
                if (arrayListM10066z != null) {
                    int size2 = arrayListM10066z.size();
                    while (i3 < size2) {
                        Pair pair = (Pair) arrayListM10066z.get(i3);
                        l87 l87Var = (l87) pair.f47623a;
                        ui3 ui3Var = (ui3) pair.f47624b;
                        AbstractC0343j.m1520i(abstractC0343j, l87Var, ui3Var != null ? ((f84) ui3Var.mo0a()).f38612a : 0L);
                        i3++;
                    }
                }
                return xfa.f68157a;
            default:
                wi5 wi5Var = (wi5) this.f66152b;
                ArrayList arrayList2 = (ArrayList) this.f66153c;
                bk8 bk8Var11 = (bk8) obj;
                bk8Var11.getClass();
                return wi5Var.f66850L.m3843Y(bk8Var11, arrayList2);
        }
    }
}
