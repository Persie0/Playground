package com.linguist;

import com.google.common.collect.C1097m;
import com.google.common.collect.ImmutableMap;
import com.lingq.AbstractApplicationC1226a;
import p000.C3159jt;
import p000.hm5;
import p000.kd5;
import p000.ky1;
import p000.nk3;
import p000.or3;
import p000.ot3;
import p000.si7;
import p000.sm5;

/* JADX INFO: loaded from: classes.dex */
public final class LingQApplication extends AbstractApplicationC1226a implements nk3 {

    /* JADX INFO: renamed from: f */
    public boolean f34228f = false;

    /* JADX INFO: renamed from: g */
    public final C3159jt f34229g = new C3159jt(new or3(this));

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        return this.f34229g.mo6995b();
    }

    @Override // com.lingq.AbstractApplicationC1226a, android.app.Application
    public final void onCreate() {
        if (!this.f34228f) {
            this.f34228f = true;
            ky1 ky1Var = (ky1) ((kd5) this.f34229g.mo6995b());
            ky1Var.getClass();
            C1097m c1097mM6296b = ImmutableMap.m6296b(55);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.AddPlaylistWorker", ky1Var.f48653V);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.AppUsageUpdateWorker", ky1Var.f48656W);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.BlacklistClearWorker", ky1Var.f48665Z);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.BookChallengeLeaveWorker", ky1Var.f48681d0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.CardCreateWorker", ky1Var.f48713l0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.CardDeleteWorker", ky1Var.f48717m0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.CardReviewWorker", ky1Var.f48721n0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.CardUpdateWorker", ky1Var.f48725o0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.ChallengeLeaveWorker", ky1Var.f48729p0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.ChallengeSignupWorker", ky1Var.f48733q0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.CourseDeleteRoseWorker", ky1Var.f48737r0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.CourseGiveRoseWorker", ky1Var.f48741s0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.CourseReportWorker", ky1Var.f48753v0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.CourseSubscribeWorker", ky1Var.f48757w0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.CourseUnsubscribeWorker", ky1Var.f48761x0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.CourseUpdateBlacklistWorker", ky1Var.f48765y0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.DictionaryAddWorker", ky1Var.f48597D0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.DictionaryDeleteWorker", ky1Var.f48601E0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.DictionaryOrderWorker", ky1Var.f48605F0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.HintUpdateWorker", ky1Var.f48615I0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LanguageEmailNotificationUpdateWorker", ky1Var.f48618J0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LanguageFeedLevelUpdateWorker", ky1Var.f48621K0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LanguageIntensityUpdateWorker", ky1Var.f48624L0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LanguageProgressUpdateWorker", ky1Var.f48627M0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LanguageRepetitionLingqsUpdateWorker", ky1Var.f48630N0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LanguageSiteNotificationUpdateWorker", ky1Var.f48633O0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LanguageTopicsUpdateWorker", ky1Var.f48636P0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LanguageUpdateWorker", ky1Var.f48639Q0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonAddFavoriteWorker", ky1Var.f48642R0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonAudioUploadWorker", ky1Var.f48651U0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonBookmarkWorker", ky1Var.f48654V0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonCompleteWorker", ky1Var.f48657W0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonDeleteFavoriteWorker", ky1Var.f48660X0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonDeleteRoseWorker", ky1Var.f48663Y0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonEditSentenceWorker", ky1Var.f48666Z0);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonGiveRoseWorker", ky1Var.f48670a1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonPlaylistOrderWorker", ky1Var.f48674b1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonReportWorker", ky1Var.f48678c1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonSaveRemoveWorker", ky1Var.f48682d1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonSimplifyWorker", ky1Var.f48686e1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonUpdateBlacklistSourceWorker", ky1Var.f48690f1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.LessonUpdateStatsWorker", ky1Var.f48694g1);
            c1097mM6296b.m6340b("com.lingq.core.data.chat.LynxPrivacySyncWorker", ky1Var.f48710k1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.MilestoneMetWorker", ky1Var.f48726o1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.NoticeHideWorker", ky1Var.f48742s1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.NotificationMarkAsReadWorker", ky1Var.f48758w1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.PlaylistAddCourseWorker", ky1Var.f48762x1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.PlaylistDeleteWorker", ky1Var.f48766y1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.PlaylistLessonActionWorker", ky1Var.f48770z1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.PlaylistUpdateWorker", ky1Var.f48586A1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.ProfileSettingsUpdateWorker", ky1Var.f48590B1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.ProfileUpdateWorker", ky1Var.f48594C1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.ShelfUpdatePinnedWorker", ky1Var.f48602E1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.WordUpdateIgnoreStatusWorker", ky1Var.f48613H1);
            c1097mM6296b.m6340b("com.lingq.core.data.workers.WordUpdateKnownStatusWorker", ky1Var.f48616I1);
            this.f14160a = new ot3(c1097mM6296b.m6339a(true));
            this.f14161b = (hm5) ky1Var.f48736r.get();
            this.f14162c = (sm5) ky1Var.f48619J1.get();
            this.f14163d = (si7) ky1Var.f48692g.get();
        }
        super.onCreate();
    }
}
