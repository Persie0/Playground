package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.WordUpdateIgnoreStatusWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.r0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7617r0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41881a;

    public C7617r0(C7633z0.a aVar) {
        this.f41881a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new WordUpdateIgnoreStatusWorker(context, workerParameters, this.f41881a.f42036a.f41945T0.get());
    }
}
