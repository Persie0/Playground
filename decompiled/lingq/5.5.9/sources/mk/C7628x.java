package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.LessonBookmarkWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C7628x implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41892a;

    public C7628x(C7633z0.a aVar) {
        this.f41892a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0 c7633z0 = this.f41892a.f42036a;
        LessonBookmarkWorker lessonBookmarkWorker = new LessonBookmarkWorker(context, workerParameters);
        lessonBookmarkWorker.f19258h = c7633z0.f41998n0.get();
        return lessonBookmarkWorker;
    }
}
