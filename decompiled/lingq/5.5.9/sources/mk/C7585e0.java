package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.LessonPlaylistOrderWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.e0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7585e0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41854a;

    public C7585e0(C7633z0.a aVar) {
        this.f41854a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new LessonPlaylistOrderWorker(context, workerParameters, this.f41854a.f42036a.f42018u.get());
    }
}
