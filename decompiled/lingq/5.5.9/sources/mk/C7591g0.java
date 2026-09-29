package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.LessonSaveRemoveWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.g0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7591g0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41859a;

    public C7591g0(C7633z0.a aVar) {
        this.f41859a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0 c7633z0 = this.f41859a.f42036a;
        LessonSaveRemoveWorker lessonSaveRemoveWorker = new LessonSaveRemoveWorker(context, workerParameters);
        lessonSaveRemoveWorker.f19290h = c7633z0.f41998n0.get();
        return lessonSaveRemoveWorker;
    }
}
