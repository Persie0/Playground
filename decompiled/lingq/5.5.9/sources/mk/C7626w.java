package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.LessonAudioUploadWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C7626w implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41890a;

    public C7626w(C7633z0.a aVar) {
        this.f41890a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0 c7633z0 = this.f41890a.f42036a;
        LessonAudioUploadWorker lessonAudioUploadWorker = new LessonAudioUploadWorker(context, workerParameters);
        lessonAudioUploadWorker.f19254h = c7633z0.f41998n0.get();
        return lessonAudioUploadWorker;
    }
}
