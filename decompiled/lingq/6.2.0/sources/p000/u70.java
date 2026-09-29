package p000;

import com.lingq.core.database.entity.CourseBlacklistEntity;
import com.lingq.core.database.entity.LanguageProgressChartEntryEntity;
import com.lingq.core.database.entity.LanguageStatsEntity;
import com.lingq.core.database.entity.LibraryFastSearchEntity;
import com.lingq.core.database.entity.NoticeEntity;
import com.lingq.core.database.entity.ReferralEntity;
import com.lingq.core.domain.model.language.LanguageStatValue;

/* JADX INFO: loaded from: classes.dex */
public final class u70 extends r46 {

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f63502z;

    public /* synthetic */ u70(int i) {
        this.f63502z = i;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: l */
    public final void mo17164l(ik8 ik8Var, Object obj) {
        switch (this.f63502z) {
            case 0:
                y70 y70Var = (y70) obj;
                ik8Var.getClass();
                y70Var.getClass();
                ik8Var.mo2874C(1, y70Var.f69390a);
                ik8Var.mo2874C(2, y70Var.f69391b);
                ik8Var.mo2874C(3, y70Var.f69392c);
                ik8Var.mo2874C(4, y70Var.f69393d);
                ik8Var.mo2878j(5, y70Var.f69394e);
                ik8Var.mo2874C(6, y70Var.f69395f);
                ik8Var.mo2874C(7, y70Var.f69396g);
                ik8Var.mo2874C(8, y70Var.f69397h);
                String str = y70Var.f69398i;
                if (str != null) {
                    ik8Var.mo2874C(9, str);
                } else {
                    ik8Var.mo2880m(9);
                }
                break;
            case 1:
                CourseBlacklistEntity courseBlacklistEntity = (CourseBlacklistEntity) obj;
                ik8Var.getClass();
                courseBlacklistEntity.getClass();
                ik8Var.mo2878j(1, courseBlacklistEntity.m7585a());
                ik8Var.mo2874C(2, courseBlacklistEntity.m7586b());
                ik8Var.mo2874C(3, courseBlacklistEntity.m7587c());
                break;
            case 2:
                zd9 zd9Var = (zd9) obj;
                ik8Var.getClass();
                zd9Var.getClass();
                ik8Var.mo2874C(1, zd9Var.m25560b());
                ik8Var.mo2874C(2, zd9Var.m25559a());
                break;
            case 3:
                gr0 gr0Var = (gr0) obj;
                ik8Var.getClass();
                gr0Var.getClass();
                ik8Var.mo2878j(1, gr0Var.m12840k());
                String strM12833d = gr0Var.m12833d();
                if (strM12833d == null) {
                    ik8Var.mo2880m(2);
                } else {
                    ik8Var.mo2874C(2, strM12833d);
                }
                String strM12845p = gr0Var.m12845p();
                if (strM12845p == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2874C(3, strM12845p);
                }
                String strM12832c = gr0Var.m12832c();
                if (strM12832c == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, strM12832c);
                }
                String strM12834e = gr0Var.m12834e();
                if (strM12834e == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, strM12834e);
                }
                String strM12843n = gr0Var.m12843n();
                if (strM12843n == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, strM12843n);
                }
                String strM12835f = gr0Var.m12835f();
                if (strM12835f == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, strM12835f);
                }
                String strM12837h = gr0Var.m12837h();
                if (strM12837h == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, strM12837h);
                }
                ik8Var.mo2878j(9, gr0Var.m12839j());
                ik8Var.mo2878j(10, gr0Var.m12847r() ? 1L : 0L);
                String strM12830a = gr0Var.m12830a();
                if (strM12830a == null) {
                    ik8Var.mo2880m(11);
                } else {
                    ik8Var.mo2874C(11, strM12830a);
                }
                ik8Var.mo2878j(12, gr0Var.m12846q() ? 1L : 0L);
                ik8Var.mo2878j(13, gr0Var.m12848s() ? 1L : 0L);
                ik8Var.mo2878j(14, gr0Var.m12841l());
                ik8Var.mo2878j(15, gr0Var.m12838i());
                ik8Var.mo2878j(16, gr0Var.m12836g());
                String strM12831b = gr0Var.m12831b();
                if (strM12831b == null) {
                    ik8Var.mo2880m(17);
                } else {
                    ik8Var.mo2874C(17, strM12831b);
                }
                ik8Var.mo2874C(18, gr0Var.m12844o());
                String strM12842m = gr0Var.m12842m();
                if (strM12842m != null) {
                    ik8Var.mo2874C(19, strM12842m);
                } else {
                    ik8Var.mo2880m(19);
                }
                break;
            case 4:
                hs0 hs0Var = (hs0) obj;
                ik8Var.getClass();
                hs0Var.getClass();
                ik8Var.mo2874C(1, hs0Var.m13448f());
                ik8Var.mo2874C(2, hs0Var.m13446d());
                ik8Var.mo2874C(3, hs0Var.m13447e());
                ik8Var.mo2874C(4, hs0Var.m13451i());
                ik8Var.mo2877g(5, hs0Var.m13449g());
                ik8Var.mo2877g(6, 0.0d);
                ik8Var.mo2877g(7, hs0Var.m13450h());
                ik8Var.mo2878j(8, hs0Var.m13443a());
                ik8Var.mo2874C(9, hs0Var.m13444b());
                ik8Var.mo2874C(10, hs0Var.m13445c());
                break;
            case 5:
                gw1 gw1Var = (gw1) obj;
                ik8Var.getClass();
                gw1Var.getClass();
                ik8Var.mo2874C(1, gw1Var.m12926g());
                ik8Var.mo2874C(2, gw1Var.m12922c());
                ik8Var.mo2878j(3, gw1Var.m12927h());
                ik8Var.mo2877g(4, gw1Var.m12920a());
                ik8Var.mo2878j(5, gw1Var.m12923d());
                ik8Var.mo2878j(6, gw1Var.m12925f());
                Integer numM12924e = gw1Var.m12924e();
                if (numM12924e == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2878j(7, numM12924e.intValue());
                }
                Integer numM12921b = gw1Var.m12921b();
                if (numM12921b != null) {
                    ik8Var.mo2878j(8, numM12921b.intValue());
                } else {
                    ik8Var.mo2880m(8);
                }
                break;
            case 6:
                ct1 ct1Var = (ct1) obj;
                ik8Var.getClass();
                ct1Var.getClass();
                ik8Var.mo2874C(1, ct1Var.m9878f());
                ik8Var.mo2878j(2, ct1Var.m9876d());
                ik8Var.mo2878j(3, ct1Var.m9877e());
                Integer numM9875c = ct1Var.m9875c();
                if (numM9875c == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2878j(4, numM9875c.intValue());
                }
                Integer numM9873a = ct1Var.m9873a();
                if (numM9873a == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2878j(5, numM9873a.intValue());
                }
                ik8Var.mo2874C(6, ct1Var.m9881i());
                String strM9874b = ct1Var.m9874b();
                if (strM9874b == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, strM9874b);
                }
                ik8Var.mo2874C(8, ct1Var.m9880h());
                ik8Var.mo2878j(9, ct1Var.m9879g());
                break;
            case 7:
                dt1 dt1Var = (dt1) obj;
                ik8Var.getClass();
                dt1Var.getClass();
                ik8Var.mo2874C(1, dt1Var.m10617b());
                Integer numM10616a = dt1Var.m10616a();
                if (numM10616a == null) {
                    ik8Var.mo2880m(2);
                } else {
                    ik8Var.mo2878j(2, numM10616a.intValue());
                }
                ik8Var.mo2878j(3, dt1Var.m10618c());
                break;
            case 8:
                kb2 kb2Var = (kb2) obj;
                ik8Var.getClass();
                kb2Var.getClass();
                ik8Var.mo2874C(1, kb2Var.f46960a);
                ik8Var.mo2874C(2, kb2Var.f46961b);
                break;
            case 9:
                LanguageStatsEntity languageStatsEntity = (LanguageStatsEntity) obj;
                ik8Var.getClass();
                languageStatsEntity.getClass();
                ik8Var.mo2874C(1, languageStatsEntity.m7612h());
                ik8Var.mo2874C(2, languageStatsEntity.m7611g());
                ik8Var.mo2874C(3, languageStatsEntity.m7621q());
                LanguageStatValue languageStatValueM7614j = languageStatsEntity.m7614j();
                ik8Var.mo2877g(4, languageStatValueM7614j.m8026b());
                ik8Var.mo2877g(5, languageStatValueM7614j.m8025a());
                LanguageStatValue languageStatValueM7626v = languageStatsEntity.m7626v();
                ik8Var.mo2877g(6, languageStatValueM7626v.m8026b());
                ik8Var.mo2877g(7, languageStatValueM7626v.m8025a());
                LanguageStatValue languageStatValueM7607c = languageStatsEntity.m7607c();
                ik8Var.mo2877g(8, languageStatValueM7607c.m8026b());
                ik8Var.mo2877g(9, languageStatValueM7607c.m8025a());
                LanguageStatValue languageStatValueM7617m = languageStatsEntity.m7617m();
                ik8Var.mo2877g(10, languageStatValueM7617m.m8026b());
                ik8Var.mo2877g(11, languageStatValueM7617m.m8025a());
                LanguageStatValue languageStatValueM7629y = languageStatsEntity.m7629y();
                ik8Var.mo2877g(12, languageStatValueM7629y.m8026b());
                ik8Var.mo2877g(13, languageStatValueM7629y.m8025a());
                LanguageStatValue languageStatValueM7616l = languageStatsEntity.m7616l();
                ik8Var.mo2877g(14, languageStatValueM7616l.m8026b());
                ik8Var.mo2877g(15, languageStatValueM7616l.m8025a());
                LanguageStatValue languageStatValueM7627w = languageStatsEntity.m7627w();
                ik8Var.mo2877g(16, languageStatValueM7627w.m8026b());
                ik8Var.mo2877g(17, languageStatValueM7627w.m8025a());
                LanguageStatValue languageStatValueM7603A = languageStatsEntity.m7603A();
                ik8Var.mo2877g(18, languageStatValueM7603A.m8026b());
                ik8Var.mo2877g(19, languageStatValueM7603A.m8025a());
                LanguageStatValue languageStatValueM7618n = languageStatsEntity.m7618n();
                ik8Var.mo2877g(20, languageStatValueM7618n.m8026b());
                ik8Var.mo2877g(21, languageStatValueM7618n.m8025a());
                LanguageStatValue languageStatValueM7628x = languageStatsEntity.m7628x();
                ik8Var.mo2877g(22, languageStatValueM7628x.m8026b());
                ik8Var.mo2877g(23, languageStatValueM7628x.m8025a());
                LanguageStatValue languageStatValueM7613i = languageStatsEntity.m7613i();
                ik8Var.mo2877g(24, languageStatValueM7613i.m8026b());
                ik8Var.mo2877g(25, languageStatValueM7613i.m8025a());
                LanguageStatValue languageStatValueM7623s = languageStatsEntity.m7623s();
                ik8Var.mo2877g(26, languageStatValueM7623s.m8026b());
                ik8Var.mo2877g(27, languageStatValueM7623s.m8025a());
                LanguageStatValue languageStatValueM7619o = languageStatsEntity.m7619o();
                ik8Var.mo2877g(28, languageStatValueM7619o.m8026b());
                ik8Var.mo2877g(29, languageStatValueM7619o.m8025a());
                LanguageStatValue languageStatValueM7609e = languageStatsEntity.m7609e();
                ik8Var.mo2877g(30, languageStatValueM7609e.m8026b());
                ik8Var.mo2877g(31, languageStatValueM7609e.m8025a());
                LanguageStatValue languageStatValueM7606b = languageStatsEntity.m7606b();
                ik8Var.mo2877g(32, languageStatValueM7606b.m8026b());
                ik8Var.mo2877g(33, languageStatValueM7606b.m8025a());
                LanguageStatValue languageStatValueM7624t = languageStatsEntity.m7624t();
                ik8Var.mo2877g(34, languageStatValueM7624t.m8026b());
                ik8Var.mo2877g(35, languageStatValueM7624t.m8025a());
                LanguageStatValue languageStatValueM7620p = languageStatsEntity.m7620p();
                ik8Var.mo2877g(36, languageStatValueM7620p.m8026b());
                ik8Var.mo2877g(37, languageStatValueM7620p.m8025a());
                LanguageStatValue languageStatValueM7604B = languageStatsEntity.m7604B();
                ik8Var.mo2877g(38, languageStatValueM7604B.m8026b());
                ik8Var.mo2877g(39, languageStatValueM7604B.m8025a());
                LanguageStatValue languageStatValueM7608d = languageStatsEntity.m7608d();
                ik8Var.mo2877g(40, languageStatValueM7608d.m8026b());
                ik8Var.mo2877g(41, languageStatValueM7608d.m8025a());
                LanguageStatValue languageStatValueM7610f = languageStatsEntity.m7610f();
                ik8Var.mo2877g(42, languageStatValueM7610f.m8026b());
                ik8Var.mo2877g(43, languageStatValueM7610f.m8025a());
                LanguageStatValue languageStatValueM7615k = languageStatsEntity.m7615k();
                ik8Var.mo2877g(44, languageStatValueM7615k.m8026b());
                ik8Var.mo2877g(45, languageStatValueM7615k.m8025a());
                LanguageStatValue languageStatValueM7630z = languageStatsEntity.m7630z();
                ik8Var.mo2877g(46, languageStatValueM7630z.m8026b());
                ik8Var.mo2877g(47, languageStatValueM7630z.m8025a());
                LanguageStatValue languageStatValueM7622r = languageStatsEntity.m7622r();
                ik8Var.mo2877g(48, languageStatValueM7622r.m8026b());
                ik8Var.mo2877g(49, languageStatValueM7622r.m8025a());
                LanguageStatValue languageStatValueM7605a = languageStatsEntity.m7605a();
                ik8Var.mo2877g(50, languageStatValueM7605a.m8026b());
                ik8Var.mo2877g(51, languageStatValueM7605a.m8025a());
                LanguageStatValue languageStatValueM7625u = languageStatsEntity.m7625u();
                ik8Var.mo2877g(52, languageStatValueM7625u.m8026b());
                ik8Var.mo2877g(53, languageStatValueM7625u.m8025a());
                break;
            case 10:
                LanguageProgressChartEntryEntity languageProgressChartEntryEntity = (LanguageProgressChartEntryEntity) obj;
                ik8Var.getClass();
                languageProgressChartEntryEntity.getClass();
                ik8Var.mo2874C(1, languageProgressChartEntryEntity.m7599d());
                ik8Var.mo2874C(2, languageProgressChartEntryEntity.m7598c());
                ik8Var.mo2874C(3, languageProgressChartEntryEntity.m7601f());
                ik8Var.mo2874C(4, languageProgressChartEntryEntity.m7600e());
                ik8Var.mo2877g(5, languageProgressChartEntryEntity.m7597b());
                ik8Var.mo2877g(6, languageProgressChartEntryEntity.m7596a());
                ik8Var.mo2878j(7, languageProgressChartEntryEntity.m7602g());
                break;
            case 11:
                jx4 jx4Var = (jx4) obj;
                ik8Var.getClass();
                jx4Var.getClass();
                ik8Var.mo2878j(1, jx4Var.f46344a);
                ik8Var.mo2874C(2, jx4Var.f46345b);
                ik8Var.mo2874C(3, jx4Var.f46346c);
                ik8Var.mo2874C(4, jx4Var.f46347d);
                break;
            case 12:
                NoticeEntity noticeEntity = (NoticeEntity) obj;
                ik8Var.getClass();
                noticeEntity.getClass();
                ik8Var.mo2878j(1, noticeEntity.m7775b());
                ik8Var.mo2874C(2, noticeEntity.m7776c());
                ik8Var.mo2874C(3, noticeEntity.m7779f());
                ik8Var.mo2874C(4, noticeEntity.m7778e());
                ik8Var.mo2874C(5, noticeEntity.m7774a());
                ik8Var.mo2874C(6, noticeEntity.m7777d());
                ik8Var.mo2878j(7, noticeEntity.m7780g() ? 1L : 0L);
                break;
            case 13:
                ReferralEntity referralEntity = (ReferralEntity) obj;
                ik8Var.getClass();
                referralEntity.getClass();
                ik8Var.mo2878j(1, referralEntity.f17435a);
                String str2 = referralEntity.f17436b;
                if (str2 == null) {
                    ik8Var.mo2880m(2);
                } else {
                    ik8Var.mo2874C(2, str2);
                }
                String str3 = referralEntity.f17437c;
                if (str3 == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2874C(3, str3);
                }
                String str4 = referralEntity.f17438d;
                if (str4 != null) {
                    ik8Var.mo2874C(4, str4);
                } else {
                    ik8Var.mo2880m(4);
                }
                break;
            case 14:
                LibraryFastSearchEntity libraryFastSearchEntity = (LibraryFastSearchEntity) obj;
                ik8Var.getClass();
                libraryFastSearchEntity.getClass();
                ik8Var.mo2874C(1, libraryFastSearchEntity.f17375a);
                ik8Var.mo2874C(2, libraryFastSearchEntity.f17376b);
                ik8Var.mo2874C(3, libraryFastSearchEntity.f17377c);
                ik8Var.mo2874C(4, libraryFastSearchEntity.f17378d);
                String str5 = libraryFastSearchEntity.f17379e;
                if (str5 != null) {
                    ik8Var.mo2874C(5, str5);
                } else {
                    ik8Var.mo2880m(5);
                }
                break;
            case 15:
                o3a o3aVar = (o3a) obj;
                ik8Var.getClass();
                o3aVar.getClass();
                ik8Var.mo2874C(1, o3aVar.f53800a);
                ik8Var.mo2878j(2, o3aVar.f53801b);
                ik8Var.mo2874C(3, o3aVar.f53802c);
                ik8Var.mo2874C(4, o3aVar.f53803d);
                ik8Var.mo2874C(5, o3aVar.f53804e);
                ik8Var.mo2874C(6, o3aVar.f53805f);
                ik8Var.mo2874C(7, o3aVar.f53806g);
                ik8Var.mo2878j(8, o3aVar.f53807h);
                ik8Var.mo2878j(9, o3aVar.f53808i);
                break;
            case 16:
                f8b f8bVar = (f8b) obj;
                ik8Var.getClass();
                f8bVar.getClass();
                ik8Var.mo2874C(1, f8bVar.f38635a);
                ik8Var.mo2874C(2, f8bVar.f38636b);
                break;
            default:
                v8b v8bVar = (v8b) obj;
                ik8Var.getClass();
                v8bVar.getClass();
                ik8Var.mo2874C(1, v8bVar.f65029a);
                ik8Var.mo2874C(2, v8bVar.f65030b);
                break;
        }
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: s */
    public final String mo17165s() {
        switch (this.f63502z) {
            case 0:
                return "INSERT INTO `BadgeEntity` (`languageAndSlug`,`language`,`slug`,`name`,`goal`,`stat`,`metAt`,`gainedAt`,`imageUrl`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT INTO `CourseBlacklistEntity` (`id`,`language`,`title`) VALUES (?,?,?)";
            case 2:
                return "INSERT INTO `SourceBlacklistEntity` (`name`,`language`) VALUES (?,?)";
            case 3:
                return "INSERT INTO `ChallengeEntity` (`pk`,`code`,`title`,`challengeType`,`description`,`startDate`,`endDate`,`language`,`participantsCount`,`isDisabled`,`badgeUrl`,`isCompleted`,`isJoined`,`rank`,`order`,`knownWords`,`challengeLanguage`,`status`,`signupDeadline`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT INTO `ChallengeStatsEntity` (`language`,`challengeCode`,`code`,`title`,`progress`,`actual`,`target`,`bookId`,`bookImage`,`bookLanguage`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT INTO `CupTeamEntity` (`teamCode`,`name`,`totalCoins`,`coinsPerUser`,`participantCount`,`rank`,`prevRank`,`delta`) VALUES (?,?,?,?,?,?,?,?)";
            case 6:
                return "INSERT INTO `CupContributorEntity` (`scope`,`profileId`,`rank`,`prevRank`,`delta`,`username`,`photoUrl`,`teamCode`,`score`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT INTO `CupContributorMeEntity` (`scope`,`rank`,`score`) VALUES (?,?,?)";
            case 8:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 9:
                return "INSERT INTO `LanguageStatsEntity` (`languageAndPeriod`,`language`,`period`,`lessonCompleted_overall`,`lessonCompleted_change`,`speakingUsage_overall`,`speakingUsage_change`,`coinWords_overall`,`coinWords_change`,`lessonShared_overall`,`lessonShared_change`,`translationsShared_overall`,`translationsShared_change`,`lessonPublished_overall`,`lessonPublished_change`,`studyTime_overall`,`studyTime_change`,`wpm_overall`,`wpm_change`,`lessonTaken_overall`,`lessonTaken_change`,`translationsCreated_overall`,`translationsCreated_change`,`learnedWords_overall`,`learnedWords_change`,`readingUsage_overall`,`readingUsage_change`,`listening_overall`,`listening_change`,`earnedCoins_overall`,`earnedCoins_change`,`coinsRead_overall`,`coinsRead_change`,`reviewUsage_overall`,`reviewUsage_change`,`listeningUsage_overall`,`listeningUsage_change`,`writing_overall`,`writing_change`,`createdLingQs_overall`,`createdLingQs_change`,`knownWords_overall`,`knownWords_change`,`lessonImported_overall`,`lessonImported_change`,`translationsUsed_overall`,`translationsUsed_change`,`reading_overall`,`reading_change`,`coinsListen_overall`,`coinsListen_change`,`speaking_overall`,`speaking_change`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 10:
                return "INSERT INTO `LanguageProgressChartEntryEntity` (`metric`,`languageCode`,`period`,`name`,`daily`,`cumulative`,`position`) VALUES (?,?,?,?,?,?,?)";
            case 11:
                return "INSERT INTO `LessonAchievementEntity` (`lessonId`,`language`,`type`,`dataJson`) VALUES (?,?,?,?)";
            case 12:
                return "INSERT INTO `NoticeEntity` (`id`,`language`,`title`,`startDate`,`endDate`,`noticeType`,`isShown`) VALUES (?,?,?,?,?,?,?)";
            case 13:
                return "INSERT INTO `ReferralEntity` (`pk`,`username`,`photo`,`dateJoined`) VALUES (?,?,?,?)";
            case 14:
                return "INSERT INTO `LibraryFastSearchEntity` (`id`,`language`,`query`,`type`,`title`) VALUES (?,?,?,?,?)";
            case 15:
                return "INSERT INTO `TokenCwtEntity` (`id`,`lessonId`,`word`,`sentence`,`languageSrc`,`languageDst`,`translation`,`sentenceIndex`,`sentenceTokenIndex`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 16:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
