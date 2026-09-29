package p000;

import com.lingq.core.database.entity.CardsAndLOTDJoin;
import com.lingq.core.database.entity.LibraryCounterEntity;
import com.lingq.core.database.entity.LibraryShelfEntity;
import com.lingq.core.database.entity.MilestoneEntity;
import com.lingq.core.database.entity.MilestoneMetEntity;
import com.lingq.core.database.entity.MilestoneStatsEntity;
import com.lingq.core.database.entity.NotificationEntity;
import com.lingq.core.database.entity.PlaylistEntity;
import com.lingq.core.database.entity.TtsUtteranceEntity;

/* JADX INFO: loaded from: classes.dex */
public final class p85 extends ss5 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f55752p;

    public /* synthetic */ p85(int i) {
        this.f55752p = i;
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: m */
    public final void mo16668m(ik8 ik8Var, Object obj) {
        switch (this.f55752p) {
            case 0:
                dp1 dp1Var = (dp1) obj;
                ik8Var.getClass();
                dp1Var.getClass();
                ik8Var.mo2878j(1, dp1Var.m10568c());
                ik8Var.mo2878j(2, dp1Var.m10566a());
                ik8Var.mo2878j(3, dp1Var.m10567b());
                ik8Var.mo2874C(4, dp1Var.m10569d());
                ik8Var.mo2878j(5, dp1Var.m10568c());
                ik8Var.mo2878j(6, dp1Var.m10566a());
                ik8Var.mo2874C(7, dp1Var.m10569d());
                break;
            case 1:
                v85 v85Var = (v85) obj;
                ik8Var.getClass();
                v85Var.getClass();
                ik8Var.mo2878j(1, v85Var.m23171a());
                ik8Var.mo2874C(2, v85Var.m23172b());
                ik8Var.mo2874C(3, v85Var.m23173c());
                ik8Var.mo2878j(4, v85Var.m23174d() ? 1L : 0L);
                ik8Var.mo2878j(5, 0L);
                ik8Var.mo2878j(6, v85Var.m23171a());
                ik8Var.mo2874C(7, v85Var.m23172b());
                ik8Var.mo2874C(8, v85Var.m23173c());
                break;
            case 2:
                da5 da5Var = (da5) obj;
                ik8Var.getClass();
                da5Var.getClass();
                String str = da5Var.f35291a;
                ik8Var.mo2874C(1, str);
                long j = da5Var.f35292b;
                ik8Var.mo2878j(2, j);
                String str2 = da5Var.f35293c;
                ik8Var.mo2874C(3, str2);
                ik8Var.mo2878j(4, da5Var.f35294d);
                ik8Var.mo2874C(5, da5Var.f35295e);
                ik8Var.mo2874C(6, str);
                ik8Var.mo2878j(7, j);
                ik8Var.mo2874C(8, str2);
                break;
            case 3:
                LibraryCounterEntity libraryCounterEntity = (LibraryCounterEntity) obj;
                ik8Var.getClass();
                libraryCounterEntity.getClass();
                long j2 = libraryCounterEntity.f17357a;
                ik8Var.mo2878j(1, j2);
                String str3 = libraryCounterEntity.f17358b;
                ik8Var.mo2874C(2, str3);
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
                if (d4 == null) {
                    ik8Var.mo2880m(18);
                } else {
                    ik8Var.mo2877g(18, d4.doubleValue());
                }
                ik8Var.mo2878j(19, j2);
                ik8Var.mo2874C(20, str3);
                break;
            case 4:
                LibraryShelfEntity libraryShelfEntity = (LibraryShelfEntity) obj;
                ik8Var.getClass();
                libraryShelfEntity.getClass();
                ik8Var.mo2874C(1, libraryShelfEntity.f17381a);
                break;
            case 5:
                LibraryCounterEntity libraryCounterEntity2 = (LibraryCounterEntity) obj;
                ik8Var.getClass();
                libraryCounterEntity2.getClass();
                long j3 = libraryCounterEntity2.f17357a;
                ik8Var.mo2878j(1, j3);
                String str4 = libraryCounterEntity2.f17358b;
                ik8Var.mo2874C(2, str4);
                ik8Var.mo2878j(3, libraryCounterEntity2.f17359c ? 1L : 0L);
                Float f2 = libraryCounterEntity2.f17360d;
                if (f2 == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2877g(4, f2.floatValue());
                }
                Double d5 = libraryCounterEntity2.f17361e;
                if (d5 == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2877g(5, d5.doubleValue());
                }
                Double d6 = libraryCounterEntity2.f17362f;
                if (d6 == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2877g(6, d6.doubleValue());
                }
                ik8Var.mo2878j(7, libraryCounterEntity2.f17363g ? 1L : 0L);
                ik8Var.mo2877g(8, libraryCounterEntity2.f17364h);
                ik8Var.mo2878j(9, libraryCounterEntity2.f17365i);
                ik8Var.mo2878j(10, libraryCounterEntity2.f17366j);
                ik8Var.mo2878j(11, libraryCounterEntity2.f17367k);
                ik8Var.mo2878j(12, libraryCounterEntity2.f17368l);
                ik8Var.mo2878j(13, libraryCounterEntity2.f17369m);
                ik8Var.mo2878j(14, libraryCounterEntity2.f17370n ? 1L : 0L);
                ik8Var.mo2878j(15, libraryCounterEntity2.f17371o);
                ik8Var.mo2878j(16, libraryCounterEntity2.f17372p);
                Double d7 = libraryCounterEntity2.f17373q;
                if (d7 == null) {
                    ik8Var.mo2880m(17);
                } else {
                    ik8Var.mo2877g(17, d7.doubleValue());
                }
                Double d8 = libraryCounterEntity2.f17374r;
                if (d8 == null) {
                    ik8Var.mo2880m(18);
                } else {
                    ik8Var.mo2877g(18, d8.doubleValue());
                }
                ik8Var.mo2878j(19, j3);
                ik8Var.mo2874C(20, str4);
                break;
            case 6:
                cp1 cp1Var = (cp1) obj;
                ik8Var.getClass();
                cp1Var.getClass();
                ik8Var.mo2878j(1, cp1Var.m9826c());
                ik8Var.mo2878j(2, cp1Var.m9824a());
                ik8Var.mo2878j(3, cp1Var.m9825b());
                ik8Var.mo2878j(4, cp1Var.m9826c());
                ik8Var.mo2878j(5, cp1Var.m9824a());
                break;
            case 7:
                qf2 qf2Var = (qf2) obj;
                ik8Var.getClass();
                qf2Var.getClass();
                String str5 = qf2Var.f57682a;
                ik8Var.mo2874C(1, str5);
                ik8Var.mo2874C(2, qf2Var.f57683b);
                ik8Var.mo2874C(3, str5);
                break;
            case 8:
                vl4 vl4Var = (vl4) obj;
                ik8Var.getClass();
                vl4Var.getClass();
                String str6 = vl4Var.f65560a;
                ik8Var.mo2874C(1, str6);
                String str7 = vl4Var.f65561b;
                ik8Var.mo2874C(2, str7);
                ik8Var.mo2874C(3, str6);
                ik8Var.mo2874C(4, str7);
                break;
            case 9:
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
                if (strM7761a == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, strM7761a);
                }
                ik8Var.mo2874C(8, milestoneEntity.m7764d());
                break;
            case 10:
                MilestoneMetEntity milestoneMetEntity = (MilestoneMetEntity) obj;
                ik8Var.getClass();
                milestoneMetEntity.getClass();
                ik8Var.mo2874C(1, milestoneMetEntity.m7768a());
                ik8Var.mo2874C(2, milestoneMetEntity.m7769b());
                ik8Var.mo2874C(3, milestoneMetEntity.m7768a());
                break;
            case 11:
                MilestoneStatsEntity milestoneStatsEntity = (MilestoneStatsEntity) obj;
                ik8Var.getClass();
                milestoneStatsEntity.getClass();
                ik8Var.mo2874C(1, milestoneStatsEntity.m7772c());
                ik8Var.mo2878j(2, milestoneStatsEntity.m7771b());
                ik8Var.mo2878j(3, milestoneStatsEntity.m7773d());
                ik8Var.mo2878j(4, milestoneStatsEntity.m7770a());
                ik8Var.mo2874C(5, milestoneStatsEntity.m7772c());
                break;
            case 12:
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
                if (strM7786f == null) {
                    ik8Var.mo2880m(10);
                } else {
                    ik8Var.mo2874C(10, strM7786f);
                }
                ik8Var.mo2878j(11, notificationEntity.m7785e());
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
                ik8Var.mo2878j(8, sx4Var.m21760c());
                ik8Var.mo2874C(9, sx4Var.m21761d());
                break;
            case 14:
                PlaylistEntity playlistEntity = (PlaylistEntity) obj;
                ik8Var.getClass();
                playlistEntity.getClass();
                ik8Var.mo2874C(1, playlistEntity.m7793c());
                break;
            case 15:
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
                ik8Var.mo2874C(8, playlistEntity2.m7793c());
                break;
            case 16:
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
                ik8Var.mo2874C(6, bd7Var.m3648c());
                ik8Var.mo2878j(7, bd7Var.m3646a());
                ik8Var.mo2878j(8, bd7Var.m3650e() ? 1L : 0L);
                break;
            case 17:
                TtsUtteranceEntity ttsUtteranceEntity = (TtsUtteranceEntity) obj;
                ik8Var.getClass();
                ttsUtteranceEntity.getClass();
                ik8Var.mo2874C(1, ttsUtteranceEntity.m7822b());
                ik8Var.mo2878j(2, ttsUtteranceEntity.m7824d());
                ik8Var.mo2874C(3, ttsUtteranceEntity.m7821a());
                ik8Var.mo2874C(4, ttsUtteranceEntity.m7823c());
                ik8Var.mo2874C(5, ttsUtteranceEntity.m7822b());
                break;
            case 18:
                kl4 kl4Var = (kl4) obj;
                ik8Var.getClass();
                kl4Var.getClass();
                String str8 = kl4Var.f47488a;
                ik8Var.mo2874C(1, str8);
                String str9 = kl4Var.f47489b;
                ik8Var.mo2874C(2, str9);
                ik8Var.mo2878j(3, kl4Var.f47490c);
                ik8Var.mo2874C(4, str8);
                ik8Var.mo2874C(5, str9);
                break;
            case 19:
                CardsAndLOTDJoin cardsAndLOTDJoin = (CardsAndLOTDJoin) obj;
                ik8Var.getClass();
                cardsAndLOTDJoin.getClass();
                ik8Var.mo2874C(1, cardsAndLOTDJoin.m7547b());
                ik8Var.mo2874C(2, cardsAndLOTDJoin.m7546a());
                ik8Var.mo2874C(3, cardsAndLOTDJoin.m7547b());
                break;
            case 20:
                q0b q0bVar = (q0b) obj;
                ik8Var.getClass();
                q0bVar.getClass();
                ik8Var.mo2874C(1, q0bVar.m19592b());
                ik8Var.mo2878j(2, q0bVar.m19591a());
                ik8Var.mo2874C(3, q0bVar.m19592b());
                break;
            default:
                p8b p8bVar = (p8b) obj;
                ik8Var.getClass();
                p8bVar.getClass();
                String str10 = p8bVar.f55772a;
                ik8Var.mo2874C(1, str10);
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
                ik8Var.mo2874C(34, str10);
                break;
        }
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: s */
    public final String mo16669s() {
        switch (this.f55752p) {
            case 0:
                return "UPDATE `CoursesAndLessonsSortJoin` SET `pk` = ?,`contentId` = ?,`courseOrder` = ?,`sort` = ? WHERE `pk` = ? AND `contentId` = ? AND `sort` = ?";
            case 1:
                return "UPDATE `LibraryDownloadEntity` SET `id` = ?,`language` = ?,`type` = ?,`isDownloaded` = ?,`downloadProgress` = ? WHERE `id` = ? AND `language` = ? AND `type` = ?";
            case 2:
                return "UPDATE `LibraryShelfAndContentJoin` SET `codeWithLanguage` = ?,`id` = ?,`type` = ?,`order` = ?,`ofQuery` = ? WHERE `codeWithLanguage` = ? AND `id` = ? AND `type` = ?";
            case 3:
                return "UPDATE `LibraryCounterEntity` SET `id` = ?,`type` = ?,`roseGiven` = ?,`progress` = ?,`listenTimes` = ?,`readTimes` = ?,`isTaken` = ?,`difficulty` = ?,`rosesCount` = ?,`newWordsCount` = ?,`knownWordsCount` = ?,`cardsCount` = ?,`lessonsCount` = ?,`isCompletelyTaken` = ?,`totalWordsCount` = ?,`uniqueWordsCount` = ?,`audioStart` = ?,`audioEnd` = ? WHERE `id` = ? AND `type` = ?";
            case 4:
                return "DELETE FROM `LibraryShelfEntity` WHERE `codeWithLanguage` = ?";
            case 5:
                return "UPDATE OR ABORT `LibraryCounterEntity` SET `id` = ?,`type` = ?,`roseGiven` = ?,`progress` = ?,`listenTimes` = ?,`readTimes` = ?,`isTaken` = ?,`difficulty` = ?,`rosesCount` = ?,`newWordsCount` = ?,`knownWordsCount` = ?,`cardsCount` = ?,`lessonsCount` = ?,`isCompletelyTaken` = ?,`totalWordsCount` = ?,`uniqueWordsCount` = ?,`audioStart` = ?,`audioEnd` = ? WHERE `id` = ? AND `type` = ?";
            case 6:
                return "UPDATE `CoursesAndLessonsJoin` SET `pk` = ?,`contentId` = ?,`courseOrder` = ? WHERE `pk` = ? AND `contentId` = ?";
            case 7:
                return "UPDATE `DictionaryLocaleEntity` SET `code` = ?,`title` = ? WHERE `code` = ?";
            case 8:
                return "UPDATE `LanguageDictionaryLocaleJoin` SET `language` = ?,`code` = ? WHERE `language` = ? AND `code` = ?";
            case 9:
                return "UPDATE `MilestoneEntity` SET `languageAndSlug` = ?,`language` = ?,`slug` = ?,`name` = ?,`goal` = ?,`stat` = ?,`date` = ? WHERE `languageAndSlug` = ?";
            case 10:
                return "UPDATE `MilestoneMetEntity` SET `languageAndSlug` = ?,`metAt` = ? WHERE `languageAndSlug` = ?";
            case 11:
                return "UPDATE `MilestoneStatsEntity` SET `language` = ?,`knownWords` = ?,`lingqs` = ?,`dailyScore` = ? WHERE `language` = ?";
            case 12:
                return "UPDATE `NotificationEntity` SET `pk` = ?,`url` = ?,`language` = ?,`notificationLanguage` = ?,`type` = ?,`title` = ?,`message` = ?,`image` = ?,`isNew` = ?,`timestamp` = ? WHERE `pk` = ?";
            case 13:
                return "UPDATE `LessonAudioDownloadEntity` SET `id` = ?,`language` = ?,`isDownloaded` = ?,`downloadProgress` = ?,`status` = ?,`errorType` = ?,`lastUpdated` = ? WHERE `id` = ? AND `language` = ?";
            case 14:
                return "DELETE FROM `PlaylistEntity` WHERE `nameWithLanguage` = ?";
            case 15:
                return "UPDATE `PlaylistEntity` SET `nameWithLanguage` = ?,`language` = ?,`name` = ?,`pk` = ?,`isDefault` = ?,`isFeatured` = ?,`order` = ? WHERE `nameWithLanguage` = ?";
            case 16:
                return "UPDATE `PlaylistAndLessonsJoin` SET `nameWithLanguage` = ?,`language` = ?,`contentId` = ?,`order` = ?,`isCourse` = ? WHERE `nameWithLanguage` = ? AND `contentId` = ? AND `isCourse` = ?";
            case 17:
                return "UPDATE `TtsUtteranceEntity` SET `idWithLanguageAndData` = ?,`utteranceId` = ?,`audio` = ?,`text` = ? WHERE `idWithLanguageAndData` = ?";
            case 18:
                return "UPDATE `LanguageAndTtsVoicesJoin` SET `code` = ?,`name` = ?,`voiceOrder` = ? WHERE `code` = ? AND `name` = ?";
            case 19:
                return "UPDATE `CardsAndLOTDJoin` SET `termWithLanguage` = ?,`lotd` = ? WHERE `termWithLanguage` = ?";
            case 20:
                return "UPDATE `VocabularyOrderEntity` SET `termWithLanguage` = ?,`sortPosition` = ? WHERE `termWithLanguage` = ?";
            default:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }
}
