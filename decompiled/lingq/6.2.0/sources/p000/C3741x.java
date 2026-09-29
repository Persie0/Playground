package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.material3.C0252k0;
import androidx.compose.material3.C0261r;
import androidx.compose.p002ui.draw.C0296c;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.analytics.data.LqAnalyticsValues$PushEnabledSource;
import com.lingq.core.database.dao.C1317e;
import com.lingq.core.database.entity.LanguageContextEntity;
import com.lingq.core.domain.model.CoursePlaylistSort;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.cup.CupClaim;
import com.lingq.core.domain.model.language.LanguageContextNotification;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.highlightedtext.AbstractC1932c;
import com.lingq.core.premium.C1840b;
import com.lingq.core.premium.FreeTrialOnboardingPage;
import com.lingq.core.premium.domain.TrialReminderChoice;
import com.lingq.feature.challenges.ChallengeShareFragment;
import com.lingq.feature.challenges.ChallengesFragment;
import com.lingq.feature.challenges.R$id;
import com.lingq.feature.challenges.cup.CupBadgesFragment;
import com.lingq.feature.challenges.cup.CupContributorsFragment;
import com.lingq.feature.challenges.cup.CupDailyPrizeFragment;
import com.lingq.feature.challenges.cup.CupFragment;
import com.lingq.feature.challenges.cup.CupTeamLeaderboardFragment;
import com.lingq.feature.more.HelpFragment;
import com.lingq.feature.more.InviteFriendsFragment;
import com.lingq.feature.more.R$string;
import com.lingq.feature.onboarding.auth.login.magiclink.EmailLoginFragment;
import com.lingq.feature.playlist.C2251a;
import com.lingq.feature.playlist.CollectionPlaylistFragment;
import com.lingq.feature.statistics.C2810a;
import com.lingq.feature.statistics.LanguageStatsAllFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: renamed from: x */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3741x implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67580a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f67581b;

    public /* synthetic */ C3741x(Object obj, int i) {
        this.f67580a = i;
        this.f67581b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x025f A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0013, B:4:0x00a6, B:6:0x00ac, B:10:0x00d0, B:15:0x00e5, B:18:0x00ef, B:24:0x010d, B:28:0x0117, B:32:0x0125, B:36:0x0134, B:40:0x014a, B:44:0x015c, B:46:0x0162, B:51:0x0178, B:55:0x0182, B:57:0x018b, B:62:0x019d, B:67:0x01af, B:72:0x01ce, B:77:0x01e0, B:81:0x01f3, B:86:0x0211, B:90:0x021a, B:93:0x0226, B:95:0x022c, B:101:0x0245, B:102:0x0259, B:104:0x025f, B:109:0x0271, B:84:0x0204, B:80:0x01eb, B:76:0x01d9, B:71:0x01be, B:66:0x01a8, B:61:0x0196, B:49:0x016c, B:43:0x0158, B:39:0x013e, B:35:0x012e, B:21:0x00fc, B:14:0x00e0, B:9:0x00c7), top: B:124:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0267  */
    /* JADX WARN: Code duplicated, block: B:107:0x0268  */
    /* JADX WARN: Code duplicated, block: B:108:0x026f  */
    /* JADX INFO: renamed from: d */
    private final Object m24222d(Object obj) throws Exception {
        ik8 ik8Var;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        int i;
        LanguageContextNotification languageContextNotification;
        int i2;
        LanguageContextNotification languageContextNotification2;
        ul4 ul4Var = (ul4) this.f67581b;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM LanguageContextEntity");
        try {
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
            ArrayList arrayList = new ArrayList();
            while (ik8VarMo2873e0.mo2876a0()) {
                String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                int i3 = iM14108v13;
                ArrayList arrayList2 = arrayList;
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
                boolean z = true;
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
                String strMo2875L6 = ik8VarMo2873e0.isNull(i3) ? null : ik8VarMo2873e0.mo2875L(i3);
                int i7 = iM14108v14;
                Integer numValueOf4 = ik8VarMo2873e0.isNull(i7) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i7));
                int i8 = iM14108v15;
                String strMo2875L7 = ik8VarMo2873e0.isNull(i8) ? null : ik8VarMo2873e0.mo2875L(i8);
                int i9 = iM14108v16;
                List listM20058M3 = qn3Var.m20058M(ik8VarMo2873e0.isNull(i9) ? null : ik8VarMo2873e0.mo2875L(i9));
                iM14108v17 = iM14108v17;
                Integer numValueOf5 = ik8VarMo2873e0.isNull(iM14108v17) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v17));
                if (numValueOf5 != null) {
                    if (numValueOf5.intValue() == 0) {
                        z = false;
                    }
                    boolValueOf3 = Boolean.valueOf(z);
                } else {
                    boolValueOf3 = null;
                }
                iM14108v18 = iM14108v18;
                try {
                    if (ik8VarMo2873e0.isNull(iM14108v18)) {
                        i = iM14108v19;
                        if (ik8VarMo2873e0.isNull(i)) {
                            iM14108v19 = i;
                            languageContextNotification = null;
                        }
                        iM14108v20 = iM14108v20;
                        if (ik8VarMo2873e0.isNull(iM14108v20)) {
                            i2 = iM14108v21;
                            if (!ik8VarMo2873e0.isNull(i2)) {
                                ik8Var = ik8VarMo2873e0;
                                languageContextNotification2 = null;
                            }
                            arrayList2.add(new LanguageContextEntity(strMo2875L, i4, strMo2875L2, i5, listM20058M, languageContextNotification, languageContextNotification2, boolValueOf, strMo2875L4, numValueOf2, i6, listM20058M2, boolValueOf2, strMo2875L5, strMo2875L6, numValueOf4, strMo2875L7, listM20058M3, boolValueOf3));
                            iM14108v21 = i2;
                            iM14108v = iM14108v;
                            iM14108v13 = i3;
                            ul4Var = ul4Var;
                            iM14108v2 = iM14108v2;
                            arrayList = arrayList2;
                            iM14108v16 = i9;
                            iM14108v5 = iM14108v5;
                            ik8VarMo2873e0 = ik8Var;
                            iM14108v14 = i7;
                            iM14108v15 = i8;
                            iM14108v3 = iM14108v3;
                            iM14108v4 = iM14108v4;
                        } else {
                            i2 = iM14108v21;
                        }
                        ik8Var = ik8VarMo2873e0;
                        languageContextNotification2 = new LanguageContextNotification(ik8VarMo2873e0.mo2875L(iM14108v20), ik8VarMo2873e0.mo2875L(i2));
                        arrayList2.add(new LanguageContextEntity(strMo2875L, i4, strMo2875L2, i5, listM20058M, languageContextNotification, languageContextNotification2, boolValueOf, strMo2875L4, numValueOf2, i6, listM20058M2, boolValueOf2, strMo2875L5, strMo2875L6, numValueOf4, strMo2875L7, listM20058M3, boolValueOf3));
                        iM14108v21 = i2;
                        iM14108v = iM14108v;
                        iM14108v13 = i3;
                        ul4Var = ul4Var;
                        iM14108v2 = iM14108v2;
                        arrayList = arrayList2;
                        iM14108v16 = i9;
                        iM14108v5 = iM14108v5;
                        ik8VarMo2873e0 = ik8Var;
                        iM14108v14 = i7;
                        iM14108v15 = i8;
                        iM14108v3 = iM14108v3;
                        iM14108v4 = iM14108v4;
                    } else {
                        i = iM14108v19;
                    }
                    if (ik8VarMo2873e0.isNull(iM14108v20)) {
                        i2 = iM14108v21;
                        if (!ik8VarMo2873e0.isNull(i2)) {
                            ik8Var = ik8VarMo2873e0;
                            languageContextNotification2 = null;
                        }
                        arrayList2.add(new LanguageContextEntity(strMo2875L, i4, strMo2875L2, i5, listM20058M, languageContextNotification, languageContextNotification2, boolValueOf, strMo2875L4, numValueOf2, i6, listM20058M2, boolValueOf2, strMo2875L5, strMo2875L6, numValueOf4, strMo2875L7, listM20058M3, boolValueOf3));
                        iM14108v21 = i2;
                        iM14108v = iM14108v;
                        iM14108v13 = i3;
                        ul4Var = ul4Var;
                        iM14108v2 = iM14108v2;
                        arrayList = arrayList2;
                        iM14108v16 = i9;
                        iM14108v5 = iM14108v5;
                        ik8VarMo2873e0 = ik8Var;
                        iM14108v14 = i7;
                        iM14108v15 = i8;
                        iM14108v3 = iM14108v3;
                        iM14108v4 = iM14108v4;
                    } else {
                        i2 = iM14108v21;
                    }
                    languageContextNotification2 = new LanguageContextNotification(ik8VarMo2873e0.mo2875L(iM14108v20), ik8VarMo2873e0.mo2875L(i2));
                    arrayList2.add(new LanguageContextEntity(strMo2875L, i4, strMo2875L2, i5, listM20058M, languageContextNotification, languageContextNotification2, boolValueOf, strMo2875L4, numValueOf2, i6, listM20058M2, boolValueOf2, strMo2875L5, strMo2875L6, numValueOf4, strMo2875L7, listM20058M3, boolValueOf3));
                    iM14108v21 = i2;
                    iM14108v = iM14108v;
                    iM14108v13 = i3;
                    ul4Var = ul4Var;
                    iM14108v2 = iM14108v2;
                    arrayList = arrayList2;
                    iM14108v16 = i9;
                    iM14108v5 = iM14108v5;
                    ik8VarMo2873e0 = ik8Var;
                    iM14108v14 = i7;
                    iM14108v15 = i8;
                    iM14108v3 = iM14108v3;
                    iM14108v4 = iM14108v4;
                } catch (Throwable th) {
                    th = th;
                    ik8Var.close();
                    throw th;
                }
                iM14108v19 = i;
                languageContextNotification = new LanguageContextNotification(ik8VarMo2873e0.mo2875L(iM14108v18), ik8VarMo2873e0.mo2875L(i));
                iM14108v20 = iM14108v20;
                ik8Var = ik8VarMo2873e0;
            }
            ik8 ik8Var2 = ik8VarMo2873e0;
            ArrayList arrayList3 = arrayList;
            ik8Var2.close();
            return arrayList3;
        } catch (Throwable th2) {
            th = th2;
            ik8Var = ik8VarMo2873e0;
        }
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        CupClaim cupClaim;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        int i = this.f67580a;
        int i2 = 3;
        int i3 = 1;
        tg6 tg6Var = tg6.f62255a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f67581b;
        switch (i) {
            case 0:
                return obj == ((AbstractC3778y) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                m77 m77Var = (m77) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == m77Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value7 = entry.getValue();
                sb.append(value7 != m77Var ? String.valueOf(value7) : "(this Map)");
                return sb.toString();
            case 2:
                ((ai2) obj).getClass();
                return new C3531rd((C3143jd) obj2, 0);
            case 3:
                ((l7a) obj2).m15983f(((Number) ((xc9) ((C3838zm) obj).f71729e).getValue()).floatValue());
                return xfaVar;
            case 4:
                return new C3531rd((C0252k0) obj2, i2);
            case 5:
                un0 un0Var = (un0) obj2;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM CardEntity WHERE isPhrase = 1");
                try {
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "term");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "termWithLanguage");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "id");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "url");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "fragment");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "status");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "extendedStatus");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lastReviewedCorrect");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "srsDueDate");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e0, "notes");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e0, "audio");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e0, "importance");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e0, "meanings");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e0, "meaningTerms");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e0, "tags");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e0, "gTags");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e0, "words");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e0, "hiragana");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e0, "romaji");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e0, "pinyin");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e0, "hant");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e0, "hans");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e0, "jyutping");
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e0, "chunk");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e0, "furigana");
                    int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e0, "latin");
                    int iM14108v27 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isPhrase");
                    int iM14108v28 = AbstractC3122is.m14108v(ik8VarMo2873e0, "creationDate");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v2);
                        un0 un0Var2 = un0Var;
                        int i4 = iM14108v11;
                        int i5 = (int) ik8VarMo2873e0.getLong(iM14108v3);
                        String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                        String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v5) ? null : ik8VarMo2873e0.mo2875L(iM14108v5);
                        int i6 = (int) ik8VarMo2873e0.getLong(iM14108v6);
                        Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v7) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v7));
                        String strMo2875L5 = ik8VarMo2873e0.isNull(iM14108v8) ? null : ik8VarMo2873e0.mo2875L(iM14108v8);
                        String strMo2875L6 = ik8VarMo2873e0.isNull(iM14108v9) ? null : ik8VarMo2873e0.mo2875L(iM14108v9);
                        String strMo2875L7 = ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10);
                        String strMo2875L8 = ik8VarMo2873e0.isNull(i4) ? null : ik8VarMo2873e0.mo2875L(i4);
                        int i7 = (int) ik8VarMo2873e0.getLong(iM14108v12);
                        String strMo2875L9 = ik8VarMo2873e0.mo2875L(iM14108v13);
                        int i8 = iM14108v;
                        qn3 qn3Var = un0Var2.f64104N;
                        List listM20059N = qn3Var.m20059N(strMo2875L9);
                        int i9 = iM14108v14;
                        String strMo2875L10 = ik8VarMo2873e0.isNull(i9) ? null : ik8VarMo2873e0.mo2875L(i9);
                        iM14108v15 = iM14108v15;
                        List listM20058M = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v15) ? null : ik8VarMo2873e0.mo2875L(iM14108v15));
                        if (listM20058M == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        iM14108v14 = i9;
                        int i10 = iM14108v16;
                        List listM20058M2 = qn3Var.m20058M(ik8VarMo2873e0.isNull(i10) ? null : ik8VarMo2873e0.mo2875L(i10));
                        if (listM20058M2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        int i11 = iM14108v17;
                        List listM20058M3 = qn3Var.m20058M(ik8VarMo2873e0.isNull(i11) ? null : ik8VarMo2873e0.mo2875L(i11));
                        int i12 = iM14108v18;
                        String strMo2875L11 = ik8VarMo2873e0.isNull(i12) ? null : ik8VarMo2873e0.mo2875L(i12);
                        int i13 = iM14108v19;
                        String strMo2875L12 = ik8VarMo2873e0.isNull(i13) ? null : ik8VarMo2873e0.mo2875L(i13);
                        iM14108v18 = i12;
                        int i14 = iM14108v20;
                        String strMo2875L13 = ik8VarMo2873e0.isNull(i14) ? null : ik8VarMo2873e0.mo2875L(i14);
                        iM14108v20 = i14;
                        int i15 = iM14108v21;
                        String strMo2875L14 = ik8VarMo2873e0.isNull(i15) ? null : ik8VarMo2873e0.mo2875L(i15);
                        iM14108v21 = i15;
                        int i16 = iM14108v22;
                        String strMo2875L15 = ik8VarMo2873e0.isNull(i16) ? null : ik8VarMo2873e0.mo2875L(i16);
                        iM14108v22 = i16;
                        int i17 = iM14108v23;
                        String strMo2875L16 = ik8VarMo2873e0.isNull(i17) ? null : ik8VarMo2873e0.mo2875L(i17);
                        iM14108v23 = i17;
                        int i18 = iM14108v24;
                        String strMo2875L17 = ik8VarMo2873e0.isNull(i18) ? null : ik8VarMo2873e0.mo2875L(i18);
                        iM14108v24 = i18;
                        int i19 = iM14108v25;
                        String strMo2875L18 = ik8VarMo2873e0.isNull(i19) ? null : ik8VarMo2873e0.mo2875L(i19);
                        iM14108v25 = i19;
                        int i20 = iM14108v26;
                        String strMo2875L19 = ik8VarMo2873e0.isNull(i20) ? null : ik8VarMo2873e0.mo2875L(i20);
                        iM14108v26 = i20;
                        iM14108v19 = i13;
                        iM14108v17 = i11;
                        int i21 = iM14108v27;
                        int i22 = iM14108v28;
                        arrayList.add(new LessonCard(i7, i5, i6, numValueOf, strMo2875L, strMo2875L2, strMo2875L4, strMo2875L3, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, strMo2875L18, strMo2875L19, ik8VarMo2873e0.isNull(i22) ? null : ik8VarMo2873e0.mo2875L(i22), listM20058M, listM20058M2, listM20059N, listM20058M3, ((int) ik8VarMo2873e0.getLong(i21)) != 0));
                        iM14108v27 = i21;
                        iM14108v28 = i22;
                        iM14108v2 = iM14108v2;
                        un0Var = un0Var2;
                        iM14108v11 = i4;
                        iM14108v3 = iM14108v3;
                        iM14108v = i8;
                        iM14108v16 = i10;
                    }
                    ik8VarMo2873e0.close();
                    return arrayList;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 6:
                TokenMeaning tokenMeaning = (TokenMeaning) obj;
                tokenMeaning.getClass();
                return Boolean.valueOf(fa4.m11650l(tokenMeaning.m8133g(), ((TokenMeaning) obj2).m8133g()));
            case 7:
                ChallengeShareFragment challengeShareFragment = (ChallengeShareFragment) obj2;
                Uri uri = (Uri) obj;
                bh4[] bh4VarArr = ChallengeShareFragment.f24412V0;
                uri.getClass();
                AbstractC3423or.m18249d0(challengeShareFragment.m2090R(), uri, ((vr0) challengeShareFragment.f24415U0.getValue()).f65822b, "");
                return xfaVar;
            case 8:
                Challenge challenge = (Challenge) obj;
                bh4[] bh4VarArr2 = ChallengesFragment.f24437G0;
                challenge.getClass();
                jfa.m14428k(b34.m3244j((ChallengesFragment) obj2), z86.m25490a(a96.Companion, challenge.f18854b, challenge.f18859g), null);
                return xfaVar;
            case 9:
                CollectionPlaylistFragment collectionPlaylistFragment = (CollectionPlaylistFragment) obj2;
                vg6 vg6Var = (vg6) obj;
                vg6Var.getClass();
                boolean z = vg6Var instanceof ki6;
                LqAnalyticsValues$LessonPath.Playlist playlist = LqAnalyticsValues$LessonPath.Playlist.f14310a;
                if (z) {
                    w41 w41Var = collectionPlaylistFragment.f27527D0;
                    if (w41Var == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    ki6 ki6Var = (ki6) vg6Var;
                    w41Var.m23737z(new ja6(ki6Var.f47346a, ki6Var.f47347b, ki6Var.f47348c, playlist));
                } else if (vg6Var instanceof ii6) {
                    w41 w41Var2 = collectionPlaylistFragment.f27527D0;
                    if (w41Var2 == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    w41Var2.m23737z(new s96(((ii6) vg6Var).f44146a, playlist, "", ""));
                } else if (vg6Var instanceof ji6) {
                    w41 w41Var3 = collectionPlaylistFragment.f27527D0;
                    if (w41Var3 == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    ji6 ji6Var = (ji6) vg6Var;
                    w41Var3.m23737z(new aa6(ji6Var.f45580a, false, ji6Var.f45581b));
                } else if (vg6Var instanceof tg6) {
                    b34.m3244j(collectionPlaylistFragment).m22689f();
                }
                return xfaVar;
            case 10:
                C2251a c2251a = (C2251a) obj2;
                CoursePlaylistSort coursePlaylistSort = (CoursePlaylistSort) obj;
                coursePlaylistSort.getClass();
                c2251a.getClass();
                C3244l c3244l = c2251a.f27787p;
                if (c3244l.getValue() != coursePlaylistSort) {
                    c2251a.f27784m.m8450M(false);
                    c3244l.m15572j(null, coursePlaylistSort);
                    c2251a.m9205X2();
                }
                return xfaVar;
            case 11:
                CupBadgesFragment cupBadgesFragment = (CupBadgesFragment) obj2;
                vg6 vg6Var2 = (vg6) obj;
                vg6Var2.getClass();
                if (vg6Var2.equals(tg6Var)) {
                    b34.m3244j(cupBadgesFragment).m22689f();
                }
                return xfaVar;
            case 12:
                CupContributorsFragment cupContributorsFragment = (CupContributorsFragment) obj2;
                vg6 vg6Var3 = (vg6) obj;
                vg6Var3.getClass();
                if (vg6Var3.equals(tg6Var)) {
                    b34.m3244j(cupContributorsFragment).m22689f();
                }
                return xfaVar;
            case 13:
                it1 it1Var = (it1) obj2;
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                vu4.m23545g(vu4Var, null, new C0282a(-879227878, true, new ht1(it1Var, i3)), 3);
                if (it1Var.f44519a) {
                    vu4.m23545g(vu4Var, null, epb.f37696c, 3);
                } else {
                    if (it1Var.f44524f) {
                        vu4.m23545g(vu4Var, null, new C0282a(1752576281, true, new ht1(it1Var, 2)), 3);
                    }
                    vu4.m23545g(vu4Var, null, new C0282a(345473726, true, new ht1(it1Var, i2)), 3);
                }
                return xfaVar;
            case 14:
                CupDailyPrizeFragment cupDailyPrizeFragment = (CupDailyPrizeFragment) obj2;
                vg6 vg6Var4 = (vg6) obj;
                vg6Var4.getClass();
                if (vg6Var4.equals(tg6Var)) {
                    b34.m3244j(cupDailyPrizeFragment).m22689f();
                }
                return xfaVar;
            case 15:
                C1317e c1317e = (C1317e) obj2;
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT * FROM CupPrizeEntity ORDER BY date ASC");
                try {
                    int iM14108v29 = AbstractC3122is.m14108v(ik8VarMo2873e1, "date");
                    int iM14108v30 = AbstractC3122is.m14108v(ik8VarMo2873e1, "kind");
                    int iM14108v31 = AbstractC3122is.m14108v(ik8VarMo2873e1, "source");
                    int iM14108v32 = AbstractC3122is.m14108v(ik8VarMo2873e1, "value");
                    int iM14108v33 = AbstractC3122is.m14108v(ik8VarMo2873e1, "label");
                    int iM14108v34 = AbstractC3122is.m14108v(ik8VarMo2873e1, "claim");
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L20 = ik8VarMo2873e1.mo2875L(iM14108v29);
                        String strMo2875L21 = ik8VarMo2873e1.mo2875L(iM14108v30);
                        String strMo2875L22 = ik8VarMo2873e1.mo2875L(iM14108v31);
                        int i23 = (int) ik8VarMo2873e1.getLong(iM14108v32);
                        String strMo2875L23 = ik8VarMo2873e1.mo2875L(iM14108v33);
                        String strMo2875L24 = ik8VarMo2873e1.isNull(iM14108v34) ? null : ik8VarMo2873e1.mo2875L(iM14108v34);
                        qn3 qn3Var2 = c1317e.f17016c;
                        if (strMo2875L24 != null) {
                            yf4 yf4Var = (yf4) qn3Var2.f57974a;
                            yf4Var.getClass();
                            cupClaim = (CupClaim) yf4Var.m10321a(strMo2875L24, CupClaim.Companion.serializer());
                        } else {
                            qn3Var2.getClass();
                            cupClaim = null;
                        }
                        arrayList2.add(new iu1(strMo2875L20, strMo2875L21, strMo2875L22, i23, strMo2875L23, cupClaim));
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 16:
                CupFragment cupFragment = (CupFragment) obj2;
                vg6 vg6Var5 = (vg6) obj;
                vg6Var5.getClass();
                if (vg6Var5.equals(tg6Var)) {
                    b34.m3244j(cupFragment).m22689f();
                } else if (vg6Var5.equals(ah6.f655a)) {
                    ud6 ud6VarM3244j = b34.m3244j(cupFragment);
                    n96.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j, new C2916d6(R$id.actionToCupTeamLeaderboard), null);
                } else if (vg6Var5 instanceof yg6) {
                    ud6 ud6VarM3244j2 = b34.m3244j(cupFragment);
                    m96 m96Var = n96.Companion;
                    String str = ((yg6) vg6Var5).f69815a;
                    m96Var.getClass();
                    jfa.m14428k(ud6VarM3244j2, new l96(str), null);
                } else if (vg6Var5.equals(xg6.f68182a)) {
                    ud6 ud6VarM3244j3 = b34.m3244j(cupFragment);
                    n96.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j3, new C2916d6(R$id.actionToCupBadges), null);
                } else if (vg6Var5.equals(zg6.f71532a)) {
                    ud6 ud6VarM3244j4 = b34.m3244j(cupFragment);
                    n96.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j4, new C2916d6(R$id.actionToCupDailyPrize), null);
                }
                return xfaVar;
            case 17:
                CupTeamLeaderboardFragment cupTeamLeaderboardFragment = (CupTeamLeaderboardFragment) obj2;
                vg6 vg6Var6 = (vg6) obj;
                vg6Var6.getClass();
                if (vg6Var6.equals(tg6Var)) {
                    b34.m3244j(cupTeamLeaderboardFragment).m22689f();
                } else if (vg6Var6 instanceof yg6) {
                    ud6 ud6VarM3244j5 = b34.m3244j(cupTeamLeaderboardFragment);
                    m96 m96Var2 = n96.Companion;
                    String str2 = ((yg6) vg6Var6).f69815a;
                    m96Var2.getClass();
                    jfa.m14428k(ud6VarM3244j5, new l96(str2), null);
                }
                return xfaVar;
            case 18:
                EmailLoginFragment emailLoginFragment = (EmailLoginFragment) obj2;
                vg6 vg6Var7 = (vg6) obj;
                vg6Var7.getClass();
                if (vg6Var7.equals(tg6Var)) {
                    b34.m3244j(emailLoginFragment).m22689f();
                } else if (vg6Var7 instanceof ci6) {
                    ud6 ud6VarM3244j6 = b34.m3244j(emailLoginFragment);
                    gp2 gp2Var = hp2.Companion;
                    String str3 = ((ci6) vg6Var7).f10114a;
                    gp2Var.getClass();
                    ac6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j6, new wb6(str3), null);
                }
                return xfaVar;
            case 19:
                C1840b c1840b = (C1840b) obj2;
                vj6 vj6Var = c1840b.f22411d;
                C3244l c3244l2 = c1840b.f22415h;
                oh3 oh3Var = (oh3) obj;
                oh3Var.getClass();
                if (oh3Var.equals(mh3.f51322a)) {
                    ((C1240a) ((hm5) vj6Var.f65506b)).m7025f("start trial clicked", null);
                    li3 li3Var = (li3) c3244l2.getValue();
                    boolean z2 = li3Var.f49707j;
                    pha phaVar = c1840b.f22410c;
                    c1840b.mo8552H2(z2 ? phaVar.mo8574o0() : phaVar.mo8555K0(), li3Var.f49703f);
                } else if (oh3Var.equals(jh3.f45542a)) {
                    ((C1240a) ((hm5) vj6Var.f65506b)).m7025f("show all plans clicked", null);
                } else if (oh3Var.equals(kh3.f47293a)) {
                    do {
                        value5 = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value5, li3.m16234a((li3) value5, null, null, null, null, false, null, false, null, false, false, FreeTrialOnboardingPage.ReminderChoice, null, null, null, null, 520191)));
                } else if (oh3Var.equals(lh3.f49654a)) {
                    do {
                        value4 = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value4, li3.m16234a((li3) value4, null, null, null, null, false, null, false, null, false, false, FreeTrialOnboardingPage.Timeline, null, null, null, null, 520191)));
                } else if (oh3Var instanceof ih3) {
                    TrialReminderChoice trialReminderChoice = ((ih3) oh3Var).f44103a;
                    trialReminderChoice.getClass();
                    while (true) {
                        Object value8 = c3244l2.getValue();
                        TrialReminderChoice trialReminderChoice2 = trialReminderChoice;
                        if (!c3244l2.m15570h(value8, li3.m16234a((li3) value8, null, null, null, null, false, null, false, null, false, false, null, trialReminderChoice2, null, null, null, 516095))) {
                            trialReminderChoice = trialReminderChoice2;
                        }
                    }
                } else if (oh3Var.equals(nh3.f52727a)) {
                    TrialReminderChoice trialReminderChoice3 = ((li3) c3244l2.getValue()).f49711n;
                    vj6Var.getClass();
                    trialReminderChoice3.getClass();
                    hm5 hm5Var = (hm5) vj6Var.f65506b;
                    Bundle bundle = new Bundle();
                    bundle.putString("reminder choice", trialReminderChoice3.getAnalyticsValue());
                    ((C1240a) hm5Var).m7025f("trial reminder chosen", bundle);
                } else if (oh3Var.equals(eh3.f37254a)) {
                    hm5 hm5Var2 = (hm5) vj6Var.f65506b;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("push enabled source", LqAnalyticsValues$PushEnabledSource.FreeTrial.getValue());
                    ((C1240a) hm5Var2).m7025f("Push notifications enabled", bundle2);
                    c1840b.m8563V2();
                } else if (oh3Var.equals(fh3.f39103a)) {
                    c1840b.m8563V2();
                } else if (oh3Var.equals(dh3.f35647a)) {
                    do {
                        value3 = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value3, li3.m16234a((li3) value3, null, null, null, null, false, null, false, null, false, false, null, null, null, null, null, 524159)));
                } else if (oh3Var.equals(gh3.f40818a)) {
                    do {
                        value2 = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value2, li3.m16234a((li3) value2, null, null, null, null, false, null, false, null, false, true, null, null, null, null, null, 523775)));
                } else {
                    if (!oh3Var.equals(hh3.f42361a)) {
                        gm5.m12750e();
                        return null;
                    }
                    do {
                        value = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value, li3.m16234a((li3) value, null, null, null, null, false, null, false, null, false, false, null, null, null, null, null, 523775)));
                }
                return xfaVar;
            case 20:
                li3 li3Var2 = (li3) obj2;
                vu4 vu4Var2 = (vu4) obj;
                vu4Var2.getClass();
                vu4.m23545g(vu4Var2, null, new C0282a(-248326161, true, new ci3(li3Var2, i2)), 3);
                vu4.m23545g(vu4Var2, null, new C0282a(-650257384, true, new ci3(li3Var2, 4)), 3);
                vu4.m23545g(vu4Var2, null, hqb.f42813n, 3);
                return xfaVar;
            case 21:
                HelpFragment helpFragment = (HelpFragment) obj2;
                vg6 vg6Var8 = (vg6) obj;
                vg6Var8.getClass();
                if (vg6Var8.equals(tg6Var)) {
                    b34.m3244j(helpFragment).m22689f();
                } else if (vg6Var8.equals(dh6.f35655a)) {
                    id3 id3VarM2089Q = helpFragment.m2089Q();
                    Integer numValueOf2 = Integer.valueOf(R$string.texts_how_to_use_lingq);
                    b34.m3244j(helpFragment);
                    mbd.m16755c(id3VarM2089Q, "https://www.lingq.com/how-to-use-lingq/", numValueOf2, 24);
                    hm5 hm5Var3 = helpFragment.f26784B0;
                    if (hm5Var3 == null) {
                        fa4.m11636J("analytics");
                        throw null;
                    }
                    ((C1240a) hm5Var3).m7025f("How to use lingq opened", null);
                } else if (vg6Var8.equals(ch6.f10092a)) {
                    ob1 ob1Var = helpFragment.f26785C0;
                    if (ob1Var == null) {
                        fa4.m11636J("utils");
                        throw null;
                    }
                    ob1Var.m17888a(helpFragment.m2089Q());
                } else if (vg6Var8 instanceof eh6) {
                    id3 id3VarM2089Q2 = helpFragment.m2089Q();
                    String str4 = ((eh6) vg6Var8).f37256a;
                    b34.m3244j(helpFragment);
                    mbd.m16755c(id3VarM2089Q2, str4, null, 18);
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("video url", str4);
                    hm5 hm5Var4 = helpFragment.f26784B0;
                    if (hm5Var4 == null) {
                        fa4.m11636J("analytics");
                        throw null;
                    }
                    ((C1240a) hm5Var4).m7025f("Help video opened", bundle3);
                }
                return xfaVar;
            case 22:
                e28 e28Var = (e28) obj2;
                ((fb2) obj).getClass();
                return new f84((((long) ((int) e28Var.f36621b)) & 4294967295L) | (((long) ((int) e28Var.f36620a)) << 32));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((fb2) obj).getClass();
                return new f84(((long) ((int) ((px8) obj2).f56953a)) & 4294967295L);
            case 24:
                tv8 tv8Var = (tv8) obj;
                tv8Var.getClass();
                AbstractC0426f.m1860d(tv8Var, vk9.m23376L0(AbstractC1932c.f24144a.m15428g(((jt3) obj2).f46104b, "")).toString());
                return xfaVar;
            case 25:
                C0261r c0261r = (C0261r) obj2;
                C0296c c0296c = (C0296c) obj;
                float fMo594a = c0296c.mo594a() * ((xj2) c0261r.f3625V.m745d()).f68285a;
                C3500qj c3500qjM22757a = AbstractC3650uj.m22757a();
                o39 o39VarM24270a = c0261r.f3624U;
                if (o39VarM24270a == null) {
                    o39VarM24270a = x49.m24270a(((ms5) thb.m22050i(c0261r, ps5.f56764b)).f51801c, c43.f9451d);
                }
                pk9 pk9VarMo12726b = o39VarM24270a.mo12726b(c0296c.f3864a.mo1347h(), c0296c.f3864a.getLayoutDirection(), c0296c);
                if (pk9VarMo12726b instanceof b07) {
                    C3500qj.m19985b(c3500qjM22757a, ((b07) pk9VarMo12726b).f7728A);
                } else if (pk9VarMo12726b instanceof c07) {
                    C3500qj.m19986c(c3500qjM22757a, ((c07) pk9VarMo12726b).f9272A);
                } else {
                    if (!(pk9VarMo12726b instanceof a07)) {
                        gm5.m12750e();
                        return null;
                    }
                    C3500qj.m19984a(c3500qjM22757a, ((a07) pk9VarMo12726b).f34A);
                }
                C3500qj c3500qjM22757a2 = AbstractC3650uj.m22757a();
                C3500qj.m19985b(c3500qjM22757a2, new e28(0.0f, Float.intBitsToFloat((int) (c0296c.f3864a.mo1347h() & 4294967295L)) - fMo594a, Float.intBitsToFloat((int) (c0296c.f3864a.mo1347h() >> 32)), Float.intBitsToFloat((int) (4294967295L & c0296c.f3864a.mo1347h()))));
                C3500qj c3500qjM22757a3 = AbstractC3650uj.m22757a();
                c3500qjM22757a3.m19990g(c3500qjM22757a2, c3500qjM22757a, 1);
                return c0296c.m1349c(new ke2(7, c3500qjM22757a3, c0261r));
            case 26:
                InviteFriendsFragment inviteFriendsFragment = (InviteFriendsFragment) obj2;
                vg6 vg6Var9 = (vg6) obj;
                vg6Var9.getClass();
                if (vg6Var9.equals(tg6Var)) {
                    b34.m3244j(inviteFriendsFragment).m22689f();
                } else if (vg6Var9 instanceof lh6) {
                    hm5 hm5Var5 = inviteFriendsFragment.f26796S0;
                    if (hm5Var5 == null) {
                        fa4.m11636J("analytics");
                        throw null;
                    }
                    ((C1240a) hm5Var5).m7025f("Invite friends button clicked", null);
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.TEXT", ((lh6) vg6Var9).f49668a);
                    intent.setType("text/plain");
                    inviteFriendsFragment.m2100a0(Intent.createChooser(intent, null));
                } else if (vg6Var9 instanceof kh6) {
                    ClipData clipDataNewPlainText = ClipData.newPlainText("LingQ", ((kh6) vg6Var9).f47299a);
                    ClipboardManager clipboardManager = inviteFriendsFragment.f26795R0;
                    if (clipboardManager != null) {
                        clipboardManager.setPrimaryClip(clipDataNewPlainText);
                    }
                    Toast.makeText(inviteFriendsFragment.m2090R(), inviteFriendsFragment.m2111m(com.lingq.core.p012ui.R$string.share_copied_clipboard), 0).show();
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return m24222d(obj);
            case 28:
                LanguageProgressPeriod languageProgressPeriod = (LanguageProgressPeriod) obj;
                languageProgressPeriod.getClass();
                C3244l c3244l3 = ((C2810a) ((LanguageStatsAllFragment) obj2).f33120B0.getValue()).f33380e;
                do {
                    value6 = c3244l3.getValue();
                } while (!c3244l3.m15570h(value6, languageProgressPeriod));
                return xfaVar;
            default:
                vab vabVar = (vab) obj;
                vabVar.getClass();
                ((bbb) vabVar).m3590a((AbstractC2949e2) obj2);
                return xfaVar;
        }
    }
}
