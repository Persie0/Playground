package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.PlaylistLessonActionWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.n0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7609n0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41873a;

    public C7609n0(C7633z0.a aVar) {
        this.f41873a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0.a aVar = this.f41873a;
        return new PlaylistLessonActionWorker(context, workerParameters, aVar.f42036a.f42018u.get(), aVar.f42036a.f41982i.get());
    }
}
