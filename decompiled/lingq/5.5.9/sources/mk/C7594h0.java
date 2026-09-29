package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.LessonUpdateStatsWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7594h0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41861a;

    public C7594h0(C7633z0.a aVar) {
        this.f41861a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0 c7633z0 = this.f41861a.f42036a;
        LessonUpdateStatsWorker lessonUpdateStatsWorker = new LessonUpdateStatsWorker(context, workerParameters);
        lessonUpdateStatsWorker.f19294h = c7633z0.f41998n0.get();
        return lessonUpdateStatsWorker;
    }
}
