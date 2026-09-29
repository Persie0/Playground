package p000;

import android.content.Context;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.work.WorkerParameters;
import com.lingq.core.data.chat.LynxPrivacySyncWorker;
import com.lingq.core.data.repository.C1286b;
import com.lingq.core.data.workers.BlacklistClearWorker;
import com.lingq.core.data.workers.BookChallengeLeaveWorker;
import com.lingq.core.data.workers.CardCreateWorker;
import com.lingq.core.data.workers.CardDeleteWorker;
import com.lingq.core.data.workers.CardReviewWorker;
import com.lingq.core.data.workers.CardUpdateWorker;
import com.lingq.core.data.workers.ChallengeLeaveWorker;
import com.lingq.core.data.workers.LessonReportWorker;
import com.lingq.core.data.workers.LessonSaveRemoveWorker;
import com.lingq.core.data.workers.LessonSimplifyWorker;
import com.lingq.core.data.workers.LessonUpdateBlacklistSourceWorker;
import com.lingq.core.data.workers.LessonUpdateStatsWorker;
import com.lingq.core.data.workers.MilestoneMetWorker;
import com.lingq.core.data.workers.NoticeHideWorker;
import com.lingq.core.data.workers.NotificationMarkAsReadWorker;
import com.lingq.core.data.workers.PlaylistAddCourseWorker;
import com.lingq.core.data.workers.PlaylistDeleteWorker;
import com.lingq.core.data.workers.PlaylistLessonActionWorker;
import com.lingq.core.data.workers.PlaylistUpdateWorker;
import com.lingq.core.data.workers.ProfileSettingsUpdateWorker;
import com.lingq.core.data.workers.ProfileUpdateWorker;
import com.lingq.core.data.workers.ShelfUpdatePinnedWorker;
import com.lingq.core.data.workers.WordUpdateIgnoreStatusWorker;
import com.lingq.core.data.workers.WordUpdateKnownStatusWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class iy1 implements z8b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jy1 f44756b;

    public /* synthetic */ iy1(jy1 jy1Var, int i) {
        this.f44755a = i;
        this.f44756b = jy1Var;
    }

    @Override // p000.z8b
    /* JADX INFO: renamed from: a */
    public final pg5 mo13550a(Context context, WorkerParameters workerParameters) {
        int i = this.f44755a;
        jy1 jy1Var = this.f44756b;
        switch (i) {
            case 0:
                return new LessonReportWorker(context, workerParameters, (m68) jy1Var.f46382a.f48749u0.get());
            case 1:
                ky1 ky1Var = jy1Var.f46382a;
                LessonSaveRemoveWorker lessonSaveRemoveWorker = new LessonSaveRemoveWorker(context, workerParameters);
                lessonSaveRemoveWorker.f16746g = (d65) ky1Var.f48648T0.get();
                return lessonSaveRemoveWorker;
            case 2:
                ky1 ky1Var2 = jy1Var.f46382a;
                BlacklistClearWorker blacklistClearWorker = new BlacklistClearWorker(context, workerParameters);
                blacklistClearWorker.f16596g = (C1286b) ky1Var2.f48662Y.get();
                return blacklistClearWorker;
            case 3:
                ky1 ky1Var3 = jy1Var.f46382a;
                LessonSimplifyWorker lessonSimplifyWorker = new LessonSimplifyWorker(context, workerParameters);
                lessonSimplifyWorker.f16750g = (d65) ky1Var3.f48648T0.get();
                return lessonSimplifyWorker;
            case 4:
                ky1 ky1Var4 = jy1Var.f46382a;
                LessonUpdateBlacklistSourceWorker lessonUpdateBlacklistSourceWorker = new LessonUpdateBlacklistSourceWorker(context, workerParameters);
                lessonUpdateBlacklistSourceWorker.f16754g = (C1286b) ky1Var4.f48662Y.get();
                return lessonUpdateBlacklistSourceWorker;
            case 5:
                ky1 ky1Var5 = jy1Var.f46382a;
                LessonUpdateStatsWorker lessonUpdateStatsWorker = new LessonUpdateStatsWorker(context, workerParameters);
                lessonUpdateStatsWorker.f16758g = (d65) ky1Var5.f48648T0.get();
                return lessonUpdateStatsWorker;
            case 6:
                return new LynxPrivacySyncWorker(context, workerParameters, (zw0) jy1Var.f46382a.f48706j1.get());
            case 7:
                return new MilestoneMetWorker(context, workerParameters, (xy5) jy1Var.f46382a.f48722n1.get());
            case 8:
                ky1 ky1Var6 = jy1Var.f46382a;
                return new NoticeHideWorker(context, workerParameters, (mm6) ky1Var6.f48738r1.get(), (df4) ky1Var6.f48680d.get());
            case 9:
                return new NotificationMarkAsReadWorker(context, workerParameters, (en6) jy1Var.f46382a.f48754v1.get());
            case 10:
                return new PlaylistAddCourseWorker(context, workerParameters, (xd7) jy1Var.f46382a.f48629N.get());
            case 11:
                return new PlaylistDeleteWorker(context, workerParameters, (xd7) jy1Var.f46382a.f48629N.get());
            case 12:
                return new PlaylistLessonActionWorker(context, workerParameters, (xd7) jy1Var.f46382a.f48629N.get());
            case 13:
                return new BookChallengeLeaveWorker(context, workerParameters, (or0) jy1Var.f46382a.f48677c0.get());
            case 14:
                return new PlaylistUpdateWorker(context, workerParameters, (xd7) jy1Var.f46382a.f48629N.get());
            case 15:
                ky1 ky1Var7 = jy1Var.f46382a;
                return new ProfileSettingsUpdateWorker(context, workerParameters, (km7) ky1Var7.f48744t.get(), yn1.m25210a(), (df4) ky1Var7.f48680d.get());
            case 16:
                return new ProfileUpdateWorker(context, workerParameters, (km7) jy1Var.f46382a.f48744t.get());
            case 17:
                return new ShelfUpdatePinnedWorker(context, workerParameters, (y95) jy1Var.f46382a.f48598D1.get());
            case 18:
                return new WordUpdateIgnoreStatusWorker(context, workerParameters, (s7b) jy1Var.f46382a.f48610G1.get());
            case 19:
                return new WordUpdateKnownStatusWorker(context, workerParameters, (s7b) jy1Var.f46382a.f48610G1.get());
            case 20:
                return new CardCreateWorker(context, workerParameters, (ao0) jy1Var.f46382a.f48709k0.get());
            case 21:
                return new CardDeleteWorker(context, workerParameters, (ao0) jy1Var.f46382a.f48709k0.get());
            case 22:
                return new CardReviewWorker(context, workerParameters, (ao0) jy1Var.f46382a.f48709k0.get());
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new CardUpdateWorker(context, workerParameters, (ao0) jy1Var.f46382a.f48709k0.get());
            default:
                return new ChallengeLeaveWorker(context, workerParameters, (or0) jy1Var.f46382a.f48677c0.get());
        }
    }
}
