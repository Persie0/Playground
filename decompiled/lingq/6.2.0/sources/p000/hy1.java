package p000;

import android.content.Context;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1286b;
import com.lingq.core.data.workers.AddPlaylistWorker;
import com.lingq.core.data.workers.AppUsageUpdateWorker;
import com.lingq.core.data.workers.ChallengeSignupWorker;
import com.lingq.core.data.workers.CourseDeleteRoseWorker;
import com.lingq.core.data.workers.CourseGiveRoseWorker;
import com.lingq.core.data.workers.CourseReportWorker;
import com.lingq.core.data.workers.CourseSubscribeWorker;
import com.lingq.core.data.workers.CourseUnsubscribeWorker;
import com.lingq.core.data.workers.CourseUpdateBlacklistWorker;
import com.lingq.core.data.workers.DictionaryAddWorker;
import com.lingq.core.data.workers.DictionaryDeleteWorker;
import com.lingq.core.data.workers.DictionaryOrderWorker;
import com.lingq.core.data.workers.HintUpdateWorker;
import com.lingq.core.data.workers.LanguageEmailNotificationUpdateWorker;
import com.lingq.core.data.workers.LanguageFeedLevelUpdateWorker;
import com.lingq.core.data.workers.LanguageIntensityUpdateWorker;
import com.lingq.core.data.workers.LanguageProgressUpdateWorker;
import com.lingq.core.data.workers.LanguageRepetitionLingqsUpdateWorker;
import com.lingq.core.data.workers.LanguageSiteNotificationUpdateWorker;
import com.lingq.core.data.workers.LanguageTopicsUpdateWorker;
import com.lingq.core.data.workers.LanguageUpdateWorker;
import com.lingq.core.data.workers.LessonAddFavoriteWorker;
import com.lingq.core.data.workers.LessonAudioUploadWorker;
import com.lingq.core.data.workers.LessonBookmarkWorker;
import com.lingq.core.data.workers.LessonCompleteWorker;
import com.lingq.core.data.workers.LessonDeleteFavoriteWorker;
import com.lingq.core.data.workers.LessonDeleteRoseWorker;
import com.lingq.core.data.workers.LessonEditSentenceWorker;
import com.lingq.core.data.workers.LessonGiveRoseWorker;
import com.lingq.core.data.workers.LessonPlaylistOrderWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class hy1 implements z8b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43142a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jy1 f43143b;

    public /* synthetic */ hy1(jy1 jy1Var, int i) {
        this.f43142a = i;
        this.f43143b = jy1Var;
    }

    @Override // p000.z8b
    /* JADX INFO: renamed from: a */
    public final pg5 mo13550a(Context context, WorkerParameters workerParameters) {
        int i = this.f43142a;
        jy1 jy1Var = this.f43143b;
        switch (i) {
            case 0:
                return new ChallengeSignupWorker(context, workerParameters, (or0) jy1Var.f46382a.f48677c0.get());
            case 1:
                return new CourseDeleteRoseWorker(context, workerParameters, (xo1) jy1Var.f46382a.f48641R.get());
            case 2:
                return new CourseGiveRoseWorker(context, workerParameters, (xo1) jy1Var.f46382a.f48641R.get());
            case 3:
                return new CourseReportWorker(context, workerParameters, (m68) jy1Var.f46382a.f48749u0.get());
            case 4:
                return new CourseSubscribeWorker(context, workerParameters, (xo1) jy1Var.f46382a.f48641R.get());
            case 5:
                return new CourseUnsubscribeWorker(context, workerParameters, (xo1) jy1Var.f46382a.f48641R.get());
            case 6:
                ky1 ky1Var = jy1Var.f46382a;
                CourseUpdateBlacklistWorker courseUpdateBlacklistWorker = new CourseUpdateBlacklistWorker(context, workerParameters);
                courseUpdateBlacklistWorker.f16648g = (C1286b) ky1Var.f48662Y.get();
                return courseUpdateBlacklistWorker;
            case 7:
                return new DictionaryAddWorker(context, workerParameters, (xf2) jy1Var.f46382a.f48593C0.get());
            case 8:
                return new DictionaryDeleteWorker(context, workerParameters, (xf2) jy1Var.f46382a.f48593C0.get());
            case 9:
                ky1 ky1Var2 = jy1Var.f46382a;
                return new DictionaryOrderWorker(context, workerParameters, (xf2) ky1Var2.f48593C0.get(), (df4) ky1Var2.f48680d.get());
            case 10:
                return new AddPlaylistWorker(context, workerParameters, (xd7) jy1Var.f46382a.f48629N.get());
            case 11:
                ky1 ky1Var3 = jy1Var.f46382a;
                return new HintUpdateWorker(context, workerParameters, (w3a) ky1Var3.f48612H0.get(), yn1.m25210a(), (df4) ky1Var3.f48680d.get());
            case 12:
                return new LanguageEmailNotificationUpdateWorker(context, workerParameters, (lm4) jy1Var.f46382a.f48752v.get());
            case 13:
                return new LanguageFeedLevelUpdateWorker(context, workerParameters, (lm4) jy1Var.f46382a.f48752v.get());
            case 14:
                return new LanguageIntensityUpdateWorker(context, workerParameters, (lm4) jy1Var.f46382a.f48752v.get());
            case 15:
                return new LanguageProgressUpdateWorker(context, workerParameters, (oo4) jy1Var.f46382a.f48650U.get());
            case 16:
                return new LanguageRepetitionLingqsUpdateWorker(context, workerParameters, (lm4) jy1Var.f46382a.f48752v.get());
            case 17:
                return new LanguageSiteNotificationUpdateWorker(context, workerParameters, (lm4) jy1Var.f46382a.f48752v.get());
            case 18:
                return new LanguageTopicsUpdateWorker(context, workerParameters, (lm4) jy1Var.f46382a.f48752v.get());
            case 19:
                return new LanguageUpdateWorker(context, workerParameters, (km7) jy1Var.f46382a.f48744t.get());
            case 20:
                return new LessonAddFavoriteWorker(context, workerParameters, (xd7) jy1Var.f46382a.f48629N.get());
            case 21:
                return new AppUsageUpdateWorker(context, workerParameters, (oo4) jy1Var.f46382a.f48650U.get());
            case 22:
                ky1 ky1Var4 = jy1Var.f46382a;
                LessonAudioUploadWorker lessonAudioUploadWorker = new LessonAudioUploadWorker(context, workerParameters);
                lessonAudioUploadWorker.f16710g = (d65) ky1Var4.f48648T0.get();
                return lessonAudioUploadWorker;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new LessonBookmarkWorker(context, workerParameters, (d65) jy1Var.f46382a.f48648T0.get());
            case 24:
                ky1 ky1Var5 = jy1Var.f46382a;
                LessonCompleteWorker lessonCompleteWorker = new LessonCompleteWorker(context, workerParameters);
                lessonCompleteWorker.f16718g = (d65) ky1Var5.f48648T0.get();
                return lessonCompleteWorker;
            case 25:
                return new LessonDeleteFavoriteWorker(context, workerParameters, (xd7) jy1Var.f46382a.f48629N.get());
            case 26:
                ky1 ky1Var6 = jy1Var.f46382a;
                LessonDeleteRoseWorker lessonDeleteRoseWorker = new LessonDeleteRoseWorker(context, workerParameters);
                lessonDeleteRoseWorker.f16726g = (d65) ky1Var6.f48648T0.get();
                return lessonDeleteRoseWorker;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ky1 ky1Var7 = jy1Var.f46382a;
                LessonEditSentenceWorker lessonEditSentenceWorker = new LessonEditSentenceWorker(context, workerParameters);
                lessonEditSentenceWorker.f16730g = (d65) ky1Var7.f48648T0.get();
                return lessonEditSentenceWorker;
            case 28:
                ky1 ky1Var8 = jy1Var.f46382a;
                LessonGiveRoseWorker lessonGiveRoseWorker = new LessonGiveRoseWorker(context, workerParameters);
                lessonGiveRoseWorker.f16734g = (d65) ky1Var8.f48648T0.get();
                return lessonGiveRoseWorker;
            default:
                return new LessonPlaylistOrderWorker(context, workerParameters, (xd7) jy1Var.f46382a.f48629N.get());
        }
    }
}
