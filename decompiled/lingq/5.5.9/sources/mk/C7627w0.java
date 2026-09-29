package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.ChallengeLeaveWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.w0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7627w0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41891a;

    public C7627w0(C7633z0.a aVar) {
        this.f41891a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new ChallengeLeaveWorker(context, workerParameters, this.f41891a.f42036a.f41926K.get());
    }
}
