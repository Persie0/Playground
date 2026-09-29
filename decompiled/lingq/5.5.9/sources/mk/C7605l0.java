package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.PlaylistAddCourseWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.l0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7605l0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41869a;

    public C7605l0(C7633z0.a aVar) {
        this.f41869a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new PlaylistAddCourseWorker(context, workerParameters, this.f41869a.f42036a.f42018u.get());
    }
}
