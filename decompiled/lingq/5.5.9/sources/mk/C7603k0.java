package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.NotificationMarkAsReadWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.k0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7603k0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41867a;

    public C7603k0(C7633z0.a aVar) {
        this.f41867a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0.a aVar = this.f41867a;
        return new NotificationMarkAsReadWorker(context, workerParameters, aVar.f42036a.f41925J0.get(), aVar.f42036a.f41982i.get());
    }
}
