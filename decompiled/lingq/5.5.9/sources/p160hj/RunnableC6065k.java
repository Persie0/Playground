package p160hj;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonProgressBar;
import dm.C5207g;

/* JADX INFO: renamed from: hj.k */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6065k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35777a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonProgressBar f35778b;

    public /* synthetic */ RunnableC6065k(LessonProgressBar lessonProgressBar, int i10) {
        this.f35777a = i10;
        this.f35778b = lessonProgressBar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f35777a;
        LessonProgressBar lessonProgressBar = this.f35778b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                LessonProgressBar.m10116b(lessonProgressBar);
                break;
            default:
                int i11 = LessonProgressBar.f27339n0;
                C5207g.m11111f(lessonProgressBar, "this$0");
                lessonProgressBar.m10119c(lessonProgressBar.f27349Q);
                break;
        }
    }
}
