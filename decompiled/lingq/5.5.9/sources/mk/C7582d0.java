package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.AppUsageUpdateWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7582d0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41851a;

    public C7582d0(C7633z0.a aVar) {
        this.f41851a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new AppUsageUpdateWorker(context, workerParameters, this.f41851a.f42036a.f42030y.get());
    }
}
