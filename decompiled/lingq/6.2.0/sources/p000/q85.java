package p000;

import com.lingq.core.database.entity.CardsAndLOTDJoin;
import com.lingq.core.database.entity.LibraryCounterEntity;
import com.lingq.core.database.entity.MilestoneEntity;
import com.lingq.core.database.entity.MilestoneMetEntity;
import com.lingq.core.database.entity.MilestoneStatsEntity;
import com.lingq.core.database.entity.NotificationEntity;
import com.lingq.core.database.entity.PlaylistEntity;
import com.lingq.core.database.entity.TtsUtteranceEntity;

/* JADX INFO: loaded from: classes.dex */
public final class q85 extends r46 {

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f57379z;

    public /* synthetic */ q85(int i) {
        this.f57379z = i;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: l */
    public final void mo17164l(ik8 ik8Var, Object obj) {
        switch (this.f57379z) {
            case 0:
                v85 v85Var = (v85) obj;
                ik8Var.getClass();
                v85Var.getClass();
                ik8Var.mo2878j(1, v85Var.m23171a());
                ik8Var.mo2874C(2, v85Var.m23172b());
                ik8Var.mo2874C(3, v85Var.m23173c());
                ik8Var.mo2878j(4, v85Var.m23174d() ? 1L : 0L);
                ik8Var.mo2878j(5, 0L);
                break;
            case 1:
                da5 da5Var = (da5) obj;
                ik8Var.getClass();
                da5Var.getClass();
                ik8Var.mo2874C(1, da5Var.f35291a);
                ik8Var.mo2878j(2, da5Var.f35292b);
                ik8Var.mo2874C(3, da5Var.f35293c);
                ik8Var.mo2878j(4, da5Var.f35294d);
                ik8Var.mo2874C(5, da5Var.f35295e);
                break;
            case 2:
                LibraryCounterEntity libraryCounterEntity = (LibraryCounterEntity) obj;
                ik8Var.getClass();
                libraryCounterEntity.getClass();
                ik8Var.mo2878j(1, libraryCounterEntity.f17357a);
                ik8Var.mo2874C(2, libraryCounterEntity.f17358b);
                ik8Var.mo2878j(3, libraryCounterEntity.f17359c ? 1L : 0L);
                Float f = libraryCounterEntity.f17360d;
                if (f == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2877g(4, f.floatValue());
                }
                Double d = libraryCounterEntity.f17361e;
                if (d == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2877g(5, d.doubleValue());
                }
                Double d2 = libraryCounterEntity.f17362f;
                if (d2 == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2877g(6, d2.doubleValue());
                }
                ik8Var.mo2878j(7, libraryCounterEntity.f17363g ? 1L : 0L);
                ik8Var.mo2877g(8, libraryCounterEntity.f17364h);
                ik8Var.mo2878j(9, libraryCounterEntity.f17365i);
                ik8Var.mo2878j(10, libraryCounterEntity.f17366j);
                ik8Var.mo2878j(11, libraryCounterEntity.f17367k);
                ik8Var.mo2878j(12, libraryCounterEntity.f17368l);
                ik8Var.mo2878j(13, libraryCounterEntity.f17369m);
                ik8Var.mo2878j(14, libraryCounterEntity.f17370n ? 1L : 0L);
                ik8Var.mo2878j(15, libraryCounterEntity.f17371o);
                ik8Var.mo2878j(16, libraryCounterEntity.f17372p);
                Double d3 = libraryCounterEntity.f17373q;
                if (d3 == null) {
                    ik8Var.mo2880m(17);
                } else {
                    ik8Var.mo2877g(17, d3.doubleValue());
                }
                Double d4 = libraryCounterEntity.f17374r;
                if (d4 != null) {
                    ik8Var.mo2877g(18, d4.doubleValue());
                } else {
                    ik8Var.mo2880m(18);
                }
                break;
            case 3:
                cp1 cp1Var = (cp1) obj;
                ik8Var.getClass();
                cp1Var.getClass();
                ik8Var.mo2878j(1, cp1Var.m9826c());
                ik8Var.mo2878j(2, cp1Var.m9824a());
                ik8Var.mo2878j(3, cp1Var.m9825b());
                break;
            case 4:
                qf2 qf2Var = (qf2) obj;
                ik8Var.getClass();
                qf2Var.getClass();
                ik8Var.mo2874C(1, qf2Var.f57682a);
                ik8Var.mo2874C(2, qf2Var.f57683b);
                break;
            case 5:
                vl4 vl4Var = (vl4) obj;
                ik8Var.getClass();
                vl4Var.getClass();
                ik8Var.mo2874C(1, vl4Var.f65560a);
                ik8Var.mo2874C(2, vl4Var.f65561b);
                break;
            case 6:
                MilestoneEntity milestoneEntity = (MilestoneEntity) obj;
                ik8Var.getClass();
                milestoneEntity.getClass();
                ik8Var.mo2874C(1, milestoneEntity.m7764d());
                String strM7763c = milestoneEntity.m7763c();
                if (strM7763c == null) {
                    ik8Var.mo2880m(2);
                } else {
                    ik8Var.mo2874C(2, strM7763c);
                }
                String strM7766f = milestoneEntity.m7766f();
                if (strM7766f == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2874C(3, strM7766f);
                }
                String strM7765e = milestoneEntity.m7765e();
                if (strM7765e == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, strM7765e);
                }
                ik8Var.mo2878j(5, milestoneEntity.m7762b());
                String strM7767g = milestoneEntity.m7767g();
                if (strM7767g == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, strM7767g);
                }
                String strM7761a = milestoneEntity.m7761a();
                if (strM7761a != null) {
                    ik8Var.mo2874C(7, strM7761a);
                } else {
                    ik8Var.mo2880m(7);
                }
                break;
            case 7:
                MilestoneMetEntity milestoneMetEntity = (MilestoneMetEntity) obj;
                ik8Var.getClass();
                milestoneMetEntity.getClass();
                ik8Var.mo2874C(1, milestoneMetEntity.m7768a());
                ik8Var.mo2874C(2, milestoneMetEntity.m7769b());
                break;
            case 8:
                MilestoneStatsEntity milestoneStatsEntity = (MilestoneStatsEntity) obj;
                ik8Var.getClass();
                milestoneStatsEntity.getClass();
                ik8Var.mo2874C(1, milestoneStatsEntity.m7772c());
                ik8Var.mo2878j(2, milestoneStatsEntity.m7771b());
                ik8Var.mo2878j(3, milestoneStatsEntity.m7773d());
                ik8Var.mo2878j(4, milestoneStatsEntity.m7770a());
                break;
            case 9:
                NotificationEntity notificationEntity = (NotificationEntity) obj;
                ik8Var.getClass();
                notificationEntity.getClass();
                ik8Var.mo2878j(1, notificationEntity.m7785e());
                String strM7789i = notificationEntity.m7789i();
                if (strM7789i == null) {
                    ik8Var.mo2880m(2);
                } else {
                    ik8Var.mo2874C(2, strM7789i);
                }
                String strM7782b = notificationEntity.m7782b();
                if (strM7782b == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2874C(3, strM7782b);
                }
                String strM7784d = notificationEntity.m7784d();
                if (strM7784d == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, strM7784d);
                }
                String strM7788h = notificationEntity.m7788h();
                if (strM7788h == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, strM7788h);
                }
                String strM7787g = notificationEntity.m7787g();
                if (strM7787g == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, strM7787g);
                }
                String strM7783c = notificationEntity.m7783c();
                if (strM7783c == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, strM7783c);
                }
                String strM7781a = notificationEntity.m7781a();
                if (strM7781a == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, strM7781a);
                }
                Boolean boolM7790j = notificationEntity.m7790j();
                Integer numValueOf = boolM7790j != null ? Integer.valueOf(boolM7790j.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    ik8Var.mo2880m(9);
                } else {
                    ik8Var.mo2878j(9, numValueOf.intValue());
                }
                String strM7786f = notificationEntity.m7786f();
                if (strM7786f != null) {
                    ik8Var.mo2874C(10, strM7786f);
                } else {
                    ik8Var.mo2880m(10);
                }
                break;
            case 10:
                PlaylistEntity playlistEntity = (PlaylistEntity) obj;
                ik8Var.getClass();
                playlistEntity.getClass();
                ik8Var.mo2874C(1, playlistEntity.m7793c());
                ik8Var.mo2874C(2, playlistEntity.m7791a());
                ik8Var.mo2874C(3, playlistEntity.m7792b());
                ik8Var.mo2878j(4, playlistEntity.m7795e());
                ik8Var.mo2878j(5, playlistEntity.m7796f() ? 1L : 0L);
                ik8Var.mo2878j(6, playlistEntity.m7797g() ? 1L : 0L);
                ik8Var.mo2878j(7, playlistEntity.m7794d());
                break;
            case 11:
                PlaylistEntity playlistEntity2 = (PlaylistEntity) obj;
                ik8Var.getClass();
                playlistEntity2.getClass();
                ik8Var.mo2874C(1, playlistEntity2.m7793c());
                ik8Var.mo2874C(2, playlistEntity2.m7791a());
                ik8Var.mo2874C(3, playlistEntity2.m7792b());
                ik8Var.mo2878j(4, playlistEntity2.m7795e());
                ik8Var.mo2878j(5, playlistEntity2.m7796f() ? 1L : 0L);
                ik8Var.mo2878j(6, playlistEntity2.m7797g() ? 1L : 0L);
                ik8Var.mo2878j(7, playlistEntity2.m7794d());
                break;
            case 12:
                bd7 bd7Var = (bd7) obj;
                ik8Var.getClass();
                bd7Var.getClass();
                ik8Var.mo2874C(1, bd7Var.m3648c());
                ik8Var.mo2874C(2, bd7Var.m3647b());
                ik8Var.mo2878j(3, bd7Var.m3646a());
                Integer numM3649d = bd7Var.m3649d();
                if (numM3649d == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2878j(4, numM3649d.intValue());
                }
                ik8Var.mo2878j(5, bd7Var.m3650e() ? 1L : 0L);
                break;
            case 13:
                sx4 sx4Var = (sx4) obj;
                ik8Var.getClass();
                sx4Var.getClass();
                ik8Var.mo2878j(1, sx4Var.m21760c());
                ik8Var.mo2874C(2, sx4Var.m21761d());
                ik8Var.mo2878j(3, sx4Var.m21764g() ? 1L : 0L);
                ik8Var.mo2878j(4, sx4Var.m21758a());
                ik8Var.mo2874C(5, sx4Var.m21763f());
                String strM21759b = sx4Var.m21759b();
                if (strM21759b == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, strM21759b);
                }
                ik8Var.mo2878j(7, sx4Var.m21762e());
                break;
            case 14:
                qi7 qi7Var = (qi7) obj;
                ik8Var.getClass();
                qi7Var.getClass();
                ik8Var.mo2874C(1, qi7Var.f57821a);
                ik8Var.mo2878j(2, qi7Var.f57822b.longValue());
                break;
            case 15:
                rp9 rp9Var = (rp9) obj;
                ik8Var.getClass();
                rp9Var.getClass();
                ik8Var.mo2874C(1, rp9Var.f59687a);
                ik8Var.mo2878j(2, rp9Var.m20741a());
                ik8Var.mo2878j(3, rp9Var.f59689c);
                break;
            case 16:
                TtsUtteranceEntity ttsUtteranceEntity = (TtsUtteranceEntity) obj;
                ik8Var.getClass();
                ttsUtteranceEntity.getClass();
                ik8Var.mo2874C(1, ttsUtteranceEntity.m7822b());
                ik8Var.mo2878j(2, ttsUtteranceEntity.m7824d());
                ik8Var.mo2874C(3, ttsUtteranceEntity.m7821a());
                ik8Var.mo2874C(4, ttsUtteranceEntity.m7823c());
                break;
            case 17:
                kl4 kl4Var = (kl4) obj;
                ik8Var.getClass();
                kl4Var.getClass();
                ik8Var.mo2874C(1, kl4Var.f47488a);
                ik8Var.mo2874C(2, kl4Var.f47489b);
                ik8Var.mo2878j(3, kl4Var.f47490c);
                break;
            case 18:
                CardsAndLOTDJoin cardsAndLOTDJoin = (CardsAndLOTDJoin) obj;
                ik8Var.getClass();
                cardsAndLOTDJoin.getClass();
                ik8Var.mo2874C(1, cardsAndLOTDJoin.m7547b());
                ik8Var.mo2874C(2, cardsAndLOTDJoin.m7546a());
                break;
            case 19:
                q0b q0bVar = (q0b) obj;
                ik8Var.getClass();
                q0bVar.getClass();
                ik8Var.mo2874C(1, q0bVar.m19592b());
                ik8Var.mo2878j(2, q0bVar.m19591a());
                break;
            default:
                p8b p8bVar = (p8b) obj;
                ik8Var.getClass();
                p8bVar.getClass();
                ik8Var.mo2874C(1, p8bVar.f55772a);
                ik8Var.mo2878j(2, bcd.m3630l(p8bVar.f55773b));
                ik8Var.mo2874C(3, p8bVar.f55774c);
                ik8Var.mo2874C(4, p8bVar.f55775d);
                sz1 sz1Var = sz1.f61645b;
                ik8Var.mo2879k(5, jad.m14369d(p8bVar.f55776e));
                ik8Var.mo2879k(6, jad.m14369d(p8bVar.f55777f));
                ik8Var.mo2878j(7, p8bVar.f55778g);
                ik8Var.mo2878j(8, p8bVar.f55779h);
                ik8Var.mo2878j(9, p8bVar.f55780i);
                ik8Var.mo2878j(10, p8bVar.f55782k);
                ik8Var.mo2878j(11, bcd.m3620b(p8bVar.f55783l));
                ik8Var.mo2878j(12, p8bVar.f55784m);
                ik8Var.mo2878j(13, p8bVar.f55785n);
                ik8Var.mo2878j(14, p8bVar.f55786o);
                ik8Var.mo2878j(15, p8bVar.f55787p);
                ik8Var.mo2878j(16, p8bVar.f55788q ? 1L : 0L);
                ik8Var.mo2878j(17, bcd.m3628j(p8bVar.f55789r));
                ik8Var.mo2878j(18, p8bVar.m18984g());
                ik8Var.mo2878j(19, p8bVar.m18981d());
                ik8Var.mo2878j(20, p8bVar.m18982e());
                ik8Var.mo2878j(21, p8bVar.m18983f());
                ik8Var.mo2878j(22, p8bVar.m18985h());
                String strM18986i = p8bVar.m18986i();
                if (strM18986i == null) {
                    ik8Var.mo2880m(23);
                } else {
                    ik8Var.mo2874C(23, strM18986i);
                }
                Boolean boolM18980c = p8bVar.m18980c();
                Integer numValueOf2 = boolM18980c != null ? Integer.valueOf(boolM18980c.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 == null) {
                    ik8Var.mo2880m(24);
                } else {
                    ik8Var.mo2878j(24, numValueOf2.intValue());
                }
                ak1 ak1Var = p8bVar.f55781j;
                ik8Var.mo2878j(25, bcd.m3627i(ak1Var.m518f()));
                ik8Var.mo2879k(26, bcd.m3622d(ak1Var.m517e()));
                ik8Var.mo2878j(27, ak1Var.m521i() ? 1L : 0L);
                ik8Var.mo2878j(28, ak1Var.m522j() ? 1L : 0L);
                ik8Var.mo2878j(29, ak1Var.m520h() ? 1L : 0L);
                ik8Var.mo2878j(30, ak1Var.m523k() ? 1L : 0L);
                ik8Var.mo2878j(31, ak1Var.m514b());
                ik8Var.mo2878j(32, ak1Var.m513a());
                ik8Var.mo2879k(33, bcd.m3629k(ak1Var.m515c()));
                break;
        }
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: s */
    public final String mo17165s() {
        switch (this.f57379z) {
            case 0:
                return "INSERT INTO `LibraryDownloadEntity` (`id`,`language`,`type`,`isDownloaded`,`downloadProgress`) VALUES (?,?,?,?,?)";
            case 1:
                return "INSERT INTO `LibraryShelfAndContentJoin` (`codeWithLanguage`,`id`,`type`,`order`,`ofQuery`) VALUES (?,?,?,?,?)";
            case 2:
                return "INSERT INTO `LibraryCounterEntity` (`id`,`type`,`roseGiven`,`progress`,`listenTimes`,`readTimes`,`isTaken`,`difficulty`,`rosesCount`,`newWordsCount`,`knownWordsCount`,`cardsCount`,`lessonsCount`,`isCompletelyTaken`,`totalWordsCount`,`uniqueWordsCount`,`audioStart`,`audioEnd`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT INTO `CoursesAndLessonsJoin` (`pk`,`contentId`,`courseOrder`) VALUES (?,?,?)";
            case 4:
                return "INSERT INTO `DictionaryLocaleEntity` (`code`,`title`) VALUES (?,?)";
            case 5:
                return "INSERT INTO `LanguageDictionaryLocaleJoin` (`language`,`code`) VALUES (?,?)";
            case 6:
                return "INSERT INTO `MilestoneEntity` (`languageAndSlug`,`language`,`slug`,`name`,`goal`,`stat`,`date`) VALUES (?,?,?,?,?,?,?)";
            case 7:
                return "INSERT INTO `MilestoneMetEntity` (`languageAndSlug`,`metAt`) VALUES (?,?)";
            case 8:
                return "INSERT INTO `MilestoneStatsEntity` (`language`,`knownWords`,`lingqs`,`dailyScore`) VALUES (?,?,?,?)";
            case 9:
                return "INSERT INTO `NotificationEntity` (`pk`,`url`,`language`,`notificationLanguage`,`type`,`title`,`message`,`image`,`isNew`,`timestamp`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `PlaylistEntity` (`nameWithLanguage`,`language`,`name`,`pk`,`isDefault`,`isFeatured`,`order`) VALUES (?,?,?,?,?,?,?)";
            case 11:
                return "INSERT INTO `PlaylistEntity` (`nameWithLanguage`,`language`,`name`,`pk`,`isDefault`,`isFeatured`,`order`) VALUES (?,?,?,?,?,?,?)";
            case 12:
                return "INSERT INTO `PlaylistAndLessonsJoin` (`nameWithLanguage`,`language`,`contentId`,`order`,`isCourse`) VALUES (?,?,?,?,?)";
            case 13:
                return "INSERT INTO `LessonAudioDownloadEntity` (`id`,`language`,`isDownloaded`,`downloadProgress`,`status`,`errorType`,`lastUpdated`) VALUES (?,?,?,?,?,?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 16:
                return "INSERT INTO `TtsUtteranceEntity` (`idWithLanguageAndData`,`utteranceId`,`audio`,`text`) VALUES (?,?,?,?)";
            case 17:
                return "INSERT INTO `LanguageAndTtsVoicesJoin` (`code`,`name`,`voiceOrder`) VALUES (?,?,?)";
            case 18:
                return "INSERT INTO `CardsAndLOTDJoin` (`termWithLanguage`,`lotd`) VALUES (?,?)";
            case 19:
                return "INSERT INTO `VocabularyOrderEntity` (`termWithLanguage`,`sortPosition`) VALUES (?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
