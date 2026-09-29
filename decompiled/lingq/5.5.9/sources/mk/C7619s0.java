package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.WordUpdateKnownStatusWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.s0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7619s0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41883a;

    public C7619s0(C7633z0.a aVar) {
        this.f41883a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new WordUpdateKnownStatusWorker(context, workerParameters, this.f41883a.f42036a.f41945T0.get());
    }
}
