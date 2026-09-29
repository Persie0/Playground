package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.PlaylistUpdateWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.p0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7613p0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41877a;

    public C7613p0(C7633z0.a aVar) {
        this.f41877a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0.a aVar = this.f41877a;
        return new PlaylistUpdateWorker(context, workerParameters, aVar.f42036a.f42018u.get(), aVar.f42036a.f41982i.get());
    }
}
