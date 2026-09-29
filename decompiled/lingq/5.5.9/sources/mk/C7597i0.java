package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.MilestoneMetWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.i0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7597i0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41863a;

    public C7597i0(C7633z0.a aVar) {
        this.f41863a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new MilestoneMetWorker(context, workerParameters, this.f41863a.f42036a.f41901B0.get());
    }
}
