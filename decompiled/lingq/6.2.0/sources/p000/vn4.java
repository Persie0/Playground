package p000;

import com.lingq.core.database.dao.C1319g;
import com.lingq.core.database.entity.LanguageProgressEntity;
import com.lingq.core.database.entity.StatsCalendarEntity;
import com.lingq.core.database.entity.StudyStatsEntity;
import com.lingq.core.domain.model.language.StatsCalendarDay;
import com.lingq.core.domain.model.language.StudyStatsScores;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vn4 extends ss5 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f65658p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1319g f65659q;

    public /* synthetic */ vn4(C1319g c1319g, int i) {
        this.f65658p = i;
        this.f65659q = c1319g;
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: m */
    public final void mo16668m(ik8 ik8Var, Object obj) {
        String strM10322b;
        String strM10322b2;
        int i = this.f65658p;
        C1319g c1319g = this.f65659q;
        switch (i) {
            case 0:
                StatsCalendarEntity statsCalendarEntity = (StatsCalendarEntity) obj;
                ik8Var.getClass();
                statsCalendarEntity.getClass();
                ik8Var.mo2874C(1, statsCalendarEntity.m7809b());
                ik8Var.mo2878j(2, statsCalendarEntity.m7808a());
                ik8Var.mo2878j(3, statsCalendarEntity.m7810c());
                ik8Var.mo2878j(4, statsCalendarEntity.m7812e());
                List listM7811d = statsCalendarEntity.m7811d();
                if (listM7811d == null) {
                    strM10322b = null;
                } else {
                    yf4 yf4Var = (yf4) c1319g.f17028M.f57974a;
                    yf4Var.getClass();
                    strM10322b = yf4Var.m10322b(new C2978ev(StatsCalendarDay.Companion.serializer()), listM7811d);
                }
                if (strM10322b == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, strM10322b);
                }
                ik8Var.mo2874C(6, statsCalendarEntity.m7809b());
                ik8Var.mo2878j(7, statsCalendarEntity.m7810c());
                ik8Var.mo2878j(8, statsCalendarEntity.m7812e());
                break;
            case 1:
                LanguageProgressEntity languageProgressEntity = (LanguageProgressEntity) obj;
                ik8Var.getClass();
                languageProgressEntity.getClass();
                String str = languageProgressEntity.f17176a;
                ik8Var.mo2874C(1, str);
                String str2 = languageProgressEntity.f17177b;
                ik8Var.mo2874C(2, str2);
                ik8Var.mo2878j(3, languageProgressEntity.f17178c);
                ik8Var.mo2877g(4, languageProgressEntity.f17179d);
                ik8Var.mo2878j(5, languageProgressEntity.f17180e);
                ik8Var.mo2877g(6, languageProgressEntity.f17181f);
                ik8Var.mo2878j(7, languageProgressEntity.f17182g);
                ik8Var.mo2878j(8, languageProgressEntity.f17183h);
                ik8Var.mo2878j(9, languageProgressEntity.f17184i);
                ik8Var.mo2877g(10, languageProgressEntity.f17185j);
                ik8Var.mo2877g(11, languageProgressEntity.f17186k);
                ik8Var.mo2878j(12, languageProgressEntity.f17187l);
                ik8Var.mo2878j(13, languageProgressEntity.f17188m);
                String strM20079y = c1319g.f17028M.m20079y(languageProgressEntity.f17189n);
                if (strM20079y == null) {
                    ik8Var.mo2880m(14);
                } else {
                    ik8Var.mo2874C(14, strM20079y);
                }
                ik8Var.mo2878j(15, languageProgressEntity.f17190o);
                ik8Var.mo2878j(16, languageProgressEntity.f17191p);
                ik8Var.mo2877g(17, languageProgressEntity.f17192q);
                ik8Var.mo2878j(18, languageProgressEntity.f17193r);
                ik8Var.mo2878j(19, languageProgressEntity.f17194s);
                ik8Var.mo2878j(20, languageProgressEntity.f17195t);
                ik8Var.mo2878j(21, languageProgressEntity.f17196u);
                ik8Var.mo2878j(22, languageProgressEntity.f17197v);
                ik8Var.mo2878j(23, languageProgressEntity.f17198w);
                ik8Var.mo2878j(24, languageProgressEntity.f17199x);
                ik8Var.mo2874C(25, str2);
                ik8Var.mo2874C(26, str);
                break;
            default:
                StudyStatsEntity studyStatsEntity = (StudyStatsEntity) obj;
                ik8Var.getClass();
                studyStatsEntity.getClass();
                String str3 = studyStatsEntity.f17462a;
                ik8Var.mo2874C(1, str3);
                String str4 = studyStatsEntity.f17463b;
                if (str4 == null) {
                    ik8Var.mo2880m(2);
                } else {
                    ik8Var.mo2874C(2, str4);
                }
                String str5 = studyStatsEntity.f17464c;
                if (str5 == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2874C(3, str5);
                }
                ik8Var.mo2878j(4, studyStatsEntity.f17465d);
                ik8Var.mo2878j(5, studyStatsEntity.f17466e);
                ik8Var.mo2878j(6, studyStatsEntity.f17467f);
                ik8Var.mo2878j(7, studyStatsEntity.f17468g);
                ik8Var.mo2878j(8, studyStatsEntity.f17469h);
                ik8Var.mo2878j(9, studyStatsEntity.f17470i ? 1L : 0L);
                List list = studyStatsEntity.f17471j;
                if (list == null) {
                    strM10322b2 = null;
                } else {
                    qn3 qn3Var = c1319g.f17028M;
                    qn3Var.getClass();
                    yf4 yf4Var2 = (yf4) qn3Var.f57974a;
                    yf4Var2.getClass();
                    strM10322b2 = yf4Var2.m10322b(new C2978ev(StudyStatsScores.Companion.serializer()), list);
                }
                if (strM10322b2 == null) {
                    ik8Var.mo2880m(10);
                } else {
                    ik8Var.mo2874C(10, strM10322b2);
                }
                ik8Var.mo2878j(11, studyStatsEntity.f17472k);
                ik8Var.mo2874C(12, str3);
                break;
        }
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: s */
    public final String mo16669s() {
        switch (this.f65658p) {
            case 0:
                return "UPDATE `StatsCalendarEntity` SET `language` = ?,`dailyGoal` = ?,`month` = ?,`year` = ?,`stats` = ? WHERE `language` = ? AND `month` = ? AND `year` = ?";
            case 1:
                return "UPDATE `LanguageProgressEntity` SET `interval` = ?,`languageCode` = ?,`writtenWordsGoal` = ?,`speakingTimeGoal` = ?,`totalWordsKnown` = ?,`readWords` = ?,`totalCards` = ?,`activityIndex` = ?,`knownWordsGoal` = ?,`listeningTimeGoal` = ?,`speakingTime` = ?,`cardsCreatedGoal` = ?,`knownWords` = ?,`intervals` = ?,`cardsCreated` = ?,`readWordsGoal` = ?,`listeningTime` = ?,`cardsLearned` = ?,`writtenWords` = ?,`cardsLearnedGoal` = ?,`earnedCoins` = ?,`earnedCoinsGoal` = ?,`wpm` = ?,`studyTime` = ? WHERE `languageCode` = ? AND `interval` = ?";
            default:
                return "UPDATE `StudyStatsEntity` SET `code` = ?,`language` = ?,`activityApple` = ?,`notificationsCount` = ?,`dailyGoal` = ?,`streakDays` = ?,`coins` = ?,`knownWords` = ?,`isAvatarUpgraded` = ?,`dailyScores` = ?,`activityLevel` = ? WHERE `code` = ?";
        }
    }
}
